package net.ibizsys.paas.view;

import net.ibizsys.paas.core.IModelBase;

/**
 * 视图信息对象接口
 * 
 * @author Administrator
 *
 */
public interface IViewMessage extends IModelBase  {

	// 定义默认消息位置代码表

	/**
	 * 视图上方
	 */
	final static String MSGPOS_TOP = "TOP";

	/**
	 * 视图下方
	 */
	final static String MSGPOS_BOTTOM = "BOTTOM";

	/**
	 * 弹出
	 */
	final static String MSGPOS_POPUP = "POPUP";

	// 定义消息类型代码表

	/**
	 * 常规信息
	 */
	final static String MSGTYPE_INFO = "INFO";

	/**
	 * 警告信息
	 */
	final static String MSGTYPE_WARN = "WARN";

	/**
	 * 错误信息
	 */
	final static String MSGTYPE_ERROR = "ERROR";

	/**
	 * 获取显示位置
	 * 
	 * @return
	 */
	String getPosition();

	/**
	 * 获取消息
	 * 
	 * @return
	 */
	String getMessage();

	/**
	 * 获取消息类型
	 * 
	 * @return
	 */
	String getMessageType();

	/**
	 * 获取信息标题
	 * 
	 * @return
	 */
	String getTitle();
}
