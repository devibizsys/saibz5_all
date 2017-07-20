/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package net.ibizsys.psrt.srv.common.demodel.userroledataaction.dataquery;



import net.ibizsys.paas.core.DEDataQuery;
import net.ibizsys.paas.core.DEDataQueryCodes;
import net.ibizsys.paas.core.DEDataQueryCode;
import net.ibizsys.paas.core.DEDataQueryCodeExp;
import net.ibizsys.paas.core.DEDataQueryCodeCond;

@DEDataQuery(id="3A41BF9E-27B8-4FD6-82C9-819BC202ECDF",name="DEFAULT")
@DEDataQueryCodes({
    @DEDataQueryCode(querycode="SELECT t1.`CREATEDATE` AS `CREATEDATE`, t1.`CREATEMAN` AS `CREATEMAN`, t1.`ISALLOW` AS `ISALLOW`, t1.`RESERVER` AS `RESERVER`, t1.`RESERVER2` AS `RESERVER2`, t1.`RESERVER3` AS `RESERVER3`, t1.`RESERVER4` AS `RESERVER4`, t1.`UPDATEDATE` AS `UPDATEDATE`, t1.`UPDATEMAN` AS `UPDATEMAN`, t1.`USERROLEDATAACTIONID` AS `USERROLEDATAACTIONID`, t1.`USERROLEDATAACTIONNAME` AS `USERROLEDATAACTIONNAME`, t1.`USERROLEDATAID` AS `USERROLEDATAID`, t11.`USERROLEDATANAME` AS `USERROLEDATANAME` FROM `T_SRFUSERROLEDATAACTION` t1  LEFT JOIN T_SRFUSERROLEDATA t11 ON t1.USERROLEDATAID = t11.USERROLEDATAID ",querycodetemp="",declarecode="",dbtype="MYSQL5",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.`CREATEDATE`")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.`CREATEMAN`")
        ,@DEDataQueryCodeExp(name="ISALLOW",expression="t1.`ISALLOW`")
        ,@DEDataQueryCodeExp(name="RESERVER",expression="t1.`RESERVER`")
        ,@DEDataQueryCodeExp(name="RESERVER2",expression="t1.`RESERVER2`")
        ,@DEDataQueryCodeExp(name="RESERVER3",expression="t1.`RESERVER3`")
        ,@DEDataQueryCodeExp(name="RESERVER4",expression="t1.`RESERVER4`")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.`UPDATEDATE`")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.`UPDATEMAN`")
        ,@DEDataQueryCodeExp(name="USERROLEDATAACTIONID",expression="t1.`USERROLEDATAACTIONID`")
        ,@DEDataQueryCodeExp(name="USERROLEDATAACTIONNAME",expression="t1.`USERROLEDATAACTIONNAME`")
        ,@DEDataQueryCodeExp(name="USERROLEDATAID",expression="t1.`USERROLEDATAID`")
        ,@DEDataQueryCodeExp(name="USERROLEDATANAME",expression="t11.`USERROLEDATANAME`")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE AS CREATEDATE, t1.CREATEMAN AS CREATEMAN, t1.ISALLOW AS ISALLOW, t1.RESERVER AS RESERVER, t1.RESERVER2 AS RESERVER2, t1.RESERVER3 AS RESERVER3, t1.RESERVER4 AS RESERVER4, t1.UPDATEDATE AS UPDATEDATE, t1.UPDATEMAN AS UPDATEMAN, t1.USERROLEDATAACTIONID AS USERROLEDATAACTIONID, t1.USERROLEDATAACTIONNAME AS USERROLEDATAACTIONNAME, t1.USERROLEDATAID AS USERROLEDATAID, t11.USERROLEDATANAME AS USERROLEDATANAME FROM T_SRFUSERROLEDATAACTION t1  LEFT JOIN T_SRFUSERROLEDATA t11 ON t1.USERROLEDATAID = t11.USERROLEDATAID ",querycodetemp="",declarecode="",dbtype="DB2",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="ISALLOW",expression="t1.ISALLOW")
        ,@DEDataQueryCodeExp(name="RESERVER",expression="t1.RESERVER")
        ,@DEDataQueryCodeExp(name="RESERVER2",expression="t1.RESERVER2")
        ,@DEDataQueryCodeExp(name="RESERVER3",expression="t1.RESERVER3")
        ,@DEDataQueryCodeExp(name="RESERVER4",expression="t1.RESERVER4")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="USERROLEDATAACTIONID",expression="t1.USERROLEDATAACTIONID")
        ,@DEDataQueryCodeExp(name="USERROLEDATAACTIONNAME",expression="t1.USERROLEDATAACTIONNAME")
        ,@DEDataQueryCodeExp(name="USERROLEDATAID",expression="t1.USERROLEDATAID")
        ,@DEDataQueryCodeExp(name="USERROLEDATANAME",expression="t11.USERROLEDATANAME")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE AS CREATEDATE, t1.CREATEMAN AS CREATEMAN, t1.ISALLOW AS ISALLOW, t1.RESERVER AS RESERVER, t1.RESERVER2 AS RESERVER2, t1.RESERVER3 AS RESERVER3, t1.RESERVER4 AS RESERVER4, t1.UPDATEDATE AS UPDATEDATE, t1.UPDATEMAN AS UPDATEMAN, t1.USERROLEDATAACTIONID AS USERROLEDATAACTIONID, t1.USERROLEDATAACTIONNAME AS USERROLEDATAACTIONNAME, t1.USERROLEDATAID AS USERROLEDATAID, t11.USERROLEDATANAME AS USERROLEDATANAME FROM T_SRFUSERROLEDATAACTION t1  LEFT JOIN T_SRFUSERROLEDATA t11 ON t1.USERROLEDATAID = t11.USERROLEDATAID ",querycodetemp="",declarecode="",dbtype="ORACLE",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="ISALLOW",expression="t1.ISALLOW")
        ,@DEDataQueryCodeExp(name="RESERVER",expression="t1.RESERVER")
        ,@DEDataQueryCodeExp(name="RESERVER2",expression="t1.RESERVER2")
        ,@DEDataQueryCodeExp(name="RESERVER3",expression="t1.RESERVER3")
        ,@DEDataQueryCodeExp(name="RESERVER4",expression="t1.RESERVER4")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="USERROLEDATAACTIONID",expression="t1.USERROLEDATAACTIONID")
        ,@DEDataQueryCodeExp(name="USERROLEDATAACTIONNAME",expression="t1.USERROLEDATAACTIONNAME")
        ,@DEDataQueryCodeExp(name="USERROLEDATAID",expression="t1.USERROLEDATAID")
        ,@DEDataQueryCodeExp(name="USERROLEDATANAME",expression="t11.USERROLEDATANAME")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.[CREATEDATE] AS [CREATEDATE], t1.[CREATEMAN] AS [CREATEMAN], t1.[ISALLOW] AS [ISALLOW], t1.[RESERVER] AS [RESERVER], t1.[RESERVER2] AS [RESERVER2], t1.[RESERVER3] AS [RESERVER3], t1.[RESERVER4] AS [RESERVER4], t1.[UPDATEDATE] AS [UPDATEDATE], t1.[UPDATEMAN] AS [UPDATEMAN], t1.[USERROLEDATAACTIONID] AS [USERROLEDATAACTIONID], t1.[USERROLEDATAACTIONNAME] AS [USERROLEDATAACTIONNAME], t1.[USERROLEDATAID] AS [USERROLEDATAID], t11.[USERROLEDATANAME] AS [USERROLEDATANAME] FROM [T_SRFUSERROLEDATAACTION] t1  LEFT JOIN T_SRFUSERROLEDATA t11 ON t1.USERROLEDATAID = t11.USERROLEDATAID ",querycodetemp="",declarecode="",dbtype="SQLSERVER",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.[CREATEDATE]")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.[CREATEMAN]")
        ,@DEDataQueryCodeExp(name="ISALLOW",expression="t1.[ISALLOW]")
        ,@DEDataQueryCodeExp(name="RESERVER",expression="t1.[RESERVER]")
        ,@DEDataQueryCodeExp(name="RESERVER2",expression="t1.[RESERVER2]")
        ,@DEDataQueryCodeExp(name="RESERVER3",expression="t1.[RESERVER3]")
        ,@DEDataQueryCodeExp(name="RESERVER4",expression="t1.[RESERVER4]")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.[UPDATEDATE]")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.[UPDATEMAN]")
        ,@DEDataQueryCodeExp(name="USERROLEDATAACTIONID",expression="t1.[USERROLEDATAACTIONID]")
        ,@DEDataQueryCodeExp(name="USERROLEDATAACTIONNAME",expression="t1.[USERROLEDATAACTIONNAME]")
        ,@DEDataQueryCodeExp(name="USERROLEDATAID",expression="t1.[USERROLEDATAID]")
        ,@DEDataQueryCodeExp(name="USERROLEDATANAME",expression="t11.[USERROLEDATANAME]")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE AS CREATEDATE, t1.CREATEMAN AS CREATEMAN, t1.ISALLOW AS ISALLOW, t1.RESERVER AS RESERVER, t1.RESERVER2 AS RESERVER2, t1.RESERVER3 AS RESERVER3, t1.RESERVER4 AS RESERVER4, t1.UPDATEDATE AS UPDATEDATE, t1.UPDATEMAN AS UPDATEMAN, t1.USERROLEDATAACTIONID AS USERROLEDATAACTIONID, t1.USERROLEDATAACTIONNAME AS USERROLEDATAACTIONNAME, t1.USERROLEDATAID AS USERROLEDATAID, t11.USERROLEDATANAME AS USERROLEDATANAME FROM T_SRFUSERROLEDATAACTION t1  LEFT JOIN T_SRFUSERROLEDATA t11 ON t1.USERROLEDATAID = t11.USERROLEDATAID ",querycodetemp="",declarecode="",dbtype="POSTGRESQL",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="ISALLOW",expression="t1.ISALLOW")
        ,@DEDataQueryCodeExp(name="RESERVER",expression="t1.RESERVER")
        ,@DEDataQueryCodeExp(name="RESERVER2",expression="t1.RESERVER2")
        ,@DEDataQueryCodeExp(name="RESERVER3",expression="t1.RESERVER3")
        ,@DEDataQueryCodeExp(name="RESERVER4",expression="t1.RESERVER4")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="USERROLEDATAACTIONID",expression="t1.USERROLEDATAACTIONID")
        ,@DEDataQueryCodeExp(name="USERROLEDATAACTIONNAME",expression="t1.USERROLEDATAACTIONNAME")
        ,@DEDataQueryCodeExp(name="USERROLEDATAID",expression="t1.USERROLEDATAID")
        ,@DEDataQueryCodeExp(name="USERROLEDATANAME",expression="t11.USERROLEDATANAME")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE AS CREATEDATE, t1.CREATEMAN AS CREATEMAN, t1.ISALLOW AS ISALLOW, t1.RESERVER AS RESERVER, t1.RESERVER2 AS RESERVER2, t1.RESERVER3 AS RESERVER3, t1.RESERVER4 AS RESERVER4, t1.UPDATEDATE AS UPDATEDATE, t1.UPDATEMAN AS UPDATEMAN, t1.USERROLEDATAACTIONID AS USERROLEDATAACTIONID, t1.USERROLEDATAACTIONNAME AS USERROLEDATAACTIONNAME, t1.USERROLEDATAID AS USERROLEDATAID, t11.USERROLEDATANAME AS USERROLEDATANAME FROM T_SRFUSERROLEDATAACTION t1  LEFT JOIN T_SRFUSERROLEDATA t11 ON t1.USERROLEDATAID = t11.USERROLEDATAID ",querycodetemp="",declarecode="",dbtype="PPAS",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="ISALLOW",expression="t1.ISALLOW")
        ,@DEDataQueryCodeExp(name="RESERVER",expression="t1.RESERVER")
        ,@DEDataQueryCodeExp(name="RESERVER2",expression="t1.RESERVER2")
        ,@DEDataQueryCodeExp(name="RESERVER3",expression="t1.RESERVER3")
        ,@DEDataQueryCodeExp(name="RESERVER4",expression="t1.RESERVER4")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="USERROLEDATAACTIONID",expression="t1.USERROLEDATAACTIONID")
        ,@DEDataQueryCodeExp(name="USERROLEDATAACTIONNAME",expression="t1.USERROLEDATAACTIONNAME")
        ,@DEDataQueryCodeExp(name="USERROLEDATAID",expression="t1.USERROLEDATAID")
        ,@DEDataQueryCodeExp(name="USERROLEDATANAME",expression="t11.USERROLEDATANAME")
    },
    conds={})
})
/**
 *  实体数据查询 [DEFAULT]模型基类
 */
public abstract class UserRoleDataActionDefaultDQModelBase extends net.ibizsys.paas.demodel.DEDataQueryModelBase {

    public UserRoleDataActionDefaultDQModelBase() {
        super();

        this.initAnnotation(UserRoleDataActionDefaultDQModelBase.class);
    }

}