package net.ibizsys.paas.appmodel;

import net.ibizsys.paas.core.ModelBaseImpl;

/**
 * 应用视图模型对象
 * 
 * @author Administrator
 *
 */
public class AppViewModel extends ModelBaseImpl implements IAppViewModel {
	private String strTitle = null;
	private String strModuleName = null;

	private String strOpenMode = null;
	private int nWidth = 0;
	private int nHeight = 0;

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.appmodel.IAppViewModel#getTitle()
	 */
	@Override
	public String getTitle() {
		return strTitle;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.appmodel.IAppViewModel#getModuleName()
	 */
	@Override
	public String getModuleName() {
		return strModuleName;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.appmodel.IAppViewModel#getOpenMode()
	 */
	@Override
	public String getOpenMode() {
		return strOpenMode;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.appmodel.IAppViewModel#getWidth()
	 */
	@Override
	public int getWidth() {
		return nWidth;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.appmodel.IAppViewModel#getHeight()
	 */
	@Override
	public int getHeight() {
		return nHeight;
	}

	/**
	 * 设置视图标题
	 * 
	 * @param strTitle
	 */
	public void setTitle(String strTitle) {
		this.strTitle = strTitle;
	}

	/**
	 * 设置视图模块名称
	 * 
	 * @param strModuleName
	 */
	public void setModuleName(String strModuleName) {
		this.strModuleName = strModuleName;
	}

	/**
	 * 设置视图名称
	 * 
	 * @param strName
	 */
	public void setName(String strName) {
		this.strName = strName;
	}

	/**
	 * 设置视图标识
	 * 
	 * @param strId
	 */
	public void setId(String strId) {
		this.strId = strId;
	}

	/**
	 * 设置视图打开模式
	 * 
	 * @param strOpenMode
	 */
	public void setOpenMode(String strOpenMode) {
		this.strOpenMode = strOpenMode;
	}

	/**
	 * 设置视图宽度
	 * 
	 * @param nWidth
	 */
	public void setWidth(int nWidth) {
		this.nWidth = nWidth;
	}

	/**
	 * 设置视图高度
	 * 
	 * @param nHeight
	 */
	public void setHeight(int nHeight) {
		this.nHeight = nHeight;
	}

}
