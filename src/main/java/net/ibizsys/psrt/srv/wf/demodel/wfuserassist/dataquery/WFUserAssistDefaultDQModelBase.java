/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package net.ibizsys.psrt.srv.wf.demodel.wfuserassist.dataquery;



import net.ibizsys.paas.core.DEDataQuery;
import net.ibizsys.paas.core.DEDataQueryCodes;
import net.ibizsys.paas.core.DEDataQueryCode;
import net.ibizsys.paas.core.DEDataQueryCodeExp;
import net.ibizsys.paas.core.DEDataQueryCodeCond;

@DEDataQuery(id="6A6C850C-1585-4BFF-A726-6B4D021C5B53",name="DEFAULT")
@DEDataQueryCodes({
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE, t1.CREATEMAN, t1.MEMO, t1.UPDATEDATE, t1.UPDATEMAN, t1.WFMAJORUSERID, t11.WFUSERNAME AS WFMAJORUSERNAME, t1.WFMINORUSERID, t21.WFUSERNAME AS WFMINORUSERNAME, t1.WFSTEP, t1.WFUSERASSISTID, t1.WFUSERASSISTNAME, t1.WFWORKFLOWID, t31.WFWORKFLOWNAME FROM T_SRFWFUSERASSIST t1  LEFT JOIN T_SRFWFUSER t11 ON t1.WFMAJORUSERID = t11.WFUSERID  LEFT JOIN T_SRFWFUSER t21 ON t1.WFMINORUSERID = t21.WFUSERID  LEFT JOIN T_SRFWFWORKFLOW t31 ON t1.WFWORKFLOWID = t31.WFWORKFLOWID ",querycodetemp="",declarecode="",dbtype="DB2",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="WFMAJORUSERID",expression="t1.WFMAJORUSERID")
        ,@DEDataQueryCodeExp(name="WFMAJORUSERNAME",expression="t11.WFUSERNAME")
        ,@DEDataQueryCodeExp(name="WFMINORUSERID",expression="t1.WFMINORUSERID")
        ,@DEDataQueryCodeExp(name="WFMINORUSERNAME",expression="t21.WFUSERNAME")
        ,@DEDataQueryCodeExp(name="WFSTEP",expression="t1.WFSTEP")
        ,@DEDataQueryCodeExp(name="WFUSERASSISTID",expression="t1.WFUSERASSISTID")
        ,@DEDataQueryCodeExp(name="WFUSERASSISTNAME",expression="t1.WFUSERASSISTNAME")
        ,@DEDataQueryCodeExp(name="WFWORKFLOWID",expression="t1.WFWORKFLOWID")
        ,@DEDataQueryCodeExp(name="WFWORKFLOWNAME",expression="t31.WFWORKFLOWNAME")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.`CREATEDATE`, t1.`CREATEMAN`, t1.`MEMO`, t1.`UPDATEDATE`, t1.`UPDATEMAN`, t1.`WFMAJORUSERID`, t11.`WFUSERNAME` AS `WFMAJORUSERNAME`, t1.`WFMINORUSERID`, t21.`WFUSERNAME` AS `WFMINORUSERNAME`, t1.`WFSTEP`, t1.`WFUSERASSISTID`, t1.`WFUSERASSISTNAME`, t1.`WFWORKFLOWID`, t31.`WFWORKFLOWNAME` FROM `T_SRFWFUSERASSIST` t1  LEFT JOIN T_SRFWFUSER t11 ON t1.WFMAJORUSERID = t11.WFUSERID  LEFT JOIN T_SRFWFUSER t21 ON t1.WFMINORUSERID = t21.WFUSERID  LEFT JOIN T_SRFWFWORKFLOW t31 ON t1.WFWORKFLOWID = t31.WFWORKFLOWID ",querycodetemp="",declarecode="",dbtype="MYSQL5",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.`CREATEDATE`")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.`CREATEMAN`")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.`MEMO`")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.`UPDATEDATE`")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.`UPDATEMAN`")
        ,@DEDataQueryCodeExp(name="WFMAJORUSERID",expression="t1.`WFMAJORUSERID`")
        ,@DEDataQueryCodeExp(name="WFMAJORUSERNAME",expression="t11.`WFUSERNAME`")
        ,@DEDataQueryCodeExp(name="WFMINORUSERID",expression="t1.`WFMINORUSERID`")
        ,@DEDataQueryCodeExp(name="WFMINORUSERNAME",expression="t21.`WFUSERNAME`")
        ,@DEDataQueryCodeExp(name="WFSTEP",expression="t1.`WFSTEP`")
        ,@DEDataQueryCodeExp(name="WFUSERASSISTID",expression="t1.`WFUSERASSISTID`")
        ,@DEDataQueryCodeExp(name="WFUSERASSISTNAME",expression="t1.`WFUSERASSISTNAME`")
        ,@DEDataQueryCodeExp(name="WFWORKFLOWID",expression="t1.`WFWORKFLOWID`")
        ,@DEDataQueryCodeExp(name="WFWORKFLOWNAME",expression="t31.`WFWORKFLOWNAME`")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE, t1.CREATEMAN, t1.MEMO, t1.UPDATEDATE, t1.UPDATEMAN, t1.WFMAJORUSERID, t11.WFUSERNAME AS WFMAJORUSERNAME, t1.WFMINORUSERID, t21.WFUSERNAME AS WFMINORUSERNAME, t1.WFSTEP, t1.WFUSERASSISTID, t1.WFUSERASSISTNAME, t1.WFWORKFLOWID, t31.WFWORKFLOWNAME FROM T_SRFWFUSERASSIST t1  LEFT JOIN T_SRFWFUSER t11 ON t1.WFMAJORUSERID = t11.WFUSERID  LEFT JOIN T_SRFWFUSER t21 ON t1.WFMINORUSERID = t21.WFUSERID  LEFT JOIN T_SRFWFWORKFLOW t31 ON t1.WFWORKFLOWID = t31.WFWORKFLOWID ",querycodetemp="",declarecode="",dbtype="ORACLE",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="WFMAJORUSERID",expression="t1.WFMAJORUSERID")
        ,@DEDataQueryCodeExp(name="WFMAJORUSERNAME",expression="t11.WFUSERNAME")
        ,@DEDataQueryCodeExp(name="WFMINORUSERID",expression="t1.WFMINORUSERID")
        ,@DEDataQueryCodeExp(name="WFMINORUSERNAME",expression="t21.WFUSERNAME")
        ,@DEDataQueryCodeExp(name="WFSTEP",expression="t1.WFSTEP")
        ,@DEDataQueryCodeExp(name="WFUSERASSISTID",expression="t1.WFUSERASSISTID")
        ,@DEDataQueryCodeExp(name="WFUSERASSISTNAME",expression="t1.WFUSERASSISTNAME")
        ,@DEDataQueryCodeExp(name="WFWORKFLOWID",expression="t1.WFWORKFLOWID")
        ,@DEDataQueryCodeExp(name="WFWORKFLOWNAME",expression="t31.WFWORKFLOWNAME")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.[CREATEDATE], t1.[CREATEMAN], t1.[MEMO], t1.[UPDATEDATE], t1.[UPDATEMAN], t1.[WFMAJORUSERID], t11.[WFUSERNAME] AS [WFMAJORUSERNAME], t1.[WFMINORUSERID], t21.[WFUSERNAME] AS [WFMINORUSERNAME], t1.[WFSTEP], t1.[WFUSERASSISTID], t1.[WFUSERASSISTNAME], t1.[WFWORKFLOWID], t31.[WFWORKFLOWNAME] FROM [T_SRFWFUSERASSIST] t1  LEFT JOIN T_SRFWFUSER t11 ON t1.WFMAJORUSERID = t11.WFUSERID  LEFT JOIN T_SRFWFUSER t21 ON t1.WFMINORUSERID = t21.WFUSERID  LEFT JOIN T_SRFWFWORKFLOW t31 ON t1.WFWORKFLOWID = t31.WFWORKFLOWID ",querycodetemp="",declarecode="",dbtype="SQLSERVER",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.[CREATEDATE]")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.[CREATEMAN]")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.[MEMO]")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.[UPDATEDATE]")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.[UPDATEMAN]")
        ,@DEDataQueryCodeExp(name="WFMAJORUSERID",expression="t1.[WFMAJORUSERID]")
        ,@DEDataQueryCodeExp(name="WFMAJORUSERNAME",expression="t11.[WFUSERNAME]")
        ,@DEDataQueryCodeExp(name="WFMINORUSERID",expression="t1.[WFMINORUSERID]")
        ,@DEDataQueryCodeExp(name="WFMINORUSERNAME",expression="t21.[WFUSERNAME]")
        ,@DEDataQueryCodeExp(name="WFSTEP",expression="t1.[WFSTEP]")
        ,@DEDataQueryCodeExp(name="WFUSERASSISTID",expression="t1.[WFUSERASSISTID]")
        ,@DEDataQueryCodeExp(name="WFUSERASSISTNAME",expression="t1.[WFUSERASSISTNAME]")
        ,@DEDataQueryCodeExp(name="WFWORKFLOWID",expression="t1.[WFWORKFLOWID]")
        ,@DEDataQueryCodeExp(name="WFWORKFLOWNAME",expression="t31.[WFWORKFLOWNAME]")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE, t1.CREATEMAN, t1.MEMO, t1.UPDATEDATE, t1.UPDATEMAN, t1.WFMAJORUSERID, t11.WFUSERNAME AS WFMAJORUSERNAME, t1.WFMINORUSERID, t21.WFUSERNAME AS WFMINORUSERNAME, t1.WFSTEP, t1.WFUSERASSISTID, t1.WFUSERASSISTNAME, t1.WFWORKFLOWID, t31.WFWORKFLOWNAME FROM T_SRFWFUSERASSIST t1  LEFT JOIN T_SRFWFUSER t11 ON t1.WFMAJORUSERID = t11.WFUSERID  LEFT JOIN T_SRFWFUSER t21 ON t1.WFMINORUSERID = t21.WFUSERID  LEFT JOIN T_SRFWFWORKFLOW t31 ON t1.WFWORKFLOWID = t31.WFWORKFLOWID ",querycodetemp="",declarecode="",dbtype="POSTGRESQL",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="WFMAJORUSERID",expression="t1.WFMAJORUSERID")
        ,@DEDataQueryCodeExp(name="WFMAJORUSERNAME",expression="t11.WFUSERNAME")
        ,@DEDataQueryCodeExp(name="WFMINORUSERID",expression="t1.WFMINORUSERID")
        ,@DEDataQueryCodeExp(name="WFMINORUSERNAME",expression="t21.WFUSERNAME")
        ,@DEDataQueryCodeExp(name="WFSTEP",expression="t1.WFSTEP")
        ,@DEDataQueryCodeExp(name="WFUSERASSISTID",expression="t1.WFUSERASSISTID")
        ,@DEDataQueryCodeExp(name="WFUSERASSISTNAME",expression="t1.WFUSERASSISTNAME")
        ,@DEDataQueryCodeExp(name="WFWORKFLOWID",expression="t1.WFWORKFLOWID")
        ,@DEDataQueryCodeExp(name="WFWORKFLOWNAME",expression="t31.WFWORKFLOWNAME")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE, t1.CREATEMAN, t1.MEMO, t1.UPDATEDATE, t1.UPDATEMAN, t1.WFMAJORUSERID, t11.WFUSERNAME AS WFMAJORUSERNAME, t1.WFMINORUSERID, t21.WFUSERNAME AS WFMINORUSERNAME, t1.WFSTEP, t1.WFUSERASSISTID, t1.WFUSERASSISTNAME, t1.WFWORKFLOWID, t31.WFWORKFLOWNAME FROM T_SRFWFUSERASSIST t1  LEFT JOIN T_SRFWFUSER t11 ON t1.WFMAJORUSERID = t11.WFUSERID  LEFT JOIN T_SRFWFUSER t21 ON t1.WFMINORUSERID = t21.WFUSERID  LEFT JOIN T_SRFWFWORKFLOW t31 ON t1.WFWORKFLOWID = t31.WFWORKFLOWID ",querycodetemp="",declarecode="",dbtype="PPAS",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="WFMAJORUSERID",expression="t1.WFMAJORUSERID")
        ,@DEDataQueryCodeExp(name="WFMAJORUSERNAME",expression="t11.WFUSERNAME")
        ,@DEDataQueryCodeExp(name="WFMINORUSERID",expression="t1.WFMINORUSERID")
        ,@DEDataQueryCodeExp(name="WFMINORUSERNAME",expression="t21.WFUSERNAME")
        ,@DEDataQueryCodeExp(name="WFSTEP",expression="t1.WFSTEP")
        ,@DEDataQueryCodeExp(name="WFUSERASSISTID",expression="t1.WFUSERASSISTID")
        ,@DEDataQueryCodeExp(name="WFUSERASSISTNAME",expression="t1.WFUSERASSISTNAME")
        ,@DEDataQueryCodeExp(name="WFWORKFLOWID",expression="t1.WFWORKFLOWID")
        ,@DEDataQueryCodeExp(name="WFWORKFLOWNAME",expression="t31.WFWORKFLOWNAME")
    },
    conds={})
})
/**
 *  实体数据查询 [DEFAULT]模型基类
 */
public abstract class WFUserAssistDefaultDQModelBase extends net.ibizsys.paas.demodel.DEDataQueryModelBase {

    public WFUserAssistDefaultDQModelBase() {
        super();

        this.initAnnotation(WFUserAssistDefaultDQModelBase.class);
    }

}