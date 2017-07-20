/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package net.ibizsys.psrt.srv.demodel.demodel.dataentity.uiaction;


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

import net.ibizsys.psrt.srv.demodel.entity.DataEntity;
import net.ibizsys.psrt.srv.demodel.service.DataEntityService;


public abstract class DataEntityInitAllUIActionModelBase extends net.ibizsys.paas.demodel.DEUIActionModelBase<DataEntity> {

    private static final Log log = LogFactory.getLog(DataEntityInitAllUIActionModelBase.class);

    public DataEntityInitAllUIActionModelBase() {
        super();

        this.setId("F0D30EC1-2C41-409E-B8AC-7E0F983C5127");
        this.setName("InitAll");
        this.setActionTarget("MULTIKEY");
        this.setDEActionName("InitAll");
        this.setSuccessMsg("初始化实体相关配置完成！");
    }

}