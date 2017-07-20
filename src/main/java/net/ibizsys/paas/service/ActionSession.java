package net.ibizsys.paas.service;

import java.util.HashMap;

import net.ibizsys.paas.util.StringBuilderEx;
import net.ibizsys.paas.util.StringHelper;

/**
 * 操作会话管理对象
 * 
 * @author lionlau
 *
 */
public class ActionSession {
	/**
	 * 递归操作数据Map
	 */
	private HashMap<String, String> recursionDataMap = new HashMap<String, String>();

	/**
	 * 操作参数
	 */
	private HashMap<String, Object> actionParamMap = new HashMap<String, Object>();

	private String strName = "";

	private StringBuilderEx actionInfoSB = new StringBuilderEx();

	/**
	 * 获取名称
	 * 
	 * @return
	 */
	public String getName() {
		return this.strName;
	}

	/**
	 * 设置名称
	 * 
	 * @param strName
	 */
	public void setName(String strName) {
		this.strName = strName;
	}

	/**
	 * 注册递归操作
	 * 
	 * @param strDEId
	 * @param objKeyValue
	 * @return
	 */
	public boolean registerRecursion(String strDEId, Object objKeyValue) {
		String strRecursionTag = StringHelper.format("%1$s||%2$s", strDEId, objKeyValue);
		if (recursionDataMap.containsKey(strRecursionTag)) {
			return false;
		}
		recursionDataMap.put(strRecursionTag, "");
		return true;
	}

	/**
	 * 注册递归操作
	 * 
	 * @param strActionType 操作类型
	 * @param strDEId
	 * @param objKeyValue
	 * @return
	 */
	public boolean registerRecursion(String strActionType, String strDEId, Object objKeyValue) {
		String strRecursionTag = StringHelper.format("%1$s||%2$s||%3$s", strActionType, strDEId, objKeyValue);
		if (recursionDataMap.containsKey(strRecursionTag)) {
			return false;
		}
		recursionDataMap.put(strRecursionTag, "");
		return true;
	}

	/**
	 * 附加操作信息
	 * 
	 * @param strInfo
	 */
	public void appendActionInfo(String strInfo) {
		actionInfoSB.append(strInfo);
	}

	/**
	 * 获取操作信息
	 * 
	 * @return
	 */
	public String getActionInfo() {
		return this.actionInfoSB.toString();
	}

	/**
	 * 设置操作参数
	 * 
	 * @param strName
	 * @param objValue
	 */
	public void setActionParam(String strName, Object objValue) {
		actionParamMap.put(strName, objValue);
	}

	/**
	 * 移除操作参数
	 * 
	 * @param strName
	 * @return
	 */
	public Object removeActionParam(String strName) {
		return actionParamMap.remove(strName);
	}

	/**
	 * 获取操作参数
	 * 
	 * @param strName
	 * @return
	 */
	public Object getActionParam(String strName) {
		return actionParamMap.get(strName);
	}
}
