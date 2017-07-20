package net.ibizsys.paas.control.menu;

/**
 * 应用菜单项接口
 * 
 * @author lionlau
 *
 */
public interface IAppMenuItem extends IMenuItem {
	/**
	 * 获取项集合
	 * 
	 * @return
	 */
	java.util.ArrayList<IAppMenuItem> getItems();

	/**
	 * 获取应用功能编号
	 * 
	 * @return
	 */
	String getAppFuncId();

	/**
	 * 是否为分隔项
	 * 
	 * @return
	 */
	boolean isSeperator();

	/**
	 * 是否隐藏边栏
	 * 
	 * @return
	 */
	boolean isHideSideBar();

	/**
	 * 默认打开
	 * 
	 * @return
	 */
	boolean isOpenDefault();

}
