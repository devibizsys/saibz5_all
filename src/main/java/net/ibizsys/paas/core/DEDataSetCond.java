package net.ibizsys.paas.core;

/**
 * 实体数据集合查询条件
 * 
 * @author Administrator
 *
 */
public class DEDataSetCond extends DEDataQueryCodeCondImpl implements IDEDataSetCond {
	private String strDEDataQueryName = "";

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.core.IDEDataSetCond#getDEDataQueryName()
	 */
	@Override
	public String getDEDataQueryName() {
		return strDEDataQueryName;
	}

	/**
	 * 设置实体数据查询名称
	 * 
	 * @param strDEDataQueryName the strDEDataQueryName to set
	 */
	public void setDEDataQueryName(String strDEDataQueryName) {
		this.strDEDataQueryName = strDEDataQueryName;
	}

}
