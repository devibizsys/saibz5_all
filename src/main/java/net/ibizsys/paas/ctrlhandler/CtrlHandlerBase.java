package net.ibizsys.paas.ctrlhandler;

import java.util.HashMap;

import net.ibizsys.paas.controller.IViewController;
import net.ibizsys.paas.core.CallResult;
import net.ibizsys.paas.core.IDEUIAction;
import net.ibizsys.paas.ctrlmodel.ICtrlModel;
import net.ibizsys.paas.demodel.IDataEntityModel;
import net.ibizsys.paas.entity.EntityBase;
import net.ibizsys.paas.entity.EntityFieldError;
import net.ibizsys.paas.entity.IEntity;
import net.ibizsys.paas.service.IService;
import net.ibizsys.paas.service.ServiceBase;
import net.ibizsys.paas.sysmodel.ISystemModel;
import net.ibizsys.paas.util.StringHelper;
import net.ibizsys.paas.web.AjaxActionResult;
import net.ibizsys.paas.web.IWebContext;
import net.ibizsys.psrt.srv.web.WebContext;
import net.sf.json.JSONObject;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.SessionFactory;

/**
 * 部件处理类基类
 * 
 * @author lionlau
 * 
 */
public abstract class CtrlHandlerBase implements ICtrlHandler {
	private static final Log log = LogFactory.getLog(CtrlHandlerBase.class);

	private ThreadLocal<IWebContext> webContext = new ThreadLocal<IWebContext>();

	private IViewController iViewController = null;

	private HashMap<String, String> dataAccessActionMap = new HashMap<String, String>();

	private HashMap<String, ICtrlItemHandler> ctrlItemHandlerMap = new HashMap<String, ICtrlItemHandler>();

	/**
	 * 初始化
	 * 
	 * @param iViewController 视图控制器
	 * @throws Exception
	 */
	@Override
	public void init(IViewController iViewController) throws Exception {
		setViewController(iViewController);
		onInit();
		prepareCtrlItemHandlers();
		prepareDataAccessActions();
	}

	protected void onInit() throws Exception {

	}

	/**
	 * 准备部件成员处理对象
	 * 
	 * @throws Exception
	 */
	protected void prepareCtrlItemHandlers() throws Exception {

	}

	/**
	 * 准备部件操作数据访问能力
	 * 
	 * @throws Exception
	 */
	protected void prepareDataAccessActions() throws Exception {

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.ctrlhandler.ICtrlHandler#handlerAction(java.lang.String, net.ibizsys.paas.web.IWebContext)
	 */
	@Override
	public AjaxActionResult processAction(String strAction, IWebContext iWebContext) throws Exception {
		this.setWebContext(iWebContext);

		AjaxActionResult ajaxActionResult = onProcessAction(strAction);
		ajaxActionResult.setAjaxAction(strAction);
		ICtrlRender iCtrlRender = getCtrlRender();
		if (iCtrlRender != null) {
			ajaxActionResult.setCtrlRender(iCtrlRender);
		}
		return ajaxActionResult;
	}

	protected AjaxActionResult onProcessAction(String strAction) throws Exception {
		throw new Exception(StringHelper.format("没有实现远程请求[%1$s]", strAction));
	}

	/**
	 * 获取视图控制器
	 * 
	 * @return
	 */
	public IViewController getViewController() {
		return iViewController;
	}

	/**
	 * 设置视图控制器
	 * 
	 * @param iViewController
	 */
	protected void setViewController(IViewController iViewController) {
		this.iViewController = iViewController;
	}

	/**
	 * 获取上下文对象
	 * 
	 * @return
	 */
	public IWebContext getWebContext() {
		return webContext.get();
	}

	/**
	 * 设置上下文对象
	 * 
	 * @param value
	 */
	private void setWebContext(IWebContext value) {
		webContext.set(value);
	}

	/**
	 * 获取当前系统模型
	 * 
	 * @return
	 */
	protected ISystemModel getSystemModel() {
		return this.getViewController().getSystemModel();
	}

	/**
	 * 获取当前实体模型
	 * 
	 * @return
	 */
	protected IDataEntityModel getDEModel() {
		if (this.getCtrlModel() != null && this.getCtrlModel().getDEModel() != null) return this.getCtrlModel().getDEModel();

		return this.getViewController().getDEModel();
	}

	/**
	 * 获取服务对象
	 * 
	 * @return
	 */
	protected IService getService() {
		if (this.getCtrlModel() != null && this.getCtrlModel().getDEModel() != null) {
			try {
				return this.getCtrlModel().getDEModel().getService(this.getSessionFactory());
			} catch (Exception ex) {
				log.error(ex.getMessage(), ex);
			}
		}

		if (this.getViewController().getDEModel() == null && (this.getCtrlModel() != null && this.getCtrlModel().getDEModel() != null)) {
			try {
				return this.getCtrlModel().getDEModel().getService(this.getSessionFactory());
			} catch (Exception ex) {
				log.error(ex.getMessage(), ex);
			}
		}

		if (this.getViewController().getDEModel() != null && this.getCtrlModel() != null && this.getCtrlModel().getDEModel() != null && (StringHelper.compare(this.getCtrlModel().getDEModel().getId(), this.getViewController().getDEModel().getId(), false) != 0)) {
			try {
				return this.getCtrlModel().getDEModel().getService(this.getSessionFactory());
			} catch (Exception ex) {
				log.error(ex.getMessage(), ex);
			}
		}

		return this.getViewController().getService();
	}

	/**
	 * 获取数据访问行为
	 * 
	 * @param strAjaxActionName 行为名称
	 * @return
	 */
	protected String getDataAccessAction(String strAjaxActionName) {
		return dataAccessActionMap.get(strAjaxActionName.toUpperCase());
	}

	/**
	 * 注册数据访问行为
	 * 
	 * @param strAjaxActionName 行为名称
	 * @param strDataAction 数据行为
	 */
	protected void registerDataAccessAction(String strAjaxActionName, String strDataAction) {
		dataAccessActionMap.put(strAjaxActionName.toUpperCase(), strDataAction);
	}

	/**
	 * 测试数据
	 * 
	 * @param objKey 数据主键
	 * @param strDataAccessAction 数据访问行为
	 * @return
	 * @throws Exception
	 */
	protected CallResult testDataAccessAction(Object objValue, String strDataAccessAction) throws Exception {
		return testDataAccessAction(getSimpleEntity(objValue), strDataAccessAction);
	}

	/**
	 * 测试数据是否具备指定权限
	 * 
	 * @param iEntity 数据
	 * @param strDataAccessAction 数据访问行为
	 * @return
	 * @throws Exception
	 */
	protected CallResult testDataAccessAction(IEntity iEntity, String strDataAccessAction) throws Exception {
		return this.getWebContext().getUserPrivilegeMgr().testDataAccessAction(this.getWebContext(), this.getDEModel(), iEntity, strDataAccessAction);
	}

	/**
	 * 获取部件成员处理对象
	 * 
	 * @param strItemName 部件名称
	 * @return
	 */
	protected ICtrlItemHandler getCtrlItemHandler(String strItemName) throws Exception {
		ICtrlItemHandler iCtrlItemHandler = ctrlItemHandlerMap.get(strItemName.toUpperCase());
		if (iCtrlItemHandler == null) {
			throw new Exception(StringHelper.format("无法获取部件成员[%1$s]处理对象", strItemName));
		}
		return iCtrlItemHandler;
	}

	/**
	 * 注册部件成员处理对象
	 * 
	 * @param strItemName 部件名称
	 * @param iCtrlItemHandler 处理对象
	 */
	protected void registerCtrlItemHandler(String strItemName, ICtrlItemHandler iCtrlItemHandler) {
		ctrlItemHandlerMap.put(strItemName.toUpperCase(), iCtrlItemHandler);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.ctrlhandler.ICtrlHandler#isTempMode()
	 */
	@Override
	public int getTempMode() {
		return TEMPMODE_NONE;
	}

	/**
	 * 获取会话工程
	 * 
	 * @return
	 */
	public SessionFactory getSessionFactory() {
		return this.iViewController.getSessionFactory();
	}

	/**
	 * 获取当前部件绘制器
	 * 
	 * @return
	 */
	protected ICtrlRender getCtrlRender() throws Exception {
		String strRender = WebContext.getRender(this.getWebContext());
		if (!StringHelper.isNullOrEmpty(strRender)) {
			return this.getViewController().getAppModel().getCtrlRender(this.getCtrlModel().getControlType(), strRender);
		}
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.ctrlhandler.ICtrlHandler#convertEntityFieldError(net.ibizsys.paas.entity.EntityFieldError)
	 */
	@Override
	public boolean convertEntityFieldError(EntityFieldError entityFieldError) throws Exception {
		return false;
	}

	/**
	 * 获取数据对象，用于权限处理
	 * 
	 * @param objKey 数据主键
	 * @return
	 * @throws Exception
	 */
	protected IEntity getSimpleEntity(Object objKey) throws Exception {
		if (objKey != null && objKey instanceof String) {
			if (((String) objKey).indexOf(ServiceBase.TEMPKEY) == 0){
				if(this.getTempMode() == TEMPMODE_MINOR)
					return null;
				//获取临时数据
				IEntity iEntity = this.getDEModel().createEntity();
				iEntity.set(this.getDEModel().getKeyDEField().getName(), objKey);
				this.getService().getTemp(iEntity);
				objKey = EntityBase.getOriginKey(iEntity);
				if(StringHelper.isNullOrEmpty(objKey))
					return null;
			}
		}
		IEntity iEntity = this.getDEModel().createEntity();
		iEntity.set(this.getDEModel().getKeyDEField().getName(), objKey);
		this.getService().get(iEntity);
		return iEntity;
	}
	
	/**
	 * 获取数据对象，用于权限处理
	 * 
	 * @param objKey 数据主键
	 * @return
	 * @throws Exception
	 */
	protected IEntity getSimpleEntity(IDataEntityModel iDataEntityModel,Object objKey) throws Exception {
		if (objKey != null && objKey instanceof String) {
			if (((String) objKey).indexOf(ServiceBase.TEMPKEY) == 0){
				if(this.getTempMode() == TEMPMODE_MINOR)
					return null;
				//获取临时数据
				IEntity iEntity = iDataEntityModel.createEntity();
				iEntity.set(iDataEntityModel.getKeyDEField().getName(), objKey);
				iDataEntityModel.getService(this.getSessionFactory()).getTemp(iEntity);
				objKey = EntityBase.getOriginKey(iEntity);
				if(StringHelper.isNullOrEmpty(objKey))
					return null;
			}
		}
		IEntity iEntity =iDataEntityModel.createEntity();
		iEntity.set(iDataEntityModel.getKeyDEField().getName(), objKey);
		iDataEntityModel.getService(this.getSessionFactory()).get(iEntity);
		return iEntity;
	}

	/**
	 * 获取数据范围行为
	 * 
	 * @return
	 * @throws Exception
	 */
	protected java.util.Iterator<String> getDataAccessActions() throws Exception {
		if (dataAccessActionMap.size() == 0) return null;
		return dataAccessActionMap.values().iterator();
	}

	/**
	 * 获取获取数据行为名称
	 * 
	 * @return
	 */
	protected String getGetEntityAction() {
		return null;
	}

	@Override
	public abstract ICtrlModel getCtrlModel();

	/**
	 * 填充数据允许的访问操作
	 * 
	 * @param dataAccObject 数据访问行为
	 * @param bOk 是否允许.true 表示允许， false 表示禁止
	 * @throws Exception
	 */
	protected void fillDataAccActions(JSONObject dataAccObject, boolean bOk) throws Exception {
		java.util.Iterator<String> accActions = this.getDataAccessActions();
		if (accActions != null) {
			while (accActions.hasNext()) {
				String strAction = accActions.next();
				if (StringHelper.isNullOrEmpty(strAction)) continue;

				if (dataAccObject.has(strAction)) continue;

				if (!bOk) {
					dataAccObject.put(strAction, 0);
				} else {
					dataAccObject.put(strAction, 1);
				}
			}
		}

		java.util.Iterator<String> uiActions = this.getViewController().getUIActions();
		if (uiActions != null) {
			while (uiActions.hasNext()) {
				String strUIActionId = uiActions.next();
				IDEUIAction iDEUIAction = this.getDEModel().getDEUIAction(strUIActionId);
				String strDataAccAction = iDEUIAction.getDataAccessAction();
				if (StringHelper.isNullOrEmpty(strDataAccAction)) continue;

				if (dataAccObject.has(strDataAccAction)) continue;

				if (!bOk) {
					dataAccObject.put(strDataAccAction, 0);
				} else {
					dataAccObject.put(strDataAccAction, 1);
				}
			}
		}
	}

	/**
	 * 填充数据允许的访问操作
	 * 
	 * @param dataAccObject
	 * @param iEntity
	 * @throws Exception
	 */
	protected void fillDataAccActions(JSONObject dataAccObject, IEntity iEntity) throws Exception {
		java.util.Iterator<String> accActions = this.getDataAccessActions();
		if (accActions != null) {
			while (accActions.hasNext()) {
				String strAction = accActions.next();
				if (StringHelper.isNullOrEmpty(strAction)) continue;

				if (dataAccObject.has(strAction)) continue;

				CallResult callResult = this.testDataAccessAction(iEntity, strAction);
				if (callResult.isError()) {
					dataAccObject.put(strAction, 0);
				} else {
					dataAccObject.put(strAction, 1);
				}
			}
		}

		java.util.Iterator<String> deDataAccessActions = this.getViewController().getDEDataAccessActions(this.getDEModel().getName());
		if (deDataAccessActions != null) {
			while (deDataAccessActions.hasNext()) {
				String strDataAccAction = deDataAccessActions.next();
				if (StringHelper.isNullOrEmpty(strDataAccAction)) continue;

				if (dataAccObject.has(strDataAccAction)) continue;

				CallResult callResult = this.testDataAccessAction(iEntity, strDataAccAction);
				if (callResult.isError()) {
					dataAccObject.put(strDataAccAction, 0);
				} else {
					dataAccObject.put(strDataAccAction, 1);
				}
			}
		}
	}
}
