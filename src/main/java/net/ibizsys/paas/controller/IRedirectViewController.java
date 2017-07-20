package net.ibizsys.paas.controller;

import net.ibizsys.paas.appmodel.IAppViewModel;

/**
 * 重定向视图控制器接口
 * 
 * @author Administrator
 *
 */
public interface IRedirectViewController extends IViewController {
	/**
	 * 获取指定数据的重定向页面模型
	 * 
	 * @param strKeyValue 数据主键
	 * @return
	 * @throws Exception
	 */
	IAppViewModel getRDAppViewModel(String strKeyValue) throws Exception;
}
