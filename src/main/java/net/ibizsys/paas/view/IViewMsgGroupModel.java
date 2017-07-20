package net.ibizsys.paas.view;

import java.util.ArrayList;


/**
 * 视图消息组模型
 * 
 * @author Administrator
 *
 */
public interface IViewMsgGroupModel extends IViewMsgGroup {

	/**
	 * 注册视图消息模型
	 * 
	 * @param iViewMsgModel
	 * @throws Exception
	 */
	void registerViewMsgModel(IViewMsgModel iViewMsgModel) throws Exception;


	
	
	/**
	 * 填充视图消息集合
	 * 
	 * @param viewMessageList
	 * @throws Exception
	 */
	void fillViewMessages(ArrayList<IViewMessage> viewMessageList) throws Exception;

}
