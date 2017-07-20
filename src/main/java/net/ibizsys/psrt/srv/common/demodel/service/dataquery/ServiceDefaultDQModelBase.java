/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package net.ibizsys.psrt.srv.common.demodel.service.dataquery;



import net.ibizsys.paas.core.DEDataQuery;
import net.ibizsys.paas.core.DEDataQueryCodes;
import net.ibizsys.paas.core.DEDataQueryCode;
import net.ibizsys.paas.core.DEDataQueryCodeExp;
import net.ibizsys.paas.core.DEDataQueryCodeCond;

@DEDataQuery(id="DC4E16C1-57A0-46EE-9DC0-E93377809C3C",name="DEFAULT")
@DEDataQueryCodes({
    @DEDataQueryCode(querycode="SELECT t1.CONTAINER AS CONTAINER, t1.CREATEDATE AS CREATEDATE, t1.CREATEMAN AS CREATEMAN, t1.MEMO AS MEMO, t1.RESERVER AS RESERVER, t1.RUNORDER AS RUNORDER, t1.SERVICEID AS SERVICEID, t1.SERVICENAME AS SERVICENAME, t1.SERVICEOBJECT AS SERVICEOBJECT, t1.SERVICESTATE AS SERVICESTATE, t1.STARTMODE AS STARTMODE, t1.UPDATEDATE AS UPDATEDATE, t1.UPDATEMAN AS UPDATEMAN FROM T_SRFSERVICE t1 ",querycodetemp="",declarecode="",dbtype="DB2",
    fieldexps={
        @DEDataQueryCodeExp(name="ERRORINFO",expression="t1.ERRORINFO")
        ,@DEDataQueryCodeExp(name="SERVICEPARAM",expression="t1.SERVICEPARAM")
        ,@DEDataQueryCodeExp(name="CONTAINER",expression="t1.CONTAINER")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="RESERVER",expression="t1.RESERVER")
        ,@DEDataQueryCodeExp(name="RUNORDER",expression="t1.RUNORDER")
        ,@DEDataQueryCodeExp(name="SERVICEID",expression="t1.SERVICEID")
        ,@DEDataQueryCodeExp(name="SERVICENAME",expression="t1.SERVICENAME")
        ,@DEDataQueryCodeExp(name="SERVICEOBJECT",expression="t1.SERVICEOBJECT")
        ,@DEDataQueryCodeExp(name="SERVICESTATE",expression="t1.SERVICESTATE")
        ,@DEDataQueryCodeExp(name="STARTMODE",expression="t1.STARTMODE")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.`CONTAINER` AS `CONTAINER`, t1.`CREATEDATE` AS `CREATEDATE`, t1.`CREATEMAN` AS `CREATEMAN`, t1.`MEMO` AS `MEMO`, t1.`RESERVER` AS `RESERVER`, t1.`RUNORDER` AS `RUNORDER`, t1.`SERVICEID` AS `SERVICEID`, t1.`SERVICENAME` AS `SERVICENAME`, t1.`SERVICEOBJECT` AS `SERVICEOBJECT`, t1.`SERVICESTATE` AS `SERVICESTATE`, t1.`STARTMODE` AS `STARTMODE`, t1.`UPDATEDATE` AS `UPDATEDATE`, t1.`UPDATEMAN` AS `UPDATEMAN` FROM `T_SRFSERVICE` t1 ",querycodetemp="",declarecode="",dbtype="MYSQL5",
    fieldexps={
        @DEDataQueryCodeExp(name="ERRORINFO",expression="t1.`ERRORINFO`")
        ,@DEDataQueryCodeExp(name="SERVICEPARAM",expression="t1.`SERVICEPARAM`")
        ,@DEDataQueryCodeExp(name="CONTAINER",expression="t1.`CONTAINER`")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.`CREATEDATE`")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.`CREATEMAN`")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.`MEMO`")
        ,@DEDataQueryCodeExp(name="RESERVER",expression="t1.`RESERVER`")
        ,@DEDataQueryCodeExp(name="RUNORDER",expression="t1.`RUNORDER`")
        ,@DEDataQueryCodeExp(name="SERVICEID",expression="t1.`SERVICEID`")
        ,@DEDataQueryCodeExp(name="SERVICENAME",expression="t1.`SERVICENAME`")
        ,@DEDataQueryCodeExp(name="SERVICEOBJECT",expression="t1.`SERVICEOBJECT`")
        ,@DEDataQueryCodeExp(name="SERVICESTATE",expression="t1.`SERVICESTATE`")
        ,@DEDataQueryCodeExp(name="STARTMODE",expression="t1.`STARTMODE`")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.`UPDATEDATE`")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.`UPDATEMAN`")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CONTAINER AS CONTAINER, t1.CREATEDATE AS CREATEDATE, t1.CREATEMAN AS CREATEMAN, t1.MEMO AS MEMO, t1.RESERVER AS RESERVER, t1.RUNORDER AS RUNORDER, t1.SERVICEID AS SERVICEID, t1.SERVICENAME AS SERVICENAME, t1.SERVICEOBJECT AS SERVICEOBJECT, t1.SERVICESTATE AS SERVICESTATE, t1.STARTMODE AS STARTMODE, t1.UPDATEDATE AS UPDATEDATE, t1.UPDATEMAN AS UPDATEMAN FROM T_SRFSERVICE t1 ",querycodetemp="",declarecode="",dbtype="ORACLE",
    fieldexps={
        @DEDataQueryCodeExp(name="ERRORINFO",expression="t1.ERRORINFO")
        ,@DEDataQueryCodeExp(name="SERVICEPARAM",expression="t1.SERVICEPARAM")
        ,@DEDataQueryCodeExp(name="CONTAINER",expression="t1.CONTAINER")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="RESERVER",expression="t1.RESERVER")
        ,@DEDataQueryCodeExp(name="RUNORDER",expression="t1.RUNORDER")
        ,@DEDataQueryCodeExp(name="SERVICEID",expression="t1.SERVICEID")
        ,@DEDataQueryCodeExp(name="SERVICENAME",expression="t1.SERVICENAME")
        ,@DEDataQueryCodeExp(name="SERVICEOBJECT",expression="t1.SERVICEOBJECT")
        ,@DEDataQueryCodeExp(name="SERVICESTATE",expression="t1.SERVICESTATE")
        ,@DEDataQueryCodeExp(name="STARTMODE",expression="t1.STARTMODE")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.[CONTAINER] AS [CONTAINER], t1.[CREATEDATE] AS [CREATEDATE], t1.[CREATEMAN] AS [CREATEMAN], t1.[MEMO] AS [MEMO], t1.[RESERVER] AS [RESERVER], t1.[RUNORDER] AS [RUNORDER], t1.[SERVICEID] AS [SERVICEID], t1.[SERVICENAME] AS [SERVICENAME], t1.[SERVICEOBJECT] AS [SERVICEOBJECT], t1.[SERVICESTATE] AS [SERVICESTATE], t1.[STARTMODE] AS [STARTMODE], t1.[UPDATEDATE] AS [UPDATEDATE], t1.[UPDATEMAN] AS [UPDATEMAN] FROM [T_SRFSERVICE] t1 ",querycodetemp="",declarecode="",dbtype="SQLSERVER",
    fieldexps={
        @DEDataQueryCodeExp(name="ERRORINFO",expression="t1.[ERRORINFO]")
        ,@DEDataQueryCodeExp(name="SERVICEPARAM",expression="t1.[SERVICEPARAM]")
        ,@DEDataQueryCodeExp(name="CONTAINER",expression="t1.[CONTAINER]")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.[CREATEDATE]")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.[CREATEMAN]")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.[MEMO]")
        ,@DEDataQueryCodeExp(name="RESERVER",expression="t1.[RESERVER]")
        ,@DEDataQueryCodeExp(name="RUNORDER",expression="t1.[RUNORDER]")
        ,@DEDataQueryCodeExp(name="SERVICEID",expression="t1.[SERVICEID]")
        ,@DEDataQueryCodeExp(name="SERVICENAME",expression="t1.[SERVICENAME]")
        ,@DEDataQueryCodeExp(name="SERVICEOBJECT",expression="t1.[SERVICEOBJECT]")
        ,@DEDataQueryCodeExp(name="SERVICESTATE",expression="t1.[SERVICESTATE]")
        ,@DEDataQueryCodeExp(name="STARTMODE",expression="t1.[STARTMODE]")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.[UPDATEDATE]")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.[UPDATEMAN]")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CONTAINER AS CONTAINER, t1.CREATEDATE AS CREATEDATE, t1.CREATEMAN AS CREATEMAN, t1.MEMO AS MEMO, t1.RESERVER AS RESERVER, t1.RUNORDER AS RUNORDER, t1.SERVICEID AS SERVICEID, t1.SERVICENAME AS SERVICENAME, t1.SERVICEOBJECT AS SERVICEOBJECT, t1.SERVICESTATE AS SERVICESTATE, t1.STARTMODE AS STARTMODE, t1.UPDATEDATE AS UPDATEDATE, t1.UPDATEMAN AS UPDATEMAN FROM T_SRFSERVICE t1 ",querycodetemp="",declarecode="",dbtype="POSTGRESQL",
    fieldexps={
        @DEDataQueryCodeExp(name="ERRORINFO",expression="t1.ERRORINFO")
        ,@DEDataQueryCodeExp(name="SERVICEPARAM",expression="t1.SERVICEPARAM")
        ,@DEDataQueryCodeExp(name="CONTAINER",expression="t1.CONTAINER")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="RESERVER",expression="t1.RESERVER")
        ,@DEDataQueryCodeExp(name="RUNORDER",expression="t1.RUNORDER")
        ,@DEDataQueryCodeExp(name="SERVICEID",expression="t1.SERVICEID")
        ,@DEDataQueryCodeExp(name="SERVICENAME",expression="t1.SERVICENAME")
        ,@DEDataQueryCodeExp(name="SERVICEOBJECT",expression="t1.SERVICEOBJECT")
        ,@DEDataQueryCodeExp(name="SERVICESTATE",expression="t1.SERVICESTATE")
        ,@DEDataQueryCodeExp(name="STARTMODE",expression="t1.STARTMODE")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CONTAINER AS CONTAINER, t1.CREATEDATE AS CREATEDATE, t1.CREATEMAN AS CREATEMAN, t1.MEMO AS MEMO, t1.RESERVER AS RESERVER, t1.RUNORDER AS RUNORDER, t1.SERVICEID AS SERVICEID, t1.SERVICENAME AS SERVICENAME, t1.SERVICEOBJECT AS SERVICEOBJECT, t1.SERVICESTATE AS SERVICESTATE, t1.STARTMODE AS STARTMODE, t1.UPDATEDATE AS UPDATEDATE, t1.UPDATEMAN AS UPDATEMAN FROM T_SRFSERVICE t1 ",querycodetemp="",declarecode="",dbtype="PPAS",
    fieldexps={
        @DEDataQueryCodeExp(name="ERRORINFO",expression="t1.ERRORINFO")
        ,@DEDataQueryCodeExp(name="SERVICEPARAM",expression="t1.SERVICEPARAM")
        ,@DEDataQueryCodeExp(name="CONTAINER",expression="t1.CONTAINER")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="RESERVER",expression="t1.RESERVER")
        ,@DEDataQueryCodeExp(name="RUNORDER",expression="t1.RUNORDER")
        ,@DEDataQueryCodeExp(name="SERVICEID",expression="t1.SERVICEID")
        ,@DEDataQueryCodeExp(name="SERVICENAME",expression="t1.SERVICENAME")
        ,@DEDataQueryCodeExp(name="SERVICEOBJECT",expression="t1.SERVICEOBJECT")
        ,@DEDataQueryCodeExp(name="SERVICESTATE",expression="t1.SERVICESTATE")
        ,@DEDataQueryCodeExp(name="STARTMODE",expression="t1.STARTMODE")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
    },
    conds={})
})
/**
 *  实体数据查询 [DEFAULT]模型基类
 */
public abstract class ServiceDefaultDQModelBase extends net.ibizsys.paas.demodel.DEDataQueryModelBase {

    public ServiceDefaultDQModelBase() {
        super();

        this.initAnnotation(ServiceDefaultDQModelBase.class);
    }

}