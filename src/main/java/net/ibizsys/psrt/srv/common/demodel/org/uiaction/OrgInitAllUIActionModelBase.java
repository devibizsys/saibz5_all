/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package net.ibizsys.psrt.srv.common.demodel.org.uiaction;


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

import net.ibizsys.psrt.srv.common.entity.Org;
import net.ibizsys.psrt.srv.common.service.OrgService;


public abstract class OrgInitAllUIActionModelBase extends net.ibizsys.paas.demodel.DEUIActionModelBase<Org> {

    private static final Log log = LogFactory.getLog(OrgInitAllUIActionModelBase.class);

    public OrgInitAllUIActionModelBase() {
        super();

        this.setId("04647C73-AFFA-4495-9D53-D1B874C1AA15");
        this.setName("InitAll");
        this.setActionTarget("MULTIKEY");
        this.setDEActionName("InitAll");
        this.setSuccessMsg("初始化机构相关数据完成！");
    }

}