package net.ibizsys.paas.service;

import net.ibizsys.paas.util.StringHelper;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 * 会话工厂管理对象
 * 
 * @author lionlau
 *
 */
public class SessionFactoryManager {

	static ThreadLocal<SessionFactorySession> sessionFactorySession = new ThreadLocal<SessionFactorySession>();

	/**
	 * 提交并开始事物
	 * 
	 * @param bCommit
	 * @return
	 */
	public static int releaseAndAddRef(boolean bCommit) {
		releaseRef(bCommit);
		return addRef();
	}

	/**
	 * 增加引用
	 * 
	 * @return
	 */
	public static int addRef() {
		SessionFactorySession curentSession = sessionFactorySession.get();
		if (curentSession == null) {
			curentSession = new SessionFactorySession();
			sessionFactorySession.set(curentSession);
		}
		return curentSession.addRef();
	}

	/**
	 * 释放
	 * 
	 * @param bCommit 提交还是回滚
	 * @return
	 */
	public static int releaseRef(boolean bCommit) {
		SessionFactorySession curentSession = sessionFactorySession.get();
		if (curentSession == null) {
			return 0;
		}

		int nValue = curentSession.releaseRef(bCommit);
		if (nValue == 0) {
			sessionFactorySession.set(null);
		}
		return nValue;
	}

	/**
	 * 获取当前的会话
	 * 
	 * @param sessionFactory
	 * @return
	 * @throws Exception
	 */
	public static Session getCurrentSession(SessionFactory sessionFactory) throws Exception {
		SessionFactorySession curentSession = sessionFactorySession.get();
		if (curentSession == null) {
			throw new Exception(StringHelper.format("无效当前会话"));
		}

		return curentSession.getCurrentSession(sessionFactory);
	}

	/**
	 * 获取当前的会话
	 * 
	 * @param sessionFactory
	 * @return
	 * @throws Exception
	 */
	public static SessionFactorySession getCurrentSFS(SessionFactory sessionFactory) throws Exception {
		SessionFactorySession curentSession = sessionFactorySession.get();
		if (curentSession == null) {
			throw new Exception(StringHelper.format("无效当前会话"));
		}
		return curentSession;
	}

	/**
	 * 提交当前的会话
	 * 
	 * @param sessionFactory
	 * @return
	 * @throws Exception
	 */
	public static void commit() throws Exception {
		commit(null);
	}

	/**
	 * 提交当前的会话
	 * 
	 * @param sessionFactory
	 * @return
	 * @throws Exception
	 */
	public static void commit(SessionFactory sessionFactory) throws Exception {
		SessionFactorySession curentSession = sessionFactorySession.get();
		if (curentSession == null) {
			throw new Exception(StringHelper.format("无效当前会话"));
		}
		curentSession.commit(sessionFactory);
	}

	/**
	 * 打开事务
	 * 
	 * @param sessionFactory
	 * @return
	 * @throws Exception
	 */
	public static Transaction getCurrentTransaction(SessionFactory sessionFactory) throws Exception {
		SessionFactorySession curentSession = sessionFactorySession.get();
		if (curentSession == null) {
			throw new Exception(StringHelper.format("无效当前会话"));
		}

		return curentSession.getCurrentTransaction(sessionFactory);
	}
}
