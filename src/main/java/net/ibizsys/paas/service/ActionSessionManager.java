package net.ibizsys.paas.service;

/**
 * 服务操作会话管理类
 * 
 * @author lionlau
 *
 */
public class ActionSessionManager {
	static ThreadLocal<ActionSession> actionSession = new ThreadLocal<ActionSession>();

	/**
	 * 打开会话
	 * 
	 * @return
	 */
	static public ActionSession openSession() {
		return openSession("DEFAULT");
	}

	/**
	 * 打开新会话
	 * 
	 * @return
	 */
	static public ActionSession openSession(String strName) {
		ActionSession curentSession = actionSession.get();
		if (curentSession == null) {
			curentSession = new ActionSession();
			curentSession.setName(strName);
			actionSession.set(curentSession);
		}
		return curentSession;
	}

	/**
	 * 关闭当前会话
	 * 
	 * @return
	 */
	static public void closeSession() {
		actionSession.set(null);
	}

	/**
	 * 获取当前会话
	 * 
	 * @return
	 */
	static public ActionSession getCurrentSession() {
		return actionSession.get();
	}

	/**
	 * 获取当前会话
	 * 
	 * @param bCreate 不存在时建立
	 * @return
	 */
	static public ActionSession getCurrentSession(boolean bCreate) {
		ActionSession actionSession2 = actionSession.get();
		if (actionSession2 == null && bCreate) {
			return openSession();
		}
		return actionSession2;
	}

	/**
	 * 附加当前操作信息
	 * 
	 * @param strInfo
	 */
	public static void appendActionInfo(String strInfo) {
		if (getCurrentSession() == null) return;
		getCurrentSession().appendActionInfo(strInfo);
	}

	/**
	 * 获取当前操作信息
	 * 
	 * @param strInfo
	 */
	public static String getActionInfo() {
		if (getCurrentSession() == null) return null;
		return getCurrentSession().getActionInfo();
	}
}
