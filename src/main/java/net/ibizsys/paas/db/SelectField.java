package net.ibizsys.paas.db;

/**
 * 查询字段实现对象
 * 
 * @author Administrator
 *
 */
public class SelectField implements ISelectField {

	private String strName = null;
	private String strAlias = null;
	private String strFunc = null;

	@Override
	public String getName() {
		return this.strName;
	}

	@Override
	public String getAlias() {
		return this.strAlias;
	}

	@Override
	public String getFunc() {
		return this.strFunc;
	}

	/**
	 * 获取字段名称，多个使用分号[,]分隔
	 * 
	 * @param strName
	 */
	public void setName(String strName) {
		this.strName = strName;
	}

	/**
	 * 设置查询别名
	 * 
	 * @param strAlias
	 */
	public void setAlias(String strAlias) {
		this.strAlias = strAlias;
	}

	/**
	 * 设置函数名称
	 * 
	 * @param strFunc
	 */
	public void setFunc(String strFunc) {
		this.strFunc = strFunc;
	}

}
