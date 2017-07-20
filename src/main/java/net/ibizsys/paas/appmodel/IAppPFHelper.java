package net.ibizsys.paas.appmodel;

import net.sf.json.JSONObject;

/**
 * 应用框架辅助对象
 * 
 * @author Administrator
 *
 */
public interface IAppPFHelper {
	/**
	 * 初始化
	 * 
	 * @param iApplicationModel 应用模型
	 */
	void init(IApplicationModel iApplicationModel) throws Exception;

	/**
	 * 获取视图JSON对象
	 * 
	 * @param iAppViewModel 应用视图模型
	 * @return
	 * @throws Exception
	 */
	JSONObject getAppViewJSONObject(IAppViewModel iAppViewModel) throws Exception;

	/**
	 * 映射实际Url
	 * 
	 * @param strUrl /=WEB根;http://=绝对地址;目录=应用根目录，转换应用根目录
	 * @return
	 * @throws Exception
	 */
	String mapRealUrl(String strUrl) throws Exception;

	/**
	 * 映射实际图标Url 默认路径按照放在应用图标目录中进行
	 * 
	 * @param strUrl /=WEB根;http://=绝对地址;目录=应用根目录，转换应用根目录
	 * @return
	 * @throws Exception
	 */
	String mapImageRealUrl(String strImageUrl) throws Exception;
}
