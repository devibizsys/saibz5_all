package net.ibizsys.paas.ctrlmodel;

import net.ibizsys.paas.core.IModelBase;

/**
 * 树节点关系模型接口
 * 
 * @author Administrator
 *
 */
public interface ITreeNodeRSModel extends IModelBase {
	/**
	 * 获取父树节点标识
	 * 
	 * @return
	 */
	String getParentTreeNodeId();

	/**
	 * 获取子树节点标识
	 * 
	 * @return
	 */
	String getChildTreeNodeId();

	/**
	 * 获取处理的行为名称
	 * 
	 * @return
	 */
	String getDEActionName();


}
