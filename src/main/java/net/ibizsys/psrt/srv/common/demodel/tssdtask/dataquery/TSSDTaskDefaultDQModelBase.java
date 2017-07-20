/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package net.ibizsys.psrt.srv.common.demodel.tssdtask.dataquery;



import net.ibizsys.paas.core.DEDataQuery;
import net.ibizsys.paas.core.DEDataQueryCodes;
import net.ibizsys.paas.core.DEDataQueryCode;
import net.ibizsys.paas.core.DEDataQueryCodeExp;
import net.ibizsys.paas.core.DEDataQueryCodeCond;

@DEDataQuery(id="ED7E4322-9554-499E-B32B-0F13A8EB8507",name="DEFAULT")
@DEDataQueryCodes({
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE, t1.CREATEMAN, t1.ENABLEFLAG, t1.TSSDENGINEID, t11.TSSDENGINENAME, t1.TSSDTASKID, t1.TSSDTASKNAME, t1.UPDATEDATE, t1.UPDATEMAN, t1.USERDATA, t1.USERDATA2, t1.USERDATA3, t1.USERDATA4, t1.VERSION FROM T_SRFTSSDTASK t1  LEFT JOIN T_SRFTSSDENGINE t11 ON t1.TSSDENGINEID = t11.TSSDENGINEID ",querycodetemp="",declarecode="",dbtype="DB2",
    fieldexps={
        @DEDataQueryCodeExp(name="TASKPARAM",expression="t1.TASKPARAM")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="ENABLEFLAG",expression="t1.ENABLEFLAG")
        ,@DEDataQueryCodeExp(name="TSSDENGINEID",expression="t1.TSSDENGINEID")
        ,@DEDataQueryCodeExp(name="TSSDENGINENAME",expression="t11.TSSDENGINENAME")
        ,@DEDataQueryCodeExp(name="TSSDTASKID",expression="t1.TSSDTASKID")
        ,@DEDataQueryCodeExp(name="TSSDTASKNAME",expression="t1.TSSDTASKNAME")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="USERDATA",expression="t1.USERDATA")
        ,@DEDataQueryCodeExp(name="USERDATA2",expression="t1.USERDATA2")
        ,@DEDataQueryCodeExp(name="USERDATA3",expression="t1.USERDATA3")
        ,@DEDataQueryCodeExp(name="USERDATA4",expression="t1.USERDATA4")
        ,@DEDataQueryCodeExp(name="VERSION",expression="t1.VERSION")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.`CREATEDATE`, t1.`CREATEMAN`, t1.`ENABLEFLAG`, t1.`TSSDENGINEID`, t11.`TSSDENGINENAME`, t1.`TSSDTASKID`, t1.`TSSDTASKNAME`, t1.`UPDATEDATE`, t1.`UPDATEMAN`, t1.`USERDATA`, t1.`USERDATA2`, t1.`USERDATA3`, t1.`USERDATA4`, t1.`VERSION` FROM `T_SRFTSSDTASK` t1  LEFT JOIN T_SRFTSSDENGINE t11 ON t1.TSSDENGINEID = t11.TSSDENGINEID ",querycodetemp="",declarecode="",dbtype="MYSQL5",
    fieldexps={
        @DEDataQueryCodeExp(name="TASKPARAM",expression="t1.`TASKPARAM`")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.`CREATEDATE`")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.`CREATEMAN`")
        ,@DEDataQueryCodeExp(name="ENABLEFLAG",expression="t1.`ENABLEFLAG`")
        ,@DEDataQueryCodeExp(name="TSSDENGINEID",expression="t1.`TSSDENGINEID`")
        ,@DEDataQueryCodeExp(name="TSSDENGINENAME",expression="t11.`TSSDENGINENAME`")
        ,@DEDataQueryCodeExp(name="TSSDTASKID",expression="t1.`TSSDTASKID`")
        ,@DEDataQueryCodeExp(name="TSSDTASKNAME",expression="t1.`TSSDTASKNAME`")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.`UPDATEDATE`")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.`UPDATEMAN`")
        ,@DEDataQueryCodeExp(name="USERDATA",expression="t1.`USERDATA`")
        ,@DEDataQueryCodeExp(name="USERDATA2",expression="t1.`USERDATA2`")
        ,@DEDataQueryCodeExp(name="USERDATA3",expression="t1.`USERDATA3`")
        ,@DEDataQueryCodeExp(name="USERDATA4",expression="t1.`USERDATA4`")
        ,@DEDataQueryCodeExp(name="VERSION",expression="t1.`VERSION`")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE, t1.CREATEMAN, t1.ENABLEFLAG, t1.TSSDENGINEID, t11.TSSDENGINENAME, t1.TSSDTASKID, t1.TSSDTASKNAME, t1.UPDATEDATE, t1.UPDATEMAN, t1.USERDATA, t1.USERDATA2, t1.USERDATA3, t1.USERDATA4, t1.VERSION FROM T_SRFTSSDTASK t1  LEFT JOIN T_SRFTSSDENGINE t11 ON t1.TSSDENGINEID = t11.TSSDENGINEID ",querycodetemp="",declarecode="",dbtype="ORACLE",
    fieldexps={
        @DEDataQueryCodeExp(name="TASKPARAM",expression="t1.TASKPARAM")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="ENABLEFLAG",expression="t1.ENABLEFLAG")
        ,@DEDataQueryCodeExp(name="TSSDENGINEID",expression="t1.TSSDENGINEID")
        ,@DEDataQueryCodeExp(name="TSSDENGINENAME",expression="t11.TSSDENGINENAME")
        ,@DEDataQueryCodeExp(name="TSSDTASKID",expression="t1.TSSDTASKID")
        ,@DEDataQueryCodeExp(name="TSSDTASKNAME",expression="t1.TSSDTASKNAME")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="USERDATA",expression="t1.USERDATA")
        ,@DEDataQueryCodeExp(name="USERDATA2",expression="t1.USERDATA2")
        ,@DEDataQueryCodeExp(name="USERDATA3",expression="t1.USERDATA3")
        ,@DEDataQueryCodeExp(name="USERDATA4",expression="t1.USERDATA4")
        ,@DEDataQueryCodeExp(name="VERSION",expression="t1.VERSION")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.[CREATEDATE], t1.[CREATEMAN], t1.[ENABLEFLAG], t1.[TSSDENGINEID], t11.[TSSDENGINENAME], t1.[TSSDTASKID], t1.[TSSDTASKNAME], t1.[UPDATEDATE], t1.[UPDATEMAN], t1.[USERDATA], t1.[USERDATA2], t1.[USERDATA3], t1.[USERDATA4], t1.[VERSION] FROM [T_SRFTSSDTASK] t1  LEFT JOIN T_SRFTSSDENGINE t11 ON t1.TSSDENGINEID = t11.TSSDENGINEID ",querycodetemp="",declarecode="",dbtype="SQLSERVER",
    fieldexps={
        @DEDataQueryCodeExp(name="TASKPARAM",expression="t1.[TASKPARAM]")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.[CREATEDATE]")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.[CREATEMAN]")
        ,@DEDataQueryCodeExp(name="ENABLEFLAG",expression="t1.[ENABLEFLAG]")
        ,@DEDataQueryCodeExp(name="TSSDENGINEID",expression="t1.[TSSDENGINEID]")
        ,@DEDataQueryCodeExp(name="TSSDENGINENAME",expression="t11.[TSSDENGINENAME]")
        ,@DEDataQueryCodeExp(name="TSSDTASKID",expression="t1.[TSSDTASKID]")
        ,@DEDataQueryCodeExp(name="TSSDTASKNAME",expression="t1.[TSSDTASKNAME]")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.[UPDATEDATE]")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.[UPDATEMAN]")
        ,@DEDataQueryCodeExp(name="USERDATA",expression="t1.[USERDATA]")
        ,@DEDataQueryCodeExp(name="USERDATA2",expression="t1.[USERDATA2]")
        ,@DEDataQueryCodeExp(name="USERDATA3",expression="t1.[USERDATA3]")
        ,@DEDataQueryCodeExp(name="USERDATA4",expression="t1.[USERDATA4]")
        ,@DEDataQueryCodeExp(name="VERSION",expression="t1.[VERSION]")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE, t1.CREATEMAN, t1.ENABLEFLAG, t1.TSSDENGINEID, t11.TSSDENGINENAME, t1.TSSDTASKID, t1.TSSDTASKNAME, t1.UPDATEDATE, t1.UPDATEMAN, t1.USERDATA, t1.USERDATA2, t1.USERDATA3, t1.USERDATA4, t1.VERSION FROM T_SRFTSSDTASK t1  LEFT JOIN T_SRFTSSDENGINE t11 ON t1.TSSDENGINEID = t11.TSSDENGINEID ",querycodetemp="",declarecode="",dbtype="POSTGRESQL",
    fieldexps={
        @DEDataQueryCodeExp(name="TASKPARAM",expression="t1.TASKPARAM")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="ENABLEFLAG",expression="t1.ENABLEFLAG")
        ,@DEDataQueryCodeExp(name="TSSDENGINEID",expression="t1.TSSDENGINEID")
        ,@DEDataQueryCodeExp(name="TSSDENGINENAME",expression="t11.TSSDENGINENAME")
        ,@DEDataQueryCodeExp(name="TSSDTASKID",expression="t1.TSSDTASKID")
        ,@DEDataQueryCodeExp(name="TSSDTASKNAME",expression="t1.TSSDTASKNAME")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="USERDATA",expression="t1.USERDATA")
        ,@DEDataQueryCodeExp(name="USERDATA2",expression="t1.USERDATA2")
        ,@DEDataQueryCodeExp(name="USERDATA3",expression="t1.USERDATA3")
        ,@DEDataQueryCodeExp(name="USERDATA4",expression="t1.USERDATA4")
        ,@DEDataQueryCodeExp(name="VERSION",expression="t1.VERSION")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE, t1.CREATEMAN, t1.ENABLEFLAG, t1.TSSDENGINEID, t11.TSSDENGINENAME, t1.TSSDTASKID, t1.TSSDTASKNAME, t1.UPDATEDATE, t1.UPDATEMAN, t1.USERDATA, t1.USERDATA2, t1.USERDATA3, t1.USERDATA4, t1.VERSION FROM T_SRFTSSDTASK t1  LEFT JOIN T_SRFTSSDENGINE t11 ON t1.TSSDENGINEID = t11.TSSDENGINEID ",querycodetemp="",declarecode="",dbtype="PPAS",
    fieldexps={
        @DEDataQueryCodeExp(name="TASKPARAM",expression="t1.TASKPARAM")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="ENABLEFLAG",expression="t1.ENABLEFLAG")
        ,@DEDataQueryCodeExp(name="TSSDENGINEID",expression="t1.TSSDENGINEID")
        ,@DEDataQueryCodeExp(name="TSSDENGINENAME",expression="t11.TSSDENGINENAME")
        ,@DEDataQueryCodeExp(name="TSSDTASKID",expression="t1.TSSDTASKID")
        ,@DEDataQueryCodeExp(name="TSSDTASKNAME",expression="t1.TSSDTASKNAME")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="USERDATA",expression="t1.USERDATA")
        ,@DEDataQueryCodeExp(name="USERDATA2",expression="t1.USERDATA2")
        ,@DEDataQueryCodeExp(name="USERDATA3",expression="t1.USERDATA3")
        ,@DEDataQueryCodeExp(name="USERDATA4",expression="t1.USERDATA4")
        ,@DEDataQueryCodeExp(name="VERSION",expression="t1.VERSION")
    },
    conds={})
})
/**
 *  实体数据查询 [DEFAULT]模型基类
 */
public abstract class TSSDTaskDefaultDQModelBase extends net.ibizsys.paas.demodel.DEDataQueryModelBase {

    public TSSDTaskDefaultDQModelBase() {
        super();

        this.initAnnotation(TSSDTaskDefaultDQModelBase.class);
    }

}