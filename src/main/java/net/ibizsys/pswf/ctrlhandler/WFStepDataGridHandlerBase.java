package net.ibizsys.pswf.ctrlhandler;

import java.util.ArrayList;

import net.ibizsys.paas.core.DEDataSetCond;
import net.ibizsys.paas.core.DEDataSetFetchContext;
import net.ibizsys.paas.core.IDEDataSetCond;
import net.ibizsys.paas.core.IDEWF;
import net.ibizsys.paas.ctrlhandler.GridHandlerBase;
import net.ibizsys.paas.data.DataObject;
import net.ibizsys.paas.demodel.DEModelGlobal;
import net.ibizsys.paas.demodel.IDataEntityModel;
import net.ibizsys.paas.entity.IEntity;
import net.ibizsys.paas.util.StringBuilderEx;
import net.ibizsys.paas.util.StringHelper;
import net.ibizsys.paas.web.WebContext;

/**
 * 流程操作数据表格后台处理对象
 * 
 * @author Administrator
 *
 */
public abstract class WFStepDataGridHandlerBase extends GridHandlerBase {

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.ctrlhandler.MDCtrlHandlerBase#onFillDEDataSetFetchContext(net.ibizsys.paas.core.DEDataSetFetchContext)
	 */
	@Override
	protected void onFillDEDataSetFetchContext(DEDataSetFetchContext deDataSetFetchContextImpl) throws Exception {
		super.onFillDEDataSetFetchContext(deDataSetFetchContextImpl);

		String strParentDEId = WebContext.getParentDEId(this.getWebContext());
		if (StringHelper.isNullOrEmpty(strParentDEId)) {
			throw new Exception("没有指定父实体标示");
		}

		IDataEntityModel iDataEntityModel = DEModelGlobal.getDEModel(strParentDEId);
		IDEWF iDEWF = iDataEntityModel.getDefaultDEWF();
		if (iDEWF == null) {
			throw new Exception(StringHelper.format("实体[%1$s]不支持工作流", iDataEntityModel.getName()));
		}

		String strParentKey = WebContext.getParentKey(this.getWebContext());
		if (StringHelper.isNullOrEmpty(strParentKey)) {
			deDataSetFetchContextImpl.setCancel(true);
			return;
		}

		deDataSetFetchContextImpl.setPageSize(9999);
		deDataSetFetchContextImpl.setSort("createdate");
		deDataSetFetchContextImpl.setSortDir("asc");

		IEntity activeUserData = iDataEntityModel.createEntity();
		activeUserData.set(iDataEntityModel.getKeyDEField().getName(), strParentKey);
		iDataEntityModel.getService(this.getSessionFactory()).get(activeUserData);

		StringBuilderEx script = new StringBuilderEx();

		String strWFInstFieldExp = iDEWF.getWFInstField();
		if (!StringHelper.isNullOrEmpty(strWFInstFieldExp)) {
			script.append(" INNER JOIN T_SRFWFINSTANCE wf1 ON ${srfdefieldexp('%1$s')} = wf1.WFINSTANCEID ", strWFInstFieldExp);
			deDataSetFetchContextImpl.setJoinScript(script.toString());
			String strActiveWFInstId = DataObject.getStringValue(activeUserData, iDEWF.getWFInstField(), null);
			String strCondition = "";
			if (!StringHelper.isNullOrEmpty(strActiveWFInstId)) {
				strCondition = StringHelper.format("(wf1.USERDATA='%1$s' AND wf1.USERDATA4='%2$s' AND wf1.WFINSTANCEID= '%3$s') OR (wf1.USERDATA2='%1$s' AND wf1.PWFINSTANCEID= '%3$s') ", strParentKey, strParentDEId, strActiveWFInstId);
			} else {
				strCondition = StringHelper.format("(wf1.USERDATA='%1$s' AND wf1.USERDATA4='%2$s') OR (wf1.USERDATA2='%1$s' AND wf1.USERDATA3='%2$s') ", strParentKey, strParentDEId);
			}

			ArrayList<IDEDataSetCond> userConditionList = deDataSetFetchContextImpl.getConditionList();
			DEDataSetCond deDataSetCondImpl = new DEDataSetCond();
			deDataSetCondImpl.setCondType(IDEDataSetCond.CONDTYPE_CUSTOM);
			deDataSetCondImpl.setCustomCond(strCondition);
			userConditionList.add(deDataSetCondImpl);
		}

	}

}
