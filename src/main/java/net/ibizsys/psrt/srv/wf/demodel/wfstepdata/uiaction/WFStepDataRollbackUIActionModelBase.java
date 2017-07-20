/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package net.ibizsys.psrt.srv.wf.demodel.wfstepdata.uiaction;


import java.util.List;
import java.util.HashMap;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import net.ibizsys.paas.entity.IEntity;
import net.ibizsys.paas.entity.SimpleEntity;
import net.ibizsys.paas.web.WebContext;
import net.ibizsys.paas.service.ServiceGlobal;
import net.ibizsys.paas.service.IService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import net.ibizsys.psrt.srv.wf.entity.WFStepData;
import net.ibizsys.psrt.srv.wf.service.WFStepDataService;


public abstract class WFStepDataRollbackUIActionModelBase extends net.ibizsys.paas.demodel.DEUIActionModelBase<WFStepData> {

    private static final Log log = LogFactory.getLog(WFStepDataRollbackUIActionModelBase.class);

    public WFStepDataRollbackUIActionModelBase() {
        super();

        this.setId("81FFA1AE-A6F5-49A0-AE3C-995930A6B115");
        this.setName("Rollback");
        this.setActionTarget("MULTIKEY");
        this.setDEActionName("Rollback");
        this.setReloadData(true);
        this.setDataAccessAction("NONE");
        this.setSuccessMsg("回撤操作成功！");
    }

}