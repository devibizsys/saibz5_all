package net.ibizsys.paas.demodel;

/**
 * 实体操作附加逻辑模型
 * 
 * @author Administrator
 *
 */
public class DEActionLogicModel implements IDEActionLogicModel {
	private String strDEName = "";
	private String strDEActionName = "";

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.demodel.IDEActionLogicModel#getDEName()
	 */
	@Override
	public String getDEName() {
		return strDEName;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.demodel.IDEActionLogicModel#getDEActionName()
	 */
	@Override
	public String getDEActionName() {
		return strDEActionName;
	}

	/**
	 * 设置实体模型名称
	 * 
	 * @param strDEName the strDEName to set
	 */
	public void setDEName(String strDEName) {
		this.strDEName = strDEName;
	}

	/**
	 * 设置实体行为名称
	 * 
	 * @param strDEActionName the strDEActionName to set
	 */
	public void setDEActionName(String strDEActionName) {
		this.strDEActionName = strDEActionName;
	}

}
