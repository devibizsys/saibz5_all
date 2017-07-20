package net.ibizsys.paas.web.util.echarts;

/**
 * ECharts 数据点
 * 
 * @author Administrator
 *
 */
public class EChartsPoint {
	String strCatalog = null;

	Double fValue = null;

	Double fValue2 = null;

	/**
	 * 获取分类值
	 * 
	 * @return the strCatalog
	 */
	public String getCatalog() {
		return strCatalog;
	}

	/**
	 * 设置分类值
	 * 
	 * @param strCatalog the strCatalog to set
	 */
	public void setCatalog(String strCatalog) {
		this.strCatalog = strCatalog;
	}

	/**
	 * 获取值
	 * 
	 * @return the fValue
	 */
	public Double getValue() {
		return fValue;
	}

	/**
	 * 设置值
	 * 
	 * @param fValue the fValue to set
	 */
	public void setValue(Double fValue) {
		this.fValue = fValue;
	}

	/**
	 * 获取值2
	 * 
	 * @return the fValue2
	 */
	public Double getValue2() {
		return fValue2;
	}

	/**
	 * 设置值2
	 * 
	 * @param fValue2 the fValue2 to set
	 */
	public void setValue2(Double fValue2) {
		this.fValue2 = fValue2;
	}

}
