/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package net.ibizsys.psrt.srv.wf.demodel.wfassistwork.dataquery;



import net.ibizsys.paas.core.DEDataQuery;
import net.ibizsys.paas.core.DEDataQueryCodes;
import net.ibizsys.paas.core.DEDataQueryCode;
import net.ibizsys.paas.core.DEDataQueryCodeExp;
import net.ibizsys.paas.core.DEDataQueryCodeCond;

@DEDataQuery(id="5C697418-9E5C-478F-9D8C-22168E18A358",name="DEFAULT")
@DEDataQueryCodes({
    @DEDataQueryCode(querycode="SELECT t11.ACTIVESTEPID, t1.CREATEDATE, t1.CREATEMAN, t1.UPDATEDATE, t1.UPDATEMAN, t11.USERDATA, t11.USERDATA4, t1.WFASSISTWORKID, t1.WFASSISTWORKNAME, t1.WFINSTANCEID, t11.WFINSTANCENAME, t1.WFPLOGICNAME, t1.WFSTEPACTORID, t21.WFSTEPACTORNAME, t1.WFSTEPID, t1.WFWORKFLOWID, t31.WFWORKFLOWNAME FROM T_SRFWFASSISTWORK t1  LEFT JOIN T_SRFWFINSTANCE t11 ON t1.WFINSTANCEID = t11.WFINSTANCEID  LEFT JOIN T_SRFWFSTEPACTOR t21 ON t1.WFSTEPACTORID = t21.WFSTEPACTORID  LEFT JOIN T_SRFWFWORKFLOW t31 ON t1.WFWORKFLOWID = t31.WFWORKFLOWID ",querycodetemp="",declarecode="",dbtype="DB2",
    fieldexps={
        @DEDataQueryCodeExp(name="ACTIVESTEPID",expression="t11.ACTIVESTEPID")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="USERDATA",expression="t11.USERDATA")
        ,@DEDataQueryCodeExp(name="USERDATA4",expression="t11.USERDATA4")
        ,@DEDataQueryCodeExp(name="WFASSISTWORKID",expression="t1.WFASSISTWORKID")
        ,@DEDataQueryCodeExp(name="WFASSISTWORKNAME",expression="t1.WFASSISTWORKNAME")
        ,@DEDataQueryCodeExp(name="WFINSTANCEID",expression="t1.WFINSTANCEID")
        ,@DEDataQueryCodeExp(name="WFINSTANCENAME",expression="t11.WFINSTANCENAME")
        ,@DEDataQueryCodeExp(name="WFPLOGICNAME",expression="t1.WFPLOGICNAME")
        ,@DEDataQueryCodeExp(name="WFSTEPACTORID",expression="t1.WFSTEPACTORID")
        ,@DEDataQueryCodeExp(name="WFSTEPACTORNAME",expression="t21.WFSTEPACTORNAME")
        ,@DEDataQueryCodeExp(name="WFSTEPID",expression="t1.WFSTEPID")
        ,@DEDataQueryCodeExp(name="WFWORKFLOWID",expression="t1.WFWORKFLOWID")
        ,@DEDataQueryCodeExp(name="WFWORKFLOWNAME",expression="t31.WFWORKFLOWNAME")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t11.`ACTIVESTEPID`, t1.`CREATEDATE`, t1.`CREATEMAN`, t1.`UPDATEDATE`, t1.`UPDATEMAN`, t11.`USERDATA`, t11.`USERDATA4`, t1.`WFASSISTWORKID`, t1.`WFASSISTWORKNAME`, t1.`WFINSTANCEID`, t11.`WFINSTANCENAME`, t1.`WFPLOGICNAME`, t1.`WFSTEPACTORID`, t21.`WFSTEPACTORNAME`, t1.`WFSTEPID`, t1.`WFWORKFLOWID`, t31.`WFWORKFLOWNAME` FROM `T_SRFWFASSISTWORK` t1  LEFT JOIN T_SRFWFINSTANCE t11 ON t1.WFINSTANCEID = t11.WFINSTANCEID  LEFT JOIN T_SRFWFSTEPACTOR t21 ON t1.WFSTEPACTORID = t21.WFSTEPACTORID  LEFT JOIN T_SRFWFWORKFLOW t31 ON t1.WFWORKFLOWID = t31.WFWORKFLOWID ",querycodetemp="",declarecode="",dbtype="MYSQL5",
    fieldexps={
        @DEDataQueryCodeExp(name="ACTIVESTEPID",expression="t11.`ACTIVESTEPID`")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.`CREATEDATE`")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.`CREATEMAN`")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.`UPDATEDATE`")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.`UPDATEMAN`")
        ,@DEDataQueryCodeExp(name="USERDATA",expression="t11.`USERDATA`")
        ,@DEDataQueryCodeExp(name="USERDATA4",expression="t11.`USERDATA4`")
        ,@DEDataQueryCodeExp(name="WFASSISTWORKID",expression="t1.`WFASSISTWORKID`")
        ,@DEDataQueryCodeExp(name="WFASSISTWORKNAME",expression="t1.`WFASSISTWORKNAME`")
        ,@DEDataQueryCodeExp(name="WFINSTANCEID",expression="t1.`WFINSTANCEID`")
        ,@DEDataQueryCodeExp(name="WFINSTANCENAME",expression="t11.`WFINSTANCENAME`")
        ,@DEDataQueryCodeExp(name="WFPLOGICNAME",expression="t1.`WFPLOGICNAME`")
        ,@DEDataQueryCodeExp(name="WFSTEPACTORID",expression="t1.`WFSTEPACTORID`")
        ,@DEDataQueryCodeExp(name="WFSTEPACTORNAME",expression="t21.`WFSTEPACTORNAME`")
        ,@DEDataQueryCodeExp(name="WFSTEPID",expression="t1.`WFSTEPID`")
        ,@DEDataQueryCodeExp(name="WFWORKFLOWID",expression="t1.`WFWORKFLOWID`")
        ,@DEDataQueryCodeExp(name="WFWORKFLOWNAME",expression="t31.`WFWORKFLOWNAME`")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t11.ACTIVESTEPID, t1.CREATEDATE, t1.CREATEMAN, t1.UPDATEDATE, t1.UPDATEMAN, t11.USERDATA, t11.USERDATA4, t1.WFASSISTWORKID, t1.WFASSISTWORKNAME, t1.WFINSTANCEID, t11.WFINSTANCENAME, t1.WFPLOGICNAME, t1.WFSTEPACTORID, t21.WFSTEPACTORNAME, t1.WFSTEPID, t1.WFWORKFLOWID, t31.WFWORKFLOWNAME FROM T_SRFWFASSISTWORK t1  LEFT JOIN T_SRFWFINSTANCE t11 ON t1.WFINSTANCEID = t11.WFINSTANCEID  LEFT JOIN T_SRFWFSTEPACTOR t21 ON t1.WFSTEPACTORID = t21.WFSTEPACTORID  LEFT JOIN T_SRFWFWORKFLOW t31 ON t1.WFWORKFLOWID = t31.WFWORKFLOWID ",querycodetemp="",declarecode="",dbtype="ORACLE",
    fieldexps={
        @DEDataQueryCodeExp(name="ACTIVESTEPID",expression="t11.ACTIVESTEPID")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="USERDATA",expression="t11.USERDATA")
        ,@DEDataQueryCodeExp(name="USERDATA4",expression="t11.USERDATA4")
        ,@DEDataQueryCodeExp(name="WFASSISTWORKID",expression="t1.WFASSISTWORKID")
        ,@DEDataQueryCodeExp(name="WFASSISTWORKNAME",expression="t1.WFASSISTWORKNAME")
        ,@DEDataQueryCodeExp(name="WFINSTANCEID",expression="t1.WFINSTANCEID")
        ,@DEDataQueryCodeExp(name="WFINSTANCENAME",expression="t11.WFINSTANCENAME")
        ,@DEDataQueryCodeExp(name="WFPLOGICNAME",expression="t1.WFPLOGICNAME")
        ,@DEDataQueryCodeExp(name="WFSTEPACTORID",expression="t1.WFSTEPACTORID")
        ,@DEDataQueryCodeExp(name="WFSTEPACTORNAME",expression="t21.WFSTEPACTORNAME")
        ,@DEDataQueryCodeExp(name="WFSTEPID",expression="t1.WFSTEPID")
        ,@DEDataQueryCodeExp(name="WFWORKFLOWID",expression="t1.WFWORKFLOWID")
        ,@DEDataQueryCodeExp(name="WFWORKFLOWNAME",expression="t31.WFWORKFLOWNAME")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t11.[ACTIVESTEPID], t1.[CREATEDATE], t1.[CREATEMAN], t1.[UPDATEDATE], t1.[UPDATEMAN], t11.[USERDATA], t11.[USERDATA4], t1.[WFASSISTWORKID], t1.[WFASSISTWORKNAME], t1.[WFINSTANCEID], t11.[WFINSTANCENAME], t1.[WFPLOGICNAME], t1.[WFSTEPACTORID], t21.[WFSTEPACTORNAME], t1.[WFSTEPID], t1.[WFWORKFLOWID], t31.[WFWORKFLOWNAME] FROM [T_SRFWFASSISTWORK] t1  LEFT JOIN T_SRFWFINSTANCE t11 ON t1.WFINSTANCEID = t11.WFINSTANCEID  LEFT JOIN T_SRFWFSTEPACTOR t21 ON t1.WFSTEPACTORID = t21.WFSTEPACTORID  LEFT JOIN T_SRFWFWORKFLOW t31 ON t1.WFWORKFLOWID = t31.WFWORKFLOWID ",querycodetemp="",declarecode="",dbtype="SQLSERVER",
    fieldexps={
        @DEDataQueryCodeExp(name="ACTIVESTEPID",expression="t11.[ACTIVESTEPID]")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.[CREATEDATE]")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.[CREATEMAN]")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.[UPDATEDATE]")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.[UPDATEMAN]")
        ,@DEDataQueryCodeExp(name="USERDATA",expression="t11.[USERDATA]")
        ,@DEDataQueryCodeExp(name="USERDATA4",expression="t11.[USERDATA4]")
        ,@DEDataQueryCodeExp(name="WFASSISTWORKID",expression="t1.[WFASSISTWORKID]")
        ,@DEDataQueryCodeExp(name="WFASSISTWORKNAME",expression="t1.[WFASSISTWORKNAME]")
        ,@DEDataQueryCodeExp(name="WFINSTANCEID",expression="t1.[WFINSTANCEID]")
        ,@DEDataQueryCodeExp(name="WFINSTANCENAME",expression="t11.[WFINSTANCENAME]")
        ,@DEDataQueryCodeExp(name="WFPLOGICNAME",expression="t1.[WFPLOGICNAME]")
        ,@DEDataQueryCodeExp(name="WFSTEPACTORID",expression="t1.[WFSTEPACTORID]")
        ,@DEDataQueryCodeExp(name="WFSTEPACTORNAME",expression="t21.[WFSTEPACTORNAME]")
        ,@DEDataQueryCodeExp(name="WFSTEPID",expression="t1.[WFSTEPID]")
        ,@DEDataQueryCodeExp(name="WFWORKFLOWID",expression="t1.[WFWORKFLOWID]")
        ,@DEDataQueryCodeExp(name="WFWORKFLOWNAME",expression="t31.[WFWORKFLOWNAME]")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t11.ACTIVESTEPID, t1.CREATEDATE, t1.CREATEMAN, t1.UPDATEDATE, t1.UPDATEMAN, t11.USERDATA, t11.USERDATA4, t1.WFASSISTWORKID, t1.WFASSISTWORKNAME, t1.WFINSTANCEID, t11.WFINSTANCENAME, t1.WFPLOGICNAME, t1.WFSTEPACTORID, t21.WFSTEPACTORNAME, t1.WFSTEPID, t1.WFWORKFLOWID, t31.WFWORKFLOWNAME FROM T_SRFWFASSISTWORK t1  LEFT JOIN T_SRFWFINSTANCE t11 ON t1.WFINSTANCEID = t11.WFINSTANCEID  LEFT JOIN T_SRFWFSTEPACTOR t21 ON t1.WFSTEPACTORID = t21.WFSTEPACTORID  LEFT JOIN T_SRFWFWORKFLOW t31 ON t1.WFWORKFLOWID = t31.WFWORKFLOWID ",querycodetemp="",declarecode="",dbtype="POSTGRESQL",
    fieldexps={
        @DEDataQueryCodeExp(name="ACTIVESTEPID",expression="t11.ACTIVESTEPID")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="USERDATA",expression="t11.USERDATA")
        ,@DEDataQueryCodeExp(name="USERDATA4",expression="t11.USERDATA4")
        ,@DEDataQueryCodeExp(name="WFASSISTWORKID",expression="t1.WFASSISTWORKID")
        ,@DEDataQueryCodeExp(name="WFASSISTWORKNAME",expression="t1.WFASSISTWORKNAME")
        ,@DEDataQueryCodeExp(name="WFINSTANCEID",expression="t1.WFINSTANCEID")
        ,@DEDataQueryCodeExp(name="WFINSTANCENAME",expression="t11.WFINSTANCENAME")
        ,@DEDataQueryCodeExp(name="WFPLOGICNAME",expression="t1.WFPLOGICNAME")
        ,@DEDataQueryCodeExp(name="WFSTEPACTORID",expression="t1.WFSTEPACTORID")
        ,@DEDataQueryCodeExp(name="WFSTEPACTORNAME",expression="t21.WFSTEPACTORNAME")
        ,@DEDataQueryCodeExp(name="WFSTEPID",expression="t1.WFSTEPID")
        ,@DEDataQueryCodeExp(name="WFWORKFLOWID",expression="t1.WFWORKFLOWID")
        ,@DEDataQueryCodeExp(name="WFWORKFLOWNAME",expression="t31.WFWORKFLOWNAME")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t11.ACTIVESTEPID, t1.CREATEDATE, t1.CREATEMAN, t1.UPDATEDATE, t1.UPDATEMAN, t11.USERDATA, t11.USERDATA4, t1.WFASSISTWORKID, t1.WFASSISTWORKNAME, t1.WFINSTANCEID, t11.WFINSTANCENAME, t1.WFPLOGICNAME, t1.WFSTEPACTORID, t21.WFSTEPACTORNAME, t1.WFSTEPID, t1.WFWORKFLOWID, t31.WFWORKFLOWNAME FROM T_SRFWFASSISTWORK t1  LEFT JOIN T_SRFWFINSTANCE t11 ON t1.WFINSTANCEID = t11.WFINSTANCEID  LEFT JOIN T_SRFWFSTEPACTOR t21 ON t1.WFSTEPACTORID = t21.WFSTEPACTORID  LEFT JOIN T_SRFWFWORKFLOW t31 ON t1.WFWORKFLOWID = t31.WFWORKFLOWID ",querycodetemp="",declarecode="",dbtype="PPAS",
    fieldexps={
        @DEDataQueryCodeExp(name="ACTIVESTEPID",expression="t11.ACTIVESTEPID")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="USERDATA",expression="t11.USERDATA")
        ,@DEDataQueryCodeExp(name="USERDATA4",expression="t11.USERDATA4")
        ,@DEDataQueryCodeExp(name="WFASSISTWORKID",expression="t1.WFASSISTWORKID")
        ,@DEDataQueryCodeExp(name="WFASSISTWORKNAME",expression="t1.WFASSISTWORKNAME")
        ,@DEDataQueryCodeExp(name="WFINSTANCEID",expression="t1.WFINSTANCEID")
        ,@DEDataQueryCodeExp(name="WFINSTANCENAME",expression="t11.WFINSTANCENAME")
        ,@DEDataQueryCodeExp(name="WFPLOGICNAME",expression="t1.WFPLOGICNAME")
        ,@DEDataQueryCodeExp(name="WFSTEPACTORID",expression="t1.WFSTEPACTORID")
        ,@DEDataQueryCodeExp(name="WFSTEPACTORNAME",expression="t21.WFSTEPACTORNAME")
        ,@DEDataQueryCodeExp(name="WFSTEPID",expression="t1.WFSTEPID")
        ,@DEDataQueryCodeExp(name="WFWORKFLOWID",expression="t1.WFWORKFLOWID")
        ,@DEDataQueryCodeExp(name="WFWORKFLOWNAME",expression="t31.WFWORKFLOWNAME")
    },
    conds={})
})
/**
 *  实体数据查询 [DEFAULT]模型基类
 */
public abstract class WFAssistWorkDefaultDQModelBase extends net.ibizsys.paas.demodel.DEDataQueryModelBase {

    public WFAssistWorkDefaultDQModelBase() {
        super();

        this.initAnnotation(WFAssistWorkDefaultDQModelBase.class);
    }

}