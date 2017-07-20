package net.ibizsys.paas.controller;

import java.util.HashMap;

import net.ibizsys.paas.appmodel.IAppViewModel;
import net.ibizsys.paas.core.Errors;
import net.ibizsys.paas.core.IDERIndex;
import net.ibizsys.paas.data.DataObject;
import net.ibizsys.paas.demodel.DEModelGlobal;
import net.ibizsys.paas.demodel.IDEWFModel;
import net.ibizsys.paas.demodel.IDataEntityModel;
import net.ibizsys.paas.entity.IEntity;
import net.ibizsys.paas.util.StringHelper;
import net.ibizsys.paas.web.AjaxActionResult;
import net.sf.json.JSONObject;

/**
 * 重定向视图控制类
 * 
 * @author Administrator
 * 
 */
public abstract class RedirectViewControllerBase extends ViewControllerBase implements IRedirectViewController {
	/**
	 * 获取视图
	 */
	public final static String VIEWACTION_GETRDVIEW = "GETRDVIEW";

	private boolean bEnableWorkflow = false;

	private HashMap<String, String> rdViewMap = new HashMap<String, String>();

	public RedirectViewControllerBase() throws Exception {
		super();
	}

	/**
	 * 注册用户自定义重定向视图
	 * 
	 * @param strRDMode 重定向模式
	 * @param strAppViewId 应用视图标识
	 */
	protected void registerRDView(String strRDMode, String strAppViewId) {
		rdViewMap.put(strRDMode, strAppViewId);
	}

	/**
	 * 获取用户自定义重定向视图编号
	 * 
	 * @param strRDMode 重定向模式
	 * @return
	 */
	protected String getRDViewId(String strRDMode) {
		return rdViewMap.get(strRDMode);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.controller.ViewControllerBase#onViewAjaxAction(java. lang.String)
	 */
	@Override
	protected AjaxActionResult onViewAjaxAction(String strAction) throws Exception {
		if (StringHelper.compare(strAction, VIEWACTION_GETRDVIEW, true) == 0) {
			return onGetRDView();
		}
		return super.onViewAjaxAction(strAction);
	}

	/**
	 * 获取应用视图
	 * 
	 * @return
	 * @throws Exception
	 */
	protected AjaxActionResult onGetRDView() throws Exception {
		AjaxActionResult ajaxActionResult = new AjaxActionResult();

		// 获取数据
		String strKeyValue = this.getWebContext().getViewParamValue("srfkey");
		if (StringHelper.isNullOrEmpty(strKeyValue)) {
			strKeyValue = this.getWebContext().getViewParamValue("srfkeys");
		}

		if (StringHelper.isNullOrEmpty(strKeyValue)) {
			throw new Exception(StringHelper.format("没有指定视图数据主键"));
		}

		IAppViewModel iAppViewModel = this.getRDAppViewModel(strKeyValue);
		if (iAppViewModel != null) {
			JSONObject rdview = this.getAppModel().getAppPFHelper().getAppViewJSONObject(iAppViewModel);
			ajaxActionResult.setExtAttr("rdview", rdview);
			return ajaxActionResult;
		} else {
			ajaxActionResult.setRetCode(Errors.INPUTERROR);
			ajaxActionResult.setErrorInfo("无法找到对应的跳转视图");
			return ajaxActionResult;
		}

	}

	/**
	 * 获取指定数据的重定向页面模型
	 * 
	 * @param strKeyValue 数据主键
	 * @return
	 * @throws Exception
	 */
	public IAppViewModel getRDAppViewModel(String strKeyValue) throws Exception {
		// 进行数据查询
		IEntity iEntity = getActiveEntity(strKeyValue);
		// 判断当前数据模式
		IDataEntityModel iRealDEModel = this.getRealDEModel(iEntity);
		if (iRealDEModel != this.getDEModel()) {
			// 实体不一致
			iEntity = getActiveEntity(iRealDEModel, strKeyValue);
		}
		boolean bDataInWF = false;
		boolean bWFMode = false;
		// 计算数据模式
		if (this.isEnableWorkflow()) {
			IDEWFModel iDEWF = iRealDEModel.testDataInWF(iEntity);
			if (iDEWF != null) {
				bDataInWF = true;
				bWFMode = iDEWF.testUserWFSubmit(iEntity, this.getWebContext().getCurUserId(), this.getSessionFactory());
			}
		}

		String strPDTViewParam = iRealDEModel.getSDDEViewPDTParam(iEntity, bDataInWF, bWFMode);
		String strRDMode = strPDTViewParam;
		if (iRealDEModel != this.getDEModel()) {
			strRDMode = iRealDEModel.getName() + ":" + strPDTViewParam;
		}

		IAppViewModel iAppViewModel = null;
		String strRDViewId = this.getRDViewId(strRDMode);
		if (StringHelper.isNullOrEmpty(strRDViewId)) {
			String strDEViewId = iRealDEModel.getDEViewIdByPDT(strPDTViewParam, false);
			iAppViewModel = this.getAppModel().getAppViewByDEViewId(strDEViewId, false);
		} else {
			iAppViewModel = this.getAppModel().getAppView(strRDViewId, false);
		}
		return iAppViewModel;
	}

	/**
	 * 获取实际的数据模型
	 * 
	 * @param iEntity 实体
	 * @return
	 * @throws Exception
	 */
	protected IDataEntityModel getRealDEModel(IEntity iEntity) throws Exception {
		IDataEntityModel curDEModel = this.getDEModel();
		if (StringHelper.isNullOrEmpty(curDEModel.getIndexDEType())) return curDEModel;

		Object objKeyValue = iEntity.get(this.getDEModel().getKeyDEField().getName());
		while (true) {
			// 判断类型
			String strIndexType = DataObject.getStringValue(iEntity, curDEModel.getIndexTypeDEField().getName(), null);
			if (StringHelper.isNullOrEmpty(strIndexType)) {
				throw new Exception(StringHelper.format("当前数据未提供索引类型值"));
			}

			IDERIndex iDERIndex = curDEModel.getDERIndex(true, strIndexType);
			curDEModel = DEModelGlobal.getDEModel(iDERIndex.getMinorDEId());

			if (StringHelper.isNullOrEmpty(curDEModel.getIndexDEType())) return curDEModel;

			iEntity = getActiveEntity(curDEModel, objKeyValue);
		}
	}

	/**
	 * 获取当前数据对象
	 * 
	 * @param strKeyValue 数据主键
	 * @return
	 * @throws Exception
	 */
	protected IEntity getActiveEntity(Object strKeyValue) throws Exception {
		IEntity iEntity = this.getService().getDEModel().createEntity();
		iEntity.set(this.getDEModel().getKeyDEField().getName(), strKeyValue);
		this.getService().get(iEntity);
		return iEntity;
	}

	/**
	 * 获取当前数据对象
	 * 
	 * @param iRealDEModel 实际实体模型对象
	 * @param strKeyValue 数据主键
	 * @return
	 * @throws Exception
	 */
	protected IEntity getActiveEntity(IDataEntityModel iRealDEModel, Object strKeyValue) throws Exception {
		IEntity iEntity = iRealDEModel.createEntity();
		iEntity.set(iRealDEModel.getKeyDEField().getName(), strKeyValue);
		iRealDEModel.getService(this.getSessionFactory()).get(iEntity);
		return iEntity;
	}

	/**
	 * 获取是否支持工作流
	 * 
	 * @return
	 */
	protected boolean isEnableWorkflow() {
		return bEnableWorkflow;
	}

	/**
	 * 设置是否支持工作流
	 * 
	 * @param bEnableWorkflow
	 */
	protected void setEnableWorkflow(boolean bEnableWorkflow) {
		this.bEnableWorkflow = bEnableWorkflow;
	}

}
