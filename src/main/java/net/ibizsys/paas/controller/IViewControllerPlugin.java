package net.ibizsys.paas.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 视图插件
 * @author Administrator
 *
 */
public interface IViewControllerPlugin {
	
	/**
	 * 初始化视图插件
	 * @param iViewController
	 * @throws Exception
	 */
	void init(IViewController iViewController)throws Exception;
	
	
	
	/**
	 * 过滤请求，如果处理，返回true
	 * 
	 * @param iViewController 视图控制器接口
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	boolean doFilter(IViewController iViewController, HttpServletRequest request, HttpServletResponse response) throws Exception;
}
