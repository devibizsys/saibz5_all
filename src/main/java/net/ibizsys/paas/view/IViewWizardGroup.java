package net.ibizsys.paas.view;

import net.ibizsys.paas.core.IModelBase;

/**
 * 视图向导组
 * @author Administrator
 *
 */
public interface IViewWizardGroup extends IModelBase {
	
	/**
	 * 获取视图向导集合
	 * 
	 * @return
	 */
	java.util.Iterator<IViewWizard> getViewWizards();
	
	
	
	
}
