package net.ibizsys.paas.sysmodel;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import javax.servlet.ServletContext;

import net.ibizsys.paas.codelist.ICodeList;
import net.ibizsys.paas.core.DER;
import net.ibizsys.paas.core.DERs;
import net.ibizsys.paas.core.IDERBase;
import net.ibizsys.paas.core.IDataEntity;
import net.ibizsys.paas.core.IDynamicModelStorage;
import net.ibizsys.paas.core.IPostConstructable;
import net.ibizsys.paas.core.IValueTranslator;
import net.ibizsys.paas.core.ValueTranslatorGlobal;
import net.ibizsys.paas.dao.DAOGlobal;
import net.ibizsys.paas.db.IDBDialect;
import net.ibizsys.paas.db.IProcParam;
import net.ibizsys.paas.demodel.DER11Model;
import net.ibizsys.paas.demodel.DER1NModel;
import net.ibizsys.paas.demodel.DERIndexModel;
import net.ibizsys.paas.demodel.DERInheritModel;
import net.ibizsys.paas.demodel.DERMultiInheritModel;
import net.ibizsys.paas.demodel.IDataEntityModel;
import net.ibizsys.paas.entity.IEntity;
import net.ibizsys.paas.security.DEDataAccMgr;
import net.ibizsys.paas.security.IDEDataAccMgr;
import net.ibizsys.paas.service.ActionSessionManager;
import net.ibizsys.paas.service.IService;
import net.ibizsys.paas.service.IServicePlugin;
import net.ibizsys.paas.service.ServiceGlobal;
import net.ibizsys.paas.util.ObjectHelper;
import net.ibizsys.paas.util.StringHelper;
import net.ibizsys.paas.view.IViewMessage;
import net.ibizsys.paas.view.IViewMsgGroupModel;
import net.ibizsys.paas.view.IViewMsgModel;
import net.ibizsys.paas.view.IViewWizard;
import net.ibizsys.paas.view.IViewWizardGroupModel;
import net.ibizsys.paas.view.IViewWizardModel;
import net.ibizsys.paas.web.WebDynamicModelStorage;
import net.ibizsys.psba.core.BASchemeModelGlobal;
import net.ibizsys.psba.core.IBASchemeModel;
import net.ibizsys.psba.core.IBASchemeRuntime;
import net.ibizsys.psrt.srv.wf.entity.WFDynamicUser;
import net.ibizsys.psrt.srv.wf.entity.WFUserGroup;
import net.ibizsys.psrt.srv.wf.entity.WFWorkflow;
import net.ibizsys.psrt.srv.wf.service.WFDynamicUserService;
import net.ibizsys.psrt.srv.wf.service.WFUserGroupService;
import net.ibizsys.psrt.srv.wf.service.WFWorkflowService;
import net.ibizsys.pswf.core.IWFModel;
import net.ibizsys.pswf.core.IWFRoleModel;
import net.ibizsys.pswf.core.WFModelGlobal;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import freemarker.template.utility.NullWriter;

/**
 * 系统模型基类
 * 
 * @author lionlau
 * 
 */
public abstract class SystemModelBase implements ISystemModel, ISystemRuntime, org.springframework.web.context.ServletContextAware {
	/**
	 * 关系模型
	 */
	private HashMap<String, IDERBase> derBaseMap = new HashMap<String, IDERBase>();

	/**
	 * 实体映射
	 */
	private HashMap<String, IDataEntityModel> dataEntityModelMap = new HashMap<String, IDataEntityModel>();

	/**
	 * 流程模型映射
	 */
	private HashMap<String, IWFModel> wfModelMap = new HashMap<String, IWFModel>();

	/**
	 * 流程角色映射
	 */
	private HashMap<String, IWFRoleModel> wfRoleModelMap = new HashMap<String, IWFRoleModel>();

	/**
	 * 实体主关系列表映射
	 */
	private HashMap<String, ArrayList<IDERBase>> deMajorDERsMap = new HashMap<String, ArrayList<IDERBase>>();

	/**
	 * 实体从关系列表映射
	 */
	private HashMap<String, ArrayList<IDERBase>> deMinorDERsMap = new HashMap<String, ArrayList<IDERBase>>();

	/**
	 * 大数据架构模型映射
	 */
	private HashMap<String, IBASchemeModel> baSchemeModelMap = new HashMap<String, IBASchemeModel>();

	/**
	 * 系统标识
	 */
	private String strId = "";

	/**
	 * 系统名称
	 */
	private String strName = "";

	/**
	 * Web程序上下文
	 */
	private ServletContext servletContext = null;

	private IDynamicModelStorage iDynamicModelStorage = null;

	private static HashMap<String, String> replaceObjectMap = null;
	
	private ISystemPlugin iSystemPlugin = null;
	
	/**
	 * 初始化注解
	 * 
	 * @param c
	 * @throws Exception
	 */
	protected void initAnnotation(Class c) {
		Annotation[] annotations = c.getAnnotations();
		if (annotations != null) {
			for (Annotation annotation : annotations) {
				if (annotation instanceof DERs) {
					prepareDERs((DERs) annotation);
					continue;
				}
			}
		}
	}

	/**
	 * 准备实体关系
	 * 
	 * @param ders
	 */
	protected void prepareDERs(DERs ders) {
		for (DER der : ders.value()) {
			IDERBase iDERBase = createDERBase(der);
			derBaseMap.put(iDERBase.getId(), iDERBase);
			derBaseMap.put(iDERBase.getName(), iDERBase);

			String strMajorDEId = iDERBase.getMajorDEId();
			String strMinorDEId = iDERBase.getMinorDEId();

			ArrayList<IDERBase> majorDERList = deMajorDERsMap.get(strMajorDEId);
			if (majorDERList == null) {
				majorDERList = new ArrayList<IDERBase>();
				deMajorDERsMap.put(strMajorDEId, majorDERList);
			}
			majorDERList.add(iDERBase);
			ArrayList<IDERBase> minorDERList = deMinorDERsMap.get(strMinorDEId);
			if (minorDERList == null) {
				minorDERList = new ArrayList<IDERBase>();
				deMinorDERsMap.put(strMinorDEId, minorDERList);
			}
			minorDERList.add(iDERBase);
		}
	}

	/**
	 * 建立实体关系模型对象
	 * 
	 * @param der
	 * @return
	 */
	protected IDERBase createDERBase(DER der) {

		if (StringHelper.compare(der.type(), IDERBase.DERTYPE_DER1N, true) == 0) {
			DER1NModel der1nModel = new DER1NModel();
			der1nModel.init(this, der);
			return der1nModel;
		}

		if (StringHelper.compare(der.type(), IDERBase.DERTYPE_DER11, true) == 0) {
			DER11Model der11Model = new DER11Model();
			der11Model.init(this, der);
			return der11Model;
		}

		if (StringHelper.compare(der.type(), IDERBase.DERTYPE_DERINHERIT, true) == 0) {
			DERInheritModel derInheritModel = new DERInheritModel();
			derInheritModel.init(this, der);
			return derInheritModel;
		}

		if (StringHelper.compare(der.type(), IDERBase.DERTYPE_DERINDEX, true) == 0) {
			DERIndexModel derIndexModel = new DERIndexModel();
			derIndexModel.init(this, der);
			return derIndexModel;
		}

		if (StringHelper.compare(der.type(), IDERBase.DERTYPE_DERMULINH, true) == 0) {
			DERMultiInheritModel derMultiInheritModel = new DERMultiInheritModel();
			derMultiInheritModel.init(this, der);
			return derMultiInheritModel;
		}

		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.core.IModelBase#getId()
	 */
	@Override
	public String getId() {
		return this.strId;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.core.IModelBase#getName()
	 */
	@Override
	public String getName() {
		return this.strName;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.sysmodel.ISystemModel#getDataEntityModel(java.lang.String)
	 */
	@Override
	public IDataEntityModel getDataEntityModel(String strDEName) throws Exception {
		IDataEntityModel iDataEntityModel = dataEntityModelMap.get(strDEName);
		if (iDataEntityModel == null) throw new Exception(StringHelper.format("无法获取指定实体[%1$s]", strDEName));
		return iDataEntityModel;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.core.ISystem#getDataEntity(java.lang.String)
	 */
	@Override
	public IDataEntity getDataEntity(String strDataEntityId) throws Exception {
		return getDataEntityModel(strDataEntityId);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.core.ISystem#getDER(java.lang.String)
	 */
	@Override
	public IDERBase getDER(String strDERId) throws Exception {
		IDERBase iDERBase = derBaseMap.get(strDERId);
		if (iDERBase == null) throw new Exception(StringHelper.format("无法获取指定关系[%1$s]", strDERId));
		return iDERBase;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.core.ISystem#getCodeList(java.lang.String)
	 */
	@Override
	public ICodeList getCodeList(String strCodeListId) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Autowired
	@Qualifier("dbDialect")
	private IDBDialect dbDialect;

	/**
	 * 设置数据库代码适配器
	 * 
	 * @param dbDialect
	 */
	public void setDBDialect(IDBDialect dbDialect) {
		this.dbDialect = dbDialect;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.sysmodel.ISystemRuntime#getDBDialect()
	 */
	@Override
	public IDBDialect getDBDialect() {
		return dbDialect;
	}

	@Autowired
	@Qualifier("sessionFactory")
	private SessionFactory sessionFactory;

	/**
	 * 设置会话工厂
	 * 
	 * @param sessionFactory
	 */

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.sysmodel.ISystemRuntime#getSessionFactory()
	 */
	@Override
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.sysmodel.ISystemModel#getWFModel(java.lang.String)
	 */
	@Override
	public IWFModel getWFModel(String strWFModelId) throws Exception {
		IWFModel iWFModel = wfModelMap.get(strWFModelId);
		if (iWFModel == null) {
			throw new Exception(StringHelper.format("无法获取指定流程，流程标识[%1$s]", strWFModelId));
		}
		return iWFModel;
	}

	/**
	 * 获取工作流模型集合
	 * 
	 * @return
	 */
	protected java.util.Iterator<IWFModel> getWFModels() {
		return wfModelMap.values().iterator();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.sysmodel.ISystemModel#getWFRoleModel(java.lang.String)
	 */
	@Override
	public IWFRoleModel getWFRoleModel(String strWFRoleModelId) throws Exception {
		IWFRoleModel iWFRoleModel = wfRoleModelMap.get(strWFRoleModelId);
		if (iWFRoleModel == null) {
			throw new Exception(StringHelper.format("无法获取指定流程角色，角色标识[%1$s]", strWFRoleModelId));
		}
		return iWFRoleModel;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.sysmodel.ISystemModel#registerDataEntityModel(net.ibizsys.paas.demodel.IDataEntityModel)
	 */
	@Override
	public void registerDataEntityModel(IDataEntityModel iDataEntityModel) throws Exception {
		String strId = iDataEntityModel.getId();
		String strName = iDataEntityModel.getName();

		// if (dataEntityModelMap.containsKey(strId))
		// {
		// throw new Exception(StringHelper.format("系统中已经注册了标识为[%1$s]的实体模型", strId));
		// }
		//
		// if (dataEntityModelMap.containsKey(strName))
		// {
		// throw new Exception(StringHelper.format("系统中已经注册了名称为[%1$s]的实体模型", strName));
		// }

		dataEntityModelMap.put(strId, iDataEntityModel);
		dataEntityModelMap.put(strName, iDataEntityModel);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.sysmodel.ISystemModel#registerWFModel(net.ibizsys.pswf.core.IWFModel)
	 */
	@Override
	public void registerWFModel(IWFModel iWFModel) throws Exception {
		String strId = iWFModel.getId();

		if (wfModelMap.containsKey(strId)) {
			throw new Exception(StringHelper.format("系统中已经注册了标识为[%1$s]的流程模型", strId));
		}
		wfModelMap.put(strId, iWFModel);
		WFModelGlobal.registerWFModel(iWFModel.getClass().getCanonicalName(), iWFModel);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.sysmodel.ISystemModel#registerWFRoleModel(net.ibizsys.pswf.core.IWFRoleModel)
	 */
	public void registerWFRoleModel(IWFRoleModel iWFRoleModel) throws Exception {
		String strId = iWFRoleModel.getId();

		if (wfRoleModelMap.containsKey(strId)) {
			throw new Exception(StringHelper.format("系统中已经注册了标识为[%1$s]的流程角色模型", strId));
		}
		wfRoleModelMap.put(strId, iWFRoleModel);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.sysmodel.ISystemModel#registerBASchemeModel(net.ibizsys.psbaScheme.core.IBASchemeModel)
	 */
	@Override
	public void registerBASchemeModel(IBASchemeModel iBASchemeModel) throws Exception {
		String strId = iBASchemeModel.getId();

		if (baSchemeModelMap.containsKey(strId)) {
			throw new Exception(StringHelper.format("系统中已经注册了标识为[%1$s]的大数据架构模型", strId));
		}
		baSchemeModelMap.put(strId, iBASchemeModel);
		BASchemeModelGlobal.registerBASchemeModel(iBASchemeModel.getClass().getCanonicalName(), iBASchemeModel);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.sysmodel.ISystemModel#getBASchemeModel(java.lang.String)
	 */
	@Override
	public IBASchemeModel getBASchemeModel(String strBASchemeModelId) throws Exception {
		IBASchemeModel iBASchemeModel = baSchemeModelMap.get(strBASchemeModelId);
		if (iBASchemeModel == null) {
			throw new Exception(StringHelper.format("无法获取指定大数据架构模型，大数据架构模型标识[%1$s]", strBASchemeModelId));
		}
		return iBASchemeModel;
	}

	

	/**
	 * 设置标识
	 * 
	 * @param strId the strId to set
	 */
	protected void setId(String strId) {
		this.strId = strId;
	}

	/**
	 * 设置名称
	 * 
	 * @param strName the strName to set
	 */
	protected void setName(String strName) {
		this.strName = strName;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.sysmodel.ISystemModel#getWFRoleModes()
	 */
	@Override
	public Iterator<IWFRoleModel> getWFRoleModels() {
		return wfRoleModelMap.values().iterator();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.sysmodel.ISystemRuntime#getDBDialect(java.lang.String)
	 */
	@Override
	public IDBDialect getDBDialect(String strDSLink) {
		if (StringHelper.compare(strDSLink, IDataEntity.DSLINK_DEFAULT, true) == 0) {
			return this.getDBDialect();
		}

		if (StringHelper.compare(strDSLink, IDataEntity.DSLINK_DB2, true) == 0) {
			return this.getDBDialect2();
		}

		if (StringHelper.compare(strDSLink, IDataEntity.DSLINK_DB3, true) == 0) {
			return this.getDBDialect3();
		}

		if (StringHelper.compare(strDSLink, IDataEntity.DSLINK_DB4, true) == 0) {
			return this.getDBDialect4();
		}

		return this.getDBDialect();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.sysmodel.ISystemRuntime#getSessionFactory(java.lang. String)
	 */
	@Override
	public SessionFactory getSessionFactory(String strDSLink) {
		if (StringHelper.isNullOrEmpty(strDSLink) || StringHelper.compare(strDSLink, IDataEntity.DSLINK_DEFAULT, true) == 0) {
			return this.getSessionFactory();
		}

		if (StringHelper.compare(strDSLink, IDataEntity.DSLINK_DB2, true) == 0) {
			return this.getSessionFactory2();
		}

		if (StringHelper.compare(strDSLink, IDataEntity.DSLINK_DB3, true) == 0) {
			return this.getSessionFactory3();
		}

		if (StringHelper.compare(strDSLink, IDataEntity.DSLINK_DB4, true) == 0) {
			return this.getSessionFactory4();
		}

		return this.getSessionFactory();
	}

	@Autowired(required = false)
	@Qualifier("dbDialect2")
	private IDBDialect dbDialect2;

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.sysmodel.ISystemRuntime#getDBDialect2()
	 */
	@Override
	public IDBDialect getDBDialect2() {
		if (dbDialect2 != null) return dbDialect2;
		return this.getDBDialect();
	}

	@Autowired(required = false)
	@Qualifier("sessionFactory2")
	private SessionFactory sessionFactory2;

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.sysmodel.ISystemRuntime#getSessionFactory2()
	 */
	@Override
	public SessionFactory getSessionFactory2() {
		if (sessionFactory2 != null) return sessionFactory2;
		return this.getSessionFactory();
	}

	@Autowired(required = false)
	@Qualifier("dbDialect3")
	private IDBDialect dbDialect3;

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.sysmodel.ISystemRuntime#getDBDialect3()
	 */
	@Override
	public IDBDialect getDBDialect3() {
		if (dbDialect3 != null) return dbDialect3;
		return this.getDBDialect();
	}

	@Autowired(required = false)
	@Qualifier("sessionFactory3")
	private SessionFactory sessionFactory3;

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.sysmodel.ISystemRuntime#getSessionFactory3()
	 */
	@Override
	public SessionFactory getSessionFactory3() {
		if (sessionFactory3 != null) return sessionFactory3;
		return this.getSessionFactory();
	}

	@Autowired(required = false)
	@Qualifier("dbDialect4")
	private IDBDialect dbDialect4;

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.sysmodel.ISystemRuntime#getDBDialect4()
	 */
	@Override
	public IDBDialect getDBDialect4() {
		if (dbDialect4 != null) return dbDialect4;
		return this.getDBDialect();
	}

	@Autowired(required = false)
	@Qualifier("sessionFactory4")
	private SessionFactory sessionFactory4;

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.sysmodel.ISystemRuntime#getSessionFactory4()
	 */
	@Override
	public SessionFactory getSessionFactory4() {
		if (sessionFactory4 != null) return sessionFactory4;
		return this.getSessionFactory();
	}

	/**
	 * 进一步构建系统模型
	 * 
	 * @throws Exception
	 */
	public void postConstruct() throws Exception {
		if (this.dbDialect != null && this.sessionFactory != null) {
			DAOGlobal.registerDBDialect(this.sessionFactory, this.dbDialect);
		}
		if (this.dbDialect2 != null && this.sessionFactory2 != null) {
			DAOGlobal.registerDBDialect(this.sessionFactory2, this.dbDialect2);
		}
		if (this.dbDialect3 != null && this.sessionFactory3 != null) {
			DAOGlobal.registerDBDialect(this.sessionFactory3, this.dbDialect3);
		}
		if (this.dbDialect4 != null && this.sessionFactory4 != null) {
			DAOGlobal.registerDBDialect(this.sessionFactory4, this.dbDialect4);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.sysmodel.ISystemRuntime#installRTDatas()
	 */
	@Override
	public void installRTDatas() throws Exception {
		installBASchemes();
		installWFRTDatas();
		onInstallRTDatas();
	}

	/**
	 * 安装运行时数据触发
	 * 
	 * @throws Exception
	 */
	protected void onInstallRTDatas() throws Exception {

	}

	/**
	 * 安装工作流运行时数据
	 * 
	 * @throws Exception
	 */
	protected void installWFRTDatas() throws Exception {
		// 准备流程角色
		WFUserGroupService wfUserGroupService = (WFUserGroupService) ServiceGlobal.getService(WFUserGroupService.class);
		WFDynamicUserService wfDynamicUserService = (WFDynamicUserService) ServiceGlobal.getService(WFDynamicUserService.class);
		java.util.Iterator<IWFRoleModel> wfRoleModes = this.getWFRoleModels();
		if (wfRoleModes != null) {
			while (wfRoleModes.hasNext()) {
				IWFRoleModel iWFRoleModel = wfRoleModes.next();
				// 判断是否为用户组
				if (StringHelper.compare(iWFRoleModel.getWFRoleType(), IWFRoleModel.WFROLETYPE_USERGROUP, true) == 0) {
					WFUserGroup wfUserGroup = new WFUserGroup();
					wfUserGroup.setWFUserGroupId(iWFRoleModel.getId());
					wfUserGroup.setWFUserGroupName(iWFRoleModel.getName());
					wfUserGroup.set(IProcParam.TAG_PERSONID, "SYSTEM");
					wfUserGroupService.save(wfUserGroup);

					ActionSessionManager.appendActionInfo(StringHelper.format("[%1$s]安装[%2$s][%3$s]\r\n", this.getName(), wfUserGroupService.getDEModel().getLogicName(), wfUserGroupService.getDEModel().getDataInfo(wfUserGroup)));
					continue;
				}

				if (StringHelper.compare(iWFRoleModel.getWFRoleType(), IWFRoleModel.WFROLETYPE_CUSTOM, true) == 0) {
					WFDynamicUser wfDynamicUser = new WFDynamicUser();
					wfDynamicUser.setWFDynamicUserId(iWFRoleModel.getId());
					wfDynamicUser.setWFDynamicUserName(iWFRoleModel.getName());
					wfDynamicUser.setUserObject("#");
					wfDynamicUser.set(IProcParam.TAG_PERSONID, "SYSTEM");
					wfDynamicUserService.save(wfDynamicUser);

					ActionSessionManager.appendActionInfo(StringHelper.format("[%1$s]安装[%2$s][%3$s]\r\n", this.getName(), wfDynamicUserService.getDEModel().getLogicName(), wfDynamicUserService.getDEModel().getDataInfo(wfDynamicUser)));
					continue;
				}
			}
		}

		// 准备工作流
		for (IWFModel iWFModel : this.wfModelMap.values()) {
			WFWorkflowService wfWorkflowService = (WFWorkflowService) ServiceGlobal.getService(WFWorkflowService.class);
			WFWorkflow wfWorkflow = new WFWorkflow();
			wfWorkflow.setWFWorkflowId(iWFModel.getId());
			if (wfWorkflowService.checkKey(wfWorkflow) == IService.CHECKKEYSTATE_OK) {
				// 新建数据
				wfWorkflow.setWFWorkflowName(iWFModel.getName());
				wfWorkflow.setWFState(1);
				if (!StringHelper.isNullOrEmpty(iWFModel.getRemindMsgTemplId())) wfWorkflow.setRemindMsgTemplId(iWFModel.getRemindMsgTemplId());
				wfWorkflow.setWFLogicName(iWFModel.getName());
				wfWorkflow.setWFVersion(1);
				wfWorkflow.setWFModel("<?xml version=\"1.0\" encoding=\"utf-8\" ?><SRFEXWFWORKFLOW></SRFEXWFWORKFLOW>");
				wfWorkflow.set(IProcParam.TAG_PERSONID, "SYSTEM");
				wfWorkflowService.create(wfWorkflow);

				ActionSessionManager.appendActionInfo(StringHelper.format("[%1$s]安装[%2$s][%3$s]\r\n", this.getName(), wfWorkflowService.getDEModel().getLogicName(), wfWorkflowService.getDEModel().getDataInfo(wfWorkflow)));
			}
		}

	}

	/**
	 * 安装大数据架构
	 * 
	 * @throws Exception
	 */
	protected void installBASchemes() throws Exception {
		for (IBASchemeModel iBASchemeModel : baSchemeModelMap.values()) {
			try {
				if (iBASchemeModel instanceof IBASchemeRuntime) {
					((IBASchemeRuntime) iBASchemeModel).install();
				}
			} catch (Exception ex) {
				throw new Exception("安装大数据架构", ex);
			}
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.sysmodel.ISystemModel#getValueTranslator(java.lang.String )
	 */
	@Override
	public IValueTranslator getValueTranslator(String strTranslator) throws Exception {
		return ValueTranslatorGlobal.getValueTranslator(strTranslator);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.sysmodel.ISystemRuntime#getLocalization()
	 */
	@Override
	public String getLocalization() {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.sysmodel.ISystemModel#getDERs(java.lang.String, boolean)
	 */
	@Override
	public java.util.Iterator<IDERBase> getDERs(String strDEId, boolean bMajor) {
		ArrayList<IDERBase> list = null;
		if (bMajor) {
			list = this.deMajorDERsMap.get(strDEId);
		} else {
			list = this.deMinorDERsMap.get(strDEId);
		}
		if (list == null) return null;
		return list.iterator();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.springframework.web.context.ServletContextAware#setServletContext(javax.servlet.ServletContext)
	 */
	@Override
	public void setServletContext(ServletContext arg0) {
		this.servletContext = arg0;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.sysmodel.ISystemModel#getDynamicModelStorage()
	 */
	@Override
	public IDynamicModelStorage getDynamicModelStorage() throws Exception {
		if (iDynamicModelStorage == null) {
			if (this.servletContext == null) {
				throw new Exception("应用程序上下文对象无效");
			}

			WebDynamicModelStorage webDynamicModelStorage = new WebDynamicModelStorage();
			webDynamicModelStorage.setServletContext(this.servletContext);
			this.iDynamicModelStorage = webDynamicModelStorage;
		}
		return this.iDynamicModelStorage;
	}

	@Override
	public IDEDataAccMgr createDEDataAccMgr(IDataEntityModel iDEModel) throws Exception {
		DEDataAccMgr iDEDataAccMgr = new DEDataAccMgr();
		iDEDataAccMgr.init(iDEModel);
		return iDEDataAccMgr;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.sysmodel.ISystemRuntime#createObject(java.lang.String)
	 */
	@Override
	public Object createObject(String strObjectType) throws Exception {
		if (replaceObjectMap != null) {
			String strNewObject = replaceObjectMap.get(strObjectType);
			if (!StringHelper.isNullOrEmpty(strNewObject)) return ObjectHelper.create(strNewObject);
		}
		return ObjectHelper.create(strObjectType);
	}

	/**
	 * 建立对象，如果对象提供 IPostConstructable 接口，则调用 postConstruct 方法。
	 * 
	 * @param strObjectType
	 * @return
	 * @throws Exception
	 */
	public Object createObject2(String strObjectType) throws Exception {

		Object object = createObject(strObjectType);
		if (object != null && object instanceof IPostConstructable) {
			((IPostConstructable) object).postConstruct();
		}
		return object;
	}

	/**
	 * 替换对象
	 * 
	 * @param strObject
	 * @param strNewObject
	 */
	public static synchronized void replaceObject(String strObject, String strNewObject) {
		if (replaceObjectMap == null) replaceObjectMap = new HashMap<String, String>();
		replaceObjectMap.put(strObject, strNewObject);
	}



//	/*
//	 * (non-Javadoc)
//	 * @see net.ibizsys.paas.sysmodel.ISystemModel#fillViewMessages(net.ibizsys.paas.view.IViewMsgModel, java.util.ArrayList)
//	 */
//	@Override
//	public void fillViewMessages(IViewMsgModel iViewMsgModel, ArrayList<IViewMessage> viewMessageList) throws Exception {
//		iViewMsgModel.fillViewMessages(viewMessageList);
//	}
//
//	/* (non-Javadoc)
//	 * @see net.ibizsys.paas.sysmodel.ISystemModel#fillViewWizards(net.ibizsys.paas.view.IViewWizardModel, java.util.ArrayList)
//	 */
//	@Override
//	public void fillViewWizards(IViewWizardModel iViewWizardModel, ArrayList<IViewWizard> viewWizardList) throws Exception {
//		iViewWizardModel.fillViewWizards(strQuery, viewWizardList);
//	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.sysmodel.ISystemModel#getViewMessages(net.ibizsys.paas.view.IViewMsgGroupModel)
	 */
	@Override
	public Iterator<IViewMessage> getViewMessages(IViewMsgGroupModel iViewMsgGroupModel) throws Exception {

		ArrayList<IViewMessage> viewMessageList = new ArrayList<IViewMessage>();
		iViewMsgGroupModel.fillViewMessages(viewMessageList);
		return viewMessageList.iterator();
	}
	
	/* (non-Javadoc)
	 * @see net.ibizsys.paas.sysmodel.ISystemModel#getViewWizards(net.ibizsys.paas.view.IViewWizardGroupModel, java.lang.String)
	 */
	@Override
	public Iterator<IViewWizard> getViewWizards(IViewWizardGroupModel iViewWizardGroupModel, String strQuery) throws Exception {
		ArrayList<IViewWizard> viewWizardList = new ArrayList<IViewWizard>();
		iViewWizardGroupModel.fillViewWizards(strQuery, viewWizardList);
		return viewWizardList.iterator();
	}



	@Override
	public void setSystemPlugin(ISystemPlugin iSystemPlugin) throws Exception {
		setSystemPlugin(iSystemPlugin,false);
	}

	@Override
	public void setSystemPlugin(ISystemPlugin iSystemPlugin, boolean bIgnoreOrigin) throws Exception {
		ISystemPlugin lastPlugin = null;
		if(!bIgnoreOrigin){
			lastPlugin = this.iSystemPlugin;
			if(lastPlugin == null){
				lastPlugin = SysModelGlobal.getSystemPlugin();
			}
		}
		
		iSystemPlugin.setPrevPlugin(lastPlugin);
		this.iSystemPlugin = iSystemPlugin;
	}

	@Override
	public ISystemPlugin getSystemPlugin() {
		return iSystemPlugin;
	}

	
	
	
	
	

}
