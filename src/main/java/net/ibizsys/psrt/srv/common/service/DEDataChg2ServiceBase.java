/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package net.ibizsys.psrt.srv.common.service;


import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import net.ibizsys.paas.exception.ErrorException;
import net.ibizsys.paas.core.IDataEntity;
import net.ibizsys.paas.core.IDEDataSetFetchContext;
import net.ibizsys.paas.db.DBCallResult;
import net.ibizsys.paas.db.DBFetchResult;
import net.ibizsys.paas.db.IProcParam;
import net.ibizsys.paas.util.StringHelper;
import net.ibizsys.paas.util.StringBuilderEx;
import net.ibizsys.paas.core.Errors;
import net.ibizsys.paas.core.ActionContext;
import net.ibizsys.paas.data.DataObject;
import net.ibizsys.paas.service.ServiceGlobal;
import net.ibizsys.paas.entity.IEntity;
import net.ibizsys.paas.demodel.IDataEntityModel;
import net.ibizsys.paas.demodel.DEModelGlobal;
import net.ibizsys.paas.demodel.IDELogicModel;
import net.ibizsys.paas.dao.DAOGlobal;
import net.ibizsys.paas.web.WebContext;
import net.ibizsys.paas.service.IService;
import net.ibizsys.paas.util.DataTypeHelper;
import net.ibizsys.paas.util.KeyValueHelper;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import net.ibizsys.paas.db.SelectCond;
import net.ibizsys.paas.service.IServiceWork;
import net.ibizsys.paas.service.ITransaction;
import net.ibizsys.paas.dao.IDAO;
import net.ibizsys.paas.service.CloneSession;
import net.ibizsys.paas.service.ServiceBase;
import net.ibizsys.paas.entity.EntityFieldError;
import net.ibizsys.paas.entity.EntityError;
import java.sql.Timestamp;
import net.ibizsys.paas.util.DefaultValueHelper;
import javax.annotation.PostConstruct;
import net.ibizsys.paas.service.IDataContextParam;
import net.sf.json.JSONObject;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;



import net.ibizsys.psrt.srv.common.entity.DEDataChg2;
import net.ibizsys.psrt.srv.common.dao.DEDataChg2DAO;
import net.ibizsys.psrt.srv.common.demodel.DEDataChg2DEModel;


/**
 * 实体[DEDataChg2] 服务对象基类
 */
public abstract class DEDataChg2ServiceBase extends net.ibizsys.psrt.srv.PSRuntimeSysServiceBase<DEDataChg2> {
    private static final Log log = LogFactory.getLog(DEDataChg2ServiceBase.class);
    /**
     * 实体数据集合[DEFAULT]标识
     */
    public final static String DATASET_DEFAULT = "DEFAULT";


    public DEDataChg2ServiceBase () {
        super();

    }

    /**
     * 获取实体[DEDataChg2]服务对象
     * @param sessionFactory
     * @return
     * @throws Exception
     */
    public static DEDataChg2Service getInstance() throws Exception {
        return getInstance(null);
    }

    /**
     * 获取实体[DEDataChg2]服务对象
     * @param sessionFactory
     * @return
     * @throws Exception
     */
    public static DEDataChg2Service getInstance(SessionFactory sessionFactory) throws Exception {
        return (DEDataChg2Service)ServiceGlobal.getService(DEDataChg2Service.class, sessionFactory);
    }

    /**
     * Spring注册后执行构造处理
     * @throws Exception
     */
    @PostConstruct
    public void postConstruct() throws Exception {
        ServiceGlobal.registerService(getServiceId(), this);
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.service.ServiceBase#getServiceId()
     */
    @Override
    protected String getServiceId() {
        return "net.ibizsys.psrt.srv.common.service.DEDataChg2Service";
    }

    private DEDataChg2DEModel dEDataChg2DEModel;
    /**
     * 获取实体[DEDataChg2]模型对象
     */
    public  DEDataChg2DEModel getDEDataChg2DEModel() {
        if(this.dEDataChg2DEModel==null) {
            try {
                this.dEDataChg2DEModel = (DEDataChg2DEModel)DEModelGlobal.getDEModel("net.ibizsys.psrt.srv.common.demodel.DEDataChg2DEModel");
            } catch(Exception ex) {
            }
        }
        return this.dEDataChg2DEModel;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.service.ServiceBase#getDEModel()
     */
    @Override
    public  IDataEntityModel getDEModel() {
        return this.getDEDataChg2DEModel();
    }


    private DEDataChg2DAO dEDataChg2DAO;

    /**
     * 获取实体[DEDataChg2]数据操作对象
     */
    public  DEDataChg2DAO getDEDataChg2DAO() {
        if(this.dEDataChg2DAO==null) {
            try {
                this.dEDataChg2DAO= (DEDataChg2DAO)DAOGlobal.getDAO("net.ibizsys.psrt.srv.common.dao.DEDataChg2DAO",this.getSessionFactory());
            } catch(Exception ex) {
            }
        }
        return this.dEDataChg2DAO;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.service.IService#getDAO()
     */
    @Override
    public  IDAO getDAO() {
        return this.getDEDataChg2DAO();
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.service.ServiceBase#onfetchDataSet(java.lang.String, net.ibizsys.paas.core.IDEDataSetFetchContext)
     */
    @Override
    protected DBFetchResult onfetchDataSet(String strDataSetName,IDEDataSetFetchContext iDEDataSetFetchContext) throws Exception {
        if(StringHelper.compare(strDataSetName,DATASET_DEFAULT,true)==0) {
            return this.fetchDefault(iDEDataSetFetchContext);
        }
        return super.onfetchDataSet(strDataSetName,iDEDataSetFetchContext);
    }


    /* (non-Javadoc)
     * @see net.ibizsys.paas.service.ServiceBase#onExecuteAction(java.lang.String, net.ibizsys.paas.entity.IEntity)
     */
    @Override
    protected  void onExecuteAction(String strAction,IEntity entity) throws Exception {
        super.onExecuteAction(strAction,entity);
    }

    /**
     * 获取数据集合[DEFAULT]
     * @param iDEDataSetFetchContext
     * @return
     * @throws Exception
     */
    public DBFetchResult fetchDefault(IDEDataSetFetchContext iDEDataSetFetchContext) throws Exception {

        DBFetchResult dbFetchResult =  doServiceFetchWork(iDEDataSetFetchContext,DATASET_DEFAULT,false);
        // dbFetchResult.getDataSet().cacheDataRow();
        // session.close();
        return dbFetchResult;
    }







    /* (non-Javadoc)
     * @see net.ibizsys.paas.service.ServiceBase#onFillParentInfo(net.ibizsys.paas.entity.IEntity, java.lang.String, java.lang.String, java.lang.String)
     */
    @Override
    protected void onFillParentInfo(DEDataChg2 et,String strParentType,String strTypeParam,String strParentKey) throws Exception {
        //关系类型 : DER1N ,主实体 :DATAENTITY / 实体
        if (((StringHelper.compare(strParentType, WebContext.PARAM_PARENTTYPE_DER1N, true) == 0)
                ||(StringHelper.compare(strParentType, WebContext.PARAM_PARENTTYPE_SYSDER1N, true) == 0)
                ||(StringHelper.compare(strParentType, WebContext.PARAM_PARENTTYPE_DER11, true) == 0)
                ||(StringHelper.compare(strParentType, WebContext.PARAM_PARENTTYPE_SYSDER11, true) == 0))
                && (StringHelper.compare(strTypeParam, "DER1N_DEDATACHG2_DATAENTITY_DEID", true)==0)) {
            IService iService= ServiceGlobal.getService("net.ibizsys.psrt.srv.demodel.service.DataEntityService",this.getSessionFactory());
            net.ibizsys.psrt.srv.demodel.entity.DataEntity parentEntity = ( net.ibizsys.psrt.srv.demodel.entity.DataEntity)iService.getDEModel().createEntity();
            parentEntity.set(net.ibizsys.psrt.srv.demodel.entity.DataEntity.FIELD_DEID,DataTypeHelper.parse(25,strParentKey));
            if(strParentKey.indexOf(ServiceBase.TEMPKEY) == 0)
                iService.getTemp(parentEntity);
            else
                iService.get(parentEntity);
            this.onFillParentInfo_DE(et,parentEntity );
            return;
        }
        super.onFillParentInfo(et,strParentType,strTypeParam,strParentKey);
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.service.ServiceBase#onSyncDER1NData(java.lang.String, java.lang.String, java.lang.String)
     */
    @Override
    protected String onSyncDER1NData(String strDER1NId, String strParentKey, String strDatas) throws Exception {
        return super.onSyncDER1NData( strDER1NId,  strParentKey,  strDatas);
    }


    /**
    * 填充数据的父数据信息[实体]
    * @param et 当前数据对象
    * @param parentEntity 父数据对象
    * @throws Exception
    */
    protected void onFillParentInfo_DE(DEDataChg2 et,net.ibizsys.psrt.srv.demodel.entity.DataEntity parentEntity) throws Exception {
        et.setDEId(parentEntity.getDEId());
        et.setDEName(parentEntity.getDEName());
    }




    /* (non-Javadoc)
     * @see net.ibizsys.paas.service.ServiceBase#onFillEntityFullInfo(net.ibizsys.paas.entity.IEntity, boolean)
     */
    @Override
    protected void onFillEntityFullInfo(DEDataChg2 et, boolean bCreate) throws Exception {
        //填充新建默认值
        if(bCreate) {
        }
        super.onFillEntityFullInfo(et, bCreate);

        //填充物理化外键相关属性
        //关系类型 : DER1N ,主实体 :DATAENTITY / 实体
        onFillEntityFullInfo_DE(et, bCreate);
    }

    /**
    * 填充实体的数据信息 实体
    * @param et
    * @param bCreate 是否建立
    * @throws Exception
    */
    protected void onFillEntityFullInfo_DE(DEDataChg2 et, boolean bCreate) throws Exception {
        if(et.isDEIdDirty()) {
            if(et.getDEId()!=null) {
                if((true&&et.getDEId()==null)||(true&&et.getDEName()==null)) {
                    net.ibizsys.psrt.srv.demodel.entity.DataEntity parentEntity  = et.getDE();
                    et.setDEName(parentEntity.getDEName());
                }

            } else {
                et.setDEName(null);
            }
        }
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.service.ServiceBase#onWriteBackParent(net.ibizsys.paas.entity.IEntity, boolean)
     */
    @Override
    protected void onWriteBackParent(DEDataChg2 et, boolean bCreate) throws Exception {
        super.onWriteBackParent(et, bCreate);
    }




    /**
     * 通过关系[实体]父数据查询数据
     * @param parentEntity 父数据
     * @throws Exception
     */
    public java.util.ArrayList<DEDataChg2> selectByDE(net.ibizsys.psrt.srv.demodel.entity.DataEntityBase parentEntity) throws Exception {
        return selectByDE( parentEntity,"");
    }
    /**
     * 通过关系[实体]父数据查询数据
     * @param parentEntity 父数据
     * @param strOrderInfo 排序信息
     * @throws Exception
     */
    public java.util.ArrayList<DEDataChg2> selectByDE(net.ibizsys.psrt.srv.demodel.entity.DataEntityBase parentEntity,String strOrderInfo) throws Exception {
        SelectCond selectCond = new SelectCond();
        selectCond.setConditon(DEDataChg2.FIELD_DEID, parentEntity.getDEId());
        selectCond.setOrderInfo(strOrderInfo);
        onFillSelectByDECond(selectCond);
        return this.select(selectCond);
    }

    /**
     * 填充关系[实体]父数据查询附加条件
     * @param selectCond 查询条件对象
     * @throws Exception
     */
    protected void onFillSelectByDECond(SelectCond selectCond) throws Exception {

    }




    /**
     * 判断是否能够通过关系[实体]删除数据
     * @param parentEntity 父数据
     * @throws Exception
     */
    public void testRemoveByDE(net.ibizsys.psrt.srv.demodel.entity.DataEntity parentEntity) throws Exception {
    }


    /**
     * 通过关系[实体]重置数据
     * @param parentEntity 父数据
     * @throws Exception
     */
    public void resetDE(net.ibizsys.psrt.srv.demodel.entity.DataEntity parentEntity) throws Exception {
        java.util.ArrayList<DEDataChg2> list =  this.selectByDE(parentEntity);
        for(DEDataChg2 item:list) {
            DEDataChg2 item2 = (DEDataChg2)getDEModel().createEntity();
            item2.setDEDataChg2Id(item.getDEDataChg2Id());
            item2.setDEId(null);
            this.update(item2);
        }
    }


    /**
     * 通过关系[实体]删除数据
     * @param parentEntity 父数据
     * @throws Exception
     */
    public void removeByDE(net.ibizsys.psrt.srv.demodel.entity.DataEntity parentEntity) throws Exception {
        final net.ibizsys.psrt.srv.demodel.entity.DataEntity parentEntity2 = parentEntity;
        this.doServiceWork(new IServiceWork() {
            @Override
            public void execute(ITransaction iTransaction) throws Exception {
                onBeforeRemoveByDE(parentEntity2);
                internalRemoveByDE(parentEntity2);
                onAfterRemoveByDE(parentEntity2);
            }
        });
    }

    /**
     * 通过关系[实体]删除数据之前调用
     * @param parentEntity 父数据
     * @throws Exception
     */
    protected void onBeforeRemoveByDE(net.ibizsys.psrt.srv.demodel.entity.DataEntity parentEntity) throws Exception {

    }

    /**
    * 内部删除数据，通过关系[实体]
    * @param parentEntity 父数据
    * @throws Exception
    */
    protected void internalRemoveByDE(net.ibizsys.psrt.srv.demodel.entity.DataEntity parentEntity) throws Exception {
        java.util.ArrayList<DEDataChg2> removeList = selectByDE(parentEntity);
        onBeforeRemoveByDE(parentEntity,removeList );

        // 执行删除
        for (DEDataChg2 item : removeList ) {
            remove(item );
        }
        onAfterRemoveByDE(parentEntity,removeList );
    }

    /**
     * 通过关系[实体]删除数据之后调用
     * @param parentEntity 父数据
     * @throws Exception
     */
    protected void onAfterRemoveByDE(net.ibizsys.psrt.srv.demodel.entity.DataEntity parentEntity) throws Exception {

    }

    /**
     * 通过关系[实体]删除数据之前调用
     * @param parentEntity 父数据
     * @param removeList 要删除的数据清单
     * @throws Exception
     */
    protected void onBeforeRemoveByDE(net.ibizsys.psrt.srv.demodel.entity.DataEntity parentEntity,java.util.ArrayList<DEDataChg2> removeList) throws Exception {

    }

    /**
     * 通过关系[实体]删除数据之后调用
     * @param parentEntity 父数据
     * @param removeList 要删除的数据清单
     * @throws Exception
     */
    protected void onAfterRemoveByDE(net.ibizsys.psrt.srv.demodel.entity.DataEntity parentEntity,java.util.ArrayList<DEDataChg2> removeList) throws Exception {

    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.service.ServiceBase#onBeforeRemove(net.ibizsys.paas.entity.IEntity)
     */
    @Override
    protected void onBeforeRemove(DEDataChg2 et) throws Exception {
        super.onBeforeRemove(et);
    }





    /**
     * 替换父数据信息
     * @param et
     * @throws Exception
     */
    @Override
    protected void replaceParentInfo(DEDataChg2 et,CloneSession cloneSession) throws Exception {
        super.replaceParentInfo(et, cloneSession);
        //循环所有的从关系，判断有误替换
        if(et.getDEId()!=null) {
            IEntity entity = cloneSession.getEntity("DATAENTITY",et.getDEId());
            if(entity !=null) {
                onFillParentInfo_DE(et,(net.ibizsys.psrt.srv.demodel.entity.DataEntity) entity);
            }
        }
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.service.ServiceBase#onRemoveEntityUncopyValues(net.ibizsys.paas.entity.IEntity, boolean)
     */
    @Override
    protected void onRemoveEntityUncopyValues(DEDataChg2 et, boolean bTempMode) throws Exception {
        super.onRemoveEntityUncopyValues(et,  bTempMode);
    }


    /* (non-Javadoc)
     * @see net.ibizsys.paas.service.ServiceBase#onCheckEntity(boolean, net.ibizsys.paas.entity.IEntity, boolean, boolean, net.ibizsys.paas.entity.EntityError)
     */
    @Override
    protected void onCheckEntity(boolean bBaseMode,DEDataChg2  et, boolean bCreate, boolean bTempMode,EntityError entityError) throws Exception {
        EntityFieldError entityFieldError = null;
        //检查属性 数据
        entityFieldError = onCheckField_Data( bBaseMode,  et,  bCreate,  bTempMode);
        if(entityFieldError!=null) {
            entityError.register(entityFieldError);
        }
        //检查属性 数据主键
        entityFieldError = onCheckField_DataKey( bBaseMode,  et,  bCreate,  bTempMode);
        if(entityFieldError!=null) {
            entityError.register(entityFieldError);
        }
        //检查属性 实体数据变更2标识
        entityFieldError = onCheckField_DEDataChg2Id( bBaseMode,  et,  bCreate,  bTempMode);
        if(entityFieldError!=null) {
            entityError.register(entityFieldError);
        }
        //检查属性 实体数据变更2名称
        entityFieldError = onCheckField_DEDataChg2Name( bBaseMode,  et,  bCreate,  bTempMode);
        if(entityFieldError!=null) {
            entityError.register(entityFieldError);
        }
        //检查属性 数据实体
        entityFieldError = onCheckField_DEId( bBaseMode,  et,  bCreate,  bTempMode);
        if(entityFieldError!=null) {
            entityError.register(entityFieldError);
        }
        //检查属性 数据实体
        entityFieldError = onCheckField_DEName( bBaseMode,  et,  bCreate,  bTempMode);
        if(entityFieldError!=null) {
            entityError.register(entityFieldError);
        }
        //检查属性 分发错误
        entityFieldError = onCheckField_DISPError( bBaseMode,  et,  bCreate,  bTempMode);
        if(entityFieldError!=null) {
            entityError.register(entityFieldError);
        }
        //检查属性 处理错误
        entityFieldError = onCheckField_Error( bBaseMode,  et,  bCreate,  bTempMode);
        if(entityFieldError!=null) {
            entityError.register(entityFieldError);
        }
        //检查属性 事件类型
        entityFieldError = onCheckField_EventType( bBaseMode,  et,  bCreate,  bTempMode);
        if(entityFieldError!=null) {
            entityError.register(entityFieldError);
        }
        //检查属性 逻辑数据
        entityFieldError = onCheckField_LogicData( bBaseMode,  et,  bCreate,  bTempMode);
        if(entityFieldError!=null) {
            entityError.register(entityFieldError);
        }
        super.onCheckEntity(bBaseMode,et,  bCreate,bTempMode,entityError);
    }


    /**
     * 获取属性[Data]值错误
     * @param bBaseMode 是否为基本检查模式，基本检查模式执行值类型，长度及属性值规则检查，非基本模式进行重复值检查
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据
     * @param bTempMode 是否为临时数据模式
     * @throws Exception
     */
    protected EntityFieldError onCheckField_Data(boolean bBaseMode,DEDataChg2 et, boolean bCreate, boolean bTempMode) throws Exception {
        //判断是否有值
        if(!et.isDataDirty())
            return null;

        String value = et.getData();
        if(bBaseMode) {
            if(bCreate) {
            }

            String strRuleInfo  = null;
            //检查值规则[默认规则]
            strRuleInfo =onTestValueRule_Data_Default( et,  bCreate,  bTempMode);
            if(!StringHelper.isNullOrEmpty(strRuleInfo)) {
                EntityFieldError entityFieldError = new EntityFieldError();
                entityFieldError.setFieldName(DEDataChg2.FIELD_DATA);
                entityFieldError.setErrorType(EntityFieldError.ERROR_VALUERULE);
                entityFieldError.setErrorInfo(strRuleInfo);
                return entityFieldError;
            }
        } else {
        }
        return null;
    }


    /**
     * 获取属性[DataKey]值错误
     * @param bBaseMode 是否为基本检查模式，基本检查模式执行值类型，长度及属性值规则检查，非基本模式进行重复值检查
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据
     * @param bTempMode 是否为临时数据模式
     * @throws Exception
     */
    protected EntityFieldError onCheckField_DataKey(boolean bBaseMode,DEDataChg2 et, boolean bCreate, boolean bTempMode) throws Exception {
        //判断是否有值
        if(!et.isDataKeyDirty())
            return null;

        String value = et.getDataKey();
        if(bBaseMode) {
            if(bCreate) {
                if(StringHelper.isNullOrEmpty(value)) {
                    EntityFieldError entityFieldError = new EntityFieldError();
                    entityFieldError.setFieldName(DEDataChg2.FIELD_DATAKEY);
                    entityFieldError.setErrorType(EntityFieldError.ERROR_EMPTY);
                    return entityFieldError;
                }
            }

            String strRuleInfo  = null;
            //检查值规则[默认规则]
            strRuleInfo =onTestValueRule_DataKey_Default( et,  bCreate,  bTempMode);
            if(!StringHelper.isNullOrEmpty(strRuleInfo)) {
                EntityFieldError entityFieldError = new EntityFieldError();
                entityFieldError.setFieldName(DEDataChg2.FIELD_DATAKEY);
                entityFieldError.setErrorType(EntityFieldError.ERROR_VALUERULE);
                entityFieldError.setErrorInfo(strRuleInfo);
                return entityFieldError;
            }
        } else {
        }
        return null;
    }


    /**
     * 获取属性[DEDataChg2Id]值错误
     * @param bBaseMode 是否为基本检查模式，基本检查模式执行值类型，长度及属性值规则检查，非基本模式进行重复值检查
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据
     * @param bTempMode 是否为临时数据模式
     * @throws Exception
     */
    protected EntityFieldError onCheckField_DEDataChg2Id(boolean bBaseMode,DEDataChg2 et, boolean bCreate, boolean bTempMode) throws Exception {
        //判断是否有值
        if(!et.isDEDataChg2IdDirty())
            return null;

        String value = et.getDEDataChg2Id();
        if(bBaseMode) {
            if(bCreate) {
                if(StringHelper.isNullOrEmpty(value)) {
                    EntityFieldError entityFieldError = new EntityFieldError();
                    entityFieldError.setFieldName(DEDataChg2.FIELD_DEDATACHG2ID);
                    entityFieldError.setErrorType(EntityFieldError.ERROR_EMPTY);
                    return entityFieldError;
                }
            }

            String strRuleInfo  = null;
            //检查值规则[默认规则]
            strRuleInfo =onTestValueRule_DEDataChg2Id_Default( et,  bCreate,  bTempMode);
            if(!StringHelper.isNullOrEmpty(strRuleInfo)) {
                EntityFieldError entityFieldError = new EntityFieldError();
                entityFieldError.setFieldName(DEDataChg2.FIELD_DEDATACHG2ID);
                entityFieldError.setErrorType(EntityFieldError.ERROR_VALUERULE);
                entityFieldError.setErrorInfo(strRuleInfo);
                return entityFieldError;
            }
        } else {
        }
        return null;
    }


    /**
     * 获取属性[DEDataChg2Name]值错误
     * @param bBaseMode 是否为基本检查模式，基本检查模式执行值类型，长度及属性值规则检查，非基本模式进行重复值检查
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据
     * @param bTempMode 是否为临时数据模式
     * @throws Exception
     */
    protected EntityFieldError onCheckField_DEDataChg2Name(boolean bBaseMode,DEDataChg2 et, boolean bCreate, boolean bTempMode) throws Exception {
        //判断是否有值
        if(!et.isDEDataChg2NameDirty())
            return null;

        String value = et.getDEDataChg2Name();
        if(bBaseMode) {
            if(bCreate) {
                if(StringHelper.isNullOrEmpty(value)) {
                    EntityFieldError entityFieldError = new EntityFieldError();
                    entityFieldError.setFieldName(DEDataChg2.FIELD_DEDATACHG2NAME);
                    entityFieldError.setErrorType(EntityFieldError.ERROR_EMPTY);
                    return entityFieldError;
                }
            }

            String strRuleInfo  = null;
            //检查值规则[默认规则]
            strRuleInfo =onTestValueRule_DEDataChg2Name_Default( et,  bCreate,  bTempMode);
            if(!StringHelper.isNullOrEmpty(strRuleInfo)) {
                EntityFieldError entityFieldError = new EntityFieldError();
                entityFieldError.setFieldName(DEDataChg2.FIELD_DEDATACHG2NAME);
                entityFieldError.setErrorType(EntityFieldError.ERROR_VALUERULE);
                entityFieldError.setErrorInfo(strRuleInfo);
                return entityFieldError;
            }
        } else {
        }
        return null;
    }


    /**
     * 获取属性[DEId]值错误
     * @param bBaseMode 是否为基本检查模式，基本检查模式执行值类型，长度及属性值规则检查，非基本模式进行重复值检查
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据
     * @param bTempMode 是否为临时数据模式
     * @throws Exception
     */
    protected EntityFieldError onCheckField_DEId(boolean bBaseMode,DEDataChg2 et, boolean bCreate, boolean bTempMode) throws Exception {
        //判断是否有值
        if(!et.isDEIdDirty())
            return null;

        String value = et.getDEId();
        if(bBaseMode) {
            if(bCreate) {
            }

            String strRuleInfo  = null;
            //检查值规则[默认规则]
            strRuleInfo =onTestValueRule_DEId_Default( et,  bCreate,  bTempMode);
            if(!StringHelper.isNullOrEmpty(strRuleInfo)) {
                EntityFieldError entityFieldError = new EntityFieldError();
                entityFieldError.setFieldName(DEDataChg2.FIELD_DEID);
                entityFieldError.setErrorType(EntityFieldError.ERROR_VALUERULE);
                entityFieldError.setErrorInfo(strRuleInfo);
                return entityFieldError;
            }
        } else {
        }
        return null;
    }


    /**
     * 获取属性[DEName]值错误
     * @param bBaseMode 是否为基本检查模式，基本检查模式执行值类型，长度及属性值规则检查，非基本模式进行重复值检查
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据
     * @param bTempMode 是否为临时数据模式
     * @throws Exception
     */
    protected EntityFieldError onCheckField_DEName(boolean bBaseMode,DEDataChg2 et, boolean bCreate, boolean bTempMode) throws Exception {
        //判断是否有值
        if(!et.isDENameDirty())
            return null;

        String value = et.getDEName();
        if(bBaseMode) {
            if(bCreate) {
            }

            String strRuleInfo  = null;
            //检查值规则[默认规则]
            strRuleInfo =onTestValueRule_DEName_Default( et,  bCreate,  bTempMode);
            if(!StringHelper.isNullOrEmpty(strRuleInfo)) {
                EntityFieldError entityFieldError = new EntityFieldError();
                entityFieldError.setFieldName(DEDataChg2.FIELD_DENAME);
                entityFieldError.setErrorType(EntityFieldError.ERROR_VALUERULE);
                entityFieldError.setErrorInfo(strRuleInfo);
                return entityFieldError;
            }
        } else {
        }
        return null;
    }


    /**
     * 获取属性[DISPError]值错误
     * @param bBaseMode 是否为基本检查模式，基本检查模式执行值类型，长度及属性值规则检查，非基本模式进行重复值检查
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据
     * @param bTempMode 是否为临时数据模式
     * @throws Exception
     */
    protected EntityFieldError onCheckField_DISPError(boolean bBaseMode,DEDataChg2 et, boolean bCreate, boolean bTempMode) throws Exception {
        //判断是否有值
        if(!et.isDISPErrorDirty())
            return null;

        String value = et.getDISPError();
        if(bBaseMode) {
            if(bCreate) {
            }

            String strRuleInfo  = null;
            //检查值规则[默认规则]
            strRuleInfo =onTestValueRule_DISPError_Default( et,  bCreate,  bTempMode);
            if(!StringHelper.isNullOrEmpty(strRuleInfo)) {
                EntityFieldError entityFieldError = new EntityFieldError();
                entityFieldError.setFieldName(DEDataChg2.FIELD_DISPERROR);
                entityFieldError.setErrorType(EntityFieldError.ERROR_VALUERULE);
                entityFieldError.setErrorInfo(strRuleInfo);
                return entityFieldError;
            }
        } else {
        }
        return null;
    }


    /**
     * 获取属性[Error]值错误
     * @param bBaseMode 是否为基本检查模式，基本检查模式执行值类型，长度及属性值规则检查，非基本模式进行重复值检查
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据
     * @param bTempMode 是否为临时数据模式
     * @throws Exception
     */
    protected EntityFieldError onCheckField_Error(boolean bBaseMode,DEDataChg2 et, boolean bCreate, boolean bTempMode) throws Exception {
        //判断是否有值
        if(!et.isErrorDirty())
            return null;

        String value = et.getError();
        if(bBaseMode) {
            if(bCreate) {
            }

            String strRuleInfo  = null;
            //检查值规则[默认规则]
            strRuleInfo =onTestValueRule_Error_Default( et,  bCreate,  bTempMode);
            if(!StringHelper.isNullOrEmpty(strRuleInfo)) {
                EntityFieldError entityFieldError = new EntityFieldError();
                entityFieldError.setFieldName(DEDataChg2.FIELD_ERROR);
                entityFieldError.setErrorType(EntityFieldError.ERROR_VALUERULE);
                entityFieldError.setErrorInfo(strRuleInfo);
                return entityFieldError;
            }
        } else {
        }
        return null;
    }


    /**
     * 获取属性[EventType]值错误
     * @param bBaseMode 是否为基本检查模式，基本检查模式执行值类型，长度及属性值规则检查，非基本模式进行重复值检查
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据
     * @param bTempMode 是否为临时数据模式
     * @throws Exception
     */
    protected EntityFieldError onCheckField_EventType(boolean bBaseMode,DEDataChg2 et, boolean bCreate, boolean bTempMode) throws Exception {
        //判断是否有值
        if(!et.isEventTypeDirty())
            return null;

        Integer value = et.getEventType();
        if(bBaseMode) {
            if(bCreate) {
                if(value==null) {
                    EntityFieldError entityFieldError = new EntityFieldError();
                    entityFieldError.setFieldName(DEDataChg2.FIELD_EVENTTYPE);
                    entityFieldError.setErrorType(EntityFieldError.ERROR_EMPTY);
                    return entityFieldError;
                }
            }

            String strRuleInfo  = null;
            //检查值规则[默认规则]
            strRuleInfo =onTestValueRule_EventType_Default( et,  bCreate,  bTempMode);
            if(!StringHelper.isNullOrEmpty(strRuleInfo)) {
                EntityFieldError entityFieldError = new EntityFieldError();
                entityFieldError.setFieldName(DEDataChg2.FIELD_EVENTTYPE);
                entityFieldError.setErrorType(EntityFieldError.ERROR_VALUERULE);
                entityFieldError.setErrorInfo(strRuleInfo);
                return entityFieldError;
            }
        } else {
        }
        return null;
    }


    /**
     * 获取属性[LogicData]值错误
     * @param bBaseMode 是否为基本检查模式，基本检查模式执行值类型，长度及属性值规则检查，非基本模式进行重复值检查
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据
     * @param bTempMode 是否为临时数据模式
     * @throws Exception
     */
    protected EntityFieldError onCheckField_LogicData(boolean bBaseMode,DEDataChg2 et, boolean bCreate, boolean bTempMode) throws Exception {
        //判断是否有值
        if(!et.isLogicDataDirty())
            return null;

        String value = et.getLogicData();
        if(bBaseMode) {
            if(bCreate) {
            }

            String strRuleInfo  = null;
            //检查值规则[默认规则]
            strRuleInfo =onTestValueRule_LogicData_Default( et,  bCreate,  bTempMode);
            if(!StringHelper.isNullOrEmpty(strRuleInfo)) {
                EntityFieldError entityFieldError = new EntityFieldError();
                entityFieldError.setFieldName(DEDataChg2.FIELD_LOGICDATA);
                entityFieldError.setErrorType(EntityFieldError.ERROR_VALUERULE);
                entityFieldError.setErrorInfo(strRuleInfo);
                return entityFieldError;
            }
        } else {
        }
        return null;
    }




    /* (non-Javadoc)
     * @see net.ibizsys.paas.service.ServiceBase#onSyncEntity(net.ibizsys.paas.entity.IEntity, boolean)
     */
    @Override
    protected void onSyncEntity(DEDataChg2 et, boolean bRemove) throws Exception {
        super.onSyncEntity( et,  bRemove);
    }


    /* (non-Javadoc)
     * @see net.ibizsys.paas.service.ServiceBase#onSyncIndexEntities(net.ibizsys.paas.entity.IEntity, boolean)
     */
    @Override
    protected void onSyncIndexEntities(DEDataChg2 et,boolean bRemove) throws Exception {
        super.onSyncIndexEntities(et,bRemove);
    }


    /* (non-Javadoc)
     * @see net.ibizsys.paas.service.ServiceBase#getDataContextValue(net.ibizsys.paas.entity.IEntity, java.lang.String, net.ibizsys.paas.service.IDataContextParam)
     */
    @Override
    public Object getDataContextValue(DEDataChg2 et,String strField,IDataContextParam iDataContextParam)throws Exception {
        Object objValue = null;
        if(iDataContextParam!=null) {
        }

        objValue = super.getDataContextValue(et,strField,iDataContextParam);
        if(objValue!=null)
            return objValue;

        return null;
    }



    /* (non-Javadoc)
     * @see net.ibizsys.paas.service.ServiceBase#onTestValueRule(java.lang.String, java.lang.String, net.ibizsys.paas.entity.IEntity, boolean, boolean)
     */
    @Override
    protected String onTestValueRule(String strDEFieldName,String strRule,IEntity et,boolean bCreate,boolean bTempMode) throws Exception {
        if((StringHelper.compare(strDEFieldName,DEDataChg2.FIELD_EVENTTYPE,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_EventType_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,DEDataChg2.FIELD_DEDATACHG2ID,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_DEDataChg2Id_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,DEDataChg2.FIELD_DEDATACHG2NAME,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_DEDataChg2Name_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,DEDataChg2.FIELD_CREATEMAN,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_CreateMan_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,DEDataChg2.FIELD_CREATEDATE,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_CreateDate_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,DEDataChg2.FIELD_UPDATEMAN,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_UpdateMan_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,DEDataChg2.FIELD_UPDATEDATE,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_UpdateDate_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,DEDataChg2.FIELD_LOGICDATA,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_LogicData_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,DEDataChg2.FIELD_DATA,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_Data_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,DEDataChg2.FIELD_DATAKEY,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_DataKey_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,DEDataChg2.FIELD_ERROR,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_Error_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,DEDataChg2.FIELD_DISPERROR,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_DISPError_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,DEDataChg2.FIELD_DENAME,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_DEName_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,DEDataChg2.FIELD_DEID,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_DEId_Default(et,bCreate,bTempMode);

        return super.onTestValueRule( strDEFieldName, strRule, et,bCreate, bTempMode);
    }

    /**
     * 判断值规则[事件类型][默认规则]
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据模式
     * @param bTempMode 是否为临时数据模式
     * @return
     * @throws Exception
     */
    protected String onTestValueRule_EventType_Default(IEntity et,boolean bCreate,boolean bTempMode) throws Exception {
        return null;
    }

    /**
     * 判断值规则[实体数据变更2标识][默认规则]
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据模式
     * @param bTempMode 是否为临时数据模式
     * @return
     * @throws Exception
     */
    protected String onTestValueRule_DEDataChg2Id_Default(IEntity et,boolean bCreate,boolean bTempMode) throws Exception {
        try {
            if((checkFieldStringLengthRule("DEDATACHG2ID", et, bTempMode,null,false,100,true,"内容长度必须小于等于[100]")))
                return null;
            return "内容长度必须小于等于[100]";
        } catch(Exception ex) {
            return ex.getMessage();
        }
    }

    /**
     * 判断值规则[实体数据变更2名称][默认规则]
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据模式
     * @param bTempMode 是否为临时数据模式
     * @return
     * @throws Exception
     */
    protected String onTestValueRule_DEDataChg2Name_Default(IEntity et,boolean bCreate,boolean bTempMode) throws Exception {
        try {
            if((checkFieldStringLengthRule("DEDATACHG2NAME", et, bTempMode,null,false,200,true,"内容长度必须小于等于[200]")))
                return null;
            return "内容长度必须小于等于[200]";
        } catch(Exception ex) {
            return ex.getMessage();
        }
    }

    /**
     * 判断值规则[建立人][默认规则]
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据模式
     * @param bTempMode 是否为临时数据模式
     * @return
     * @throws Exception
     */
    protected String onTestValueRule_CreateMan_Default(IEntity et,boolean bCreate,boolean bTempMode) throws Exception {
        try {
            if((checkFieldStringLengthRule("CREATEMAN", et, bTempMode,null,false,60,true,"内容长度必须小于等于[60]")))
                return null;
            return "内容长度必须小于等于[60]";
        } catch(Exception ex) {
            return ex.getMessage();
        }
    }

    /**
     * 判断值规则[建立时间][默认规则]
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据模式
     * @param bTempMode 是否为临时数据模式
     * @return
     * @throws Exception
     */
    protected String onTestValueRule_CreateDate_Default(IEntity et,boolean bCreate,boolean bTempMode) throws Exception {
        return null;
    }

    /**
     * 判断值规则[更新人][默认规则]
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据模式
     * @param bTempMode 是否为临时数据模式
     * @return
     * @throws Exception
     */
    protected String onTestValueRule_UpdateMan_Default(IEntity et,boolean bCreate,boolean bTempMode) throws Exception {
        try {
            if((checkFieldStringLengthRule("UPDATEMAN", et, bTempMode,null,false,60,true,"内容长度必须小于等于[60]")))
                return null;
            return "内容长度必须小于等于[60]";
        } catch(Exception ex) {
            return ex.getMessage();
        }
    }

    /**
     * 判断值规则[更新时间][默认规则]
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据模式
     * @param bTempMode 是否为临时数据模式
     * @return
     * @throws Exception
     */
    protected String onTestValueRule_UpdateDate_Default(IEntity et,boolean bCreate,boolean bTempMode) throws Exception {
        return null;
    }

    /**
     * 判断值规则[逻辑数据][默认规则]
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据模式
     * @param bTempMode 是否为临时数据模式
     * @return
     * @throws Exception
     */
    protected String onTestValueRule_LogicData_Default(IEntity et,boolean bCreate,boolean bTempMode) throws Exception {
        try {
            if((checkFieldStringLengthRule("LOGICDATA", et, bTempMode,null,false,1048576,true,"内容长度必须小于等于[1048576]")))
                return null;
            return "内容长度必须小于等于[1048576]";
        } catch(Exception ex) {
            return ex.getMessage();
        }
    }

    /**
     * 判断值规则[数据][默认规则]
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据模式
     * @param bTempMode 是否为临时数据模式
     * @return
     * @throws Exception
     */
    protected String onTestValueRule_Data_Default(IEntity et,boolean bCreate,boolean bTempMode) throws Exception {
        try {
            if((checkFieldStringLengthRule("DATA", et, bTempMode,null,false,1048576,true,"内容长度必须小于等于[1048576]")))
                return null;
            return "内容长度必须小于等于[1048576]";
        } catch(Exception ex) {
            return ex.getMessage();
        }
    }

    /**
     * 判断值规则[数据主键][默认规则]
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据模式
     * @param bTempMode 是否为临时数据模式
     * @return
     * @throws Exception
     */
    protected String onTestValueRule_DataKey_Default(IEntity et,boolean bCreate,boolean bTempMode) throws Exception {
        try {
            if((checkFieldStringLengthRule("DATAKEY", et, bTempMode,null,false,100,true,"内容长度必须小于等于[100]")))
                return null;
            return "内容长度必须小于等于[100]";
        } catch(Exception ex) {
            return ex.getMessage();
        }
    }

    /**
     * 判断值规则[处理错误][默认规则]
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据模式
     * @param bTempMode 是否为临时数据模式
     * @return
     * @throws Exception
     */
    protected String onTestValueRule_Error_Default(IEntity et,boolean bCreate,boolean bTempMode) throws Exception {
        try {
            if((checkFieldStringLengthRule("ERROR", et, bTempMode,null,false,2000,true,"内容长度必须小于等于[2000]")))
                return null;
            return "内容长度必须小于等于[2000]";
        } catch(Exception ex) {
            return ex.getMessage();
        }
    }

    /**
     * 判断值规则[分发错误][默认规则]
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据模式
     * @param bTempMode 是否为临时数据模式
     * @return
     * @throws Exception
     */
    protected String onTestValueRule_DISPError_Default(IEntity et,boolean bCreate,boolean bTempMode) throws Exception {
        try {
            if((checkFieldStringLengthRule("DISPERROR", et, bTempMode,null,false,1048576,true,"内容长度必须小于等于[1048576]")))
                return null;
            return "内容长度必须小于等于[1048576]";
        } catch(Exception ex) {
            return ex.getMessage();
        }
    }

    /**
     * 判断值规则[数据实体][默认规则]
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据模式
     * @param bTempMode 是否为临时数据模式
     * @return
     * @throws Exception
     */
    protected String onTestValueRule_DEName_Default(IEntity et,boolean bCreate,boolean bTempMode) throws Exception {
        try {
            if((checkFieldStringLengthRule("DENAME", et, bTempMode,null,false,200,true,"内容长度必须小于等于[200]")))
                return null;
            return "内容长度必须小于等于[200]";
        } catch(Exception ex) {
            return ex.getMessage();
        }
    }

    /**
     * 判断值规则[数据实体][默认规则]
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据模式
     * @param bTempMode 是否为临时数据模式
     * @return
     * @throws Exception
     */
    protected String onTestValueRule_DEId_Default(IEntity et,boolean bCreate,boolean bTempMode) throws Exception {
        try {
            if((checkFieldStringLengthRule("DEID", et, bTempMode,null,false,200,true,"内容长度必须小于等于[200]")))
                return null;
            return "内容长度必须小于等于[200]";
        } catch(Exception ex) {
            return ex.getMessage();
        }
    }



    /* (non-Javadoc)
     * @see net.ibizsys.paas.service.ServiceBase#onMergeChild(java.lang.String, java.lang.String, net.ibizsys.paas.entity.IEntity)
     */
    @Override
    protected boolean onMergeChild(String strChildType, String strTypeParam, DEDataChg2 et) throws Exception {
        boolean bRet = false;
        if(super.onMergeChild( strChildType, strTypeParam,  et))
            bRet = true;
        return bRet;
    }



    /**
     * 更新父数据
     * @param et
     * @throws Exception
     */
    @Override
    protected void onUpdateParent(DEDataChg2 et)throws Exception {
        super.onUpdateParent(et);
    }


}