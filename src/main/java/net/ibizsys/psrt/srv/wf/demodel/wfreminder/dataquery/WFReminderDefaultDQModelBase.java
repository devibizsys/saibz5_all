/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package net.ibizsys.psrt.srv.wf.demodel.wfreminder.dataquery;



import net.ibizsys.paas.core.DEDataQuery;
import net.ibizsys.paas.core.DEDataQueryCodes;
import net.ibizsys.paas.core.DEDataQueryCode;
import net.ibizsys.paas.core.DEDataQueryCodeExp;
import net.ibizsys.paas.core.DEDataQueryCodeCond;

@DEDataQuery(id="548A4C67-01EF-472F-B095-FB46063B074D",name="DEFAULT")
@DEDataQueryCodes({
    @DEDataQueryCode(querycode="SELECT t11.ACTORID, t1.CREATEDATE, t1.CREATEMAN, t1.MEMO, t11.REMINDERCOUNT, t1.REMINDERTIME, t1.UPDATEDATE, t1.UPDATEMAN, t11.CREATEDATE AS WFCREATEDATE, t1.WFREMINDERID, t1.WFREMINDERNAME, t1.WFSTEPACTORID, t11.WFSTEPACTORNAME, t1.WFUSERID, t1.WFUSERNAME FROM T_SRFWFREMINDER t1  LEFT JOIN T_SRFWFSTEPACTOR t11 ON t1.WFSTEPACTORID = t11.WFSTEPACTORID ",querycodetemp="",declarecode="",dbtype="DB2",
    fieldexps={
        @DEDataQueryCodeExp(name="ACTORID",expression="t11.ACTORID")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="REMINDERCOUNT",expression="t11.REMINDERCOUNT")
        ,@DEDataQueryCodeExp(name="REMINDERTIME",expression="t1.REMINDERTIME")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="WFCREATEDATE",expression="t11.CREATEDATE")
        ,@DEDataQueryCodeExp(name="WFREMINDERID",expression="t1.WFREMINDERID")
        ,@DEDataQueryCodeExp(name="WFREMINDERNAME",expression="t1.WFREMINDERNAME")
        ,@DEDataQueryCodeExp(name="WFSTEPACTORID",expression="t1.WFSTEPACTORID")
        ,@DEDataQueryCodeExp(name="WFSTEPACTORNAME",expression="t11.WFSTEPACTORNAME")
        ,@DEDataQueryCodeExp(name="WFUSERID",expression="t1.WFUSERID")
        ,@DEDataQueryCodeExp(name="WFUSERNAME",expression="t1.WFUSERNAME")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t11.`ACTORID`, t1.`CREATEDATE`, t1.`CREATEMAN`, t1.`MEMO`, t11.`REMINDERCOUNT`, t1.`REMINDERTIME`, t1.`UPDATEDATE`, t1.`UPDATEMAN`, t11.`CREATEDATE` AS `WFCREATEDATE`, t1.`WFREMINDERID`, t1.`WFREMINDERNAME`, t1.`WFSTEPACTORID`, t11.`WFSTEPACTORNAME`, t1.`WFUSERID`, t1.`WFUSERNAME` FROM `T_SRFWFREMINDER` t1  LEFT JOIN T_SRFWFSTEPACTOR t11 ON t1.WFSTEPACTORID = t11.WFSTEPACTORID ",querycodetemp="",declarecode="",dbtype="MYSQL5",
    fieldexps={
        @DEDataQueryCodeExp(name="ACTORID",expression="t11.`ACTORID`")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.`CREATEDATE`")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.`CREATEMAN`")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.`MEMO`")
        ,@DEDataQueryCodeExp(name="REMINDERCOUNT",expression="t11.`REMINDERCOUNT`")
        ,@DEDataQueryCodeExp(name="REMINDERTIME",expression="t1.`REMINDERTIME`")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.`UPDATEDATE`")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.`UPDATEMAN`")
        ,@DEDataQueryCodeExp(name="WFCREATEDATE",expression="t11.`CREATEDATE`")
        ,@DEDataQueryCodeExp(name="WFREMINDERID",expression="t1.`WFREMINDERID`")
        ,@DEDataQueryCodeExp(name="WFREMINDERNAME",expression="t1.`WFREMINDERNAME`")
        ,@DEDataQueryCodeExp(name="WFSTEPACTORID",expression="t1.`WFSTEPACTORID`")
        ,@DEDataQueryCodeExp(name="WFSTEPACTORNAME",expression="t11.`WFSTEPACTORNAME`")
        ,@DEDataQueryCodeExp(name="WFUSERID",expression="t1.`WFUSERID`")
        ,@DEDataQueryCodeExp(name="WFUSERNAME",expression="t1.`WFUSERNAME`")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t11.ACTORID, t1.CREATEDATE, t1.CREATEMAN, t1.MEMO, t11.REMINDERCOUNT, t1.REMINDERTIME, t1.UPDATEDATE, t1.UPDATEMAN, t11.CREATEDATE AS WFCREATEDATE, t1.WFREMINDERID, t1.WFREMINDERNAME, t1.WFSTEPACTORID, t11.WFSTEPACTORNAME, t1.WFUSERID, t1.WFUSERNAME FROM T_SRFWFREMINDER t1  LEFT JOIN T_SRFWFSTEPACTOR t11 ON t1.WFSTEPACTORID = t11.WFSTEPACTORID ",querycodetemp="",declarecode="",dbtype="ORACLE",
    fieldexps={
        @DEDataQueryCodeExp(name="ACTORID",expression="t11.ACTORID")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="REMINDERCOUNT",expression="t11.REMINDERCOUNT")
        ,@DEDataQueryCodeExp(name="REMINDERTIME",expression="t1.REMINDERTIME")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="WFCREATEDATE",expression="t11.CREATEDATE")
        ,@DEDataQueryCodeExp(name="WFREMINDERID",expression="t1.WFREMINDERID")
        ,@DEDataQueryCodeExp(name="WFREMINDERNAME",expression="t1.WFREMINDERNAME")
        ,@DEDataQueryCodeExp(name="WFSTEPACTORID",expression="t1.WFSTEPACTORID")
        ,@DEDataQueryCodeExp(name="WFSTEPACTORNAME",expression="t11.WFSTEPACTORNAME")
        ,@DEDataQueryCodeExp(name="WFUSERID",expression="t1.WFUSERID")
        ,@DEDataQueryCodeExp(name="WFUSERNAME",expression="t1.WFUSERNAME")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t11.[ACTORID], t1.[CREATEDATE], t1.[CREATEMAN], t1.[MEMO], t11.[REMINDERCOUNT], t1.[REMINDERTIME], t1.[UPDATEDATE], t1.[UPDATEMAN], t11.[CREATEDATE] AS [WFCREATEDATE], t1.[WFREMINDERID], t1.[WFREMINDERNAME], t1.[WFSTEPACTORID], t11.[WFSTEPACTORNAME], t1.[WFUSERID], t1.[WFUSERNAME] FROM [T_SRFWFREMINDER] t1  LEFT JOIN T_SRFWFSTEPACTOR t11 ON t1.WFSTEPACTORID = t11.WFSTEPACTORID ",querycodetemp="",declarecode="",dbtype="SQLSERVER",
    fieldexps={
        @DEDataQueryCodeExp(name="ACTORID",expression="t11.[ACTORID]")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.[CREATEDATE]")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.[CREATEMAN]")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.[MEMO]")
        ,@DEDataQueryCodeExp(name="REMINDERCOUNT",expression="t11.[REMINDERCOUNT]")
        ,@DEDataQueryCodeExp(name="REMINDERTIME",expression="t1.[REMINDERTIME]")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.[UPDATEDATE]")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.[UPDATEMAN]")
        ,@DEDataQueryCodeExp(name="WFCREATEDATE",expression="t11.[CREATEDATE]")
        ,@DEDataQueryCodeExp(name="WFREMINDERID",expression="t1.[WFREMINDERID]")
        ,@DEDataQueryCodeExp(name="WFREMINDERNAME",expression="t1.[WFREMINDERNAME]")
        ,@DEDataQueryCodeExp(name="WFSTEPACTORID",expression="t1.[WFSTEPACTORID]")
        ,@DEDataQueryCodeExp(name="WFSTEPACTORNAME",expression="t11.[WFSTEPACTORNAME]")
        ,@DEDataQueryCodeExp(name="WFUSERID",expression="t1.[WFUSERID]")
        ,@DEDataQueryCodeExp(name="WFUSERNAME",expression="t1.[WFUSERNAME]")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t11.ACTORID, t1.CREATEDATE, t1.CREATEMAN, t1.MEMO, t11.REMINDERCOUNT, t1.REMINDERTIME, t1.UPDATEDATE, t1.UPDATEMAN, t11.CREATEDATE AS WFCREATEDATE, t1.WFREMINDERID, t1.WFREMINDERNAME, t1.WFSTEPACTORID, t11.WFSTEPACTORNAME, t1.WFUSERID, t1.WFUSERNAME FROM T_SRFWFREMINDER t1  LEFT JOIN T_SRFWFSTEPACTOR t11 ON t1.WFSTEPACTORID = t11.WFSTEPACTORID ",querycodetemp="",declarecode="",dbtype="POSTGRESQL",
    fieldexps={
        @DEDataQueryCodeExp(name="ACTORID",expression="t11.ACTORID")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="REMINDERCOUNT",expression="t11.REMINDERCOUNT")
        ,@DEDataQueryCodeExp(name="REMINDERTIME",expression="t1.REMINDERTIME")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="WFCREATEDATE",expression="t11.CREATEDATE")
        ,@DEDataQueryCodeExp(name="WFREMINDERID",expression="t1.WFREMINDERID")
        ,@DEDataQueryCodeExp(name="WFREMINDERNAME",expression="t1.WFREMINDERNAME")
        ,@DEDataQueryCodeExp(name="WFSTEPACTORID",expression="t1.WFSTEPACTORID")
        ,@DEDataQueryCodeExp(name="WFSTEPACTORNAME",expression="t11.WFSTEPACTORNAME")
        ,@DEDataQueryCodeExp(name="WFUSERID",expression="t1.WFUSERID")
        ,@DEDataQueryCodeExp(name="WFUSERNAME",expression="t1.WFUSERNAME")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t11.ACTORID, t1.CREATEDATE, t1.CREATEMAN, t1.MEMO, t11.REMINDERCOUNT, t1.REMINDERTIME, t1.UPDATEDATE, t1.UPDATEMAN, t11.CREATEDATE AS WFCREATEDATE, t1.WFREMINDERID, t1.WFREMINDERNAME, t1.WFSTEPACTORID, t11.WFSTEPACTORNAME, t1.WFUSERID, t1.WFUSERNAME FROM T_SRFWFREMINDER t1  LEFT JOIN T_SRFWFSTEPACTOR t11 ON t1.WFSTEPACTORID = t11.WFSTEPACTORID ",querycodetemp="",declarecode="",dbtype="PPAS",
    fieldexps={
        @DEDataQueryCodeExp(name="ACTORID",expression="t11.ACTORID")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="REMINDERCOUNT",expression="t11.REMINDERCOUNT")
        ,@DEDataQueryCodeExp(name="REMINDERTIME",expression="t1.REMINDERTIME")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="WFCREATEDATE",expression="t11.CREATEDATE")
        ,@DEDataQueryCodeExp(name="WFREMINDERID",expression="t1.WFREMINDERID")
        ,@DEDataQueryCodeExp(name="WFREMINDERNAME",expression="t1.WFREMINDERNAME")
        ,@DEDataQueryCodeExp(name="WFSTEPACTORID",expression="t1.WFSTEPACTORID")
        ,@DEDataQueryCodeExp(name="WFSTEPACTORNAME",expression="t11.WFSTEPACTORNAME")
        ,@DEDataQueryCodeExp(name="WFUSERID",expression="t1.WFUSERID")
        ,@DEDataQueryCodeExp(name="WFUSERNAME",expression="t1.WFUSERNAME")
    },
    conds={})
})
/**
 *  实体数据查询 [DEFAULT]模型基类
 */
public abstract class WFReminderDefaultDQModelBase extends net.ibizsys.paas.demodel.DEDataQueryModelBase {

    public WFReminderDefaultDQModelBase() {
        super();

        this.initAnnotation(WFReminderDefaultDQModelBase.class);
    }

}