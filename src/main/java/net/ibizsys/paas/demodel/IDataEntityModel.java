package net.ibizsys.paas.demodel;

import java.util.ArrayList;

import net.ibizsys.paas.core.IDEACMode;
import net.ibizsys.paas.core.IDEAction;
import net.ibizsys.paas.core.IDEActionWizard;
import net.ibizsys.paas.core.IDEActionWizardGroup;
import net.ibizsys.paas.core.IDEBATable;
import net.ibizsys.paas.core.IDEDataExport;
import net.ibizsys.paas.core.IDEDataImport;
import net.ibizsys.paas.core.IDEDataQuery;
import net.ibizsys.paas.core.IDEDataSet;
import net.ibizsys.paas.core.IDEDataSetCond;
import net.ibizsys.paas.core.IDEDataSync;
import net.ibizsys.paas.core.IDEFSearchMode;
import net.ibizsys.paas.core.IDEField;
import net.ibizsys.paas.core.IDELogic;
import net.ibizsys.paas.core.IDEMainState;
import net.ibizsys.paas.core.IDER1N;
import net.ibizsys.paas.core.IDEUIAction;
import net.ibizsys.paas.core.IDEWF;
import net.ibizsys.paas.core.IDataEntity;
import net.ibizsys.paas.data.ISimpleDataObject;
import net.ibizsys.paas.db.IDBDialect;
import net.ibizsys.paas.db.ISelectCond;
import net.ibizsys.paas.db.ISelectContext;
import net.ibizsys.paas.entity.IEntity;
import net.ibizsys.paas.security.IDEDataAccMgr;
import net.ibizsys.paas.service.IService;
import net.ibizsys.paas.service.IServicePlugin;
import net.ibizsys.paas.sysmodel.ISystemModel;
import net.ibizsys.paas.sysmodel.ISystemRuntime;
import net.ibizsys.paas.web.IWebContext;

import org.hibernate.SessionFactory;

/**
 * 实体模型对象接口
 * 
 * @author lionlau
 * @param <ET>
 */
public interface IDataEntityModel<ET extends IEntity> extends IDataEntity {
	/**
	 * 获取逻辑名称
	 * 
	 * @return
	 */
	String getLogicName(String strLocalization);

	/**
	 * 建立实体对象
	 * 
	 * @return
	 */
	ET createEntity();

	/**
	 * 建立实体对象清单
	 * 
	 * @return
	 */
	ArrayList<ET> createEntityList();

	/**
	 * 获取对应的服务对象
	 * 
	 * @return
	 */
	IService getService();

	/**
	 * 获取服务的标识
	 * 
	 * @return
	 */
	String getServiceId();

	/**
	 * 获取对应的服务对象
	 * 
	 * @param sessionFactory 会话工厂
	 * @return
	 */
	IService getService(SessionFactory sessionFactory) throws Exception;

	/**
	 * 获取实体行为附加的逻辑（内部逻辑）
	 * 
	 * @param strAction
	 * @param strAttachMode
	 * @return
	 */
	java.util.Iterator<IDELogicModel<ET>> getDEActionLogics(String strAction, String strAttachMode);

	/**
	 * 获取实体行为附加的逻辑（外部实体）
	 * 
	 * @param strAction
	 * @param strAttachMode
	 * @return
	 */
	java.util.Iterator<IDEActionLogicModel> getDEActionLogics2(String strAction, String strAttachMode);

	/**
	 * 获取对应的属性搜索模式
	 * 
	 * @param strName
	 * @param bTryMode
	 * @return
	 * @throws Exception
	 */
	IDEFSearchMode getDEFSearchMode(String strName, boolean bTryMode) throws Exception;

	/**
	 * 获取获取数据的命令模型(GET)
	 * 
	 * @param iDBDialect
	 * @param bTempMode 临时数据模式
	 * @return
	 */
	ISqlCommandModel getGetSqlCommandModel(IDBDialect iDBDialect, boolean bTempMode) throws Exception;

	/**
	 * 获取检查数据主键的命令模型(CheckKey)
	 * 
	 * @param iDBDialect
	 * @param bTempMode 临时数据模式
	 * @return
	 */
	ISqlCommandModel getCheckKeySqlCommandModel(IDBDialect iDBDialect, boolean bTempMode) throws Exception;

	/**
	 * 获取建立数据的命令模型(Create)
	 * 
	 * @param iDBDialect
	 * @param bTempMode 临时数据模式
	 * @return
	 */
	ISqlCommandModel getCreateSqlCommandModel(IDBDialect iDBDialect, boolean bTempMode) throws Exception;

	/**
	 * 获取更新数据的命令模型(Update)
	 * 
	 * @param iDBDialect
	 * @param iEntity 当前数据对象
	 * @param bTempMode 临时数据模式
	 * @return
	 */
	ISqlCommandModel getUpdateSqlCommandModel(IDBDialect iDBDialect, IEntity iEntity, boolean bTempMode) throws Exception;

	/**
	 * 获取更新数据的命令模型(Sys Update)
	 * 
	 * @param iDBDialect
	 * @param iEntity 当前数据对象
	 * @param bTempMode 临时数据模式
	 * @return
	 */
	ISqlCommandModel getSysUpdateSqlCommandModel(IDBDialect iDBDialect, IEntity iEntity, boolean bTempMode) throws Exception;

	/**
	 * 获取删除数据的命令模型(Remove)
	 * 
	 * @param iDBDialect
	 * @param bTempMode 临时数据模式
	 * @return
	 */
	ISqlCommandModel getRemoveSqlCommandModel(IDBDialect iDBDialect, boolean bTempMode) throws Exception;

	/**
	 * 获取查询的命令模型(Select)
	 * 
	 * @param iDBDialect
	 * @param iSelectCond
	 * @param bTempMode 临时数据模式
	 * @return
	 * @throws Exception
	 */
	ISqlCommandModel getSelectSqlCommandModel(IDBDialect iDBDialect, ISelectCond iSelectCond, boolean bTempMode) throws Exception;

	/**
	 * 获取查询的命令模型(Select)增强
	 * 
	 * @param iDBDialect
	 * @param iSelectContext 查询上下文参数
	 * @param bTempMode 临时数据模式
	 * @return
	 * @throws Exception
	 */
	ISqlCommandModel getSelectSqlCommandModelEx(IDBDialect iDBDialect, ISelectContext iSelectContext, boolean bTempMode) throws Exception;

	/**
	 * 获取获取数据快速搜索条件
	 * 
	 * @param strQuickSearch
	 * @return
	 * @throws Exception
	 */
	IDEDataSetCond getFetchQuickSearchCondition(String strQuickSearch) throws Exception;

	/**
	 * 获取系统运行时对象
	 * 
	 * @return
	 */
	ISystemRuntime getSystemRuntime();

	/**
	 * 获取数据对象的主状态标识
	 * 
	 * @param iSimpleDataObject
	 * @return
	 * @throws Exception
	 */
	String getDEMainStateTag(ISimpleDataObject iSimpleDataObject) throws Exception;

	/**
	 * 获取数据主信息
	 * 
	 * @param et
	 * @return
	 * @throws Exception
	 */
	String getDataInfo(ET et) throws Exception;

	/**
	 * 获取默认的实体工作流模型
	 * 
	 * @return
	 */
	IDEWF getDefaultDEWF();

	/**
	 * 获取实体流程配置集合
	 * 
	 * @return
	 */
	java.util.Iterator<IDEWF> getDEWFs();

	/**
	 * 获取指定关系的关系属性
	 * 
	 * @param strDERId
	 * @return
	 * @throws Exception
	 */
	IDEField getPickupDEField(String strDERId) throws Exception;

	/**
	 * 通过预置属性类型获取属性
	 * 
	 * @param strPreDefinedType
	 * @param bTryMode 是否尝试获取
	 * @return
	 * @throws Exception
	 */
	IDEField getDEFieldByPDT(String strPreDefinedType, boolean bTryMode) throws Exception;

	/**
	 * 注册行为附加逻辑
	 * 
	 * @param strAction
	 * @param strAttachMode
	 * @param strDstDEName
	 * @param strDstActionName
	 * @throws Exception
	 */
	void registerDEActionLogic(String strAction, String strAttachMode, String strDstDEName, String strDstActionName) throws Exception;

	/**
	 * 获取数据访问控制主关系
	 * 
	 * @param et
	 * @return
	 */
	IDER1N getAccMasterDER(ET et) throws Exception;

	/**
	 * 是否支持审计
	 * 
	 * @return
	 */
	boolean isEnableAudit();

	/**
	 * 是否日志审计明细
	 * 
	 * @return
	 */
	boolean isLogAuditDetail();

	/**
	 * 获取实体数据访问管理对象
	 * 
	 * @return
	 */
	IDEDataAccMgr getDEDataAccMgr();

	/**
	 * 判断数据是否在流程中
	 * 
	 * @param iEntity
	 * @return
	 * @throws Exception
	 */
	IDEWFModel testDataInWF(IEntity iEntity) throws Exception;

	/**
	 * 获取数据的组织标识
	 * 
	 * @param iEntity
	 * @return
	 */
	Object getOrgId(IEntity iEntity) throws Exception;

	/**
	 * 获取系统模型对象
	 * 
	 * @return
	 */
	ISystemModel getSystemModel();

	/**
	 * 获取更新时间属性模型
	 * 
	 * @return
	 */
	IDEField getUpdateDateDEField();

	/**
	 * 注册实体属性
	 * 
	 * @param iDEField
	 */
	void registerDEField(IDEField iDEField);

	/**
	 * 注册实体自动填充模式
	 * 
	 * @param iDEACMode
	 */
	void registerDEACMode(IDEACMode iDEACMode);

	/**
	 * 注册实体逻辑
	 * 
	 * @param iDELogic
	 */
	void registerDELogic(IDELogic iDELogic);

	/**
	 * 注册实体界面行为
	 * 
	 * @param iDEUIAction
	 */
	void registerDEUIAction(IDEUIAction iDEUIAction);

	/**
	 * 注册实体工作流
	 * 
	 * @param iDEWF
	 */
	void registerDEWF(IDEWF iDEWF);

	/**
	 * 注册实体主状态
	 * 
	 * @param iDEMainState
	 */
	void registerDEMainState(IDEMainState iDEMainState);

	/**
	 * 注册数据查询模型
	 * 
	 * @param iDEDataQueryCode
	 */
	void registerDEDataQuery(IDEDataQuery iDEDataQuery);

	/**
	 * 注册数据结果集模型
	 * 
	 * @param iDEDataSet
	 */
	void registerDEDataSet(IDEDataSet iDEDataSet);

	/**
	 * 注册实体行为
	 * 
	 * @param iDEAction
	 */
	void registerDEAction(IDEAction iDEAction);

	/**
	 * 注册行为附加逻辑
	 * 
	 * @param strAction
	 * @param strAttachMode
	 * @param strLogicName
	 * @throws Exception
	 */
	void registerDEActionLogic(String strAction, String strAttachMode, String strLogicName) throws Exception;

	/**
	 * 注册实体数据导出
	 * 
	 * @param iDEDataExport
	 */
	void registerDEDataExport(IDEDataExport iDEDataExport);

	/**
	 * 注册实体数据导入
	 * 
	 * @param iDEDataImport
	 */
	void registerDEDataImport(IDEDataImport iDEDataImport);

	
	/**
	 * 注册实体操作行为向导
	 * 
	 * @param iDEActionWizardGroup
	 */
	void registerDEActionWizard(IDEActionWizard iDEActionWizard);
	
	
	/**
	 * 注册实体操作行为向导组
	 * 
	 * @param iDEActionWizardGroup
	 */
	void registerDEActionWizardGroup(IDEActionWizardGroup iDEActionWizardGroup);
	
	
	/**
	 * 获取预定义的视图标识
	 * 
	 * @param strPreDefineType
	 * @param bTryMode
	 * @return
	 */
	String getDEViewIdByPDT(String strPreDefineType, boolean bTryMode) throws Exception;

	/**
	 * 注册预定义视图
	 * 
	 * @param strPreDefineType
	 * @param strDEViewId
	 * @throws Exception
	 */
	void registerPDTDEView(String strPreDefineType, String strDEViewId) throws Exception;

	/**
	 * 获取单数据实体视图预定义参数
	 * 
	 * @param et
	 * @param bEnableWF 是否支持工作流
	 * @param bWFWorkMode 是否为工作模式
	 * @return
	 * @throws Exception
	 */
	String getSDDEViewPDTParam(ET et, boolean bEnableWF, boolean bWFWorkMode) throws Exception;

	/**
	 * 是否支持多表单
	 * 
	 * @return
	 */
	boolean isEnableMultiForm();

	/**
	 * 获取索引实体类型
	 * 
	 * @return
	 */
	String getIndexDEType();

	/**
	 * 获取多表单识别属性
	 * 
	 * @return
	 */
	IDEField getMultiFormDEField();

	/**
	 * 获取索引类型识别属性
	 * 
	 * @return
	 */
	IDEField getIndexTypeDEField();

	/**
	 * 获取继承的实体模型对象
	 * 
	 * @return
	 * @throws Exception
	 */
	IDataEntityModel getInheritDEModel() throws Exception;

	/**
	 * 注册实体操作标识映射
	 * 
	 * @param strDEOPPrivTag
	 * @param strDERName
	 * @param strMapDEOPPrivTag
	 */
	void registerMapDEOPPrivTag(String strDEOPPrivTag, String strDERName, String strMapDEOPPrivTag);

	/**
	 * 获取数据对应的流程模式
	 * 
	 * @param et
	 * @param iWebContext
	 * @return
	 * @throws Exception
	 */
	IDEWFModel getDEWFModel(ET et, IWebContext iWebContext) throws Exception;

	/**
	 * 注册实体数据同步
	 * 
	 * @param iDEAction
	 */
	void registerDEDataSync(IDEDataSync iDEDataSync);

	/**
	 * 获取联合键值属性集合
	 * 
	 * @return
	 */
	java.util.Iterator<IDEField> getUnionKeyValueDEFields();

	/**
	 * 获取实体属性的SQL条件语句
	 * 
	 * @param iDBDialect
	 * @param strFieldName
	 * @param strFieldExp
	 * @param nStdDataType
	 * @param strCondOp
	 * @param strValue
	 * @return
	 * @throws Exception
	 */
	String getDEFieldConditionSql(IDBDialect iDBDialect, String strFieldName, String strFieldExp, int nStdDataType, String strCondOp, String strValue) throws Exception;
	
	
	
	
	
	/**
	 * 注册实体大数据表
	 * 
	 * @param iDEBATable
	 */
	void registerDEBATable(IDEBATable iDEBATable);
	
	
	
	/**
	 * 设置Service插件，继承原功能
	 * @param iServicePlugin
	 * @throws Exception
	 */
	void setServicePlugin(IServicePlugin iServicePlugin) throws Exception;
	
	
	/**
	 * 设置Service插件，
	 * @param iServicePlugin
	 * @param bResetOrigin 是否重置原插件功能 
	 * @throws Exception
	 */
	void setServicePlugin(IServicePlugin iServicePlugin,boolean bIgnoreOrigin) throws Exception;
	
	
	
	/**
	 * 获取Service插件
	 * @return
	 */
	IServicePlugin getServicePlugin();
	
	


}
