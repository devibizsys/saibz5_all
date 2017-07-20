package net.ibizsys.paas.sysmodel;

import net.ibizsys.paas.codelist.ICodeList;
import net.ibizsys.paas.web.IWebContext;
import net.ibizsys.paas.web.MDAjaxActionResult;

import org.hibernate.SessionFactory;

/**
 * 系统代码表模型接口
 * 
 * @author lionlau
 *
 */
public interface ICodeListModel extends ICodeList {
	/**
	 * 填充结果
	 * 
	 * @param fetchResult
	 * @param iWebContext
	 * @throws Exception
	 */
	void fillFetchResult(MDAjaxActionResult fetchResult, IWebContext iWebContext) throws Exception;

	/**
	 * 设置会话工厂
	 * 
	 * @param sessionFactory
	 */
	void setSessionFactory(SessionFactory sessionFactory);

	/**
	 * 获取会话工厂
	 * 
	 * @return
	 */
	SessionFactory getSessionFactory();

	/**
	 * 重新刷新
	 * 
	 * @throws Exception
	 */
	void refresh() throws Exception;

	/**
	 * 从指定代码表构建
	 * 
	 * @param iCodeListModel
	 * @throws Exception
	 */
	void from(ICodeListModel iCodeListModel) throws Exception;

	// /**
	// * 设置代码表辅助对象
	// * @param iCodeListHelper
	// */
	// void setCodeListHelper(ICodeListHelper iCodeListHelper);
	//
	//
	//
	//
	// /**
	// * 获取代码表辅助对象
	// */
	// ICodeListHelper getCodeListHelper();
}
