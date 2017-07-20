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


public abstract class WFInstanceRestartUIActionModelBase extends net.ibizsys.paas.demodel.DEUIActionModelBase<WFInstance> {

    private static final Log log = LogFactory.getLog(WFInstanceRestartUIActionModelBase.class);

    public WFInstanceRestartUIActionModelBase() {
        super();

        this.setId("4B9CAA8D-5BF7-4B24-8835-B1447EE62477");
        this.setName("Restart");
        this.setActionTarget("MULTIKEY");
        this.setDEActionName("Restart");
        this.setReloadData(true);
        this.setSuccessMsg("流程重启完成");
    }

}