package net.ibizsys.paas.dao;

import java.util.ArrayList;
import java.util.HashMap;

import net.ibizsys.paas.db.IDBDialect;
import net.ibizsys.paas.util.StringHelper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.SessionFactory;

/**
 * DAO全局存储对象
 * 
 * @author lionlau
 *
 */
public class DAOGlobal {
	private static final Log log = LogFactory.getLog(DAOGlobal.class);
	private static HashMap<String, IDAO> daoMap = new HashMap<String, IDAO>();
	private static HashMap<SessionFactory, IDBDialect> dbDialectMap = new HashMap<SessionFactory, IDBDialect>();

	/**
	 * 注册全局DAO对象
	 * 
	 * @param strDAOClsType
	 * @param iDAO
	 */
	public static void registerDAO(String strDAOClsType, IDAO iDAO) {
		synchronized (daoMap) {
			if (!daoMap.containsKey(strDAOClsType)) {
				// log.info(StringHelper.format("注册DAO对象[%1$s][%2$s]",strDAOClsType,iDAO));
				daoMap.put(strDAOClsType, iDAO);
			}
		}

	}

	/**
	 * 获取全局DAO对象
	 * 
	 * @param cls
	 * @return
	 * @throws Exception
	 */
	public static IDAO getDAO(Class cls) throws Exception {
		return getDAO(cls.getCanonicalName());
	}

	/**
	 * 获取全局DAO对象
	 * 
	 * @param strDAOClsType
	 * @return
	 * @throws Exception
	 */
	public static IDAO getDAO(String strDAOClsType) throws Exception {
		synchronized (daoMap) {
			IDAO iDAO = daoMap.get(strDAOClsType);
			if (iDAO == null) throw new Exception(StringHelper.format("无法获取指定DAO[%1$s]", strDAOClsType));
			return iDAO;
		}
	}

	/**
	 * 注册DAO对象
	 * 
	 * @param strDAOClsType
	 * @param iDAO
	 */
	public static void registerDAO(String strDAOClsType, String strDSLink, IDAO iDAO) {
		if (StringHelper.isNullOrEmpty(strDSLink))
			registerDAO(strDAOClsType, iDAO);
		else {
			String strFullKeyId = StringHelper.format("%1$s|%2$s", strDAOClsType, strDSLink);
			registerDAO(strFullKeyId, iDAO);
		}
	}

	/**
	 * 获取DAO对象
	 * 
	 * @param strDAOClsType
	 * @return
	 * @throws Exception
	 */
	public static IDAO getDAO(Class cls, String strDSLink) throws Exception {
		if (StringHelper.isNullOrEmpty(strDSLink))
			return getDAO(cls.getCanonicalName());
		else {
			return getDAO(cls.getCanonicalName(), strDSLink);
		}
	}

	/**
	 * 获取DAO对象
	 * 
	 * @param strDAOClsType
	 * @return
	 * @throws Exception
	 */
	public static IDAO getDAO(String strDAOClsType, String strDSLink) throws Exception {
		if (StringHelper.isNullOrEmpty(strDSLink))
			return getDAO(strDAOClsType);
		else {
			String strFullKeyId = StringHelper.format("%1$s|%2$s", strDAOClsType, strDSLink);
			return getDAO(strFullKeyId);
		}
	}

	public static IDAO getDAO(Class cls, SessionFactory sessionFactory) throws Exception {
		return getDAO(cls.getCanonicalName(), sessionFactory);
	}

	/**
	 * 获取DAO对象
	 * 
	 * @param strDAOClsType
	 * @return
	 * @throws Exception
	 */
	public static IDAO getDAO(String strDAOClsType, SessionFactory sessionFactory) throws Exception {
		if (sessionFactory == null) {
			return getDAO(strDAOClsType);
		}

		String strFullKeyId = StringHelper.format("%1$s|%2$s", strDAOClsType, sessionFactory.toString());
		synchronized (daoMap) {
			IDAO iDAO = daoMap.get(strFullKeyId);
			if (iDAO != null) return iDAO;

			iDAO = daoMap.get(strDAOClsType);
			if (iDAO == null) throw new Exception(StringHelper.format("无法获取指定DAO[%1$s]", strDAOClsType));

			// 建立新对象
			IDAO newDAO = iDAO.getClass().newInstance();
			newDAO.setSessionFactory(sessionFactory);
			newDAO.setDBDialect(dbDialectMap.get(sessionFactory));

			daoMap.put(strFullKeyId, newDAO);
			return newDAO;
		}
	}

	/**
	 * 注册数据库适配
	 * 
	 * @param sessionFactory
	 * @param iDBDialect
	 */
	public static void registerDBDialect(SessionFactory sessionFactory, IDBDialect iDBDialect) {
		synchronized (daoMap) {
			dbDialectMap.put(sessionFactory, iDBDialect);
		}
	}

	/**
	 * 注销数据库适配
	 * 
	 * @param sessionFactory
	 * @param iDBDialect
	 */
	public static void unregisterDBDialect(SessionFactory sessionFactory) {
		synchronized (daoMap) {
			dbDialectMap.remove(sessionFactory);
			ArrayList<String> list = new ArrayList<String>();
			String strTag = "|" + sessionFactory.toString();
			int nLength = strTag.length();
			for (String strKey : daoMap.keySet()) {
				int nPos = strKey.lastIndexOf(strTag);
				if (nPos != -1 && nPos == (strKey.length() - nLength)) {
					list.add(strKey);
				}
			}
			for (String strKey : list) {
				daoMap.remove(strKey);
			}
		}
	}

}
