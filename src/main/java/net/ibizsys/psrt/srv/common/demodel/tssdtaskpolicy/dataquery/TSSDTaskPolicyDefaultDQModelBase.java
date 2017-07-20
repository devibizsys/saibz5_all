/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package net.ibizsys.psrt.srv.common.demodel.tssdtaskpolicy.dataquery;



import net.ibizsys.paas.core.DEDataQuery;
import net.ibizsys.paas.core.DEDataQueryCodes;
import net.ibizsys.paas.core.DEDataQueryCode;
import net.ibizsys.paas.core.DEDataQueryCodeExp;
import net.ibizsys.paas.core.DEDataQueryCodeCond;

@DEDataQuery(id="68B1EB5E-1467-484F-AFA4-0A0C1960D0C6",name="DEFAULT")
@DEDataQueryCodes({
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE AS CREATEDATE, t1.CREATEMAN AS CREATEMAN, t1.RESERVER AS RESERVER, t1.RESERVER2 AS RESERVER2, t1.RESERVER3 AS RESERVER3, t1.RESERVER4 AS RESERVER4, t1.TSSDPOLICYID AS TSSDPOLICYID, t11.TSSDPOLICYNAME AS TSSDPOLICYNAME, t1.TSSDTASKID AS TSSDTASKID, t21.TSSDTASKNAME AS TSSDTASKNAME, t1.TSSDTASKPOLICYID AS TSSDTASKPOLICYID, t1.TSSDTASKPOLICYNAME AS TSSDTASKPOLICYNAME, t1.UPDATEDATE AS UPDATEDATE, t1.UPDATEMAN AS UPDATEMAN FROM T_SRFTSSDTASKPOLICY t1  LEFT JOIN T_SRFTSSDPOLICY t11 ON t1.TSSDPOLICYID = t11.TSSDPOLICYID  LEFT JOIN T_SRFTSSDTASK t21 ON t1.TSSDTASKID = t21.TSSDTASKID ",querycodetemp="",declarecode="",dbtype="DB2",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="RESERVER",expression="t1.RESERVER")
        ,@DEDataQueryCodeExp(name="RESERVER2",expression="t1.RESERVER2")
        ,@DEDataQueryCodeExp(name="RESERVER3",expression="t1.RESERVER3")
        ,@DEDataQueryCodeExp(name="RESERVER4",expression="t1.RESERVER4")
        ,@DEDataQueryCodeExp(name="TSSDPOLICYID",expression="t1.TSSDPOLICYID")
        ,@DEDataQueryCodeExp(name="TSSDPOLICYNAME",expression="t11.TSSDPOLICYNAME")
        ,@DEDataQueryCodeExp(name="TSSDTASKID",expression="t1.TSSDTASKID")
        ,@DEDataQueryCodeExp(name="TSSDTASKNAME",expression="t21.TSSDTASKNAME")
        ,@DEDataQueryCodeExp(name="TSSDTASKPOLICYID",expression="t1.TSSDTASKPOLICYID")
        ,@DEDataQueryCodeExp(name="TSSDTASKPOLICYNAME",expression="t1.TSSDTASKPOLICYNAME")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.`CREATEDATE` AS `CREATEDATE`, t1.`CREATEMAN` AS `CREATEMAN`, t1.`RESERVER` AS `RESERVER`, t1.`RESERVER2` AS `RESERVER2`, t1.`RESERVER3` AS `RESERVER3`, t1.`RESERVER4` AS `RESERVER4`, t1.`TSSDPOLICYID` AS `TSSDPOLICYID`, t11.`TSSDPOLICYNAME` AS `TSSDPOLICYNAME`, t1.`TSSDTASKID` AS `TSSDTASKID`, t21.`TSSDTASKNAME` AS `TSSDTASKNAME`, t1.`TSSDTASKPOLICYID` AS `TSSDTASKPOLICYID`, t1.`TSSDTASKPOLICYNAME` AS `TSSDTASKPOLICYNAME`, t1.`UPDATEDATE` AS `UPDATEDATE`, t1.`UPDATEMAN` AS `UPDATEMAN` FROM `T_SRFTSSDTASKPOLICY` t1  LEFT JOIN T_SRFTSSDPOLICY t11 ON t1.TSSDPOLICYID = t11.TSSDPOLICYID  LEFT JOIN T_SRFTSSDTASK t21 ON t1.TSSDTASKID = t21.TSSDTASKID ",querycodetemp="",declarecode="",dbtype="MYSQL5",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.`CREATEDATE`")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.`CREATEMAN`")
        ,@DEDataQueryCodeExp(name="RESERVER",expression="t1.`RESERVER`")
        ,@DEDataQueryCodeExp(name="RESERVER2",expression="t1.`RESERVER2`")
        ,@DEDataQueryCodeExp(name="RESERVER3",expression="t1.`RESERVER3`")
        ,@DEDataQueryCodeExp(name="RESERVER4",expression="t1.`RESERVER4`")
        ,@DEDataQueryCodeExp(name="TSSDPOLICYID",expression="t1.`TSSDPOLICYID`")
        ,@DEDataQueryCodeExp(name="TSSDPOLICYNAME",expression="t11.`TSSDPOLICYNAME`")
        ,@DEDataQueryCodeExp(name="TSSDTASKID",expression="t1.`TSSDTASKID`")
        ,@DEDataQueryCodeExp(name="TSSDTASKNAME",expression="t21.`TSSDTASKNAME`")
        ,@DEDataQueryCodeExp(name="TSSDTASKPOLICYID",expression="t1.`TSSDTASKPOLICYID`")
        ,@DEDataQueryCodeExp(name="TSSDTASKPOLICYNAME",expression="t1.`TSSDTASKPOLICYNAME`")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.`UPDATEDATE`")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.`UPDATEMAN`")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE AS CREATEDATE, t1.CREATEMAN AS CREATEMAN, t1.RESERVER AS RESERVER, t1.RESERVER2 AS RESERVER2, t1.RESERVER3 AS RESERVER3, t1.RESERVER4 AS RESERVER4, t1.TSSDPOLICYID AS TSSDPOLICYID, t11.TSSDPOLICYNAME AS TSSDPOLICYNAME, t1.TSSDTASKID AS TSSDTASKID, t21.TSSDTASKNAME AS TSSDTASKNAME, t1.TSSDTASKPOLICYID AS TSSDTASKPOLICYID, t1.TSSDTASKPOLICYNAME AS TSSDTASKPOLICYNAME, t1.UPDATEDATE AS UPDATEDATE, t1.UPDATEMAN AS UPDATEMAN FROM T_SRFTSSDTASKPOLICY t1  LEFT JOIN T_SRFTSSDPOLICY t11 ON t1.TSSDPOLICYID = t11.TSSDPOLICYID  LEFT JOIN T_SRFTSSDTASK t21 ON t1.TSSDTASKID = t21.TSSDTASKID ",querycodetemp="",declarecode="",dbtype="ORACLE",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="RESERVER",expression="t1.RESERVER")
        ,@DEDataQueryCodeExp(name="RESERVER2",expression="t1.RESERVER2")
        ,@DEDataQueryCodeExp(name="RESERVER3",expression="t1.RESERVER3")
        ,@DEDataQueryCodeExp(name="RESERVER4",expression="t1.RESERVER4")
        ,@DEDataQueryCodeExp(name="TSSDPOLICYID",expression="t1.TSSDPOLICYID")
        ,@DEDataQueryCodeExp(name="TSSDPOLICYNAME",expression="t11.TSSDPOLICYNAME")
        ,@DEDataQueryCodeExp(name="TSSDTASKID",expression="t1.TSSDTASKID")
        ,@DEDataQueryCodeExp(name="TSSDTASKNAME",expression="t21.TSSDTASKNAME")
        ,@DEDataQueryCodeExp(name="TSSDTASKPOLICYID",expression="t1.TSSDTASKPOLICYID")
        ,@DEDataQueryCodeExp(name="TSSDTASKPOLICYNAME",expression="t1.TSSDTASKPOLICYNAME")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.[CREATEDATE] AS [CREATEDATE], t1.[CREATEMAN] AS [CREATEMAN], t1.[RESERVER] AS [RESERVER], t1.[RESERVER2] AS [RESERVER2], t1.[RESERVER3] AS [RESERVER3], t1.[RESERVER4] AS [RESERVER4], t1.[TSSDPOLICYID] AS [TSSDPOLICYID], t11.[TSSDPOLICYNAME] AS [TSSDPOLICYNAME], t1.[TSSDTASKID] AS [TSSDTASKID], t21.[TSSDTASKNAME] AS [TSSDTASKNAME], t1.[TSSDTASKPOLICYID] AS [TSSDTASKPOLICYID], t1.[TSSDTASKPOLICYNAME] AS [TSSDTASKPOLICYNAME], t1.[UPDATEDATE] AS [UPDATEDATE], t1.[UPDATEMAN] AS [UPDATEMAN] FROM [T_SRFTSSDTASKPOLICY] t1  LEFT JOIN T_SRFTSSDPOLICY t11 ON t1.TSSDPOLICYID = t11.TSSDPOLICYID  LEFT JOIN T_SRFTSSDTASK t21 ON t1.TSSDTASKID = t21.TSSDTASKID ",querycodetemp="",declarecode="",dbtype="SQLSERVER",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.[CREATEDATE]")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.[CREATEMAN]")
        ,@DEDataQueryCodeExp(name="RESERVER",expression="t1.[RESERVER]")
        ,@DEDataQueryCodeExp(name="RESERVER2",expression="t1.[RESERVER2]")
        ,@DEDataQueryCodeExp(name="RESERVER3",expression="t1.[RESERVER3]")
        ,@DEDataQueryCodeExp(name="RESERVER4",expression="t1.[RESERVER4]")
        ,@DEDataQueryCodeExp(name="TSSDPOLICYID",expression="t1.[TSSDPOLICYID]")
        ,@DEDataQueryCodeExp(name="TSSDPOLICYNAME",expression="t11.[TSSDPOLICYNAME]")
        ,@DEDataQueryCodeExp(name="TSSDTASKID",expression="t1.[TSSDTASKID]")
        ,@DEDataQueryCodeExp(name="TSSDTASKNAME",expression="t21.[TSSDTASKNAME]")
        ,@DEDataQueryCodeExp(name="TSSDTASKPOLICYID",expression="t1.[TSSDTASKPOLICYID]")
        ,@DEDataQueryCodeExp(name="TSSDTASKPOLICYNAME",expression="t1.[TSSDTASKPOLICYNAME]")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.[UPDATEDATE]")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.[UPDATEMAN]")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE AS CREATEDATE, t1.CREATEMAN AS CREATEMAN, t1.RESERVER AS RESERVER, t1.RESERVER2 AS RESERVER2, t1.RESERVER3 AS RESERVER3, t1.RESERVER4 AS RESERVER4, t1.TSSDPOLICYID AS TSSDPOLICYID, t11.TSSDPOLICYNAME AS TSSDPOLICYNAME, t1.TSSDTASKID AS TSSDTASKID, t21.TSSDTASKNAME AS TSSDTASKNAME, t1.TSSDTASKPOLICYID AS TSSDTASKPOLICYID, t1.TSSDTASKPOLICYNAME AS TSSDTASKPOLICYNAME, t1.UPDATEDATE AS UPDATEDATE, t1.UPDATEMAN AS UPDATEMAN FROM T_SRFTSSDTASKPOLICY t1  LEFT JOIN T_SRFTSSDPOLICY t11 ON t1.TSSDPOLICYID = t11.TSSDPOLICYID  LEFT JOIN T_SRFTSSDTASK t21 ON t1.TSSDTASKID = t21.TSSDTASKID ",querycodetemp="",declarecode="",dbtype="POSTGRESQL",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="RESERVER",expression="t1.RESERVER")
        ,@DEDataQueryCodeExp(name="RESERVER2",expression="t1.RESERVER2")
        ,@DEDataQueryCodeExp(name="RESERVER3",expression="t1.RESERVER3")
        ,@DEDataQueryCodeExp(name="RESERVER4",expression="t1.RESERVER4")
        ,@DEDataQueryCodeExp(name="TSSDPOLICYID",expression="t1.TSSDPOLICYID")
        ,@DEDataQueryCodeExp(name="TSSDPOLICYNAME",expression="t11.TSSDPOLICYNAME")
        ,@DEDataQueryCodeExp(name="TSSDTASKID",expression="t1.TSSDTASKID")
        ,@DEDataQueryCodeExp(name="TSSDTASKNAME",expression="t21.TSSDTASKNAME")
        ,@DEDataQueryCodeExp(name="TSSDTASKPOLICYID",expression="t1.TSSDTASKPOLICYID")
        ,@DEDataQueryCodeExp(name="TSSDTASKPOLICYNAME",expression="t1.TSSDTASKPOLICYNAME")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE AS CREATEDATE, t1.CREATEMAN AS CREATEMAN, t1.RESERVER AS RESERVER, t1.RESERVER2 AS RESERVER2, t1.RESERVER3 AS RESERVER3, t1.RESERVER4 AS RESERVER4, t1.TSSDPOLICYID AS TSSDPOLICYID, t11.TSSDPOLICYNAME AS TSSDPOLICYNAME, t1.TSSDTASKID AS TSSDTASKID, t21.TSSDTASKNAME AS TSSDTASKNAME, t1.TSSDTASKPOLICYID AS TSSDTASKPOLICYID, t1.TSSDTASKPOLICYNAME AS TSSDTASKPOLICYNAME, t1.UPDATEDATE AS UPDATEDATE, t1.UPDATEMAN AS UPDATEMAN FROM T_SRFTSSDTASKPOLICY t1  LEFT JOIN T_SRFTSSDPOLICY t11 ON t1.TSSDPOLICYID = t11.TSSDPOLICYID  LEFT JOIN T_SRFTSSDTASK t21 ON t1.TSSDTASKID = t21.TSSDTASKID ",querycodetemp="",declarecode="",dbtype="PPAS",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="RESERVER",expression="t1.RESERVER")
        ,@DEDataQueryCodeExp(name="RESERVER2",expression="t1.RESERVER2")
        ,@DEDataQueryCodeExp(name="RESERVER3",expression="t1.RESERVER3")
        ,@DEDataQueryCodeExp(name="RESERVER4",expression="t1.RESERVER4")
        ,@DEDataQueryCodeExp(name="TSSDPOLICYID",expression="t1.TSSDPOLICYID")
        ,@DEDataQueryCodeExp(name="TSSDPOLICYNAME",expression="t11.TSSDPOLICYNAME")
        ,@DEDataQueryCodeExp(name="TSSDTASKID",expression="t1.TSSDTASKID")
        ,@DEDataQueryCodeExp(name="TSSDTASKNAME",expression="t21.TSSDTASKNAME")
        ,@DEDataQueryCodeExp(name="TSSDTASKPOLICYID",expression="t1.TSSDTASKPOLICYID")
        ,@DEDataQueryCodeExp(name="TSSDTASKPOLICYNAME",expression="t1.TSSDTASKPOLICYNAME")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
    },
    conds={})
})
/**
 *  实体数据查询 [DEFAULT]模型基类
 */
public abstract class TSSDTaskPolicyDefaultDQModelBase extends net.ibizsys.paas.demodel.DEDataQueryModelBase {

    public TSSDTaskPolicyDefaultDQModelBase() {
        super();

        this.initAnnotation(TSSDTaskPolicyDefaultDQModelBase.class);
    }

}