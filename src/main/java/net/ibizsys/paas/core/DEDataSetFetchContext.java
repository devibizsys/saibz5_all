package net.ibizsys.paas.core;

import java.util.ArrayList;
import java.util.HashMap;

import net.ibizsys.paas.data.ISimpleDataObject;
import net.ibizsys.paas.db.SqlParamList;
import net.ibizsys.paas.util.StringBuilderEx;
import net.ibizsys.paas.util.StringHelper;
import net.ibizsys.paas.web.IWebContext;
import net.ibizsys.paas.web.WebContext;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * 实体数据集合获取上下文参数
 * 
 * @author lionlau
 *
 */
public class DEDataSetFetchContext extends ActionContext implements IDEDataSetFetchContext {
	
	/**
	 * 当前线程的上下文参数对象
	 */
	private static ThreadLocal<IDEDataSetFetchContext> deDataSetFetchContext = new ThreadLocal<IDEDataSetFetchContext>();

	private static final Log log = LogFactory.getLog(DEDataSetFetchContext.class);

	private int nStartRow = 0;
	private int nPageSize = -1;
	private int nDefaultPageSize = 25;
	private String strSort = null;
	private String strSortDir = "";
	private String strSort2 = null;
	private String strSort2Dir = "";
	private ISimpleDataObject activeDataObject = null;
	private String strJoinScript = "";
	private int nGroupTopCount = -1;
	private boolean bFetchData = true;
	private boolean bFetchTotalRow = true;
	private boolean bCancel = false;
	private String strFetchInfo = "";
	private boolean bCacheDataSet = true;
	private String strDataObjectDEId = "";
	private String strDataObjectReferItem = "";
	private boolean bPaging = true;

	private HashMap<String, String> joinScriptMap = null;

	protected ArrayList<IDEDataSetCond> userConditionList = new ArrayList<IDEDataSetCond>();

	public DEDataSetFetchContext() {
		super(null);
	}

	public DEDataSetFetchContext(IWebContext iWebContext) {
		super(iWebContext);

		if (iWebContext != null) {
			this.setStartRow(WebContext.getFetchStart(iWebContext, this.nStartRow));
			this.setPageSize(WebContext.getFetchSize(iWebContext, this.nPageSize));
			String strSortParam = WebContext.getSortParam(iWebContext);
			if (!StringHelper.isNullOrEmpty(strSortParam)) {
				try {
					if ((strSortParam.charAt(0) == '{') || (strSortParam.charAt(0) == '[')) {
						JSONArray jo = JSONArray.fromString(strSortParam);
						if (jo.length() >= 1) {
							JSONObject item = jo.getJSONObject(0);
							this.strSort = item.optString("property", "");
							this.strSortDir = item.optString("direction", "ASC");
						}
						if (jo.length() >= 2) {
							JSONObject item = jo.getJSONObject(1);
							this.strSort2 = item.optString("property", "");
							this.strSort2Dir = item.optString("direction", "ASC");
						}
					} else {
						this.strSort = strSortParam;
						this.strSortDir = WebContext.getSortDir(iWebContext);
						if (StringHelper.isNullOrEmpty(this.strSortDir)) this.strSortDir = "asc";
					}
				} catch (Exception ex) {

				}
			}
		}
	}

	@Override
	public int getStartRow() {
		return nStartRow;
	}

	@Override
	public int getPageSize() {
		if (this.nPageSize <= 0) return this.getDefaultPageSize();
		return nPageSize;
	}

	@Override
	public String getSort() {
		return strSort;
	}

	@Override
	public String getSortDir() {
		return strSortDir;
	}

	@Override
	public String getSort2() {
		return strSort2;
	}

	@Override
	public String getSort2Dir() {
		return strSort2Dir;
	}

	/**
	 * 设置起始行记录
	 * 
	 * @param nStartRow the nStartRow to set
	 */
	public void setStartRow(int nStartRow) {
		this.nStartRow = nStartRow;
	}

	/**
	 * 设置分页大小
	 * 
	 * @param nPageSize the nPageSize to set
	 */
	public void setPageSize(int nPageSize) {
		this.nPageSize = nPageSize;
	}

	/**
	 * 设置排序字段
	 * 
	 * @param strSort the strSort to set
	 */
	public void setSort(String strSort) {
		this.strSort = strSort;
	}

	/**
	 * 设置排序字段方向
	 * 
	 * @param strSortDir the strSortDir to set
	 */
	public void setSortDir(String strSortDir) {
		this.strSortDir = strSortDir;
	}

	/**
	 * 设置排序字段2
	 * 
	 * @param strSort2 the strSort2 to set
	 */
	public void setSort2(String strSort2) {
		this.strSort2 = strSort2;
	}

	/**
	 * 设置排序字段方向2
	 * 
	 * @param strSort2Dir the strSort2Dir to set
	 */
	public void setSort2Dir(String strSort2Dir) {
		this.strSort2Dir = strSort2Dir;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.core.IDEDataSetFetchContext#getUserConditionList()
	 */
	@Override
	public ArrayList<IDEDataSetCond> getConditionList() {
		return userConditionList;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.core.IDEDataSetFetchContext#getDeclareScript()
	 */
	@Override
	public String getDeclareScript() {
		return "";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.core.IDEDataSetFetchContext#fillDeclareParams(net.ibizsys.paas.db.SqlParamList)
	 */
	@Override
	public void fillDeclareParams(SqlParamList list) throws Exception {

	}

	/**
	 * 获取当前数据对象
	 * 
	 * @return
	 */
	@Override
	public ISimpleDataObject getActiveDataObject() {
		return this.activeDataObject;
	}

	/**
	 * 设置当前数据对象
	 * 
	 * @param activeDataObject
	 */
	public void setActiveDataObject(ISimpleDataObject activeDataObject) {
		this.activeDataObject = activeDataObject;
	}

	/**
	 * 重置排序信息
	 */
	public void resetSortInfo() {
		this.setSort("");
		this.setSort2("");

		this.setSortDir("");
		this.setSort2Dir("");
		this.setJoinScript("");
	}

	/**
	 * 获取连接代码
	 * 
	 * @return the strJoinScript
	 */
	@Override
	public String getJoinScript() {
		if (this.joinScriptMap == null) {
			return strJoinScript;
		} else {
			String strTotal = "";
			if (!StringHelper.isNullOrEmpty(this.strJoinScript)) {
				strTotal += this.strJoinScript;
			}
			for (String strValue : this.joinScriptMap.values()) {
				strTotal += strValue;
			}
			return strTotal;
		}
	}

	/**
	 * 设置连接代码
	 * 
	 * @param strJoinScript the strJoinScript to set
	 */
	@Override
	public void setJoinScript(String strJoinScript) {
		this.strJoinScript = strJoinScript;
	}

	/**
	 * 获取分组处理的前面记录数
	 * 
	 * @return the nGroupTopCount
	 */
	@Override
	public int getGroupTopCount() {
		return nGroupTopCount;
	}

	/**
	 * 设置分组处理的前面记录数
	 * 
	 * @param nGroupTopCount the nGroupTopCount to set
	 */
	public void setGroupTopCount(int nGroupTopCount) {
		this.nGroupTopCount = nGroupTopCount;
	}

	/**
	 * 是否为获取数据处理
	 * 
	 * @return the bFetchData
	 */
	public boolean isFetchData() {
		return bFetchData;
	}

	/**
	 * 设置是否为获取数据处理
	 * 
	 * @param bFetchData the bFetchData to set
	 */
	public void setFetchData(boolean bFetchData) {
		this.bFetchData = bFetchData;
	}

	/**
	 * 是否为获取第一行记录
	 * 
	 * @return the bFetchTotalRow
	 */
	public boolean isFetchTotalRow() {
		return bFetchTotalRow;
	}

	/**
	 * 设置是否为获取第一行记录
	 * 
	 * @param bFetchTotalRow the bFetchTotalRow to set
	 */
	public void setFetchTotalRow(boolean bFetchTotalRow) {
		this.bFetchTotalRow = bFetchTotalRow;
	}

	/**
	 * 获取实体数据集合获取上下文参数
	 * 
	 * @return
	 */
	public static IDEDataSetFetchContext getCurrent() {
		return deDataSetFetchContext.get();
	}

	/**
	 * 设置实体数据集合获取上下文参数
	 * 
	 * @param value
	 */
	public static void setCurrent(IDEDataSetFetchContext value) {
		deDataSetFetchContext.set(value);
	}

	/**
	 * 是否取消
	 * 
	 * @return the bCancel
	 */
	public boolean isCancel() {
		return bCancel;
	}

	/**
	 * 设置是否取消
	 * 
	 * @param bCancel the bCancel to set
	 */
	public void setCancel(boolean bCancel) {
		this.bCancel = bCancel;
	}

	/**
	 * 启用组织数据范围条件
	 * 
	 * @param deDataSetFetchContextImpl
	 * @param orgIdDEField
	 * @param secIdDEField
	 * @param condList
	 * @throws Exception
	 */
	public static void enableOrgDRCond(IDEDataSetFetchContext deDataSetFetchContextImpl, IDEField orgIdDEField, IDEField secIdDEField, ArrayList<String> condList) throws Exception {
//		String strOrgIdAlias = "t1";
//		String strOrgSecIdAlias = "t1";
//		if (orgIdDEField != null && StringHelper.compare(orgIdDEField.getDataType(), IDEField.DATATYPE_INHERIT, true) == 0) {
//			strOrgIdAlias = "t11";
//		}
//		if (secIdDEField != null && StringHelper.compare(secIdDEField.getDataType(), IDEField.DATATYPE_INHERIT, true) == 0) {
//			strOrgSecIdAlias = "t11";
//		}

		if (condList.size() == 0) {
			// 有权限，但是没有任何约束
			DEDataSetCond deDataSetCondImpl = new DEDataSetCond();
			deDataSetCondImpl.setCondType(IDEDataSetCond.CONDTYPE_CUSTOM);
			deDataSetCondImpl.setCustomCond(StringHelper.format("1<>1"));
			deDataSetFetchContextImpl.getConditionList().add(deDataSetCondImpl);
		} else {
			StringBuilderEx sBuilderEx = new StringBuilderEx();
			for (int i = 0; i < condList.size(); i++) {
				if (i > 0) sBuilderEx.append(" OR ");
				sBuilderEx.append(condList.get(i));
			}

			boolean bJoinOrg = true;
			boolean bJoinOrgSector = true;
			String strCode = sBuilderEx.toString();

			/**
			 * by : hebao
			 * 
			 * 业务条线使用的是部门中的数据，优化后会导致无法获取到条线代码，后面考虑在具体实现处进行优化
			 */

			/*
			 * String strCode2 = strCode.toLowerCase(); if(strCode2.indexOf("o1.levelcode")==-1) { if(orgIdDEField!=null) { if(StringHelper.compare(orgIdDEField.getName(), "ORGID", true)==0) { bJoinOrg = false; strCode = strCode.replace("o1.",strOrgIdAlias+"."); } } } if(strCode2.indexOf("o2.levelcode")==-1) { if(secIdDEField!=null) { if(StringHelper.compare(secIdDEField.getName(), "ORGSECTORID", true)==0) { bJoinOrgSector = false; strCode = strCode.replace("o2.",strOrgSecIdAlias+"."); } } }
			 */

			sBuilderEx.reset();
			if (bJoinOrg && orgIdDEField != null) {
				sBuilderEx.append(" INNER JOIN T_SRFORG o1  ON  ${srfdefieldexp('%1$s')} = o1.ORGID ", orgIdDEField.getName());
			}
			if (bJoinOrgSector && secIdDEField != null) {
				sBuilderEx.append(" INNER JOIN T_SRFORGSECTOR o2  ON ${srfdefieldexp('%1$s')} = o2.ORGSECTORID ", secIdDEField.getName());
			}

			String strJoinCode = deDataSetFetchContextImpl.getJoinScript();
			if (!StringHelper.isNullOrEmpty(strJoinCode)) {
				if(strJoinCode.indexOf(sBuilderEx.toString())==-1) //判断代码中是否已经连接
					strJoinCode += sBuilderEx.toString();
			} else {
					strJoinCode = sBuilderEx.toString();
			}
			deDataSetFetchContextImpl.setJoinScript(strJoinCode);

			// 有权限，但是没有任何约束
			DEDataSetCond deDataSetCondImpl = new DEDataSetCond();
			deDataSetCondImpl.setCondType(IDEDataSetCond.CONDTYPE_CUSTOM);
			deDataSetCondImpl.setCustomCond(strCode);
			deDataSetFetchContextImpl.getConditionList().add(deDataSetCondImpl);

		}
	}

	/**
	 * 获取获取数据信息
	 * 
	 * @return the strFetchInfo
	 */
	public String getFetchInfo() {
		return strFetchInfo;
	}

	/**
	 * 设置获取数据信息
	 * 
	 * @param strFetchInfo the strFetchInfo to set
	 */
	public void setFetchInfo(String strFetchInfo) {
		this.strFetchInfo = strFetchInfo;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.core.IDEDataSetFetchContext#isCacheDataSet()
	 */
	@Override
	public boolean isCacheDataSet() {
		return bCacheDataSet;
	}

	/**
	 * 设置是否缓存结果集合
	 * 
	 * @param bCacheDataSet
	 */
	public void setCacheDataSet(boolean bCacheDataSet) {
		this.bCacheDataSet = bCacheDataSet;
	}

	/**
	 * 设置默认分页大小
	 * 
	 * @param nDefaultPageSize
	 */
	public void setDefaultPageSize(int nDefaultPageSize) {
		this.nDefaultPageSize = nDefaultPageSize;
	}

	/**
	 * 获取默认分页大小
	 * 
	 * @return
	 */
	public int getDefaultPageSize() {
		return this.nDefaultPageSize;
	}

	/**
	 * 设置连接的语句
	 * 
	 * @param strMode
	 * @param strJoinScript
	 */
	public void setJoinScript(String strMode, String strJoinScript) {
		if (StringHelper.isNullOrEmpty(strJoinScript)) {
			if (this.joinScriptMap == null) return;
			this.joinScriptMap.remove(strMode);
		} else {
			if (this.joinScriptMap == null) this.joinScriptMap = new HashMap<String, String>();
			this.joinScriptMap.put(strMode, strJoinScript);
		}
	}

	/* (non-Javadoc)
	 * @see net.ibizsys.paas.core.IDEDataSetFetchContext#isPaging()
	 */
	@Override
	public boolean isPaging() {
		return this.bPaging;
	}
	
	
	/**
	 * 设置是否进行分页查询
	 * @param bPaging
	 */
	public void setPaging(boolean bPaging){
		this.bPaging  = bPaging;
	}
}
