/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package net.ibizsys.psrt.srv.wx.demodel.wxaccount.uiaction;


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

import net.ibizsys.psrt.srv.wx.entity.WXAccount;
import net.ibizsys.psrt.srv.wx.service.WXAccountService;


public abstract class WXAccountSyncOrgSectorUIActionModelBase extends net.ibizsys.paas.demodel.DEUIActionModelBase<WXAccount> {

    private static final Log log = LogFactory.getLog(WXAccountSyncOrgSectorUIActionModelBase.class);

    public WXAccountSyncOrgSectorUIActionModelBase() {
        super();

        this.setId("FF25F1FA-ADF3-498B-A276-5B17CC0873D0");
        this.setName("SyncOrgSector");
        this.setActionTarget("MULTIKEY");
        this.setDEActionName("SyncOrgSector");
        this.setSuccessMsg("同步部门成功！");
    }

}