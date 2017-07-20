package net.ibizsys.paas.core;

import net.ibizsys.paas.db.ISelectFilter;

/**
 * 数据查询代码条件代码
 * 
 * @author lionlau
 *
 */
public interface IDEDataQueryCodeCond extends IModelBase,ISelectFilter {
	/**
	 * 属性条件
	 */
	final static String CONDTYPE_DEFIELD = "DEFIELD";

	/**
	 * 自定义条件
	 */
	final static String CONDTYPE_CUSTOM = "CUSTOM";

	/**
	 * 组条件
	 */
	final static String CONDTYPE_GROUP = "GROUP";

	/**
	 * 预置条件
	 */
	final static String CONDTYPE_PREDEFINED = "PREDEFINED";

	/**
	 * 获取属性名称
	 * 
	 * @return
	 */
	String getDEFName();

	/**
	 * 获取条件类型
	 * 
	 * @return
	 */
	String getCondType();

	/**
	 * 获取条件操作
	 * 
	 * @return
	 */
	String getCondOp();

	/**
	 * 获取条件值
	 * 
	 * @return
	 */
	String getCondValue();

	/**
	 * 获取自定义条件
	 * 
	 * @return
	 */
	String getCustomCond();

	/**
	 * 获取预置条件
	 * 
	 * @return
	 */
	String getPredefindedCond();

	/**
	 * 获取子条件
	 * 
	 * @return
	 */
	java.util.Iterator<IDEDataQueryCodeCond> getChildDEDataQueryConds();

	/**
	 * 获取属性表达式
	 * 
	 * @return
	 */
	String getDEFieldExp();

	/**
	 * 是否为取反模式
	 * 
	 * @return
	 */
	boolean isNotMode();

	/**
	 * 获取标准数据类型
	 * 
	 * @return
	 */
	int getStdDataType();
}
