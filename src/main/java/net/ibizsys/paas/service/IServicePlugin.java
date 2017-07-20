package net.ibizsys.paas.service;

import net.ibizsys.paas.core.IPlugin;
import net.ibizsys.paas.core.PluginActionResult;
import net.ibizsys.paas.entity.IEntity;

/**
 * 服务对象插件
 * @author Administrator
 *
 */
public interface IServicePlugin extends IPlugin {

	/**
	 * 执行建立操作
	 * @param iService
	 * @param nActionPos
	 * @param iEntity
	 * @param objParam
	 * @return
	 * @throws Exception
	 */
	PluginActionResult doCreate(IService iService,int nActionPos,IEntity iEntity,Object objParam)throws Exception;
	
	
	
	/**
	 * 执行更新操作
	 * @param iService
	 * @param nActionPos
	 * @param iEntity
	 * @param objParam
	 * @return
	 * @throws Exception
	 */
	PluginActionResult doUpdate(IService iService,int nActionPos,IEntity iEntity,Object objParam)throws Exception;
	
	
	/**
	 * 执行删除操作
	 * @param iService
	 * @param nActionPos
	 * @param iEntity
	 * @param objParam
	 * @return
	 * @throws Exception
	 */
	PluginActionResult doRemove(IService iService,int nActionPos,IEntity iEntity,Object objParam)throws Exception;
	
	
	/**
	 * 执行拷贝处理
	 * @param iService
	 * @param nActionPos
	 * @param iEntity
	 * @param objParam
	 * @return
	 * @throws Exception
	 */
	PluginActionResult doCopyDetails(IService iService,int nActionPos,IEntity iEntity,Object objParam)throws Exception;
}
