package net.ibizsys.pswf.core;

import net.ibizsys.psrt.srv.wf.entity.WFInstance;

/**
 * 流程操作交互上下文对象接口
 * @author lionlau
 *
 */
public interface IWFActionContext2 extends IWFActionContext
{
	
	/**
	 * 获取当前流程实例
	 * @return
	 */
	WFInstance getActiveWFInstance();
}
