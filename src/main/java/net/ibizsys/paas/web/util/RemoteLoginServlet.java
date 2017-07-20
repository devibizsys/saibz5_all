package net.ibizsys.paas.web.util;

import java.util.HashMap;

import net.ibizsys.paas.core.Errors;
import net.ibizsys.paas.security.RemoteLoginGlobal;
import net.ibizsys.paas.service.ServiceGlobal;
import net.ibizsys.paas.util.KeyValueHelper;
import net.ibizsys.paas.util.StringHelper;
import net.ibizsys.paas.web.AjaxActionResult;
import net.ibizsys.paas.web.HttpServletBase;
import net.ibizsys.paas.web.SDAjaxActionResult;
import net.ibizsys.paas.web.WebContext;
import net.ibizsys.psrt.srv.common.entity.LoginAccount;
import net.ibizsys.psrt.srv.common.entity.LoginLog;
import net.ibizsys.psrt.srv.common.service.LoginAccountService;
import net.ibizsys.psrt.srv.common.service.LoginLogService;
import net.sf.json.JSONObject;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * 远程登录
 * 
 * @author Administrator
 * 
 */
public class RemoteLoginServlet extends HttpServletBase {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static final Log log = LogFactory.getLog(RemoteLoginServlet.class);

	private HashMap<String, Integer> loginFaildMap = new HashMap<String, Integer>();
	private HashMap<String, Long> loginFaildTimeMap = new HashMap<String, Long>();

	/**
	 * 获取指定账户及地址登录失败次数
	 * 
	 * @param 登录名称
	 * @param 远程登录地址
	 * @return
	 */
	protected int getLoginFailedCount(String strLoginName, String strRemoteAddr) {
		synchronized (loginFaildMap) {
			Integer nCount = loginFaildMap.get(strRemoteAddr);
			if (nCount == null) return 0;

			if (nCount >= 3) {
				long nLastTime = loginFaildTimeMap.get(strRemoteAddr);
				if (System.currentTimeMillis() - nLastTime >= 60000) {
					loginFaildTimeMap.remove(strRemoteAddr);
					loginFaildMap.remove(strRemoteAddr);
					return 0;
				}
			}

			return nCount;
		}
	}

	/**
	 * 增加登录失败次数
	 * 
	 * @param 登录名称
	 * @param 远程登录地址
	 * @return 当前失败次数
	 */
	protected int addLoginFailedCount(String strLoginName, String strRemoteAddr) {
		synchronized (loginFaildMap) {
			Integer nCount = loginFaildMap.get(strRemoteAddr);
			if (nCount == null) nCount = 0;
			nCount += 1;
			loginFaildMap.put(strRemoteAddr, nCount);
			loginFaildTimeMap.put(strRemoteAddr, System.currentTimeMillis());
			return nCount;
		}
	}

	/**
	 * 重置登录失败次数
	 * 
	 * @return
	 */
	protected void resetLoginFailedCount(String strLoginName, String strRemoteAddr) {
		synchronized (loginFaildMap) {
			loginFaildMap.remove(strRemoteAddr);
			loginFaildTimeMap.remove(strRemoteAddr);

		}
	}

	@Override
	protected AjaxActionResult onProcessAction() throws Exception {
		SDAjaxActionResult ajaxActionResult = new SDAjaxActionResult();

		String strLoginName = this.getWebContext().getPostOrParamValue("username");
		String strPassword = this.getWebContext().getPostOrParamValue("password");
		String strRemoteAddr = this.getWebContext().getRemoteAddr();

		try {
			int nFailedCount = getLoginFailedCount(strLoginName, strRemoteAddr);
			if (nFailedCount >= 3) {
				ajaxActionResult.setRetCode(Errors.ACCESSDENY);
				ajaxActionResult.setErrorInfo("登录失败次数超过3次，临时限制登录60秒");
				return ajaxActionResult;
			}

			if (StringHelper.isNullOrEmpty(strLoginName)) {
				ajaxActionResult.setRetCode(Errors.INPUTERROR);
				ajaxActionResult.setErrorInfo("登录帐户或密码不正确，清重新输入");
				return ajaxActionResult;
			}

			LoginAccountService loginAccountService = (LoginAccountService) ServiceGlobal.getService(LoginAccountService.class);
			LoginAccount loginAccount = new LoginAccount();
			loginAccount.setLoginAccountName(strLoginName.toLowerCase());
			if (!loginAccountService.select(loginAccount, true)) {
				ajaxActionResult.setRetCode(Errors.INPUTERROR);
				ajaxActionResult.setErrorInfo("登录帐户或密码不正确，清重新输入");
				addLoginFailedCount(strLoginName, strRemoteAddr);
				return ajaxActionResult;
			}

			String strPassword2 = KeyValueHelper.genUniqueId(strLoginName.toLowerCase(), strPassword);
			if (StringHelper.compare(strPassword2, loginAccount.getPwd(), false) != 0) {
				ajaxActionResult.setRetCode(Errors.INPUTERROR);
				ajaxActionResult.setErrorInfo("登录帐户或密码不正确，清重新输入");
				addLoginFailedCount(strLoginName, strRemoteAddr);
				return ajaxActionResult;
			}

			resetLoginFailedCount(strLoginName, strRemoteAddr);

			LoginLog loginLog = new LoginLog();
			loginLog.setIpAddress(strRemoteAddr);
			loginLog.setLoginAccountId(loginAccount.getLoginAccountId());
			loginLog.setLoginAccountName(loginAccount.getLoginAccountName());
			loginLog.setLoginLogName(loginAccount.getLoginAccountName());
			loginLog.setLoginTime(new java.sql.Timestamp(System.currentTimeMillis()));
			loginLog.setIpAddress(strRemoteAddr);
			loginLog.setUserAgent(this.getWebContext().getUserAgent());

			LoginLogService loginLogService = (LoginLogService) ServiceGlobal.getService(LoginLogService.class);
			loginLogService.create(loginLog);

			loginLog.set("userid", loginAccount.getUserId());
			loginLog.set("username", loginAccount.getUserName());

			JSONObject data = ajaxActionResult.getData(true);
			data.put("loginkey", loginLog.getLoginLogId());
			data.put("userid", loginAccount.getUserId());
			data.put("username", loginAccount.getUserName());
			data.put("usermode", "");
			data.put("loginname", strLoginName);
			data.put("language", loginAccount.getLanguage());

			RemoteLoginGlobal.setUserLoginLog(loginAccount.getUserId(), loginLog);
			
			WebContext.fillByLoginAccount(this.getWebContext(), loginAccount);

			return ajaxActionResult;

		} catch (Exception ex) {
			log.error(StringHelper.format("处理远程登录发生异常，%1$s", ex.getMessage()), ex);
			ajaxActionResult.setRetCode(Errors.INTERNALERROR);
			ajaxActionResult.setErrorInfo("系统内部发生错误");
			return ajaxActionResult;
		}

	}

}
