package net.ibizsys.paas.sysmodel;

import java.util.HashMap;

import net.ibizsys.paas.core.ISystem;
import net.ibizsys.paas.util.StringHelper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * 系统模型全局对象
 * 
 * @author lionlau
 *
 */
public class SysModelGlobal {
	private static final Log log = LogFactory.getLog(SysModelGlobal.class);
	private static HashMap<String, ISystem> systemMap = new HashMap<String, ISystem>();
	private static ISystemPlugin iSystemPlugin = null;

	/**
	 * 注册系统对象
	 * 
	 * @param strSystemClsType
	 * @param iSystem
	 */
	public static void registerSystem(String strSystemClsType, ISystem iSystem) {
		log.info(StringHelper.format("注册系统模型对象[%1$s][%2$s]", strSystemClsType, iSystem));
		systemMap.put(strSystemClsType, iSystem);
	}

	/**
	 * 获取系统对象
	 * 
	 * @param strSystemClsType
	 * @return
	 * @throws Exception
	 */
	public static ISystem getSystem(String strSystemClsType) throws Exception {
		ISystem iSystem = systemMap.get(strSystemClsType);
		if (iSystem == null) throw new Exception(StringHelper.format("无法获取指定系统模型[%1$s]", strSystemClsType));
		return iSystem;
	}

	/**
	 * 获取系统对象
	 * 
	 * @param cls
	 * @return
	 * @throws Exception
	 */
	public static ISystem getSystem(Class cls) throws Exception {
		return getSystem(cls.getCanonicalName());
	}

	/**
	 * 获取全部系统对象
	 * 
	 * @return
	 */
	public static java.util.Iterator<ISystem> getAllSystems() {
		return systemMap.values().iterator();
	}
	
	
	
	
	/**
	 * 设置全局系统插件
	 * @param iSystemPlugin
	 * @throws Exception
	 */
	public static void setSystemPlugin(ISystemPlugin iSystemPlugin) throws Exception {
		setSystemPlugin(iSystemPlugin,false);
	}

	/**
	 * 设置全局系统插件
	 * @param iSystemPlugin
	 * @param bIgnoreOrigin 重置
	 * @throws Exception
	 */
	public static void setSystemPlugin(ISystemPlugin iSystemPlugin, boolean bIgnoreOrigin) throws Exception {
		ISystemPlugin lastPlugin = null;
		if(!bIgnoreOrigin){
			lastPlugin = SysModelGlobal.iSystemPlugin;
		}
		
		iSystemPlugin.setPrevPlugin(lastPlugin);
		SysModelGlobal.iSystemPlugin = iSystemPlugin;
	}

	public static ISystemPlugin getSystemPlugin() {
		return iSystemPlugin;
	}

}
