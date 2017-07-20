package net.ibizsys.paas.appmodel.angularjs;

import net.ibizsys.paas.appmodel.AppPFHelperBase;
import net.ibizsys.paas.appmodel.IAppViewModel;
import net.ibizsys.paas.util.StringHelper;
import net.sf.json.JSONObject;

/**
 * AngularJS应用模型辅助对象
 * 
 * @author Administrator
 *
 */
public class NGAppPFHelper extends AppPFHelperBase {

	@Override
	protected void onFillAppViewJSONObject(IAppViewModel iAppViewModel, JSONObject jsonObj) throws Exception {
		jsonObj.put("viewurl", StringHelper.format("/%1$s/%2$s.jsp", iAppViewModel.getModuleName(), iAppViewModel.getName()).toLowerCase());
		if (iAppViewModel.getWidth() > 0) jsonObj.put("width", iAppViewModel.getWidth());
		if (iAppViewModel.getHeight() > 0) jsonObj.put("height", iAppViewModel.getHeight());
		jsonObj.put("title", iAppViewModel.getTitle());
		if (!StringHelper.isNullOrEmpty(iAppViewModel.getOpenMode())) {
			jsonObj.put("openMode", iAppViewModel.getOpenMode());
		}
	}

	@Override
	protected String mapRealAppUrl(String strUrl) throws Exception {
		return "../../" + strUrl;
	}

}
