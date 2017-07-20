package net.ibizsys.paas.db;

import net.ibizsys.paas.entity.EntityBase;

/**
 * 查询条件对象
 * 
 * @author lionlau
 *
 */
public class SelectCond extends EntityBase implements ISelectCond {

	private String strOrderInfo = null;
	private boolean bFetchFirst = false;
	private int nMaxRowCount = -1;
	private ISelectFilter iSelectFilter = null;

	/**
	 * 值为空
	 */
	public static final Object ISNULL = new Object();

	/**
	 * 值不为空
	 */
	public static final Object ISNOTNULL = new Object();

	/**
	 * 设置条件
	 * 
	 * @param strCond
	 * @param objValue
	 * @throws Exception
	 */
	public void setConditon(String strCond, Object objValue) throws Exception {
		this.set(strCond, objValue);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.db.ISelectCond#getOrderInfo()
	 */
	@Override
	public String getOrderInfo() {
		return strOrderInfo;
	}

	/**
	 * 设置排序信息
	 * 
	 * @param strOrderInfo
	 */
	public void setOrderInfo(String strOrderInfo) {
		this.strOrderInfo = strOrderInfo;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.db.ISelectCond#isFetchFirst()
	 */
	@Override
	public boolean isFetchFirst() {
		return bFetchFirst;
	}

	/**
	 * 设置获取第一行数据
	 * 
	 * @param bFetchFirst
	 */
	public void setFetchFirst(boolean bFetchFirst) {
		this.bFetchFirst = bFetchFirst;
		if (this.bFetchFirst) {
			this.nMaxRowCount = 1;
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.entity.EntityBase#onReset()
	 */
	@Override
	protected void onReset() {
		this.strOrderInfo = null;
		this.bFetchFirst = false;
		this.nMaxRowCount = -1;
		super.onReset();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.db.ISelectCond#getMaxRowCount()
	 */
	@Override
	public int getMaxRowCount() {
		return this.nMaxRowCount;
	}

	/**
	 * 设置最大行记录
	 * 
	 * @param nMaxRowCount
	 */
	public void setMaxRowCount(int nMaxRowCount) {
		this.nMaxRowCount = nMaxRowCount;
	}

	/* (non-Javadoc)
	 * @see net.ibizsys.paas.db.ISelectCond#getSelectFilter()
	 */
	@Override
	public ISelectFilter getSelectFilter() {
		return this.iSelectFilter;
	}

	/**
	 * 设置过滤条件
	 * @param iSelectFilter
	 */
	public void setSelectFilter(ISelectFilter iSelectFilter){
		this.iSelectFilter = iSelectFilter;
	}
	
}
