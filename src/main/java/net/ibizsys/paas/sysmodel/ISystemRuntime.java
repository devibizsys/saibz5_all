package net.ibizsys.paas.sysmodel;

import net.ibizsys.paas.db.IDBDialect;

import org.hibernate.SessionFactory;

/**
 * 系统运行模型接口
 * 
 * @author lionlau
 *
 */
public interface ISystemRuntime extends ISystemModel {
	
	/**
	 * 获取数据库适配器
	 * 
	 * @return
	 */
	IDBDialect getDBDialect();

	/**
	 * 获取会话工厂
	 * 
	 * @return
	 */
	SessionFactory getSessionFactory();

	/**
	 * 获取数据库适配器2
	 * 
	 * @return
	 */
	IDBDialect getDBDialect2();

	/**
	 * 获取会话工厂2
	 * 
	 * @return
	 */
	SessionFactory getSessionFactory2();

	/**
	 * 获取数据库适配器3
	 * 
	 * @return
	 */
	IDBDialect getDBDialect3();

	/**
	 * 获取会话工厂3
	 * 
	 * @return
	 */
	SessionFactory getSessionFactory3();

	/**
	 * 获取数据库适配器4
	 * 
	 * @return
	 */
	IDBDialect getDBDialect4();

	/**
	 * 获取会话工厂4
	 * 
	 * @return
	 */
	SessionFactory getSessionFactory4();

	/**
	 * 获取指定数据源
	 * 
	 * @param strDSLink
	 * @return
	 */
	IDBDialect getDBDialect(String strDSLink);

	/**
	 * 获取指定会话工厂
	 * 
	 * @return
	 */
	SessionFactory getSessionFactory(String strDSLink);

	/**
	 * 安装运行时数据
	 */
	void installRTDatas() throws Exception;

	/**
	 * 获取系统运用本地语言
	 * 
	 * @return
	 */
	String getLocalization();

	/**
	 * 建立对象
	 * 
	 * @param strObjectType
	 * @return
	 * @throws Exception
	 */
	Object createObject(String strObjectType) throws Exception;
}
