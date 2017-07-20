package net.ibizsys.paas.core;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 实体查询代码条件实现对象
 * 
 * @author Administrator
 *
 */
public class DEDataQueryCodeCondImpl extends ModelBaseImpl implements IDEDataQueryCodeCond {
	// private IDEField iDEField = null;
	private String strDEFName = null;
	private String strCondType = null;
	private String strCondOp = null;
	private String strCondValue = null;
	private String strCustomCond = null;
	private String strPredefindedCond = null;
	private String strDEFieldExp = null;
	private boolean bNotMode = false;
	private int nStdDataType = DataTypes.UNKNOWN;

	private ArrayList<IDEDataQueryCodeCond> childDEDataQueryCondList = new ArrayList<IDEDataQueryCodeCond>();

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.core.IDEDataQueryCond#getDEField()
	 */
	@Override
	public String getDEFName() {
		return strDEFName;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.core.IDEDataQueryCond#getCondType()
	 */
	@Override
	public String getCondType() {
		return strCondType;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.core.IDEDataQueryCond#getCondOp()
	 */
	@Override
	public String getCondOp() {
		return strCondOp;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.core.IDEDataQueryCond#getCondValue()
	 */
	@Override
	public String getCondValue() {
		return strCondValue;
	}

	/**
	 * 设置属性名称
	 * 
	 * @param iDEField the iDEField to set
	 */
	public void setDEFName(String strDEFName) {
		this.strDEFName = strDEFName;
	}

	/**
	 * 设置条件类型
	 * 
	 * @param strCondType the strCondType to set
	 */
	public void setCondType(String strCondType) {
		this.strCondType = strCondType;
	}

	/**
	 * 设置条件操作
	 * 
	 * @param strCondOp the strCondOp to set
	 */
	public void setCondOp(String strCondOp) {
		this.strCondOp = strCondOp;

	}

	/**
	 * 设置条件值
	 * 
	 * @param strCondValue the strCondValue to set
	 */
	public void setCondValue(String strCondValue) {
		this.strCondValue = strCondValue;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.core.IDEDataQueryCond#getCustomCond()
	 */
	@Override
	public String getCustomCond() {
		return strCustomCond;
	}

	/**
	 * 设置自定义条件
	 * 
	 * @param strCustomCond the strCustomCond to set
	 */
	public void setCustomCond(String strCustomCond) {
		this.strCustomCond = strCustomCond;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.core.IDEDataQueryCond#getChildDEDataQueryConds()
	 */
	@Override
	public Iterator<IDEDataQueryCodeCond> getChildDEDataQueryConds() {
		if (this.childDEDataQueryCondList == null || this.childDEDataQueryCondList.size() == 0) return null;
		return this.childDEDataQueryCondList.iterator();
	}

	/**
	 * 添加子查询代码
	 * 
	 * @param iDEDataQueryCond
	 */
	public void addChildDEDataQueryCond(IDEDataQueryCodeCond iDEDataQueryCond) {
		this.childDEDataQueryCondList.add(iDEDataQueryCond);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.core.IDEDataQueryCond#getPredefindedCond()
	 */
	@Override
	public String getPredefindedCond() {
		return this.strPredefindedCond;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.core.IDEDataQueryCond#getDEFieldExp()
	 */
	@Override
	public String getDEFieldExp() {
		return this.strDEFieldExp;
	}

	/**
	 * 设置预定义代码
	 * 
	 * @param strPredefindedCond the strPredefindedCond to set
	 */
	public void setPredefindedCond(String strPredefindedCond) {
		this.strPredefindedCond = strPredefindedCond;
	}

	/**
	 * 设置属性查询表达式
	 * 
	 * @param strDEFieldExp the strDEFieldExp to set
	 */
	public void setDEFieldExp(String strDEFieldExp) {
		this.strDEFieldExp = strDEFieldExp;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.core.IDEDataQueryCond#isNotMode()
	 */
	@Override
	public boolean isNotMode() {
		return this.bNotMode;
	}

	/**
	 * 设置取反模式
	 * 
	 * @param bNotMode the bNotMode to set
	 */
	public void setNotMode(boolean bNotMode) {
		this.bNotMode = bNotMode;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.core.IDEDataQueryCond#getStdDataType()
	 */
	@Override
	public int getStdDataType() {
		return nStdDataType;
	}

	/**
	 * 设置标准数据类型
	 * 
	 * @param nStdDataType the nStdDataType to set
	 */
	public void setStdDataType(int nStdDataType) {
		this.nStdDataType = nStdDataType;
	}

}
