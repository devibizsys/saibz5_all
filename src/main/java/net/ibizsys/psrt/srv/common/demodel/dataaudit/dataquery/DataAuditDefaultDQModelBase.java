/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package net.ibizsys.psrt.srv.common.demodel.dataaudit.dataquery;



import net.ibizsys.paas.core.DEDataQuery;
import net.ibizsys.paas.core.DEDataQueryCodes;
import net.ibizsys.paas.core.DEDataQueryCode;
import net.ibizsys.paas.core.DEDataQueryCodeExp;
import net.ibizsys.paas.core.DEDataQueryCodeCond;

@DEDataQuery(id="66064FCB-6E42-48DE-A6E0-3DB2F71181C4",name="DEFAULT")
@DEDataQueryCodes({
    @DEDataQueryCode(querycode="SELECT t1.AUDITTYPE, t1.CREATEDATE, t1.CREATEMAN, t1.DATAAUDITID, t1.DATAAUDITNAME, t1.IPADDRESS, t1.OBJECTID, t1.OBJECTTYPE, t1.OPPERSONID, t1.OPPERSONNAME, t1.SESSIONID, t1.UPDATEDATE, t1.UPDATEMAN FROM T_SRFDATAAUDIT t1 ",querycodetemp="",declarecode="",dbtype="DB2",
    fieldexps={
        @DEDataQueryCodeExp(name="AUDITINFO",expression="t1.AUDITINFO")
        ,@DEDataQueryCodeExp(name="AUDITTYPE",expression="t1.AUDITTYPE")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="DATAAUDITID",expression="t1.DATAAUDITID")
        ,@DEDataQueryCodeExp(name="DATAAUDITNAME",expression="t1.DATAAUDITNAME")
        ,@DEDataQueryCodeExp(name="IPADDRESS",expression="t1.IPADDRESS")
        ,@DEDataQueryCodeExp(name="OBJECTID",expression="t1.OBJECTID")
        ,@DEDataQueryCodeExp(name="OBJECTTYPE",expression="t1.OBJECTTYPE")
        ,@DEDataQueryCodeExp(name="OPPERSONID",expression="t1.OPPERSONID")
        ,@DEDataQueryCodeExp(name="OPPERSONNAME",expression="t1.OPPERSONNAME")
        ,@DEDataQueryCodeExp(name="SESSIONID",expression="t1.SESSIONID")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.`AUDITTYPE`, t1.`CREATEDATE`, t1.`CREATEMAN`, t1.`DATAAUDITID`, t1.`DATAAUDITNAME`, t1.`IPADDRESS`, t1.`OBJECTID`, t1.`OBJECTTYPE`, t1.`OPPERSONID`, t1.`OPPERSONNAME`, t1.`SESSIONID`, t1.`UPDATEDATE`, t1.`UPDATEMAN` FROM `T_SRFDATAAUDIT` t1 ",querycodetemp="",declarecode="",dbtype="MYSQL5",
    fieldexps={
        @DEDataQueryCodeExp(name="AUDITINFO",expression="t1.`AUDITINFO`")
        ,@DEDataQueryCodeExp(name="AUDITTYPE",expression="t1.`AUDITTYPE`")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.`CREATEDATE`")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.`CREATEMAN`")
        ,@DEDataQueryCodeExp(name="DATAAUDITID",expression="t1.`DATAAUDITID`")
        ,@DEDataQueryCodeExp(name="DATAAUDITNAME",expression="t1.`DATAAUDITNAME`")
        ,@DEDataQueryCodeExp(name="IPADDRESS",expression="t1.`IPADDRESS`")
        ,@DEDataQueryCodeExp(name="OBJECTID",expression="t1.`OBJECTID`")
        ,@DEDataQueryCodeExp(name="OBJECTTYPE",expression="t1.`OBJECTTYPE`")
        ,@DEDataQueryCodeExp(name="OPPERSONID",expression="t1.`OPPERSONID`")
        ,@DEDataQueryCodeExp(name="OPPERSONNAME",expression="t1.`OPPERSONNAME`")
        ,@DEDataQueryCodeExp(name="SESSIONID",expression="t1.`SESSIONID`")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.`UPDATEDATE`")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.`UPDATEMAN`")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.AUDITTYPE, t1.CREATEDATE, t1.CREATEMAN, t1.DATAAUDITID, t1.DATAAUDITNAME, t1.IPADDRESS, t1.OBJECTID, t1.OBJECTTYPE, t1.OPPERSONID, t1.OPPERSONNAME, t1.SESSIONID, t1.UPDATEDATE, t1.UPDATEMAN FROM T_SRFDATAAUDIT t1 ",querycodetemp="",declarecode="",dbtype="ORACLE",
    fieldexps={
        @DEDataQueryCodeExp(name="AUDITINFO",expression="t1.AUDITINFO")
        ,@DEDataQueryCodeExp(name="AUDITTYPE",expression="t1.AUDITTYPE")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="DATAAUDITID",expression="t1.DATAAUDITID")
        ,@DEDataQueryCodeExp(name="DATAAUDITNAME",expression="t1.DATAAUDITNAME")
        ,@DEDataQueryCodeExp(name="IPADDRESS",expression="t1.IPADDRESS")
        ,@DEDataQueryCodeExp(name="OBJECTID",expression="t1.OBJECTID")
        ,@DEDataQueryCodeExp(name="OBJECTTYPE",expression="t1.OBJECTTYPE")
        ,@DEDataQueryCodeExp(name="OPPERSONID",expression="t1.OPPERSONID")
        ,@DEDataQueryCodeExp(name="OPPERSONNAME",expression="t1.OPPERSONNAME")
        ,@DEDataQueryCodeExp(name="SESSIONID",expression="t1.SESSIONID")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.[AUDITTYPE], t1.[CREATEDATE], t1.[CREATEMAN], t1.[DATAAUDITID], t1.[DATAAUDITNAME], t1.[IPADDRESS], t1.[OBJECTID], t1.[OBJECTTYPE], t1.[OPPERSONID], t1.[OPPERSONNAME], t1.[SESSIONID], t1.[UPDATEDATE], t1.[UPDATEMAN] FROM [T_SRFDATAAUDIT] t1 ",querycodetemp="",declarecode="",dbtype="SQLSERVER",
    fieldexps={
        @DEDataQueryCodeExp(name="AUDITINFO",expression="t1.[AUDITINFO]")
        ,@DEDataQueryCodeExp(name="AUDITTYPE",expression="t1.[AUDITTYPE]")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.[CREATEDATE]")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.[CREATEMAN]")
        ,@DEDataQueryCodeExp(name="DATAAUDITID",expression="t1.[DATAAUDITID]")
        ,@DEDataQueryCodeExp(name="DATAAUDITNAME",expression="t1.[DATAAUDITNAME]")
        ,@DEDataQueryCodeExp(name="IPADDRESS",expression="t1.[IPADDRESS]")
        ,@DEDataQueryCodeExp(name="OBJECTID",expression="t1.[OBJECTID]")
        ,@DEDataQueryCodeExp(name="OBJECTTYPE",expression="t1.[OBJECTTYPE]")
        ,@DEDataQueryCodeExp(name="OPPERSONID",expression="t1.[OPPERSONID]")
        ,@DEDataQueryCodeExp(name="OPPERSONNAME",expression="t1.[OPPERSONNAME]")
        ,@DEDataQueryCodeExp(name="SESSIONID",expression="t1.[SESSIONID]")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.[UPDATEDATE]")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.[UPDATEMAN]")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.AUDITTYPE, t1.CREATEDATE, t1.CREATEMAN, t1.DATAAUDITID, t1.DATAAUDITNAME, t1.IPADDRESS, t1.OBJECTID, t1.OBJECTTYPE, t1.OPPERSONID, t1.OPPERSONNAME, t1.SESSIONID, t1.UPDATEDATE, t1.UPDATEMAN FROM T_SRFDATAAUDIT t1 ",querycodetemp="",declarecode="",dbtype="POSTGRESQL",
    fieldexps={
        @DEDataQueryCodeExp(name="AUDITINFO",expression="t1.AUDITINFO")
        ,@DEDataQueryCodeExp(name="AUDITTYPE",expression="t1.AUDITTYPE")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="DATAAUDITID",expression="t1.DATAAUDITID")
        ,@DEDataQueryCodeExp(name="DATAAUDITNAME",expression="t1.DATAAUDITNAME")
        ,@DEDataQueryCodeExp(name="IPADDRESS",expression="t1.IPADDRESS")
        ,@DEDataQueryCodeExp(name="OBJECTID",expression="t1.OBJECTID")
        ,@DEDataQueryCodeExp(name="OBJECTTYPE",expression="t1.OBJECTTYPE")
        ,@DEDataQueryCodeExp(name="OPPERSONID",expression="t1.OPPERSONID")
        ,@DEDataQueryCodeExp(name="OPPERSONNAME",expression="t1.OPPERSONNAME")
        ,@DEDataQueryCodeExp(name="SESSIONID",expression="t1.SESSIONID")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.AUDITTYPE, t1.CREATEDATE, t1.CREATEMAN, t1.DATAAUDITID, t1.DATAAUDITNAME, t1.IPADDRESS, t1.OBJECTID, t1.OBJECTTYPE, t1.OPPERSONID, t1.OPPERSONNAME, t1.SESSIONID, t1.UPDATEDATE, t1.UPDATEMAN FROM T_SRFDATAAUDIT t1 ",querycodetemp="",declarecode="",dbtype="PPAS",
    fieldexps={
        @DEDataQueryCodeExp(name="AUDITINFO",expression="t1.AUDITINFO")
        ,@DEDataQueryCodeExp(name="AUDITTYPE",expression="t1.AUDITTYPE")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="DATAAUDITID",expression="t1.DATAAUDITID")
        ,@DEDataQueryCodeExp(name="DATAAUDITNAME",expression="t1.DATAAUDITNAME")
        ,@DEDataQueryCodeExp(name="IPADDRESS",expression="t1.IPADDRESS")
        ,@DEDataQueryCodeExp(name="OBJECTID",expression="t1.OBJECTID")
        ,@DEDataQueryCodeExp(name="OBJECTTYPE",expression="t1.OBJECTTYPE")
        ,@DEDataQueryCodeExp(name="OPPERSONID",expression="t1.OPPERSONID")
        ,@DEDataQueryCodeExp(name="OPPERSONNAME",expression="t1.OPPERSONNAME")
        ,@DEDataQueryCodeExp(name="SESSIONID",expression="t1.SESSIONID")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
    },
    conds={})
})
/**
 *  实体数据查询 [DEFAULT]模型基类
 */
public abstract class DataAuditDefaultDQModelBase extends net.ibizsys.paas.demodel.DEDataQueryModelBase {

    public DataAuditDefaultDQModelBase() {
        super();

        this.initAnnotation(DataAuditDefaultDQModelBase.class);
    }

}