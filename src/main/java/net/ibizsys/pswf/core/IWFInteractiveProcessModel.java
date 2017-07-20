package net.ibizsys.pswf.core;

/**
 * 流程交互处理操作模型接口
 * @author lionlau
 *
 */
public interface IWFInteractiveProcessModel   extends IWFProcessModel
{
	/**
	 * 获取交互连接集合
	 * @return
	 */
	java.util.Iterator<IWFInteractiveLinkModel> getWFInteractiveLinkModels();
	
	
	/**
	 * 获取指定交互操作
	 * @param strName
	 * @return
	 * @throws Exception
	 */
	IWFInteractiveLinkModel getWFInteractiveLinkModel(String strName,boolean bTryMode) throws Exception;
	
	
	
	/**
	 * 获取流程角色
	 * @return
	 */
	java.util.Iterator<IWFProcRoleModel> getWFProcRoleModels();
	
	
	
	/**
	 * 是否发送通知
	 * @return
	 */
	boolean isSendInform();
	
	
	/**
	 * 获取消息模版编号
	 * @return
	 */
	String getMsgTemplateId();
	
	
	/**
	 * 获取消息类型
	 * @return
	 */
	int getMsgType();
	
	
	
	/**
	 * 是否启用操作者交互控制
	 * @return
	 */
	boolean isActorIAActionControl();
	
	
	
	
	/**
	 * 获取数据对象上下文用户标识
	 * @return
	 */
	java.util.Iterator<String> getUDActors(); 
	
	
	
	/**
	 * 当前步骤是否支持编辑
	 * @return
	 */
	boolean isEditable();
	
	
	
	/**
	 * 获取处理意见属性
	 * @return
	 */
	String getMemoField();
}
