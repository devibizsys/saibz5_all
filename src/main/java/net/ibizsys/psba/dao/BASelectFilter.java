package net.ibizsys.psba.dao;

import net.ibizsys.paas.db.SelectFieldFilter;
import net.ibizsys.paas.entity.EntityBase;
import net.ibizsys.paas.util.DataTypeHelper;

/**
 * 大数据查询列过滤器对象实现
 * @author Administrator
 *
 */
public class BASelectFilter extends SelectFieldFilter implements IBASelectFilter {

	private String strColSet = null;
	private String strBAFilterType= null;
	private static Object UnsetCondValue = new Object();
	private Object objCondValue = UnsetCondValue;
	
	@Override
	public String getColSet() {
		return this.strColSet;
	}

	/**
	 * 设置列族
	 * @param strColSet
	 */
	public void setColSet(String strColSet){
		this.strColSet = strColSet;
	}

	@Override
	public String getBAFilterType() {
		return this.strBAFilterType;
	}

	/**
	 * 设置大数据过滤器类型
	 * @param strBAFilterType
	 */
	public void setBAFilterType(String strBAFilterType) {
		this.strBAFilterType = strBAFilterType;
	}

	/* (non-Javadoc)
	 * @see net.ibizsys.psba.dao.IBASelectFilter#getCondObjectValue()
	 */
	@Override
	public Object getCondObjectValue() throws Exception {
		if(objCondValue == UnsetCondValue){
			return DataTypeHelper.parse(this.getStdDataType(), this.getCondValue());
		}
		else {
			return objCondValue;
		}
	}
	
	
	/**
	 * 设置条件值（对象形式）
	 * @param objCondValue
	 */
	public void setCondObjectValue(Object objCondValue){
		this.objCondValue = objCondValue;
	}
	
	/**
	 * 重置条件值（对象形式）
	 * @param objCondValue
	 */
	public void resetCondObjectValue(){
		this.objCondValue = UnsetCondValue;
	}
	
	
}
