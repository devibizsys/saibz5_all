/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package net.ibizsys.psrt.srv.wf.demodel.wfinstance.uiaction;


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

import net.ibizsys.psrt.srv.wf.entity.WFInstance;
import net.ibizsys.psrt.srv.wf.service.WFInstanceService;


public abstract class WFInstanceUserCancelUIActionModelBase extends net.ibizsys.paas.demodel.DEUIActionModelBase<WFInstance> {

    private static final Log log = LogFactory.getLog(WFInstanceUserCancelUIActionModelBase.class);

    public WFInstanceUserCancelUIActionModelBase() {
        super();

        this.setId("EBA9085F-461B-4223-BDAF-EEDD62E2E5BE");
        this.setName("UserCancel");
        this.setActionTarget("MULTIKEY");
        this.setDEActionName("UserCancel");
        this.setReloadData(true);
        this.setSuccessMsg("流程取消完成");
    }

}