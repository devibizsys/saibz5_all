package net.ibizsys.pswx.core;

import net.ibizsys.paas.core.IModelBase;

/**
 * 微信公众号模型接口
 * 
 * @author Administrator
 * 
 */
public interface IWXAccount extends IModelBase {

	/**
	 * 获取默认的微信菜单
	 * 
	 * @return
	 */
	IWXMenu getDefaultWXMenu();

	/**
	 * 获取微信企业应用对象
	 * 
	 * @param strWXEntAppId
	 * @return
	 * @throws Exception
	 */
	IWXEntApp getWXEntApp(String strWXEntAppId) throws Exception;
}
