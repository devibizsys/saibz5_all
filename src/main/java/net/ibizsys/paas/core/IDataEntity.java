package net.ibizsys.paas.core;

import net.ibizsys.paas.data.IDataObject;
import net.ibizsys.paas.data.ISimpleDataObject;
import net.ibizsys.psba.core.IBAScheme;

/**
 * 实体模型接口
 * 
 * @author lionlau
 *
 */
public interface IDataEntity extends IModelBase {
	/**
	 * 默认数据库
	 */
	public final static String DSLINK_DEFAULT = "DEFAULT";

	/**
	 * 数据连接2
	 */
	public final static String DSLINK_DB2 = "DB2";

	/**
	 * 数据连接3
	 */
	public final static String DSLINK_DB3 = "DB3";

	/**
	 * 数据连接4
	 */
	public final static String DSLINK_DB4 = "DB4";

	/**
	 * 动态实体（静态）
	 */
	public final static int DYNAMICMODE_STATIC = 0;

	/**
	 * 动态实体（动态）
	 */
	public final static int DYNAMICMODE_DYNAMIC = 1;

	/**
	 * 动态实体（扩展）
	 */
	public final static int DYNAMICMODE_EXTEND = 2;

	// 定义数据访问控制方式代码表
	/**
	 * 无控制
	 */
	public final static int DATAACCCTRL_NONE = 0;

	/**
	 * 自控制
	 */
	public final static int DATAACCCTRL_SELF = 1;

	/**
	 * 附属主实体控制
	 */
	public final static int DATAACCCTRL_MASTER = 2;

	/**
	 * 无审计
	 */
	public final static int AUDITMODE_NONE = 0;

	/**
	 * 基本审计
	 */
	public final static int AUDITMODE_STD = 1;

	/**
	 * 详细审计（含变化记录）
	 */
	public final static int AUDITMODE_ADV = 2;

	/**
	 * 索引实体类型（索引）
	 */
	public final static String INDEXDETYPE_INDEX = "INDEX";

	/**
	 * 索引实体类型（继承）
	 */
	public final static String INDEXDETYPE_INHERIT = "INHERIT";

	/**
	 * 数据变更日志，无
	 */
	public final static int DATACHGLOG_NONE = 0;

	/**
	 * 数据变更日志，日志主键，后续展开
	 */
	// public final static int DATACHGLOG_KEY =1;

	/**
	 * 数据变更日志，日志数据（同步）
	 */
	public final static int DATACHGLOG_SINGLEDATA = 2;

	/**
	 * 数据变更日志，日志数据（含关联数据）（同步）
	 */
	public final static int DATACHGLOG_FULLDATA = 3;

	/**
	 * 数据变更日志，日志数据（异步）
	 */
	public final static int DATACHGLOG_SINGLEDATA_ASYNC = 4;

	/**
	 * 数据变更日志，日志数据（含关联数据）（异步）
	 */
	public final static int DATACHGLOG_FULLDATA_ASYNC = 5;

	/**
	 * 无存储
	 */
	public final static int STORAGEMODE_NONE = 0;

	/**
	 * SQL
	 */
	public final static int STORAGEMODE_SQL = 1;

	/**
	 * NoSQL
	 */
	public final static int STORAGEMODE_NoSQL = 2;

	/**
	 * SQL&NoSQL
	 */
	public final static int STORAGEMODE_SQLAndNoSQL = 3;

	/**
	 * 获取系统
	 * 
	 * @return
	 */
	ISystem getSystem();

	/**
	 * 获取实体属性
	 * 
	 * @return
	 * @throws Exception
	 */
	java.util.Iterator<IDEField> getDEFields() throws Exception;

	/**
	 * 查找一个属性
	 * 
	 * @param strDEFieldName
	 * @param bTryMode
	 * @return
	 * @throws Exception
	 */
	IDEField getDEField(String strDEFieldName, boolean bTryMode) throws Exception;

	/**
	 * 获取主键属性
	 * 
	 * @return
	 */
	IDEField getKeyDEField();

	/**
	 * 获取主属性
	 * 
	 * @return
	 */
	IDEField getMajorDEField();

	/**
	 * 获取逻辑属性
	 * 
	 * @return
	 */
	IDEField getLogicValidDEField();

	/**
	 * 获取表名
	 * 
	 * @return
	 */
	String getTableName();

	/**
	 * 获取表名
	 * 
	 * @return
	 */
	String getUserTable();

	/**
	 * 获取视图名称
	 * 
	 * @return
	 */
	String getViewName();

	/**
	 * 获取关系
	 * 
	 * @param bMajor
	 * @param strPSDERId
	 * @return
	 * @throws Exception
	 */
	IDERBase getDER(boolean bMajor, String strDERId) throws Exception;

	/**
	 * 获取实体关系集合
	 * 
	 * @param bMajor 是否为主实体
	 * @return
	 */
	java.util.Iterator<IDERBase> getDERs(boolean bMajor);

	/**
	 * 获取数据结合对象
	 * 
	 * @param strDEDataSetId
	 * @return
	 * @throws Exception
	 */
	IDEDataSet getDEDataSet(String strDEDataSetId) throws Exception;

	/**
	 * 获取逻辑名称
	 * 
	 * @return
	 */
	String getLogicName();

	/**
	 * 获取实体行为
	 * 
	 * @param strDEActionId
	 * @return
	 * @throws Exception
	 */
	IDEAction getDEAction(String strDEActionId) throws Exception;

	/**
	 * 获取实体逻辑
	 * 
	 * @param strDELogicId
	 * @return
	 * @throws Exception
	 */
	IDELogic getDELogic(String strDELogicId) throws Exception;

	/**
	 * 获取实体界面行为
	 * 
	 * @param strDEActionId
	 * @return
	 * @throws Exception
	 */
	IDEUIAction getDEUIAction(String strDEUIActionId) throws Exception;

	/**
	 * 获取实体工作流配置
	 * 
	 * @param strDEWFId
	 * @return
	 * @throws Exception
	 */
	IDEWF getDEWF(String strDEWFId) throws Exception;

	/**
	 * 建立数据对象
	 * 
	 * @return
	 * @throws Exception
	 */
	IDataObject createDataObject() throws Exception;

	/**
	 * 获取指定的自填模式
	 * 
	 * @param strACModeName
	 * @return
	 * @throws Exception
	 */
	IDEACMode getDEACMode(String strACModeName) throws Exception;

	/**
	 * 获取默认的自填模式
	 * 
	 * @return
	 * @throws Exception
	 */
	IDEACMode getDefaultDEACMode() throws Exception;

	/**
	 * 获取数据数据
	 * 
	 * @param strDEDataQueryId
	 * @return
	 * @throws Exception
	 */
	IDEDataQuery getDEDataQuery(String strDEDataQueryId) throws Exception;

	/**
	 * 获取数据集合
	 * 
	 * @param strName
	 * @param bTry
	 * @return
	 * @throws Exception
	 */
	IDEDataSet getDEDataSet(String strName, boolean bTry) throws Exception;

	/**
	 * 获取逻辑有效
	 * 
	 * @return
	 */
	boolean isLogicValid();

	/**
	 * 获取逻辑有效值
	 * 
	 * @param bValid
	 * @return
	 */
	Object getLogicValidValue(boolean bValid);

	/**
	 * 获取默认数据源链接
	 * 
	 * @return
	 */
	String getDSLink();

	/**
	 * 是否同时支持多数据源
	 * 
	 * @return
	 */
	boolean isEnableMultiDS();

	/**
	 * 计算实体主状态
	 * 
	 * @param iEntity
	 * @return
	 * @throws Exception
	 */
	IDEMainState getDEMainState(ISimpleDataObject iSimpleDataObject) throws Exception;

	/**
	 * 获取数据导入模式
	 * 
	 * @param strDEDataImportId
	 * @return
	 * @throws Exception
	 */
	IDEDataImport getDEDataImport(String strDEDataImportId) throws Exception;

	/**
	 * 获取数据输出模式
	 * 
	 * @param strDEDataExportId
	 * @return
	 * @throws Exception
	 */
	IDEDataExport getDEDataExport(String strDEDataExportId) throws Exception;
	
	/**
	 * 获取实体操作向导组对象
	 * @param strDEActionWizardGroupId
	 * @return
	 * @throws Exception
	 */
	IDEActionWizardGroup getDEActionWizardGroup(String strDEActionWizardGroupId) throws Exception;
	
	/**
	 * 获取实体操作向导组对象
	 * @param strDEActionWizardGroupId
	 * @param  bTryMode 尝试获取
	 * @return
	 * @throws Exception
	 */
	IDEActionWizardGroup getDEActionWizardGroup(String strDEActionWizardGroupId,boolean bTryMode) throws Exception;
	
	
	
	/**
	 * 获取实体操作向导对象
	 * @param strDEActionWizardId
	 * @return
	 * @throws Exception
	 */
	IDEActionWizard getDEActionWizard(String strDEActionWizardId) throws Exception;
	

	/**
	 * 获取数据访问控制模式
	 * 
	 * @return
	 */
	int getDataAccCtrlMode();

	/**
	 * 获取数据审计模式
	 * 
	 * @return
	 */
	int getAuditMode();

	/**
	 * 获取指定索引关系
	 * 
	 * @param bMajor
	 * @param strIndexValue
	 * @return
	 * @throws Exception
	 */
	IDERIndex getDERIndex(boolean bMajor, String strIndexValue) throws Exception;

	/**
	 * 获取继承的数据实体
	 * 
	 * @return
	 */
	IDataEntity getInheritDataEntity() throws Exception;

	/**
	 * 获取实体动态模式
	 * 
	 * @return
	 */
	int getDynamicMode();

	/**
	 * 获取映射的权限操作标识
	 * 
	 * @param strDEOPPrivTag
	 * @param strDERName
	 * @return
	 */
	String getMapDEOPPrivTag(String strDEOPPrivTag, String strDERName);

	/**
	 * 获取数据变化日志模式
	 * 
	 * @return
	 */
	int getDataChangeLogMode();

	/**
	 * 获取实体数据同步配置
	 * 
	 * @param bIn 是否为输入配置
	 * @return
	 */
	java.util.Iterator<IDEDataSync> getDEDataSyncs(boolean bIn);

	/**
	 * 是否为无视图模式
	 * 
	 * @return
	 */
	boolean isNoViewMode();

	/**
	 * 获取默认的实体数据查询，用于完成无视图模式查询
	 * 
	 * @return
	 */
	IDEDataQuery getDefaultDEDataQuery();

	/**
	 * 获取实体存储模式
	 * 
	 * @return
	 */
	int getStorageMode();
	
	
	/**
	 * 获取实体大数据表
	 * 
	 * @param strDEBATableId
	 * @return
	 * @throws Exception
	 */
	IDEBATable getDEBATable(String strDEBATableId) throws Exception;
	
	
	
	/**
	 * 获取实体相关的大数据表
	 * @return
	 */
	java.util.Iterator<IDEBATable> getDEBATables();
	
}
