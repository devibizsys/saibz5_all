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


public abstract class ServiceStartServiceUIActionModelBase extends net.ibizsys.paas.demodel.DEUIActionModelBase<Service> {

    private static final Log log = LogFactory.getLog(ServiceStartServiceUIActionModelBase.class);

    public ServiceStartServiceUIActionModelBase() {
        super();

        this.setId("4289D139-69BA-439E-8C91-B1BF69B6403A");
        this.setName("StartService");
        this.setActionTarget("MULTIKEY");
        this.setDEActionName("StartService");
        this.setReloadData(true);
        this.setSuccessMsg("服务启动成功！");
    }

}