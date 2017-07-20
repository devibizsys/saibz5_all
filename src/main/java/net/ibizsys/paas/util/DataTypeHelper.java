package net.ibizsys.paas.util;

import java.io.BufferedReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Clob;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.TreeMap;

import net.ibizsys.paas.core.DataTypes;
import net.ibizsys.paas.data.DataObjectList;
import net.ibizsys.paas.data.IDataObject;
import net.ibizsys.paas.data.ISimpleDataObject;
import net.ibizsys.paas.i18n.LanResTags;
import net.ibizsys.paas.logic.ICondition;
import net.ibizsys.paas.web.IWebContext;
import net.ibizsys.paas.web.WebContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * 数据类型辅助类
 * 
 * @author Administrator
 * 
 */
public class DataTypeHelper {
	private static final Log log = LogFactory.getLog(DataTypeHelper.class);

	protected static TreeMap<String, Integer> str2intMap = new TreeMap<String, Integer>();
	protected static TreeMap<Integer, String> int2strMap = new TreeMap<Integer, String>();

	static {
		str2intMap.put("BIGINT", DataTypes.BIGINT);
		str2intMap.put("BINARY", DataTypes.BINARY);
		str2intMap.put("BIT", DataTypes.BIT);
		str2intMap.put("CHAR", DataTypes.CHAR);

		str2intMap.put("DATETIME", DataTypes.DATETIME);
		str2intMap.put("DECIMAL", DataTypes.DECIMAL);
		str2intMap.put("FLOAT", DataTypes.FLOAT);
		str2intMap.put("IMAGE", DataTypes.IMAGE);
		str2intMap.put("INT", DataTypes.INT);
		str2intMap.put("MONEY", DataTypes.MONEY);
		str2intMap.put("NCHAR", DataTypes.NCHAR);
		str2intMap.put("NTEXT", DataTypes.NTEXT);
		str2intMap.put("NVARCHAR", DataTypes.NVARCHAR);
		str2intMap.put("NUMERIC", DataTypes.NUMERIC);
		str2intMap.put("REAL", DataTypes.REAL);
		str2intMap.put("SMALLDATETIME", DataTypes.SMALLDATETIME);
		str2intMap.put("SMALLINT", DataTypes.SMALLINT);
		str2intMap.put("SMALLMONEY", DataTypes.SMALLMONEY);
		str2intMap.put("SQL_VARIANT", DataTypes.SQL_VARIANT);
		str2intMap.put("SYSNAME", DataTypes.SYSNAME);
		str2intMap.put("TEXT", DataTypes.TEXT);
		str2intMap.put("TIMESTAMP", DataTypes.TIMESTAMP);
		str2intMap.put("TINYINT", DataTypes.TINYINT);
		str2intMap.put("VARBINARY", DataTypes.VARBINARY);
		str2intMap.put("VARCHAR", DataTypes.VARCHAR);
		str2intMap.put("UNIQUEIDENTIFIER", DataTypes.UNIQUEIDENTIFIER);
		str2intMap.put("DATE", DataTypes.DATE);
		str2intMap.put("TIME", DataTypes.TIME);
		// str2intMap.put("DATE", DataTypes.DATE);
		// str2intMap.put("DATE", DataTypes.DATE);
		// str2intMap.put("DATE", DataTypes.DATE);
		// str2intMap.put("DATE", DataTypes.DATE);
	}

	public DataTypeHelper() {
	}

	/**
	 * 解析文本值到实际值
	 * 
	 * @param strDataType
	 * @param strValue
	 * @return
	 * @throws Exception
	 */
	public static Object parse(String strDataType, String strValue) throws Exception {
		int nDataType = DataTypeHelper.fromString(strDataType);
		return parse(nDataType, strValue);
	}

	/**
	 * 解析文本值到实际值
	 * 
	 * @param dataType
	 * @param strValue
	 * @return
	 * @throws Exception
	 */
	public static Object parse(int dataType, String strValue) throws Exception {
		if (dataType == DataTypes.BIGINT || dataType == DataTypes.INT || dataType == DataTypes.SMALLINT) {
			return testBigInt(strValue);
		} else if (dataType == DataTypes.CHAR || dataType == DataTypes.NCHAR || dataType == DataTypes.NTEXT || dataType == DataTypes.NVARCHAR || dataType == DataTypes.SYSNAME || dataType == DataTypes.TEXT || dataType == DataTypes.VARCHAR) {
			return strValue;
		} else if (dataType == DataTypes.DATETIME || dataType == DataTypes.SMALLDATETIME) {
			return testDateTime(strValue);
		} else if (dataType == DataTypes.DATE) {
			return testDate(strValue);
		} else if (dataType == DataTypes.TIME) {
			return testTime(strValue);
		} else if (dataType == DataTypes.DECIMAL || dataType == DataTypes.MONEY || dataType == DataTypes.NUMERIC || dataType == DataTypes.SMALLMONEY || dataType == DataTypes.FLOAT || dataType == DataTypes.REAL) {
			return testDouble(strValue);
			// return testFloat(strValue);
		}
		/*
		 * else if (dataType == DataTypes.DECIMAL ) return testDecimal(strValue);
		 */

		// case DataTypes.FLOAT:
		// return testFloat(strValue);
		// case DataTypes.INT:
		// return testInteger(strValue);
		// case DataTypes.REAL:
		// return testFloat(strValue);
		/*
		 * case DataTypes.SMALLINT: return testInteger(strValue); case DataTypes.SQL_VARIANT: return null; case DataTypes.TIMESTAMP: return null; case DataTypes.TINYINT: return null; case DataTypes.VARBINARY: return null; case DataTypes.UNIQUEIDENTIFIER: return null; case DataTypes.BINARY: case DataTypes.IMAGE: return null; case DataTypes.BIT: return null;
		 * 
		 * default: return null;
		 */
		// }

		return null;

	}

	/**
	 * 解析为时间日期型
	 * 
	 * @param dataType
	 * @param strValue
	 * @param timeZone
	 * @return
	 */
	public static Object parseDateTime(int dataType, String strValue, TimeZone timeZone) throws Exception {
		if (dataType == DataTypes.DATETIME || dataType == DataTypes.SMALLDATETIME) {
			return testDateTime(strValue, timeZone);
		} else if (dataType == DataTypes.DATE) {
			return testDate(strValue, timeZone);
		} else if (dataType == DataTypes.TIME) {
			return testTime(strValue, timeZone);
		}

		return null;

	}

	/**
	 * 转换文本值到大整数值
	 * 
	 * @param strInput
	 * @return
	 * @throws Exception
	 */
	public static Object testBigInt(String strInput) throws Exception {
		return testInteger(strInput);
	}

	/**
	 * 转换文本值到文本值
	 * 
	 * @param strInput
	 * @return
	 * @throws Exception
	 */
	public static Object testString(String strInput) throws Exception {
		return strInput;
	}

	/**
	 * 转换文本值到整数值
	 * 
	 * @param strInput
	 * @return
	 * @throws Exception
	 */
	public static Object testInteger(String strInput) throws Exception {
		if (StringHelper.isNullOrEmpty(strInput)) return null;
		strInput = strInput.replace(",", "");

		int nValue = java.lang.Integer.parseInt(strInput);
		return nValue;
	}

	/**
	 * 转换文本值到大数值
	 * 
	 * @param strInput
	 * @return
	 * @throws Exception
	 */
	public static Object testDecimal(String strInput) throws Exception {
		if (StringHelper.isNullOrEmpty(strInput)) return null;
		Object objValue = testDouble(strInput);
		if (objValue != null) {
			return java.math.BigDecimal.valueOf((Double) objValue);
		}
		return null;
	}

	/**
	 * 转换文本值到Double
	 * 
	 * @param strInput
	 * @return
	 * @throws Exception
	 */
	public static Object testDouble(String strInput) throws Exception {
		if (StringHelper.isNullOrEmpty(strInput)) return null;
		strInput = strInput.replace(",", "");

		double fValue = java.lang.Double.parseDouble(strInput);
		return fValue;
	}

	/**
	 * 转换文本值到浮点
	 * 
	 * @param strInput
	 * @return
	 * @throws Exception
	 */
	public static Object testFloat(String strInput) throws Exception {
		if (StringHelper.isNullOrEmpty(strInput)) return null;
		strInput = strInput.replace(",", "");

		float fValue = java.lang.Float.parseFloat(strInput);
		return fValue;
	}

	/**
	 * 转换文本值到日期
	 * 
	 * @param strInput
	 * @param timeZone
	 * @return
	 * @throws Exception
	 */
	public static Object testDate(String strInput, TimeZone timeZone) throws Exception {
		if (StringHelper.isNullOrEmpty(strInput)) return null;
		Date dtDate = DateHelper.parse(strInput, timeZone);
		java.sql.Date retDate = new java.sql.Date(dtDate.getTime());
		return retDate;
	}

	/**
	 * 转换文本值到日期
	 * 
	 * @param strInput
	 * @return
	 * @throws Exception
	 */
	public static Object testDate(String strInput) throws Exception {
		return testDate(strInput, null);
	}

	/**
	 * 转换文本值到时间
	 * 
	 * @param strInput
	 * @return
	 * @throws Exception
	 */
	public static Object testTime(String strInput) throws Exception {
		return testTime(strInput, null);

	}

	/**
	 * 转换文本值到时间
	 * 
	 * @param strInput
	 * @param timeZone
	 * @return
	 * @throws Exception
	 */
	public static Object testTime(String strInput, TimeZone timeZone) throws Exception {
		if (StringHelper.isNullOrEmpty(strInput)) return null;
		Date dtDate = DateHelper.parse(strInput, timeZone);
		/*
		 * DateFormat dtFormat = new SimpleDateFormat( "yyyy-MM-dd HH:mm:ss"); Date dtDate = dtFormat.parse(strInput);
		 */
		java.sql.Time retTime = new java.sql.Time(dtDate.getTime());
		return retTime;
	}

	/**
	 * 转换文本值到日期时间
	 * 
	 * @param strInput
	 * @return
	 * @throws Exception
	 */
	public static Object testDateTime(String strInput) throws Exception {
		return testDateTime(strInput, null);
	}

	/**
	 * 转换文本值到日期时间
	 * 
	 * @param strInput
	 * @param timeZone
	 * @return
	 * @throws Exception
	 */
	public static Object testDateTime(String strInput, TimeZone timeZone) throws Exception {
		if (StringHelper.isNullOrEmpty(strInput)) return null;
		Date dtDate = DateHelper.parse(strInput, timeZone);
		java.sql.Timestamp retDate = new java.sql.Timestamp(dtDate.getTime());
		return retDate;
	}

	/**
	 * 检查对象长度是否符合要求
	 * 
	 * @param dataType
	 * @param objValue
	 * @param nLen
	 * @return
	 */
	public static boolean checkLen(int dataType, Object objValue, int nLen) {
		if (objValue == null) {
			return false;
		}

		if (nLen <= 0) {
			return true;
		}

		if (dataType == DataTypes.CHAR || dataType == DataTypes.NCHAR || dataType == DataTypes.NTEXT || dataType == DataTypes.NVARCHAR || dataType == DataTypes.SYSNAME || dataType == DataTypes.TEXT || dataType == DataTypes.VARCHAR) {
			return (objValue.toString().length() <= nLen);
		}
		return true;
	}

	/**
	 * 小于对比
	 * 
	 * @param dataType
	 * @param objValueFrom
	 * @param objValueTo
	 * @return
	 */
	public static boolean lessThan(int dataType, Object objValueFrom, Object objValueTo) {
		long nRet = compare(dataType, objValueFrom, objValueTo);
		if (nRet <= 0) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * 对比2个对象值
	 * 
	 * @param strDataType
	 * @param objValue
	 * @param objValueCompare
	 * @return
	 */
	public static long compare(String strDataType, Object objValue, Object objValueCompare) {
		return compare(DataTypeHelper.fromString(strDataType), objValue, objValueCompare);
	}

	/**
	 * 对比2个对象值
	 * 
	 * @param dataType
	 * @param objValue
	 * @param objValueCompare
	 * @return
	 */
	public static long compare(int dataType, Object objValue, Object objValueCompare) {
		Integer nValue;
		Integer nValueCompare;
		Double fValue;
		Double fValueCompare;

		if (objValue == null || objValueCompare == null) {
			if (objValue == null && objValueCompare == null) return 0;
			if (objValue == null)
				return 1;
			else
				return -1;
		}

		long nTemp = 0;

		if (dataType == DataTypes.BIGINT || dataType == DataTypes.INT || dataType == DataTypes.SMALLINT) {
			if (!(objValue instanceof Integer)) {
				nValue = Integer.parseInt(objValue.toString());
			} else
				nValue = (Integer) objValue;

			if (!(objValueCompare instanceof Integer)) {
				nValueCompare = Integer.parseInt(objValueCompare.toString());
			} else
				nValueCompare = (Integer) objValueCompare;

			nTemp = nValue - nValueCompare;

		} else if (dataType == DataTypes.DATETIME || dataType == DataTypes.SMALLDATETIME || dataType == DataTypes.DATE || dataType == DataTypes.TIME) {
			long nTime1 = getDateObjectTime(objValue);
			long nTime2 = getDateObjectTime(objValueCompare);
			nTemp = nTime1 - nTime2;
		} else

		if (dataType == DataTypes.DECIMAL || dataType == DataTypes.MONEY || dataType == DataTypes.NUMERIC || dataType == DataTypes.SMALLMONEY || dataType == DataTypes.FLOAT || dataType == DataTypes.REAL) {
			if (!(objValue instanceof Double)) {
				fValue = Double.parseDouble(objValue.toString());
			} else
				fValue = (Double) objValue;

			if (!(objValueCompare instanceof Double)) {
				fValueCompare = Double.parseDouble(objValueCompare.toString());
			} else
				fValueCompare = (Double) objValueCompare;

			double fTemp = fValue - fValueCompare;
			if (fTemp == 0) {
				nTemp = 0;
			} else if (fTemp > 0) {
				nTemp = 1;
			} else {
				nTemp = -1;
			}
		} else if (dataType == DataTypes.CHAR || dataType == DataTypes.NCHAR || dataType == DataTypes.NTEXT || dataType == DataTypes.NVARCHAR || dataType == DataTypes.SYSNAME || dataType == DataTypes.TEXT || dataType == DataTypes.VARCHAR) {
			nTemp = objValue.toString().compareTo(objValueCompare.toString());
		}

		if (nTemp == 0) {
			return 0;
		} else if (nTemp > 0) {
			return 1;
		} else {
			return -1;
		}

	}

	/**
	 * 判断是否为字符串的数据类型
	 * 
	 * @param dataType
	 * @return
	 */
	public static boolean isStringDataType(int dataType) {
		switch (dataType) {
		case DataTypes.CHAR:
		case DataTypes.NCHAR:
		case DataTypes.NTEXT:
		case DataTypes.NVARCHAR:
		case DataTypes.SYSNAME:
		case DataTypes.TEXT:
		case DataTypes.VARCHAR:

			return true;
		default:
			return false;

		}
	}

	/**
	 * 是否为时间相关类型
	 * 
	 * @param dataType
	 * @return
	 */
	public static boolean isDateTimeDataType(int dataType) {
		switch (dataType) {
		case DataTypes.DATE:
		case DataTypes.DATETIME:
		case DataTypes.SMALLDATETIME:
		case DataTypes.TIME:
		case DataTypes.TIMESTAMP:
			return true;
		default:
			return false;
		}
	}

	/**
	 * 获取时间对象Long值
	 * 
	 * @param obj
	 * @return
	 */
	public static long getDateObjectTime(Object obj) {
		if (obj instanceof java.sql.Time) {
			return ((java.sql.Time) obj).getTime();
		}

		if (obj instanceof java.sql.Date) {
			return ((java.sql.Date) obj).getTime();
		}

		if (obj instanceof java.sql.Timestamp) {
			return ((java.sql.Timestamp) obj).getTime();
		}

		if (obj instanceof java.util.Date) {
			return ((java.util.Date) obj).getTime();
		}

		return -1;
	}

	/**
	 * 是否存在指定数据类型
	 * 
	 * @param strValue
	 * @return
	 */
	final public static boolean isContainsDataType(String strValue) {
		strValue = strValue.toUpperCase();
		return str2intMap.containsKey(strValue);
	}

	/**
	 * 将文本类型转换为数值
	 * 
	 * @param strValue
	 * @return
	 */
	final public static int fromString(String strValue) {
		strValue = strValue.toUpperCase();
		if (str2intMap.containsKey(strValue))
			return str2intMap.get(strValue);
		else

			return DataTypes.VARCHAR;

		/*
		 * if (strValue.compareToIgnoreCase("BIGINT") == 0) { return DataTypes.BIGINT; }
		 * 
		 * if (strValue.compareToIgnoreCase("BINARY") == 0) { return DataTypes.BINARY; }
		 * 
		 * if (strValue.compareToIgnoreCase("BIT") == 0) { return DataTypes.BIT; }
		 * 
		 * if (strValue.compareToIgnoreCase("CHAR") == 0) { return DataTypes.CHAR; }
		 * 
		 * if (strValue.compareToIgnoreCase("DATETIME") == 0) { return DataTypes.DATETIME; }
		 * 
		 * if (strValue.compareToIgnoreCase("DECIMAL") == 0) { return DataTypes.DECIMAL; }
		 * 
		 * if (strValue.compareToIgnoreCase("FLOAT") == 0) { return DataTypes.FLOAT; }
		 * 
		 * if (strValue.compareToIgnoreCase("IMAGE") == 0) { return DataTypes.IMAGE; }
		 * 
		 * if (strValue.compareToIgnoreCase("INT") == 0) { return DataTypes.INT; }
		 * 
		 * if (strValue.compareToIgnoreCase("MONEY") == 0) { return DataTypes.MONEY; }
		 * 
		 * if (strValue.compareToIgnoreCase("NCHAR") == 0) { return DataTypes.NCHAR; }
		 * 
		 * if (strValue.compareToIgnoreCase("NTEXT") == 0) { return DataTypes.NTEXT; }
		 * 
		 * if (strValue.compareToIgnoreCase("NVARCHAR") == 0) { return DataTypes.NVARCHAR; }
		 * 
		 * if (strValue.compareToIgnoreCase("NUMERIC") == 0) { return DataTypes.NUMERIC; }
		 * 
		 * if (strValue.compareToIgnoreCase("REAL") == 0) { return DataTypes.REAL; }
		 * 
		 * if (strValue.compareToIgnoreCase("SMALLDATETIME") == 0) { return DataTypes.SMALLDATETIME; }
		 * 
		 * if (strValue.compareToIgnoreCase("SMALLINT") == 0) { return DataTypes.SMALLINT; }
		 * 
		 * if (strValue.compareToIgnoreCase("SMALLMONEY") == 0) { return DataTypes.SMALLMONEY; }
		 * 
		 * if (strValue.compareToIgnoreCase("SQL_VARIANT") == 0) { return DataTypes.SQL_VARIANT; }
		 * 
		 * if (strValue.compareToIgnoreCase("SYSNAME") == 0) { return DataTypes.SYSNAME; }
		 * 
		 * if (strValue.compareToIgnoreCase("TEXT") == 0) { return DataTypes.TEXT; }
		 * 
		 * if (strValue.compareToIgnoreCase("TIMESTAMP") == 0) { return DataTypes.TIMESTAMP; }
		 * 
		 * if (strValue.compareToIgnoreCase("TINYINT") == 0) { return DataTypes.TINYINT; }
		 * 
		 * if (strValue.compareToIgnoreCase("VARBINARY") == 0) { return DataTypes.VARBINARY; }
		 * 
		 * if (strValue.compareToIgnoreCase("VARCHAR") == 0) { return DataTypes.VARCHAR; }
		 * 
		 * if (strValue.compareToIgnoreCase("UNIQUEIDENTIFIER") == 0) { return DataTypes.UNIQUEIDENTIFIER; }
		 * 
		 * if (strValue.compareToIgnoreCase("DATE") == 0) { return DataTypes.DATE; }
		 * 
		 * if (strValue.compareToIgnoreCase("TIME") == 0) { return DataTypes.TIME; }
		 */
	}

	/**
	 * 判断是否为字符串类型
	 * 
	 * @param dataType
	 * @return
	 */
	public final static boolean isStringType(int dataType) {
		return (dataType == DataTypes.CHAR || dataType == DataTypes.NCHAR || dataType == DataTypes.NTEXT || dataType == DataTypes.NVARCHAR || dataType == DataTypes.SYSNAME || dataType == DataTypes.TEXT || dataType == DataTypes.VARCHAR);
	}

	/**
	 * 判断是否为字符串类型
	 * 
	 * @param dataType
	 * @return
	 */
	public final static boolean isStringType(String strDataType) {
		return isStringType(fromString(strDataType));
	}

	/**
	 * 是否为长字符串类型
	 * 
	 * @param dataType
	 * @return
	 */
	public final static boolean isLongStringType(int dataType) {
		return (dataType == DataTypes.IMAGE || dataType == DataTypes.NTEXT || dataType == DataTypes.NVARCHAR || dataType == DataTypes.TEXT);
	}

	/**
	 * 判断是否为时间日期类型
	 * 
	 * @param dataType
	 * @return
	 */
	public final static boolean isDateTimeType(int dataType) {
		return (dataType == DataTypes.DATETIME || dataType == DataTypes.SMALLDATETIME || dataType == DataTypes.DATE || dataType == DataTypes.TIME);
	}

	/**
	 * 判断是否为时间日期类型
	 * 
	 * @param strDataType
	 * @return
	 */
	public final static boolean isDateTimeType(String strDataType) {
		return isDateTimeType(fromString(strDataType));
	}

	/**
	 * 是否为整形
	 * 
	 * @param dataType
	 * @return
	 */
	public final static boolean isIntType(int dataType) {
		return (dataType == DataTypes.INT || dataType == DataTypes.SMALLINT);
	}

	/**
	 * 是否为整数类型
	 * 
	 * @param strDataType
	 * @return
	 */
	public final static boolean isIntType(String strDataType) {
		return isIntType(fromString(strDataType));
	}

	/**
	 * 是否为DOuble
	 * 
	 * @param dataType
	 * @return
	 */
	public final static boolean isDoubleType(int dataType) {
		return (dataType == DataTypes.FLOAT || dataType == DataTypes.DECIMAL);
	}

	/**
	 * 获取类型名称
	 * 
	 * @param strDataType
	 * @return
	 */
	public static String getTypeName(String strDataType) {
		return getTypeName(fromString(strDataType));
	}

	/**
	 * 获取值的类型名称
	 * 
	 * @param dataType
	 * @return
	 */
	public static String getTypeName(int dataType) {

		if (dataType == DataTypes.BIGINT || dataType == DataTypes.INT || dataType == DataTypes.SMALLINT) {
			return "整数型";
		} else if (dataType == DataTypes.CHAR || dataType == DataTypes.NCHAR || dataType == DataTypes.NTEXT || dataType == DataTypes.NVARCHAR || dataType == DataTypes.SYSNAME || dataType == DataTypes.TEXT || dataType == DataTypes.VARCHAR) {
			return "字符型";
		} else if (dataType == DataTypes.DATETIME || dataType == DataTypes.SMALLDATETIME) {
			return "日期时间型";
		} else if (dataType == DataTypes.DATE) {
			return "日期型";
		} else if (dataType == DataTypes.TIME) {
			return "时间型";
		} else if (dataType == DataTypes.DECIMAL || dataType == DataTypes.MONEY || dataType == DataTypes.NUMERIC || dataType == DataTypes.SMALLMONEY || dataType == DataTypes.FLOAT || dataType == DataTypes.REAL) {
			return "数值型";
		}

		return "未知类型";

	}

	/**
	 * 获取值的类型名称
	 * 
	 * @param dataType
	 * @param local 本地化
	 * @return
	 */
	public static String getTypeName(int dataType, Locale local) {

		IWebContext iWebContext = WebContext.getCurrent();
		if (iWebContext != null) {
			if (dataType == DataTypes.BIGINT || dataType == DataTypes.INT || dataType == DataTypes.SMALLINT) {
				return iWebContext.getLocalization(LanResTags.COMMON_DATATYPE_INTEGER, "整数型");
			} else if (dataType == DataTypes.CHAR || dataType == DataTypes.NCHAR || dataType == DataTypes.NTEXT || dataType == DataTypes.NVARCHAR || dataType == DataTypes.SYSNAME || dataType == DataTypes.TEXT || dataType == DataTypes.VARCHAR) {
				return iWebContext.getLocalization(LanResTags.COMMON_DATATYPE_CHAR, "字符型");
			} else if (dataType == DataTypes.DATETIME || dataType == DataTypes.SMALLDATETIME) {
				return iWebContext.getLocalization(LanResTags.COMMON_DATATYPE_DATETIME, "日期时间型");
			} else if (dataType == DataTypes.DATE) {
				return iWebContext.getLocalization(LanResTags.COMMON_DATATYPE_DATE, "日期型");
			} else if (dataType == DataTypes.TIME) {
				return iWebContext.getLocalization(LanResTags.COMMON_DATATYPE_TIME, "时间型");
			} else if (dataType == DataTypes.DECIMAL || dataType == DataTypes.MONEY || dataType == DataTypes.NUMERIC || dataType == DataTypes.SMALLMONEY || dataType == DataTypes.FLOAT || dataType == DataTypes.REAL) {
				return iWebContext.getLocalization(LanResTags.COMMON_DATATYPE_DECIMAL, "数值型");
			}

			return iWebContext.getLocalization(LanResTags.COMMON_DATATYPE_UNKNOWN, "未知类型");
		}
		return getTypeName(dataType);

	}

	/**
	 * 获取对象的数据类型
	 * 
	 * @param objValue
	 * @return
	 */
	public static int getObjectDataType(Object objValue) {
		if (objValue == null) return DataTypes.VARCHAR;

		if ((objValue instanceof String) || (objValue instanceof Character)) {
			return DataTypes.VARCHAR;
		}

		if ((objValue instanceof java.sql.Date) || (objValue instanceof java.util.Date) || (objValue instanceof java.sql.Timestamp)) {
			return DataTypes.DATETIME;
		}

		if (objValue instanceof Integer) {
			return DataTypes.INT;
		}

		if (objValue instanceof BigInteger) {
			return DataTypes.BIGINT;
		}

		if (objValue instanceof Float || objValue instanceof Double) {
			return DataTypes.FLOAT;
		}

		return DataTypes.VARCHAR;
	}

	/**
	 * 判断条件是否成立
	 * 
	 * @param objSrcValue
	 * @param strOp
	 * @param strDstValue
	 * @return
	 * @throws Exception
	 */
	public static boolean testCond(Object objSrcValue, String strOp, Object objDstValue) throws Exception {
		if (StringHelper.compare(strOp, ICondition.CONDOP_ISNULL, true) == 0) {
			return objSrcValue == null;
		}

		if (StringHelper.compare(strOp, ICondition.CONDOP_ISNOTNULL, true) == 0) {
			return objSrcValue != null;
		}

		if (objSrcValue == null) {
			if (StringHelper.compare(strOp, ICondition.CONDOP_EQ, true) == 0) {
				return (objDstValue == null);
			}

			if (StringHelper.compare(strOp, ICondition.CONDOP_NOTEQ, true) == 0) {
				return (objDstValue != null);
			}
			return false;
		}

		if (objSrcValue instanceof String) {
			String strSrcValue = (String) objSrcValue;
			String strDstValue = (String) objDstValue;

			if (StringHelper.compare(strOp, ICondition.CONDOP_LEFTLIKE, true) == 0) {
				return strSrcValue.toUpperCase().indexOf(strDstValue.toUpperCase()) == 0;
			}

			if (StringHelper.compare(strOp, ICondition.CONDOP_LIKE, true) == 0) {
				return strSrcValue.toUpperCase().indexOf(strDstValue.toUpperCase()) != -1;
			}

			if (StringHelper.compare(strOp, ICondition.CONDOP_RIGHTLIKE, true) == 0) {
				int nPos = strSrcValue.toUpperCase().indexOf(strDstValue.toUpperCase());
				if (nPos == -1) return false;

				return (nPos + strDstValue.length()) == strSrcValue.length();
			}
		}

		int nDataType = getObjectDataType(objSrcValue);
		long nRet = compare(nDataType, objSrcValue, objDstValue);
		if (StringHelper.compare(strOp, ICondition.CONDOP_EQ, true) == 0) {
			return (nRet == 0);
		}
		if (StringHelper.compare(strOp, ICondition.CONDOP_NOTEQ, true) == 0) {
			return (nRet != 0);
		}
		if (StringHelper.compare(strOp, ICondition.CONDOP_GT, true) == 0) {
			return (nRet > 0);
		}
		if (StringHelper.compare(strOp, ICondition.CONDOP_GTANDEQ, true) == 0) {
			return (nRet >= 0);
		}
		if (StringHelper.compare(strOp, ICondition.CONDOP_LT, true) == 0) {
			return (nRet < 0);
		}
		if (StringHelper.compare(strOp, ICondition.CONDOP_LTANDEQ, true) == 0) {
			return (nRet <= 0);
		}
		throw new Exception(StringHelper.format("无法识别的条件值比较操作[%1$s](%2$s)[%3$s]", objSrcValue, strOp, objDstValue));
	}

	
	/**
	 * 获取参数的整数型值
	 * 
	 * @param iDataObject 数据对象
	 * @param strParamName
	 * @param nDefault
	 * @return
	 */
	final static public int getIntegerValue(ISimpleDataObject iDataObject, String strParamName, int nDefault) throws Exception {
		Object objValue = iDataObject.get(strParamName);
		if (objValue == null) {
			return nDefault;
		}

		return Integer.parseInt(objValue.toString());
	}

	/**
	 * 获取值的对象值
	 * 
	 * @param objValue
	 * @return
	 * @throws Exception
	 */
	final static public Object getObjectValue(Object objValue) throws Exception {
		return objValue;
	}

	/**
	 * 转换对象值到整形值
	 * 
	 * @param objValue
	 * @return
	 * @throws Exception
	 */
	final static public Integer getIntegerValue(Object objValue) throws Exception {
		return getIntegerValue(objValue, null);
	}

	/**
	 * 转换对象值到整形值
	 * 
	 * @param objValue
	 * @param def
	 * @return
	 * @throws Exception
	 */
	final static public Integer getIntegerValue(Object objValue, Integer def) throws Exception {
		if (objValue == null) return def;

		if (objValue instanceof Integer) {
			return (Integer) objValue;
		}
		String strValue = objValue.toString();
		if (StringHelper.isNullOrEmpty(strValue)) return def;
		return Integer.parseInt(strValue);
	}

	/**
	 * 获取数据对象指定属性浮点值
	 * 
	 * @param iDataObject
	 * @param strParamName
	 * @param fDefault
	 * @return
	 * @throws Exception
	 */
	final static public Float getFloatValue(ISimpleDataObject iDataObject, String strParamName, float fDefault) throws Exception {
		Object objValue = iDataObject.get(strParamName);
		if (objValue == null) {
			return fDefault;
		}
		try {
			return Float.parseFloat(objValue.toString());
		} catch (Exception ex) {
			return fDefault;
		}
	}

	/**
	 * 转换对象值到浮点值
	 * 
	 * @param objValue
	 * @return
	 * @throws Exception
	 */
	final static public Float getFloatValue(Object objValue) throws Exception {
		if (objValue == null) return null;

		if (objValue instanceof Float) {
			return (Float) objValue;
		}

		String strValue = objValue.toString();
		if (StringHelper.isNullOrEmpty(strValue)) return null;
		return Float.parseFloat(strValue);
	}

	/**
	 * 获取数据对象指定属性大数值
	 * 
	 * @param iDataObject
	 * @param strParamName
	 * @param fDefault
	 * @return
	 * @throws Exception
	 */
	final static public BigDecimal getBigDecimalValue(ISimpleDataObject iDataObject, String strParamName, BigDecimal fDefault) throws Exception {
		Object objValue = iDataObject.get(strParamName);
		if (objValue == null) {
			return fDefault;
		}
		try {
			return BigDecimal.valueOf(Double.parseDouble(objValue.toString()));
		} catch (Exception ex) {
			return fDefault;
		}
	}

	/**
	 * 获取数据对象指定属性Double值
	 * 
	 * @param iDataObject
	 * @param strParamName
	 * @param fDefault
	 * @return
	 * @throws Exception
	 */
	final static public double getDoubleValue(ISimpleDataObject iDataObject, String strParamName, double fDefault) throws Exception {
		Object objValue = iDataObject.get(strParamName);
		if (objValue == null) {
			return fDefault;
		}
		try {
			return Double.parseDouble(objValue.toString());
		} catch (Exception ex) {
			return fDefault;
		}
	}

	/**
	 * 转换对象值到Double值
	 * 
	 * @param objValue
	 * @return
	 * @throws Exception
	 */
	final static public Double getDoubleValue(Object objValue) throws Exception {
		if (objValue == null) return null;

		if (objValue instanceof Double) {
			return (Double) objValue;
		}

		String strValue = objValue.toString();
		if (StringHelper.isNullOrEmpty(strValue)) return null;
		return Double.parseDouble(strValue);
	}

	/**
	 * 获取数据对象指定属性Long值
	 * 
	 * @param iDataObject
	 * @param strParamName
	 * @param nDefault
	 * @return
	 * @throws Exception
	 */
	final static public long getLongValue(ISimpleDataObject iDataObject, String strParamName, long nDefault) throws Exception {
		Object objValue = iDataObject.get(strParamName);
		if (objValue == null) {
			return nDefault;
		}
		try {
			if (objValue instanceof Long) return (Long) objValue;

			if (objValue instanceof Double) {
				return ((Double) objValue).longValue();
			}

			if (objValue instanceof BigDecimal) {
				return ((BigDecimal) objValue).longValue();
			}

			return Long.parseLong(objValue.toString());
		} catch (Exception ex) {
			return nDefault;
		}
	}

	/**
	 * 获取数据对象指定属性字符串值
	 * 
	 * @param iDataObject
	 * @param strParamName
	 * @param strDefault
	 * @return
	 * @throws Exception
	 */
	final static public String getStringValue(ISimpleDataObject iDataObject, String strParamName, String strDefault) throws Exception {
		Object objValue = iDataObject.get(strParamName);
		if (objValue == null) {
			return strDefault;
		}
		try {
			return getStringValue(objValue);
		} catch (Exception ex) {
			return strDefault;
		}
	}

	/**
	 * 转换对象值到字符串值
	 * 
	 * @param objValue
	 * @return
	 * @throws Exception
	 */
	final static public String getStringValue(Object objValue) throws Exception {
		return getStringValue(objValue, null);
	}

	/**
	 * 转换对象值到字符串值
	 * 
	 * @param objValue
	 * @param strDefault
	 * @return
	 * @throws Exception
	 */
	final static public String getStringValue(Object objValue, String strDefault) throws Exception {
		if (objValue == null) return strDefault;
		if (objValue instanceof String) return (String) objValue;
		return objValue.toString();
	}

	/**
	 * 获取数据对象指定属性字符串值
	 * 
	 * @param iDataObject
	 * @param strParamName
	 * @param strDefault
	 * @return
	 * @throws Exception
	 */
	final static public String getClobValue(ISimpleDataObject iDataObject, String strParamName, String strDefault) throws Exception {
		Object objValue = iDataObject.get(strParamName);
		if (objValue == null) {
			return strDefault;
		}
		try {
			if (objValue instanceof java.sql.Clob) {
				boolean bFirst = true;
				Clob clob = (Clob) objValue;
				BufferedReader br = new BufferedReader(clob.getCharacterStream());
				String s = br.readLine();
				StringBuffer sb = new StringBuffer();
				while (s != null) {// 执行循环将字符串全部取出付值给StringBuffer由StringBuffer转成STRING
					if (bFirst)
						bFirst = false;
					else
						sb.append("\r\n");
					sb.append(s);
					s = br.readLine();
				}
				return sb.toString();
			} else
				return objValue.toString();
		} catch (Exception ex) {
			return strDefault;
		}
	}

	/**
	 * 获取数据对象指定属性时间值
	 * 
	 * @param iDataObject
	 * @param strParamName
	 * @param dtDefault
	 * @return
	 * @throws Exception
	 */
	final static public java.sql.Timestamp getTimestampValue(ISimpleDataObject iDataObject, String strParamName, java.sql.Timestamp dtDefault) throws Exception {
		Object objValue = iDataObject.get(strParamName);
		if (objValue == null) {
			return dtDefault;
		}
		try {
			return getTimestampValue(objValue);
		} catch (Exception ex) {
			return dtDefault;
		}
	}

	/**
	 * 转换对象值到时间值
	 * 
	 * @param objValue
	 * @return
	 * @throws Exception
	 */
	final static public java.sql.Timestamp getTimestampValue(Object objValue) throws Exception {
		if (objValue == null) return null;

		if (objValue instanceof java.sql.Timestamp) {
			java.sql.Timestamp ti = (java.sql.Timestamp) objValue;
			return ti;
		}

		if (objValue instanceof java.sql.Date) {
			java.sql.Date date = (java.sql.Date) objValue;
			return new java.sql.Timestamp(date.getTime());
		}

		if (objValue instanceof java.util.Date) {
			java.util.Date date = (java.util.Date) objValue;
			return new java.sql.Timestamp(date.getTime());
		}

		if (objValue instanceof String) {
			String strValue = (String) objValue;
			strValue = strValue.trim();
			if (StringHelper.isNullOrEmpty(strValue)) return null;

			java.util.Date date = DateHelper.parse((String) objValue);
			return new java.sql.Timestamp(date.getTime());
		}
		
		if(objValue instanceof Long)
		{
			Long lValue = (Long)objValue;
			return new  java.sql.Timestamp(lValue); 
		}
		
		throw new Exception(StringHelper.format("无法转换时间[%1$s]", objValue));
	}

	/**
	 * 获取数据对象指定属性数据对象值
	 * 
	 * @param iDataObject
	 * @param strParamName
	 * @return
	 * @throws Exception
	 */
	final static public DataObjectList getDataObjectsValue(ISimpleDataObject iDataObject, String strParamName) throws Exception {
		Object objValue = iDataObject.get(strParamName);
		if (objValue == null) {
			return null;
		}
		if (objValue instanceof DataObjectList) return (DataObjectList) objValue;
		return null;
	}
}
