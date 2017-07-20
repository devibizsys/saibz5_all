package net.ibizsys.paas.view;

import net.ibizsys.paas.core.IModelBase;

/**
 * 视图向导接口
 * @author Administrator
 *
 */
public interface IViewWizard  extends IModelBase{
	
	/**
	 * 获取向导的Url路径
	 * @return
	 */
	String getWizardUrl();
	
	
	
	
	
}
