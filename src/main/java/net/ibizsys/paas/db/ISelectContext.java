package net.ibizsys.paas.db;

import net.ibizsys.paas.web.IWebContext;

/**
 * 数据选择上下文参数接口对象
 * 
 * @author Administrator
 *
 */
public interface ISelectContext extends ISelectCond {

	/**
	 * 获取实体数据查询名称
	 * @return
	 */
	String getDEDataQueryName(); 
	
	/**
	 * 获取查询字段集合
	 * 
	 * @return
	 */
	java.util.Iterator<ISelectField> getSelectFields();
	
	
	
	/**
	 * 获取网页上下文对象
	 * 
	 * @return
	 */
	IWebContext getWebContext();
}
