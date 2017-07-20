package net.ibizsys.paas.demodel;

import java.util.HashMap;

import net.ibizsys.paas.core.IDataEntity;
import net.ibizsys.paas.core.ModelBaseImpl;

/**
 * 实体主状态模型对象
 * 
 * @author Administrator
 *
 */
public class DEMainStateModel extends ModelBaseImpl implements IDEMainStateModel {
	private IDataEntity iDataEntity = null;
	private String strLogicName = "";
	private boolean bAllowMode = false;
	private boolean bDefault = false;
	private String strMSTag = "";
	private HashMap<String, String> deActionMap = new HashMap<String, String>();

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.core.IDEMainState#init(net.ibizsys.paas.core.IDataEntity)
	 */
	public void init(IDataEntity iDataEntity) throws Exception {
		this.iDataEntity = iDataEntity;
		this.onInit();
	}

	/**
	 * 设置标识
	 * 
	 * @param strId
	 */
	public void setId(String strId) {
		this.strId = strId;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.core.IDEMainState#getLogicName()
	 */
	@Override
	public String getLogicName() {
		return strLogicName;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.core.IDEMainState#isAllowMode()
	 */
	@Override
	public boolean isAllowMode() {
		return bAllowMode;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.core.IDEMainState#isDefault()
	 */
	@Override
	public boolean isDefault() {
		return bDefault;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.core.IDEMainState#getMSTag()
	 */
	@Override
	public String getMSTag() {
		return strMSTag;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.core.IDEMainState#testDEAction(java.lang.String)
	 */
	@Override
	public boolean testDEAction(String strDEActionName) throws Exception {
		if (this.deActionMap.containsKey(strDEActionName.toUpperCase())) {
			return bAllowMode;
		} else {
			return !bAllowMode;
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.core.IDataEntityObject#getDataEntity()
	 */
	@Override
	public IDataEntity getDataEntity() {
		return this.iDataEntity;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.demodel.IDEMainStateModel#registerDEAction(java.lang.String)
	 */
	@Override
	public void registerDEAction(String strDEAction) {
		this.deActionMap.put(strDEAction.toUpperCase(), "");
	}

	/**
	 * 设置实体模型对象
	 * 
	 * @param iDataEntity the iDataEntity to set
	 */
	public void setiDataEntity(IDataEntity iDataEntity) {
		this.iDataEntity = iDataEntity;
	}

	/**
	 * 设置逻辑名称
	 * 
	 * @param strLogicName the strLogicName to set
	 */
	public void setLogicName(String strLogicName) {
		this.strLogicName = strLogicName;
	}

	/**
	 * 设置是否允许模式
	 * 
	 * @param bAllowMode the bAllowMode to set
	 */
	public void setAllowMode(boolean bAllowMode) {
		this.bAllowMode = bAllowMode;
	}

	/**
	 * 设置是否默认状态
	 * 
	 * @param bDefault the bDefault to set
	 */
	public void setDefault(boolean bDefault) {
		this.bDefault = bDefault;
	}

	/**
	 * 设置主状态标记
	 * 
	 * @param strMSTag the strMSTag to set
	 */
	public void setMSTag(String strMSTag) {
		this.strMSTag = strMSTag;
	}

}
