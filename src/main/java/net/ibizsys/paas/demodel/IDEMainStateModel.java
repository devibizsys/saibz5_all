package net.ibizsys.paas.demodel;

import net.ibizsys.paas.core.IDEMainState;

/**
 * 实体主状态模型接口
 * 
 * @author Administrator
 *
 */
public interface IDEMainStateModel extends IDEMainState {
	/**
	 * 注册实体行为
	 * 
	 * @param strDEAction
	 */
	void registerDEAction(String strDEAction);
}
