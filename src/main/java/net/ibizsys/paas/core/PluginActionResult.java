package net.ibizsys.paas.core;

/**
 * 插件操作结果对象
 * @author Administrator
 *
 */
public class PluginActionResult {
	
	/**
	 * 替换原有操作
	 */
	public final static PluginActionResult Replace = new PluginActionResult();
	
	
	/**
	 * 继续原有操作
	 */
	public final static PluginActionResult Continue = new PluginActionResult();
}
