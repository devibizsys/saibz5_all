package net.ibizsys.psrt.srv.common.service;


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
import net.ibizsys.paas.sysmodel.BackendServiceMgr;


//@Service
//@Transactional
@Component

/**
 * 服务 服务操作对象
 * 
 */
public  class ServiceService extends ServiceServiceBase{

  private static final Log log = LogFactory.getLog(ServiceService.class);
   public ServiceService (){
        super();
        
   }
   
   @Override
	protected void onStartService(net.ibizsys.psrt.srv.common.entity.Service service) throws Exception
	{
		BackendServiceMgr backendServiceMgr = BackendServiceMgr.getInstance();
		backendServiceMgr.start(service.getServiceId());
	}
   
   @Override
	protected void onStopService(net.ibizsys.psrt.srv.common.entity.Service service) throws Exception
	{
	   BackendServiceMgr backendServiceMgr = BackendServiceMgr.getInstance();
		backendServiceMgr.stop(service.getServiceId());
	}
}