/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package net.ibizsys.psrt.srv.wf.demodel.wfuser.dataquery;



import net.ibizsys.paas.core.DEDataQuery;
import net.ibizsys.paas.core.DEDataQueryCodes;
import net.ibizsys.paas.core.DEDataQueryCode;
import net.ibizsys.paas.core.DEDataQueryCodeExp;
import net.ibizsys.paas.core.DEDataQueryCodeCond;

@DEDataQuery(id="A8AEA90E-7DDF-4AA6-BB89-D1C0BE931E79",name="DEFAULT")
@DEDataQueryCodes({
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE, t1.CREATEMAN, t1.ISRECVWORK, t1.MEMO, t1.RECVINFORM, t1.UPDATEDATE, t1.UPDATEMAN, t1.VALIDFLAG, t1.WFUSERID, t1.WFUSERNAME FROM T_SRFWFUSER t1 ",querycodetemp="",declarecode="",dbtype="DB2",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="ISRECVWORK",expression="t1.ISRECVWORK")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="RECVINFORM",expression="t1.RECVINFORM")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="VALIDFLAG",expression="t1.VALIDFLAG")
        ,@DEDataQueryCodeExp(name="WFUSERID",expression="t1.WFUSERID")
        ,@DEDataQueryCodeExp(name="WFUSERNAME",expression="t1.WFUSERNAME")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.`CREATEDATE`, t1.`CREATEMAN`, t1.`ISRECVWORK`, t1.`MEMO`, t1.`RECVINFORM`, t1.`UPDATEDATE`, t1.`UPDATEMAN`, t1.`VALIDFLAG`, t1.`WFUSERID`, t1.`WFUSERNAME` FROM `T_SRFWFUSER` t1 ",querycodetemp="",declarecode="",dbtype="MYSQL5",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.`CREATEDATE`")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.`CREATEMAN`")
        ,@DEDataQueryCodeExp(name="ISRECVWORK",expression="t1.`ISRECVWORK`")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.`MEMO`")
        ,@DEDataQueryCodeExp(name="RECVINFORM",expression="t1.`RECVINFORM`")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.`UPDATEDATE`")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.`UPDATEMAN`")
        ,@DEDataQueryCodeExp(name="VALIDFLAG",expression="t1.`VALIDFLAG`")
        ,@DEDataQueryCodeExp(name="WFUSERID",expression="t1.`WFUSERID`")
        ,@DEDataQueryCodeExp(name="WFUSERNAME",expression="t1.`WFUSERNAME`")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE, t1.CREATEMAN, t1.ISRECVWORK, t1.MEMO, t1.RECVINFORM, t1.UPDATEDATE, t1.UPDATEMAN, t1.VALIDFLAG, t1.WFUSERID, t1.WFUSERNAME FROM T_SRFWFUSER t1 ",querycodetemp="",declarecode="",dbtype="ORACLE",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="ISRECVWORK",expression="t1.ISRECVWORK")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="RECVINFORM",expression="t1.RECVINFORM")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="VALIDFLAG",expression="t1.VALIDFLAG")
        ,@DEDataQueryCodeExp(name="WFUSERID",expression="t1.WFUSERID")
        ,@DEDataQueryCodeExp(name="WFUSERNAME",expression="t1.WFUSERNAME")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.[CREATEDATE], t1.[CREATEMAN], t1.[ISRECVWORK], t1.[MEMO], t1.[RECVINFORM], t1.[UPDATEDATE], t1.[UPDATEMAN], t1.[VALIDFLAG], t1.[WFUSERID], t1.[WFUSERNAME] FROM [T_SRFWFUSER] t1 ",querycodetemp="",declarecode="",dbtype="SQLSERVER",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.[CREATEDATE]")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.[CREATEMAN]")
        ,@DEDataQueryCodeExp(name="ISRECVWORK",expression="t1.[ISRECVWORK]")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.[MEMO]")
        ,@DEDataQueryCodeExp(name="RECVINFORM",expression="t1.[RECVINFORM]")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.[UPDATEDATE]")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.[UPDATEMAN]")
        ,@DEDataQueryCodeExp(name="VALIDFLAG",expression="t1.[VALIDFLAG]")
        ,@DEDataQueryCodeExp(name="WFUSERID",expression="t1.[WFUSERID]")
        ,@DEDataQueryCodeExp(name="WFUSERNAME",expression="t1.[WFUSERNAME]")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE, t1.CREATEMAN, t1.ISRECVWORK, t1.MEMO, t1.RECVINFORM, t1.UPDATEDATE, t1.UPDATEMAN, t1.VALIDFLAG, t1.WFUSERID, t1.WFUSERNAME FROM T_SRFWFUSER t1 ",querycodetemp="",declarecode="",dbtype="POSTGRESQL",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="ISRECVWORK",expression="t1.ISRECVWORK")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="RECVINFORM",expression="t1.RECVINFORM")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="VALIDFLAG",expression="t1.VALIDFLAG")
        ,@DEDataQueryCodeExp(name="WFUSERID",expression="t1.WFUSERID")
        ,@DEDataQueryCodeExp(name="WFUSERNAME",expression="t1.WFUSERNAME")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE, t1.CREATEMAN, t1.ISRECVWORK, t1.MEMO, t1.RECVINFORM, t1.UPDATEDATE, t1.UPDATEMAN, t1.VALIDFLAG, t1.WFUSERID, t1.WFUSERNAME FROM T_SRFWFUSER t1 ",querycodetemp="",declarecode="",dbtype="PPAS",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="ISRECVWORK",expression="t1.ISRECVWORK")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="RECVINFORM",expression="t1.RECVINFORM")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="VALIDFLAG",expression="t1.VALIDFLAG")
        ,@DEDataQueryCodeExp(name="WFUSERID",expression="t1.WFUSERID")
        ,@DEDataQueryCodeExp(name="WFUSERNAME",expression="t1.WFUSERNAME")
    },
    conds={})
})
/**
 *  实体数据查询 [DEFAULT]模型基类
 */
public abstract class WFUserDefaultDQModelBase extends net.ibizsys.paas.demodel.DEDataQueryModelBase {

    public WFUserDefaultDQModelBase() {
        super();

        this.initAnnotation(WFUserDefaultDQModelBase.class);
    }

}