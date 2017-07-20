package net.ibizsys.paas.db.impl;

import net.ibizsys.paas.core.DataTypes;
import net.ibizsys.paas.core.IDEDataRange;
import net.ibizsys.paas.db.IDBDialect;
import net.ibizsys.paas.util.StringBuilderEx;
import net.ibizsys.paas.util.StringHelper;
import net.ibizsys.psrt.srv.common.entity.Org;
import net.ibizsys.psrt.srv.common.entity.OrgSector;
import net.ibizsys.psrt.srv.common.entity.UserRoleData;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * 数据库语言适配对象
 * 
 * @author lionlau
 *
 */
public abstract class DBDialectImpl implements IDBDialect {

	private static final Log log = LogFactory.getLog(DBDialectImpl.class);
	private boolean bUnicodeChar = false;

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.db.IDBDialect#getCountSQL(java.lang.String)
	 */
	@Override
	public String getCountSQL(String strSQL) {
		return StringHelper.format("select count(*) as TOTALROW from (%1$s) m1", strSQL);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.db.IDBDialect#getJDBCType(int)
	 */
	@Override
	public int getJDBCType(int dataType) {
		if (dataType == DataTypes.BIGINT) {
			return java.sql.Types.BIGINT;
		} else if (dataType == DataTypes.BINARY) {
			return java.sql.Types.BINARY;
		} else if (dataType == DataTypes.BIT) {
			return java.sql.Types.BIT;
		} else if (dataType == DataTypes.CHAR || dataType == DataTypes.NCHAR || dataType == DataTypes.UNIQUEIDENTIFIER) {
			return java.sql.Types.CHAR;
		} else if (dataType == DataTypes.TIME || dataType == DataTypes.DATETIME || dataType == DataTypes.SMALLDATETIME || dataType == DataTypes.TIMESTAMP) {
			return java.sql.Types.TIMESTAMP;
		} else if (dataType == DataTypes.DECIMAL || dataType == DataTypes.MONEY || dataType == DataTypes.SMALLMONEY) {
			return java.sql.Types.DECIMAL;
		} else if (dataType == DataTypes.FLOAT) {
			return java.sql.Types.FLOAT;
		} else if (dataType == DataTypes.IMAGE) {
			return java.sql.Types.LONGVARBINARY;
		}

		else if (dataType == DataTypes.INT) {
			return java.sql.Types.INTEGER;
		} else if (dataType == DataTypes.NTEXT || dataType == DataTypes.TEXT) {
			return java.sql.Types.LONGVARCHAR;
		} else if (dataType == DataTypes.NUMERIC) {
			return java.sql.Types.NUMERIC;
		} else if (dataType == DataTypes.NVARCHAR || dataType == DataTypes.SQL_VARIANT || dataType == DataTypes.SYSNAME || dataType == DataTypes.VARCHAR) {
			return java.sql.Types.VARCHAR;
		} else if (dataType == DataTypes.REAL) {
			return java.sql.Types.REAL;
		} else if (dataType == DataTypes.SMALLINT) {
			return java.sql.Types.SMALLINT;
		} else if (dataType == DataTypes.TINYINT) {
			return java.sql.Types.TINYINT;
		} else if (dataType == DataTypes.VARBINARY) {
			return java.sql.Types.VARBINARY;
		}
		return java.sql.Types.VARCHAR;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.db.IDBDialect#getTopRowSQL(java.lang.String, int)
	 */
	@Override
	public String getTopRowSQL(String strSQL, int nTopCount) {
		return strSQL;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.db.IDBDialect#getFuncSQL(java.lang.String, java.lang.String[])
	 */
	@Override
	public String getFuncSQL(String strFuncType, String[] args) throws Exception {
		return getFuncSQL(strFuncType, false, args);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.db.IDBDialect#getFuncSQL(java.lang.String)
	 */
	@Override
	public String getFuncSQL(String strFuncType, boolean bInsert, String[] args) throws Exception {
		if (StringHelper.compare(strFuncType, FUNC_INSTR, true) == 0) {
			if (args == null || args.length < 2) {
				throw new Exception(StringHelper.format("数据库函数类型[%1$s]参数不正确", strFuncType));
			}
			return StringHelper.format("INSTR(%1$s,%2$s)", args[0], args[1]);
		}

		if (StringHelper.compare(strFuncType, FUNC_VERSION, true) == 0) {
			if (bInsert)
				return "1";
			else {
				if (args == null || args.length != 1) {
					throw new Exception(StringHelper.format("数据库函数类型[%1$s]参数不正确", strFuncType));
				}
				return StringHelper.format("%1$s+1", args[0]);
			}
		}

		if (StringHelper.compare(strFuncType, FUNC_MAX, true) == 0) {
			if (args == null || args.length != 1) {
				throw new Exception(StringHelper.format("数据库函数类型[%1$s]参数不正确", strFuncType));
			}
			return StringHelper.format("MAX(%1$s)", args[0]);
		}

		if (StringHelper.compare(strFuncType, FUNC_AVG, true) == 0) {
			if (args == null || args.length != 1) {
				throw new Exception(StringHelper.format("数据库函数类型[%1$s]参数不正确", strFuncType));
			}
			return StringHelper.format("AVG(%1$s)", args[0]);
		}

		if (StringHelper.compare(strFuncType, FUNC_MIN, true) == 0) {
			if (args == null || args.length != 1) {
				throw new Exception(StringHelper.format("数据库函数类型[%1$s]参数不正确", strFuncType));
			}
			return StringHelper.format("MIN(%1$s)", args[0]);
		}

		if (StringHelper.compare(strFuncType, FUNC_SUM, true) == 0) {
			if (args == null || args.length != 1) {
				throw new Exception(StringHelper.format("数据库函数类型[%1$s]参数不正确", strFuncType));
			}
			return StringHelper.format("SUM(%1$s)", args[0]);
		}

		if (StringHelper.compare(strFuncType, FUNC_COUNT, true) == 0) {
			return StringHelper.format("COUNT(1)");
		}

		throw new Exception(StringHelper.format("无法识别的数据库函数类型[%1$s]", strFuncType));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.db.IDBDialect#getOrgDRCond(net.ibizsys.psrt.srv.common.entity.UserRoleData, net.ibizsys.psrt.srv.common.entity.Org, java.lang.String)
	 */
	@Override
	public String getOrgDRCond(UserRoleData userRoleData, Org curOrg, String strAlias) throws Exception {
		boolean bFirst = true;
		StringBuilderEx orgCondSb = new StringBuilderEx();
		long nOrgDR = 0;
		if (userRoleData.getOrgDR() != null) nOrgDR = userRoleData.getOrgDR();
		// 当前机构
		if ((nOrgDR & IDEDataRange.ORG_CURRENT) > 0) {
			if (bFirst) {
				bFirst = false;
			} else
				orgCondSb.append(" OR ");

			orgCondSb.append(" o1.ORGID = '%1$s' ", curOrg.getOrgId());
		}
		// 父机构
		if ((nOrgDR & IDEDataRange.ORG_PARENT) > 0) {
			if (bFirst) {
				bFirst = false;
			} else
				orgCondSb.append(" OR ");
			orgCondSb.append(" %1$s = 1 ", getFuncSQL(IDBDialect.FUNC_INSTR, new String[] { StringHelper.format("'%1$s'", curOrg.getLevelCode()), "o1.LEVELCODE" }));

		}
		// 子机构
		if ((nOrgDR & IDEDataRange.ORG_CHILD) > 0) {
			if (bFirst) {
				bFirst = false;
			} else
				orgCondSb.append(" OR ");

			orgCondSb.append(" %1$s = 1 ", getFuncSQL(IDBDialect.FUNC_INSTR, new String[] { "o1.LEVELCODE", StringHelper.format("'%1$s'", curOrg.getLevelCode()) }));
		}
		return orgCondSb.toString();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.db.IDBDialect#getOrgSecDRCond(net.ibizsys.psrt.srv.common.entity.UserRoleData, net.ibizsys.psrt.srv.common.entity.OrgSector, java.lang.String)
	 */
	@Override
	public String getOrgSecDRCond(UserRoleData userRoleData, OrgSector curOrgSector, String strAlias) throws Exception {
		boolean bFirst = true;
		StringBuilderEx orgSecCondSb = new StringBuilderEx();

		long nSecDR = 0;
		if (userRoleData.getSecDR() != null) nSecDR = userRoleData.getSecDR();

		// 当前部门
		if ((nSecDR & IDEDataRange.SECTOR_CURRENT) > 0) {
			if (bFirst) {
				bFirst = false;
			} else
				orgSecCondSb.append(" OR ");

			orgSecCondSb.append(" o2.ORGSECTORID = '%1$s' ", curOrgSector.getOrgSectorId());
		}
		// 父部门
		if ((nSecDR & IDEDataRange.SECTOR_PARENT) > 0) {
			if (bFirst) {
				bFirst = false;
			} else
				orgSecCondSb.append(" OR ");
			orgSecCondSb.append(" %1$s = 1 ", getFuncSQL(IDBDialect.FUNC_INSTR, new String[] { StringHelper.format("'%1$s'", curOrgSector.getLevelCode()), "o2.LEVELCODE" }));

		}
		// 子部门
		if ((nSecDR & IDEDataRange.SECTOR_CHILD) > 0) {
			if (bFirst) {
				bFirst = false;
			} else
				orgSecCondSb.append(" OR ");
			orgSecCondSb.append(" %1$s = 1 ", getFuncSQL(IDBDialect.FUNC_INSTR, new String[] { "o2.LEVELCODE", StringHelper.format("'%1$s'", curOrgSector.getLevelCode()) }));
		}
		return orgSecCondSb.toString();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.db.IDBDialect#getOrgDRCond(net.ibizsys.paas.core.IDEDataRange, net.ibizsys.psrt.srv.common.entity.Org, java.lang.String)
	 */
	@Override
	public String getOrgDRCond(IDEDataRange iDEDDataRange, Org curOrg, String strAlias) throws Exception {
		boolean bFirst = true;
		StringBuilderEx orgCondSb = new StringBuilderEx();
		// 当前机构
		if ((iDEDDataRange.getOrgDR() & IDEDataRange.ORG_CURRENT) > 0) {
			if (bFirst) {
				bFirst = false;
			} else
				orgCondSb.append(" OR ");

			orgCondSb.append(" o1.ORGID = '%1$s' ", curOrg.getOrgId());
		}
		// 父机构
		if ((iDEDDataRange.getOrgDR() & IDEDataRange.ORG_PARENT) > 0) {
			if (bFirst) {
				bFirst = false;
			} else
				orgCondSb.append(" OR ");
			orgCondSb.append(" %1$s = 1 ", getFuncSQL(IDBDialect.FUNC_INSTR, new String[] { StringHelper.format("'%1$s'", curOrg.getLevelCode()), "o1.LEVELCODE" }));

		}
		// 子机构
		if ((iDEDDataRange.getOrgDR() & IDEDataRange.ORG_CHILD) > 0) {
			if (bFirst) {
				bFirst = false;
			} else
				orgCondSb.append(" OR ");
			orgCondSb.append(" %1$s = 1 ", getFuncSQL(IDBDialect.FUNC_INSTR, new String[] { "o1.LEVELCODE", StringHelper.format("'%1$s'", curOrg.getLevelCode()) }));
		}
		return orgCondSb.toString();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.db.IDBDialect#getOrgSecDRCond(net.ibizsys.paas.core.IDEDataRange, net.ibizsys.psrt.srv.common.entity.OrgSector, java.lang.String)
	 */
	@Override
	public String getOrgSecDRCond(IDEDataRange iDEDDataRange, OrgSector curOrgSector, String strAlias) throws Exception {
		boolean bFirst = true;
		StringBuilderEx orgSecCondSb = new StringBuilderEx();
		// 当前部门
		if ((iDEDDataRange.getSecDR() & IDEDataRange.SECTOR_CURRENT) > 0) {
			if (bFirst) {
				bFirst = false;
			} else
				orgSecCondSb.append(" OR ");
			orgSecCondSb.append(" o2.ORGSECTORID = '%1$s' ", curOrgSector.getOrgSectorId());
		}
		// 父部门
		if ((iDEDDataRange.getSecDR() & IDEDataRange.SECTOR_PARENT) > 0) {
			if (bFirst) {
				bFirst = false;
			} else
				orgSecCondSb.append(" OR ");
			orgSecCondSb.append(" %1$s = 1 ", getFuncSQL(IDBDialect.FUNC_INSTR, new String[] { StringHelper.format("'%1$s'", curOrgSector.getLevelCode()), "o2.LEVELCODE" }));

		}
		// 子部门
		if ((iDEDDataRange.getSecDR() & IDEDataRange.SECTOR_CHILD) > 0) {
			if (bFirst) {
				bFirst = false;
			} else
				orgSecCondSb.append(" OR ");
			orgSecCondSb.append(" %1$s = 1 ", getFuncSQL(IDBDialect.FUNC_INSTR, new String[] { "o2.LEVELCODE", StringHelper.format("'%1$s'", curOrgSector.getLevelCode()) }));
		}
		return orgSecCondSb.toString();
	}

	/**
	 * 是否使用Unicode存储字符
	 * 
	 * @return
	 */
	public boolean isUnicodeChar() {
		return this.bUnicodeChar;
	}

	/**
	 * 设置是否使用Unicode存储字符
	 * 
	 * @param bUnicodeChar
	 */
	public void setUnicodeChar(boolean bUnicodeChar) {
		this.bUnicodeChar = bUnicodeChar;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.db.IDBDialect#getDBObjStandardName(java.lang.String)
	 */
	@Override
	public String getDBObjStandardName(String strOriginName) {
		return strOriginName;
	}
}
