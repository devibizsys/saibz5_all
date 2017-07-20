package net.ibizsys.paas.ctrlmodel;

import net.ibizsys.paas.control.chart.IChart;
import net.ibizsys.paas.core.ModelBaseImpl;

/**
 * 图表序列模型基类
 * 
 * @author Administrator
 *
 */
public class ChartSeriesModel extends ModelBaseImpl implements IChartSeriesModel {
	private String strCaption = null;
	private String strSeriesType = null;
	private String strTimeGroupMode = null;

	/**
	 * 获取X值属性
	 * 
	 * @return
	 */
	private String strCatalogField = null;

	/**
	 * 获取Y值属性
	 * 
	 * @return
	 */
	private String strValueField = null;

	/**
	 * 获取Z值属性
	 * 
	 * @return
	 */
	private String strValue2Field = null;

	/**
	 * 获取Z值属性
	 * 
	 * @return
	 */
	private String strSeriesField = null;

	private IChart iChart = null;

	/**
	 * 初始化
	 * 
	 * @param iChart
	 */
	public void init(IChart iChart) {
		this.iChart = iChart;
	}

	/**
	 * 设置标识
	 * 
	 * @param strId
	 */
	public void setId(String strId) {
		this.strId = strId;
	}

	/**
	 * 设置名称
	 * 
	 * @param strName
	 */
	public void setName(String strName) {
		this.strName = strName;
	}

	/**
	 * 获取标题
	 * 
	 * @return the strCaption
	 */
	@Override
	public String getCaption() {
		return strCaption;
	}

	/**
	 * 设置标题
	 * 
	 * @param strCaption the strCaption to set
	 */
	public void setCaption(String strCaption) {
		this.strCaption = strCaption;
	}

	/**
	 * 获取图表序列类型
	 * 
	 * @return the strSeriesType
	 */
	@Override
	public String getSeriesType() {
		return strSeriesType;
	}

	/**
	 * 设置图表序列类型
	 * 
	 * @param strSeriesType the strSeriesType to set
	 */
	public void setSeriesType(String strSeriesType) {
		this.strSeriesType = strSeriesType;
	}

	/**
	 * 获取分类属性
	 * 
	 * @return the strCatalogField
	 */
	@Override
	public String getCatalogField() {
		return strCatalogField;
	}

	/**
	 * 设置分类属性
	 * 
	 * @param strCatalogField the strCatalogField to set
	 */
	public void setCatalogField(String strCatalogField) {
		this.strCatalogField = strCatalogField;
	}

	/**
	 * 获取值属性
	 * 
	 * @return the strValueField
	 */
	@Override
	public String getValueField() {
		return strValueField;
	}

	/**
	 * 设置值属性
	 * 
	 * @param strValueField the strValueField to set
	 */
	public void setValueField(String strValueField) {
		this.strValueField = strValueField;
	}

	/**
	 * 获取值2属性
	 * 
	 * @return the strValue2Field
	 */
	@Override
	public String getValue2Field() {
		return strValue2Field;
	}

	/**
	 * 设置值2属性
	 * 
	 * @param strValue2Field the strValue2Field to set
	 */
	public void setValue2Field(String strValue2Field) {
		this.strValue2Field = strValue2Field;
	}

	/**
	 * 获取多序列识别属性
	 * 
	 * @return the strSeriesField
	 */
	@Override
	public String getSeriesField() {
		return strSeriesField;
	}

	/**
	 * 设置多序列识别属性
	 * 
	 * @param strSeriesField the strSeriesField to set
	 */
	public void setSeriesField(String strSeriesField) {
		this.strSeriesField = strSeriesField;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.ctrlmodel.IChartSeriesModel#getTimeGroupMode()
	 */
	@Override
	public String getTimeGroupMode() {
		return this.strTimeGroupMode;
	}

	/**
	 * 设置时间分组模式
	 * 
	 * @param strTimeGroupMode
	 */
	public void setTimeGroupMode(String strTimeGroupMode) {
		this.strTimeGroupMode = strTimeGroupMode;
	}

}
