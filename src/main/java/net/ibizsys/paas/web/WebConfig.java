package net.ibizsys.paas.web;

import java.util.Enumeration;
import java.util.HashMap;

import javax.servlet.FilterConfig;

/**
 * WEB应用程序配置 配置对象
 * 
 * @author Administrator
 *
 */
public class WebConfig {
	
	private static WebConfig webConfig = null;
	protected HashMap<String, String> extAttrList = new HashMap<String, String>();

	/**
	 * 上下文参数
	 */
	public final static String WEBCONTEXT = "WEBCONTEXT";

	/**
	 * 临时路径
	 */
	public final static String TEMPPATH = "TEMPPATH";

	/**
	 * 文件存储路径
	 */
	public final static String FILEPATH = "FILEPATH";

	/**
	 * 后台服务容器
	 */
	public final static String SERVICECONTAINER = "SERVICECONTAINER";

	private String strWebContextObj = null;
	private String strFilePath = null;
	private String strTempPath = null;
	private String strServiceContainer = null;

	public WebConfig(FilterConfig config) {
		if(config != null){
			Enumeration enumeration = config.getInitParameterNames();
			while (enumeration.hasMoreElements()) {
				String strName = (String) enumeration.nextElement();
				String strValue = config.getInitParameter(strName);
				if (strValue != null) {
					extAttrList.put(strName.toUpperCase(), strValue);
				}
			}
			
			strWebContextObj = extAttrList.get(WEBCONTEXT);
			strFilePath = extAttrList.get(FILEPATH);
			strTempPath = extAttrList.get(TEMPPATH);
			strServiceContainer = extAttrList.get(SERVICECONTAINER);
		}
		
		WebConfig.webConfig = this;
	}

	/**
	 * 获取上下文对象
	 * 
	 * @return
	 */
	public String getWebContextObj() {
		return this.strWebContextObj;
	}

	/**
	 * 设置参数
	 * 
	 * @param strKey
	 * @param strDefault
	 * @return
	 */
	public String getAttribute(String strKey, String strDefault) {
		strKey = strKey.toUpperCase();
		String strValue = extAttrList.get(strKey);
		if(strValue==null){
			return strDefault;
		}
		return strValue;
//		if (extAttrList.containsKey(strKey)) {
//			return (String) extAttrList.get(strKey);
//		}
//		return strDefault;
	}

	/**
	 * 获取配置参数（INT）
	 * 
	 * @param strKey
	 * @param nDefault
	 * @return
	 */
	public int getAttribute(String strKey, int nDefault) {
		try {
			return Integer.parseInt(getAttribute(strKey, ((Integer) nDefault).toString()));
		} catch (Exception ex) {
			return nDefault;
		}
	}

	/**
	 * 获取配置参数（Long）
	 * 
	 * @param strKey
	 * @param nDefault
	 * @return
	 */
	public long getAttribute(String strKey, Long nDefault) {
		try {
			return Long.parseLong(getAttribute(strKey, nDefault.toString()));
		} catch (Exception ex) {
			return nDefault;
		}

	}

	/**
	 * 获取配置参数（boolean）
	 * 
	 * @param strKey
	 * @param bDefault
	 * @return
	 */
	public boolean getAttribute(String strKey, boolean bDefault) {
		try {
			return Boolean.parseBoolean(getAttribute(strKey, bDefault ? "True" : "False"));
		} catch (Exception ex) {
			return bDefault;
		}

	}

	/**
	 * 转换字符串到布尔值
	 * 
	 * @param strValue
	 * @param bDefault
	 * @return
	 */
	protected static boolean getValue(String strValue, boolean bDefault) {
		try {
			return Boolean.parseBoolean(strValue);
		} catch (Exception ex) {
			return bDefault;
		}

	}

	/**
	 * 转换字符串到Double
	 * 
	 * @param strValue
	 * @param fDefault
	 * @return
	 */
	protected static double getValue(String strValue, Double fDefault) {
		try {
			return Double.parseDouble(strValue);
		} catch (Exception ex) {
			return fDefault;
		}
	}

	/**
	 * 转换字符串到Int
	 * 
	 * @param strValue
	 * @param fDefault
	 * @return
	 */
	protected static int getValue(String strValue, int nDefault) {
		try {
			return Integer.parseInt(strValue);
		} catch (Exception ex) {
			return nDefault;
		}
	}

	/**
	 * 设置参数
	 * 
	 * @param strName
	 * @param strValue
	 */
	public void setAttribute(String strName, String strValue) {
		if (strValue != null) {
			extAttrList.put(strName.toUpperCase(), strValue);
		}
	}

	/**
	 * 获取当前应用WebP配置对象
	 * 
	 * @return
	 */
	public static WebConfig getCurrent() {
		return WebConfig.webConfig;
	}

	/**
	 * 获取临时文件路径
	 * 
	 * @return
	 */
	public String getTempPath() {
		return this.strTempPath;
	}

	/**
	 * 获取文件存储路径
	 * 
	 * @return
	 */
	public String getFilePath() {
		return strFilePath;
	}

	/**
	 * 获取后台服务容器
	 * 
	 * @return
	 */
	public String getServiceContainer() {
		return this.strServiceContainer;
	}

}
