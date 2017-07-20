package net.ibizsys.paas.web.util;

import net.ibizsys.paas.core.Errors;
import net.ibizsys.paas.service.ServiceGlobal;
import net.ibizsys.paas.util.KeyValueHelper;
import net.ibizsys.paas.util.StringHelper;
import net.ibizsys.paas.web.AjaxActionResult;
import net.ibizsys.paas.web.HttpServletBase;
import net.ibizsys.psrt.srv.common.entity.LoginAccount;
import net.ibizsys.psrt.srv.common.entity.OrgUser;
import net.ibizsys.psrt.srv.common.service.LoginAccountService;
import net.ibizsys.psrt.srv.common.service.OrgUserService;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * 远程登录Servlet
 * 
 * @author Administrator
 *
 */
public class LoginServlet extends HttpServletBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final Log log = LogFactory.getLog(LoginServlet.class);

	@Override
	protected AjaxActionResult onProcessAction() throws Exception {
		AjaxActionResult ajaxActionResult = new AjaxActionResult();

		String strLoginName = this.getWebContext().getPostValue("loginname");
		String strPassword = this.getWebContext().getPostValue("pwd");

		if (!StringHelper.isNullOrEmpty(strLoginName)) strLoginName = strLoginName.trim();
		if (!StringHelper.isNullOrEmpty(strPassword)) strPassword = strPassword.trim();
		if (StringHelper.isNullOrEmpty(strLoginName)) {
			ajaxActionResult.setRetCode(Errors.INPUTERROR);
			ajaxActionResult.setErrorInfo("登录帐户不能为空");
			return ajaxActionResult;
		}

		if (StringHelper.isNullOrEmpty(strPassword)) {
			ajaxActionResult.setRetCode(Errors.INPUTERROR);
			ajaxActionResult.setErrorInfo("登录密码不能为空");
			return ajaxActionResult;
		}

		try {
			LoginAccountService loginAccountService = (LoginAccountService) ServiceGlobal.getService(LoginAccountService.class);
			LoginAccount loginAccount = new LoginAccount();
			loginAccount.setLoginAccountName(strLoginName.toLowerCase());
			if (!loginAccountService.select(loginAccount, true)) {
				ajaxActionResult.setRetCode(Errors.INVALIDDATA);
				ajaxActionResult.setErrorInfo("登录帐户或密码不正确");
				return ajaxActionResult;
			}

			String strPassword2 = KeyValueHelper.genUniqueId(strLoginName.toLowerCase(), strPassword);
			if (StringHelper.compare(strPassword2, loginAccount.getPwd(), false) != 0) {
				ajaxActionResult.setRetCode(Errors.INVALIDDATA);
				ajaxActionResult.setErrorInfo("登录帐户或密码不正确");
				return ajaxActionResult;
			}

			// 登录成功
			this.getWebContext().logout(true);

			net.ibizsys.paas.web.WebContext.fillByLoginAccount(this.getWebContext(), loginAccount);

			// 尝试获取组织用户
			OrgUser orgUser = new OrgUser();
			orgUser.setOrgUserId(loginAccount.getUserId());
			OrgUserService orgUserService = (OrgUserService) ServiceGlobal.getService(OrgUserService.class);
			if (orgUserService.get(orgUser, true)) {
				net.ibizsys.paas.web.WebContext.fillByOrgUser(this.getWebContext(), orgUser);
			}

			this.getWebContext().login(strLoginName);
			return ajaxActionResult;

		} catch (Exception ex) {
			ajaxActionResult.setRetCode(Errors.INTERNALERROR);
			ajaxActionResult.setErrorInfo(ex.getMessage());
			log.error(ex);
			return ajaxActionResult;
		}

	}

}
