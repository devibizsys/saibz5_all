package net.ibizsys.paas.security;

import java.util.ArrayList;

import net.ibizsys.paas.core.ActionContext;
import net.ibizsys.paas.core.CallResult;
import net.ibizsys.paas.core.DEDataSetCond;
import net.ibizsys.paas.core.DEDataSetFetchContext;
import net.ibizsys.paas.core.Errors;
import net.ibizsys.paas.core.IActionContext;
import net.ibizsys.paas.core.IDEDataSetCond;
import net.ibizsys.paas.core.IDEField;
import net.ibizsys.paas.core.IDER1N;
import net.ibizsys.paas.data.DataObject;
import net.ibizsys.paas.data.IDEFieldDiffItem;
import net.ibizsys.paas.db.DBFetchResult;
import net.ibizsys.paas.demodel.IDER1NModel;
import net.ibizsys.paas.demodel.IDataEntityModel;
import net.ibizsys.paas.entity.IEntity;
import net.ibizsys.paas.exception.ErrorException;
import net.ibizsys.paas.logic.ICondition;
import net.ibizsys.paas.service.IService;
import net.ibizsys.paas.service.ServiceGlobal;
import net.ibizsys.paas.service.SessionFactoryManager;
import net.ibizsys.paas.util.DEModelUtil;
import net.ibizsys.paas.util.KeyValueHelper;
import net.ibizsys.paas.util.StringBuilderEx;
import net.ibizsys.paas.util.StringHelper;
import net.ibizsys.paas.web.IWebContext;
import net.ibizsys.paas.web.WebContext;
import net.ibizsys.psrt.srv.common.entity.DataAudit;
import net.ibizsys.psrt.srv.common.entity.DataAuditDetail;
import net.ibizsys.psrt.srv.common.entity.UserRoleData;
import net.ibizsys.psrt.srv.common.service.DataAuditDetailService;
import net.ibizsys.psrt.srv.common.service.DataAuditService;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * 数据访问权限检查对象
 * 
 * @author Administrator
 * 
 */
public class DEDataAccMgr implements IDEDataAccMgr {
	private static final Log log = LogFactory.getLog(DEDataAccMgr.class);

	//
	// protected HashMap<String,DEDataAction> dataActionMap = null;
	//
	// protected HashMap<String,Vector<DEDSCtrl>> dsCtrlMap = null;

	private IDataEntityModel iDEModel = null;

	/**
	 * 数据操作集合
	 */
	protected String strDataActions = "";

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.security.IDEDataAccMgr#init(net.ibizsys.paas.demodel.IDataEntityModel)
	 */
	@Override
	public void init(IDataEntityModel iDEModel) throws Exception {
		this.iDEModel = iDEModel;

		// iService = this.iDEModel.getService();

		// this.contextHelperEx = contextHelperEx;
		//
		// //获取状态控制代码
		// Vector<DEDSCtrl> dsCtrls = new Vector<DEDSCtrl>();
		// CallResult callResult =
		// contextHelperEx.getDAModelHelper().GetDEDSCtrls(this.iDEModel.getId(),
		// dsCtrls);
		// if(callResult.getRetCode()!=Errors.OK)
		// {
		// log.error(StringHelper.format("获取实体[%1$s]数据状态控制失败，%2$s",this.iDEModel.getId(),callResult.getErrorInfo()));
		// return;
		// }
		//
		// if(dsCtrls.size()>0)
		// {
		// dsCtrlMap = new HashMap<String,Vector<DEDSCtrl>>();
		// }
		//
		// for(DEDSCtrl dsCtrl:dsCtrls)
		// {
		// String strDenyActions = dsCtrl.getDENYACTIONS();
		// if(StringHelper.isNullOrEmpty(strDenyActions))
		// continue;
		//
		// if(StringHelper.isNullOrEmpty(dsCtrl.getDEFVALUE()))
		// continue;
		//
		// IDEFHelper iDEFHelper = iDEModel.GetDEFHelper(dsCtrl.getDEFID());
		// if(iDEFHelper == null)
		// {
		// log.error(StringHelper.format("无法获取实体属性[%1$s]辅助对象",dsCtrl.getDEFID()));
		// continue;
		// }
		//
		// dsCtrl.setDEFHelper(iDEFHelper);
		// dsCtrl.InitCtrlFields();
		//
		// String []actions = strDenyActions.split("[|]");
		// for(int i =0;i<actions.length;i++)
		// {
		// String strAction = actions[i];
		// strAction = strAction.trim();
		// if(StringHelper.isNullOrEmpty(strAction))
		// continue;
		// strAction = strAction.toUpperCase();
		// Vector<DEDSCtrl> values = null;
		// if(!dsCtrlMap.containsKey(strAction))
		// {
		// values = new Vector<DEDSCtrl>();
		// dsCtrlMap.put(strAction, values);
		// }
		// else
		// {
		// values = dsCtrlMap.get(strAction);
		// }
		// values.add(dsCtrl);
		// }
		// }
		//
		// //获取数据的操作能力标识
		// HashMap<String,DEDataAction> dataActionMap =
		// GetDataActionMap(contextHelperEx);
		// if(dataActionMap == null)
		// {
		// log.error(callResult.getErrorInfo());
		// return;
		// }
		//
		// for(String strKey : dataActionMap.keySet())
		// {
		// if(!StringHelper.isNullOrEmpty(strDataActions))
		// strDataActions+="|";
		// strDataActions += strKey;
		// }

		onInit();
	}

	/**
	 * 初始化
	 */
	protected void onInit() throws Exception {

	}

	/**
	 * 获取实体模型对象
	 * 
	 * @return
	 */
	protected IDataEntityModel getDEModel() {
		return this.iDEModel;
	}

	// public Call

	// /**
	// * 查找数据的字段控制
	// * @param dataEntity
	// * @return
	// */
	// public DEDSCtrl FindFieldCtrl( IEntity dataEntity)
	// {
	// if(dsCtrlMap == null)return null;
	//
	// Vector<DEDSCtrl> dedsCtrls = dsCtrlMap.get("NONE");
	// if(dedsCtrls == null)return null;
	//
	// for(DEDSCtrl dsctrl:dedsCtrls)
	// {
	// if(dataEntity.ContainesParam(dsctrl.getDEFHelper().getName()))
	// {
	// String strValue =
	// dataEntity.GetParamStringValue(dsctrl.getDEFHelper().getName(),"");
	// if(StringHelper.compare(strValue, dsctrl.getDEFVALUE(), true) == 0)
	// {
	// return dsctrl;
	// }
	// }
	// }
	// return null;
	// }

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.security.IDEDataAccMgr#test(net.ibizsys.paas.web.IWebContext, net.ibizsys.paas.entity.IEntity, java.lang.String)
	 */
	@Override
	public CallResult test(IWebContext webContext, IEntity dataEntity, String strAction) throws Exception {
		return test(webContext, dataEntity, strAction, false);
	}

	// /**
	// * 判断访问释放允许
	// * @param webContext 网络请求上下文对象
	// * @param strCurPersonId 当前用户标识
	// * @param dataEntity 访问数据对象
	// * @param strAction 访问行为
	// * @return
	// * @throws Exception
	// */
	// protected CallResult internalTest(IWebContext webContext, String strCurPersonId, IEntity dataEntity, String strAction) throws Exception
	// {
	// return internalTest( webContext, strCurPersonId, dataEntity, strAction,false);
	// }

	/**
	 * 判断访问释放允许
	 * 
	 * @param webContext 网络请求上下文对象
	 * @param strCurPersonId 当前用户标识
	 * @param dataEntity 访问数据对象
	 * @param strAction 访问行为
	 * @param bCache 缓存模式
	 * @return
	 * @throws Exception
	 */
	protected CallResult internalTest(IWebContext webContext, String strCurPersonId, IEntity dataEntity, String strAction, boolean bCache) throws Exception {
		CallResult callResult = new CallResult();
		callResult.setRetCode(Errors.OK);

		if (StringHelper.compare(strAction, DataAccessActions.NONE, true) == 0) return callResult;

		IEntity curDataEntity = null;
		strAction = strAction.toUpperCase();

		String strMajorDEPickupField = "";

		if (this.iDEModel.getDataAccCtrlMode() == IDataEntityModel.DATAACCCTRL_MASTER) {
			// 获取主实体
			IDER1N iDER1N = this.getDEModel().getAccMasterDER(dataEntity);
			if (iDER1N == null) {
				throw new Exception(webContext.getLocalization("ERROR.STD.NOMAJORDATAENTITY", "无法找到权限主实体"));
			}

			String strMajorAction = this.getDEModel().getMapDEOPPrivTag(strAction, iDER1N.getName());
			if (StringHelper.isNullOrEmpty(strMajorAction)) {
				if (StringHelper.compare(strAction, DataAccessActions.READ, true) == 0)
					strMajorAction = DataAccessActions.READ;
				else
					strMajorAction = DataAccessActions.UPDATE;
			}

			IDataEntityModel majorDEModel = ((IDER1NModel) iDER1N).getMajorDEModel();
			Object objValue = dataEntity.get(iDER1N.getPickupDEFName());
			return webContext.getUserPrivilegeMgr().testDataAccessAction(webContext, majorDEModel, objValue, strMajorAction);
		}

		//
		// //进行数据状态控制检查
		// if(dsCtrlMap!=null)
		// {
		// if(dsCtrlMap.containsKey(strAction))
		// {
		// if(curDataEntity==null)
		// {
		// callResult = this.getCurEntity(dataEntity, strCurPersonId);
		// if(callResult.getRetCode()!=Errors.OK)
		// {
		// return callResult;
		// }
		// curDataEntity = (IEntity)callResult.getUserObject();
		// }
		//
		// Vector<DEDSCtrl> values = dsCtrlMap.get(strAction);
		// for(DEDSCtrl dsctrl:values)
		// {
		// if(curDataEntity.ContainesParam(dsctrl.getDEFHelper().getName()))
		// {
		// String strValue =
		// curDataEntity.GetParamStringValue(dsctrl.getDEFHelper().getName(),"");
		// if(StringHelper.compare(strValue, dsctrl.getDEFVALUE(), true) == 0)
		// {
		// callResult.setRetCode(Errors.ACCESSDENY);
		// callResult.setErrorInfo(dsctrl.getDEDSCTRLNAME());
		// log.debug(StringHelper.format("数据访问控制[%1$s][%2$s]拒绝操作",strAction,dsctrl.getDEDSCTRLNAME()));
		// return callResult;
		// }
		// }
		// else
		// continue;
		// }
		// }

		//
		// if(!bMajorDE)
		// {
		// HashMap<String,DEDataAction> dataActionMap = GetDataActionMap(
		// globalHelper);
		// if(dataActionMap == null)
		// {
		// callResult.setRetCode(Errors.INTERNALERROR);
		// callResult.setErrorInfo(StringHelper.format("无法获取实体[%1$s]操作映射",this.iDEModel.getId()));
		// log.error(callResult.getErrorInfo());
		// return callResult;
		// }
		// boolean bMajorDE = true;
		// String strMajorDEAction = strAction;
		//
		// if(dataActionMap.containsKey(strAction))
		// {
		// DEDataAction dataAction = dataActionMap.get(strAction);
		// bMajorDE = dataAction.isMAPTOMAJOR();
		// strMajorDEAction = dataAction.getMAJORDEACTION();
		// }
		// else
		// {
		// bMajorDE = true;
		// if((StringHelper.compare(strAction, DataAccessActions.CREATE, true)
		// == 0)
		// ||(StringHelper.compare(strAction, DataAccessActions.DELETE, true) ==
		// 0))
		// {
		// strMajorDEAction = DataAccessActions.UPDATE;
		// }
		// }
		//
		// if(bMajorDE)
		// {
		// IDataEntityModel iMajorDEHelper =
		// isMultiMajorDEMode()?this.iDEModel.GetMajorDEHelper(strMajorDEPickupField):this.iDEModel.GetMajorDEHelper();
		// if(iMajorDEHelper == null)
		// {
		// callResult.setRetCode(Errors.INTERNALERROR);
		// callResult.setErrorInfo(StringHelper.format("无法获取实体[%1$s]主实体辅助对象",this.iDEModel.getId()));
		// log.error(callResult.getErrorInfo());
		// return callResult;
		// }
		//
		// IEntity temp = new IEntity();
		// if(StringHelper.compare(strAction, DataAccessActions.CREATE, true) ==
		// 0)
		// {
		// //新建模式
		// temp.SetParamValue(iMajorDEHelper.GetKeyDEFHelper().getName(),
		// dataEntity.GetParamValue(
		// isMultiMajorDEMode()?strMajorDEPickupField:
		// this.iDEModel.GetMajorDEPickupField()));
		// }
		// else
		// {
		// //重新查询
		// if(curDataEntity==null)
		// {
		// callResult = this.getCurEntity(dataEntity, strCurPersonId);
		// if(callResult.getRetCode()!=Errors.OK)
		// {
		// return callResult;
		// }
		// curDataEntity = (IEntity)callResult.getUserObject();
		// }
		//
		// temp.SetParamValue(iMajorDEHelper.GetKeyDEFHelper().getName(),
		// curDataEntity.GetParamValue(
		// isMultiMajorDEMode()?strMajorDEPickupField:this.iDEModel.GetMajorDEPickupField()));
		// }
		// if(webContext!=null)
		// return iMajorDEHelper.GetDataAccHelper().Test(webContext, temp,
		// strMajorDEAction);
		// else
		// return iMajorDEHelper.GetDataAccHelper().Test(webContext, temp,
		// strMajorDEAction);
		// }
		// }
		//
		// if (StringHelper.compare(strCurPersonId, "SYSTEM", true) == 0)
		// {
		// callResult.setUserObject(true);
		// return callResult;
		// }

		String strValue = "";
		if (dataEntity != null) strValue = DataObject.getStringValue(dataEntity, iDEModel.getKeyDEField().getName(), "");
		if ((StringHelper.compare(strAction, DataAccessActions.CREATE, true) == 0) || ((StringHelper.compare(strAction, DataAccessActions.UPDATE, true) == 0) && StringHelper.isNullOrEmpty(strValue))) {
			// 超级用户或机构
			if (webContext.isSuperUser() || webContext.isOrgAdmin()) {
				return callResult;
			}

			callResult.setRetCode(webContext.getUserRoleMgr().testUserRoleDataAction(iDEModel.getId(), dataEntity, DataAccessActions.CREATE) ? Errors.OK : Errors.ACCESSDENY);
			return callResult;
		}

		if ((StringHelper.compare(strAction, DataAccessActions.WFSTART, true) == 0) && StringHelper.isNullOrEmpty(strValue)) {
			// 超级用户或机构
			if (webContext.isSuperUser() || webContext.isOrgAdmin()) {
				return callResult;
			}

			callResult.setRetCode(webContext.getUserRoleMgr().testUserRoleDataAction(iDEModel.getId(), dataEntity, DataAccessActions.WFSTART) ? Errors.OK : Errors.ACCESSDENY);
			return callResult;
		}

		if (StringHelper.isNullOrEmpty(strValue)) {
			throw new ErrorException(Errors.INTERNALERROR, webContext.getLocalization("ERROR.STD.SYS.ACCESSDENY", "没有指定数据键值"));
		}

		// 判断是否为临时数据
		if (KeyValueHelper.isTempKey(strValue)) {
			return callResult;
		}

		// 判断数据的性质
		if (StringHelper.compare(strAction, DataAccessActions.READ, true) != 0) {
			// 判断是否在流程中
			if (strAction.indexOf("WF") != 0) {
				dataEntity = getFullEntity(webContext, dataEntity, bCache);
				if (this.getDEModel().testDataInWF(dataEntity) != null) {
					callResult.setRetCode(Errors.ACCESSDENY);
					callResult.setErrorInfo(webContext.getLocalization("ERROR.STD.WF.DATAINPROCESS", "数据在流程中，无法进行操作"));
					return callResult;
				}
			}
		}

		if (webContext.isSuperUser()) return callResult;
		if (webContext.isOrgAdmin()) {
			dataEntity = getFullEntity(webContext, dataEntity, bCache);
			// 判断数据是当前组织
			Object objOrgId = this.getDEModel().getOrgId(dataEntity);
			if (objOrgId != null) {
				if (StringHelper.compare(objOrgId.toString(), webContext.getCurOrgId(), false) == 0) {
					return callResult;
				}
			}
		}

		IUserRoleMgr iUserRoleMgr = webContext.getUserRoleMgr();
		ArrayList<UserRoleData> list = iUserRoleMgr.getUserRoleDatas(this.getDEModel().getId(), strAction);
		if (list != null) {
			ArrayList<String> condList = new ArrayList<String>();
			for (UserRoleData userRoleData : list) {
				String strCode = iUserRoleMgr.getUserRoleDataCond(this.getService(), userRoleData);
				if (!StringHelper.isNullOrEmpty(strCode)) {
					condList.add(strCode);
				}
			}

			if (condList.size() == 0) {
				callResult.setRetCode(Errors.ACCESSDENY);
				return callResult;
			}

			boolean bOk = false;
			// 执行查询
			IDEField orgIdDEField = this.getDEModel().getDEFieldByPDT(IDEField.PREDEFINEDTYPE_ORGID, true);
			IDEField secIdDEField = this.getDEModel().getDEFieldByPDT(IDEField.PREDEFINEDTYPE_ORGSECTORID, true);

			DEDataSetFetchContext deDataSetFetchContextImpl = new DEDataSetFetchContext(null);
			deDataSetFetchContextImpl.setStartRow(0);
			deDataSetFetchContextImpl.setPageSize(1);
			DEDataSetFetchContext.enableOrgDRCond(deDataSetFetchContextImpl, orgIdDEField, secIdDEField, condList);
			DEDataSetCond deDataSetCondImpl = new DEDataSetCond();
			deDataSetCondImpl.setCondType(IDEDataSetCond.CONDTYPE_DEFIELD);
			deDataSetCondImpl.setCondOp(ICondition.CONDOP_EQ);
			deDataSetCondImpl.setDEFName(this.getDEModel().getKeyDEField().getName());
			deDataSetCondImpl.setCondValue(strValue);
			deDataSetFetchContextImpl.getConditionList().add(deDataSetCondImpl);

			deDataSetFetchContextImpl.setFetchTotalRow(false);
			// deDataSetFetchContextImpl.setStartRow(1
			long nBeginTime = java.lang.System.currentTimeMillis();
			try {
				SessionFactoryManager.addRef();
				DBFetchResult fetchResult = this.getService().getDAO().fetchDEDataQuery(deDataSetFetchContextImpl, "DEFAULT", false);
				if (fetchResult.getDataSet().getDataTable(0).getCachedRowCount() == -1) fetchResult.getDataSet().cacheDataRow();
				if (fetchResult.getDataSet().getDataTable(0).getCachedRowCount() > 0) {
					bOk = true;
				}

				fetchResult.getDataSet().close();
				if (!bOk) {
					callResult.setRetCode(Errors.ACCESSDENY);
				}

				long nTime = java.lang.System.currentTimeMillis() - nBeginTime;
				log.debug(StringHelper.format("查询耗时[%1$s]", nTime));
				SessionFactoryManager.releaseRef(false);

				return callResult;
			} catch (Exception ex) {
				log.error(StringHelper.format("实体[%1$s]权限检查代码发生异常，%2$s", this.getDEModel().getName(), ex.getMessage()), ex);
				SessionFactoryManager.releaseRef(false);
				throw ex;
			}

		} else {
			callResult.setRetCode(Errors.ACCESSDENY);
			return callResult;
		}

	}

	//
	//
	// private HashMap<String,DEDataAction> GetDataActionMap(ISRFDAGlobalHelper
	// globalHelper)
	// {
	// if(dataActionMap!=null)
	// return dataActionMap;
	//
	// dataActionMap = new HashMap<String,DEDataAction>();
	// Vector<DEDataAction> dataActions = new Vector<DEDataAction>();
	// CallResult callResult =
	// globalHelper.getDAModelHelper().GetDEDataActions(this.iDEModel.getId(),
	// dataActions);
	// if(callResult.getRetCode()!=Errors.OK)
	// {
	// log.error(StringHelper.format("获取附属实体[%1$s]操作映射失败，%2$s",
	// this.iDEModel.getId(),callResult.getErrorInfo()));
	// return null;
	// }
	//
	// for(DEDataAction dataAction:dataActions)
	// {
	// dataActionMap.put(dataAction.getDEDATAACTIONNAME().toUpperCase(),
	// dataAction);
	// }
	// return dataActionMap;
	// }
	//
	// public CallResult GetDataActionMap(String strAction,ISRFDAGlobalHelper
	// globalHelper,DEDataAction dataAction)
	// {
	// CallResult callResult = new CallResult();
	// HashMap<String,DEDataAction> dataActionMap = GetDataActionMap(
	// globalHelper);
	// if(dataActionMap == null)
	// {
	// callResult.setRetCode(Errors.INTERNALERROR);
	// callResult.setErrorInfo(StringHelper.format("无法获取实体[%1$s]操作映射",this.iDEModel.getId()));
	// log.error(callResult.getErrorInfo());
	// return callResult;
	// }
	// dataAction.setISMAPTOMAJOR(true);
	// if(dataActionMap.containsKey(strAction.toUpperCase()))
	// {
	// DEDataAction dataAction2 = dataActionMap.get(strAction.toUpperCase());
	// dataAction2.CopyTo(dataAction, true);
	// }
	// else
	// {
	//
	// if((StringHelper.compare(strAction, DataAccessActions.CREATE, true) == 0)
	// ||(StringHelper.compare(strAction, DataAccessActions.DELETE, true) == 0))
	// {
	// dataAction.setMAJORDEACTION(DataAccessActions.UPDATE);
	// }
	// else
	// {
	// dataAction.setMAJORDEACTION(strAction);
	// }
	// }
	// return callResult;
	// }

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.security.IDEDataAccMgr#audit(java.lang.String, net.ibizsys.paas.web.IWebContext, net.ibizsys.paas.entity.IEntity, net.ibizsys.paas.entity.IEntity, java.lang.String)
	 */
	@Override
	public void audit(String strAuditInfo, IWebContext webContext, IEntity dataEntity, IEntity lastDataEntity, String strAction) throws Exception {
		if (webContext != null) {
			audit(strAuditInfo, webContext.getCurUserId(), webContext.getCurUserName(), webContext.getRemoteAddr(), dataEntity, lastDataEntity, strAction);
			return;
		}
		if (ActionContext.getCurrent() != null) {
			IActionContext iActionContext = ActionContext.getCurrent();
			audit(strAuditInfo, iActionContext.getOperator(), iActionContext.getOperatorName(), iActionContext.getRemoteAddr(), dataEntity, lastDataEntity, strAction);
			return;
		}

		audit(strAuditInfo, "", "", "", dataEntity, lastDataEntity, strAction);
		return;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.security.IDEDataAccMgr#audit(java.lang.String, java.lang.String, java.lang.String, java.lang.String, net.ibizsys.paas.entity.IEntity, net.ibizsys.paas.entity.IEntity, java.lang.String)
	 */
	@Override
	public void audit(String strAuditInfo, String strOpPersonId, String strOpPersonName, String strFromIpAddress, IEntity dataEntity, IEntity lastDataEntity, String strAction) throws Exception {
		IDataEntityModel majorDEModel = null;
		String strMajorDEPickupField = "";
		if (this.iDEModel.getDataAccCtrlMode() == IDataEntityModel.DATAACCCTRL_MASTER) {
			// 获取主实体
			IDER1N iDER1N = this.getDEModel().getAccMasterDER(dataEntity);
			if (iDER1N == null) {
				throw new Exception(WebContext.getCurrent().getLocalization("ERROR.STD.NOMAJORDATAENTITY", "无法找到权限主实体"));
			}
			strMajorDEPickupField = iDER1N.getPickupDEFName();
			majorDEModel = ((IDER1NModel) iDER1N).getMajorDEModel();
		}

		if (!iDEModel.isEnableAudit()) {
			if (majorDEModel == null) {
				return;
			} else if (!majorDEModel.isEnableAudit()) {
				return;
			}
		}

		String strDataInfo = iDEModel.getDataInfo(dataEntity);

		boolean bFirst = true;
		StringBuilderEx info = new StringBuilderEx();
		if (!StringHelper.isNullOrEmpty(strAuditInfo)) {
			info.append(strAuditInfo);
			bFirst = false;
		}

		ArrayList<IDEFieldDiffItem> deFieldDiffItemList = null;
		if (lastDataEntity != null) {
			deFieldDiffItemList = DEModelUtil.getDEDataDiffItems(this.getDEModel(), dataEntity, lastDataEntity, true);
			for (IDEFieldDiffItem iDEFieldDiffItem : deFieldDiffItemList) {
				if (bFirst)
					bFirst = false;
				else {
					info.append("\r\n");
				}
				String strAuditInfoFormat = iDEFieldDiffItem.getDEField().getAuditInfoFormat();
				info.append(strAuditInfoFormat, iDEFieldDiffItem.getDEField().getLogicName(""), iDEFieldDiffItem.getOldText(), iDEFieldDiffItem.getNewText());
			}
		}

		DataAudit dataAudit = new DataAudit();

		dataAudit.setDataAuditId(KeyValueHelper.genGuidEx());
		dataAudit.setOpPersonId(strOpPersonId);
		dataAudit.setOpPersonName(strOpPersonName);
		dataAudit.setIPAddress(strFromIpAddress);
		dataAudit.setObjectType(iDEModel.getId());
		dataAudit.setObjectId(DataObject.getStringValue(dataEntity, iDEModel.getKeyDEField().getName(), ""));
		dataAudit.setAuditInfo(info.toString());
		dataAudit.setAuditType(strAction);
		dataAudit.setDataAuditName(StringHelper.format("[%1$s]%2$s", strAction, strDataInfo));

		DataAuditService dataAuditService = (DataAuditService) ServiceGlobal.getService(DataAuditService.class);
		dataAuditService.create(dataAudit, false);

		// 判断是否记录明细
		if (this.getDEModel().isLogAuditDetail() && deFieldDiffItemList != null) {
			DataAuditDetailService dataAuditDetailService = (DataAuditDetailService) ServiceGlobal.getService(DataAuditDetailService.class);
			for (IDEFieldDiffItem iDEFieldDiffItem : deFieldDiffItemList) {
				DataAuditDetail dataAuditDetail = new DataAuditDetail();
				dataAuditDetail.setDataAuditDetailName(iDEFieldDiffItem.getDEField().getName());
				if (iDEFieldDiffItem.getOldValue() != null) dataAuditDetail.setOldValue(iDEFieldDiffItem.getOldValue().toString());
				if (iDEFieldDiffItem.getNewValue() != null) dataAuditDetail.setNewValue(iDEFieldDiffItem.getNewValue().toString());
				dataAuditDetail.setOldText(iDEFieldDiffItem.getOldText());
				dataAuditDetail.setNewText(iDEFieldDiffItem.getNewText());
				dataAuditDetail.setDataAuditId(dataAudit.getDataAuditId());
				dataAuditDetailService.create(dataAuditDetail, false);
			}
		}

		// 当前非主数据，执行父数据更新审计
		if (majorDEModel != null) {
			IEntity temp = majorDEModel.createEntity();
			temp.set(majorDEModel.getKeyDEField().getName(), dataEntity.get(strMajorDEPickupField));
			majorDEModel.getService().get(temp);
			majorDEModel.getDEDataAccMgr().audit(StringHelper.format("[%1$s]%2$s", strAction, strDataInfo), strOpPersonId, strOpPersonName, strFromIpAddress, temp, null, DataAccessActions.UPDATE);
		}

	}

	/**
	 * 获取实体定义的数据操作标识
	 * 
	 * @return
	 */
	public String getDataActions() {
		return this.strDataActions;
	}

	// /**
	// * 计算当前数据实体
	// * @param dataEntity
	// * @param strCurPersonId
	// * @return
	// */
	// protected void getCurEntity (IEntity dataEntity,String
	// strCurPersonId)throws Exception
	// {
	// CallResult callResult = new CallResult();
	// IEntity curDataEntity = this.getDEModel().createEntity();
	// dataEntity.copyTo(curDataEntity, true);
	//
	// String strValue =
	// dataEntity.GetParamStringValue(iDEModel.getKeyDEField().getName(), "");
	// if(StringHelper.isNullOrEmpty(strValue))
	// {
	// strValue = dataEntity.GetParamStringValue("SRFDATEMPKEYID", "");
	// }
	//
	// if(StringHelper.isNullOrEmpty(strValue))
	// {
	// throw new ErrorException(Errors.INTERNALERROR,"没有指定数据键值");
	// }
	//
	// //判断是否为临时数据
	// if(KeyHelper.isTempKey(strValue))
	// {
	// callResult.setUserObject(curDataEntity);
	// return callResult;
	// }
	//
	// callResult =
	// this.iDEModel.GetDEDataCtrl(strCurPersonId,null).Get(curDataEntity);
	// if(callResult.getRetCode()!=Errors.OK)
	// return callResult;
	//
	// callResult.setUserObject(curDataEntity);
	// return callResult;
	// }

	/**
	 * 获取实体服务对象
	 * 
	 * @return
	 * @throws Exception
	 */
	protected IService getService() throws Exception {
		return this.iDEModel.getService();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.security.IDEDataAccMgr#test(net.ibizsys.paas.web.IWebContext, java.lang.Object, java.lang.String)
	 */
	@Override
	public CallResult test(IWebContext webContext, Object objKey, String strAction) throws Exception {
		return this.test(webContext, objKey, strAction, false);
	}

	/**
	 * 获取完整数据对象信息
	 * 
	 * @param webContext
	 * @param iEntity
	 * @param bCache
	 * @return
	 * @throws Exception
	 */
	protected IEntity getFullEntity(IWebContext webContext, IEntity iEntity, boolean bCache) throws Exception {
		if (iEntity.isFullEntity()) return iEntity;

		String strKeyTag = null;
		if (bCache) {
			strKeyTag = StringHelper.format("%1$s_%2$s", this, iEntity.get(this.getDEModel().getKeyDEField().getName()));
			Object objRet = webContext.getAttribute(strKeyTag);
			if (objRet != null) {
				IEntity fullEntity = (IEntity) objRet;
				fullEntity.copyTo(iEntity, true);
				return iEntity;
			}
		}

		this.iDEModel.getService().executeAction(IService.ACTION_GET, iEntity);
		if (bCache) {
			IEntity fullEntity = this.getDEModel().createEntity();
			iEntity.copyTo(fullEntity, false);
			webContext.setAttribute(strKeyTag, fullEntity);
		}
		return iEntity;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.security.IDEDataAccMgr#test(net.ibizsys.paas.web.IWebContext, java.lang.Object, java.lang.String, boolean)
	 */
	@Override
	public CallResult test(IWebContext webContext, Object objKey, String strAction, boolean bCache) throws Exception {
		if (StringHelper.compare(strAction, DataAccessActions.NONE, true) == 0) return new CallResult();

		String strKeyTag = null;
		if (bCache) {
			strKeyTag = StringHelper.format("%1$s_%2$s_%3$s", this, objKey, strAction);
			Object objRet = webContext.getAttribute(strKeyTag);
			if (objRet != null && objRet instanceof CallResult) {
				CallResult callResult = new CallResult();
				callResult.from((CallResult) objRet);
				return callResult;
			}
		}

		IEntity iEntity = this.getDEModel().createEntity();
		iEntity.set(this.getDEModel().getKeyDEField().getName(), objKey);
		return this.test(webContext, iEntity, strAction, bCache);
	}

	@Override
	public CallResult test(IWebContext webContext, IEntity dataEntity, String strAction, boolean bCache) throws Exception {

		if (StringHelper.compare(strAction, DataAccessActions.NONE, true) == 0) return new CallResult();

		String strKeyTag = null;
		if (bCache) {
			strKeyTag = StringHelper.format("%1$s_%2$s_%3$s", this, dataEntity.get(this.getDEModel().getKeyDEField().getName()), strAction);
			Object objRet = webContext.getAttribute(strKeyTag);
			if (objRet != null && objRet instanceof CallResult) {
				CallResult callResult = new CallResult();
				callResult.from((CallResult) objRet);
				return callResult;
			}
		}

		CallResult ret = internalTest(webContext, webContext.getCurUserId(), dataEntity, strAction, bCache);
		if (bCache) {
			CallResult callResult = new CallResult();
			callResult.from(ret);
			webContext.setAttribute(strKeyTag, callResult);
		}
		return ret;
	}

}
