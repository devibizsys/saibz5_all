package net.ibizsys.paas.report;

import org.hibernate.SessionFactory;

import net.ibizsys.paas.core.IDataEntity;
import net.ibizsys.paas.core.IDataEntityObject;
import net.ibizsys.paas.web.IWebContext;

/**
 * 报表服务对象接口
 * 
 * @author Administrator
 *
 */
public interface IReportService extends IDataEntityObject {
	/**
	 * 内容类型，PDF
	 */
	final static String CONTENTTYPE_PDF = "PDF";

	/**
	 * 内容类型，HTML
	 */
	final static String CONTENTTYPE_HTML = "HTML";

	/**
	 * 内容类型，EXCEL
	 */
	final static String CONTENTTYPE_EXCEL = "EXCEL";

	/**
	 * 初始化
	 * 
	 * @param iDataEntity
	 * @throws Exception
	 */
	void init(IDataEntity iDataEntity) throws Exception;

	/**
	 * 获取访问权限标识
	 * 
	 * @return
	 */
	String getAccessKey();

	/**
	 * 获取报表路径
	 * 
	 * @return
	 */
	String getReportFilePath();

	/**
	 * 获取实体数据结果集名称
	 * 
	 * @return
	 */
	String getDEDataSetName();

	/**
	 * 是否支持日志
	 * 
	 * @return
	 */
	boolean isEnableLog();

	/**
	 * 获取打印文件
	 * 
	 * @param iWebContext
	 * @param sessionFactory
	 * @param strContentType
	 * @return
	 * @throws Exception
	 */
	String getReportFile(IWebContext iWebContext, SessionFactory sessionFactory, String strContentType, String strPrintFileFolder) throws Exception;

	/**
	 * 获取子报表标识集合
	 * 
	 * @return
	 */
	java.util.Iterator<String> getSubReportIds();

	/**
	 * 是否有子报表
	 * 
	 * @return
	 */
	boolean hasSubReport();

	/**
	 * 获取代码表文本
	 * 
	 * @param strCodeListId 代码表标识
	 * @param strValue 要转换的值
	 * @return 转换后文本
	 * @throws Exception
	 */
	String getCodeListText(String strCodeListId, String strValue) throws Exception;
}
