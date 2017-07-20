package net.ibizsys.psba.dao;

import net.ibizsys.paas.db.ISelectFieldFilter;

/**
 * 大数据数据查询过滤器接口
 * @author Administrator
 *
 */
public interface IBASelectFilter extends ISelectFieldFilter {
	
	/**
	 * 单列值过滤
	 */
	final static String BAFILTER_SINGLECOLUMNVALUE = "SINGLECOLUMNVALUE";
	
	
	/**
	 * 获取过滤器类型
	 * @return
	 */
	String getBAFilterType();
	
	
	
	/**
	 * 获取相应的列族
	 * @return
	 */
	String getColSet();
	
	
	
	/**
	 * 获取条件对象值
	 * @return
	 */
	Object getCondObjectValue() throws Exception;
	
	
}
