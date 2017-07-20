package net.ibizsys.paas.sysmodel;

import net.ibizsys.paas.core.IDERBase;
import net.ibizsys.paas.core.IDynamicModelStorage;
import net.ibizsys.paas.core.ISystem;
import net.ibizsys.paas.core.IValueTranslator;
import net.ibizsys.paas.demodel.IDataEntityModel;
import net.ibizsys.paas.entity.IEntity;
import net.ibizsys.paas.security.IDEDataAccMgr;
import net.ibizsys.paas.service.IService;
import net.ibizsys.paas.service.IServicePlugin;
import net.ibizsys.paas.view.IViewMessage;
import net.ibizsys.paas.view.IViewMsgGroupModel;
import net.ibizsys.paas.view.IViewWizard;
import net.ibizsys.paas.view.IViewWizardGroupModel;
import net.ibizsys.psba.core.IBASchemeModel;
import net.ibizsys.pswf.core.IWFModel;
import net.ibizsys.pswf.core.IWFRoleModel;

/**
 * 系统模型接口
 * 
 * @author lionlau
 *
 */
public interface ISystemModel extends ISystem {
	/**
	 * 用户词典分类
	 */
	final static String USERDICTCAT = "USERDICTCAT";

	/**
	 * 用户词典分类（全局）
	 */
	final static String USERDICTCAT_GLOBAL = "GLOBAL";

	/**
	 * 用户词典分类（用户）
	 */
	final static String USERDICTCAT_USER = "USER";

	/**
	 * 获取指定实体模型
	 * 
	 * @param strDEName
	 * @return
	 * @throws Exception
	 */
	IDataEntityModel getDataEntityModel(String strDEName) throws Exception;

	/**
	 * 获取系统流程模型
	 * 
	 * @param strWFModelId
	 * @return
	 * @throws Exception
	 */
	IWFModel getWFModel(String strWFModelId) throws Exception;

	/**
	 * 获取流程角色模型
	 * 
	 * @param strWFRoleModelId
	 * @return
	 * @throws Exception
	 */
	IWFRoleModel getWFRoleModel(String strWFRoleModelId) throws Exception;

	/**
	 * 获取流程角色集合
	 * 
	 * @return
	 */
	java.util.Iterator<IWFRoleModel> getWFRoleModels();

	/**
	 * 值转换器
	 * 
	 * @param strTranslator
	 * @return
	 * @throws Exception
	 */
	IValueTranslator getValueTranslator(String strTranslator) throws Exception;

	/**
	 * 安装运行时数据
	 */
	void installRTDatas() throws Exception;

	/**
	 * 获取实体相关关系
	 * 
	 * @param strDEId
	 * @param bMajor 主关系或从关系
	 * @return
	 */
	java.util.Iterator<IDERBase> getDERs(String strDEId, boolean bMajor);

	/**
	 * 获取系统动态模型存储对象
	 * 
	 * @return
	 */
	IDynamicModelStorage getDynamicModelStorage() throws Exception;

	/**
	 * 建立实体数据访问对象
	 * 
	 * @param iDEModel
	 * @return
	 * @throws Exception
	 */
	IDEDataAccMgr createDEDataAccMgr(IDataEntityModel iDEModel) throws Exception;

	/**
	 * 注册系统实体模型
	 * 
	 * @param iDataEntityModel
	 * @throws Exception
	 */
	void registerDataEntityModel(IDataEntityModel iDataEntityModel) throws Exception;

	/**
	 * 注册系统流程模型
	 * 
	 * @param iWFModel
	 * @throws Exception
	 */
	void registerWFModel(IWFModel iWFModel) throws Exception;

	/**
	 * 注册系统流程角色模型
	 * 
	 * @param iWFRoleModel
	 * @throws Exception
	 */
	void registerWFRoleModel(IWFRoleModel iWFRoleModel) throws Exception;

	/**
	 * 注册系统大数据架构模型
	 * 
	 * @param iBASchemeModel
	 * @throws Exception
	 */
	void registerBASchemeModel(IBASchemeModel iBASchemeModel) throws Exception;

	/**
	 * 获取系统大数据架构模型
	 * 
	 * @param strBASchemeModelId
	 * @return
	 * @throws Exception
	 */
	IBASchemeModel getBASchemeModel(String strBASchemeModelId) throws Exception;
	
	
	

	/**
	 * 获取视图消息集合
	 * 
	 * @param iViewMsgGroupModel
	 * @return
	 * @throws Exception
	 */
	java.util.Iterator<IViewMessage> getViewMessages(IViewMsgGroupModel iViewMsgGroupModel) throws Exception;

//	/**
//	 * 填充视图消息集合
//	 * 
//	 * @param iViewMsgModel
//	 * @param viewMessageList
//	 * @throws Exception
//	 */
//	void fillViewMessages(IViewMsgModel iViewMsgModel, ArrayList<IViewMessage> viewMessageList) throws Exception;
	
	/**
	 * 获取视图向导集合
	 * @param iViewMsgGroupModel
	 * @param strQuery
	 * @return
	 * @throws Exception
	 */
	java.util.Iterator<IViewWizard> getViewWizards(IViewWizardGroupModel iViewWizardGroupModel,String strQuery) throws Exception;

	
	/**
	 * 设置System插件，继承原功能
	 * @param iSystemPlugin
	 * @throws Exception
	 */
	void setSystemPlugin(ISystemPlugin iSystemPlugin) throws Exception;
	
	
	/**
	 * 设置System插件，
	 * @param iSystemPlugin
	 * @param bResetOrigin 是否重置原插件功能 
	 * @throws Exception
	 */
	void setSystemPlugin(ISystemPlugin iSystemPlugin,boolean bIgnoreOrigin) throws Exception;
	
	
	
	/**
	 * 获取System插件
	 * @return
	 */
	ISystemPlugin getSystemPlugin();
	
}
