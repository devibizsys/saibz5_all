package net.ibizsys.paas.view;

import java.util.ArrayList;

import net.ibizsys.paas.core.ModelBaseImpl;

/**
 * 视图消息模型基类
 * 
 * @author Administrator
 *
 */
public abstract class ViewMsgModelBase extends ModelBaseImpl implements IViewMsgModel {

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.view.IViewMsgModel#fillViewMessages(java.util.ArrayList)
	 */
	@Override
	public int fillViewMessages(ArrayList<IViewMessage> viewMessageList) throws Exception {
		return 0;
	}

}
