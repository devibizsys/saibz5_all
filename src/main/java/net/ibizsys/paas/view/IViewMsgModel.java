package net.ibizsys.paas.view;

import java.util.ArrayList;

/**
 * 视图消息模型对象
 * 
 * @author Administrator
 *
 */
public interface IViewMsgModel extends IViewMessage  {

	/**
	 * 填充视图消息集合
	 * 
	 * @param viewMessageList
	 * @return 填充数量
	 * @throws Exception
	 */
	int fillViewMessages(ArrayList<IViewMessage> viewMessageList) throws Exception;

}
