package net.ibizsys.paas.db;

import java.util.ArrayList;
import java.util.Iterator;

import net.ibizsys.paas.web.IWebContext;
import net.ibizsys.paas.web.WebContext;

/**
 * 数据查询操作上下文对象
 * 
 * @author Administrator
 *
 */
public class SelectContext extends SelectCond implements ISelectContext {

	
	private ArrayList<ISelectField> selectFieldList = null;
	private String strDEDataQueryName = null;
	private IWebContext iWebContext = null;

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.db.ISelectContext#getSelectFields()
	 */
	@Override
	public Iterator<ISelectField> getSelectFields() {
		if (selectFieldList == null) return null;
		return selectFieldList.iterator();
	}

	/**
	 * 增加查询字段
	 * 
	 * @param iSelectField
	 */
	public void addSelectField(ISelectField iSelectField) {
		if (selectFieldList == null) {
			selectFieldList = new ArrayList<ISelectField>();
		}
		selectFieldList.add(iSelectField);
	}

	/* (non-Javadoc)
	 * @see net.ibizsys.paas.db.ISelectContext#getDEDataQueryName()
	 */
	@Override
	public String getDEDataQueryName() {
		return this.strDEDataQueryName;
	}
	
	/**
	 * 设置实体数据查询名称
	 * @param strDEDataQueryName
	 */
	public void setDEDataQueryName(String strDEDataQueryName){
		this.strDEDataQueryName = strDEDataQueryName;
	}

	/* (non-Javadoc)
	 * @see net.ibizsys.paas.db.ISelectContext#getWebContext()
	 */
	@Override
	public IWebContext getWebContext() {
		if(iWebContext == null)
			return WebContext.getCurrent();
		return null;
	}

	
	/**
	 * 设置网络访问上下文
	 * @param iWebContext
	 */
	public void setWebContext(IWebContext iWebContext){
		this.iWebContext = iWebContext;
	}
	
	

	
}
