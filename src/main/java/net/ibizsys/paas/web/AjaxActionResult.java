package net.ibizsys.paas.web;

import net.ibizsys.paas.core.CallResult;
import net.ibizsys.paas.core.Errors;
import net.ibizsys.paas.ctrlhandler.ICtrlRender;
import net.ibizsys.paas.util.JSONObjectHelper;
import net.ibizsys.paas.util.StringHelper;
import net.sf.json.JSONObject;

/**
 * 异步请求结果对象
 * 
 * @author lionlau
 *
 */
public class AjaxActionResult extends CallResult {
	protected String strGotoPath = "";
	protected String strJSCode = "";
	protected String strJSBeforeCode = "";
	protected String strContent = "";
	protected String strDownloadPath = "";

	protected JSONObject extInfo = null;
	protected String strAjaxAction = "";
	protected ICtrlRender iCtrlRender = null;

	protected JSONObject attributes = null;

	public AjaxActionResult() {

	}

	/**
	 * 设置跳转路径
	 * 
	 * @param strGotoPath
	 */
	public void setGotoPath(String strGotoPath) {
		this.strGotoPath = strGotoPath;
	}

	/**
	 * 获取跳转路径
	 * 
	 * @return
	 */
	public String getGotoPath() {
		return this.strGotoPath;
	}

	/**
	 * 设置现在路径
	 * 
	 * @param strDownloadPath
	 */
	public void setDownloadPath(String strDownloadPath) {
		this.strDownloadPath = strDownloadPath;
	}

	/**
	 * 获取跳转路径
	 * 
	 * @return
	 */
	public String getDownloadPath() {
		return this.strDownloadPath;
	}

	/**
	 * 设置执行的脚本
	 * 
	 * @param strJSCode
	 */
	public void setJSCode(String strJSCode) {
		this.strJSCode = strJSCode;
	}

	/**
	 * 获取执行的脚本
	 * 
	 * @return
	 */
	public String getJSCode() {
		return this.strJSCode;
	}

	/**
	 * 导出JSON字符串
	 * 
	 * @return
	 */

	public String toJSONString() {
		JSONObject objJSON = new JSONObject();
		fillJSONObject(objJSON);
		if (getCtrlRender() != null) {
			getCtrlRender().filteAjaxActionResult(this, objJSON);
		}
		return objJSON.toString();
	}

	/**
	 * 填充JSON对象
	 * 
	 * @param objJSON
	 */
	protected void fillJSONObject(JSONObject objJSON) {
		objJSON.put("ret", this.nRetCode);
		objJSON.put("info", this.strErrorInfo);
		objJSON.put("url", this.strGotoPath);

		if (!StringHelper.isNullOrEmpty(this.strDownloadPath)) {
			objJSON.put("downloadurl", this.strDownloadPath);
		}

		objJSON.put("code", this.strJSCode);
		objJSON.put("bcode", this.strJSBeforeCode);
		objJSON.put("content", this.strContent);

		if (this.getRetCode() != Errors.OK) {
			objJSON.put("success", false);
			objJSON.put("errorMessage", this.getErrorInfo());
		} else {
			objJSON.put("success", true);
		}

		if (extInfo != null) {
			java.util.Iterator keys = extInfo.keys();
			while (keys.hasNext()) {
				String strKey = (String) keys.next();
				if (objJSON.has(strKey)) {
					continue;
				}

				objJSON.put(strKey, extInfo.get(strKey));
			}
		}
	}

	/**
	 * 附加JS脚本
	 * 
	 * @param strJSCode
	 */
	public void appendJSCode(String strJSCode) {
		this.strJSCode += strJSCode;
	}

	/**
	 * 附加JS脚本（操作之前）
	 * 
	 * @param strJSCode
	 */
	public void appendJSBeforeCode(String strJSBeforeCode) {
		this.strJSBeforeCode += strJSBeforeCode;
	}

	/**
	 * 获取JS脚本（操作之前）
	 * 
	 * @return the strJSBeforeCode
	 */
	public String getJSBeforeCode() {
		return strJSBeforeCode;
	}

	/**
	 * 设置JS脚本（操作之前）
	 * 
	 * @param strJSBeforeCode the strJSBeforeCode to set
	 */
	public void setJSBeforeCode(String strJSBeforeCode) {
		this.strJSBeforeCode = strJSBeforeCode;
	}

	/**
	 * 设置扩展信息
	 * 
	 * @param strKey
	 * @param strInfo
	 */
	public void setExtAttr(String strKey, Object objValue) {
		if (extInfo == null) extInfo = new JSONObject();
		if (extInfo.has(strKey)) {
			extInfo.remove(strKey);
		}
		extInfo.put(strKey, objValue);
	}

	/**
	 * 删除扩展信息
	 * 
	 * @param strKey
	 */
	public void removeExtAttr(String strKey) {
		if (extInfo == null) return;

		if (extInfo.has(strKey)) {
			extInfo.remove(strKey);
		}
	}

	/**
	 * 获取异步请求操作
	 * 
	 * @return the strAjaxAction
	 */
	public String getAjaxAction() {
		return strAjaxAction;
	}

	/**
	 * 设置异步请求操作
	 * 
	 * @param strAjaxAction the strAjaxAction to set
	 */
	public void setAjaxAction(String strAjaxAction) {
		this.strAjaxAction = strAjaxAction;
	}

	/**
	 * 获取控件绘制器对象
	 * 
	 * @return the iCtrlRender
	 */
	public ICtrlRender getCtrlRender() {
		return iCtrlRender;
	}

	/**
	 * 设置控件绘制器对象
	 * 
	 * @param iCtrlRender the iCtrlRender to set
	 */
	public void setCtrlRender(ICtrlRender iCtrlRender) {
		this.iCtrlRender = iCtrlRender;
	}

	/**
	 * 获取请求内容
	 * 
	 * @return the strContent
	 */
	public String getContent() {
		return strContent;
	}

	/**
	 * 设置请求内容
	 * 
	 * @param strContent the strContent to set
	 */
	public void setContent(String strContent) {
		this.strContent = strContent;
	}

	/**
	 * 从JSON对象中构造
	 * 
	 * @param jo
	 * @throws Exception
	 */
	public void fromJSONObject(JSONObject jo) throws Exception {
		this.nRetCode = jo.optInt("ret", Errors.OK);
		this.strErrorInfo = jo.optString("info", null);
		this.strGotoPath = jo.optString("url", null);
		this.strDownloadPath = jo.optString("downloadurl", null);
		this.strJSCode = jo.optString("code", null);
		this.strJSBeforeCode = jo.optString("bcode", null);
		this.strContent = jo.optString("content", null);

		JSONObjectHelper.remove(jo, "ret");
		JSONObjectHelper.remove(jo, "info");
		JSONObjectHelper.remove(jo, "url");
		JSONObjectHelper.remove(jo, "downloadurl");
		JSONObjectHelper.remove(jo, "code");
		JSONObjectHelper.remove(jo, "bcode");
		JSONObjectHelper.remove(jo, "content");

		if (this.getRetCode() != Errors.OK) {
			if (StringHelper.isNullOrEmpty(this.strErrorInfo)) {
				this.strErrorInfo = jo.optString("errorMessage", null);
			}
		}

		JSONObjectHelper.remove(jo, "errorMessage");

		this.extInfo = null;
		java.util.Iterator keys = jo.keys();
		if (keys != null) {
			while (keys.hasNext()) {
				if (this.extInfo == null) {
					this.extInfo = new JSONObject();
				}
				Object objkey = keys.next();
				Object objValue = jo.get((String) objkey);
				this.extInfo.put((String) objkey, objValue);
			}
		}
	}
}
