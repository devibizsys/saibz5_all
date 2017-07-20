package net.ibizsys.paas.web;

import javax.servlet.ServletContext;

import net.ibizsys.paas.core.DynamicModelStorageBase;

/**
 * Web 动态模型存储对象
 * 
 * @author Administrator
 *
 */
public class WebDynamicModelStorage extends DynamicModelStorageBase {
	private ServletContext servletContext = null;

	/**
	 * 设置ServletContext对象
	 * 
	 * @param servletContext
	 */
	public void setServletContext(ServletContext servletContext) {
		this.servletContext = servletContext;
	}

	/**
	 * 获取ServletContext对象
	 * 
	 * @return
	 */
	public ServletContext getServletContext() {
		return this.servletContext;
	}
}
