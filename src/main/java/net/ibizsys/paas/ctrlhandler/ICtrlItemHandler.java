package net.ibizsys.paas.ctrlhandler;

import net.ibizsys.paas.web.AjaxActionResult;

/**
 * 自动填充处理对象接口
 * 
 * @author lionlau
 *
 */
public interface ICtrlItemHandler {
	/**
	 * 处理
	 * 
	 * @param strAction
	 * @param iWebContext
	 * @return
	 * @throws Exception
	 */
	AjaxActionResult processAction(String strAction) throws Exception;
}
