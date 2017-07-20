/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package net.ibizsys.psrt.srv.wf.demodel.wfucpolicy.uiaction;


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

import net.ibizsys.psrt.srv.wf.entity.WFUCPolicy;
import net.ibizsys.psrt.srv.wf.service.WFUCPolicyService;


public abstract class WFUCPolicyDisablePolicyUIActionModelBase extends net.ibizsys.paas.demodel.DEUIActionModelBase<WFUCPolicy> {

    private static final Log log = LogFactory.getLog(WFUCPolicyDisablePolicyUIActionModelBase.class);

    public WFUCPolicyDisablePolicyUIActionModelBase() {
        super();

        this.setId("E1E4A34B-93C9-481D-9242-4556BF9ABA1E");
        this.setName("DisablePolicy");
        this.setActionTarget("MULTIKEY");
        this.setDEActionName("DisablePolicy");
        this.setReloadData(true);
    }

}