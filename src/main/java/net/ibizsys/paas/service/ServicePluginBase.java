package net.ibizsys.paas.service;

import net.ibizsys.paas.core.IPlugin;
import net.ibizsys.paas.core.PluginActionResult;
import net.ibizsys.paas.core.PluginBase;
import net.ibizsys.paas.entity.IEntity;
import net.ibizsys.paas.sysmodel.ISystemPlugin;

/**
 * 实体服务插件
 * @author Administrator
 *
 */
public abstract class ServicePluginBase extends PluginBase implements IServicePlugin{

	private IServicePlugin prevServicePlugin = null;
	
	@Override
	public PluginActionResult doCreate(IService iService, int nActionPos, IEntity iEntity, Object objParam) throws Exception {
		if(prevServicePlugin!=null)
			return prevServicePlugin.doCreate(iService, nActionPos, iEntity, objParam);
		return PluginActionResult.Continue;
	}

	@Override
	public PluginActionResult doUpdate(IService iService, int nActionPos, IEntity iEntity, Object objParam) throws Exception {
		if(prevServicePlugin!=null)
			return prevServicePlugin.doUpdate(iService, nActionPos, iEntity, objParam);
		return PluginActionResult.Continue;
	}

	@Override
	public PluginActionResult doRemove(IService iService, int nActionPos, IEntity iEntity, Object objParam) throws Exception {
		if(prevServicePlugin!=null)
			return prevServicePlugin.doRemove(iService, nActionPos, iEntity, objParam);
		return PluginActionResult.Continue;
	}

	@Override
	public PluginActionResult doCopyDetails(IService iService, int nActionPos, IEntity iEntity, Object objParam) throws Exception {
		if(prevServicePlugin!=null)
			return prevServicePlugin.doCopyDetails(iService, nActionPos, iEntity, objParam);
		return PluginActionResult.Continue;
	}

	@Override
	public void setPrevPlugin(IPlugin iPlugin) {
		super.setPrevPlugin(iPlugin);
		if(iPlugin instanceof IServicePlugin){
			prevServicePlugin = (IServicePlugin)iPlugin;
		}
		if(iPlugin instanceof ISystemPlugin){
			prevServicePlugin = ((ISystemPlugin)iPlugin).getServicePlugin();
		}
	}

	
	
}
