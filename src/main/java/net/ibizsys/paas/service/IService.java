package net.ibizsys.paas.service;

import java.util.ArrayList;

import net.ibizsys.paas.core.IDEDataSetFetchContext;
import net.ibizsys.paas.core.IDEDataSyncIn;
import net.ibizsys.paas.dao.IDAO;
import net.ibizsys.paas.db.DBCallResult;
import net.ibizsys.paas.db.DBFetchResult;
import net.ibizsys.paas.db.ISelectCond;
import net.ibizsys.paas.db.SqlParamList;
import net.ibizsys.paas.demodel.IDataEntityModel;
import net.ibizsys.paas.entity.EntityFieldError;
import net.ibizsys.paas.entity.IEntity;
import net.ibizsys.paas.sysmodel.ISystemModel;
import net.ibizsys.paas.web.IWebContext;
import net.ibizsys.psrt.srv.common.entity.DataSyncIn;
import net.ibizsys.pswf.core.IWFActionContext;
import net.sf.json.JSONObject;

import org.hibernate.SessionFactory;

/**
 * 实体服务对象接口
 * 
 * @author lionlau
 *
 * @param <ET>
 */
public interface IService<ET extends IEntity> {
	/**
	 * 主键不存在
	 */
	static int CHECKKEYSTATE_OK = 0;

	/**
	 * 主键不存在
	 */
	static int CHECKKEYSTATE_NOTEXIST = 0;

	/**
	 * 主键存在
	 */
	static int CHECKKEYSTATE_EXIST = 1;

	/**
	 * 主键删除
	 */
	static int CHECKKEYSTATE_DELETE = 2;

	/**
	 * 保存模式，只建立
	 */
	static int SAVEMODE_CREATEONLY = 1;

	/**
	 * 保存模式，只更新
	 */
	static int SAVEMODE_UPDATEONLY = 2;

	/**
	 * 保存模式，全部
	 */
	static int SAVEMODE_ALL = 3;

	/**
	 * 实体行为,获取草稿数据
	 */
	static String ACTION_GETDRAFT = "GETDRAFT";

	/**
	 * 实体行为,获取数据
	 */
	static String ACTION_GET = "GET";

	/**
	 * 尝试获取
	 */
	static String ACTION_TRYGET = "TRYGET";

	/**
	 * 查询符合条件的单项数据
	 */
	static String ACTION_SELECT = "SELECT";

	/**
	 * 尝试查询符合条件的单项数据
	 */
	static String ACTION_TRYSELECT = "TRYSELECT";

	/**
	 * 创建数据
	 */
	static String ACTION_CREATE = "CREATE";

	/**
	 * 更新数据
	 */
	static String ACTION_UPDATE = "UPDATE";

	/**
	 * 保存数据，自动判断创建或是更新
	 */
	static String ACTION_SAVE = "SAVE";

	/**
	 * 检查数据主键状态
	 */
	static String ACTION_CHECKKEY = "CHECKKEY";

	/**
	 * 删除数据
	 */
	static String ACTION_REMOVE = "REMOVE";

	static String ACTION_GETDRAFTTEMP = "GETDRAFTTEMP";

	static String ACTION_GETTEMP = "GETTEMP";

	static String ACTION_CREATETEMP = "CREATETEMP";

	static String ACTION_UPDATETEMP = "UPDATETEMP";

	static String ACTION_REMOVETEMP = "REMOVETEMP";

	static String ACTION_GETDRAFTTEMPMAJOR = "GETDRAFTTEMPMAJOR";

	static String ACTION_GETTEMPMAJOR = "GETTEMPMAJOR";

	static String ACTION_CREATETEMPMAJOR = "CREATETEMPMAJOR";

	static String ACTION_UPDATETEMPMAJOR = "UPDATETEMPMAJOR";

	static String ACTION_REMOVETEMPMAJOR = "REMOVETEMPMAJOR";

	static String ACTION_GETDRAFTFROM = "GETDRAFTFROM";

	static String ACTION_GETDRAFTTEMPFROM = "GETDRAFTTEMPFROM";

	static String ACTION_GETDRAFTTEMPMAJORFROM = "GETDRAFTTEMPMAJORFROM";

	/**
	 * 更新流程信息模式（初始化）
	 */
	static Integer UPDATEWFINFOMODE_INIT = 0;

	/**
	 * 更新流程信息模式（更新状态）
	 */
	static Integer UPDATEWFINFOMODE_UPDATESTATE = 1;

	/**
	 * 更新流程信息模式（完成状态）
	 */
	static Integer UPDATEWFINFOMODE_FINISH = 2;

	/**
	 * 更新流程信息模式（取消状态）
	 */
	static Integer UPDATEWFINFOMODE_CANCEL = 3;

	/**
	 * 更新流程信息模式（取消启动状态）
	 */
	static Integer UPDATEWFINFOMODE_CANCELSTART = 4;

	/**
	 * 初始化流程
	 */
	static String ACTION_INITWF = "INITWF";

	/**
	 * 初始化流程
	 */
	static String ACTION_FINISHWF = "FINISHWF";

	/**
	 * 用户关闭流程
	 */
	static String ACTION_CLOSEWF = "CLOSEWF";

	/**
	 * 用户取消流程启动
	 */
	static String ACTION_CANCELSTARTWF = "CANCELSTARTWF";

	/**
	 * 新建
	 */
	final static int DATACHGEVENT_INSERT = 1;

	/**
	 * 更新
	 */
	final static int DATACHGEVENT_UPDATE = 2;

	/**
	 * 新建或更新
	 */
	final static int DATACHGEVENT_INSERTORUPDATE = 3;

	/**
	 * 删除
	 */
	final static int DATACHGEVENT_DELETE = 4;

	/**
	 * 获取当前访问上下文
	 * 
	 * @return
	 */
	IWebContext getWebContext();

	/**
	 * 获取DAO对象
	 * 
	 * @return
	 */
	IDAO getDAO();

	/**
	 * 获取实体模型对象
	 * 
	 * @return
	 */
	IDataEntityModel getDEModel();

	/**
	 * 获取数据集结果
	 * 
	 * @param strDataSetName
	 * @param iDEDataSetFetchContext
	 * @return
	 * @throws Exception
	 */
	DBFetchResult fetchDataSet(String strDataSetName, IDEDataSetFetchContext iDEDataSetFetchContext) throws Exception;

	/**
	 * 获取数据集合（临时数据）
	 * 
	 * @param strDataSetName
	 * @param iDEDataSetFetchContext
	 * @return
	 * @throws Exception
	 */
	DBFetchResult fetchDataSetTemp(String strDataSetName, IDEDataSetFetchContext iDEDataSetFetchContext) throws Exception;

	/**
	 * 执行实体行为
	 * 
	 * @param strAction
	 * @param et
	 * @throws Exception
	 */
	void executeAction(String strAction, IEntity et) throws Exception;

	/**
	 * 批执行实体行为
	 * 
	 * @param strAction
	 * @param entities
	 * @throws Exception
	 */
	void executeAction(String strAction, java.util.ArrayList<IEntity> entities) throws Exception;

	/**
	 * 尝试获取指定数据，在尝试模式下获取数据失败返回False。
	 * 
	 * @param et
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Exception
	 */
	boolean get(ET et, boolean bTryMode) throws Exception;

	/**
	 * 执行操作[Get]
	 * 
	 * @param et
	 * @throws Exception
	 */
	void get(ET et) throws Exception;

	/**
	 * 执行操作[GetCache]
	 * 
	 * @param et
	 * @throws Exception
	 */
	void getCache(ET et) throws Exception;

	/**
	 * 执行操作[Create]
	 * 
	 * @param et
	 * @throws Exception
	 */
	void create(ET et) throws Exception;

	/**
	 * 执行操作[Create]
	 * 
	 * @param et
	 * @param bGet 是否将新建数据返回,默认为True
	 * @throws Exception
	 */
	void create(ET et, boolean bGet) throws Exception;

	/**
	 * 执行操作[Update]
	 * 
	 * @param et
	 * @throws Exception
	 */
	void update(ET et) throws Exception;

	/**
	 * 执行操作[Update]
	 * 
	 * @param et
	 * @param bGet 是否将更新数据返回,默认为True
	 * @throws Exception
	 */
	void update(ET et, boolean bGet) throws Exception;

	/**
	 * 执行操作[Sys Update]，系统更新，不记录操作人及操作时间
	 * 
	 * @param et
	 * @param bGet 是否将更新数据返回,默认为True
	 * @throws Exception
	 */
	void sysUpdate(ET et, boolean bGet) throws Exception;

	/**
	 * 执行操作[Sys UpdateTemp]，系统更新临时数据，不记录操作人及操作时间
	 * 
	 * @param entity
	 * @param bGet
	 * @throws Exception
	 */
	void sysUpdateTemp(ET entity, boolean bGet) throws Exception;

	/**
	 * 执行操作[Save]，自动判断是建立或是更新
	 * 
	 * @param et
	 * @throws Exception
	 */
	void save(ET et) throws Exception;

	/**
	 * 执行操作[Save]，自动判断是建立或是更新
	 * 
	 * @param et
	 * @param nSaveMode
	 * @throws Exception
	 */
	void save(ET et, int nSaveMode) throws Exception;
	
	
	/**
	 * 执行操作[Save]，自动判断是建立或是更新
	 * 
	 * @param et
	 * @param nSaveMode
	 * @param bGet 返回数据
	 * @throws Exception
	 */
	void save(ET et, int nSaveMode,boolean bGet) throws Exception;
	
	
	
	/**
	 * 执行操作[Save]，自动判断是建立或是更新
	 * 
	 * @param et
	 * @param bGet 返回数据
	 * @throws Exception
	 */
	void save(ET et, boolean bGet) throws Exception;
	

	/**
	 * 执行操作[Remove]
	 * 
	 * @param et
	 * @throws Exception
	 */
	void remove(ET et) throws Exception;

	/**
	 * 执行操作[GetTemp]
	 * 
	 * @param et
	 * @throws Exception
	 */
	void getTemp(ET et) throws Exception;

	/**
	 * 执行操作[CreateTemp]
	 * 
	 * @param et
	 * @throws Exception
	 */
	void createTemp(ET et) throws Exception;

	/*
	 * 
	 */
	/**
	 * 执行操作[UpdateTemp]
	 * 
	 * @param et
	 * @throws Exception
	 */
	void updateTemp(ET et) throws Exception;

	/**
	 * 执行操作[RemoveTemp]
	 * 
	 * @param et
	 * @throws Exception
	 */
	void removeTemp(ET et) throws Exception;

	/**
	 * 批执行操作[removeTemp]
	 * 
	 * @param list
	 * @throws Exception
	 */
	void removeTemp(ArrayList<ET> list) throws Exception;

	/**
	 * 执行操作[Remove]
	 * 
	 * @param list
	 * @throws Exception
	 */
	void remove(ArrayList<ET> list) throws Exception;

	/**
	 * 通过查询删除
	 * 
	 * @param iSelectCond 查询条件
	 * @param bDirect 直接删除，不逐条
	 * @throws Exception
	 */
	void remove(ISelectCond iSelectCond, boolean bDirect) throws Exception;

	/**
	 * 查询数据，单项
	 * 
	 * @param et
	 * @param bTryMode
	 * @return
	 * @throws Exception
	 */
	boolean select(ET et, boolean bTryMode) throws Exception;

	/**
	 * 查询数据
	 * 
	 * @param iSelectCond
	 * @return
	 * @throws Exception
	 */
	java.util.ArrayList<ET> select(ISelectCond iSelectCond) throws Exception;

	/**
	 * 查询临时数据
	 * 
	 * @param iSelectCond
	 * @return
	 * @throws Exception
	 */
	ArrayList<ET> selectTemp(ISelectCond iSelectCond) throws Exception;

	/**
	 * 查询临时数据，单独
	 * 
	 * @param et
	 * @param bTryMode
	 * @return
	 * @throws Exception
	 */
	boolean selectTemp(ET et, boolean bTryMode) throws Exception;

	/**
	 * 执行操作[GetDraft]
	 * 
	 * @param et
	 * @throws Exception
	 */
	void getDraft(ET et) throws Exception;

	/**
	 * 获取草稿临时模式
	 * 
	 * @param et
	 * @throws Exception
	 */
	void getDraftTemp(ET et) throws Exception;

	/**
	 * 执行操作[GetDraftFrom],从源数据中获取草稿
	 * 
	 * @param et
	 * @throws Exception
	 */
	void getDraftFrom(ET et) throws Exception;

	/**
	 * 获取草稿临时模式
	 * 
	 * @param et
	 * @throws Exception
	 */
	void getDraftTempFrom(ET et) throws Exception;

	/**
	 * 获取草稿临时模式
	 * 
	 * @param et
	 * @throws Exception
	 */
	void getDraftTempMajorFrom(ET et) throws Exception;

	/**
	 * 数据复制
	 * 
	 * @param et
	 * @return
	 * @throws Exception
	 */
	ET clone(ET et) throws Exception;

	/**
	 * 数据到临时数据
	 * 
	 * @param et
	 * @return
	 * @throws Exception
	 */
	ET cloneToTemp(ET et) throws Exception;

	/**
	 * 数据复制
	 * 
	 * @param et
	 * @return
	 * @throws Exception
	 */
	ET cloneTemp(ET et) throws Exception;

	/**
	 * 执行操作[CheckKey]，判断主键状态
	 * 
	 * @param et
	 * @return
	 * @throws Exception
	 */
	int checkKey(ET et) throws Exception;

	/**
	 * 执行操作[CheckKeyTemp]，判断主键状态
	 * 
	 * @param et
	 * @return
	 * @throws Exception
	 */
	int checkKeyTemp(ET et) throws Exception;

	/**
	 * 更新流程信息
	 * 
	 * @param nActionMode
	 * @param iWFActionContext
	 * @param et
	 * @throws Exception
	 */
	void updateWFInfo(int nActionMode, IWFActionContext iWFActionContext, ET et) throws Exception;

	/**
	 * 计算数据对象上下文值
	 * 
	 * @param et 当前数据对象
	 * @param strField 属性名称
	 * @param iDataContextParam 额外的上下文参数
	 * @return
	 * @throws Exception
	 */
	Object getDataContextValue(ET et, String strField, IDataContextParam iDataContextParam) throws Exception;

	/**
	 * 获取数据源链接
	 * 
	 * @return
	 */
	String getDSLink();

	/**
	 * 设置数据源连接
	 * 
	 * @param strDSLink
	 */
	void setDSLink(String strDSLink);

	/**
	 * 设置会话工厂
	 * 
	 * @param sessionFactory
	 */
	void setSessionFactory(SessionFactory sessionFactory);

	/**
	 * 获取会话工厂
	 * 
	 * @return
	 */
	SessionFactory getSessionFactory();

	/**
	 * 通过代码直接获取
	 * 
	 * @param strSql
	 * @param sqlParamList
	 * @return
	 * @throws Exception
	 */
	ArrayList<IEntity> selectRaw(String strSql, SqlParamList sqlParamList) throws Exception;

	/**
	 * 通过代码直接获取
	 * 
	 * @param strSql
	 * @param sqlParamList
	 * @return
	 * @throws Exception
	 */
	DBCallResult executeRaw(String strSql, SqlParamList sqlParamList) throws Exception;

	/**
	 * 导入5.0模型
	 * 
	 * @param jsonObject
	 * @return 导入模型信息
	 * @throws Exception
	 */
	String importModel(JSONObject jsonObject) throws Exception;

	/**
	 * 导出5.0模型
	 * 
	 * @param et
	 * @param modelList
	 * @throws Exception
	 */
	void exportModel(ET et, ArrayList<JSONObject> modelList) throws Exception;

	/**
	 * 判断值规则
	 * 
	 * @param strDEFieldName
	 * @param strRule
	 * @param et
	 * @param strField
	 * @param bCreate
	 * @return
	 * @throws Exception
	 */
	EntityFieldError testValueRule(String strDEFieldName, String strRule, IEntity et, String strField, boolean bCreate) throws Exception;

	/**
	 * 填充实体的主键值
	 * 
	 * @param et
	 * @return
	 * @throws Exception
	 */
	boolean fillEntityKeyValue(ET et) throws Exception;

	/**
	 * 更新临时数据
	 * 
	 * @param entity
	 * @param bGet
	 * @throws Exception
	 */
	void updateTemp(ET entity, boolean bGet) throws Exception;

	/**
	 * 填充实体的主键
	 * 
	 * @param et
	 * @param bTempMode 是否为临时数据模式
	 * @return true 为外部填充，false为默认填充
	 * @throws Exception
	 */
	boolean fillEntityKeyValue(ET et, boolean bTempMode) throws Exception;

	/**
	 * 填充数据的相关父数据信息
	 * 
	 * @param et
	 * @param strParentType
	 * @param strTypeParam
	 * @param strParentKey
	 * @throws Exception
	 */
	void fillParentInfo(ET et, String strParentType, String strTypeParam, String strParentKey) throws Exception;

	/**
	 * 开始合并子数据
	 * 
	 * @param et
	 * @throws Exception
	 */
	void beginMergeChild(ET et) throws Exception;

	/**
	 * 结束合并子数据
	 * 
	 * @param et
	 * @param bCancel 取消合并
	 * @throws Exception
	 */
	void endMergeChild(ET et, boolean bCancel) throws Exception;

	/**
	 * 合并子数据
	 * 
	 * @param strChildType
	 * @param strTypeParam
	 * @param objKey
	 * @throws Exception
	 */
	void mergeChild(String strChildType, String strTypeParam, Object objKey) throws Exception;

	/**
	 * 拷贝源数据明细
	 * 
	 * @param et
	 * @param objSourceKey
	 * @throws Exception
	 */
	void copyDetails(ET et, Object objSourceKey) throws Exception;

	/**
	 * 同步数据处理
	 * 
	 * @param dataSyncIn
	 * @param iDEDataSyncIn
	 * @throws Exception
	 */
	void syncData(DataSyncIn dataSyncIn, IDEDataSyncIn iDEDataSyncIn) throws Exception;
	
	
	
	
	/**
	 * 获取系统模型
	 * @return
	 */
	ISystemModel getSystemModel();
}
