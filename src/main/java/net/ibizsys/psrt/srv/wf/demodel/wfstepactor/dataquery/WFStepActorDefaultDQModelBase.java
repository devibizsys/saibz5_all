/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package net.ibizsys.psrt.srv.wf.demodel.wfstepactor.dataquery;



import net.ibizsys.paas.core.DEDataQuery;
import net.ibizsys.paas.core.DEDataQueryCodes;
import net.ibizsys.paas.core.DEDataQueryCode;
import net.ibizsys.paas.core.DEDataQueryCodeExp;
import net.ibizsys.paas.core.DEDataQueryCodeCond;

@DEDataQuery(id="06AE28C4-AF90-4C78-ABF0-C20F3396AF6E",name="DEFAULT")
@DEDataQueryCodes({
    @DEDataQueryCode(querycode="SELECT t1.ACTORID, t1.ACTORTYPE, t1.CREATEDATE, t1.CREATEMAN, t1.FINISHDATE, t1.FIRSTREADTIME, t1.IAACTIONS, t1.ISFINISH, t1.ISREADONLY, t1.MEMO, t1.ORIGINALWFUSERID, t1.ORIGINALWFUSERNAME, t1.READFLAG, t1.REMINDERCOUNT, t1.ROLEID, t1.UPDATEDATE, t1.UPDATEMAN, t1.WFINSTANCEID, t1.WFSTEPACTORID, t1.WFSTEPACTORNAME, t1.WFSTEPID, t1.WFSTEPNAME FROM T_SRFWFSTEPACTOR t1 ",querycodetemp="",declarecode="",dbtype="DB2",
    fieldexps={
        @DEDataQueryCodeExp(name="ACTORID",expression="t1.ACTORID")
        ,@DEDataQueryCodeExp(name="ACTORTYPE",expression="t1.ACTORTYPE")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="FINISHDATE",expression="t1.FINISHDATE")
        ,@DEDataQueryCodeExp(name="FIRSTREADTIME",expression="t1.FIRSTREADTIME")
        ,@DEDataQueryCodeExp(name="IAACTIONS",expression="t1.IAACTIONS")
        ,@DEDataQueryCodeExp(name="ISFINISH",expression="t1.ISFINISH")
        ,@DEDataQueryCodeExp(name="ISREADONLY",expression="t1.ISREADONLY")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="ORIGINALWFUSERID",expression="t1.ORIGINALWFUSERID")
        ,@DEDataQueryCodeExp(name="ORIGINALWFUSERNAME",expression="t1.ORIGINALWFUSERNAME")
        ,@DEDataQueryCodeExp(name="READFLAG",expression="t1.READFLAG")
        ,@DEDataQueryCodeExp(name="REMINDERCOUNT",expression="t1.REMINDERCOUNT")
        ,@DEDataQueryCodeExp(name="ROLEID",expression="t1.ROLEID")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="WFINSTANCEID",expression="t1.WFINSTANCEID")
        ,@DEDataQueryCodeExp(name="WFSTEPACTORID",expression="t1.WFSTEPACTORID")
        ,@DEDataQueryCodeExp(name="WFSTEPACTORNAME",expression="t1.WFSTEPACTORNAME")
        ,@DEDataQueryCodeExp(name="WFSTEPID",expression="t1.WFSTEPID")
        ,@DEDataQueryCodeExp(name="WFSTEPNAME",expression="t1.WFSTEPNAME")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.`ACTORID`, t1.`ACTORTYPE`, t1.`CREATEDATE`, t1.`CREATEMAN`, t1.`FINISHDATE`, t1.`FIRSTREADTIME`, t1.`IAACTIONS`, t1.`ISFINISH`, t1.`ISREADONLY`, t1.`MEMO`, t1.`ORIGINALWFUSERID`, t1.`ORIGINALWFUSERNAME`, t1.`READFLAG`, t1.`REMINDERCOUNT`, t1.`ROLEID`, t1.`UPDATEDATE`, t1.`UPDATEMAN`, t1.`WFINSTANCEID`, t1.`WFSTEPACTORID`, t1.`WFSTEPACTORNAME`, t1.`WFSTEPID`, t1.`WFSTEPNAME` FROM `T_SRFWFSTEPACTOR` t1 ",querycodetemp="",declarecode="",dbtype="MYSQL5",
    fieldexps={
        @DEDataQueryCodeExp(name="ACTORID",expression="t1.`ACTORID`")
        ,@DEDataQueryCodeExp(name="ACTORTYPE",expression="t1.`ACTORTYPE`")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.`CREATEDATE`")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.`CREATEMAN`")
        ,@DEDataQueryCodeExp(name="FINISHDATE",expression="t1.`FINISHDATE`")
        ,@DEDataQueryCodeExp(name="FIRSTREADTIME",expression="t1.`FIRSTREADTIME`")
        ,@DEDataQueryCodeExp(name="IAACTIONS",expression="t1.`IAACTIONS`")
        ,@DEDataQueryCodeExp(name="ISFINISH",expression="t1.`ISFINISH`")
        ,@DEDataQueryCodeExp(name="ISREADONLY",expression="t1.`ISREADONLY`")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.`MEMO`")
        ,@DEDataQueryCodeExp(name="ORIGINALWFUSERID",expression="t1.`ORIGINALWFUSERID`")
        ,@DEDataQueryCodeExp(name="ORIGINALWFUSERNAME",expression="t1.`ORIGINALWFUSERNAME`")
        ,@DEDataQueryCodeExp(name="READFLAG",expression="t1.`READFLAG`")
        ,@DEDataQueryCodeExp(name="REMINDERCOUNT",expression="t1.`REMINDERCOUNT`")
        ,@DEDataQueryCodeExp(name="ROLEID",expression="t1.`ROLEID`")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.`UPDATEDATE`")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.`UPDATEMAN`")
        ,@DEDataQueryCodeExp(name="WFINSTANCEID",expression="t1.`WFINSTANCEID`")
        ,@DEDataQueryCodeExp(name="WFSTEPACTORID",expression="t1.`WFSTEPACTORID`")
        ,@DEDataQueryCodeExp(name="WFSTEPACTORNAME",expression="t1.`WFSTEPACTORNAME`")
        ,@DEDataQueryCodeExp(name="WFSTEPID",expression="t1.`WFSTEPID`")
        ,@DEDataQueryCodeExp(name="WFSTEPNAME",expression="t1.`WFSTEPNAME`")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.ACTORID, t1.ACTORTYPE, t1.CREATEDATE, t1.CREATEMAN, t1.FINISHDATE, t1.FIRSTREADTIME, t1.IAACTIONS, t1.ISFINISH, t1.ISREADONLY, t1.MEMO, t1.ORIGINALWFUSERID, t1.ORIGINALWFUSERNAME, t1.READFLAG, t1.REMINDERCOUNT, t1.ROLEID, t1.UPDATEDATE, t1.UPDATEMAN, t1.WFINSTANCEID, t1.WFSTEPACTORID, t1.WFSTEPACTORNAME, t1.WFSTEPID, t1.WFSTEPNAME FROM T_SRFWFSTEPACTOR t1 ",querycodetemp="",declarecode="",dbtype="ORACLE",
    fieldexps={
        @DEDataQueryCodeExp(name="ACTORID",expression="t1.ACTORID")
        ,@DEDataQueryCodeExp(name="ACTORTYPE",expression="t1.ACTORTYPE")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="FINISHDATE",expression="t1.FINISHDATE")
        ,@DEDataQueryCodeExp(name="FIRSTREADTIME",expression="t1.FIRSTREADTIME")
        ,@DEDataQueryCodeExp(name="IAACTIONS",expression="t1.IAACTIONS")
        ,@DEDataQueryCodeExp(name="ISFINISH",expression="t1.ISFINISH")
        ,@DEDataQueryCodeExp(name="ISREADONLY",expression="t1.ISREADONLY")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="ORIGINALWFUSERID",expression="t1.ORIGINALWFUSERID")
        ,@DEDataQueryCodeExp(name="ORIGINALWFUSERNAME",expression="t1.ORIGINALWFUSERNAME")
        ,@DEDataQueryCodeExp(name="READFLAG",expression="t1.READFLAG")
        ,@DEDataQueryCodeExp(name="REMINDERCOUNT",expression="t1.REMINDERCOUNT")
        ,@DEDataQueryCodeExp(name="ROLEID",expression="t1.ROLEID")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="WFINSTANCEID",expression="t1.WFINSTANCEID")
        ,@DEDataQueryCodeExp(name="WFSTEPACTORID",expression="t1.WFSTEPACTORID")
        ,@DEDataQueryCodeExp(name="WFSTEPACTORNAME",expression="t1.WFSTEPACTORNAME")
        ,@DEDataQueryCodeExp(name="WFSTEPID",expression="t1.WFSTEPID")
        ,@DEDataQueryCodeExp(name="WFSTEPNAME",expression="t1.WFSTEPNAME")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.[ACTORID], t1.[ACTORTYPE], t1.[CREATEDATE], t1.[CREATEMAN], t1.[FINISHDATE], t1.[FIRSTREADTIME], t1.[IAACTIONS], t1.[ISFINISH], t1.[ISREADONLY], t1.[MEMO], t1.[ORIGINALWFUSERID], t1.[ORIGINALWFUSERNAME], t1.[READFLAG], t1.[REMINDERCOUNT], t1.[ROLEID], t1.[UPDATEDATE], t1.[UPDATEMAN], t1.[WFINSTANCEID], t1.[WFSTEPACTORID], t1.[WFSTEPACTORNAME], t1.[WFSTEPID], t1.[WFSTEPNAME] FROM [T_SRFWFSTEPACTOR] t1 ",querycodetemp="",declarecode="",dbtype="SQLSERVER",
    fieldexps={
        @DEDataQueryCodeExp(name="ACTORID",expression="t1.[ACTORID]")
        ,@DEDataQueryCodeExp(name="ACTORTYPE",expression="t1.[ACTORTYPE]")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.[CREATEDATE]")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.[CREATEMAN]")
        ,@DEDataQueryCodeExp(name="FINISHDATE",expression="t1.[FINISHDATE]")
        ,@DEDataQueryCodeExp(name="FIRSTREADTIME",expression="t1.[FIRSTREADTIME]")
        ,@DEDataQueryCodeExp(name="IAACTIONS",expression="t1.[IAACTIONS]")
        ,@DEDataQueryCodeExp(name="ISFINISH",expression="t1.[ISFINISH]")
        ,@DEDataQueryCodeExp(name="ISREADONLY",expression="t1.[ISREADONLY]")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.[MEMO]")
        ,@DEDataQueryCodeExp(name="ORIGINALWFUSERID",expression="t1.[ORIGINALWFUSERID]")
        ,@DEDataQueryCodeExp(name="ORIGINALWFUSERNAME",expression="t1.[ORIGINALWFUSERNAME]")
        ,@DEDataQueryCodeExp(name="READFLAG",expression="t1.[READFLAG]")
        ,@DEDataQueryCodeExp(name="REMINDERCOUNT",expression="t1.[REMINDERCOUNT]")
        ,@DEDataQueryCodeExp(name="ROLEID",expression="t1.[ROLEID]")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.[UPDATEDATE]")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.[UPDATEMAN]")
        ,@DEDataQueryCodeExp(name="WFINSTANCEID",expression="t1.[WFINSTANCEID]")
        ,@DEDataQueryCodeExp(name="WFSTEPACTORID",expression="t1.[WFSTEPACTORID]")
        ,@DEDataQueryCodeExp(name="WFSTEPACTORNAME",expression="t1.[WFSTEPACTORNAME]")
        ,@DEDataQueryCodeExp(name="WFSTEPID",expression="t1.[WFSTEPID]")
        ,@DEDataQueryCodeExp(name="WFSTEPNAME",expression="t1.[WFSTEPNAME]")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.ACTORID, t1.ACTORTYPE, t1.CREATEDATE, t1.CREATEMAN, t1.FINISHDATE, t1.FIRSTREADTIME, t1.IAACTIONS, t1.ISFINISH, t1.ISREADONLY, t1.MEMO, t1.ORIGINALWFUSERID, t1.ORIGINALWFUSERNAME, t1.READFLAG, t1.REMINDERCOUNT, t1.ROLEID, t1.UPDATEDATE, t1.UPDATEMAN, t1.WFINSTANCEID, t1.WFSTEPACTORID, t1.WFSTEPACTORNAME, t1.WFSTEPID, t1.WFSTEPNAME FROM T_SRFWFSTEPACTOR t1 ",querycodetemp="",declarecode="",dbtype="POSTGRESQL",
    fieldexps={
        @DEDataQueryCodeExp(name="ACTORID",expression="t1.ACTORID")
        ,@DEDataQueryCodeExp(name="ACTORTYPE",expression="t1.ACTORTYPE")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="FINISHDATE",expression="t1.FINISHDATE")
        ,@DEDataQueryCodeExp(name="FIRSTREADTIME",expression="t1.FIRSTREADTIME")
        ,@DEDataQueryCodeExp(name="IAACTIONS",expression="t1.IAACTIONS")
        ,@DEDataQueryCodeExp(name="ISFINISH",expression="t1.ISFINISH")
        ,@DEDataQueryCodeExp(name="ISREADONLY",expression="t1.ISREADONLY")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="ORIGINALWFUSERID",expression="t1.ORIGINALWFUSERID")
        ,@DEDataQueryCodeExp(name="ORIGINALWFUSERNAME",expression="t1.ORIGINALWFUSERNAME")
        ,@DEDataQueryCodeExp(name="READFLAG",expression="t1.READFLAG")
        ,@DEDataQueryCodeExp(name="REMINDERCOUNT",expression="t1.REMINDERCOUNT")
        ,@DEDataQueryCodeExp(name="ROLEID",expression="t1.ROLEID")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="WFINSTANCEID",expression="t1.WFINSTANCEID")
        ,@DEDataQueryCodeExp(name="WFSTEPACTORID",expression="t1.WFSTEPACTORID")
        ,@DEDataQueryCodeExp(name="WFSTEPACTORNAME",expression="t1.WFSTEPACTORNAME")
        ,@DEDataQueryCodeExp(name="WFSTEPID",expression="t1.WFSTEPID")
        ,@DEDataQueryCodeExp(name="WFSTEPNAME",expression="t1.WFSTEPNAME")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.ACTORID, t1.ACTORTYPE, t1.CREATEDATE, t1.CREATEMAN, t1.FINISHDATE, t1.FIRSTREADTIME, t1.IAACTIONS, t1.ISFINISH, t1.ISREADONLY, t1.MEMO, t1.ORIGINALWFUSERID, t1.ORIGINALWFUSERNAME, t1.READFLAG, t1.REMINDERCOUNT, t1.ROLEID, t1.UPDATEDATE, t1.UPDATEMAN, t1.WFINSTANCEID, t1.WFSTEPACTORID, t1.WFSTEPACTORNAME, t1.WFSTEPID, t1.WFSTEPNAME FROM T_SRFWFSTEPACTOR t1 ",querycodetemp="",declarecode="",dbtype="PPAS",
    fieldexps={
        @DEDataQueryCodeExp(name="ACTORID",expression="t1.ACTORID")
        ,@DEDataQueryCodeExp(name="ACTORTYPE",expression="t1.ACTORTYPE")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="FINISHDATE",expression="t1.FINISHDATE")
        ,@DEDataQueryCodeExp(name="FIRSTREADTIME",expression="t1.FIRSTREADTIME")
        ,@DEDataQueryCodeExp(name="IAACTIONS",expression="t1.IAACTIONS")
        ,@DEDataQueryCodeExp(name="ISFINISH",expression="t1.ISFINISH")
        ,@DEDataQueryCodeExp(name="ISREADONLY",expression="t1.ISREADONLY")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="ORIGINALWFUSERID",expression="t1.ORIGINALWFUSERID")
        ,@DEDataQueryCodeExp(name="ORIGINALWFUSERNAME",expression="t1.ORIGINALWFUSERNAME")
        ,@DEDataQueryCodeExp(name="READFLAG",expression="t1.READFLAG")
        ,@DEDataQueryCodeExp(name="REMINDERCOUNT",expression="t1.REMINDERCOUNT")
        ,@DEDataQueryCodeExp(name="ROLEID",expression="t1.ROLEID")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="WFINSTANCEID",expression="t1.WFINSTANCEID")
        ,@DEDataQueryCodeExp(name="WFSTEPACTORID",expression="t1.WFSTEPACTORID")
        ,@DEDataQueryCodeExp(name="WFSTEPACTORNAME",expression="t1.WFSTEPACTORNAME")
        ,@DEDataQueryCodeExp(name="WFSTEPID",expression="t1.WFSTEPID")
        ,@DEDataQueryCodeExp(name="WFSTEPNAME",expression="t1.WFSTEPNAME")
    },
    conds={})
})
/**
 *  实体数据查询 [DEFAULT]模型基类
 */
public abstract class WFStepActorDefaultDQModelBase extends net.ibizsys.paas.demodel.DEDataQueryModelBase {

    public WFStepActorDefaultDQModelBase() {
        super();

        this.initAnnotation(WFStepActorDefaultDQModelBase.class);
    }

}