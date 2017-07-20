package net.ibizsys.paas.ctrlmodel;

import java.util.HashMap;

import net.ibizsys.paas.controller.IViewController;
import net.ibizsys.paas.core.IDataEntity;
import net.ibizsys.paas.ctrlhandler.ICtrlRender;
import net.ibizsys.paas.demodel.IDataEntityModel;
import net.ibizsys.paas.util.KeyValueHelper;
import net.ibizsys.paas.util.StringHelper;
import net.ibizsys.paas.view.IView;
import net.ibizsys.paas.web.WebContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * 控件模型基类
 * 
 * @author lionlau
 *
 */
public abstract class CtrlModelBase implements ICtrlModel {
	private static final Log log = LogFactory.getLog(CtrlModelBase.class);

	private HashMap<String, Object> ctrlParams = null;

	/**
	 * 控件标识
	 */
	private String strId = "";

	/**
	 * 控件名称
	 */
	private String strName = "";

	/**
	 * 视图控制器
	 */
	private IViewController iViewController = null;

	private String strUniqueId = KeyValueHelper.genGuidEx();

	/**
	 * 初始化视图部件模型
	 * 
	 * @param iViewController
	 * @throws Exception
	 */
	@Override
	public void init(IViewController iViewController) throws Exception {
		setViewController(iViewController);
		onInit();
	}

	/**
	 * 初始化触发
	 * 
	 * @throws Exception
	 */
	protected void onInit() throws Exception {

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.ctrlmodel.ICtrlModel#getViewController()
	 */
	public IViewController getViewController() {
		return iViewController;
	}

	/**
	 * 设置视图控制器
	 * 
	 * @param iViewController the iViewController to set
	 */
	protected void setViewController(IViewController iViewController) {
		this.iViewController = iViewController;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.ctrlmodel.ICtrlModel#getDEModel()
	 */
	public IDataEntityModel getDEModel() {
		return this.getViewController().getDEModel();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.control.IControl#getView()
	 */
	@Override
	public IView getView() {
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.control.IControl#getDataEntity()
	 */
	@Override
	public IDataEntity getDataEntity() {
		return this.getDEModel();
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

	/**
	 * 设置名称
	 * 
	 * @param strName
	 */
	protected void setName(String strName) {
		this.strName = strName;
	}

	/**
	 * 获取控件模型的唯一标识
	 * 
	 * @return
	 */
	protected String getUniqueId() {
		return this.strUniqueId;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.ctrlmodel.ICtrlModel#setCtrlParam(java.lang.String, java.lang.Object)
	 */
	@Override
	public void setCtrlParam(String strParamName, Object objValue) {
		if (ctrlParams == null) {
			ctrlParams = new HashMap<String, Object>();
		}

		strParamName = strParamName.toUpperCase();
		ctrlParams.put(strParamName, objValue);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.ctrlmodel.ICtrlModel#getCtrlParam(java.lang.String)
	 */
	public Object getCtrlParam(String strParamName) {
		if (ctrlParams == null) return null;
		return ctrlParams.get(strParamName.toUpperCase());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.ctrlmodel.ICtrlModel#containsCtrlParam(java.lang.String)
	 */
	public boolean containsCtrlParam(String strParamName) {
		if (ctrlParams == null) return false;
		return ctrlParams.get(strParamName.toUpperCase()) != null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.ctrlmodel.ICtrlModel#getCtrlParam(java.lang.String, java.lang.String)
	 */
	public String getCtrlParam(String strParamName, String strDefault) {
		Object objValue = getCtrlParam(strParamName);
		if (objValue == null)
			return strDefault;
		else
			return objValue.toString();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.ctrlmodel.ICtrlModel#getCtrlParam(java.lang.String, boolean)
	 */
	public boolean getCtrlParam(String strParamName, boolean bDefault) {
		Object objValue = getCtrlParam(strParamName);
		if (objValue == null)
			return bDefault;
		else {
			return StringHelper.compare(objValue.toString(), "TRUE", true) == 0;
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.ctrlmodel.ICtrlModel#getCtrlParam(java.lang.String, int)
	 */
	public int getCtrlParam(String strParamName, int nDefault) {
		Object objValue = getCtrlParam(strParamName);
		if (objValue == null)
			return nDefault;
		else {
			try {
				return Integer.parseInt(objValue.toString());
			} catch (Exception ex) {
				log.error(ex);
				return nDefault;
			}
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.ctrlmodel.ICtrlModel#getCtrlParamNames()
	 */
	public java.util.Iterator<String> getCtrlParamNames() {
		if (ctrlParams == null) return null;
		return ctrlParams.keySet().iterator();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.ctrlmodel.ICtrlModel#getCtrlRender()
	 */
	@Override
	public ICtrlRender getCtrlRender() throws Exception {
		return this.getViewController().getAppModel().getCtrlRender(this.getControlType(), WebContext.getRender());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.ctrlmodel.ICtrlModel#getCtrlRender(java.lang.String)
	 */
	@Override
	public ICtrlRender getCtrlRender(String strRenderType) throws Exception {
		return this.getViewController().getAppModel().getCtrlRender(this.getControlType(), strRenderType);
	}
}
