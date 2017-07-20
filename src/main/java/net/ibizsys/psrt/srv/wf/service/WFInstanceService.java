package net.ibizsys.psrt.srv.wf.service;


import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;



import net.ibizsys.paas.service.ServiceGlobal;
import net.ibizsys.psrt.srv.wf.entity.WFInstance;
import net.ibizsys.pswf.core.IWFModel;
import net.ibizsys.pswf.core.IWFService;
import net.ibizsys.pswf.core.WFActionParam;
import net.ibizsys.pswf.core.WFModelGlobal;


//@Service
//@Transactional
@Component

/**
 * 工作流实例 服务操作对象
 * 
 */
public  class WFInstanceService extends WFInstanceServiceBase{

  private static final Log log = LogFactory.getLog(WFInstanceService.class);
   public WFInstanceService (){
        super();
        
   }
   
   @Override
	protected void onRestart(WFInstance wFInstance) throws Exception
	{
	   if(!wFInstance.isFullEntity())
		   this.get(wFInstance);
	   	IWFModel iWFModel = WFModelGlobal.getWFModel(wFInstance.getWFWorkflowId());
		IWFService iWFService = iWFModel.getWFService();
		WFActionParam wfActionParam = new WFActionParam();
		wfActionParam.setUserData(wFInstance.getUserData());
		wfActionParam.setUserData4(wFInstance.getUserData4());
		wfActionParam.setOpPersonId(this.getWebContext().getCurUserId());
		iWFService.restart(wfActionParam);
	}
   
   
   @Override
	protected void onUserCancel(WFInstance wFInstance) throws Exception
	{
	   if(!wFInstance.isFullEntity())
		   this.get(wFInstance);
	   IWFModel iWFModel = WFModelGlobal.getWFModel(wFInstance.getWFWorkflowId());
		IWFService iWFService = iWFModel.getWFService();
		WFActionParam wfActionParam = new WFActionParam();
		wfActionParam.setUserData(wFInstance.getUserData());
		wfActionParam.setUserData4(wFInstance.getUserData4());
		wfActionParam.setOpPersonId(this.getWebContext().getCurUserId());
		iWFService.close(wfActionParam);
	}

}