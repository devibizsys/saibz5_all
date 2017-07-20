package net.ibizsys.paas.demodel;

import net.ibizsys.paas.core.IActionContext;
import net.ibizsys.paas.core.IDELogic;

/**
 * 实体逻辑接口
 * 
 * @author lionlau
 *
 */
public interface IDELogicModel<ET> extends IDELogic {
	// /**
	// * 执行逻辑
	// * @param iDELogicActionContext
	// * @throws Exception
	// */
	// void execute(ET et) throws Exception;

	/**
	 * 执行操作
	 * 
	 * @param iActionContext
	 * @throws Exception
	 */
	void execute(IActionContext iActionContext) throws Exception;
}
