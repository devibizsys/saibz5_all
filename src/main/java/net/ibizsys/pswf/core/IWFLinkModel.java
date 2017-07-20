package net.ibizsys.pswf.core;


/**
 * 流程连接模型
 * @author lionlau
 *
 */
public interface IWFLinkModel
{
	/**
	 * 初始化
	 * @param iWFVersionModel
	 * @throws Exception
	 */
	void init(IWFVersionModel iWFVersionModel) throws Exception;
	
	
	/**
	 * 获取标识
	 * @return
	 */
	String getId();
	
	
	
	/**
	 * 获取名称
	 * @return
	 */
	String getName();
	
	
	/**
	 * 获取逻辑名称
	 * @return
	 */
	String getLogicName();
	
	/**
	 * 获取版本模型对象
	 * @return
	 */
	IWFVersionModel getWFVersionModel();
	
	
	
	/**
	 * 获取连接到目标标识
	 * @return
	 */
	String getNext();
	
	
	
	/**
	 * 获取源点
	 * @return
	 */
	String getFrom();
	
	
	/**
	 * 获取源端点
	 * @return
	 */
	String getSrcEndPoint();
	
	
	
	/**
	 * 获取目标端点
	 * @return
	 */
	String getDstEndPoint();
	
	
	
	/**
	 * 获取用户数据
	 * @return
	 */
	String getUserData();
	
	
	
	/**
	 * 获取用户数据2
	 * @return
	 */
	String getUserData2();
	
	


}
