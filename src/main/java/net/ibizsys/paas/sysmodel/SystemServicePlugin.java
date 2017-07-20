package net.ibizsys.paas.sysmodel;

import java.util.HashMap;

import net.ibizsys.paas.core.PluginActionResult;
import net.ibizsys.paas.entity.IEntity;
import net.ibizsys.paas.service.IService;
import net.ibizsys.paas.service.IServicePlugin;
import net.ibizsys.paas.service.ServicePluginBase;

/**
 * 系统服务插件（代理）
 * @author Administrator
 *
 */
public class SystemServicePlugin extends ServicePluginBase implements ISystemServicePlugin {
	
	protected HashMap<String, IServicePlugin> iServicePluginMap = new HashMap<String, IServicePlugin>();
	
	public void registerServicePlugin(String strDEName,IServicePlugin iServicePlugin)throws Exception{
		iServicePluginMap.put(strDEName, iServicePlugin);
	}

	@Override
	public PluginActionResult doCreate(IService iService, int nActionPos, IEntity iEntity, Object objParam) throws Exception {
		
		IServicePlugin iServicePlugin = iServicePluginMap.get(iService.getDEModel().getName());
		if(iServicePlugin == null){
			iServicePlugin = iServicePluginMap.get("");
		}
		if(iServicePlugin!=null){
			PluginActionResult pluginActionResult =	iServicePlugin.doCreate( iService,  nActionPos,  iEntity,  objParam);
			if(pluginActionResult== PluginActionResult.Replace)
				return pluginActionResult;
		}
		return super.doCreate(iService, nActionPos, iEntity, objParam);
	}

	@Override
	public PluginActionResult doUpdate(IService iService, int nActionPos, IEntity iEntity, Object objParam) throws Exception {
		IServicePlugin iServicePlugin = iServicePluginMap.get(iService.getDEModel().getName());
		if(iServicePlugin == null){
			iServicePlugin = iServicePluginMap.get("");
		}
		if(iServicePlugin!=null){
			PluginActionResult pluginActionResult =	iServicePlugin.doUpdate( iService,  nActionPos,  iEntity,  objParam);
			if(pluginActionResult== PluginActionResult.Replace)
				return pluginActionResult;
		}
		return super.doUpdate(iService, nActionPos, iEntity, objParam);
	}

	@Override
	public PluginActionResult doRemove(IService iService, int nActionPos, IEntity iEntity, Object objParam) throws Exception {
		IServicePlugin iServicePlugin = iServicePluginMap.get(iService.getDEModel().getName());
		if(iServicePlugin == null){
			iServicePlugin = iServicePluginMap.get("");
		}
		if(iServicePlugin!=null){
			PluginActionResult pluginActionResult =	iServicePlugin.doRemove( iService,  nActionPos,  iEntity,  objParam);
			if(pluginActionResult== PluginActionResult.Replace)
				return pluginActionResult;
		}
		return super.doRemove(iService, nActionPos, iEntity, objParam);
	}

	@Override
	public PluginActionResult doCopyDetails(IService iService, int nActionPos, IEntity iEntity, Object objParam) throws Exception {
		IServicePlugin iServicePlugin = iServicePluginMap.get(iService.getDEModel().getName());
		if(iServicePlugin == null){
			iServicePlugin = iServicePluginMap.get("");
		}
		if(iServicePlugin!=null){
			PluginActionResult pluginActionResult =	iServicePlugin.doCopyDetails( iService,  nActionPos,  iEntity,  objParam);
			if(pluginActionResult== PluginActionResult.Replace)
				return pluginActionResult;
		}
		return super.doCopyDetails(iService, nActionPos, iEntity, objParam);
	}
	
	
	
}
