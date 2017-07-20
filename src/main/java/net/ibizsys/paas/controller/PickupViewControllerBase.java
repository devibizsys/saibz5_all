package net.ibizsys.paas.controller;

/**
 * 选择视图控制器对象
 * 
 * @author Administrator
 *
 */
public abstract class PickupViewControllerBase extends ViewControllerBase {
	public PickupViewControllerBase() throws Exception {
		super();
	}

	/**
	 * 是否支持多项选择
	 * 
	 * @return
	 */
	protected boolean isEnableMultiSelect() {
		return false;
	}
}
