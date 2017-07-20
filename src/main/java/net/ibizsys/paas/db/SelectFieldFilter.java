package net.ibizsys.paas.db;


/**
 * 查询字段过滤条件
 * @author Administrator
 *
 */
public class SelectFieldFilter extends SelectFilterBase implements ISelectFieldFilter  {

	@Override
	public String getCondType() {
		return CONDTYPE_DEFIELD;
	}

	
	/**
	 * 设置属性名称
	 * @param strDEFName
	 */
	void setDEFName(String strDEFName){
		this.strDEFName = strDEFName;
	}
	
	/**
	 * 设置条件值
	 * @param strCondValue
	 */
	public void setCondValue(String strCondValue){
		this.strCondValue = strCondValue;
	}
	

}
