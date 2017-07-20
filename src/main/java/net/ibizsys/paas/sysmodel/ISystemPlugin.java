package net.ibizsys.paas.sysmodel;

import net.ibizsys.paas.core.IPlugin;
import net.ibizsys.paas.service.IServicePlugin;

/**
 * 系统插件
 * @author Administrator
 *
 */
public interface ISystemPlugin extends IPlugin {

	
	
	
	/**
	 * 初始化系统插件
	 * @param iSystemModel
	 * @param strPluginParams
	 * @throws Exception
	 */
	void init(ISystemModel iSystemModel,String strPluginParams) throws Exception;
	
	
	
	
	/**
	 * 获取服务插件
	 * @return
	 */
	IServicePlugin getServicePlugin();
	
}
