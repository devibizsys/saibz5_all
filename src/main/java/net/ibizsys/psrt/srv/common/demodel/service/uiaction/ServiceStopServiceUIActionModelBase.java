/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package net.ibizsys.psrt.srv.common.demodel.service.uiaction;


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

import net.ibizsys.psrt.srv.common.entity.Service;
import net.ibizsys.psrt.srv.common.service.ServiceService;


public abstract class ServiceStopServiceUIActionModelBase extends net.ibizsys.paas.demodel.DEUIActionModelBase<Service> {

    private static final Log log = LogFactory.getLog(ServiceStopServiceUIActionModelBase.class);

    public ServiceStopServiceUIActionModelBase() {
        super();

        this.setId("1DAF43F4-0D78-42EE-BFFA-85F59F1A70FB");
        this.setName("StopService");
        this.setActionTarget("MULTIKEY");
        this.setDEActionName("StopService");
        this.setReloadData(true);
        this.setSuccessMsg("服务停止成功！");
    }

}