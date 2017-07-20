package net.ibizsys.paas.core;

/**
 * 实体数据导入接口
 * 
 * @author Administrator
 *
 */
public interface IDEDataImport extends IDataEntityObject {
	/**
	 * 初始化
	 * 
	 * @param iDataEntity
	 * @throws Exception
	 */
	void init(IDataEntity iDataEntity) throws Exception;
}
