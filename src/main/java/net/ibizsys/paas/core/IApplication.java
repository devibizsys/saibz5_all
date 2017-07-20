package net.ibizsys.paas.core;

/**
 * 应用程序接口
 * 
 * @author lionlau
 *
 */
public interface IApplication extends ISystemObject {
	/**
	 * ExtJS5 技术
	 */
	public final static String PF_EXTJS5 = "EXTJS5";

	/**
	 * JQuery技术
	 */
	public final static String PF_JQUERY = "JQUERY";

	/**
	 * JQuery技术(R2)
	 */
	public final static String PF_JQUERY_R2 = "JQUERY_R2";

	/**
	 * AngularJS技术
	 */
	public final static String PF_ANGULARJS = "ANGULARJS";

	/**
	 * 获取系统
	 * 
	 * @return
	 */
	ISystem getSystem();

	/**
	 * 获取应用技术
	 * 
	 * @return
	 */
	String getPFType();

}
