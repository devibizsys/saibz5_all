package net.ibizsys.paas.db;

import net.ibizsys.paas.core.IDEDataRange;
import net.ibizsys.psrt.srv.common.entity.Org;
import net.ibizsys.psrt.srv.common.entity.OrgSector;
import net.ibizsys.psrt.srv.common.entity.UserRoleData;

/**
 * 数据库适配器接口
 * 
 * @author lionlau
 *
 */
public interface IDBDialect {
	/**
	 * 函数当前日期时间
	 */
	final static String FUNC_CURDATETIME = "CURDATETIME";

	/**
	 * 函数当前日期
	 */
	final static String FUNC_CURDATE = "CURDATE";

	/**
	 * 版本累加
	 */
	final static String FUNC_VERSION = "VERSION";

	/**
	 * 查找字符串
	 */
	final static String FUNC_INSTR = "INSTR";

	/**
	 * 查找最大值
	 */
	final static String FUNC_MAX = "MAX";

	/**
	 * 查找最小值
	 */
	final static String FUNC_MIN = "MIN";

	/**
	 * 查找平均值
	 */
	final static String FUNC_AVG = "AVG";

	/**
	 * 查找计数
	 */
	final static String FUNC_COUNT = "COUNT";

	/**
	 * 数据汇聚
	 */
	final static String FUNC_SUM = "SUM";

	/**
	 * 获取数据库类型
	 * 
	 * @return
	 */
	String getDBType();

	/**
	 * 获取计数的语句
	 * 
	 * @param strSQL
	 * @return
	 */
	String getCountSQL(String strSQL);

	/**
	 * 获取分页的SQL语句
	 * 
	 * @param strSQL
	 * @param nStartPos
	 * @param nPageSize
	 * @param strMajor
	 * @param strMajorDirection
	 * @param strMinor
	 * @param strMinorDirection
	 * @return
	 */
	String getPagingSQL(String strSQL, int nStartPos, int nPageSize, String strMajor, String strMajorDirection, String strMinor, String strMinorDirection);

	/**
	 * 获取JDBC数据类型
	 * 
	 * @param nDataType
	 * @return
	 */
	int getJDBCType(int nDataType);

	/**
	 * 直接调用命令
	 * 
	 * @param strCommand
	 * @param list
	 * @param nTimeOut
	 * @return
	 */
	DBCallResult callSql(java.sql.Connection connection, String strCommand, SqlParamList list, int nTimeOut) throws Exception;

	/**
	 * 直接调用存储过程
	 * 
	 * @param strProcName
	 * @param list
	 * @param nTimeOut
	 * @return
	 */
	DBCallResult callProc(java.sql.Connection connection, String strProcName, SqlParamList list, int nTimeOut) throws Exception;

	/**
	 * 获取属性的条件SQL
	 * 
	 * @param strFieldName
	 * @param nStdDataType
	 * @param strCondOp
	 * @param strValue
	 * @param strParamName
	 * @param sqlParamList
	 * @return
	 * @throws Exception
	 */
	String getConditionSQL(String strFieldName, int nStdDataType, String strCondOp, String strValue, boolean bParam, SqlParamList sqlParamList) throws Exception;

	/**
	 * 获取数据库的函数
	 * 
	 * @param strFuncType
	 * @param args
	 * @return
	 * @throws Exception
	 */
	String getFuncSQL(String strFuncType, String[] args) throws Exception;

	/**
	 * 获取数据库的函数
	 * 
	 * @param strFuncType
	 * @param 插入使用
	 * @param 列名称
	 * @return
	 * @throws Exception
	 */
	String getFuncSQL(String strFuncType, boolean bInsert, String[] args) throws Exception;

	/**
	 * 获取前部记录数SQL
	 * 
	 * @param strSQL
	 * @param nTopCount
	 * @return
	 * @throws Exception
	 */
	String getTopRowSQL(String strSQL, int nTopCount) throws Exception;

	/**
	 * 获取机构数据范围
	 * 
	 * @param iDEModel
	 * @param userRoleData
	 * @return
	 * @throws Exception
	 */
	String getOrgDRCond(UserRoleData userRoleData, Org curOrg, String strAlias) throws Exception;

	/**
	 * 获取机构部门数据范围
	 * 
	 * @param iDEModel
	 * @param userRoleData
	 * @return
	 * @throws Exception
	 */
	String getOrgSecDRCond(UserRoleData userRoleData, OrgSector curOrgSector, String strAlias) throws Exception;

	/**
	 * 获取机构数据范围
	 * 
	 * @param iDEModel
	 * @param userRoleData
	 * @return
	 * @throws Exception
	 */
	String getOrgDRCond(IDEDataRange iDEDataRange, Org curOrg, String strAlias) throws Exception;

	/**
	 * 获取机构部门数据范围
	 * 
	 * @param iDEModel
	 * @param userRoleData
	 * @return
	 * @throws Exception
	 */
	String getOrgSecDRCond(IDEDataRange iDEDataRange, OrgSector curOrgSector, String strAlias) throws Exception;

	/**
	 * 获取数据库对象标准名称
	 * 
	 * @param strOriginName
	 * @return
	 */
	String getDBObjStandardName(String strOriginName);
}
