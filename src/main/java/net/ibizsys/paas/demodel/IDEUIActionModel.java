package net.ibizsys.paas.demodel;

import java.util.ArrayList;

import net.ibizsys.paas.core.IDEUIAction;
import net.ibizsys.paas.entity.IEntity;

import org.hibernate.SessionFactory;

/**
 * 实体界面行为接口
 * 
 * @author lionlau
 *
 */
public interface IDEUIActionModel<ET extends IEntity> extends IDEUIAction {
	/**
	 * 执行操作
	 * 
	 * @param iDELogicActionContext
	 * @throws Exception
	 */
	void execute(ArrayList<ET> entities, SessionFactory sessionFactory) throws Exception;

	/**
	 * 获取实体操作名称
	 * 
	 * @return
	 */
	String getDEActionName();

	/**
	 * 获取实体模型
	 * 
	 * @return
	 */
	IDataEntityModel<ET> getDEModel();
}
