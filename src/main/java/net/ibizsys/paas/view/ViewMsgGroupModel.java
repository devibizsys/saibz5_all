package net.ibizsys.paas.view;

import java.util.ArrayList;

import net.ibizsys.paas.core.ModelBaseImpl;

/**
 * 视图消息组模型
 * 
 * @author Administrator
 *
 */
public class ViewMsgGroupModel extends ModelBaseImpl implements IViewMsgGroupModel {

	protected ArrayList<IViewMsgModel> viewMsgModelList = new ArrayList<IViewMsgModel>();

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.view.IViewMsgGroupModel#registerViewMsgModel(net.ibizsys.paas.view.IViewMsgModel)
	 */
	@Override
	public void registerViewMsgModel(IViewMsgModel iViewMsgModel) throws Exception {
		this.viewMsgModelList.add(iViewMsgModel);
	}





	@Override
	public void fillViewMessages(ArrayList<IViewMessage> viewMessageList) throws Exception {
		for(IViewMsgModel iViewMsgModel:viewMsgModelList){
			iViewMsgModel.fillViewMessages(viewMessageList);
		}
	}

}
