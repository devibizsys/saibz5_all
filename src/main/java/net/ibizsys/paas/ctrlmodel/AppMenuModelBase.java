package net.ibizsys.paas.ctrlmodel;

import java.util.Iterator;

import net.ibizsys.paas.control.ControlTypes;
import net.ibizsys.paas.control.menu.AppMenuItem;
import net.ibizsys.paas.control.menu.AppMenuRootItem;
import net.ibizsys.paas.control.menu.IAppMenuItem;
import net.ibizsys.paas.web.MDAjaxActionResult;
import net.sf.json.JSONObject;

/**
 * 应用菜单模型基类
 * 
 * @author lionlau
 * 
 */
public abstract class AppMenuModelBase extends CtrlModelBase implements IAppMenuModel {
	private AppMenuRootItem appMenuRootItem = new AppMenuRootItem();

	/**
	 * 初始化
	 * 
	 * @throws Exception
	 */
	public void init() throws Exception {
		onInit();
	}

	@Override
	protected void onInit() throws Exception {
		super.onInit();
		onPrepareRootItem(this.getRootItem());
	}

	@Override
	public AppMenuRootItem getRootItem() {
		return this.appMenuRootItem;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.control.menu.IAppMenu#getMenuItems()
	 */
	@Override
	public Iterator<IAppMenuItem> getAppMenuItems() {
		return getRootItem().getItems().iterator();
	}

	@Override
	public String getControlType() {
		return ControlTypes.AppMenu;
	}

	/**
	 * 准备导航栏根节点
	 * 
	 * @param expBarRootItem
	 * @throws Exception
	 */
	protected void onPrepareRootItem(AppMenuRootItem appMenuRootItem) throws Exception {

	}

	/**
	 * 填充获取数据返回结果对象
	 * 
	 * @param fetchResult
	 * @throws Exception
	 */
	@Override
	public void fillFetchResult(MDAjaxActionResult fetchResult) throws Exception {
		for (IAppMenuItem iAppMenuItem : getRootItem().getItems()) {
			JSONObject jo = AppMenuItem.toJSONObject(iAppMenuItem, null);
			if (jo == null) continue;
			fetchResult.getRows().add(jo);
		}
	}
}
