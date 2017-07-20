/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package net.ibizsys.psrt.srv.wf.demodel.wfucpolicy.dataquery;



import net.ibizsys.paas.core.DEDataQuery;
import net.ibizsys.paas.core.DEDataQueryCodes;
import net.ibizsys.paas.core.DEDataQueryCode;
import net.ibizsys.paas.core.DEDataQueryCodeExp;
import net.ibizsys.paas.core.DEDataQueryCodeCond;

@DEDataQuery(id="7476674A-5DBF-4358-BABB-C92BBE4804C3",name="DEFAULT")
@DEDataQueryCodes({
    @DEDataQueryCode(querycode="SELECT t1.BEGINTIME, t1.CREATEDATE, t1.CREATEMAN, t1.ENDTIME, t1.MAJORWFUSERID, t11.WFUSERNAME AS MAJORWFUSERNAME, t1.MEMO, t1.MINORWFUSERID, t21.WFUSERNAME AS MINORWFUSERNAME, t1.POLICYSTATE, t1.UPDATEDATE, t1.UPDATEMAN, t1.USERDATA, t1.USERDATA2, t1.VALIDFLAG, t1.WFUCPOLICYID, t1.WFUCPOLICYNAME FROM T_SRFWFUCPOLICY t1  LEFT JOIN T_SRFWFUSER t11 ON t1.MAJORWFUSERID = t11.WFUSERID  LEFT JOIN T_SRFWFUSER t21 ON t1.MINORWFUSERID = t21.WFUSERID ",querycodetemp="",declarecode="",dbtype="DB2",
    fieldexps={
        @DEDataQueryCodeExp(name="BEGINTIME",expression="t1.BEGINTIME")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="ENDTIME",expression="t1.ENDTIME")
        ,@DEDataQueryCodeExp(name="MAJORWFUSERID",expression="t1.MAJORWFUSERID")
        ,@DEDataQueryCodeExp(name="MAJORWFUSERNAME",expression="t11.WFUSERNAME")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="MINORWFUSERID",expression="t1.MINORWFUSERID")
        ,@DEDataQueryCodeExp(name="MINORWFUSERNAME",expression="t21.WFUSERNAME")
        ,@DEDataQueryCodeExp(name="POLICYSTATE",expression="t1.POLICYSTATE")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="USERDATA",expression="t1.USERDATA")
        ,@DEDataQueryCodeExp(name="USERDATA2",expression="t1.USERDATA2")
        ,@DEDataQueryCodeExp(name="VALIDFLAG",expression="t1.VALIDFLAG")
        ,@DEDataQueryCodeExp(name="WFUCPOLICYID",expression="t1.WFUCPOLICYID")
        ,@DEDataQueryCodeExp(name="WFUCPOLICYNAME",expression="t1.WFUCPOLICYNAME")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.`BEGINTIME`, t1.`CREATEDATE`, t1.`CREATEMAN`, t1.`ENDTIME`, t1.`MAJORWFUSERID`, t11.`WFUSERNAME` AS `MAJORWFUSERNAME`, t1.`MEMO`, t1.`MINORWFUSERID`, t21.`WFUSERNAME` AS `MINORWFUSERNAME`, t1.`POLICYSTATE`, t1.`UPDATEDATE`, t1.`UPDATEMAN`, t1.`USERDATA`, t1.`USERDATA2`, t1.`VALIDFLAG`, t1.`WFUCPOLICYID`, t1.`WFUCPOLICYNAME` FROM `T_SRFWFUCPOLICY` t1  LEFT JOIN T_SRFWFUSER t11 ON t1.MAJORWFUSERID = t11.WFUSERID  LEFT JOIN T_SRFWFUSER t21 ON t1.MINORWFUSERID = t21.WFUSERID ",querycodetemp="",declarecode="",dbtype="MYSQL5",
    fieldexps={
        @DEDataQueryCodeExp(name="BEGINTIME",expression="t1.`BEGINTIME`")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.`CREATEDATE`")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.`CREATEMAN`")
        ,@DEDataQueryCodeExp(name="ENDTIME",expression="t1.`ENDTIME`")
        ,@DEDataQueryCodeExp(name="MAJORWFUSERID",expression="t1.`MAJORWFUSERID`")
        ,@DEDataQueryCodeExp(name="MAJORWFUSERNAME",expression="t11.`WFUSERNAME`")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.`MEMO`")
        ,@DEDataQueryCodeExp(name="MINORWFUSERID",expression="t1.`MINORWFUSERID`")
        ,@DEDataQueryCodeExp(name="MINORWFUSERNAME",expression="t21.`WFUSERNAME`")
        ,@DEDataQueryCodeExp(name="POLICYSTATE",expression="t1.`POLICYSTATE`")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.`UPDATEDATE`")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.`UPDATEMAN`")
        ,@DEDataQueryCodeExp(name="USERDATA",expression="t1.`USERDATA`")
        ,@DEDataQueryCodeExp(name="USERDATA2",expression="t1.`USERDATA2`")
        ,@DEDataQueryCodeExp(name="VALIDFLAG",expression="t1.`VALIDFLAG`")
        ,@DEDataQueryCodeExp(name="WFUCPOLICYID",expression="t1.`WFUCPOLICYID`")
        ,@DEDataQueryCodeExp(name="WFUCPOLICYNAME",expression="t1.`WFUCPOLICYNAME`")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.BEGINTIME, t1.CREATEDATE, t1.CREATEMAN, t1.ENDTIME, t1.MAJORWFUSERID, t11.WFUSERNAME AS MAJORWFUSERNAME, t1.MEMO, t1.MINORWFUSERID, t21.WFUSERNAME AS MINORWFUSERNAME, t1.POLICYSTATE, t1.UPDATEDATE, t1.UPDATEMAN, t1.USERDATA, t1.USERDATA2, t1.VALIDFLAG, t1.WFUCPOLICYID, t1.WFUCPOLICYNAME FROM T_SRFWFUCPOLICY t1  LEFT JOIN T_SRFWFUSER t11 ON t1.MAJORWFUSERID = t11.WFUSERID  LEFT JOIN T_SRFWFUSER t21 ON t1.MINORWFUSERID = t21.WFUSERID ",querycodetemp="",declarecode="",dbtype="ORACLE",
    fieldexps={
        @DEDataQueryCodeExp(name="BEGINTIME",expression="t1.BEGINTIME")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="ENDTIME",expression="t1.ENDTIME")
        ,@DEDataQueryCodeExp(name="MAJORWFUSERID",expression="t1.MAJORWFUSERID")
        ,@DEDataQueryCodeExp(name="MAJORWFUSERNAME",expression="t11.WFUSERNAME")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="MINORWFUSERID",expression="t1.MINORWFUSERID")
        ,@DEDataQueryCodeExp(name="MINORWFUSERNAME",expression="t21.WFUSERNAME")
        ,@DEDataQueryCodeExp(name="POLICYSTATE",expression="t1.POLICYSTATE")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="USERDATA",expression="t1.USERDATA")
        ,@DEDataQueryCodeExp(name="USERDATA2",expression="t1.USERDATA2")
        ,@DEDataQueryCodeExp(name="VALIDFLAG",expression="t1.VALIDFLAG")
        ,@DEDataQueryCodeExp(name="WFUCPOLICYID",expression="t1.WFUCPOLICYID")
        ,@DEDataQueryCodeExp(name="WFUCPOLICYNAME",expression="t1.WFUCPOLICYNAME")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.[BEGINTIME], t1.[CREATEDATE], t1.[CREATEMAN], t1.[ENDTIME], t1.[MAJORWFUSERID], t11.[WFUSERNAME] AS [MAJORWFUSERNAME], t1.[MEMO], t1.[MINORWFUSERID], t21.[WFUSERNAME] AS [MINORWFUSERNAME], t1.[POLICYSTATE], t1.[UPDATEDATE], t1.[UPDATEMAN], t1.[USERDATA], t1.[USERDATA2], t1.[VALIDFLAG], t1.[WFUCPOLICYID], t1.[WFUCPOLICYNAME] FROM [T_SRFWFUCPOLICY] t1  LEFT JOIN T_SRFWFUSER t11 ON t1.MAJORWFUSERID = t11.WFUSERID  LEFT JOIN T_SRFWFUSER t21 ON t1.MINORWFUSERID = t21.WFUSERID ",querycodetemp="",declarecode="",dbtype="SQLSERVER",
    fieldexps={
        @DEDataQueryCodeExp(name="BEGINTIME",expression="t1.[BEGINTIME]")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.[CREATEDATE]")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.[CREATEMAN]")
        ,@DEDataQueryCodeExp(name="ENDTIME",expression="t1.[ENDTIME]")
        ,@DEDataQueryCodeExp(name="MAJORWFUSERID",expression="t1.[MAJORWFUSERID]")
        ,@DEDataQueryCodeExp(name="MAJORWFUSERNAME",expression="t11.[WFUSERNAME]")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.[MEMO]")
        ,@DEDataQueryCodeExp(name="MINORWFUSERID",expression="t1.[MINORWFUSERID]")
        ,@DEDataQueryCodeExp(name="MINORWFUSERNAME",expression="t21.[WFUSERNAME]")
        ,@DEDataQueryCodeExp(name="POLICYSTATE",expression="t1.[POLICYSTATE]")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.[UPDATEDATE]")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.[UPDATEMAN]")
        ,@DEDataQueryCodeExp(name="USERDATA",expression="t1.[USERDATA]")
        ,@DEDataQueryCodeExp(name="USERDATA2",expression="t1.[USERDATA2]")
        ,@DEDataQueryCodeExp(name="VALIDFLAG",expression="t1.[VALIDFLAG]")
        ,@DEDataQueryCodeExp(name="WFUCPOLICYID",expression="t1.[WFUCPOLICYID]")
        ,@DEDataQueryCodeExp(name="WFUCPOLICYNAME",expression="t1.[WFUCPOLICYNAME]")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.BEGINTIME, t1.CREATEDATE, t1.CREATEMAN, t1.ENDTIME, t1.MAJORWFUSERID, t11.WFUSERNAME AS MAJORWFUSERNAME, t1.MEMO, t1.MINORWFUSERID, t21.WFUSERNAME AS MINORWFUSERNAME, t1.POLICYSTATE, t1.UPDATEDATE, t1.UPDATEMAN, t1.USERDATA, t1.USERDATA2, t1.VALIDFLAG, t1.WFUCPOLICYID, t1.WFUCPOLICYNAME FROM T_SRFWFUCPOLICY t1  LEFT JOIN T_SRFWFUSER t11 ON t1.MAJORWFUSERID = t11.WFUSERID  LEFT JOIN T_SRFWFUSER t21 ON t1.MINORWFUSERID = t21.WFUSERID ",querycodetemp="",declarecode="",dbtype="POSTGRESQL",
    fieldexps={
        @DEDataQueryCodeExp(name="BEGINTIME",expression="t1.BEGINTIME")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="ENDTIME",expression="t1.ENDTIME")
        ,@DEDataQueryCodeExp(name="MAJORWFUSERID",expression="t1.MAJORWFUSERID")
        ,@DEDataQueryCodeExp(name="MAJORWFUSERNAME",expression="t11.WFUSERNAME")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="MINORWFUSERID",expression="t1.MINORWFUSERID")
        ,@DEDataQueryCodeExp(name="MINORWFUSERNAME",expression="t21.WFUSERNAME")
        ,@DEDataQueryCodeExp(name="POLICYSTATE",expression="t1.POLICYSTATE")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="USERDATA",expression="t1.USERDATA")
        ,@DEDataQueryCodeExp(name="USERDATA2",expression="t1.USERDATA2")
        ,@DEDataQueryCodeExp(name="VALIDFLAG",expression="t1.VALIDFLAG")
        ,@DEDataQueryCodeExp(name="WFUCPOLICYID",expression="t1.WFUCPOLICYID")
        ,@DEDataQueryCodeExp(name="WFUCPOLICYNAME",expression="t1.WFUCPOLICYNAME")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.BEGINTIME, t1.CREATEDATE, t1.CREATEMAN, t1.ENDTIME, t1.MAJORWFUSERID, t11.WFUSERNAME AS MAJORWFUSERNAME, t1.MEMO, t1.MINORWFUSERID, t21.WFUSERNAME AS MINORWFUSERNAME, t1.POLICYSTATE, t1.UPDATEDATE, t1.UPDATEMAN, t1.USERDATA, t1.USERDATA2, t1.VALIDFLAG, t1.WFUCPOLICYID, t1.WFUCPOLICYNAME FROM T_SRFWFUCPOLICY t1  LEFT JOIN T_SRFWFUSER t11 ON t1.MAJORWFUSERID = t11.WFUSERID  LEFT JOIN T_SRFWFUSER t21 ON t1.MINORWFUSERID = t21.WFUSERID ",querycodetemp="",declarecode="",dbtype="PPAS",
    fieldexps={
        @DEDataQueryCodeExp(name="BEGINTIME",expression="t1.BEGINTIME")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="ENDTIME",expression="t1.ENDTIME")
        ,@DEDataQueryCodeExp(name="MAJORWFUSERID",expression="t1.MAJORWFUSERID")
        ,@DEDataQueryCodeExp(name="MAJORWFUSERNAME",expression="t11.WFUSERNAME")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="MINORWFUSERID",expression="t1.MINORWFUSERID")
        ,@DEDataQueryCodeExp(name="MINORWFUSERNAME",expression="t21.WFUSERNAME")
        ,@DEDataQueryCodeExp(name="POLICYSTATE",expression="t1.POLICYSTATE")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="USERDATA",expression="t1.USERDATA")
        ,@DEDataQueryCodeExp(name="USERDATA2",expression="t1.USERDATA2")
        ,@DEDataQueryCodeExp(name="VALIDFLAG",expression="t1.VALIDFLAG")
        ,@DEDataQueryCodeExp(name="WFUCPOLICYID",expression="t1.WFUCPOLICYID")
        ,@DEDataQueryCodeExp(name="WFUCPOLICYNAME",expression="t1.WFUCPOLICYNAME")
    },
    conds={})
})
/**
 *  实体数据查询 [DEFAULT]模型基类
 */
public abstract class WFUCPolicyDefaultDQModelBase extends net.ibizsys.paas.demodel.DEDataQueryModelBase {

    public WFUCPolicyDefaultDQModelBase() {
        super();

        this.initAnnotation(WFUCPolicyDefaultDQModelBase.class);
    }

}