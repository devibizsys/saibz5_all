package net.ibizsys.paas.service;

import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;

import net.ibizsys.paas.util.StringHelper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.SessionFactory;

/**
 * 服务全局存储对象
 * 
 * @author lionlau
 *
 */
public class ServiceGlobal {
	private static final Log log = LogFactory.getLog(ServiceGlobal.class);
	private static HashMap<String, IService> serviceMap = new HashMap<String, IService>();

	/**
	 * 注册服务对象
	 * 
	 * @param strServiceClsType
	 * @param iService
	 */
	public static void registerService(String strServiceClsType, IService iService) {
		if (!serviceMap.containsKey(strServiceClsType)) {
			// log.info(StringHelper.format("注册服务对象[%1$s][%2$s]",strServiceClsType,iService));
			serviceMap.put(strServiceClsType, iService);
		}
	}

	/**
	 * 获取服务对象
	 * 
	 * @param strServiceClsType
	 * @return
	 * @throws Exception
	 */
	public static IService getService(Class cls) throws Exception {
		return getService(cls.getCanonicalName());
	}

	/**
	 * 获取服务对象
	 * 
	 * @param strServiceClsType
	 * @return
	 * @throws Exception
	 */
	public static IService getService(String strServiceClsType) throws Exception {
		IService iService = serviceMap.get(strServiceClsType);
		if (iService == null) throw new Exception(StringHelper.format("无法获取指定服务[%1$s]", strServiceClsType));
		return iService;
	}

	/**
	 * 注册服务对象
	 * 
	 * @param strServiceClsType
	 * @param strDSLink
	 * @param iService
	 */
	public static void registerService(String strServiceClsType, String strDSLink, IService iService) {
		if (StringHelper.isNullOrEmpty(strDSLink))
			registerService(strServiceClsType, iService);
		else {
			String strFullKeyId = StringHelper.format("%1$s|%2$s", strServiceClsType, strDSLink);
			registerService(strFullKeyId, iService);
		}
	}

	/**
	 * 获取服务对象
	 * 
	 * @param cls
	 * @param strDSLink
	 * @return
	 * @throws Exception
	 */
	public static IService getService(Class cls, String strDSLink) throws Exception {
		if (StringHelper.isNullOrEmpty(strDSLink))
			return getService(cls.getCanonicalName());
		else {
			return getService(cls.getCanonicalName(), strDSLink);
		}
	}

	/**
	 * 获取服务对象
	 * 
	 * @param strServiceClsType
	 * @param strDSLink
	 * @return
	 * @throws Exception
	 */
	public static IService getService(String strServiceClsType, String strDSLink) throws Exception {
		if (StringHelper.isNullOrEmpty(strDSLink))
			return getService(strServiceClsType);
		else {
			String strFullKeyId = StringHelper.format("%1$s|%2$s", strServiceClsType, strDSLink);
			return getService(strFullKeyId);
		}
	}

	/**
	 * 获取服务对象
	 * 
	 * @param cls
	 * @param sessionFactory
	 * @return
	 * @throws Exception
	 */
	public static IService getService(Class cls, SessionFactory sessionFactory) throws Exception {
		return getService(cls.getCanonicalName(), sessionFactory);
	}

	/**
	 * 获取服务对象
	 * 
	 * @param strServiceClsType
	 * @param sessionFactory
	 * @return
	 * @throws Exception
	 */
	public static IService getService(String strServiceClsType, SessionFactory sessionFactory) throws Exception {
		if (sessionFactory == null) {
			return getService(strServiceClsType);
		}

		String strFullKeyId = StringHelper.format("%1$s|%2$s", strServiceClsType, sessionFactory.toString());
		synchronized (serviceMap) {
			IService iService = serviceMap.get(strFullKeyId);
			if (iService != null) return iService;

			iService = serviceMap.get(strServiceClsType);
			if (iService == null) throw new Exception(StringHelper.format("无法获取指定服务[%1$s]", strServiceClsType));

			// 建立新对象
			IService newService = iService.getClass().newInstance();
			newService.setSessionFactory(sessionFactory);
			serviceMap.put(strFullKeyId, newService);
			return newService;
		}
	}
	
	
	/**
	 * 重置会话工厂的相关服务对象
	 * @param sessionFactory
	 * @return
	 * @throws Exception
	 */
	public static  void resetServices(SessionFactory sessionFactory) throws Exception {
		if (sessionFactory == null) {
			return;
		}

		String strPartKeyId = StringHelper.format("|%1$s", sessionFactory.toString());
		synchronized (serviceMap) {
			
			ArrayList<String> list = new ArrayList<String>();
			list.addAll(serviceMap.keySet());
			
			for(String strKey:list){
				if(strKey.indexOf(strPartKeyId)!=1){
					serviceMap.remove(strKey);
				}
			}
		}
	}

}
