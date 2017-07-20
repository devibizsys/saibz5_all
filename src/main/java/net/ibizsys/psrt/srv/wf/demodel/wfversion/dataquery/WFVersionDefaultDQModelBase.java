/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package net.ibizsys.psrt.srv.wf.demodel.wfversion.dataquery;



import net.ibizsys.paas.core.DEDataQuery;
import net.ibizsys.paas.core.DEDataQueryCodes;
import net.ibizsys.paas.core.DEDataQueryCode;
import net.ibizsys.paas.core.DEDataQueryCodeExp;
import net.ibizsys.paas.core.DEDataQueryCodeCond;

@DEDataQuery(id="FBE320B4-2982-47F7-BB0D-EC7F21E4EF12",name="DEFAULT")
@DEDataQueryCodes({
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE AS CREATEDATE, t1.CREATEMAN AS CREATEMAN, t1.UPDATEDATE AS UPDATEDATE, t1.UPDATEMAN AS UPDATEMAN, t1.WFVERSION AS WFVERSION, t1.WFWFID AS WFWFID, t11.WFWORKFLOWNAME AS WFWFNAME, t1.WFWFVERSIONID AS WFWFVERSIONID, t1.WFWFVERSIONNAME AS WFWFVERSIONNAME FROM T_SRFWFWFVERSION t1  LEFT JOIN T_SRFWFWORKFLOW t11 ON t1.WFWFID = t11.WFWORKFLOWID ",querycodetemp="",declarecode="",dbtype="DB2",
    fieldexps={
        @DEDataQueryCodeExp(name="WFMODEL",expression="t1.WFMODEL")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="WFVERSION",expression="t1.WFVERSION")
        ,@DEDataQueryCodeExp(name="WFWFID",expression="t1.WFWFID")
        ,@DEDataQueryCodeExp(name="WFWFNAME",expression="t11.WFWORKFLOWNAME")
        ,@DEDataQueryCodeExp(name="WFWFVERSIONID",expression="t1.WFWFVERSIONID")
        ,@DEDataQueryCodeExp(name="WFWFVERSIONNAME",expression="t1.WFWFVERSIONNAME")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.`CREATEDATE` AS `CREATEDATE`, t1.`CREATEMAN` AS `CREATEMAN`, t1.`UPDATEDATE` AS `UPDATEDATE`, t1.`UPDATEMAN` AS `UPDATEMAN`, t1.`WFVERSION` AS `WFVERSION`, t1.`WFWFID` AS `WFWFID`, t11.`WFWORKFLOWNAME` AS `WFWFNAME`, t1.`WFWFVERSIONID` AS `WFWFVERSIONID`, t1.`WFWFVERSIONNAME` AS `WFWFVERSIONNAME` FROM `T_SRFWFWFVERSION` t1  LEFT JOIN T_SRFWFWORKFLOW t11 ON t1.WFWFID = t11.WFWORKFLOWID ",querycodetemp="",declarecode="",dbtype="MYSQL5",
    fieldexps={
        @DEDataQueryCodeExp(name="WFMODEL",expression="t1.`WFMODEL`")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.`CREATEDATE`")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.`CREATEMAN`")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.`UPDATEDATE`")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.`UPDATEMAN`")
        ,@DEDataQueryCodeExp(name="WFVERSION",expression="t1.`WFVERSION`")
        ,@DEDataQueryCodeExp(name="WFWFID",expression="t1.`WFWFID`")
        ,@DEDataQueryCodeExp(name="WFWFNAME",expression="t11.`WFWORKFLOWNAME`")
        ,@DEDataQueryCodeExp(name="WFWFVERSIONID",expression="t1.`WFWFVERSIONID`")
        ,@DEDataQueryCodeExp(name="WFWFVERSIONNAME",expression="t1.`WFWFVERSIONNAME`")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE AS CREATEDATE, t1.CREATEMAN AS CREATEMAN, t1.UPDATEDATE AS UPDATEDATE, t1.UPDATEMAN AS UPDATEMAN, t1.WFVERSION AS WFVERSION, t1.WFWFID AS WFWFID, t11.WFWORKFLOWNAME AS WFWFNAME, t1.WFWFVERSIONID AS WFWFVERSIONID, t1.WFWFVERSIONNAME AS WFWFVERSIONNAME FROM T_SRFWFWFVERSION t1  LEFT JOIN T_SRFWFWORKFLOW t11 ON t1.WFWFID = t11.WFWORKFLOWID ",querycodetemp="",declarecode="",dbtype="ORACLE",
    fieldexps={
        @DEDataQueryCodeExp(name="WFMODEL",expression="t1.WFMODEL")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="WFVERSION",expression="t1.WFVERSION")
        ,@DEDataQueryCodeExp(name="WFWFID",expression="t1.WFWFID")
        ,@DEDataQueryCodeExp(name="WFWFNAME",expression="t11.WFWORKFLOWNAME")
        ,@DEDataQueryCodeExp(name="WFWFVERSIONID",expression="t1.WFWFVERSIONID")
        ,@DEDataQueryCodeExp(name="WFWFVERSIONNAME",expression="t1.WFWFVERSIONNAME")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.[CREATEDATE] AS [CREATEDATE], t1.[CREATEMAN] AS [CREATEMAN], t1.[UPDATEDATE] AS [UPDATEDATE], t1.[UPDATEMAN] AS [UPDATEMAN], t1.[WFVERSION] AS [WFVERSION], t1.[WFWFID] AS [WFWFID], t11.[WFWORKFLOWNAME] AS [WFWFNAME], t1.[WFWFVERSIONID] AS [WFWFVERSIONID], t1.[WFWFVERSIONNAME] AS [WFWFVERSIONNAME] FROM [T_SRFWFWFVERSION] t1  LEFT JOIN T_SRFWFWORKFLOW t11 ON t1.WFWFID = t11.WFWORKFLOWID ",querycodetemp="",declarecode="",dbtype="SQLSERVER",
    fieldexps={
        @DEDataQueryCodeExp(name="WFMODEL",expression="t1.[WFMODEL]")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.[CREATEDATE]")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.[CREATEMAN]")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.[UPDATEDATE]")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.[UPDATEMAN]")
        ,@DEDataQueryCodeExp(name="WFVERSION",expression="t1.[WFVERSION]")
        ,@DEDataQueryCodeExp(name="WFWFID",expression="t1.[WFWFID]")
        ,@DEDataQueryCodeExp(name="WFWFNAME",expression="t11.[WFWORKFLOWNAME]")
        ,@DEDataQueryCodeExp(name="WFWFVERSIONID",expression="t1.[WFWFVERSIONID]")
        ,@DEDataQueryCodeExp(name="WFWFVERSIONNAME",expression="t1.[WFWFVERSIONNAME]")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE AS CREATEDATE, t1.CREATEMAN AS CREATEMAN, t1.UPDATEDATE AS UPDATEDATE, t1.UPDATEMAN AS UPDATEMAN, t1.WFVERSION AS WFVERSION, t1.WFWFID AS WFWFID, t11.WFWORKFLOWNAME AS WFWFNAME, t1.WFWFVERSIONID AS WFWFVERSIONID, t1.WFWFVERSIONNAME AS WFWFVERSIONNAME FROM T_SRFWFWFVERSION t1  LEFT JOIN T_SRFWFWORKFLOW t11 ON t1.WFWFID = t11.WFWORKFLOWID ",querycodetemp="",declarecode="",dbtype="POSTGRESQL",
    fieldexps={
        @DEDataQueryCodeExp(name="WFMODEL",expression="t1.WFMODEL")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="WFVERSION",expression="t1.WFVERSION")
        ,@DEDataQueryCodeExp(name="WFWFID",expression="t1.WFWFID")
        ,@DEDataQueryCodeExp(name="WFWFNAME",expression="t11.WFWORKFLOWNAME")
        ,@DEDataQueryCodeExp(name="WFWFVERSIONID",expression="t1.WFWFVERSIONID")
        ,@DEDataQueryCodeExp(name="WFWFVERSIONNAME",expression="t1.WFWFVERSIONNAME")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE AS CREATEDATE, t1.CREATEMAN AS CREATEMAN, t1.UPDATEDATE AS UPDATEDATE, t1.UPDATEMAN AS UPDATEMAN, t1.WFVERSION AS WFVERSION, t1.WFWFID AS WFWFID, t11.WFWORKFLOWNAME AS WFWFNAME, t1.WFWFVERSIONID AS WFWFVERSIONID, t1.WFWFVERSIONNAME AS WFWFVERSIONNAME FROM T_SRFWFWFVERSION t1  LEFT JOIN T_SRFWFWORKFLOW t11 ON t1.WFWFID = t11.WFWORKFLOWID ",querycodetemp="",declarecode="",dbtype="PPAS",
    fieldexps={
        @DEDataQueryCodeExp(name="WFMODEL",expression="t1.WFMODEL")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="WFVERSION",expression="t1.WFVERSION")
        ,@DEDataQueryCodeExp(name="WFWFID",expression="t1.WFWFID")
        ,@DEDataQueryCodeExp(name="WFWFNAME",expression="t11.WFWORKFLOWNAME")
        ,@DEDataQueryCodeExp(name="WFWFVERSIONID",expression="t1.WFWFVERSIONID")
        ,@DEDataQueryCodeExp(name="WFWFVERSIONNAME",expression="t1.WFWFVERSIONNAME")
    },
    conds={})
})
/**
 *  实体数据查询 [DEFAULT]模型基类
 */
public abstract class WFVersionDefaultDQModelBase extends net.ibizsys.paas.demodel.DEDataQueryModelBase {

    public WFVersionDefaultDQModelBase() {
        super();

        this.initAnnotation(WFVersionDefaultDQModelBase.class);
    }

}