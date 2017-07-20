package net.ibizsys.paas.service;

import java.util.HashMap;

import net.ibizsys.paas.entity.IEntity;
import net.ibizsys.paas.entity.SimpleEntity;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 * 会话工厂会话
 * 
 * @author lionlau
 *
 */
public class SessionFactorySession {
	private static final Log log = LogFactory.getLog(SessionFactorySession.class);
	private int nRef = 0;
	private HashMap<SessionFactory, Session> sessionMap = new HashMap<SessionFactory, Session>();
	private HashMap<IEntity, IEntity> lastEntityMap = new HashMap<IEntity, IEntity>();
	private static SimpleEntity EMTPYENTITY = new SimpleEntity();

	public SessionFactorySession() {

	}

	/**
	 * 获取最后的数据
	 * 
	 * @param curEntity
	 * @return
	 */
	public IEntity getLastEntity(IEntity curEntity) {
		IEntity iEntity = lastEntityMap.get(curEntity);
		if (iEntity != null && iEntity != EMTPYENTITY) return iEntity;
		return null;
	}

	/**
	 * 设置最后的数据
	 * 
	 * @param curEntity
	 * @param lastEntity
	 */
	public void setLastEntity(IEntity curEntity, IEntity lastEntity) {
		if (lastEntity == null) {
			lastEntityMap.put(curEntity, EMTPYENTITY);
		} else
			lastEntityMap.put(curEntity, lastEntity);
	}

	/**
	 * 增加会话引用
	 * 
	 * @return
	 */
	public synchronized int addRef() {
		nRef++;
		return nRef;
	}

	/**
	 * 提交当前会话
	 */
	public synchronized void commit() {
		commit(null);
	}

	/**
	 * 提交当前会话
	 */
	public synchronized void commit(SessionFactory sessionFactory) {
		if (sessionFactory == null) {
			for (Session session : sessionMap.values()) {
				if (session.getTransaction() != null && session.getTransaction().isActive()) {
					session.getTransaction().commit();
				}
			}
		} else {
			Session session = sessionMap.get(sessionFactory);
			if (session != null) {
				if (session.getTransaction() != null && session.getTransaction().isActive()) {
					session.getTransaction().commit();
				}
			}
		}

	}

	/**
	 * 释放引用
	 * 
	 * @param bCommit 是否提交
	 * @return
	 * @throws Exception
	 */
	public synchronized int releaseRef(boolean bCommit) {
		nRef--;
		if (nRef == 0) {
			for (Session session : sessionMap.values()) {
				try {
					if (session.getTransaction() != null && session.getTransaction().isActive()) {
						if (bCommit) {
							session.getTransaction().commit();
						} else {
							session.getTransaction().rollback();
						}
					}
					session.clear();
					session.close();
				} catch (Exception ex) {
					log.error(ex.getMessage(), ex);
				}
			}
			sessionMap.clear();
		}
		return nRef;
	}

	/**
	 * 获取当前会话
	 * 
	 * @param sessionFactory
	 * @return
	 * @throws Exception
	 */
	public synchronized Session getCurrentSession(SessionFactory sessionFactory) throws Exception {
		if (sessionMap.containsKey(sessionFactory)) {
			return sessionMap.get(sessionFactory);
		}

		Session session = sessionFactory.openSession();

		sessionMap.put(sessionFactory, session);
		return session;
	}

	/**
	 * 获取当前会话工厂事务
	 * 
	 * @param sessionFactory
	 * @return
	 * @throws Exception
	 */
	public synchronized Transaction getCurrentTransaction(SessionFactory sessionFactory) throws Exception {
		Session session = getCurrentSession(sessionFactory);

		if (session.getTransaction() == null || !session.getTransaction().isActive()) {
			org.hibernate.Transaction curTransaction = session.beginTransaction();
		}
		return session.getTransaction();
	}

}
