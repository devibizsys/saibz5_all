package net.ibizsys.paas.web.util.echarts;

import java.util.ArrayList;
import java.util.HashMap;

import net.ibizsys.paas.util.StringHelper;
import net.sf.json.JSONObject;

/**
 * Echart 序列
 * 
 * @author Administrator
 *
 */
public class EChartsSeries {
	private String strName = null;
	private String strType = null;
	private HashMap<String, EChartsPoint> echartsPointMap = new HashMap<String, EChartsPoint>();

	private ArrayList<String> catalogNameList = new ArrayList<String>();
	private HashMap<String, String> catalogMap = new HashMap<String, String>();

	/**
	 * 获取名称
	 * 
	 * @return the strName
	 */
	public String getName() {
		return strName;
	}

	/**
	 * 设置名称
	 * 
	 * @param strName the strName to set
	 */
	public void setName(String strName) {
		this.strName = strName;
	}

	/**
	 * 获取类型
	 * 
	 * @return the strType
	 */
	public String getType() {
		return strType;
	}

	/**
	 * 设置类型
	 * 
	 * @param strType the strType to set
	 */
	public void setType(String strType) {
		this.strType = strType;
	}

	/**
	 * 添加分类值
	 * 
	 * @param strName
	 * @throws Exception
	 */
	public void addCatalog(String strName) throws Exception {
		String strCatalog = catalogMap.get(strName);
		if (strCatalog != null) return;
		this.catalogNameList.add(strName);
		this.catalogMap.put(strName, strName);
	}

	/**
	 * 获取全部分类值
	 * 
	 * @return
	 */
	public ArrayList<String> getCatalogList() {
		return this.catalogNameList;
	}

	/**
	 * 增加数据点
	 * 
	 * @param strCatalog
	 * @param fValue
	 * @param fValue2
	 * @return
	 * @throws Exception
	 */
	public EChartsPoint addPoint(String strCatalog, Double fValue, Double fValue2) throws Exception {
		this.addCatalog(strCatalog);

		EChartsPoint echartsPoint = echartsPointMap.get(strCatalog);
		if (echartsPoint != null) {
			if (echartsPoint.getValue() != null) {
				if (fValue != null) {
					echartsPoint.setValue(echartsPoint.getValue() + fValue);
				}
			} else {
				echartsPoint.setValue(fValue);
			}

			if (echartsPoint.getValue2() != null) {
				if (fValue2 != null) {
					echartsPoint.setValue2(echartsPoint.getValue2() + fValue2);
				}
			} else {
				echartsPoint.setValue2(fValue2);
			}
		} else {
			echartsPoint = new EChartsPoint();
			echartsPoint.setCatalog(strCatalog);
			echartsPoint.setValue(fValue);
			echartsPoint.setValue2(fValue2);
			echartsPointMap.put(strCatalog, echartsPoint);
		}

		return echartsPoint;
	}

	/**
	 * 获取指定分类数据点
	 * 
	 * @param strCatalog
	 * @return
	 */
	public EChartsPoint getEChartsPoint(String strCatalog) {
		return echartsPointMap.get(strCatalog);
	}

	/**
	 * 获取图形序列结果对象（Json形式）
	 * 
	 * @return
	 * @throws Exception
	 */
	public JSONObject getSeriesJO(ArrayList<String> globalCatalogNameList) throws Exception {
		JSONObject series = new JSONObject();
		series.put("type", this.getType());
		if (!StringHelper.isNullOrEmpty(this.getName())) {
			series.put("name", this.getName());
		}
		onFillSeriesJO(series, globalCatalogNameList);
		return series;
	}

	/**
	 * 填充图形序列结果对象（Json形式）
	 * 
	 * @param jo
	 * @param globalCatalogNameList
	 * @throws Exception
	 */
	protected void onFillSeriesJO(JSONObject jo, ArrayList<String> globalCatalogNameList) throws Exception {

	}

}
