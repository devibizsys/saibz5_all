package net.ibizsys.paas.appmodel;

import net.ibizsys.paas.core.IApplication;

/**
 * 应用程序插件
 * @author Administrator
 *
 */
public interface IApplicationPlugin {

	/**
	 * 初始化插件
	 * @param iApplication
	 * @throws Exception
	 */
	void init(IApplication iApplication )throws Exception;
}
