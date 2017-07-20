package net.ibizsys.paas.view;

import net.ibizsys.paas.core.ModelBaseImpl;
import net.sf.json.JSONObject;

/**
 * 视图信息对象
 * 
 * @author Administrator
 *
 */
public class ViewMessage extends ModelBaseImpl implements IViewMessage {

	/**
	 * 标题
	 */
	public final static String TITLE = "title";

	/**
	 * 位置
	 */
	public final static String POS = "pos";

	/**
	 * 类型
	 */
	public final static String TYPE = "type";

	/**
	 * 消息
	 */
	public final static String MESSAGE = "msg";

	private String strPosition = null;

	private String strMessage = null;

	private String strMessageType = null;

	private String strTitle = null;

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.view.IViewMessage#getPosition()
	 */
	@Override
	public String getPosition() {
		return this.strPosition;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.view.IViewMessage#getMessage()
	 */
	@Override
	public String getMessage() {
		return this.strMessage;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.view.IViewMessage#getMessageType()
	 */
	@Override
	public String getMessageType() {
		return this.strMessageType;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.view.IViewMessage#getTitle()
	 */
	@Override
	public String getTitle() {
		return this.strTitle;
	}

	/**
	 * 设置显示位置
	 * 
	 * @param strPosition
	 */
	public void setPosition(String strPosition) {
		this.strPosition = strPosition;
	}

	/**
	 * 设置消息内容
	 * 
	 * @param strMessage
	 */
	public void setMessage(String strMessage) {
		this.strMessage = strMessage;
	}

	/**
	 * 设置消息类型
	 * 
	 * @param strMessageType
	 */
	public void setMessageType(String strMessageType) {
		this.strMessageType = strMessageType;
	}

	/**
	 * 设置消息标题
	 * 
	 * @param strTitle
	 */
	public void setTitle(String strTitle) {
		this.strTitle = strTitle;
	}

	
	/**
	 * 设置标识
	 * @param strId
	 */
	public void setId(String strId){
		this.strId = strId;
	}
	
	/**
	 * 设置名称
	 * @param strName
	 */
	public void setName(String strName){
		this.strName = strName;
	}
	
	
	
	/**
	 * 导出JSON对象
	 * 
	 * @param jsonObject
	 * @param iViewMessage
	 * @return
	 * @throws Exception
	 */
	public static JSONObject toJSONObject(JSONObject jsonObject, IViewMessage iViewMessage) throws Exception {
		if (jsonObject == null) jsonObject = new JSONObject();

		jsonObject.put(TITLE, iViewMessage.getTitle());
		jsonObject.put(POS, iViewMessage.getPosition());
		jsonObject.put(TYPE, iViewMessage.getMessageType());
		jsonObject.put(MESSAGE, iViewMessage.getMessage());

		return jsonObject;
	}

}
