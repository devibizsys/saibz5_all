package net.ibizsys.paas.entity;

import java.util.HashMap;

import org.hibernate.SessionFactory;

import net.ibizsys.paas.data.DataObject;
import net.ibizsys.paas.data.IDataObject;
import net.ibizsys.paas.service.ServiceBase;
import net.ibizsys.paas.util.StringHelper;

/**
 * 基础数据对象
 * 
 * @author lionlau
 *
 */
public abstract class EntityBase extends DataObject implements IEntity,IEntityActionSupporter {
	/**
	 * 原来的键值
	 */
	public final static String ORIGINKEY = "srforikey";

	/**
	 * 调用结果
	 */
	public final static String CALLRESULT = "srfret";

	/**
	 * Boolean 值，True
	 */
	public final static int BOOLEAN_TRUE = 1;

	/**
	 * Boolean 值，False
	 */
	public final static int BOOLEAN_FALSE = 0;

	private SessionFactory sessionFactory = null;

	private boolean bMarkFullInfo = false;

	private HashMap<String, Object> entityPropertyMap = null;

	private IEntity proxyEntity = null;
	
	private IEntityActionHelper iEntityActionHelper = null;

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.data.DataObject#onReset()
	 */
	protected void onReset() {

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.entity.IEntity#fillMap(java.util.HashMap, boolean)
	 */
	@Override
	public void fillMap(HashMap<String, Object> params, boolean bDirtyOnly) {
		this.fillMap(params);
		onFillMap(params, bDirtyOnly);
	}

	/**
	 * 填充Map
	 * 
	 * @param params
	 * @param bDirtyOnly
	 */
	protected void onFillMap(HashMap<String, Object> params, boolean bDirtyOnly) {

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.entity.IEntity#markFullEntity(boolean)
	 */
	@Override
	public void markFullEntity(boolean bMarkFullInfo) {
		this.bMarkFullInfo = bMarkFullInfo;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.entity.IEntity#isFullEntity()
	 */
	@Override
	public boolean isFullEntity() {
		return this.bMarkFullInfo;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.data.DataObject#copyTo(net.ibizsys.paas.data.IDataObject, boolean, boolean)
	 */
	@Override
	public void copyTo(IDataObject dataEntity, boolean bReset, boolean bIncludeEmpty) throws Exception {
		super.copyTo(dataEntity, bReset, bIncludeEmpty);
		onCopyTo(dataEntity, bIncludeEmpty);

	}

	/**
	 * 拷贝数据对目标对象
	 * 
	 * @param dataEntity
	 * @param bIncludeEmtpy
	 * @throws Exception
	 */
	protected void onCopyTo(IDataObject dataEntity, boolean bIncludeEmtpy) throws Exception {
		if (dataEntity instanceof IEntity) {
			((IEntity) dataEntity).setSessionFactory(this.getSessionFactory());
		}
		if (dataEntity instanceof IEntityActionSupporter) {
			((IEntityActionSupporter) dataEntity).setActionHelper(this.getActionHelper(false));
		}

	}

	/**
	 * 是否有草稿标志
	 * 
	 * @param iEntity
	 * @return
	 * @throws Exception
	 */
	public static boolean hasDraftFlag(IEntity iEntity) throws Exception {
		Object objValue = iEntity.get(ServiceBase.DRAFTFLAG);
		if (objValue == null) return false;
		return true;
	}

	/**
	 * 是否为草稿
	 * 
	 * @param iEntity
	 * @return
	 * @throws Exception
	 */
	public static boolean isDraft(IEntity iEntity) throws Exception {
		Object objValue = iEntity.get(ServiceBase.DRAFTFLAG);
		if (objValue == null) return false;
		if (StringHelper.compare(objValue.toString(), "1", true) == 0) return true;
		return false;
	}

	/**
	 * 设置草稿状态
	 * 
	 * @param iEntity
	 * @param bDraftFlag
	 * @throws Exception
	 */
	public static void setDraft(IEntity iEntity, boolean bDraftFlag) throws Exception {
		iEntity.set(ServiceBase.DRAFTFLAG, bDraftFlag ? 1 : 0);

	}

	/**
	 * 获取原来的数据主键
	 * 
	 * @param iEntity
	 * @return
	 * @throws Exception
	 */
	public static Object getOriginKey(IEntity iEntity) throws Exception {
		return iEntity.get(ORIGINKEY);
	}

	/**
	 * 设置会话工厂
	 * 
	 * @param sessionFactory
	 */
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	/**
	 * 设置会话工厂
	 * 
	 * @param sessionFactory
	 */
	public SessionFactory getSessionFactory() {
		return this.sessionFactory;
	}

	/**
	 * 代理数据对象
	 * 
	 * @param proxyDataObject
	 */
	@Override
	protected void onProxy(IDataObject proxyDataObject) {
		if (proxyDataObject == null) {
			this.proxyEntity = null;
		} else {
			if (proxyDataObject instanceof IEntity) {
				this.proxyEntity = (IEntity) proxyDataObject;
			}
		}
		super.onProxy(proxyDataObject);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.entity.IEntity#setEntityProperty(java.lang.String, java.lang.Object)
	 */
	@Override
	public synchronized void setEntityProperty(String strName, Object objValue) {
		if (this.proxyEntity != null) {
			this.proxyEntity.setEntityProperty(strName, objValue);
		} else {
			if (objValue == null) {
				if (this.entityPropertyMap != null) {
					this.entityPropertyMap.remove(strName);
				}
			} else {
				if (this.entityPropertyMap == null) {
					this.entityPropertyMap = new HashMap<String, Object>();
				}
				this.entityPropertyMap.put(strName, objValue);
			}
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.entity.IEntity#getEntityProperty(java.lang.String)
	 */
	@Override
	public synchronized Object getEntityProperty(String strName) {
		if (this.proxyEntity != null) {
			return this.proxyEntity.getEntityProperty(strName);
		} else {
			if (this.entityPropertyMap != null) {
				return this.entityPropertyMap.get(strName);
			}
			return null;
		}
	}

	
	
	@Override
	public void setActionHelper(IEntityActionHelper iEntityActionHelper) {
		this.iEntityActionHelper  = iEntityActionHelper;
	}
	
	/**
	 * 获取操作辅助对象
	 * @param bMust 是否必须存在
	 * @return
	 */
	protected IEntityActionHelper getActionHelper(boolean bMust)throws Exception{
		if(this.iEntityActionHelper == null && bMust){
			throw new Exception("没有指定操作辅助对象");
		}
		return this.iEntityActionHelper;
	}

	@Override
	public void create() throws Exception {
		getActionHelper(true).create(this);
	}

	@Override
	public void update() throws Exception {
		getActionHelper(true).update(this);
	}

	@Override
	public void remove() throws Exception {
		getActionHelper(true).remove(this);
	}

	@Override
	public void save() throws Exception {
		getActionHelper(true).save(this);
	}

	@Override
	public boolean get(boolean bTryMode) throws Exception {
		return getActionHelper(true).get(this,bTryMode);
	}

	@Override
	public void get() throws Exception {
		 getActionHelper(true).get(this,false);
	}

	@Override
	public boolean select(boolean bTryMode) throws Exception {
		return getActionHelper(true).select(this,bTryMode);
	}

	@Override
	public void select() throws Exception {
		getActionHelper(true).select(this,false);
	}

	
	
	
}
