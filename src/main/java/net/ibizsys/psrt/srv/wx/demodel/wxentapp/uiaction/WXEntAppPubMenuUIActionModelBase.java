/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package net.ibizsys.psrt.srv.wx.demodel.wxentapp.uiaction;


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

import net.ibizsys.psrt.srv.wx.entity.WXEntApp;
import net.ibizsys.psrt.srv.wx.service.WXEntAppService;


public abstract class WXEntAppPubMenuUIActionModelBase extends net.ibizsys.paas.demodel.DEUIActionModelBase<WXEntApp> {

    private static final Log log = LogFactory.getLog(WXEntAppPubMenuUIActionModelBase.class);

    public WXEntAppPubMenuUIActionModelBase() {
        super();

        this.setId("EA4930E9-876E-46F5-A36E-AEAB00FB08F1");
        this.setName("PubMenu");
        this.setActionTarget("MULTIKEY");
        this.setDEActionName("PubMenu");
        this.setSuccessMsg("发布菜单成功！");
    }

}