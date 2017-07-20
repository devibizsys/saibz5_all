/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package net.ibizsys.psrt.srv.wf.demodel.wfaction.dataquery;



import net.ibizsys.paas.core.DEDataQuery;
import net.ibizsys.paas.core.DEDataQueryCodes;
import net.ibizsys.paas.core.DEDataQueryCode;
import net.ibizsys.paas.core.DEDataQueryCodeExp;
import net.ibizsys.paas.core.DEDataQueryCodeCond;

@DEDataQuery(id="6FA5FC43-842A-4744-89A6-3FFD49A54B9B",name="DEFAULT")
@DEDataQueryCodes({
    @DEDataQueryCode(querycode="SELECT t1.ACTIONCODE AS ACTIONCODE, t1.CREATEDATE AS CREATEDATE, t1.CREATEMAN AS CREATEMAN, t1.MEMO AS MEMO, t1.UPDATEDATE AS UPDATEDATE, t1.UPDATEMAN AS UPDATEMAN, t1.WFACTIONID AS WFACTIONID, t1.WFACTIONNAME AS WFACTIONNAME, t1.WFWORKFLOWID AS WFWORKFLOWID, t11.WFWORKFLOWNAME AS WFWORKFLOWNAME FROM T_SRFWFACTION t1  LEFT JOIN T_SRFWFWORKFLOW t11 ON t1.WFWORKFLOWID = t11.WFWORKFLOWID ",querycodetemp="",declarecode="",dbtype="DB2",
    fieldexps={
        @DEDataQueryCodeExp(name="ACTIONCODE",expression="t1.ACTIONCODE")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="WFACTIONID",expression="t1.WFACTIONID")
        ,@DEDataQueryCodeExp(name="WFACTIONNAME",expression="t1.WFACTIONNAME")
        ,@DEDataQueryCodeExp(name="WFWORKFLOWID",expression="t1.WFWORKFLOWID")
        ,@DEDataQueryCodeExp(name="WFWORKFLOWNAME",expression="t11.WFWORKFLOWNAME")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.`ACTIONCODE` AS `ACTIONCODE`, t1.`CREATEDATE` AS `CREATEDATE`, t1.`CREATEMAN` AS `CREATEMAN`, t1.`MEMO` AS `MEMO`, t1.`UPDATEDATE` AS `UPDATEDATE`, t1.`UPDATEMAN` AS `UPDATEMAN`, t1.`WFACTIONID` AS `WFACTIONID`, t1.`WFACTIONNAME` AS `WFACTIONNAME`, t1.`WFWORKFLOWID` AS `WFWORKFLOWID`, t11.`WFWORKFLOWNAME` AS `WFWORKFLOWNAME` FROM `T_SRFWFACTION` t1  LEFT JOIN T_SRFWFWORKFLOW t11 ON t1.WFWORKFLOWID = t11.WFWORKFLOWID ",querycodetemp="",declarecode="",dbtype="MYSQL5",
    fieldexps={
        @DEDataQueryCodeExp(name="ACTIONCODE",expression="t1.`ACTIONCODE`")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.`CREATEDATE`")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.`CREATEMAN`")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.`MEMO`")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.`UPDATEDATE`")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.`UPDATEMAN`")
        ,@DEDataQueryCodeExp(name="WFACTIONID",expression="t1.`WFACTIONID`")
        ,@DEDataQueryCodeExp(name="WFACTIONNAME",expression="t1.`WFACTIONNAME`")
        ,@DEDataQueryCodeExp(name="WFWORKFLOWID",expression="t1.`WFWORKFLOWID`")
        ,@DEDataQueryCodeExp(name="WFWORKFLOWNAME",expression="t11.`WFWORKFLOWNAME`")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.ACTIONCODE AS ACTIONCODE, t1.CREATEDATE AS CREATEDATE, t1.CREATEMAN AS CREATEMAN, t1.MEMO AS MEMO, t1.UPDATEDATE AS UPDATEDATE, t1.UPDATEMAN AS UPDATEMAN, t1.WFACTIONID AS WFACTIONID, t1.WFACTIONNAME AS WFACTIONNAME, t1.WFWORKFLOWID AS WFWORKFLOWID, t11.WFWORKFLOWNAME AS WFWORKFLOWNAME FROM T_SRFWFACTION t1  LEFT JOIN T_SRFWFWORKFLOW t11 ON t1.WFWORKFLOWID = t11.WFWORKFLOWID ",querycodetemp="",declarecode="",dbtype="ORACLE",
    fieldexps={
        @DEDataQueryCodeExp(name="ACTIONCODE",expression="t1.ACTIONCODE")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="WFACTIONID",expression="t1.WFACTIONID")
        ,@DEDataQueryCodeExp(name="WFACTIONNAME",expression="t1.WFACTIONNAME")
        ,@DEDataQueryCodeExp(name="WFWORKFLOWID",expression="t1.WFWORKFLOWID")
        ,@DEDataQueryCodeExp(name="WFWORKFLOWNAME",expression="t11.WFWORKFLOWNAME")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.[ACTIONCODE] AS [ACTIONCODE], t1.[CREATEDATE] AS [CREATEDATE], t1.[CREATEMAN] AS [CREATEMAN], t1.[MEMO] AS [MEMO], t1.[UPDATEDATE] AS [UPDATEDATE], t1.[UPDATEMAN] AS [UPDATEMAN], t1.[WFACTIONID] AS [WFACTIONID], t1.[WFACTIONNAME] AS [WFACTIONNAME], t1.[WFWORKFLOWID] AS [WFWORKFLOWID], t11.[WFWORKFLOWNAME] AS [WFWORKFLOWNAME] FROM [T_SRFWFACTION] t1  LEFT JOIN T_SRFWFWORKFLOW t11 ON t1.WFWORKFLOWID = t11.WFWORKFLOWID ",querycodetemp="",declarecode="",dbtype="SQLSERVER",
    fieldexps={
        @DEDataQueryCodeExp(name="ACTIONCODE",expression="t1.[ACTIONCODE]")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.[CREATEDATE]")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.[CREATEMAN]")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.[MEMO]")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.[UPDATEDATE]")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.[UPDATEMAN]")
        ,@DEDataQueryCodeExp(name="WFACTIONID",expression="t1.[WFACTIONID]")
        ,@DEDataQueryCodeExp(name="WFACTIONNAME",expression="t1.[WFACTIONNAME]")
        ,@DEDataQueryCodeExp(name="WFWORKFLOWID",expression="t1.[WFWORKFLOWID]")
        ,@DEDataQueryCodeExp(name="WFWORKFLOWNAME",expression="t11.[WFWORKFLOWNAME]")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.ACTIONCODE AS ACTIONCODE, t1.CREATEDATE AS CREATEDATE, t1.CREATEMAN AS CREATEMAN, t1.MEMO AS MEMO, t1.UPDATEDATE AS UPDATEDATE, t1.UPDATEMAN AS UPDATEMAN, t1.WFACTIONID AS WFACTIONID, t1.WFACTIONNAME AS WFACTIONNAME, t1.WFWORKFLOWID AS WFWORKFLOWID, t11.WFWORKFLOWNAME AS WFWORKFLOWNAME FROM T_SRFWFACTION t1  LEFT JOIN T_SRFWFWORKFLOW t11 ON t1.WFWORKFLOWID = t11.WFWORKFLOWID ",querycodetemp="",declarecode="",dbtype="POSTGRESQL",
    fieldexps={
        @DEDataQueryCodeExp(name="ACTIONCODE",expression="t1.ACTIONCODE")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="WFACTIONID",expression="t1.WFACTIONID")
        ,@DEDataQueryCodeExp(name="WFACTIONNAME",expression="t1.WFACTIONNAME")
        ,@DEDataQueryCodeExp(name="WFWORKFLOWID",expression="t1.WFWORKFLOWID")
        ,@DEDataQueryCodeExp(name="WFWORKFLOWNAME",expression="t11.WFWORKFLOWNAME")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.ACTIONCODE AS ACTIONCODE, t1.CREATEDATE AS CREATEDATE, t1.CREATEMAN AS CREATEMAN, t1.MEMO AS MEMO, t1.UPDATEDATE AS UPDATEDATE, t1.UPDATEMAN AS UPDATEMAN, t1.WFACTIONID AS WFACTIONID, t1.WFACTIONNAME AS WFACTIONNAME, t1.WFWORKFLOWID AS WFWORKFLOWID, t11.WFWORKFLOWNAME AS WFWORKFLOWNAME FROM T_SRFWFACTION t1  LEFT JOIN T_SRFWFWORKFLOW t11 ON t1.WFWORKFLOWID = t11.WFWORKFLOWID ",querycodetemp="",declarecode="",dbtype="PPAS",
    fieldexps={
        @DEDataQueryCodeExp(name="ACTIONCODE",expression="t1.ACTIONCODE")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="WFACTIONID",expression="t1.WFACTIONID")
        ,@DEDataQueryCodeExp(name="WFACTIONNAME",expression="t1.WFACTIONNAME")
        ,@DEDataQueryCodeExp(name="WFWORKFLOWID",expression="t1.WFWORKFLOWID")
        ,@DEDataQueryCodeExp(name="WFWORKFLOWNAME",expression="t11.WFWORKFLOWNAME")
    },
    conds={})
})
/**
 *  实体数据查询 [DEFAULT]模型基类
 */
public abstract class WFActionDefaultDQModelBase extends net.ibizsys.paas.demodel.DEDataQueryModelBase {

    public WFActionDefaultDQModelBase() {
        super();

        this.initAnnotation(WFActionDefaultDQModelBase.class);
    }

}