package net.ibizsys.pswx.core;

import java.util.HashMap;

import net.ibizsys.paas.util.StringHelper;

/**
 * 微信模块全局对象
 * 
 * @author Administrator
 * 
 */
public class WXGlobal {
	private static HashMap<String, IWXAccountModel> wxAccountModelMap = new HashMap<String, IWXAccountModel>();
	private static IWXGlobalPlugin iWXGlobalPlugin = null;

	/**
	 * 注册微信公众号
	 * 
	 * @param strWXAccountModelClsType 微信公众号对象类
	 * @param iWXAccountModel
	 */
	public static void registerWXAccountModel(String strWXAccountModelClsType, IWXAccountModel iWXAccountModel) {
		if (getPlugin() != null) {
			getPlugin().registerWXAccountModel(strWXAccountModelClsType, iWXAccountModel);
			return;
		}

		if (!wxAccountModelMap.containsKey(strWXAccountModelClsType)) {
			wxAccountModelMap.put(strWXAccountModelClsType, iWXAccountModel);
		}

		try {
			refreshWXAccount(strWXAccountModelClsType);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 获取微信公众号
	 * 
	 * @param cls 计数处理对象类
	 * @return
	 * @throws Exception
	 */
	public static IWXAccountModel getWXAccountModel(Class<?> cls) throws Exception {
		if (getPlugin() != null) {
			return getPlugin().getWXAccountModel(cls);
		}
		return getWXAccountModel(cls.getCanonicalName());
	}

	/**
	 * 获取微信公众号
	 * 
	 * @param strWXAccountModelClsType 微信公众号对象类
	 * @return
	 * @throws Exception
	 */
	public static IWXAccountModel getWXAccountModel(String strWXAccountModelClsType) throws Exception {
		if (getPlugin() != null) {
			return getPlugin().getWXAccountModel(strWXAccountModelClsType);
		}

		IWXAccountModel iWXAccountModel = wxAccountModelMap.get(strWXAccountModelClsType);
		if (iWXAccountModel == null) throw new Exception(StringHelper.format("无法获取指定微信公众号[%1$s]", strWXAccountModelClsType));
		return iWXAccountModel;
	}

	/**
	 * 设置插件
	 * 
	 * @param iWXGlobalPlugin
	 */
	public static void setPlugin(IWXGlobalPlugin iWXGlobalPlugin) {
		WXGlobal.iWXGlobalPlugin = iWXGlobalPlugin;
	}

	public static IWXGlobalPlugin getPlugin() {
		return WXGlobal.iWXGlobalPlugin;
	}

	/**
	 * 刷新微信账号
	 * 
	 * @param accountId
	 * @throws Exception
	 */
	public static void refreshWXAccount(String accountId) throws Exception {
		IWXAccountModel accontModel = getWXAccountModel(accountId);

		if (accontModel != null) {
			accontModel.refresh();
		}
	}

}
