package net.ibizsys.paas.web;

import javax.servlet.jsp.PageContext;

import net.ibizsys.paas.appmodel.IApplicationModel;
import net.ibizsys.paas.controller.IViewController;
import net.ibizsys.paas.controller.ViewControllerGlobal;
import net.ibizsys.paas.ctrlmodel.IAppMenuModel;
import net.ibizsys.paas.ctrlmodel.ICtrlModel;
import net.ibizsys.paas.util.StringHelper;
import net.sf.json.JSONObject;

/**
 * 视图控制器页面对象
 * 
 * @author Administrator
 *
 */
public class VCPage extends Page {
	/**
	 * 
	 */
	private final static JSONObject EMPTYJSON = new JSONObject();

	/**
	 * 视图控制类
	 */
	private IViewController iViewController = null;

	/**
	 * 初始化页面对象
	 * 
	 * @param context
	 */
	final public boolean init(PageContext context, String strViewControllerId) throws Exception {
		if (iViewController == null) {
			iViewController = ViewControllerGlobal.getViewController(strViewControllerId);
			iViewController.prepareViewController();
			this.setAccessUserMode(iViewController.getAccessUserMode());
			this.setAccessKey(iViewController.getAccessKey());
		}
		return init(context);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.web.Page#onInit()
	 */
	@Override
	protected void onInit() throws Exception {
		super.onInit();
	}

	/**
	 * 获取视图控制类
	 * 
	 * @return
	 */
	public IViewController getViewController() {
		return this.iViewController;
	}

	/**
	 * 获取当前应用菜单模型
	 * 
	 * @return
	 * @throws Exception
	 */
	public IAppMenuModel getAppMenuModel() throws Exception {
		return this.getApplicationModel().getAppMenuModel(this.getWebContext().getCurUserMode());
	}

	/**
	 * 获取控件模型
	 * 
	 * @param strName
	 * @return
	 * @throws Exception
	 */
	public ICtrlModel getCtrlModel(String strName) throws Exception {
		return getViewController().getCtrlModel(strName);
	}

	/**
	 * 获取传入的父数据对象
	 * 
	 * @return
	 */
	public JSONObject getParentData() {
		String strParentData = this.getWebContext().getParamValue(WebContext.PARAM_PARENTDATA);
		if (!StringHelper.isNullOrEmpty(strParentData)) {
			return JSONObject.fromString(strParentData);
		}
		return EMPTYJSON;
	}

	/**
	 * 获取传入的父数据模式
	 * 
	 * @return
	 */
	public JSONObject getParentMode() {
		String strParentMode = this.getWebContext().getParamValue(WebContext.PARAM_PARENTMODE);
		if (!StringHelper.isNullOrEmpty(strParentMode)) {
			return JSONObject.fromString(strParentMode);
		}
		return EMPTYJSON;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.web.Page#getApplicationModel()
	 */
	@Override
	protected IApplicationModel getApplicationModel() throws Exception {
		return getViewController().getAppModel();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.web.Page#mapRealPageUrl(java.lang.String)
	 */
	@Override
	protected String mapRealPageUrl(String strPageUrl) throws Exception {
		if (strPageUrl.charAt(0) == '/') {
			return "../.." + strPageUrl;
		}
		return strPageUrl;
	}

}
