package net.ibizsys.pswf.ctrlmodel;

import net.ibizsys.paas.ctrlmodel.IExpBarModel;
import net.ibizsys.pswf.control.expbar.IWFExpBar;
import net.ibizsys.pswf.core.IWFModel;
import net.ibizsys.pswf.core.IWFVersionModel;

/**
 * 流程导航栏模型接口
 * 
 * @author lionlau
 *
 */
public interface IWFExpBarModel extends IExpBarModel, IWFExpBar {
	/**
	 * 获取流程模型对象
	 * 
	 * @return the IWFModel
	 */
	IWFModel getWFModel();

	/**
	 * 获取流程版本模型对象
	 * 
	 * @return the IWFVersionModel
	 */
	IWFVersionModel getWFVersionModel();
}
