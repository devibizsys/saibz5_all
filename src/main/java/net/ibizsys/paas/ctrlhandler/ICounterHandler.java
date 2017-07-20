package net.ibizsys.paas.ctrlhandler;

import net.ibizsys.paas.controller.IViewController;
import net.ibizsys.paas.core.ISystem;
import net.ibizsys.paas.web.AjaxActionResult;
import net.ibizsys.paas.web.IWebContext;

/**
 * 计数器处理对象接口
 * 
 * @author Administrator
 *
 */
public interface ICounterHandler {
	/**
	 * 获取数据
	 */
	final static String ACTION_FETCH = "fetch";

	/**
	 * 初始化
	 * 
	 * @param iSystemModel
	 * @throws Exception
	 */
	void init(ISystem iSystem) throws Exception;

	/**
	 * 处理
	 * 
	 * @param strAction
	 * @param iViewController
	 * @param iWebContext
	 * @return
	 * @throws Exception
	 */
	AjaxActionResult processAction(String strAction, IViewController iViewController, IWebContext iWebContext) throws Exception;
}
