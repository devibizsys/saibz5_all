package net.ibizsys.paas.codelist;

import net.ibizsys.paas.core.ISystemObject;
import net.ibizsys.paas.web.IWebContext;

/**
 * 代码表对象接口
 * 
 * @author lionlau
 *
 */
public interface ICodeList extends ISystemObject, ICodeItem {
	/**
	 * 静态
	 */
	static String CLTYPE_STATIC = "STATIC";

	/**
	 * 动态
	 */
	static String CLTYPE_DYNAMIC = "DYNAMIC";

	/**
	 * 或模式，字符
	 */
	final String ORMODE_STRING = "STR";

	/**
	 * 或模式，字符
	 */
	final String ORMODE_NUMBER = "NUM";

	/**
	 * 获取代码项文本
	 * 
	 * @param strValue 代码项值
	 * @param bRecursion 是否递归查找
	 * @return
	 */
	String getCodeListText(String strValue, boolean bRecursion) throws Exception;

	/**
	 * 获取代码项文本（动态代码表）
	 * 
	 * @param strValue 代码项值
	 * @param bRecursion 是否递归查找
	 * @param activeData 当前数据对象
	 * @param iWebContext 当前网络访问上下文对象
	 * @return
	 */
	String getCodeListText(String strValue, boolean bRecursion, Object activeData, IWebContext iWebContext) throws Exception;

	/**
	 * 获取代码表类型
	 * 
	 * @return
	 */
	String getCodeListType();

	/**
	 * 获取处理对象
	 * 
	 * @return
	 */
	String getHandler();

	/**
	 * 是否为用户范围
	 * 
	 * @return
	 */
	boolean isUserScope();

	/**
	 * 获取或模式
	 * 
	 * @return
	 */
	String getOrMode();

	/**
	 * 获取分割字符
	 * 
	 * @return
	 */
	String getValueSeparator();

	/**
	 * 获取分割字符
	 * 
	 * @return
	 */
	String getTextSeparator();

	/**
	 * 获取空白显示文本
	 * 
	 * @return
	 */
	String getEmptyText();

	/**
	 * 获取全局标识
	 * 
	 * @return
	 */
	String getGlobalId();

}
