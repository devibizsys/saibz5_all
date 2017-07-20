package net.ibizsys.pswf.core;

import java.util.HashMap;

import net.ibizsys.paas.util.StringHelper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * 流程模型全局对象
 * @author Administrator
 *
 */
public class WFModelGlobal
{
	private static final Log log = LogFactory.getLog(WFModelGlobal.class);
	private static HashMap<String, IWFModel> wfmodelMap = new HashMap<String, IWFModel>();
	
	/**
	 * 注册流程模型
	 * @param strWFModelClsType
	 * @param iWFModel
	 */
	public static void registerWFModel(String strWFModelClsType,IWFModel iWFModel)
	{
		wfmodelMap.put(strWFModelClsType, iWFModel);
		wfmodelMap.put(iWFModel.getId(), iWFModel);
	}
	
	
	/**
	 * 获取流程模型
	 * @param cls
	 * @return
	 * @throws Exception
	 */
	public static IWFModel getWFModel(Class cls) throws Exception
	{
		return getWFModel(cls.getCanonicalName());
	}
	
	/**
	 *  获取流程模型
	 * @param strWFModelClsType
	 * @return
	 * @throws Exception
	 */
	public static IWFModel getWFModel(String strWFModelClsType) throws Exception
	{
		IWFModel iWFModel = wfmodelMap.get(strWFModelClsType);
		if(iWFModel == null)
			throw new Exception(StringHelper.format("无法获取指定流程模型[%1$s]",strWFModelClsType));
		return iWFModel;
	}
}
