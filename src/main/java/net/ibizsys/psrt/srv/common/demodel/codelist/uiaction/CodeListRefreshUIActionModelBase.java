package net.ibizsys.psrt.srv.common.demodel.codelist.uiaction;


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

import net.ibizsys.psrt.srv.common.entity.CodeList;
import net.ibizsys.psrt.srv.common.service.CodeListService;


public abstract class CodeListRefreshUIActionModelBase extends net.ibizsys.paas.demodel.DEUIActionModelBase<CodeList>{
  
   private static final Log log = LogFactory.getLog(CodeListRefreshUIActionModelBase.class);

   public CodeListRefreshUIActionModelBase(){
        super();

        this.setId("21C9ECE1-5A81-4448-A892-B674240C1FCB");
        this.setName("Refresh");
        this.setActionTarget("MULTIKEY");
        this.setDEActionName("Refresh");
        this.setReloadData(true);
        this.setSuccessMsg("刷新代码表成功！");
   }
 
}