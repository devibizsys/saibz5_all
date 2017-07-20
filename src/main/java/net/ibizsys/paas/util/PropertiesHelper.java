package net.ibizsys.paas.util;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.Properties;

/**
 * 属性配置辅助对象
 * 
 * @author Administrator
 *
 */
public class PropertiesHelper {
	/**
	 * 加载属性参数配置
	 * 
	 * @param strProperty
	 * @return
	 * @throws Exception
	 */
	public static Properties load(String strProperty) throws Exception {
		return load(null, strProperty);
	}

	/**
	 * 加载属性参数配置
	 * 
	 * @param properties
	 * @param strProperty
	 * @return
	 * @throws Exception
	 */
	public static Properties load(Properties properties, String strProperty) throws Exception {
		if (properties == null) properties = new Properties();

		// properties.load(new StringReader(strProperty));

		InputStream inputStream = new ByteArrayInputStream(strProperty.getBytes("utf8"));
		properties.load(inputStream);

		return properties;
	}

	/**
	 * 获取属性值
	 * 
	 * @param properties
	 * @param strName
	 * @param bDefault
	 * @return
	 */
	public static boolean getProperty(Properties properties, String strName, boolean bDefault) {
		String strValue = getProperty(properties, strName, null);
		if (strValue == null) return bDefault;

		try {
			return Boolean.parseBoolean(strValue);
		} catch (Exception ex) {
			ex.printStackTrace();
			return bDefault;
		}
	}

	/**
	 * 获取属性值
	 * 
	 * @param properties
	 * @param strName
	 * @param nDefault
	 * @return
	 */
	public static int getProperty(Properties properties, String strName, int nDefault) {
		String strValue = getProperty(properties, strName, null);
		if (strValue == null) return nDefault;

		try {
			return Integer.parseInt(strValue);
		} catch (Exception ex) {
			ex.printStackTrace();
			return nDefault;
		}
	}

	/**
	 * 获取属性值
	 * 
	 * @param properties
	 * @param strName
	 * @param fDefault
	 * @return
	 */
	public static float getProperty(Properties properties, String strName, float fDefault) {
		String strValue = getProperty(properties, strName, null);
		if (strValue == null) return fDefault;

		try {
			return Float.parseFloat(strValue);
		} catch (Exception ex) {
			ex.printStackTrace();
			return fDefault;
		}
	}

	/**
	 * 获取属性值
	 * 
	 * @param properties
	 * @param strName
	 * @param fDefault
	 * @return
	 */
	public static double getProperty(Properties properties, String strName, double fDefault) {
		String strValue = getProperty(properties, strName, null);
		if (strValue == null) return fDefault;

		try {
			return Double.parseDouble(strValue);
		} catch (Exception ex) {
			ex.printStackTrace();
			return fDefault;
		}
	}

	/**
	 * 获取属性值
	 * 
	 * @param properties
	 * @param strName
	 * @param strDefault
	 * @return
	 */
	public static String getProperty(Properties properties, String strName, String strDefault) {
		if (properties == null) return strDefault;

		String strValue = properties.getProperty(strName, strDefault);
		if (strValue == null) return strValue;
		if (StringHelper.compare(strValue, strDefault, true) == 0) return strDefault;

		try {
			return new String(strValue.getBytes("ISO-8859-1"), "utf8");
		} catch (UnsupportedEncodingException e) {
			return strDefault;
		}

		// 1. String value =new String (properties.getProperty("zn").getBytes("ISO-8859-1"),"utf8");
		// return properties.getProperty(strName, strDefault);
	}

	/**
	 * 获取属性值
	 * 
	 * @param properties
	 * @param strName
	 * @return
	 */
	public static String getProperty(Properties properties, String strName) {
		if (properties == null) return null;

		try {
			String strValue = properties.getProperty(strName);
			if (strValue == null) {
				strName = new String(strName.getBytes("utf8"), "ISO-8859-1");
				strValue = properties.getProperty(strName);
			}
			if (strValue == null) return strValue;

			return new String(strValue.getBytes("ISO-8859-1"), "utf8");
		} catch (UnsupportedEncodingException e) {
			return null;
		}
	}

}
