package net.ibizsys.paas.util;

import java.util.HashMap;

import net.ibizsys.paas.appmodel.AppModelGlobal;
import net.ibizsys.paas.appmodel.IApplicationModel;
import net.ibizsys.paas.codelist.ICodeList;
import net.ibizsys.paas.core.IApplication;
import net.ibizsys.paas.core.ISystem;
import net.ibizsys.paas.service.ServiceGlobal;
import net.ibizsys.paas.sysmodel.CodeListGlobal;
import net.ibizsys.paas.sysmodel.ICodeListModel;
import net.ibizsys.paas.sysmodel.ISystemModel;
import net.ibizsys.paas.sysmodel.SysModelGlobal;
import net.ibizsys.psrt.srv.common.entity.CodeList;
import net.ibizsys.psrt.srv.common.service.CodeListService;

/**
 * 系统运行辅助对象
 * 
 * @author Administrator
 *
 */
public class SystemRTHelper {
	public static void installAll() throws Exception {
		installCodeList();
		installSystem();
		installApplication();
	}

	/**
	 * 安装代码表
	 * 
	 * @throws Exception
	 */
	public static void installCodeList() throws Exception {
		CodeListService codeListService = (CodeListService) ServiceGlobal.getService(CodeListService.class);
		HashMap<String, ICodeList> codeListMap = new HashMap<String, ICodeList>();
		java.util.Iterator<ICodeList> codeLists = CodeListGlobal.getAllCodelists();
		while (codeLists.hasNext()) {
			ICodeListModel iCodeListModel = (ICodeListModel) codeLists.next();
			if (codeListMap.containsKey(iCodeListModel.getId())) continue;
			codeListMap.put(iCodeListModel.getId(), iCodeListModel);
			if (StringHelper.compare(iCodeListModel.getCodeListType(), ICodeList.CLTYPE_DYNAMIC, true) == 0) {
				CodeList codeList = new CodeList();
				codeList.setCodeListId(iCodeListModel.getId());
				codeList.setCodeListName(iCodeListModel.getName());
				codeList.setCLVersion(1);
				codeList.setIsSystem(0);
				codeListService.save(codeList);
			}
		}

	}

	/**
	 * 安装系统
	 * 
	 * @throws Exception
	 */
	public static void installSystem() throws Exception {

		// 安装各系统
		java.util.Iterator<ISystem> sysIt = SysModelGlobal.getAllSystems();
		while (sysIt.hasNext()) {
			ISystemModel iSystemModel = (ISystemModel) sysIt.next();
			iSystemModel.installRTDatas();
		}
	}

	/**
	 * 安装应用程序
	 * 
	 * @throws Exception
	 */
	public static void installApplication() throws Exception {

		// 安装各应用
		java.util.Iterator<IApplication> apps = AppModelGlobal.getAllApplications();
		while (apps.hasNext()) {
			IApplicationModel iAppModel = (IApplicationModel) apps.next();
			iAppModel.installRTDatas();
		}
	}

}
