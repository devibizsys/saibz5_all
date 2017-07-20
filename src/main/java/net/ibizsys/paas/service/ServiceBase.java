package net.ibizsys.paas.service;

import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import net.ibizsys.paas.control.form.IFormItem;
import net.ibizsys.paas.core.ActionContext;
import net.ibizsys.paas.core.CallResult;
import net.ibizsys.paas.core.DEDataSetCond;
import net.ibizsys.paas.core.DEDataSetFetchContext;
import net.ibizsys.paas.core.DataTypes;
import net.ibizsys.paas.core.Errors;
import net.ibizsys.paas.core.IDEDataQuery;
import net.ibizsys.paas.core.IDEDataSet;
import net.ibizsys.paas.core.IDEDataSetCond;
import net.ibizsys.paas.core.IDEDataSetFetchContext;
import net.ibizsys.paas.core.IDEDataSyncIn;
import net.ibizsys.paas.core.IDEField;
import net.ibizsys.paas.core.IDataEntity;
import net.ibizsys.paas.core.IPostConstructable;
import net.ibizsys.paas.core.PluginActionResult;
import net.ibizsys.paas.ctrlhandler.CtrlHandler;
import net.ibizsys.paas.ctrlhandler.ICtrlHandler;
import net.ibizsys.paas.dao.IDAO;
import net.ibizsys.paas.data.DataObject;
import net.ibizsys.paas.db.DBCallResult;
import net.ibizsys.paas.db.DBFetchResult;
import net.ibizsys.paas.db.IDataRow;
import net.ibizsys.paas.db.IDataTable;
import net.ibizsys.paas.db.ISelectCond;
import net.ibizsys.paas.db.ISelectContext;
import net.ibizsys.paas.db.SelectCond;
import net.ibizsys.paas.db.SelectContext;
import net.ibizsys.paas.db.SelectField;
import net.ibizsys.paas.db.SqlParamList;
import net.ibizsys.paas.demodel.DEModelGlobal;
import net.ibizsys.paas.demodel.IDEActionLogicModel;
import net.ibizsys.paas.demodel.IDEDataSetModel;
import net.ibizsys.paas.demodel.IDELogicModel;
import net.ibizsys.paas.demodel.IDataEntityModel;
import net.ibizsys.paas.entity.EntityBase;
import net.ibizsys.paas.entity.EntityError;
import net.ibizsys.paas.entity.EntityException;
import net.ibizsys.paas.entity.EntityFieldError;
import net.ibizsys.paas.entity.IEntity;
import net.ibizsys.paas.entity.SimpleEntity;
import net.ibizsys.paas.exception.ErrorException;
import net.ibizsys.paas.logic.ICondition;
import net.ibizsys.paas.security.DataAccessActions;
import net.ibizsys.paas.sysmodel.ISystemModel;
import net.ibizsys.paas.util.DataTypeHelper;
import net.ibizsys.paas.util.DefaultValueHelper;
import net.ibizsys.paas.util.KeyValueHelper;
import net.ibizsys.paas.util.StringHelper;
import net.ibizsys.paas.web.IWebContext;
import net.ibizsys.paas.web.WebContext;
import net.ibizsys.psba.dao.IBADAO;
import net.ibizsys.psba.service.DEBAUitl;
import net.ibizsys.psrt.srv.codelist.DataChangeEventCodeListModel;
import net.ibizsys.psrt.srv.common.entity.DEDataChg;
import net.ibizsys.psrt.srv.common.entity.DataSyncIn;
import net.ibizsys.psrt.srv.common.service.DEDataChgService;
import net.ibizsys.pswf.core.IWFActionContext;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.SessionFactory;

/**
 * 服务对象基类
 * 
 * @author lionlau
 * 
 * @param <ET>
 */
public abstract class ServiceBase<ET extends IEntity> implements IService<ET>, IPostConstructable {

	private static final Log log = LogFactory.getLog(ServiceBase.class);

	/**
	 * 临时数据主键前缀
	 */
	public final static String TEMPKEY = "SRFTEMPKEY:";

	/**
	 * 实际数据主键
	 */
	public final static String ORIGINKEY = "SRFORIKEY";

	/**
	 * 复制源数据主键
	 */
	public final static String SOURCEKEY = "SRFSOURCEKEY";

	/**
	 * 草稿标志
	 */
	public final static String DRAFTFLAG = "SRFDRAFTFLAG";

	/**
	 * 主键状态
	 */
	public final static String KEYSTATE = "SRFKEYSTATE";

	/**
	 * 调用返回值
	 */
	public final static String RET = "SRFRET";

	/**
	 * 同步数据对象变量名称
	 */
	public final static String DATASYNCIN = "SRFDATASYNCIN";

	/**
	 * 逻辑附加模式执行之前
	 */
	public final static String LOGICATTACHMODE_BEFORE = "BEFORE";

	/**
	 * 逻辑附加模式执行之后
	 */
	public final static String LOGICATTACHMODE_AFTER = "AFTER";
	
	/**
	 * 消息：检查主键状态，数据已经被删除
	 */
	public final static String MSG_CHECKKEYSTATE_DELETE = "CTRL.SERVICE.CHECKKEYSTATE_DELETE"; //数据已经被删除，无法再次建立
	
	/**
	 * 消息：检查主键状态，数据已经存在，无法再次建立
	 */
	public final static String MSG_CHECKKEYSTATE_EXIST = "CTRL.SERVICE.CHECKKEYSTATE_EXIST"; //数据已经存在，无法再次建立
	
	/**
	 * 消息：保存失败，数据已经被删除
	 */
	public final static String MSG_SAVE_DATADELETE = "CTRL.SERVICE.SAVE_DATADELETE"; //数据已经被逻辑删除，无法保存
	
	
	/**
	 * 消息：获取更新前数据失败，数据未删除
	 */
	public final static String MSG_GETLAST_NOTCACHED = "CTRL.SERVICE.GETLAST_NOTCACHED"; //变更之前数据无效，没有在数据变更之前进行缓存
	
	/**
	 * 消息：检查基本值规则信息
	 */
	public final static String MSG_CHECKFIELDSIMPLERULE_INFO = "CTRL.SERVICE.CHECKFIELDSIMPLERULE_INFO"; //内容必须符合值规则
	
	/**
	 * 消息：检查数据值范围值规则信息
	 */
	public final static String MSG_CHECKFIELDDATASETRULE_INFO = "CTRL.SERVICE.CHECKFIELDDATASETRULE_INFO"; //值必须符合数据集合范围规则
	
	/**
	 * 消息 检查属性字符长度规则信息
	 */
	public final static String MSG_CHECKFIELDSTRINGLENGTHRULE_INFO = "CTRL.SERVICE.CHECKFIELDSTRINGLENGTHRULE_INFO"; //内容长度必须符合范围规则
	
	/**
	 * 消息 检查属性字符长度，值无效
	 */
	public final static String MSG_CHECKFIELDSTRINGLENGTHRULE_INVALIDVALUE = "CTRL.SERVICE.CHECKFIELDSTRINGLENGTHRULE_INVALIDVALUE"; //属性[%1$s]值不是字符类型
	
	/**
	 * 消息 检查属性值范围规则信息
	 */
	public final static String MSG_CHECKFIELDVALUERANGERULE_INFO = "CTRL.SERVICE.CHECKFIELDVALUERANGERULE_INFO"; //数值必须符合值范围规则
	
	/**
	 * 消息：检查数据值引用出现递归关系
	 */
	public final static String MSG_CHECKFIELDRECURSIONRULE_INFO = "CTRL.SERVICE.CHECKFIELDRECURSIONRULE_INFO"; //值引用出现递归关系
	
	/**
	 * 消息 检查属性正则式规则信息
	 */
	public final static String MSG_CHECKFIELDREGEXRULE_INVALIDVALUE = "CTRL.SERVICE.CHECKFIELDREGEXRULE_INVALIDVALUE"; //属性[%1$s]值不是字符类型
	
	/**
	 * 消息 检查属性重复值规则，值无效
	 */
	public final static String MSG_CHECKFIELDDUPRULE_EMPTYVALUE = "CTRL.SERVICE.CHECKFIELDDUPRULE_EMPTYVALUE"; //属性[%1$s]没有值，不能检查
	
	
	
	
	/**
	 * 消息 检查属性重复值规则信息
	 */
	public final static String MSG_CHECKFIELDDUPRULE_INFO = "CTRL.SERVICE.CHECKFIELDDUPRULE_INFO"; //值重复
	
	/**
	 * 消息 导入模型失败，数据已经被删除
	 */
	public final static String MSG_IMPORTMODEL_DATADELETE = "CTRL.SERVICE.IMPORTMODEL_DATADELETE"; //[%1$s]数据[%2$s]已经被删除，无法导入
	
	/**
	 * 消息 获取删除拒绝消息
	 */
	public final static String MSG_GETREMOVEREJECTMSG_INFO = "CTRL.SERVICE.GETREMOVEREJECTMSG_INFO"; //%1$s[%2$s]存在关系数据[%3$s]，无法删除！
	
	
	

	// private HashMap<Object, ET> cacheEntityMap = new HashMap<Object, ET>();

	private String strDSLink = null;

	private SessionFactory sessionFactory = null;

	private static SimpleEntity INVALIDLAST = new SimpleEntity();

	private static SimpleEntity EMPTYLAST = new SimpleEntity();
	
	
	private IServicePlugin iServicePlugin = null;
	
	private boolean bCalcServicePlugin = false;
	
	

	protected class DBCallResultProxy {
		private DBCallResult dbCallResult = null;

		public DBCallResult getDBCallResult() {
			return this.dbCallResult;
		}

		public void setDBCallResult(DBCallResult dbCallResult) {
			this.dbCallResult = dbCallResult;
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.service.IService#getWebContext()
	 */
	@Override
	public IWebContext getWebContext() {
		return WebContext.getCurrent();
	}

	/**
	 * 获取Service对象的标识
	 * 
	 * @return
	 */
	protected String getServiceId() {
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.service.IService#getDEModel()
	 */
	public abstract IDataEntityModel<ET> getDEModel();

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.service.IService#getDAO()
	 */
	@Override
	public IDAO getDAO() {
		return null;
	}

	/**
	 * 获取大数据体系DAO对象（NoSQL)
	 * 
	 * @return
	 */
	public IBADAO getBADAO() {
		return null;
	}

	/**
	 * 获取指定数据访问方式
	 * 
	 * @param nMode
	 * @return
	 * @throws Exception
	 */
	@Deprecated
	public IDAO getDAO(int nMode) throws Exception {
		switch (nMode) {
		case IDataEntity.STORAGEMODE_SQL: {
			IDAO iDAO = getDAO();
			if (iDAO == null) {
				throw new Exception("当前未定义SQL数据访问对象");
			}
			return iDAO;
		}
//		case IDataEntity.STORAGEMODE_NoSQL: {
//			IDAO iDAO = getBADAO();
//			if (iDAO == null) {
//				throw new Exception("当前未定义NoSQL数据访问对象");
//			}
//			return iDAO;
//		}
		default:
			throw new Exception(StringHelper.format("无法识别的数据访问方式"));
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.service.IService#fetchDataSet(java.lang.String, net.ibizsys.paas.core.IDEDataSetFetchContext)
	 */
	@Override
	public DBFetchResult fetchDataSet(String strDataSetName, IDEDataSetFetchContext iDEDataSetFetchContext) throws Exception {
		return onfetchDataSet(strDataSetName, iDEDataSetFetchContext);
	}

	/**
	 * 获取数据集结果
	 * 
	 * @param strDataSetName
	 * @param iDEDataSetFetchContext
	 * @return
	 * @throws Exception
	 */
	protected DBFetchResult onfetchDataSet(String strDataSetName, IDEDataSetFetchContext iDEDataSetFetchContext) throws Exception {
		throw new Exception(StringHelper.format("没有找到获取数据集合操作[%1$s]", strDataSetName));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.service.IService#fetchDataSetTemp(java.lang.String, net.ibizsys.paas.core.IDEDataSetFetchContext)
	 */
	@Override
	public DBFetchResult fetchDataSetTemp(String strDataSetName, IDEDataSetFetchContext iDEDataSetFetchContext) throws Exception {
		return onfetchDataSetTemp(strDataSetName, iDEDataSetFetchContext);
	}

	/**
	 * 获取数据集结果（临时数据模式）
	 * 
	 * @param strDataSetName
	 * @param iDEDataSetFetchContext
	 * @return
	 * @throws Exception
	 */
	protected DBFetchResult onfetchDataSetTemp(String strDataSetName, IDEDataSetFetchContext iDEDataSetFetchContext) throws Exception {
		throw new Exception(StringHelper.format("没有找到获取数据集合操作[%1$s]", strDataSetName));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.service.IService#executeAction(java.lang.String, net.ibizsys.paas.entity.IEntity)
	 */
	@Override
	public void executeAction(String strAction, IEntity iEntity) throws Exception {
		IEntity iEntity2 = this.getDEModel().createEntity();
		if (iEntity2.getClass().isInstance(iEntity)) {
			onExecuteAction(strAction, iEntity);
		} else {
			iEntity.copyTo(iEntity2, true);
			onExecuteAction(strAction, iEntity2);
			iEntity2.copyTo(iEntity, true);
		}
	}

	/**
	 * 执行实体操作
	 * 
	 * @param strAction
	 * @param iEntity
	 * @throws Exception
	 */
	protected void onExecuteAction(String strAction, IEntity iEntity) throws Exception {
		if (StringHelper.compare(strAction, ACTION_GETDRAFT, true) == 0) {
			this.getDraft((ET) iEntity);
			return;
		}

		if (StringHelper.compare(strAction, ACTION_GET, true) == 0) {
			this.get((ET) iEntity);
			return;
		}

		if (StringHelper.compare(strAction, ACTION_TRYGET, true) == 0) {
			this.get((ET) iEntity, true);
			return;
		}

		if (StringHelper.compare(strAction, ACTION_SELECT, true) == 0) {
			this.select((ET) iEntity, false);
			return;
		}

		if (StringHelper.compare(strAction, ACTION_TRYSELECT, true) == 0) {
			this.select((ET) iEntity, true);
			return;
		}

		if (StringHelper.compare(strAction, ACTION_CREATE, true) == 0) {
			this.create((ET) iEntity);
			return;
		}

		if (StringHelper.compare(strAction, ACTION_UPDATE, true) == 0) {
			this.update((ET) iEntity);
			return;
		}

		if (StringHelper.compare(strAction, ACTION_REMOVE, true) == 0) {
			this.remove((ET) iEntity);
			return;
		}

		if (StringHelper.compare(strAction, ACTION_GETDRAFTTEMP, true) == 0) {
			this.getDraftTemp((ET) iEntity);
			return;
		}

		if (StringHelper.compare(strAction, ACTION_GETTEMP, true) == 0) {
			this.getTemp((ET) iEntity);
			return;
		}

		if (StringHelper.compare(strAction, ACTION_CREATETEMP, true) == 0) {
			this.createTemp((ET) iEntity);
			return;
		}

		if (StringHelper.compare(strAction, ACTION_UPDATETEMP, true) == 0) {
			this.updateTemp((ET) iEntity);
			return;
		}

		if (StringHelper.compare(strAction, ACTION_REMOVETEMP, true) == 0) {
			this.removeTemp((ET) iEntity);
			return;
		}

		if (StringHelper.compare(strAction, ACTION_GETDRAFTTEMPMAJOR, true) == 0) {
			this.getDraftTempMajor((ET) iEntity);
			return;
		}

		if (StringHelper.compare(strAction, ACTION_GETTEMPMAJOR, true) == 0) {
			this.getTempMajor((ET) iEntity);
			return;
		}

		if (StringHelper.compare(strAction, ACTION_CREATETEMPMAJOR, true) == 0) {
			this.createTempMajor((ET) iEntity);
			return;
		}

		if (StringHelper.compare(strAction, ACTION_UPDATETEMPMAJOR, true) == 0) {
			this.updateTempMajor((ET) iEntity);
			return;
		}

		if (StringHelper.compare(strAction, ACTION_REMOVETEMPMAJOR, true) == 0) {
			this.removeTempMajor((ET) iEntity);
			return;
		}

		if (StringHelper.compare(strAction, ACTION_SAVE, true) == 0) {
			this.save((ET) iEntity);
			return;
		}

		// if (StringHelper.compare(strAction, ACTION_SAVETEMP, true) == 0)
		// {
		// this.saveTemp((ET) iEntity);
		// return;
		// }

		if (StringHelper.compare(strAction, ACTION_CHECKKEY, true) == 0) {
			this.checkKey((ET) iEntity);
			return;
		}

		if (StringHelper.compare(strAction, ACTION_GETDRAFTFROM, true) == 0) {
			this.getDraftFrom((ET) iEntity);
			return;
		}

		if (StringHelper.compare(strAction, ACTION_GETDRAFTTEMPFROM, true) == 0) {
			this.getDraftTempFrom((ET) iEntity);
			return;
		}

		if (StringHelper.compare(strAction, ACTION_GETDRAFTTEMPMAJORFROM, true) == 0) {
			this.getDraftTempMajorFrom((ET) iEntity);
			return;
		}

		if (StringHelper.compare(strAction, ACTION_INITWF, true) == 0) {
			this.initWF((ET) iEntity);
			return;
		}

		if (StringHelper.compare(strAction, ACTION_FINISHWF, true) == 0) {
			this.finishWF((ET) iEntity);
			return;
		}

		if (StringHelper.compare(strAction, ACTION_CLOSEWF, true) == 0) {
			this.closeWF((ET) iEntity);
			return;
		}

		if (StringHelper.compare(strAction, ACTION_CANCELSTARTWF, true) == 0) {
			this.cancelStartWF((ET) iEntity);
			return;
		}

		throw new Exception(StringHelper.format("没有找到操作[%1$s]", strAction));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.service.IService#executeAction(java.lang.String, java.util.ArrayList)
	 */
	@Override
	public void executeAction(String strAction, java.util.ArrayList<IEntity> entities) throws Exception {
		onExecuteAction(strAction, entities);
	}

	/**
	 * 批执行操作，默认逐个执行
	 * 
	 * @param strAction
	 * @param entities
	 * @throws Exception
	 */
	protected void onExecuteAction(String strAction, java.util.ArrayList<IEntity> entities) throws Exception {
		for (IEntity iEntity : entities) {
			executeAction(strAction, iEntity);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.service.IService#get(net.ibizsys.paas.entity.IEntity, boolean)
	 */
	@Override
	public boolean get(ET et2, boolean bTryMode2) throws Exception {
		et2.setSessionFactory(this.getSessionFactory());
		final long nBeginTime = java.lang.System.currentTimeMillis();
		final ET et = et2;
		final boolean bTryMode = bTryMode2;
		final CallResult callResult = new CallResult();

		this.doServiceWork(new IServiceWork() {
			@Override
			public void execute(ITransaction iTransaction) throws Exception {
				CallResult ret = internalGet(et, bTryMode);
				callResult.from(ret);
				if (callResult.isError()) {
					return;
				}
				onAfterGet(et);
				long nTime = java.lang.System.currentTimeMillis() - nBeginTime;
				log.debug(StringHelper.format("get 耗时[%1$s]", nTime));
			}
		}, false);

		return callResult.isOk();
	}

	/**
	 * 内部获取
	 * 
	 * @param entity
	 * @param bTryMode
	 * @return
	 * @throws Exception
	 */
	protected CallResult internalGet(ET entity, boolean bTryMode) throws Exception {
		CallResult callResult = new CallResult();
		switch (getDEModel().getStorageMode()) {
		case IDataEntity.STORAGEMODE_NONE:
			throw new Exception("当前实体不支持存储");
		case IDataEntity.STORAGEMODE_SQL: {
			if (this.getDEModel().isNoViewMode()) {
				IDEDataQuery iDEDataQuery = this.getDEModel().getDefaultDEDataQuery();
				if (iDEDataQuery == null) {
					throw new Exception("实体没有指定默认查询");
				}

				DEDataSetFetchContext deDataSetFetchContext = new DEDataSetFetchContext(null);
				deDataSetFetchContext.setFetchTotalRow(false);
				deDataSetFetchContext.setPageSize(1);
				deDataSetFetchContext.setPaging(false);
				deDataSetFetchContext.setStartRow(0);

				if (this.getDEModel().getKeyDEField().isPhisicalDEField() || this.getDEModel().getUnionKeyValueDEFields() == null) {
					if (true) {
						DEDataSetCond deDataSetCondImpl = new DEDataSetCond();
						deDataSetCondImpl.setCondType(IDEDataSetCond.CONDTYPE_DEFIELD);
						deDataSetCondImpl.setCondOp(ICondition.CONDOP_EQ);
						deDataSetCondImpl.setDEFName(this.getDEModel().getKeyDEField().getName());
						deDataSetCondImpl.setCondValue(DataObject.getStringValue(entity, this.getDEModel().getKeyDEField().getName(), null));
						deDataSetFetchContext.getConditionList().add(deDataSetCondImpl);
					}
				} else {
					java.util.Iterator<IDEField> deFields = this.getDEModel().getUnionKeyValueDEFields();
					while (deFields.hasNext()) {
						IDEField iDEField = deFields.next();
						DEDataSetCond deDataSetCondImpl = new DEDataSetCond();
						deDataSetCondImpl.setCondType(IDEDataSetCond.CONDTYPE_DEFIELD);
						deDataSetCondImpl.setCondOp(ICondition.CONDOP_EQ);
						deDataSetCondImpl.setDEFName(iDEField.getName());
						deDataSetCondImpl.setCondValue(DataObject.getStringValue(entity, iDEField.getName(), null));
						deDataSetFetchContext.getConditionList().add(deDataSetCondImpl);
					}
				}
				DBFetchResult dbFetchResult = this.getDAO(this.getDEModel().getStorageMode()).fetchDEDataQuery(deDataSetFetchContext, iDEDataQuery.getId(), false);
				if (dbFetchResult.isError()) {
					throw new ErrorException(Errors.INTERNALERROR, dbFetchResult.getErrorInfo());
				}
				if (dbFetchResult.getDataSet().getDataTableCount() == 0 || dbFetchResult.getDataSet().getDataTable(0).getCachedRowCount() == 0) {
					if (bTryMode) {
						callResult.setRetCode(Errors.INVALIDDATA);
						return callResult;
					}
					throw new ErrorException(Errors.INVALIDDATA);
				}
				DataObject.fromDataRow(entity, dbFetchResult.getDataSet().getDataTable(0).getCachedRow(0));
			} else {
				DBCallResult dbCallResult = getDAO(this.getDEModel().getStorageMode()).executeGetSql(null, entity, false);
				if (dbCallResult.isError()) {
					throw new ErrorException(Errors.INTERNALERROR, dbCallResult.getErrorInfo());
				}

				if (dbCallResult.isOk()) {
					dbCallResult.getDataSet().cacheDataRow();
				}

				if (dbCallResult.getDataSet().getDataTableCount() == 0 || dbCallResult.getDataSet().getDataTable(0).getCachedRowCount() == 0) {
					if (bTryMode) {
						callResult.setRetCode(Errors.INVALIDDATA);
						return callResult;
					}
					throw new ErrorException(Errors.INVALIDDATA);
				}
				DataObject.fromDataRow(entity, dbCallResult.getDataSet().getDataTable(0).getCachedRow(0));
			}

			entity.setSessionFactory(getSessionFactory());
			entity.markFullEntity(true);
		}
			break;
		case IDataEntity.STORAGEMODE_NoSQL: {
			
			DEBAUitl.getData(this.getDEModel(), entity);
			
//			DBCallResult dbCallResult = getDAO(this.getDEModel().getStorageMode()).executeGetSql(null, entity, false);
//			if (dbCallResult.isError()) {
//				throw new ErrorException(Errors.INTERNALERROR, dbCallResult.getErrorInfo());
//			}
			entity.markFullEntity(true);
		}
			break;
		case IDataEntity.STORAGEMODE_SQLAndNoSQL: {
			throw new Exception("当前实体不支持混合存储");
		}
		default:
			throw new Exception(StringHelper.format("不支持的实体存储模式[%1$s]", getDEModel().getStorageMode()));
		}

		return callResult;
	}

	/**
	 * 内部获取（临时数据模式）
	 * 
	 * @param entity
	 * @param bTryMode
	 * @return
	 * @throws Exception
	 */
	protected CallResult internalGetTemp(ET entity, boolean bTryMode) throws Exception {
		CallResult callResult = new CallResult();
		if (this.getDEModel().isNoViewMode()) {
			IDEDataQuery iDEDataQuery = this.getDEModel().getDefaultDEDataQuery();
			if (iDEDataQuery == null) {
				throw new Exception("实体没有指定默认查询");
			}

			DEDataSetFetchContext deDataSetFetchContext = new DEDataSetFetchContext(null);
			deDataSetFetchContext.setFetchTotalRow(false);
			deDataSetFetchContext.setPageSize(1);
			deDataSetFetchContext.setPaging(false);
			deDataSetFetchContext.setStartRow(0);

			if (this.getDEModel().getKeyDEField().isPhisicalDEField() || this.getDEModel().getUnionKeyValueDEFields() == null) {
				if (true) {
					DEDataSetCond deDataSetCondImpl = new DEDataSetCond();
					deDataSetCondImpl.setCondType(IDEDataSetCond.CONDTYPE_DEFIELD);
					deDataSetCondImpl.setCondOp(ICondition.CONDOP_EQ);
					deDataSetCondImpl.setDEFName(this.getDEModel().getKeyDEField().getName());
					deDataSetCondImpl.setCondValue(DataObject.getStringValue(entity, this.getDEModel().getKeyDEField().getName(), null));
					deDataSetFetchContext.getConditionList().add(deDataSetCondImpl);
				}
			} else {
				java.util.Iterator<IDEField> deFields = this.getDEModel().getUnionKeyValueDEFields();
				while (deFields.hasNext()) {
					IDEField iDEField = deFields.next();
					DEDataSetCond deDataSetCondImpl = new DEDataSetCond();
					deDataSetCondImpl.setCondType(IDEDataSetCond.CONDTYPE_DEFIELD);
					deDataSetCondImpl.setCondOp(ICondition.CONDOP_EQ);
					deDataSetCondImpl.setDEFName(iDEField.getName());
					deDataSetCondImpl.setCondValue(DataObject.getStringValue(entity, iDEField.getName(), null));
					deDataSetFetchContext.getConditionList().add(deDataSetCondImpl);
				}
			}
			DBFetchResult dbFetchResult = this.getDAO().fetchDEDataQuery(deDataSetFetchContext, iDEDataQuery.getId(), true);
			if (dbFetchResult.isError()) {
				throw new ErrorException(Errors.INTERNALERROR, dbFetchResult.getErrorInfo());
			}
			if (dbFetchResult.getDataSet().getDataTableCount() == 0 || dbFetchResult.getDataSet().getDataTable(0).getCachedRowCount() == 0) {
				if (bTryMode) {
					callResult.setRetCode(Errors.INVALIDDATA);
					return callResult;
				}
				throw new ErrorException(Errors.INVALIDDATA);
			}
			DataObject.fromDataRow(entity, dbFetchResult.getDataSet().getDataTable(0).getCachedRow(0));
		} else {
			DBCallResult dbCallResult = getDAO().executeGetSql(null, entity, true);
			if (dbCallResult.isError()) {
				throw new ErrorException(Errors.INTERNALERROR, dbCallResult.getErrorInfo());
			}

			if (dbCallResult.isOk()) {
				dbCallResult.getDataSet().cacheDataRow();
			}

			if (dbCallResult.getDataSet().getDataTableCount() == 0 || dbCallResult.getDataSet().getDataTable(0).getCachedRowCount() == 0) {
				if (bTryMode) {
					callResult.setRetCode(Errors.INVALIDDATA);
					return callResult;
				}
				throw new ErrorException(Errors.INVALIDDATA);
			}
			DataObject.fromDataRow(entity, dbCallResult.getDataSet().getDataTable(0).getCachedRow(0));
		}
		entity.setSessionFactory(getSessionFactory());
		entity.markFullEntity(true);
		return callResult;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.service.IService#get(net.ibizsys.paas.entity.IEntity)
	 */
	@Override
	public void get(ET et2) throws Exception {
		get(et2, false);
	}

	/**
	 * 获取数据之后触发
	 * 
	 * @param et
	 * @throws Exception
	 */
	protected void onAfterGet(ET et) throws Exception {

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.service.IService#create(net.ibizsys.paas.entity.IEntity, boolean)
	 */
	@Override
	public void create(ET et, boolean bGet) throws Exception {
		et.setSessionFactory(this.getSessionFactory());
		final Object strSourceKey = et.get(SOURCEKEY);
		final IServicePlugin iServicePlugin = getPlugin();
		if(iServicePlugin!=null && iServicePlugin.doCreate(getService(), IServicePlugin.ACTIONPOS_ENTER,et,null)==PluginActionResult.Replace)
			return;
		
		this.onTestCreate(et);
		if (this.fillEntityKeyValue(et, false)) {
			// 外部指定主键
			int nCheckState = checkKey(et);
			switch (nCheckState) {
			case IService.CHECKKEYSTATE_DELETE:
				throw new ErrorException(Errors.DUPLICATEKEY,this.getLocalization(MSG_CHECKKEYSTATE_DELETE,StringHelper.format("数据已经被删除，无法再次建立")));
			case IService.CHECKKEYSTATE_EXIST:
				throw new ErrorException(Errors.DUPLICATEKEY, this.getLocalization(MSG_CHECKKEYSTATE_EXIST,StringHelper.format("数据已经存在，无法再次建立")));
			default:
				break;
			}
		}

		final ET et2 = et;
		final boolean bGet2 = bGet || this.isNeedUpdateParent();

		this.doServiceWork(new IServiceWork() {
			@Override
			public void execute(ITransaction iTransaction) throws Exception {
				setLast(et2, EMPTYLAST, true);
				writeBackParent(et2, true);
				fillEntityFullInfo(et2, true);
				
				if(iServicePlugin!=null)
					iServicePlugin.doCreate(getService(), IServicePlugin.ACTIONPOS_BEFOREBEFORE,et2,null);
				onBeforeCreate(et2);
				if(iServicePlugin!=null)
					iServicePlugin.doCreate(getService(), IServicePlugin.ACTIONPOS_AFTERBEFORE,et2,null);
				checkEntity(et2, true, false);
				
				if(iServicePlugin==null||iServicePlugin.doCreate(getService(), IServicePlugin.ACTIONPOS_ACTION,et2,null)!=PluginActionResult.Replace)
					internalCreate(et2);
				if (bGet2) {
					internalGet(et2, false);
				}
				if (!StringHelper.isNullOrEmpty(strSourceKey)) {
					copyDetails(et2, strSourceKey);
				}
				if (isNeedUpdateParent()) {
					updateParent(et2);
				}
				ET et3 = et2;
				if (getDEModel().isEnableAudit() || (getDEModel().getDataChangeLogMode() != IDataEntity.DATACHGLOG_NONE)) {
					if (!bGet2) {
						et3 = getDEModel().createEntity();
						et2.copyTo(et3, true);
						internalGet(et3, false);
					}
				}
				if (getDEModel().isEnableAudit()) {
					getDEModel().getDEDataAccMgr().audit(null, getWebContext(), et3, null, DataAccessActions.CREATE);
				}
				syncEntity(et2, false);
				logDataChanged(IService.DATACHGEVENT_INSERT, et3);
				
				if(iServicePlugin!=null)
					iServicePlugin.doCreate(getService(), IServicePlugin.ACTIONPOS_BEFOREAFTER,et2,null);
				onAfterCreate(et2);
				if(iServicePlugin!=null)
					iServicePlugin.doCreate(getService(), IServicePlugin.ACTIONPOS_AFTERAFTER,et2,null);
			}
		});
		
		if(iServicePlugin!=null)
			iServicePlugin.doCreate(getService(), IServicePlugin.ACTIONPOS_LEAVE,et2,null);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.service.IService#create(net.ibizsys.paas.entity.IEntity)
	 */
	@Override
	public void create(ET et) throws Exception {
		create(et, true);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.service.IService#save(net.ibizsys.paas.entity.IEntity)
	 */
	@Override
	public void save(ET et) throws Exception {
		save(et, SAVEMODE_ALL,true);
	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.service.IService#save(net.ibizsys.paas.entity.IEntity, int)
	 */
	@Override
	public void save(ET et, int nSaveMode) throws Exception {
		save(et,nSaveMode,true);
	}

	/* (non-Javadoc)
	 * @see net.ibizsys.paas.service.IService#save(net.ibizsys.paas.entity.IEntity, boolean)
	 */
	@Override
	public void save(ET et, boolean bGet) throws Exception {
		save(et,SAVEMODE_ALL,bGet);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.service.IService#save(net.ibizsys.paas.entity.IEntity, int,boolean)
	 */
	@Override
	public void save(ET et, int nSaveMode,boolean bGet) throws Exception {
		int nKeyState = checkKey(et);
		if (nKeyState == CHECKKEYSTATE_OK) {
			if ((nSaveMode & SAVEMODE_CREATEONLY) > 0) this.create(et,bGet);
			return;
		}

		if (nKeyState == CHECKKEYSTATE_EXIST) {
			if ((nSaveMode & SAVEMODE_UPDATEONLY) > 0) this.update(et,bGet);
			return;
		}

		throw new Exception(this.getLocalization(MSG_SAVE_DATADELETE , StringHelper.format("数据已经被逻辑删除，无法保存")));
	}

	/**
	 * 内部更新（临时数据模式）
	 * 
	 * @param entity
	 * @throws Exception
	 */
	protected void internalCreateTemp(ET entity) throws Exception {
		DBCallResult dbCallResult = getDAO().executeCreateSql(null, entity, true);
		if (dbCallResult.isError()) {
			throw new ErrorException(Errors.INTERNALERROR, dbCallResult.getErrorInfo());
		}

	}

	/**
	 * 内部建立数据
	 * 
	 * @param entity
	 * @throws Exception
	 */
	protected void internalCreate(ET entity) throws Exception {
		switch (getDEModel().getStorageMode()) {
		case IDataEntity.STORAGEMODE_NONE:
			throw new Exception("当前实体不支持存储");
		case IDataEntity.STORAGEMODE_SQL:{
			DBCallResult dbCallResult = getDAO(this.getDEModel().getStorageMode()).executeCreateSql(null, entity, false);
			if (dbCallResult.isError()) {
				throw new ErrorException(Errors.INTERNALERROR, dbCallResult.getErrorInfo());
			}
		}
			break;
		case IDataEntity.STORAGEMODE_NoSQL: {
			
			DEBAUitl.syncData(this.getDEModel(), entity);

		}
			break;
		case IDataEntity.STORAGEMODE_SQLAndNoSQL: {
			throw new Exception("当前实体不支持混合存储");
		}
		default:
			throw new Exception(StringHelper.format("不支持的实体存储模式[%1$s]", getDEModel().getStorageMode()));
		}
	}

	/**
	 * 判断是否可以建立数据
	 * 
	 * @param et
	 * @throws Exception
	 */
	protected void onTestCreate(ET et) throws Exception {

	}

	/**
	 * 建立数据之前触发
	 * 
	 * @param et
	 * @throws Exception
	 */
	protected void onBeforeCreate(ET et) throws Exception {
		executeActionLogics(ACTION_CREATE, LOGICATTACHMODE_BEFORE, et);
	}

	/**
	 * 建立数据之后触发
	 * 
	 * @param et
	 * @throws Exception
	 */
	protected void onAfterCreate(ET et) throws Exception {
		executeActionLogics(ACTION_CREATE, LOGICATTACHMODE_AFTER, et);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.service.IService#update(net.ibizsys.paas.entity.IEntity, boolean)
	 */
	@Override
	public void update(ET entity, boolean bGet) throws Exception {
		final ET et = entity;
		final boolean bGet2 = bGet || this.isNeedUpdateParent();
		et.setSessionFactory(this.getSessionFactory());

		final IServicePlugin iServicePlugin = getPlugin();
		if(iServicePlugin!=null && iServicePlugin.doUpdate(getService(), IServicePlugin.ACTIONPOS_ENTER,et,null)==PluginActionResult.Replace)
			return;
		
		
		if (et.get(this.getDEModel().getKeyDEField().getName()) == null) {
			if (!this.fillEntityKeyValue(et, false)) {
				throw new ErrorException(Errors.INVALIDDATAKEYS);
			}
		}

		this.onTestUpdate(et);

		log.debug("开始[update]作业");
		this.doServiceWork(new IServiceWork() {
			@Override
			public void execute(ITransaction iTransaction) throws Exception {
				if (isPrepareLastForUpdate()) {
					ET last = getLast(et);
				}
				updateTestNewOldData(et);
				writeBackParent(et, false);
				fillEntityFullInfo(et, false);
				
				if(iServicePlugin!=null)
					iServicePlugin.doUpdate(getService(), IServicePlugin.ACTIONPOS_BEFOREBEFORE,et,null);
				onBeforeUpdate(et);
				if(iServicePlugin!=null)
					iServicePlugin.doUpdate(getService(), IServicePlugin.ACTIONPOS_AFTERBEFORE,et,null);
				
				
				
				checkEntity(et, false, false);
				setLast(et, INVALIDLAST, false);
				
				if(iServicePlugin==null||iServicePlugin.doUpdate(getService(), IServicePlugin.ACTIONPOS_ACTION,et,null)!=PluginActionResult.Replace)
					internalUpdate(et);
				if (bGet2) {
					internalGet(et, false);
				}

				if (isNeedUpdateParent()) {
					updateParent(et);
				}
				ET et3 = et;
				if (getDEModel().isEnableAudit() || (getDEModel().getDataChangeLogMode() != IDataEntity.DATACHGLOG_NONE)) {

					if (!bGet2) {
						et3 = getDEModel().createEntity();
						et.copyTo(et3, true);
						internalGet(et3, false);
					}
				}
				if (getDEModel().isEnableAudit()) {
					getDEModel().getDEDataAccMgr().audit(null, getWebContext(), et3, getLast(et), DataAccessActions.UPDATE);
				}

				syncEntity(et, false);
				logDataChanged(IService.DATACHGEVENT_UPDATE, et3);
				
				if(iServicePlugin!=null)
					iServicePlugin.doUpdate(getService(), IServicePlugin.ACTIONPOS_BEFOREAFTER,et,null);
				onAfterUpdate(et);
				if(iServicePlugin!=null)
					iServicePlugin.doUpdate(getService(), IServicePlugin.ACTIONPOS_AFTERAFTER,et,null);
				
				
			}
		});
		
		if(iServicePlugin!=null)
			iServicePlugin.doUpdate(getService(), IServicePlugin.ACTIONPOS_LEAVE,et,null);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.service.IService#sysUpdate(net.ibizsys.paas.entity.IEntity, boolean)
	 */
	@Override
	public void sysUpdate(ET entity, boolean bGet) throws Exception {
		final ET et = entity;
		final boolean bGet2 = bGet || this.isNeedUpdateParent();

		et.setSessionFactory(this.getSessionFactory());
		if (et.get(this.getDEModel().getKeyDEField().getName()) == null) {
			if (!this.fillEntityKeyValue(et, false)) {
				throw new ErrorException(Errors.INVALIDDATAKEYS);
			}
		}

		this.onTestUpdate(et);

		log.debug("开始[sysupdate]作业");
		this.doServiceWork(new IServiceWork() {
			@Override
			public void execute(ITransaction iTransaction) throws Exception {
				writeBackParent(et, false);
				fillEntityFullInfo(et, false);
				checkEntity(et, false, false);
				internalSysUpdate(et);
				if (bGet2) {
					internalGet(et, false);
				}
				if (isNeedUpdateParent()) {
					updateParent(et);
				}
				syncEntity(et, false);
			}
		});
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.service.IService#update(net.ibizsys.paas.entity.IEntity)
	 */
	@Override
	public void update(ET entity) throws Exception {
		update(entity, true);
	}

	/**
	 * 是否为更新准备最后一次数据，优化操作
	 * 
	 * @return
	 */
	protected boolean isPrepareLastForUpdate() {
		// return false;
		return this.getDEModel().isEnableAudit();
	}

	/**
	 * 是否为删除准备最后一次数据，优化操作
	 * 
	 * @return
	 */
	protected boolean isPrepareLastForRemove() {
		// return false;
		return this.getDEModel().isEnableAudit();
	}

	/**
	 * 测试新旧数据（判断新旧数据的最后更新时间是否一致）
	 * 
	 * @param entity
	 * @throws Exception
	 */
	protected void updateTestNewOldData(ET entity) throws Exception {
		if (!entity.isNull(IFormItem.LASTUPDATEDATE)) {
			ET lastEntity = getLast(entity);
			IDEField updateDEField = this.getDEModel().getUpdateDateDEField();
			if (updateDEField != null) {
				String strFieldName = updateDEField.getName();
				if (lastEntity.contains(strFieldName)) {
					java.sql.Timestamp curDate = DataObject.getTimestampValue(entity, IFormItem.LASTUPDATEDATE, null);
					java.sql.Timestamp lastDate = DataObject.getTimestampValue(lastEntity, strFieldName, null);
					if (curDate != null && lastDate != null) {
						String strCurDateStr = StringHelper.format("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS", curDate);
						String strLastDateStr = StringHelper.format("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS", lastDate);
						// 判断是否一致
						if (StringHelper.compare(strCurDateStr, strLastDateStr, true) != 0) {
							throw new ErrorException(Errors.DATANOTMATCH);
						}
					}
				}
			}
		}
	}

	/**
	 * 内部更新操作
	 * 
	 * @param entity
	 * @throws Exception
	 */
	protected void internalUpdate(ET entity) throws Exception {
		switch (getDEModel().getStorageMode()) {
		case IDataEntity.STORAGEMODE_NONE:
			throw new Exception("当前实体不支持存储");
		case IDataEntity.STORAGEMODE_SQL:{
			DBCallResult dbCallResult = getDAO(this.getDEModel().getStorageMode()).executeUpdateSql(null, entity, false);
			if (dbCallResult.isError()) {
				throw new ErrorException(Errors.INTERNALERROR, dbCallResult.getErrorInfo());
			}
		}
			break;
		case IDataEntity.STORAGEMODE_NoSQL: {
			
			DEBAUitl.syncData(this.getDEModel(), entity);

		}
			break;
		case IDataEntity.STORAGEMODE_SQLAndNoSQL: {
			throw new Exception("当前实体不支持混合存储");
		}
		default:
			throw new Exception(StringHelper.format("不支持的实体存储模式[%1$s]", getDEModel().getStorageMode()));
		}

	}

	/**
	 * 内部系统更新操作
	 * 
	 * @param entity
	 * @throws Exception
	 */
	protected void internalSysUpdate(ET entity) throws Exception {
		switch (getDEModel().getStorageMode()) {
		case IDataEntity.STORAGEMODE_NONE:
			throw new Exception("当前实体不支持存储");
		case IDataEntity.STORAGEMODE_SQL:
		case IDataEntity.STORAGEMODE_NoSQL: {
			DBCallResult dbCallResult = getDAO(this.getDEModel().getStorageMode()).executeSysUpdateSql(null, entity, false);
			if (dbCallResult.isError()) {
				throw new ErrorException(Errors.INTERNALERROR, dbCallResult.getErrorInfo());
			}
		}
			break;
		case IDataEntity.STORAGEMODE_SQLAndNoSQL: {
			throw new Exception("当前实体不支持混合存储");
		}
		default:
			throw new Exception(StringHelper.format("不支持的实体存储模式[%1$s]", getDEModel().getStorageMode()));
		}
	}

	/**
	 * 内部系统更新操作
	 * 
	 * @param entity
	 * @throws Exception
	 */
	protected void internalSysUpdateTemp(ET entity) throws Exception {
		DBCallResult dbCallResult = getDAO().executeSysUpdateSql(null, entity, true);
		if (dbCallResult.isError()) {
			throw new ErrorException(Errors.INTERNALERROR, dbCallResult.getErrorInfo());
		}
	}

	/**
	 * 判断是否可以更新数据
	 * 
	 * @param et
	 * @throws Exception
	 */
	protected void onTestUpdate(ET et) throws Exception {

	}

	/**
	 * 更新数据之前触发
	 * 
	 * @param et
	 * @throws Exception
	 */
	protected void onBeforeUpdate(ET et) throws Exception {
		executeActionLogics(ACTION_UPDATE, LOGICATTACHMODE_BEFORE, et);
	}

	/**
	 * 更新数据之后触发
	 * 
	 * @param et
	 * @throws Exception
	 */
	protected void onAfterUpdate(ET et) throws Exception {
		executeActionLogics(ACTION_UPDATE, LOGICATTACHMODE_AFTER, et);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.service.IService#remove(net.ibizsys.paas.entity.IEntity)
	 */
	@Override
	public void remove(ET entity) throws Exception {
		final ET et = entity;
		et.setSessionFactory(this.getSessionFactory());
		
		final IServicePlugin iServicePlugin = getPlugin();
		if(iServicePlugin!=null && iServicePlugin.doRemove(getService(), IServicePlugin.ACTIONPOS_ENTER,et,null)==PluginActionResult.Replace)
			return;
		
		log.debug("开始[remove]作业");
		this.doServiceWork(new IServiceWork() {
			@Override
			public void execute(ITransaction iTransaction) throws Exception {
				// 判断当前数据是否在删除会话中
				Object objKeyValue = et.get(getDEModel().getKeyDEField().getName());
				if (!ActionSessionManager.getCurrentSession().registerRecursion(ACTION_REMOVE, getDEModel().getId(), objKeyValue)) {
					// 已经在删除会话中，取消
					return;
				}
				ET last = null;
				if (isPrepareLastForRemove() || isNeedUpdateParent()) {
					last = getLast(et);
				}

				if(iServicePlugin!=null)
					iServicePlugin.doRemove(getService(), IServicePlugin.ACTIONPOS_BEFOREBEFORE,et,null);
				
				onBeforeRemove(et);
				
				if(iServicePlugin!=null)
					iServicePlugin.doRemove(getService(), IServicePlugin.ACTIONPOS_AFTERBEFORE,et,null);
				
				syncEntity(et, true);

				setLast(et, INVALIDLAST, false);
				
				if(iServicePlugin == null || iServicePlugin.doRemove(getService(), IServicePlugin.ACTIONPOS_ACTION,et,null)!=PluginActionResult.Replace)
					internalRemove(et);
				updateParent(last);
				if (getDEModel().isEnableAudit()) {
					getDEModel().getDEDataAccMgr().audit(null, getWebContext(), getLast(et), null, DataAccessActions.DELETE);
				}

				logDataChanged(IService.DATACHGEVENT_DELETE, et);
				
				if(iServicePlugin!=null)
					iServicePlugin.doRemove(getService(), IServicePlugin.ACTIONPOS_BEFOREAFTER,et,null);
				onAfterRemove(et);
				if(iServicePlugin!=null)
					iServicePlugin.doRemove(getService(), IServicePlugin.ACTIONPOS_AFTERAFTER,et,null);
			}

		});
		
		if(iServicePlugin!=null)
			iServicePlugin.doRemove(getService(), IServicePlugin.ACTIONPOS_LEAVE,et,null);
	}

	/**
	 * 内部删除数据
	 * 
	 * @param et
	 * @throws Exception
	 */
	protected void internalRemove(ET et) throws Exception {
		switch (getDEModel().getStorageMode()) {
		case IDataEntity.STORAGEMODE_NONE:
			throw new Exception("当前实体不支持存储");
		case IDataEntity.STORAGEMODE_SQL: {
			DBCallResult dbCallResult = getDAO(this.getDEModel().getStorageMode()).executeRemoveSql(null, et, false);
			if (dbCallResult.isError()) {
				throw new ErrorException(Errors.INTERNALERROR, dbCallResult.getErrorInfo());
			}
		}
			break;
		case IDataEntity.STORAGEMODE_NoSQL: {
			DEBAUitl.removeData(this.getDEModel(), et);
		}
			break;
		case IDataEntity.STORAGEMODE_SQLAndNoSQL: {
			throw new Exception("当前实体不支持混合存储");
		}
		default:
			throw new Exception(StringHelper.format("不支持的实体存储模式[%1$s]", getDEModel().getStorageMode()));
		}
	}

	/**
	 * 删除数据之前触发
	 * 
	 * @param et
	 * @throws Exception
	 */
	protected void onBeforeRemove(ET et) throws Exception {
		executeActionLogics(ACTION_REMOVE, LOGICATTACHMODE_BEFORE, et);
	}

	/**
	 * 删除数据之后触发
	 * 
	 * @param et
	 * @throws Exception
	 */
	protected void onAfterRemove(ET et) throws Exception {
		executeActionLogics(ACTION_REMOVE, LOGICATTACHMODE_AFTER, et);
	}

	/**
	 * 删除数据之前触发
	 * 
	 * @param list 删除数组集合
	 * @throws Exception
	 */
	protected void onBeforeRemove(ArrayList<ET> list) throws Exception {

	}

	/**
	 * 删除数据之后触发
	 * 
	 * @param et
	 * @throws Exception
	 */
	protected void onAfterRemove(ArrayList<ET> list) throws Exception {

	}

	/**
	 * 内部删除数据
	 * 
	 * @param list
	 * @throws Exception
	 */
	protected void internalRemove(ArrayList<ET> list) throws Exception {
		for (ET et : list) {
			this.remove(et);
		}
	}

	/**
	 * 通过查询删除
	 *
	 * @param iSelectCond 查询条件
	 * @param bDirect 是否直接删除
	 * @throws Exception
	 */
	@Override
	public void remove(ISelectCond iSelectCond, boolean bDirect) throws Exception {
		if (bDirect) {
			log.warn("没有实现直接删除语句");
			ArrayList<ET> list = this.select(iSelectCond);
			this.remove(list);
		} else {
			ArrayList<ET> list = this.select(iSelectCond);
			this.remove(list);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.service.IService#remove(java.util.ArrayList)
	 */
	@Override
	public void remove(ArrayList<ET> entityList) throws Exception {
		final ArrayList<ET> list = entityList;

		log.debug("开始[remove]作业");
		this.doServiceWork(new IServiceWork() {
			@Override
			public void execute(ITransaction iTransaction) throws Exception {
				onBeforeRemove(list);
				internalRemove(list);
				onAfterRemove(list);
			}
		});
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.service.IService#select(net.ibizsys.paas.entity.IEntity, boolean)
	 */
	@Override
	public boolean select(ET et, boolean bTryMode) throws Exception {
		SelectCond selectCond = new SelectCond();
		et.copyTo(selectCond, false);
		selectCond.setFetchFirst(true);
		ArrayList<ET> list = this.select(selectCond);
		if (list.size() == 0) {
			if (bTryMode) return false;
			throw new ErrorException(Errors.INVALIDDATA);
		}
		list.get(0).copyTo(et, true);
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.service.IService#select(net.ibizsys.paas.db.ISelectCond)
	 */
	@Override
	public ArrayList<ET> select(ISelectCond iSelectCond2) throws Exception {
		final ISelectCond iSelectCond = iSelectCond2;
		final ISelectContext iSelectContext = ((iSelectCond instanceof ISelectContext)?((ISelectContext)iSelectCond2):null);
		// final long nBeginTime = java.lang.System.currentTimeMillis();
		final ArrayList<ET> list = new ArrayList<ET>();
		this.doServiceWork(new IServiceWork() {
			@Override
			public void execute(ITransaction iTransaction) throws Exception {
				DBCallResult dbCallResult = null;
				if(iSelectContext!=null && !StringHelper.isNullOrEmpty(iSelectContext.getDEDataQueryName()))
					dbCallResult = getDAO().fetchDEDataQuery(iSelectContext, false);
				else
					dbCallResult = getDAO().executeSelectSql(null, iSelectCond, false);
				if (dbCallResult.isError()) {
					throw new ErrorException(Errors.INTERNALERROR, dbCallResult.getErrorInfo());
				}

				try {
					if (!iSelectCond.isFetchFirst()) {
						IDataTable iDataTable = dbCallResult.getDataSet().getDataTable(0);
						iDataTable.cacheRows(iSelectCond.getMaxRowCount());
						int nRows = iDataTable.getCachedRowCount();
						for (int i = 0; i < nRows; i++) {
							IDataRow iDataRow = iDataTable.getCachedRow(i);
							ET et = getDEModel().createEntity();
							DataObject.fromDataRow(et, iDataRow);
							et.setSessionFactory(getSessionFactory());
							et.markFullEntity(true);
							list.add(et);
						}
						dbCallResult.getDataSet().close();
					} else {
						IDataTable iDataTable = dbCallResult.getDataSet().getDataTable(0);
						iDataTable.cacheRows(1);
						int nRows = iDataTable.getCachedRowCount();
						for (int i = 0; i < nRows; i++) {
							IDataRow iDataRow = iDataTable.getCachedRow(i);
							ET et = getDEModel().createEntity();
							DataObject.fromDataRow(et, iDataRow);
							et.setSessionFactory(getSessionFactory());
							et.markFullEntity(true);
							list.add(et);
							break;
						}
						dbCallResult.getDataSet().close();
					}
				} catch (Exception ex) {
					log.error(StringHelper.format("查询数据发生异常，%1$s", ex.getMessage()), ex);
					dbCallResult.getDataSet().close();
				}

			}
		});

		return list;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.service.IService#selectTemp(net.ibizsys.paas.db.ISelectCond)
	 */
	@Override
	public ArrayList<ET> selectTemp(ISelectCond iSelectCond2) throws Exception {
		final ISelectCond iSelectCond = iSelectCond2;
		final ISelectContext iSelectContext = ((iSelectCond instanceof ISelectContext)?((ISelectContext)iSelectCond2):null);
		// final long nBeginTime = java.lang.System.currentTimeMillis();
		final ArrayList<ET> list = new ArrayList<ET>();
		this.doServiceWork(new IServiceWork() {
			@Override
			public void execute(ITransaction iTransaction) throws Exception {
				DBCallResult dbCallResult = null;
				if(iSelectContext!=null && !StringHelper.isNullOrEmpty(iSelectContext.getDEDataQueryName()))
					dbCallResult = getDAO().fetchDEDataQuery(iSelectContext, true);
				else
					dbCallResult = getDAO().executeSelectSql(null, iSelectCond, true);
				
				if (dbCallResult.isError()) {
					throw new ErrorException(Errors.INTERNALERROR, dbCallResult.getErrorInfo());
				}

				try {
					if (dbCallResult.isOk()) {
						dbCallResult.getDataSet().cacheDataRow();
					}

					IDataTable iDataTable = dbCallResult.getDataSet().getDataTable(0);
					int nRows = iDataTable.getCachedRowCount();
					for (int i = 0; i < nRows; i++) {
						IDataRow iDataRow = iDataTable.getCachedRow(i);
						ET et = getDEModel().createEntity();
						DataObject.fromDataRow(et, iDataRow);
						et.setSessionFactory(getSessionFactory());
						et.markFullEntity(true);
						list.add(et);
					}
					dbCallResult.getDataSet().close();
				} catch (Exception ex) {
					log.error(StringHelper.format("查询数据发生异常，%1$s", ex.getMessage()), ex);
					dbCallResult.getDataSet().close();
				}
			}
		});

		return list;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.service.IService#selectTemp(net.ibizsys.paas.entity.IEntity, boolean)
	 */
	@Override
	public boolean selectTemp(ET et, boolean bTryMode) throws Exception {
		SelectCond selectCond = new SelectCond();
		et.copyTo(selectCond, false);
		selectCond.setFetchFirst(true);
		ArrayList<ET> list = this.selectTemp(selectCond);
		if (list.size() == 0) {
			if (bTryMode) return false;
			throw new ErrorException(Errors.INVALIDDATA);
		}
		list.get(0).copyTo(et, true);
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.service.IService#getDraft(net.ibizsys.paas.entity.IEntity)
	 */
	@Override
	public void getDraft(ET et) throws Exception {
		et.setSessionFactory(this.getSessionFactory());
		long nBeginTime = java.lang.System.currentTimeMillis();
		onBeforeGetDraft(et);
		fillParentInfo(et);
		this.onAfterGetDraft(et);
		long nTime = java.lang.System.currentTimeMillis() - nBeginTime;
		log.debug(StringHelper.format("getDraft 耗时[%1$s]", nTime));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.service.IService#getDraftFrom(net.ibizsys.paas.entity.IEntity)
	 */
	@Override
	public void getDraftFrom(ET et) throws Exception {
		et.setSessionFactory(this.getSessionFactory());
		long nBeginTime = java.lang.System.currentTimeMillis();
		this.get(et);
		this.removeEntityUncopyValues(et, false);
		this.onBeforeGetDraft(et);
		this.onAfterGetDraft(et);
		long nTime = java.lang.System.currentTimeMillis() - nBeginTime;
		log.debug(StringHelper.format("getDraftFrom 耗时[%1$s]", nTime));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.service.IService#getDraftTemp(net.ibizsys.paas.entity.IEntity)
	 */
	@Override
	public void getDraftTemp(ET et) throws Exception {
		et.setSessionFactory(this.getSessionFactory());
		long nBeginTime = java.lang.System.currentTimeMillis();
		fillParentInfo(et);
		this.fillEntityKeyValue(et, true);
		if (this.checkKeyTemp(et) == CHECKKEYSTATE_EXIST) {
			this.getTemp(et);
			return;
		}

		long nTime = java.lang.System.currentTimeMillis() - nBeginTime;
		final ET et2 = et;
		this.doServiceWork(new IServiceWork() {
			@Override
			public void execute(ITransaction iTransaction) throws Exception {
				EntityBase.setDraft(et2, true);
				onBeforeGetDraftTemp(et2);
				internalCreateTemp(et2);
				onAfterGetDraftTemp(et2);
			}
		});

		log.debug(StringHelper.format("getDraftTemp 耗时[%1$s]", nTime));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.service.IService#getDraftTempFrom(net.ibizsys.paas.entity.IEntity)
	 */
	@Override
	public void getDraftTempFrom(ET et) throws Exception {
		et.setSessionFactory(this.getSessionFactory());
		final ET et2 = et;
		this.doServiceWork(new IServiceWork() {
			@Override
			public void execute(ITransaction iTransaction) throws Exception {
				CloneSession cloneSession = CloneSessionManager.getCurrentSession();
				cloneSession.setFromSource(true);
				cloneSession.setSourceObject(et2);
				getTempMajor(et2);
			}
		});
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.service.IService#getDraftTempMajorFrom(net.ibizsys.paas.entity.IEntity)
	 */
	@Override
	public void getDraftTempMajorFrom(ET et) throws Exception {
		final ET et2 = et;
		this.doServiceWork(new IServiceWork() {
			@Override
			public void execute(ITransaction iTransaction) throws Exception {
				CloneSession cloneSession = CloneSessionManager.getCurrentSession();
				cloneSession.setFromSource(true);
				cloneSession.setSourceObject(et2);
				getTempMajor(et2);
			}
		});

	}

	/**
	 * 获取草稿数据之前触发
	 * 
	 * @param et
	 * @throws Exception
	 */
	protected void onBeforeGetDraft(ET et) throws Exception {
		executeActionLogics(ACTION_GETDRAFT, LOGICATTACHMODE_BEFORE, et);
	}

	/**
	 * 获取草稿数据之后触发
	 * 
	 * @param et
	 * @throws Exception
	 */
	protected void onAfterGetDraft(ET et) throws Exception {
		executeActionLogics(ACTION_GETDRAFT, LOGICATTACHMODE_AFTER, et);
	}

	/**
	 * 获取草稿数据之后触发（临时数据模式）
	 * 
	 * @param et
	 * @throws Exception
	 */
	protected void onBeforeGetDraftTemp(ET et) throws Exception {

	}

	/**
	 * 获取草稿数据之后触发（临时数据模式）
	 * 
	 * @param et
	 * @throws Exception
	 */
	protected void onAfterGetDraftTemp(ET et) throws Exception {

	}

	/**
	 * 填充父数据信息
	 * 
	 * @param et
	 * @throws Exception
	 */
	protected void fillParentInfo(ET et) throws Exception {
		// 判断有无父数据
		String strParentType = WebContext.getParentType(this.getWebContext());
		if (StringHelper.isNullOrEmpty(strParentType)) return;

		String strTypeParam = "";
		if (StringHelper.compare(strParentType, WebContext.PARAM_PARENTTYPE_DER1N, true) == 0) {
			strTypeParam = WebContext.getDER1NId(this.getWebContext());
		} else if (StringHelper.compare(strParentType, WebContext.PARAM_PARENTTYPE_SYSDER1N, true) == 0) {
			strTypeParam = WebContext.getDER1NId(this.getWebContext());
		}

		String strParentKey = WebContext.getParentKey(this.getWebContext());
		if (StringHelper.isNullOrEmpty(strParentKey)) return;

		onFillParentInfo(et, strParentType, strTypeParam, strParentKey);
	}

	/**
	 * 填充父信息 触发
	 * 
	 * @param et
	 * @param strParentType
	 * @param strTypeParam
	 * @param strParentKey
	 * @throws Exception
	 */
	protected void onFillParentInfo(ET et, String strParentType, String strTypeParam, String strParentKey) throws Exception {

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.service.IService#fillEntityKeyValue(net.ibizsys.paas.entity.IEntity, boolean)
	 */
	public boolean fillEntityKeyValue(ET et, boolean bTempMode) throws Exception {
		String strKeyFieldName = this.getDEModel().getKeyDEField().getName();
		Object objValue = et.get(strKeyFieldName);
		if (objValue != null) return true;

		if (bTempMode) {
			et.set(this.getDEModel().getKeyDEField().getName(), TEMPKEY + KeyValueHelper.genGuidEx());
			return false;
		}

		boolean bRet = onFillEntityKeyValue(et, bTempMode);
		if (bTempMode) {
			String strOriKey = et.get(strKeyFieldName).toString();
			if (strOriKey.indexOf(TEMPKEY) != 0) {
				et.set(strKeyFieldName, TEMPKEY + strOriKey);
			}
		}
		return bRet;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.service.IService#fillEntityKeyValue(net.ibizsys.paas.entity.IEntity)
	 */
	@Override
	public boolean fillEntityKeyValue(ET et) throws Exception {
		return fillEntityKeyValue(et, false);
	}

	/**
	 * 填充主键触发
	 * 
	 * @param et
	 * @param bTempMode
	 * @return
	 * @throws Exception
	 */
	protected boolean onFillEntityKeyValue(ET et, boolean bTempMode) throws Exception {
		et.set(this.getDEModel().getKeyDEField().getName(), KeyValueHelper.genGuidEx());
		return false;
	}

	/**
	 * 填充实体的完整信息，比如外键数据的物理化字段等
	 * 
	 * @param et
	 * @param bCreate 是否为新建模式
	 * @throws Exception
	 */
	protected void fillEntityFullInfo(ET et, boolean bCreate) throws Exception {
		if (!bCreate) {

		}
		onFillEntityFullInfo(et, bCreate);
	}

	/**
	 * 填充实体的完整信息触发
	 * 
	 * @param et
	 * @param bCreate
	 * @return
	 * @throws Exception
	 */
	protected void onFillEntityFullInfo(ET et, boolean bCreate) throws Exception {

	}

	/**
	 * 写回父数据
	 * 
	 * @param et
	 * @param bCreate
	 * @throws Exception
	 */
	protected void writeBackParent(ET et, boolean bCreate) throws Exception {
		onWriteBackParent(et, bCreate);
	}

	/**
	 * 写回父数据触发
	 * 
	 * @param et
	 * @param bCreate
	 * @return
	 * @throws Exception
	 */
	protected void onWriteBackParent(ET et, boolean bCreate) throws Exception {

	}

	/**
	 * 检查实体的值合法性
	 * 
	 * @param et
	 * @param bCreate 是否新建
	 * @param bTempMode 是否临时数据模式
	 * @throws Exception
	 */
	protected void checkEntity(ET et, boolean bCreate, boolean bTempMode) throws Exception {
		EntityError entityError = new EntityError();
		onCheckEntity(true, et, bCreate, bTempMode, entityError);
		if (entityError.hasError()) {
			// 转换错误信息
			convertEntityError(entityError);
			throw new EntityException(entityError);
		}
		onCheckEntity(false, et, bCreate, bTempMode, entityError);
		if (entityError.hasError()) {
			// 转换错误信息
			convertEntityError(entityError);
			throw new EntityException(entityError);
		}
	}

	/**
	 * 转换实体错误，放入逻辑名称或其它语言资源
	 * 
	 * @param entityError
	 * @throws Exception
	 */
	protected void convertEntityError(EntityError entityError) throws Exception {
		for (EntityFieldError entityFieldError : entityError.getEntityFieldErrorList()) {
			convertEntityFieldError(entityFieldError);
		}
	}

	/**
	 * 转换实体属性错误，放入逻辑名称或其它语言资源
	 * 
	 * @param entityFieldError
	 * @throws Exception
	 */
	protected void convertEntityFieldError(EntityFieldError entityFieldError) throws Exception {
		if ((!StringHelper.isNullOrEmpty(entityFieldError.getFieldName())) && StringHelper.isNullOrEmpty(entityFieldError.getFieldLogicName())) {
			// 获取当前的处理器
			ICtrlHandler iCtrlHandler = CtrlHandler.getCurrent();
			if (iCtrlHandler != null) {
				iCtrlHandler.convertEntityFieldError(entityFieldError);
			}
		}
		if ((!StringHelper.isNullOrEmpty(entityFieldError.getFieldName())) && StringHelper.isNullOrEmpty(entityFieldError.getFieldLogicName())) {
			IDEField iDEField = this.getDEModel().getDEField(entityFieldError.getFieldName(), true);
			if (iDEField != null) {
				entityFieldError.setFieldLogicName(iDEField.getLogicName());
			}
		}
	}

	/**
	 * 检查实体的值合法性触发
	 * 
	 * @param bBaseMode
	 * @param et
	 * @param bCreate
	 * @param bTempMode
	 * @param entityError
	 * @throws Exception
	 */
	protected void onCheckEntity(boolean bBaseMode, ET et, boolean bCreate, boolean bTempMode, EntityError entityError) throws Exception {

	}

	/**
	 * 执行服务作业,默认启用事物
	 * 
	 * @param iServiceWork
	 * @throws Exception
	 */
	protected void doServiceWork(IServiceWork iServiceWork) throws Exception {
		doServiceWork(-1, iServiceWork, true);
	}

	/**
	 * 执行服务作业
	 * 
	 * @param iServiceWork
	 * @param bTransaction 是否启用事物
	 * @throws Exception
	 */
	protected void doServiceWork(IServiceWork iServiceWork, boolean bTransaction) throws Exception {
		doServiceWork(-1, iServiceWork, bTransaction);
	}

	/**
	 * 执行服务作业
	 * 
	 * @param nMode
	 * @param iServiceWork
	 * @param bTransaction
	 * @throws Exception
	 */
	protected void doServiceWork(int nMode, IServiceWork iServiceWork, boolean bTransaction) throws Exception {
		long nBeginTime = java.lang.System.currentTimeMillis();

		boolean bOpenActionSession = (ActionSessionManager.getCurrentSession() == null);
		if (bOpenActionSession) {
			ActionSessionManager.openSession();
		}

		boolean bOpenCloneSession = (CloneSessionManager.getCurrentSession() == null);
		if (bOpenCloneSession) {
			CloneSessionManager.openSession().setOwner(getDEModel().getName());
		}

		try {
			SessionFactoryManager.addRef();
			if (bTransaction) {
				org.hibernate.Transaction curTransaction = SessionFactoryManager.getCurrentTransaction(this.getRealSessionFactory());
				iServiceWork.execute(new HibernateTransaction(curTransaction));
			} else {
				iServiceWork.execute(null);
			}

			SessionFactoryManager.releaseRef(true);
			if (bOpenActionSession) {
				ActionSessionManager.closeSession();
			}
			if (bOpenCloneSession) {
				CloneSessionManager.closeSession();
			}
		} catch (Exception ex) {
			String strMessage = ex.getMessage();
			if (ex.getCause() != null && ex.getCause() instanceof Exception) {
				Exception exception = (Exception) ex.getCause();
				strMessage = exception.getMessage();
			}
			log.error(StringHelper.format("实体[%1$s]doServiceWork发生异常，%2$s", this.getDEModel().getName(), strMessage), ex);
			SessionFactoryManager.releaseRef(false);

			if (bOpenActionSession) {
				ActionSessionManager.closeSession();
			}
			if (bOpenCloneSession) {
				CloneSessionManager.closeSession();
			}
			throw ex;
		}

		long nTime = java.lang.System.currentTimeMillis() - nBeginTime;
		log.debug(StringHelper.format("作业 耗时[%1$s]", nTime));
	}

	/**
	 * 执行数据集获取作业
	 * 
	 * @param iDEDataSetFetchContext
	 * @param strDEDataSetName
	 * @param bTempMode
	 * @return
	 * @throws Exception
	 */
	protected DBFetchResult doServiceFetchWork(IDEDataSetFetchContext iDEDataSetFetchContext, String strDEDataSetName, boolean bTempMode) throws Exception {
		long nBeginTime = java.lang.System.currentTimeMillis();
		try {
			switch (getDEModel().getStorageMode()) {
			case IDataEntity.STORAGEMODE_NONE:
				throw new Exception("当前实体不支持存储");
			case IDataEntity.STORAGEMODE_SQL: {
				SessionFactoryManager.addRef();
				if(!bTempMode){
					IDEDataSet iDEDataSet = this.getDEModel().getDEDataSet(strDEDataSetName);
					if (iDEDataSet instanceof IDEDataSetModel) {
						IDEDataSetModel iDEDataSetModel = (IDEDataSetModel) iDEDataSet;
						if (!iDEDataSetModel.isCustomDS() && iDEDataSetModel.isEnableDEDataRange()){
							iDEDataSetModel.fillDEDataSetFetchDataRange(this, this.getWebContext(), iDEDataSetFetchContext);
						}
					}
				}
				DBFetchResult dbFetchResult = getDAO(getDEModel().getStorageMode()).fetchDEDataSet(iDEDataSetFetchContext, strDEDataSetName, bTempMode);
				SessionFactoryManager.releaseRef(false);
				long nTime = java.lang.System.currentTimeMillis() - nBeginTime;
				log.debug(StringHelper.format("查询耗时[%1$s]", nTime));
				return dbFetchResult;
			}
			case IDataEntity.STORAGEMODE_NoSQL: {
				DBFetchResult dbFetchResult = getDAO(getDEModel().getStorageMode()).fetchDEDataSet(iDEDataSetFetchContext, strDEDataSetName, bTempMode);
				long nTime = java.lang.System.currentTimeMillis() - nBeginTime;
				log.debug(StringHelper.format("查询耗时[%1$s]", nTime));
				return dbFetchResult;
			}
			case IDataEntity.STORAGEMODE_SQLAndNoSQL: {
				throw new Exception("当前实体不支持混合存储");
			}
			default:
				throw new Exception(StringHelper.format("不支持的实体存储模式[%1$s]", getDEModel().getStorageMode()));
			}
		} catch (Exception ex) {
			log.error(StringHelper.format("实体[%1$s]doServiceFetchWork发生异常，%2$s", this.getDEModel().getName(), ex.getMessage()), ex);
			SessionFactoryManager.releaseRef(false);
			throw ex;
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.service.IService#getTemp(net.ibizsys.paas.entity.IEntity)
	 */
	@Override
	public void getTemp(ET et2) throws Exception {
		final ET et = et2;
		final long nBeginTime = java.lang.System.currentTimeMillis();
		this.doServiceWork(new IServiceWork() {
			@Override
			public void execute(ITransaction iTransaction) throws Exception {
				internalGetTemp(et, false);
				onAfterGetTemp(et);
				long nTime = java.lang.System.currentTimeMillis() - nBeginTime;
				log.debug(StringHelper.format("getTemp  耗时[%1$s]", nTime));
			}
		});

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.service.IService#getCache(net.ibizsys.paas.entity.IEntity)
	 */
	@Override
	public void getCache(ET et) throws Exception {
		this.get(et);
	}

	/**
	 * 设置实体操作之前数据
	 * 
	 * @param et
	 * @param last
	 * @param bReplace 是否替换
	 * @throws Exception
	 */
	protected void setLast(IEntity et, IEntity last, boolean bReplace) throws Exception {
		final IEntity curEntity = et;
		final IEntity lastEntity = last;
		final boolean bReplace2 = bReplace;
		this.doServiceWork(new IServiceWork() {
			@Override
			public void execute(ITransaction iTransaction) throws Exception {
				SessionFactorySession sessionFactorySession = SessionFactoryManager.getCurrentSFS(getSessionFactory());
				if (!bReplace2) {
					if (sessionFactorySession.getLastEntity(curEntity) != null) return;
				}
				sessionFactorySession.setLastEntity(curEntity, lastEntity);
			}
		}, false);
	}

	/**
	 * 获取实体操作之前数据
	 * 
	 * @param et
	 * @return
	 * @throws Exception
	 */
	protected ET getLast(IEntity et) throws Exception {
		return getLast(et, false);
	}

	/**
	 * 获取指定数据的最后一次数据
	 * 
	 * @param et
	 * @param bTry
	 * @return
	 * @throws Exception
	 */
	protected ET getLast(IEntity et, boolean bTry) throws Exception {
		final String strKey = DataObject.getStringValue(et, this.getDEModel().getKeyDEField().getName(), null);
		if (StringHelper.isNullOrEmpty(strKey)) return null;

		final IEntity curEntity = et;
		final CallResult callResult = new CallResult();
		final boolean bTry2 = bTry;
		this.doServiceWork(new IServiceWork() {
			@Override
			public void execute(ITransaction iTransaction) throws Exception {
				SessionFactorySession sessionFactorySession = SessionFactoryManager.getCurrentSFS(getSessionFactory());
				IEntity lastEntity2 = sessionFactorySession.getLastEntity(curEntity);
				if (lastEntity2 != null) {
					if (lastEntity2 == INVALIDLAST) {
						if (bTry2) return;
						throw new Exception(getLocalization(MSG_GETLAST_NOTCACHED , StringHelper.format("变更之前数据无效，没有在数据变更之前进行缓存")));
					}
					if (lastEntity2 != EMPTYLAST) {
						callResult.setUserObject(lastEntity2);
					}
					return;
				}

				ET lastEntity = getDEModel().createEntity();
				lastEntity.set(getDEModel().getKeyDEField().getName(), curEntity.get(getDEModel().getKeyDEField().getName()));
				if (strKey.indexOf(TEMPKEY) == 0) {
					getTemp(lastEntity);
				} else {
					getCache(lastEntity);
				}
				sessionFactorySession.setLastEntity(curEntity, lastEntity);
				callResult.setUserObject(lastEntity);
				return;
			}
		}, false);

		if (callResult.getUserObject() == null) return null;
		return (ET) callResult.getUserObject();
	}

	/**
	 * 获取数据之后触发（临时数据模式）
	 * 
	 * @param et
	 * @throws Exception
	 */
	protected void onAfterGetTemp(ET et) throws Exception {

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.service.IService#updateTemp(net.ibizsys.paas.entity.IEntity)
	 */
	@Override
	public void updateTemp(ET entity) throws Exception {
		updateTemp(entity, true);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.service.IService#updateTemp(net.ibizsys.paas.entity.IEntity, boolean)
	 */
	@Override
	public void updateTemp(ET entity, boolean bGet) throws Exception {
		final ET et = entity;
		final boolean bGet2 = bGet;
		et.setSessionFactory(this.getSessionFactory());
		if (et.get(this.getDEModel().getKeyDEField().getName()) == null) {
			if (!this.fillEntityKeyValue(et, true)) {
				throw new ErrorException(Errors.INVALIDDATAKEYS);
			}
		}

		this.onTestUpdateTemp(et);

		log.debug("开始[updateTemp]作业");
		this.doServiceWork(new IServiceWork() {
			@Override
			public void execute(ITransaction iTransaction) throws Exception {
				if (isPrepareLastForUpdate()) {
					ET last = getLast(et);
				}
				writeBackParent(et, false);
				fillEntityFullInfo(et, false);
				onBeforeUpdateTemp(et);
				checkEntity(et, false, true);
				setLast(et, INVALIDLAST, false);
				internalUpdateTemp(et);
				if (bGet2) internalGetTemp(et, false);
				if (isNeedUpdateParent()) {
					updateParent(et);
				}
				onAfterUpdateTemp(et);
			}
		});
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.service.IService#sysUpdateTemp(net.ibizsys.paas.entity.IEntity, boolean)
	 */
	@Override
	public void sysUpdateTemp(ET entity, boolean bGet) throws Exception {
		final ET et = entity;
		final boolean bGet2 = bGet || this.isNeedUpdateParent();
		et.setSessionFactory(this.getSessionFactory());
		if (et.get(this.getDEModel().getKeyDEField().getName()) == null) {
			if (!this.fillEntityKeyValue(et, true)) {
				throw new ErrorException(Errors.INVALIDDATAKEYS);
			}
		}

		this.onTestUpdateTemp(et);

		log.debug("开始[updateTemp]作业");
		this.doServiceWork(new IServiceWork() {
			@Override
			public void execute(ITransaction iTransaction) throws Exception {
				writeBackParent(et, false);
				fillEntityFullInfo(et, false);
				checkEntity(et, false, true);
				internalSysUpdateTemp(et);
				if (bGet2) internalGetTemp(et, false);
				if (isNeedUpdateParent()) {
					updateParent(et);
				}
			}
		});
	}

	/**
	 * 内部更新临时数据
	 * 
	 * @param entity
	 * @throws Exception
	 */
	protected void internalUpdateTemp(ET entity) throws Exception {
		DBCallResult dbCallResult = getDAO().executeUpdateSql(null, entity, true);
		if (dbCallResult.isError()) {
			throw new ErrorException(Errors.INTERNALERROR, dbCallResult.getErrorInfo());
		}

	}

	/**
	 * 判断是否可以更新数据（临时数据模式）
	 * 
	 * @param et
	 * @throws Exception
	 */
	protected void onTestUpdateTemp(ET et) throws Exception {

	}

	/**
	 * 更新数据之前触发（临时数据模式）
	 * 
	 * @param et
	 * @throws Exception
	 */
	protected void onBeforeUpdateTemp(ET et) throws Exception {
		executeActionLogics(ACTION_UPDATETEMP, LOGICATTACHMODE_BEFORE, et);
	}

	/**
	 * 更新数据之后触发（临时数据模式）
	 * 
	 * @param et
	 * @throws Exception
	 */
	protected void onAfterUpdateTemp(ET et) throws Exception {
		executeActionLogics(ACTION_UPDATETEMP, LOGICATTACHMODE_AFTER, et);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.service.IService#createTemp(net.ibizsys.paas.entity.IEntity)
	 */
	@Override
	public void createTemp(ET et) throws Exception {
		et.setSessionFactory(this.getSessionFactory());
		this.onTestCreateTemp(et);
		String strKey = (String) et.get(getDEModel().getKeyDEField().getName());

		final boolean bUpdate = !(StringHelper.isNullOrEmpty(strKey));

		if (StringHelper.isNullOrEmpty(strKey)) {
			this.fillEntityKeyValue(et, true);
		}
		EntityBase.setDraft(et, false);

		final ET et2 = et;

		this.doServiceWork(new IServiceWork() {
			@Override
			public void execute(ITransaction iTransaction) throws Exception {
				setLast(et2, EMPTYLAST, true);
				writeBackParent(et2, true);
				fillEntityFullInfo(et2, true);
				onBeforeCreateTemp(et2);
				checkEntity(et2, true, true);
				if (bUpdate)
					internalUpdateTemp(et2);
				else
					internalCreateTemp(et2);
				internalGetTemp(et2, false);
				if (isNeedUpdateParent()) {
					updateParent(et2);
				}
				onAfterCreateTemp(et2);
			}
		});
	}

	/**
	 * 判断是否可以建立数据（临时数据模式）
	 * 
	 * @param et
	 * @throws Exception
	 */
	protected void onTestCreateTemp(ET et) throws Exception {

	}

	/**
	 * 建立数据之前触发（临时数据模式）
	 * 
	 * @param et
	 * @throws Exception
	 */
	protected void onBeforeCreateTemp(ET et) throws Exception {
		executeActionLogics(ACTION_CREATETEMP, LOGICATTACHMODE_BEFORE, et);
	}

	/**
	 * 建立数据之后触发（临时数据模式）
	 * 
	 * @param et
	 * @throws Exception
	 */
	protected void onAfterCreateTemp(ET et) throws Exception {
		executeActionLogics(ACTION_CREATETEMP, LOGICATTACHMODE_AFTER, et);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.service.IService#removeTemp(java.util.ArrayList)
	 */
	@Override
	public void removeTemp(ArrayList<ET> entityList) throws Exception {
		final ArrayList<ET> list = entityList;

		log.debug("开始[remove]作业");
		this.doServiceWork(new IServiceWork() {
			@Override
			public void execute(ITransaction iTransaction) throws Exception {
				onBeforeRemoveTemp(list);
				internalRemoveTemp(list);
				onAfterRemoveTemp(list);
			}
		});
	}

	/**
	 * 删除数据之前触发（临时数据模式）
	 * 
	 * @param list
	 * @throws Exception
	 */
	protected void onBeforeRemoveTemp(ArrayList<ET> list) throws Exception {

	}

	/**
	 * 删除数据之后触发（临时数据模式）
	 * 
	 * @param list
	 * @throws Exception
	 */
	protected void onAfterRemoveTemp(ArrayList<ET> list) throws Exception {

	}

	/**
	 * 内部删除数据（临时数据模式）
	 * 
	 * @param list
	 * @throws Exception
	 */
	protected void internalRemoveTemp(ArrayList<ET> list) throws Exception {
		for (ET et : list) {
			this.removeTemp(et);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.service.IService#removeTemp(net.ibizsys.paas.entity.IEntity)
	 */
	@Override
	public void removeTemp(ET entity) throws Exception {
		final ET et = entity;
		et.setSessionFactory(this.getSessionFactory());
		log.debug("开始[removeTemp]作业");
		this.doServiceWork(new IServiceWork() {
			@Override
			public void execute(ITransaction iTransaction) throws Exception {
				// 判断当前数据是否在删除会话中
				Object objKeyValue = et.get(getDEModel().getKeyDEField().getName());
				if (!ActionSessionManager.getCurrentSession().registerRecursion(ACTION_REMOVE, getDEModel().getId(), objKeyValue)) {
					// 已经在删除会话中，取消
					return;
				}

				ET last = null;
				if (isPrepareLastForRemove() || isNeedUpdateParent()) {
					last = getLast(et);
				}

				onBeforeRemoveTemp(et);
				internalRemoveTemp(et);

				if (isNeedUpdateParent()) {
					updateParent(last);
				}
				onAfterRemoveTemp(et);
			}
		});
	}

	/**
	 * 内部删除数据（临时数据模式）
	 * 
	 * @param et
	 * @throws Exception
	 */
	protected void internalRemoveTemp(ET et) throws Exception {
		DBCallResult dbCallResult = getDAO().executeRemoveSql(null, et, true);
		if (dbCallResult.isError()) {
			throw new ErrorException(Errors.INTERNALERROR, dbCallResult.getErrorInfo());
		}
	}

	/**
	 * 删除数据之前触发（临时数据模式）
	 * 
	 * @param et
	 * @throws Exception
	 */
	protected void onBeforeRemoveTemp(ET et) throws Exception {
		executeActionLogics(ACTION_REMOVETEMP, LOGICATTACHMODE_BEFORE, et);
	}

	/**
	 * 删除数据之后触发（临时数据模式）
	 * 
	 * @param et
	 * @throws Exception
	 */
	protected void onAfterRemoveTemp(ET et) throws Exception {
		executeActionLogics(ACTION_REMOVETEMP, LOGICATTACHMODE_AFTER, et);
	}

	/**
	 * 从真数据中加载临时数据
	 * 
	 * @param et
	 * @throws Exception
	 */
	public void getTempMajor(ET et) throws Exception {
		final ET et2 = et;

		this.doServiceWork(new IServiceWork() {
			@Override
			public void execute(ITransaction iTransaction) throws Exception {
				ET tempET = getDEModel().createEntity();
				et2.copyTo(tempET, false);
				boolean bFromTemp = false;
				if (!et2.isFullEntity()) {
					String strKeyValue = (String) tempET.get(getDEModel().getKeyDEField().getName());
					if (strKeyValue.indexOf(TEMPKEY) == 0) {
						getTemp(tempET);
						bFromTemp = true;
					} else
						get(tempET);
				}

				CloneSession cloneSession = CloneSessionManager.getCurrentSession();

				// 去除主键
				tempET.remove(getDEModel().getKeyDEField().getName());
				replaceParentInfo(tempET, cloneSession);

				// 建立临时数据
				fillEntityKeyValue(tempET, true);

				if (!cloneSession.isFromSource())
					tempET.set(EntityBase.ORIGINKEY, et2.get(getDEModel().getKeyDEField().getName()));
				else {
					tempET.remove(EntityBase.ORIGINKEY);
					if (bFromTemp) {
						if (cloneSession.getSourceObject() == et2)
							EntityBase.setDraft(tempET, true);
						else
							EntityBase.setDraft(tempET, false);
					} else {
						EntityBase.setDraft(tempET, false);
					}

				}
				internalCreateTemp(tempET);

				// 开始合并数据
				beginMergeChild(tempET);
				cloneSession.setEntity(getDEModel(), et2.get(getDEModel().getKeyDEField().getName()), tempET);
				getRelatedDataTempMajor(et2);
				// 取消合并数据
				endMergeChild(tempET, true);

				tempET.copyTo(et2, true);
			}
		});
	}

	/**
	 * 获取相关数据的临时数据
	 * 
	 * @param et
	 * @throws Exception
	 */
	protected void getRelatedDataTempMajor(ET et) throws Exception {

	}

	/**
	 * 获取草稿数据临时数据（主模式）
	 * 
	 * @param et
	 * @throws Exception
	 */
	public void getDraftTempMajor(ET et) throws Exception {
		this.getDraftTemp(et);
	}

	/**
	 * 建立临时数据（主模式）
	 * 
	 * @param et
	 * @throws Exception
	 */
	public void createTempMajor(ET et) throws Exception {
		updateTempMajor(et);
	}

	/**
	 * 更新临时数据（主模式）
	 * 
	 * @param et
	 * @throws Exception
	 */
	public void updateTempMajor(ET et) throws Exception {
		final ET et2 = et;
		et2.setSessionFactory(this.getSessionFactory());
		this.doServiceWork(new IServiceWork() {
			@Override
			public void execute(ITransaction iTransaction) throws Exception {
				CloneSession cloneSession = CloneSessionManager.getCurrentSession();

				Object objLastUpdateDate = et2.get(IFormItem.LASTUPDATEDATE);
				// 更新临时数据
				updateTemp(et2);

				// 判断是否有临时数据
				ET oriET = getDEModel().createEntity();
				et2.copyTo(oriET, false);
				oriET.remove(getDEModel().getKeyDEField().getName());
				replaceParentInfo(oriET, cloneSession);
				if (true) {
					JSONObject jo = new JSONObject();
					oriET.fillJSONObject(jo, false);
					java.util.Iterator keys = jo.keys();
					while (keys.hasNext()) {
						String strKey = (String) keys.next();
						Object objValue = jo.get(strKey);
						if (objValue != null && objValue instanceof String) {
							if (KeyValueHelper.isTempKey((String) objValue)) {
								log.warn(StringHelper.format("临时数据[%1$s]属性[%2$s]为临时数据", getDEModel().getName(), strKey));
								return;
							}
						}
					}
				}

				Object oriKey = et2.get(ORIGINKEY);
				if (StringHelper.isNullOrEmpty(oriKey)) {
					// 新建
					create(oriET);
					et2.set(ORIGINKEY, oriET.get(getDEModel().getKeyDEField().getName()));
					if (true) {
						// 解决新建默认值无法填入临时数据的问题
						HashMap<String, Object> valueMap = new HashMap<String, Object>();
						oriET.fillMap(valueMap, false);
						for (String strKey : valueMap.keySet()) {
							Object objValue = valueMap.get(strKey);
							if (et2.contains(strKey)) {
								Object objValue2 = et2.get(strKey);
								if (objValue2 == null && objValue != null) {
									et2.set(strKey, objValue);
								}
							}
						}
					}
					// 再次更新
					updateTemp(et2);
				} else {
					if (objLastUpdateDate != null) {
						oriET.set(IFormItem.LASTUPDATEDATE, objLastUpdateDate);
					}
					oriET.set(getDEModel().getKeyDEField().getName(), oriKey);
					update(oriET);
					if (objLastUpdateDate != null) {
						oriET.set(IFormItem.LASTUPDATEDATE, objLastUpdateDate);
					}

				}
				cloneSession.setEntity(getDEModel(), et2.get(getDEModel().getKeyDEField().getName()), oriET);
				// 开始合并数据
				beginMergeChild(oriET);
				updateRelatedDataTempMajor(et2, oriET);
				// 取消合并数据
				endMergeChild(oriET, true);
				onAfterUpdateTempMajor(oriET);
				et2.set(getDEModel().getUpdateDateDEField().getName(), oriET.get(getDEModel().getUpdateDateDEField().getName()));
			}
		});
	}

	/**
	 * 更新临时数据主模式后调用
	 * 
	 * @param et
	 * @throws Exception
	 */
	protected void onAfterUpdateTempMajor(ET et) throws Exception {

	}

	/**
	 * 更新相关数据的临时数据
	 * 
	 * @param et
	 * @throws Exception
	 */
	protected void updateRelatedDataTempMajor(ET tempET, ET oriET) throws Exception {

	}

	/**
	 * 删除临时数据（主模式）
	 * 
	 * @param et
	 * @throws Exception
	 */
	public void removeTempMajor(ET et) throws Exception {
		Object oriKey = et.get(ORIGINKEY);
		if (oriKey == null) {
			this.getTemp(et);
			oriKey = et.get(ORIGINKEY);
		}
		et.set(this.getDEModel().getKeyDEField().getName(), oriKey);
		this.remove(et);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.service.IService#clone(net.ibizsys.paas.entity.IEntity)
	 */
	@Override
	public ET clone(ET et) throws Exception {
		throw new Exception("没有实现自定义行为[clone]");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.service.IService#cloneToTemp(net.ibizsys.paas.entity.IEntity)
	 */
	@Override
	public ET cloneToTemp(ET et) throws Exception {
		boolean bCloseSession = false;
		CloneSession cloneSession = CloneSessionManager.getCurrentSession();
		if (cloneSession == null) {
			cloneSession = CloneSessionManager.openSession();
			cloneSession.setOwner(getDEModel().getName());
			bCloseSession = true;
		}
		try {
			ET et2 = this.getDEModel().createEntity();
			et.copyTo(et2, false);
			if (!et.isFullEntity()) {
				this.get(et2);
			}

			// 去除主键
			et2.remove(this.getDEModel().getKeyDEField().getName());
			replaceParentInfo(et2, cloneSession);

			// 建立临时数据
			this.createTemp(et2);

			Class<ET> entityClass = (Class<ET>) ((ParameterizedType) this.getClass().getGenericSuperclass()).getActualTypeArguments()[0];
			cloneSession.setEntity(this.getDEModel(), et.get(this.getDEModel().getKeyDEField().getName()), et2);
			onAfterCloneToTemp(et2, et, cloneSession);

			if (bCloseSession) {
				CloneSessionManager.closeSession();
			}

			return et2;
		} catch (Exception ex) {
			if (bCloseSession) CloneSessionManager.closeSession();
			throw ex;
		}
	}

	/**
	 * 替换父数据信息
	 * 
	 * @param et
	 * @param cloneSession
	 * @throws Exception
	 */
	protected void replaceParentInfo(ET et, CloneSession cloneSession) throws Exception {

	}

	/**
	 * 克隆到临时数据后触发
	 * 
	 * @param newET
	 * @param srcET
	 * @param cloneSession
	 * @throws Exception
	 */
	protected void onAfterCloneToTemp(ET newET, ET srcET, CloneSession cloneSession) throws Exception {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.service.IService#cloneTemp(net.ibizsys.paas.entity.IEntity)
	 */
	@Override
	public ET cloneTemp(ET et) throws Exception {
		throw new Exception("没有实现自定义行为[cloneTemp]");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.service.IService#checkKey(net.ibizsys.paas.entity.IEntity)
	 */
	@Override
	public int checkKey(ET et3) throws Exception {
		final ET et = et3;
		final ET et2 = this.getDEModel().createEntity();
		et.copyTo(et2, false);
		et2.setSessionFactory(this.getSessionFactory());
		
		this.doServiceWork(new IServiceWork() {
			@Override
			public void execute(ITransaction iTransaction) throws Exception {
				
				if(getDEModel().getKeyDEField().isPhisicalDEField()){
					if (et2.get(getDEModel().getKeyDEField().getName()) == null) {
						if (!fillEntityKeyValue(et2, false)) {
							et.set(EntityBase.CALLRESULT, CHECKKEYSTATE_OK);
							return;
						}
					}
					
					DBCallResult dbCallResult = getDAO().executeCheckKeySql(null, et2, false);
					if (dbCallResult.isError()) {
						throw new ErrorException(Errors.INTERNALERROR, dbCallResult.getErrorInfo());
					}

					if (dbCallResult.isOk()) {
						dbCallResult.getDataSet().cacheDataRow();
					}

					if (dbCallResult.getDataSet().getDataTableCount() == 0 || dbCallResult.getDataSet().getDataTable(0).getCachedRowCount() == 0) {
						et.set(EntityBase.CALLRESULT, CHECKKEYSTATE_OK);
						return;
					}

					et.set(EntityBase.CALLRESULT, CHECKKEYSTATE_EXIST);
					return;
				}
				else{
					
					CallResult callResult = internalGet(et2, true);
					if(callResult.getRetCode() == Errors.INVALIDDATA){
						et.set(EntityBase.CALLRESULT, CHECKKEYSTATE_OK);
						return;
					}
					if(callResult.getRetCode() == Errors.OK){
						et.set(EntityBase.CALLRESULT, CHECKKEYSTATE_EXIST);
						return;
					}
					
					throw new Exception(callResult.getErrorInfo());
				}
			}
		}, false);

		return (Integer) et.get(EntityBase.CALLRESULT);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.service.IService#checkKeyTemp(net.ibizsys.paas.entity.IEntity)
	 */
	@Override
	public int checkKeyTemp(ET et3) throws Exception {
		boolean bFillKey = false;
		final ET et = et3;
		final ET et2 = this.getDEModel().createEntity();
		et.copyTo(et2, false);
		et2.setSessionFactory(this.getSessionFactory());
		if (et2.get(this.getDEModel().getKeyDEField().getName()) == null) {
			if (!this.fillEntityKeyValue(et2, true)) {
				et.set(EntityBase.CALLRESULT, CHECKKEYSTATE_OK);
				return CHECKKEYSTATE_OK;
			}
		}

		final long nBeginTime = java.lang.System.currentTimeMillis();
		this.doServiceWork(new IServiceWork() {
			@Override
			public void execute(ITransaction iTransaction) throws Exception {
				DBCallResult dbCallResult = getDAO().executeCheckKeySql(null, et2, true);
				if (dbCallResult.isError()) {
					throw new ErrorException(Errors.INTERNALERROR, dbCallResult.getErrorInfo());
				}

				if (dbCallResult.isOk()) {
					dbCallResult.getDataSet().cacheDataRow();
				}

				if (dbCallResult.getDataSet().getDataTableCount() == 0 || dbCallResult.getDataSet().getDataTable(0).getCachedRowCount() == 0) {
					et.set(EntityBase.CALLRESULT, CHECKKEYSTATE_OK);
					// return CHECKKEYSTATE_OK;
					return;
				}

				long nTime = java.lang.System.currentTimeMillis() - nBeginTime;
				log.debug(StringHelper.format("checkKeyTemp 耗时[%1$s]", nTime));

				et.set(EntityBase.CALLRESULT, CHECKKEYSTATE_EXIST);
				// return CHECKKEYSTATE_EXIST;
				return;
			}
		}, false);
		return (Integer) et.get(EntityBase.CALLRESULT);
	}

	/**
	 * 排序层级数据
	 * 
	 * @param list
	 * @param strKeyField
	 * @param strPKeyField
	 * @throws Exception
	 */
	public static void sortHierarchyEntities(ArrayList list, String strKeyField, String strPKeyField) throws Exception {
		if (list.size() <= 1) return;

		HashMap<Object, IEntity> entityMap = new HashMap<Object, IEntity>();
		ArrayList<IEntity> retList = new ArrayList<IEntity>();
		ArrayList<IEntity> list2 = new ArrayList<IEntity>();

		while (true) {
			list2.clear();
			int nLastLength = list.size();
			while (list.size() > 0) {
				IEntity iEntity = (IEntity) list.remove(0);
				Object objKey = iEntity.get(strKeyField);
				Object objPKey = iEntity.get(strPKeyField);
				if (objPKey == null || objPKey.toString().length() == 0) {
					entityMap.put(objKey, iEntity);
					retList.add(iEntity);
				} else {
					if (entityMap.containsKey(objPKey)) {
						entityMap.put(objKey, iEntity);
						retList.add(iEntity);
					} else {
						list2.add(iEntity);
					}
				}
			}
			if (list2.size() == 0) {
				break;
			}

			if (nLastLength == list2.size()) {
				throw new Exception(StringHelper.format("无法排序"));
			} else {
				list.addAll(list2);

			}
		}
		list.addAll(retList);
	}

	/**
	 * 获取实际会话工厂
	 * 
	 * @return
	 */
	public SessionFactory getRealSessionFactory() {
		if (this.sessionFactory != null) {
			return this.sessionFactory;
		}

		return this.getDEModel().getSystemRuntime().getSessionFactory(this.getDEModel().getDSLink());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.service.IService#setSessionFactory(org.hibernate.SessionFactory)
	 */
	@Override
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.service.IService#getSessionFactory()
	 */
	@Override
	public SessionFactory getSessionFactory() {
		return this.sessionFactory;
	}

	/**
	 * 移除实体不能拷贝的值
	 * 
	 * @param et
	 * @param bTempMode 临时数据模式
	 * @throws Exception
	 */
	protected void removeEntityUncopyValues(ET et, boolean bTempMode) throws Exception {
		//
		if (bTempMode) {
			et.remove(ServiceBase.ORIGINKEY);
		}

		// 移除主键，如果临时数据存在关联，则会出现错误，需要进行关联拷贝
		String strKeyFieldName = this.getDEModel().getKeyDEField().getName();
		et.remove(strKeyFieldName);

		onRemoveEntityUncopyValues(et, bTempMode);
	}

	/**
	 * 移除实体不能拷贝的值触发
	 * 
	 * @param et
	 * @param bTempMode
	 * @throws Exception
	 */
	protected void onRemoveEntityUncopyValues(ET et, boolean bTempMode) throws Exception {

	}

	/**
	 * 检查属性常规条件
	 * 
	 * @param strFieldName
	 * @param et
	 * @param bTempMode
	 * @param strCond
	 * @param strParamType
	 * @param strParamValue
	 * @param strRuleInfo
	 * @return
	 * @throws Exception
	 */
	protected boolean checkFieldSimpleRule(String strFieldName, IEntity et, boolean bTempMode, String strCond, String strParamType, String strParamValue, String strRuleInfo) throws Exception {
		return checkFieldSimpleRule(strFieldName, et, bTempMode, strCond, strParamType, strParamValue, strRuleInfo, true);
	}

	/**
	 * 检查属性常规条件
	 * 
	 * @param strFieldName
	 * @param et
	 * @param bTempMode
	 * @param strCond
	 * @param strParamType
	 * @param strParamValue
	 * @param strRuleInfo
	 * @return
	 * @throws Exception
	 */
	protected boolean checkFieldSimpleRule(String strFieldName, IEntity et, boolean bTempMode, String strCond, String strParamType, String strParamValue, String strRuleInfo, boolean bTryMode) throws Exception {
		if (StringHelper.isNullOrEmpty(strRuleInfo)){
			strRuleInfo = this.getLocalization(MSG_CHECKFIELDSIMPLERULE_INFO , "内容必须符合值规则");
		}

		Object objValue = et.get(strFieldName);
		int nStdDataType = DataTypes.VARCHAR;
		if (objValue != null) {
			nStdDataType = DataTypeHelper.getObjectDataType(objValue);
		}

		Object objDst = DefaultValueHelper.getValue(WebContext.getCurrent(), strParamType, strParamValue, nStdDataType, et);
		return DataTypeHelper.testCond(objValue, strCond, objDst);
	}

	/**
	 * 检查属性查询计数规则（属性值不发生变化不检查）
	 * 
	 * @param strFieldName
	 * @param strDEDataQueryName
	 * @param et
	 * @param bTempMode
	 * @param nMinValue
	 * @param bIncMinValue
	 * @param nMaxValue
	 * @param bIncMaxValue
	 * @param strRuleInfo
	 * @return
	 * @throws Exception
	 */
	protected boolean checkFieldQueryCountRule(String strFieldName, String strDEDataQueryName, IEntity et, boolean bTempMode, Integer nMinValue, boolean bIncMinValue, Integer nMaxValue, boolean bIncMaxValue, String strRuleInfo) throws Exception {
		return checkFieldQueryCountRule(strFieldName, strDEDataQueryName, et, bTempMode, nMinValue, bIncMinValue, nMaxValue, bIncMaxValue, strRuleInfo, true);
	}

	/**
	 * 检查查询计数规则
	 * 
	 * @param strDEDataQueryName
	 * @param et
	 * @param bTempMode
	 * @param nMinValue
	 * @param bIncMinValue
	 * @param nMaxValue
	 * @param bIncMaxValue
	 * @param strRuleInfo
	 * @return
	 * @throws Exception
	 */
	protected boolean checkFieldQueryCountRule(String strFieldName, String strDEDataQueryName, IEntity et, boolean bTempMode, Integer nMinValue, boolean bIncMinValue, Integer nMaxValue, boolean bIncMaxValue, String strRuleInfo, boolean bTryMode) throws Exception {
		return checkFieldQueryCountRule2(strFieldName, strDEDataQueryName, et, bTempMode, nMinValue, bIncMinValue, nMaxValue, bIncMaxValue, strRuleInfo, false, true);
	}

	/**
	 * 检查属性查询计数规则扩展，可选择是否始终检查
	 * 
	 * @param strFieldName
	 * @param strDEDataQueryName
	 * @param et
	 * @param bTempMode
	 * @param nMinValue
	 * @param bIncMinValue
	 * @param nMaxValue
	 * @param bIncMaxValue
	 * @param strRuleInfo
	 * @param bAlwaysCheck 是否始终检查
	 * @return
	 * @throws Exception
	 */
	protected boolean checkFieldQueryCountRule2(String strFieldName, String strDEDataQueryName, IEntity et, boolean bTempMode, Integer nMinValue, boolean bIncMinValue, Integer nMaxValue, boolean bIncMaxValue, String strRuleInfo, boolean bAlwaysCheck) throws Exception {
		return checkFieldQueryCountRule2(strFieldName, strDEDataQueryName, et, bTempMode, nMinValue, bIncMinValue, nMaxValue, bIncMaxValue, strRuleInfo, bAlwaysCheck, true);
	}

	/**
	 * 检查查询计数规则2，可选择是否始终检查
	 * 
	 * @param strDEDataQueryName
	 * @param et
	 * @param bTempMode
	 * @param nMinValue
	 * @param bIncMinValue
	 * @param nMaxValue
	 * @param bIncMaxValue
	 * @param strRuleInfo
	 * @param bAlwaysCheck 是否始终检查
	 * @param bTryMode 是否为尝试模式
	 * @return
	 * @throws Exception
	 */
	protected boolean checkFieldQueryCountRule2(String strFieldName, String strDEDataQueryName, IEntity et, boolean bTempMode, Integer nMinValue, boolean bIncMinValue, Integer nMaxValue, boolean bIncMaxValue, String strRuleInfo, boolean bAlwaysCheck, boolean bTryMode) throws Exception {
		if (bTempMode) {
			// 临时数据不检查
			return true;
		}

		if (!bAlwaysCheck) {
			Object objValue = et.get(strFieldName);
			ET last = getLast(et);
			if (last != null) {
				int nStdDataType = DataTypes.VARCHAR;
				if (objValue != null) {
					nStdDataType = DataTypeHelper.getObjectDataType(objValue);
				}
				Object objValue2 = last.get(strFieldName);
				if (DataTypeHelper.compare(nStdDataType, objValue, objValue2) == 0) return true;
			}
		}

		DEDataSetFetchContext deDataSetFetchContext = new DEDataSetFetchContext(null);
		deDataSetFetchContext.setFetchData(false);
		deDataSetFetchContext.setActiveDataObject(et);

		DBFetchResult dbFetchResult = this.getDAO().fetchDEDataQuery(deDataSetFetchContext, strDEDataQueryName, bTempMode);

		int nLength = dbFetchResult.getTotalRow();
		if (nMinValue != null) {
			if (bIncMaxValue) {
				if (nLength < nMinValue) {
					if (bTryMode) return false;
					throw new Exception(strRuleInfo);
				}
			} else {
				if (nLength <= nMinValue) {
					if (bTryMode) return false;
					throw new Exception(strRuleInfo);
				}
			}
		}

		if (nMaxValue != null) {
			if (bIncMaxValue) {
				if (nLength > nMaxValue) {
					if (bTryMode) return false;
					throw new Exception(strRuleInfo);
				}
			} else {
				if (nLength >= nMaxValue) {
					if (bTryMode) return false;
					throw new Exception(strRuleInfo);
				}
			}
		}

		return true;
	}

	/**
	 * 检查属性数据集合规则
	 * 
	 * @param strFieldName 属性名称
	 * @param strDSDEName 结果集合所在实体
	 * @param strDSName 结果集合名称
	 * @param et 当前数据对象
	 * @param bTempMode 临时数据模式
	 * @param strEQDSDEFName 附加条件，结果集合中的字段
	 * @param strEQDEFName 附加条件，当前数据对象属性
	 * @param strRuleInfo 规则信息
	 * @param bAlwaysCheck 始终检查
	 * @return
	 * @throws Exception
	 */
	protected boolean checkFieldDataSetRule(String strFieldName, String strDSDEName, String strDSName, IEntity et, boolean bTempMode, String strEQDSDEFName, String strEQDEFName, String strRuleInfo, boolean bAlwaysCheck) throws Exception {
		return checkFieldDataSetRule(strFieldName, strDSDEName, strDSName, et, bTempMode, strEQDSDEFName, strEQDEFName, strRuleInfo, bAlwaysCheck, false);
	}

	/**
	 * 检查属性数据集合规则
	 * 
	 * @param strFieldName 属性名称
	 * @param strDSDEName 结果集合所在实体
	 * @param strDSName 结果集合名称
	 * @param et 当前数据对象
	 * @param bTempMode 临时数据模式
	 * @param strEQDSDEFName 附加条件，结果集合中的字段
	 * @param strEQDEFName 附加条件，当前数据对象属性
	 * @param strRuleInfo 规则信息
	 * @param bAlwaysCheck 始终检查
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Exception
	 */
	protected boolean checkFieldDataSetRule(String strFieldName, String strDSDEName, String strDSName, IEntity et, boolean bTempMode, String strEQDSDEFName, String strEQDEFName, String strRuleInfo, boolean bAlwaysCheck, boolean bTryMode) throws Exception {
		if (bTempMode) {
			// 临时数据不检查
			return true;
		}

		if (StringHelper.isNullOrEmpty(strRuleInfo)){
			strRuleInfo = this.getLocalization(MSG_CHECKFIELDDATASETRULE_INFO, "值必须符合数据集合范围规则");
		}

		Object objValue = et.get(strFieldName);
		if (objValue == null) return true;

		if (!bAlwaysCheck) {
			ET last = getLast(et);
			if (last != null) {
				int nStdDataType = DataTypes.VARCHAR;
				if (objValue != null) {
					nStdDataType = DataTypeHelper.getObjectDataType(objValue);
				}
				Object objValue2 = last.get(strFieldName);
				if (DataTypeHelper.compare(nStdDataType, objValue, objValue2) == 0) return true;
			}
		}

		IDataEntityModel dsDEModel = DEModelGlobal.getDEModel(strDSDEName);
		IService dsService = dsDEModel.getService(this.getSessionFactory());

		DEDataSetFetchContext deDataSetFetchContext = new DEDataSetFetchContext(null);
		deDataSetFetchContext.setFetchData(false);
		deDataSetFetchContext.setActiveDataObject(et);
		et.setEntityProperty("srfdeid", this.getDEModel().getName());
		et.setEntityProperty("srfreferitem", strFieldName);

		if (true) {
			DEDataSetCond deDataSetCondImpl = new DEDataSetCond();
			deDataSetCondImpl.setCondType(IDEDataSetCond.CONDTYPE_DEFIELD);
			deDataSetCondImpl.setCondOp(ICondition.CONDOP_EQ);
			deDataSetCondImpl.setDEFName(dsDEModel.getKeyDEField().getName());
			deDataSetCondImpl.setCondValue(DataObject.getStringValue(objValue, ""));
			deDataSetFetchContext.getConditionList().add(deDataSetCondImpl);
		}

		if (!StringHelper.isNullOrEmpty(strEQDSDEFName)) {
			DEDataSetCond deDataSetCondImpl = new DEDataSetCond();
			deDataSetCondImpl.setCondType(IDEDataSetCond.CONDTYPE_DEFIELD);
			deDataSetCondImpl.setCondOp(ICondition.CONDOP_EQ);
			deDataSetCondImpl.setDEFName(strEQDSDEFName);
			deDataSetCondImpl.setCondValue(DataObject.getStringValue(et, strEQDEFName, ""));
			deDataSetFetchContext.getConditionList().add(deDataSetCondImpl);
		}

		DBFetchResult dbFetchResult = dsService.fetchDataSet(strDSName, deDataSetFetchContext);
		int nLength = dbFetchResult.getTotalRow();
		if (nLength == 0) {
			if (bTryMode) return false;
			throw new Exception(strRuleInfo);
		}
		return true;
	}

	/**
	 * 检查属性值是否出现递归关系
	 * @param strFieldName
	 * @param strDEName
	 * @param et
	 * @param bTempMode
	 * @param strRuleInfo
	 * @param bTryMode
	 * @return
	 * @throws Exception
	 */
	protected boolean checkFieldRecursionRule(String strFieldName, String strDEName,  IEntity et, boolean bTempMode, String strRuleInfo) throws Exception {
		return checkFieldRecursionRule( strFieldName,  strDEName,   et,  bTempMode,  strRuleInfo,false);
	}
	
	/**
	 * 检查属性值是否出现递归关系
	 * @param strFieldName
	 * @param strDEName
	 * @param et
	 * @param bTempMode
	 * @param strRuleInfo
	 * @param bTryMode
	 * @return
	 * @throws Exception
	 */
	protected boolean checkFieldRecursionRule(String strFieldName, String strDEName,  IEntity et, boolean bTempMode, String strRuleInfo,  boolean bTryMode) throws Exception {
		if (bTempMode) {
			// 临时数据不检查
			return true;
		}

		if (StringHelper.isNullOrEmpty(strRuleInfo)){
			strRuleInfo = this.getLocalization(MSG_CHECKFIELDRECURSIONRULE_INFO, "值引用出现递归关系");
		}

		Object objValue = et.get(strFieldName);
		if (objValue == null){
			return true;
		}

		Object objKey = et.get(this.getDEModel().getKeyDEField().getName());
		if(objKey==null){
			return true;
		}
		
		if(DataTypeHelper.compare(this.getDEModel().getKeyDEField().getStdDataType(), objValue, objKey)==0){
			if (bTryMode) return false;
			throw new Exception(strRuleInfo);
		}
		
		IService iService = this;
		if(!StringHelper.isNullOrEmpty(strDEName) && StringHelper.compare(strDEName, this.getDEModel().getName(), true)!=0){
			IDataEntityModel iDEModel = DEModelGlobal.getDEModel(strDEName);
			iService = iDEModel.getService(this.getSessionFactory());
		}
		
		IEntity parentData = iService.getDEModel().createEntity();
		while(objValue!=null){
			parentData.set(this.getDEModel().getKeyDEField().getName(), objValue);
			if(iService.get(parentData, true)){
				objValue = parentData.get(strFieldName);
				if (objValue == null){
					return true;
				}
				
				if(DataTypeHelper.compare(this.getDEModel().getKeyDEField().getStdDataType(), objValue, objKey)==0){
					if (bTryMode) return false;
					throw new Exception(strRuleInfo);
				}
			}
			else {
				return true;
			}
		}
		
		return true;
	}
	
	/**
	 * 检查属性字符长度规则
	 * 
	 * @param strFieldName
	 * @param et
	 * @param bTempMode
	 * @param nMinValue
	 * @param bIncMinValue
	 * @param nMaxValue
	 * @param bIncMaxValue
	 * @param strRuleInfo
	 * @return
	 * @throws Exception
	 */
	protected boolean checkFieldStringLengthRule(String strFieldName, IEntity et, boolean bTempMode, Integer nMinValue, boolean bIncMinValue, Integer nMaxValue, boolean bIncMaxValue, String strRuleInfo) throws Exception {
		return checkFieldStringLengthRule(strFieldName, et, bTempMode, nMinValue, bIncMinValue, nMaxValue, bIncMaxValue, strRuleInfo, true);
	}

	/**
	 * 检查属性字符长度规则
	 * 
	 * @param strFieldName
	 * @param et
	 * @param bTempMode
	 * @param nMinValue
	 * @param bIncMinValue
	 * @param nMaxValue
	 * @param bIncMaxValue
	 * @param strRuleInfo
	 * @return
	 * @throws Exception
	 */
	protected boolean checkFieldStringLengthRule(String strFieldName, IEntity et, boolean bTempMode, Integer nMinValue, boolean bIncMinValue, Integer nMaxValue, boolean bIncMaxValue, String strRuleInfo, boolean bTryMode) throws Exception {
		if (StringHelper.isNullOrEmpty(strRuleInfo)){
			strRuleInfo = this.getLocalization(MSG_CHECKFIELDSTRINGLENGTHRULE_INFO ,"内容长度必须符合范围规则");
		}

		String strValue = "";
		Object objValue = et.get(strFieldName);
		if (objValue != null) {
			if (!(objValue instanceof String)) {
				throw new Exception(this.getLocalization(MSG_CHECKFIELDSTRINGLENGTHRULE_INVALIDVALUE,new Object[]{strFieldName},StringHelper.format("属性[%1$s]值不是字符类型", strFieldName)));
			}

			strValue = (String) objValue;
		}

		int nLength = strValue.length();
		if (nMinValue != null) {
			if (bIncMaxValue) {
				if (nLength < nMinValue) {
					if (bTryMode) return false;
					throw new Exception(strRuleInfo);
				}
			} else {
				if (nLength <= nMinValue) {
					if (bTryMode) return false;
					throw new Exception(strRuleInfo);
				}
			}
		}

		if (nMaxValue != null) {
			if (bIncMaxValue) {
				if (nLength > nMaxValue) {
					if (bTryMode) return false;
					throw new Exception(strRuleInfo);
				}
			} else {
				if (nLength >= nMaxValue) {
					if (bTryMode) return false;
					throw new Exception(strRuleInfo);
				}
			}
		}

		return true;
	}

	/**
	 * 检查属性值范围规则
	 * 
	 * @param strFieldName
	 * @param et
	 * @param bTempMode
	 * @param fMinValue
	 * @param bIncMinValue
	 * @param fMaxValue
	 * @param bIncMaxValue
	 * @param strRuleInfo
	 * @return
	 * @throws Exception
	 */
	protected boolean checkFieldValueRangeRule(String strFieldName, IEntity et, boolean bTempMode, Double fMinValue, boolean bIncMinValue, Double fMaxValue, boolean bIncMaxValue, String strRuleInfo) throws Exception {
		return checkFieldValueRangeRule(strFieldName, et, bTempMode, fMinValue, bIncMinValue, fMaxValue, bIncMaxValue, strRuleInfo, true);
	}

	/**
	 * 检查属性值范围规则
	 * 
	 * @param strFieldName
	 * @param et
	 * @param bTempMode
	 * @param fMinValue
	 * @param bIncMinValue
	 * @param fMaxValue
	 * @param bIncMaxValue
	 * @param strRuleInfo
	 * @param bTryMode
	 * @return
	 * @throws Exception
	 */
	protected boolean checkFieldValueRangeRule(String strFieldName, IEntity et, boolean bTempMode, Double fMinValue, boolean bIncMinValue, Double fMaxValue, boolean bIncMaxValue, String strRuleInfo, boolean bTryMode) throws Exception {
		if (StringHelper.isNullOrEmpty(strRuleInfo)){
			strRuleInfo = this.getLocalization(MSG_CHECKFIELDVALUERANGERULE_INFO, "数值必须符合值范围规则");
		}

		Object objValue = et.get(strFieldName);
		if (objValue == null) return true;

		double fSrcValue = 0;
		if (objValue instanceof Double) {
			fSrcValue = (Double) objValue;
		} else {
			String strValue = objValue.toString();
			if (StringHelper.isNullOrEmpty(strValue)) return true;
			fSrcValue = Double.parseDouble(objValue.toString());
		}

		if (fMinValue != null) {
			if (bIncMaxValue) {
				if (fSrcValue < fMinValue) {
					if (bTryMode) return false;
					throw new Exception(strRuleInfo);
				}
			} else {
				if (fSrcValue <= fMinValue) {
					if (bTryMode) return false;
					throw new Exception(strRuleInfo);
				}
			}
		}

		if (fMaxValue != null) {
			if (bIncMaxValue) {
				if (fSrcValue > fMaxValue) {
					if (bTryMode) return false;
					throw new Exception(strRuleInfo);
				}
			} else {
				if (fSrcValue >= fMaxValue) {
					if (bTryMode) return false;
					throw new Exception(strRuleInfo);
				}
			}
		}

		return true;
	}

	/**
	 * 检查属性值正则式规则
	 * 
	 * @param strFieldName
	 * @param et
	 * @param bTempMode
	 * @param strRegExCode
	 * @param strRuleInfo
	 * @return
	 * @throws Exception
	 */
	protected boolean checkFieldRegExRule(String strFieldName, IEntity et, boolean bTempMode, String strRegExCode, String strRuleInfo) throws Exception {
		return checkFieldRegExRule(strFieldName, et, bTempMode, strRegExCode, strRuleInfo, true);
	}

	/**
	 * 检查属性值正则式规则
	 * 
	 * @param strFieldName
	 * @param et
	 * @param bTempMode
	 * @param strRegExCode
	 * @param strRuleInfo
	 * @param bTryMode
	 * @return
	 * @throws Exception
	 */
	protected boolean checkFieldRegExRule(String strFieldName, IEntity et, boolean bTempMode, String strRegExCode, String strRuleInfo, boolean bTryMode) throws Exception {
		if (!et.contains(strFieldName)){
			return true;
		}
		String strValue = "";
		Object objValue = et.get(strFieldName);
		if (objValue != null) {
			if (!(objValue instanceof String)) {
				throw new Exception(this.getLocalization(MSG_CHECKFIELDREGEXRULE_INVALIDVALUE , new Object[]{strFieldName},StringHelper.format("属性[%1$s]值不是字符类型",strFieldName)));
			}

			strValue = (String) objValue;
		}

		if (StringHelper.isNullOrEmpty(strValue)) return true;

		Pattern p = Pattern.compile(strRegExCode);
		Matcher m = p.matcher(strValue);
		boolean b = m.matches();
		if (!b) {
			if (bTryMode) return false;

			throw new Exception(strRuleInfo);
		}
		return true;

	}

	/**
	 * 检查数据对象属性重复规则
	 * 
	 * @param strFieldName
	 * @param strRangeFieldName
	 * @param et
	 * @param bCreate
	 * @param last
	 * @param bTempMode
	 * @return
	 * @throws Exception
	 */
	protected String checkFieldDupRule(IDataEntityModel iDEModel, String strFieldName, String strRangeFieldName, ET et, boolean bCreate, boolean bTempMode) throws Exception {
		boolean bValueFieldChanged = true;
		boolean bRangeFieldChanged = true;
		Object objKeyValue = et.get(iDEModel.getKeyDEField().getName());

		SelectContext selectCond = new SelectContext();
		Object value = et.get(strFieldName);
		selectCond.setConditon(strFieldName, value);
		selectCond.setFetchFirst(true);

		ET last = getLast(et);
		if (last != null) {
			Object value2 = last.get(strFieldName);
			if (value2 != null) {
				IDEField iDEField = iDEModel.getDEField(strFieldName, true);
				bValueFieldChanged = (DataTypeHelper.compare(iDEField.getStdDataType(), value, value2) != 0);
			}
		}

		if (!StringHelper.isNullOrEmpty(strRangeFieldName)) {
			Object rangeValue = et.get(strRangeFieldName);
			if (rangeValue == null && last != null) {
				rangeValue = last.get(strRangeFieldName);
			}
			if (rangeValue == null) {
				return StringHelper.format("属性[%1$s]没有值，不能检查", strRangeFieldName);
			}

			if (bTempMode) {
				// 判断范围值是否为临时数据
				if (rangeValue instanceof String) {
					String strRangeValue = (String) rangeValue;
					if (strRangeValue.indexOf(TEMPKEY) != 0) {
						// 范围为真数据，忽略检查
						return null;
					}
				}
			}

			selectCond.setConditon(strRangeFieldName, rangeValue);

			if (last != null) {
				Object value2 = last.get(strRangeFieldName);
				if (value2 != null) {
					IDEField iDEField = iDEModel.getDEField(strRangeFieldName, true);
					bRangeFieldChanged = (DataTypeHelper.compare(iDEField.getStdDataType(), rangeValue, value2) != 0);
				}
			}

		} else
			bRangeFieldChanged = false;

		if (!bValueFieldChanged && !bRangeFieldChanged) return null;

		SelectField selectField = new SelectField();
		selectField.setName(iDEModel.getKeyDEField().getName());
		selectCond.addSelectField(selectField);

		ArrayList<ET> list = null;
		if (bTempMode) {
			if (iDEModel == this.getDEModel()) {
				list = this.selectTemp(selectCond);
			} else {
				list = iDEModel.getService().selectTemp(selectCond);
			}

		} else {
			if (iDEModel == this.getDEModel()) {
				list = this.select(selectCond);
			} else {
				list = iDEModel.getService().select(selectCond);
			}
		}
		if (list.size() == 0) return null;

		for (ET item : list) {
			Object objKeyValue2 = item.get(iDEModel.getKeyDEField().getName());
			if (DataTypeHelper.compare(iDEModel.getKeyDEField().getStdDataType(), objKeyValue, objKeyValue2) != 0) {
				return this.getLocalization(MSG_CHECKFIELDDUPRULE_INFO, "值重复");
			}
		}
		return null;
	}

	/**
	 * 同步实体
	 * 
	 * @param et
	 * @param bRemove 是否为删除数据后同步
	 * @throws Exception
	 */
	protected void syncEntity(ET et, boolean bRemove) throws Exception {
		onSyncEntity(et, bRemove);
		onSyncIndexEntities(et, bRemove);
	}

	/**
	 * 同步实体触发
	 * 
	 * @param et
	 * @param bRemove
	 * @throws Exception
	 */
	protected void onSyncEntity(ET et, boolean bRemove) throws Exception {

	}

	/**
	 * 日志数据变化
	 * 
	 * @param nEvent
	 * @param et
	 * @param last
	 * @throws Exception
	 */
	protected void logDataChanged(int nEvent, ET et) throws Exception {
		// 判断当前实体是否日志数据变更
		if ((this.getDEModel().getDataChangeLogMode() == IDataEntity.DATACHGLOG_SINGLEDATA || this.getDEModel().getDataChangeLogMode() == IDataEntity.DATACHGLOG_FULLDATA) || (this.getDEModel().getDataChangeLogMode() != IDataEntity.DATACHGLOG_NONE && nEvent == IService.DATACHGEVENT_DELETE)) {
			DEDataChgService deDataChgService = (DEDataChgService) ServiceGlobal.getService(DEDataChgService.class, this.getSessionFactory());
			DEDataChg deDataChg = new DEDataChg();

			deDataChg.setDEId(this.getDEModel().getId());
			deDataChg.setDEName(this.getDEModel().getName());
			deDataChg.setEventType(nEvent);
			deDataChg.setDataKey(DataObject.getStringValue(et, this.getDEModel().getKeyDEField().getName(), ""));
			if (nEvent != IService.DATACHGEVENT_DELETE) {
				deDataChg.setLogicData(DataObject.toJSONString(et, true));
				if (this.getDEModel().getDataChangeLogMode() == IDataEntity.DATACHGLOG_FULLDATA) {
					ArrayList<JSONObject> list = new ArrayList<JSONObject>();
					this.onExportRelatedModel(et, list);
					deDataChg.setData(JSONArray.fromArray(list.toArray()).toString());
				} else {

				}
			} else {
				deDataChg.setLogicData(DataObject.toJSONString(et, true));
			}

			deDataChgService.create(deDataChg, false);
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.service.IService#updateWFInfo(int, net.ibizsys.pswf.core.IWFActionContext, net.ibizsys.paas.entity.IEntity)
	 */
	@Override
	public void updateWFInfo(int nActionMode, IWFActionContext iWFActionContext, ET entity) throws Exception {
		entity.setSessionFactory(this.getSessionFactory());
		final ET et = entity;
		final int nActionMode2 = nActionMode;
		final IWFActionContext iWFActionContext2 = iWFActionContext;

		log.debug("开始[updateWFInfo]作业");
		this.doServiceWork(new IServiceWork() {
			@Override
			public void execute(ITransaction iTransaction) throws Exception {
				onBeforeUpdateWFInfo(nActionMode2, iWFActionContext2, et);
				if (nActionMode2 == IService.UPDATEWFINFOMODE_INIT) {
					// 初始化流程
					initWF(et);
				} else if (nActionMode2 == IService.UPDATEWFINFOMODE_FINISH) {
					// 结束流程
					finishWF(et);
				} else if (nActionMode2 == IService.UPDATEWFINFOMODE_CANCELSTART) {
					// 取消流程启动
					cancelStartWF(et);
				} else {
					internalUpdate(et);
					internalGet(et, false);
					syncEntity(et, false);
				}
				onAfterUpdateWFInfo(nActionMode2, iWFActionContext2, et);
			}
		});
	}

	/**
	 * 初始化流程,检查
	 * 
	 * @param entity
	 * @throws Exception
	 */
	public void initWF(ET entity) throws Exception {
		final ET et = entity;
		this.doServiceWork(new IServiceWork() {
			@Override
			public void execute(ITransaction iTransaction) throws Exception {
				executeActionLogics(ACTION_INITWF, LOGICATTACHMODE_BEFORE, et);
				onInitWF(et);
				executeActionLogics(ACTION_INITWF, LOGICATTACHMODE_AFTER, et);
			}
		});
	}

	/**
	 * 流程初始化调用
	 * 
	 * @param et
	 * @throws Exception
	 */
	protected void onInitWF(ET et) throws Exception {
		internalUpdate(et);
		internalGet(et, false);
		syncEntity(et, false);
	}

	/**
	 * 完成流程
	 * 
	 * @param entity
	 * @throws Exception
	 */
	public void finishWF(ET entity) throws Exception {
		final ET et = entity;
		this.doServiceWork(new IServiceWork() {
			@Override
			public void execute(ITransaction iTransaction) throws Exception {
				executeActionLogics(ACTION_FINISHWF, LOGICATTACHMODE_BEFORE, et);
				onFinishWF(et);
				executeActionLogics(ACTION_FINISHWF, LOGICATTACHMODE_AFTER, et);
			}
		});
	}

	/**
	 * 完成工作触发
	 * 
	 * @param et
	 * @throws Exception
	 */
	protected void onFinishWF(ET et) throws Exception {
		internalUpdate(et);
		internalGet(et, false);
		syncEntity(et, false);
	}

	/**
	 * 用户关闭流程（取消）
	 * 
	 * @param entity
	 * @throws Exception
	 */
	public void closeWF(ET entity) throws Exception {
		final ET et = entity;
		this.doServiceWork(new IServiceWork() {
			@Override
			public void execute(ITransaction iTransaction) throws Exception {
				executeActionLogics(ACTION_CLOSEWF, LOGICATTACHMODE_BEFORE, et);
				onCloseWF(et);
				executeActionLogics(ACTION_CLOSEWF, LOGICATTACHMODE_AFTER, et);
			}
		});
	}

	/**
	 * 内部关闭流程处理
	 * 
	 * @param et
	 * @throws Exception
	 */
	protected void onCloseWF(ET et) throws Exception {
		internalUpdate(et);
		internalGet(et, false);
		syncEntity(et, false);
	}

	/**
	 * 取消启动流程
	 * 
	 * @param entity
	 * @throws Exception
	 */
	public void cancelStartWF(ET entity) throws Exception {
		final ET et = entity;
		this.doServiceWork(new IServiceWork() {
			@Override
			public void execute(ITransaction iTransaction) throws Exception {
				executeActionLogics(ACTION_CANCELSTARTWF, LOGICATTACHMODE_BEFORE, et);
				onCancelStartWF(et);
				executeActionLogics(ACTION_CANCELSTARTWF, LOGICATTACHMODE_AFTER, et);
			}
		});
	}

	/**
	 * 内部取消流程处理
	 * 
	 * @param et
	 * @throws Exception
	 */
	protected void onCancelStartWF(ET et) throws Exception {
		internalUpdate(et);
		internalGet(et, false);
		syncEntity(et, false);
	}

	/**
	 * 更新流程信息之前调用
	 * 
	 * @param nActionMode
	 * @param iWFActionContext
	 * @param entity
	 * @throws Exception
	 */
	protected void onBeforeUpdateWFInfo(int nActionMode, IWFActionContext iWFActionContext, ET entity) throws Exception {

	}

	/**
	 * 更新流程信息之后调用
	 * 
	 * @param nActionMode
	 * @param iWFActionContext
	 * @param entity
	 * @throws Exception
	 */
	protected void onAfterUpdateWFInfo(int nActionMode, IWFActionContext iWFActionContext, ET entity) throws Exception {

	}

	/**
	 * 同步索引的实体信息
	 * 
	 * @param et
	 * @param bRemove 是否为删除数据后同步
	 * @throws Exception
	 */
	protected void onSyncIndexEntities(ET et, boolean bRemove) throws Exception {

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.service.IService#getDataContextValue(net.ibizsys.paas.entity.IEntity, java.lang.String, net.ibizsys.paas.service.IDataContextParam)
	 */
	@Override
	public Object getDataContextValue(ET et, String strField, IDataContextParam iDataContextParam) throws Exception {
		if (et.contains(strField)) {
			return et.get(strField);
		}
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.service.IService#getDSLink()
	 */
	@Override
	public String getDSLink() {
		return strDSLink;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.service.IService#setDSLink(java.lang.String)
	 */
	@Override
	public void setDSLink(String strDSLink) {
		this.strDSLink = strDSLink;
	}

	/**
	 * 执行操作的附加逻辑
	 * 
	 * @param strAction
	 * @param strAttachMode
	 * @param et
	 * @throws Exception
	 */
	protected void executeActionLogics(String strAction, String strAttachMode, ET et) throws Exception {
		final ET et2 = et;
		IDataEntityModel iDataEntityModel = this.getDEModel();
		while (iDataEntityModel != null) {
			java.util.Iterator<IDELogicModel> logics = iDataEntityModel.getDEActionLogics(strAction, strAttachMode);
			if (logics != null) {
				while (logics.hasNext()) {
					final IDELogicModel iDELogicModel = logics.next();
					this.doServiceWork(new IServiceWork() {
						@Override
						public void execute(ITransaction iTransaction) throws Exception {
							ActionContext actionContextImpl = new ActionContext(null);
							actionContextImpl.setParam(iDELogicModel.getDefaultParamName(), et2);
							ET last2 = getLast(et2, true);
							if (last2 != null) {
								actionContextImpl.setParam(StringHelper.format("%1$s|LAST", iDELogicModel.getDefaultParamName()), last2);
							}
							actionContextImpl.setSessionFactory(getSessionFactory());
							iDELogicModel.execute(actionContextImpl);
						}
					});
				}
			}

			java.util.Iterator<IDEActionLogicModel> logics2 = iDataEntityModel.getDEActionLogics2(strAction, strAttachMode);
			if (logics2 != null) {
				while (logics2.hasNext()) {
					final IDEActionLogicModel iDEActionLogicModel = logics2.next();
					this.doServiceWork(new IServiceWork() {
						@Override
						public void execute(ITransaction iTransaction) throws Exception {
							IService service = DEModelGlobal.getDEModel(iDEActionLogicModel.getDEName()).getService(getSessionFactory());
							service.executeAction(iDEActionLogicModel.getDEActionName(), et2);
						}
					});
				}
			}

			iDataEntityModel = iDataEntityModel.getInheritDEModel();
		}

		/*
		 * java.util.Iterator<IDELogicModel<ET>> logics = this.getDEModel().getDEActionLogics(strAction, strAttachMode); if (logics != null) { while (logics.hasNext()) { final IDELogicModel<ET> iDELogicModel = logics.next(); this.doServiceWork(new IServiceWork() {
		 * 
		 * @Override public void execute(ITransaction iTransaction) throws Exception { ActionContext actionContextImpl = new ActionContext(null); actionContextImpl.setParam(iDELogicModel.getDefaultParamName(), et2); ET last2 = getLast(et2,true); if (last2 != null) { actionContextImpl.setParam(StringHelper.format("%1$s|LAST", iDELogicModel.getDefaultParamName()), last2); } actionContextImpl.setSessionFactory(getSessionFactory()); iDELogicModel.execute(actionContextImpl); } }); } }
		 * 
		 * java.util.Iterator<IDEActionLogicModel> logics2 = this.getDEModel().getDEActionLogics2(strAction, strAttachMode); if (logics2 != null) { while (logics2.hasNext()) { final IDEActionLogicModel iDEActionLogicModel = logics2.next(); this.doServiceWork(new IServiceWork() {
		 * 
		 * @Override public void execute(ITransaction iTransaction) throws Exception { IService service = DEModelGlobal.getDEModel(iDEActionLogicModel.getDEName()).getService(getSessionFactory()); service.executeAction(iDEActionLogicModel.getDEActionName(), et2); } }); } }
		 * 
		 */

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.service.IService#selectRaw(java.lang.String, net.ibizsys.paas.db.SqlParamList)
	 */
	@Override
	public ArrayList<IEntity> selectRaw(String strSql, SqlParamList sqlParamList) throws Exception {
		final String strSql2 = strSql;
		final SqlParamList sqlParamList2 = sqlParamList;
		final ArrayList<IEntity> list = new ArrayList<IEntity>();
		this.doServiceWork(new IServiceWork() {
			@Override
			public void execute(ITransaction iTransaction) throws Exception {
				ArrayList<IEntity> list2 = getDAO().executeRawSelectSql(null, strSql2, sqlParamList2);
				list.addAll(list2);
			}
		});

		return list;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.service.IService#executeRaw(java.lang.String, net.ibizsys.paas.db.SqlParamList)
	 */
	@Override
	public DBCallResult executeRaw(String strSql, SqlParamList sqlParamList) throws Exception {
		final String strSql2 = strSql;
		final SqlParamList sqlParamList2 = sqlParamList;
		final DBCallResultProxy dbCallResultProxy = new DBCallResultProxy();
		this.doServiceWork(new IServiceWork() {
			@Override
			public void execute(ITransaction iTransaction) throws Exception {
				dbCallResultProxy.setDBCallResult(getDAO().executeRawSql(null, strSql2, sqlParamList2));
			}
		});

		return dbCallResultProxy.getDBCallResult();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.service.IService#exportModel(net.ibizsys.paas.entity.IEntity, java.util.ArrayList)
	 */
	@Override
	public void exportModel(ET et, ArrayList<JSONObject> list) throws Exception {
		if (!et.isFullEntity()) {
			this.get(et);
		}

		onExportCurModel(et, list);
		onExportRelatedModel(et, list);
	}

	/**
	 * 导出当前模型触发
	 * 
	 * @param et
	 * @param list
	 * @throws Exception
	 */
	protected void onExportCurModel(ET et, ArrayList<JSONObject> list) throws Exception {
		// 判断当前实体是否为索引实体，如果是，转为实际数据输出
		String strValue = DataObject.toJSONString(et, true);
		if (StringHelper.isNullOrEmpty(strValue)) {
			return;
		}

		if (true) {
			JSONObject jo = new JSONObject();
			jo.put("srfdeid", getDEModel().getId());
			jo.put("srfdename", getDEModel().getName());
			jo.put("srfvalue", strValue);
			list.add(jo);
		}
	}

	/**
	 * 导出数据对象相关模型
	 * 
	 * @param et
	 * @param list
	 * @throws Exception
	 */
	protected void onExportRelatedModel(ET et, ArrayList<JSONObject> list) throws Exception {

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.service.IService#importModel(net.sf.json.JSONObject)
	 */
	@Override
	public String importModel(JSONObject jo) throws Exception {
		boolean bOpenImportSession = false;
		try {
			if (ImportSessionManager.getCurrentSession() == null) {
				bOpenImportSession = true;
				ImportSessionManager.openSession();
			}
			String retInfo = internalImportModel(jo);
			if (bOpenImportSession) {
				ImportSessionManager.closeSession();
			}
			return retInfo;
		} catch (Exception ex) {
			if (bOpenImportSession) {
				ImportSessionManager.closeSession();
			}
			throw ex;
		}

	}

	/**
	 * 内部导入模式处理
	 * 
	 * @param jo
	 * @return
	 * @throws Exception
	 */
	protected String internalImportModel(JSONObject jo) throws Exception {
		try {
			JSONObject joValue = jo.optJSONObject("srfvalue");
			if (joValue == null) {
				String strValue = "";
				String strCustomCall = jo.optString("srfcustomcall", "");
				if (!StringHelper.isNullOrEmpty(strCustomCall)) {
					ET et = this.getDEModel().createEntity();
					strValue = jo.optString("srfarg", "");
					if (StringHelper.isNullOrEmpty(strValue)) {
						this.executeAction(strCustomCall, et);
						return null;
					}
					DataObject.fromJSONObject(et, jo);
					this.executeAction(strCustomCall, et);
					return null;
				}

				String strRemoveCall = jo.optString("srfremove", "");
				if (StringHelper.compare(strRemoveCall, "TRUE", true) == 0) {
					ET et = this.getDEModel().createEntity();
					strValue = jo.optString("srfarg", "");
					et.set(this.getDEModel().getKeyDEField().getName(), strValue);
					this.remove(et);
					return null;
				}

				String strDER1NSync = jo.optString("srfder1nsync", "");
				if (StringHelper.compare(strDER1NSync, "TRUE", true) == 0) {
					return onSyncDER1NData(jo.optString("srfder1nid", ""), jo.optString("srfarg", ""), jo.optString("srfarg2", ""));
				}

				return null;
			}

			// 支持导入替换
			ET et = this.getDEModel().createEntity();
			DataObject.fromJSONObject(et, joValue);
			return onImportCurModel(et, joValue);
		} catch (Exception ex) {
			log.error(StringHelper.format("导入数据模型发生异常，%1$s", ex.getMessage(), ex));
			throw ex;
		}
	}

	/**
	 * 导入当前模型
	 * 
	 * @param et
	 * @param jo
	 */
	protected String onImportCurModel(ET et, JSONObject jo) throws Exception {
		IDataEntityModel iDEModel = this.getDEModel();
		int nCheckKeyState = this.checkKey(et);
		if (nCheckKeyState == CHECKKEYSTATE_DELETE) {
			throw new Exception(this.getLocalization(MSG_IMPORTMODEL_DATADELETE, new Object[]{ iDEModel.getName(), et.get(iDEModel.getKeyDEField().getName())},StringHelper.format("[%1$s]数据[%2$s]已经被删除，无法导入", iDEModel.getName(), et.get(iDEModel.getKeyDEField().getName()))));
		}

		if (!this.onTestImportCurModel(nCheckKeyState == CHECKKEYSTATE_OK, et)) {
			return null;
		}

		if (nCheckKeyState == CHECKKEYSTATE_OK) {
			this.create(et, false);
		} else
			this.update(et, false);

		return this.getDEModel().getDataInfo(et);
	}

	/**
	 * 判断是否导入当前模型
	 * 
	 * @param bInsert
	 * @param et
	 * @return
	 */
	protected boolean onTestImportCurModel(boolean bInsert, ET et) {
		return true;
	}

	/**
	 * 同步1：N 数据关系数据触发
	 * 
	 * @return
	 */
	protected String onSyncDER1NData(String strDER1NId, String strParentKey, String strDatas) throws Exception {
		return null;
	}


	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.service.IService#testValueRule(java.lang.String, java.lang.String, net.ibizsys.paas.entity.IEntity, java.lang.String, boolean)
	 */
	@Override
	public EntityFieldError testValueRule(String strDEFieldName, String strRule, IEntity iEntity, String strField, boolean bCreate) throws Exception {
		if (bCreate) {
			this.setLast(iEntity, EMPTYLAST, true);
		}

		boolean bTempMode = false;
		String strKey = DataObject.getStringValue(iEntity, this.getDEModel().getKeyDEField().getName(), null);
		if (!StringHelper.isNullOrEmpty(strKey)) {
			bTempMode = (strKey.indexOf(TEMPKEY) == 0);
		}

		String strRuleInfo = onTestValueRule(strDEFieldName, strRule, iEntity, bCreate, bTempMode);
		if (strRuleInfo != null) {
			EntityFieldError entityFieldError = new EntityFieldError();
			if (StringHelper.isNullOrEmpty(strField)) {
				entityFieldError.setFieldName(strDEFieldName);
			} else {
				entityFieldError.setFieldName(strField);
			}

			entityFieldError.setErrorType(EntityFieldError.ERROR_VALUERULE);
			entityFieldError.setErrorInfo(strRuleInfo);
			this.convertEntityFieldError(entityFieldError);
			return entityFieldError;
		}
		return null;
	}

	/**
	 * 判断值规则
	 * 
	 * @param strDEFieldName
	 * @param strRule
	 * @param et
	 * @return
	 * @throws Exception
	 */
	protected String onTestValueRule(String strDEFieldName, String strRule, IEntity et, boolean bCreate, boolean bTempMode) throws Exception {
		return null;
	}

	/**
	 * 获取本地化语言
	 * 
	 * @return
	 */
	protected String getLocalization() {
		if (WebContext.getCurrent() != null) {
			return WebContext.getCurrent().getLocalization();
		}
		return this.getDEModel().getSystemRuntime().getLocalization();
	}

	/**
	 * 获取关系限制删除信息
	 * 
	 * @param strDERName
	 * @param strDERLogicName
	 * @param strMajorDEName
	 * @param strMinorDEName
	 * @param strDataInfo
	 * @return
	 * @throws Exception
	 */
	protected String getRemoveRejectMsg(String strDERName, String strDERLogicName, String strMajorDEName, String strMinorDEName, String strDataInfo) throws Exception {
		String strLogicName = strDERLogicName;
		if (StringHelper.isNullOrEmpty(strLogicName)){
			strLogicName = DEModelGlobal.getDEModel(strMinorDEName).getLogicName();
		}
		return this.getLocalization(MSG_GETREMOVEREJECTMSG_INFO, new Object[]{DEModelGlobal.getDEModel(strMajorDEName).getLogicName(), strDataInfo, strLogicName}
			,StringHelper.format("%1$s[%2$s]存在关系数据[%3$s]，无法删除！", DEModelGlobal.getDEModel(strMajorDEName).getLogicName(), strDataInfo, strLogicName));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.service.IService#fillParentInfo(net.ibizsys.paas.entity.IEntity, java.lang.String, java.lang.String, java.lang.String)
	 */
	public void fillParentInfo(ET et, String strParentType, String strTypeParam, String strParentKey) throws Exception {
		this.onFillParentInfo(et, strParentType, strTypeParam, strParentKey);
	}

	/**
	 * 更新父数据
	 * 
	 * @param et
	 * @throws Exception
	 */
	public void updateParent(ET et) throws Exception {
		onUpdateParent(et);
	}

	/**
	 * 更新父数据
	 * 
	 * @param et
	 * @throws Exception
	 */
	protected void onUpdateParent(ET et) throws Exception {

	}

	/**
	 * 是否需要更新父数据
	 * 
	 * @return
	 */
	protected boolean isNeedUpdateParent() {
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.service.IService#beginMergeChild(net.ibizsys.paas.entity.IEntity)
	 */
	@Override
	public void beginMergeChild(ET et) throws Exception {

		ActionSession actionSession = ActionSessionManager.getCurrentSession();
		if (actionSession == null) throw new Exception("当前操作会话无效");
		String strMergeChildKey = StringHelper.format("__SRF__MERGE_%1$s_%2$s", this.getDEModel().getName(), et.get(this.getDEModel().getKeyDEField().getName()));
		Object objValue = actionSession.getActionParam(strMergeChildKey);
		if (objValue == null) {
			actionSession.setActionParam(strMergeChildKey, new ArrayList<String>());
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.service.IService#endMergeChild(net.ibizsys.paas.entity.IEntity, boolean)
	 */
	@Override
	public void endMergeChild(ET et, boolean bCancel) throws Exception {
		ActionSession actionSession = ActionSessionManager.getCurrentSession();
		if (actionSession == null) throw new Exception("当前操作会话无效");
		String strMergeChildKey = StringHelper.format("__SRF__MERGE_%1$s_%2$s", this.getDEModel().getName(), et.get(this.getDEModel().getKeyDEField().getName()));
		Object objValue = actionSession.removeActionParam(strMergeChildKey);
		if (objValue == null || bCancel) {
			return;
		}

		ArrayList<String> arrList = (ArrayList<String>) objValue;
		if (arrList.size() == 0) return;

		for (String strTag : arrList) {
			String items[] = strTag.split("[|]");
			mergeChild(items[0], items[1], et.get(this.getDEModel().getKeyDEField().getName()));
		}

		// 进行更新
		String strKey = DataObject.getStringValue(et.get(this.getDEModel().getKeyDEField().getName()));
		if (strKey.indexOf(TEMPKEY) == 0) {
			this.internalGetTemp(et, false);
		} else {
			this.internalGet(et, false);
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.service.IService#mergeChild(java.lang.String, java.lang.String, java.lang.Object)
	 */
	@Override
	public void mergeChild(String strChildType, String strTypeParam, Object objKey) throws Exception {

		ActionSession actionSession = ActionSessionManager.getCurrentSession();
		if (actionSession != null) {
			String strMergeChildKey = StringHelper.format("__SRF__MERGE_%1$s_%2$s", this.getDEModel().getName(), objKey);
			Object objValue = actionSession.getActionParam(strMergeChildKey);
			if (objValue != null) {
				ArrayList<String> arrList = (ArrayList<String>) objValue;
				arrList.add(StringHelper.format("%1$s|%2$s", strChildType, strTypeParam));
				return;
			}
		}

		ET et = this.getDEModel().createEntity();
		et.set(this.getDEModel().getKeyDEField().getName(), objKey);
		if (onMergeChild(strChildType, strTypeParam, et)) {
			// 进行更新
			String strKey = DataObject.getStringValue(objKey);
			if (strKey.indexOf(TEMPKEY) == 0) {
				this.sysUpdateTemp(et, false);
			} else {
				this.sysUpdate(et, false);
			}
		}
	}

	/**
	 * 合并子数据
	 * 
	 * @param strChildType
	 * @param strTypeParam
	 * @param et
	 * @return 是否发生变化
	 * @throws Exception
	 */
	protected boolean onMergeChild(String strChildType, String strTypeParam, ET et) throws Exception {
		return false;
	}

	@Override
	public void postConstruct() throws Exception {

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.service.IService#copyDetails(net.ibizsys.paas.entity.IEntity, java.lang.Object)
	 */
	@Override
	public void copyDetails(ET et, Object objSourceKey) throws Exception {
		
		final IServicePlugin iServicePlugin = getPlugin();
		if(iServicePlugin!=null && iServicePlugin.doCopyDetails(getService(), IServicePlugin.ACTIONPOS_ENTER,et,objSourceKey)==PluginActionResult.Replace)
			return;
		
		onCopyDetails(et, objSourceKey);
	}

	/**
	 * 拷贝源数据明细
	 * 
	 * @param et
	 * @param objSourceKey
	 * @throws Exception
	 */
	protected void onCopyDetails(ET et, Object objSourceKey) throws Exception {

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.service.IService#syncData(net.ibizsys.psrt.srv.common.entity.DataSyncIn, net.ibizsys.paas.core.IDEDataSyncIn)
	 */
	@Override
	public void syncData(DataSyncIn dataSyncIn, IDEDataSyncIn iDEDataSyncIn) throws Exception {

		final DataSyncIn dataSyncIn2 = dataSyncIn;
		final IDEDataSyncIn iDEDataSyncIn2 = iDEDataSyncIn;
		this.doServiceWork(new IServiceWork() {
			@Override
			public void execute(ITransaction iTransaction) throws Exception {
				if (!testSyncData(dataSyncIn2, iDEDataSyncIn2)) {
					return;
				}
				ActionSessionManager.getCurrentSession().setActionParam(DATASYNCIN, dataSyncIn2);
				onSyncData(dataSyncIn2, iDEDataSyncIn2);
				ActionSessionManager.getCurrentSession().removeActionParam(DATASYNCIN);
			}
		});
	}

	/**
	 * 判断数据是否导入
	 * 
	 * @param dataSyncIn
	 * @param iDEDataSyncIn
	 * @return
	 * @throws Exception
	 */
	protected boolean testSyncData(DataSyncIn dataSyncIn, IDEDataSyncIn iDEDataSyncIn) throws Exception {
		if ((dataSyncIn.getEventType() & iDEDataSyncIn.getEventType()) == 0) return false;

		if (StringHelper.isNullOrEmpty(iDEDataSyncIn.getTestDEActionName())) {
			return true;
		}

		ET iEntity = getDEModel().createEntity();
		if (!StringHelper.isNullOrEmpty(dataSyncIn.getLogicData())) {
			DataObject.fromJSONObject(iEntity, JSONObject.fromString(dataSyncIn.getLogicData()));
		}

		executeAction(iDEDataSyncIn.getTestDEActionName(), iEntity);
		return DataObject.getBoolValue(iEntity, ServiceBase.RET, false);
	}

	/**
	 * 处理数据导入
	 * 
	 * @param dataSyncIn
	 * @param iDEDataSyncInc
	 * @throws Exception
	 */
	protected void onSyncData(DataSyncIn dataSyncIn, IDEDataSyncIn iDEDataSyncInc) throws Exception {
		if (StringHelper.isNullOrEmpty(iDEDataSyncInc.getImportDEActionName())) {
			// 没有指定输入行为，按照常规处理
			if (dataSyncIn.getEventType() == DataChangeEventCodeListModel.DELETE) {
				// 移除数据
				ET iEntity = getDEModel().createEntity();
				iEntity.set(getDEModel().getKeyDEField().getName(), dataSyncIn.getDataKey());
				try {
					remove(iEntity);
				} catch (Exception ex) {
					throw new Exception(StringHelper.format("移除实体[%1$s]数据[%2$s]发生错误，%3$s", dataSyncIn.getDEName(), dataSyncIn.getDataKey(), ex.getMessage()));
				}
			} else if ((dataSyncIn.getEventType() & DataChangeEventCodeListModel.CREATEORUPDATE) > 0) {
				ET iEntity = getDEModel().createEntity();
				JSONObject jo = JSONObject.fromString(dataSyncIn.getLogicData());
				DataObject.fromJSONObject(iEntity, jo);
				try {
					save(iEntity);
				} catch (Exception ex) {
					throw new Exception(StringHelper.format("保存实体[%1$s]数据[%2$s]发生错误，%3$s", dataSyncIn.getDEName(), dataSyncIn.getDataKey(), ex.getMessage()));
				}
			}
		} else {
			ET iEntity = getDEModel().createEntity();
			JSONObject jo = JSONObject.fromString(dataSyncIn.getLogicData());
			DataObject.fromJSONObject(iEntity, jo);
			try {
				executeAction(iDEDataSyncInc.getImportDEActionName(), iEntity);
			} catch (Exception ex) {
				throw new Exception(StringHelper.format("导入实体[%1$s]数据[%2$s]发生错误，%3$s", dataSyncIn.getDEName(), dataSyncIn.getDataKey(), ex.getMessage()));
			}
		}
	}
	

	/**
	 * 获取本地化内容
	 * @param strResId
	 * @param params
	 * @param strDefault
	 * @return
	 */
	protected String getLocalization(String strResId,  Object[] params, String strDefault) {
		if(this.getWebContext()!=null)
			return this.getWebContext().getLocalization(strResId, params, strDefault);
		return strDefault;
	}
	
	
	/**
	 * 获取本地化内容
	 * @param strResId
	 * @param strDefault
	 * @return
	 */
	protected String getLocalization(String strResId, String strDefault) {
		if(this.getWebContext()!=null)
			return this.getWebContext().getLocalization(strResId, null, strDefault);
		return strDefault;
	}
	
	
	@Override
	public ISystemModel getSystemModel() {
		return this.getDEModel().getSystemModel();
	}
	
	/**
	 * 获取服务对象
	 * @return
	 */
	final private IService getService(){
		return this;
	}
	
	
	/**
	 * 获取服务插件
	 * @return
	 */
	final protected IServicePlugin getPlugin(){
		if(!this.bCalcServicePlugin ){
			this.iServicePlugin = this.getDEModel().getServicePlugin();
			this.bCalcServicePlugin = true;
		}
		
		return this.iServicePlugin;
		
		
		
	}
}
