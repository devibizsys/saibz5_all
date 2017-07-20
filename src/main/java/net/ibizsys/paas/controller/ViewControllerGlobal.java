package net.ibizsys.paas.controller;

import java.util.ArrayList;
import java.util.HashMap;

import net.ibizsys.paas.util.StringHelper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * 视图控制器全局对象
 * 
 * @author lionlau
 *
 */
public class ViewControllerGlobal {
	
	private static final Log log = LogFactory.getLog(ViewControllerGlobal.class);
	private static HashMap<String, IViewController> viewControllerMap = new HashMap<String, IViewController>();
	private static IViewControllerGlobalPlugin iViewControllerGlobalPlugin = null;
	private static HashMap<String, ArrayList<IViewControllerPlugin>> viewControllerPluginMap = new HashMap<String, ArrayList<IViewControllerPlugin>>();
	
	/**
	 * 注册视图控制器
	 * 
	 * @param strViewControllerClsType
	 * @param iViewController
	 */
	public static void registerViewController(String strViewControllerClsType, IViewController iViewController) throws Exception {
		if(getPlugin()!=null){
			getPlugin().registerViewController(strViewControllerClsType, iViewController);
			return ;
		}
		if (!viewControllerMap.containsKey(strViewControllerClsType)) {
			// log.info(StringHelper.format("注册视图控制器[%1$s][%2$s]",strViewControllerClsType,iViewController));
			viewControllerMap.put(strViewControllerClsType, iViewController);
			ArrayList<IViewControllerPlugin> list =  viewControllerPluginMap.get(strViewControllerClsType);
			if(list != null){
				for(IViewControllerPlugin iViewControllerPlugin:list){
					iViewController.registerViewControllerPlugin(iViewControllerPlugin);
				}
			}
		}
	}
	
	
	/**
	 * 注册视图控制器插件
	 * 
	 * @param strViewControllerClsType
	 * @param iViewController
	 */
	public static void registerViewControllerPlugin(String strViewControllerClsType, IViewControllerPlugin iViewControllerPlugin) throws Exception {
		if(getPlugin()!=null){
			getPlugin().registerViewControllerPlugin(strViewControllerClsType, iViewControllerPlugin);
			return ;
		}
		
		ArrayList<IViewControllerPlugin> list =  viewControllerPluginMap.get(strViewControllerClsType);
		if(list == null){
			list = new ArrayList<IViewControllerPlugin>();
			viewControllerPluginMap.put(strViewControllerClsType, list);
		}
		
		list.add(iViewControllerPlugin);
		IViewController iViewController = viewControllerMap.get(strViewControllerClsType);
		if(iViewController!=null){
			iViewController.registerViewControllerPlugin(iViewControllerPlugin);
		}
		
	}

	/**
	 * 获取视图控制器
	 * 
	 * @param strViewControllerClsType
	 * @return
	 * @throws Exception
	 */
	public static IViewController getViewController(Class cls) throws Exception {
		if(getPlugin()!=null){
			return getPlugin().getViewController(cls);
		}
		return getViewController(cls.getCanonicalName());
	}

	/**
	 * 获取视图控制器
	 * 
	 * @param strViewControllerClsType
	 * @return
	 * @throws Exception
	 */
	public static IViewController getViewController(String strViewControllerClsType) throws Exception {
		
		if(getPlugin()!=null){
			return getPlugin().getViewController(strViewControllerClsType);
		}
		
		IViewController iViewController = viewControllerMap.get(strViewControllerClsType);
		if (iViewController == null){
			throw new Exception(StringHelper.format("无法获取指定控制器[%1$s]", strViewControllerClsType));
		}
		return iViewController;
	}
	
	/**
	 * 设置插件
	 * @param iViewControllerGlobalPlugin
	 */
	public static void setPlugin(IViewControllerGlobalPlugin iViewControllerGlobalPlugin){
		ViewControllerGlobal.iViewControllerGlobalPlugin = iViewControllerGlobalPlugin;
	}
	
	public static IViewControllerGlobalPlugin getPlugin(){
		return ViewControllerGlobal.iViewControllerGlobalPlugin; 
	}
	
	
	

}
