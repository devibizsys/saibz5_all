/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package net.ibizsys.psrt.srv.common.demodel.userdict.uiaction;


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

import net.ibizsys.psrt.srv.common.entity.UserDict;
import net.ibizsys.psrt.srv.common.service.UserDictService;


public abstract class UserDictReloadCurUserUIActionModelBase extends net.ibizsys.paas.demodel.DEUIActionModelBase<UserDict> {

    private static final Log log = LogFactory.getLog(UserDictReloadCurUserUIActionModelBase.class);

    public UserDictReloadCurUserUIActionModelBase() {
        super();

        this.setId("6BBDD2EC-9323-4984-8A0D-0AA19BAEEF14");
        this.setName("ReloadCurUser");
        this.setActionTarget("NONE");
        this.setDEActionName("ReloadCurUser");
        this.setSuccessMsg("重新加载当前用户成功！");
    }

}