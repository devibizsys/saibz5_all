/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package net.ibizsys.psrt.srv.wf.dao;

import net.ibizsys.paas.db.IDBDialect;
import net.ibizsys.paas.core.IDataEntity;
import net.ibizsys.paas.util.StringHelper;
import net.ibizsys.paas.core.IDEDBCallContext;
import net.ibizsys.paas.db.DBCallResult;
import net.ibizsys.paas.demodel.IDataEntityModel;
import net.ibizsys.paas.demodel.DEModelGlobal;
import net.ibizsys.paas.dao.DAOGlobal;
import net.ibizsys.paas.dao.IDAO;
import net.ibizsys.paas.entity.IEntity;
import javax.annotation.PostConstruct;

import net.ibizsys.psrt.srv.wf.demodel.WFUserDEModel;
import net.ibizsys.psrt.srv.wf.entity.WFUser;
/**
 * 实体[WFUser] DAO对象基类
 */
public abstract class WFUserDAOBase extends net.ibizsys.psrt.srv.PSRuntimeSysDAOBase<WFUser> {

    private static final long serialVersionUID = -1L;

    public static final String DATAQUERY_DEFAULT = "DEFAULT";

    public WFUserDAOBase() {
        super();

    }

    @PostConstruct
    public void postConstruct() throws Exception {
        DAOGlobal.registerDAO(getDAOId(), this);
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.dao.DAOBase#getDAOId()
     */
    @Override
    protected String getDAOId() {
        return "net.ibizsys.psrt.srv.wf.dao.WFUserDAO";
    }

    private WFUserDEModel wFUserDEModel;

    /**
    * 获取实体[WFUser]模型对象
    * @return
    */
    public  WFUserDEModel getWFUserDEModel() {
        if(this.wFUserDEModel==null) {
            try {
                this.wFUserDEModel = (WFUserDEModel)DEModelGlobal.getDEModel("net.ibizsys.psrt.srv.wf.demodel.WFUserDEModel");
            } catch(Exception ex) {
            }
        }
        return this.wFUserDEModel;
    }

    /*
     * (non-Javadoc)
     * @see net.ibizsys.paas.dao.DAOBase#getDEModel()
     */
    @Override
    public  IDataEntityModel getDEModel() {
        return this.getWFUserDEModel();
    }



}