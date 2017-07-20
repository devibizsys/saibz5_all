/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package net.ibizsys.psrt.srv.wf.demodel.wfappsetting.dataquery;



import net.ibizsys.paas.core.DEDataQuery;
import net.ibizsys.paas.core.DEDataQueryCodes;
import net.ibizsys.paas.core.DEDataQueryCode;
import net.ibizsys.paas.core.DEDataQueryCodeExp;
import net.ibizsys.paas.core.DEDataQueryCodeCond;

@DEDataQuery(id="C336E5BD-3D0D-45C2-BBF5-91C43BBAE20A",name="DEFAULT")
@DEDataQueryCodes({
    @DEDataQueryCode(querycode="SELECT t1.APPLICATIONID, t1.CREATEDATE, t1.CREATEMAN, t1.MEMO, t1.REMINDMSGTEMPID, t1.REMINDMSGTEMPLNAME, t1.UPDATEDATE, t1.UPDATEMAN, t1.WFAPPSETTINGID, t1.WFAPPSETTINGNAME FROM T_SRFWFAPPSETTING t1 ",querycodetemp="",declarecode="",dbtype="DB2",
    fieldexps={
        @DEDataQueryCodeExp(name="APPLICATIONID",expression="t1.APPLICATIONID")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="REMINDMSGTEMPID",expression="t1.REMINDMSGTEMPID")
        ,@DEDataQueryCodeExp(name="REMINDMSGTEMPLNAME",expression="t1.REMINDMSGTEMPLNAME")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="WFAPPSETTINGID",expression="t1.WFAPPSETTINGID")
        ,@DEDataQueryCodeExp(name="WFAPPSETTINGNAME",expression="t1.WFAPPSETTINGNAME")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.`APPLICATIONID`, t1.`CREATEDATE`, t1.`CREATEMAN`, t1.`MEMO`, t1.`REMINDMSGTEMPID`, t1.`REMINDMSGTEMPLNAME`, t1.`UPDATEDATE`, t1.`UPDATEMAN`, t1.`WFAPPSETTINGID`, t1.`WFAPPSETTINGNAME` FROM `T_SRFWFAPPSETTING` t1 ",querycodetemp="",declarecode="",dbtype="MYSQL5",
    fieldexps={
        @DEDataQueryCodeExp(name="APPLICATIONID",expression="t1.`APPLICATIONID`")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.`CREATEDATE`")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.`CREATEMAN`")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.`MEMO`")
        ,@DEDataQueryCodeExp(name="REMINDMSGTEMPID",expression="t1.`REMINDMSGTEMPID`")
        ,@DEDataQueryCodeExp(name="REMINDMSGTEMPLNAME",expression="t1.`REMINDMSGTEMPLNAME`")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.`UPDATEDATE`")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.`UPDATEMAN`")
        ,@DEDataQueryCodeExp(name="WFAPPSETTINGID",expression="t1.`WFAPPSETTINGID`")
        ,@DEDataQueryCodeExp(name="WFAPPSETTINGNAME",expression="t1.`WFAPPSETTINGNAME`")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.APPLICATIONID, t1.CREATEDATE, t1.CREATEMAN, t1.MEMO, t1.REMINDMSGTEMPID, t1.REMINDMSGTEMPLNAME, t1.UPDATEDATE, t1.UPDATEMAN, t1.WFAPPSETTINGID, t1.WFAPPSETTINGNAME FROM T_SRFWFAPPSETTING t1 ",querycodetemp="",declarecode="",dbtype="ORACLE",
    fieldexps={
        @DEDataQueryCodeExp(name="APPLICATIONID",expression="t1.APPLICATIONID")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="REMINDMSGTEMPID",expression="t1.REMINDMSGTEMPID")
        ,@DEDataQueryCodeExp(name="REMINDMSGTEMPLNAME",expression="t1.REMINDMSGTEMPLNAME")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="WFAPPSETTINGID",expression="t1.WFAPPSETTINGID")
        ,@DEDataQueryCodeExp(name="WFAPPSETTINGNAME",expression="t1.WFAPPSETTINGNAME")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.[APPLICATIONID], t1.[CREATEDATE], t1.[CREATEMAN], t1.[MEMO], t1.[REMINDMSGTEMPID], t1.[REMINDMSGTEMPLNAME], t1.[UPDATEDATE], t1.[UPDATEMAN], t1.[WFAPPSETTINGID], t1.[WFAPPSETTINGNAME] FROM [T_SRFWFAPPSETTING] t1 ",querycodetemp="",declarecode="",dbtype="SQLSERVER",
    fieldexps={
        @DEDataQueryCodeExp(name="APPLICATIONID",expression="t1.[APPLICATIONID]")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.[CREATEDATE]")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.[CREATEMAN]")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.[MEMO]")
        ,@DEDataQueryCodeExp(name="REMINDMSGTEMPID",expression="t1.[REMINDMSGTEMPID]")
        ,@DEDataQueryCodeExp(name="REMINDMSGTEMPLNAME",expression="t1.[REMINDMSGTEMPLNAME]")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.[UPDATEDATE]")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.[UPDATEMAN]")
        ,@DEDataQueryCodeExp(name="WFAPPSETTINGID",expression="t1.[WFAPPSETTINGID]")
        ,@DEDataQueryCodeExp(name="WFAPPSETTINGNAME",expression="t1.[WFAPPSETTINGNAME]")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.APPLICATIONID, t1.CREATEDATE, t1.CREATEMAN, t1.MEMO, t1.REMINDMSGTEMPID, t1.REMINDMSGTEMPLNAME, t1.UPDATEDATE, t1.UPDATEMAN, t1.WFAPPSETTINGID, t1.WFAPPSETTINGNAME FROM T_SRFWFAPPSETTING t1 ",querycodetemp="",declarecode="",dbtype="POSTGRESQL",
    fieldexps={
        @DEDataQueryCodeExp(name="APPLICATIONID",expression="t1.APPLICATIONID")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="REMINDMSGTEMPID",expression="t1.REMINDMSGTEMPID")
        ,@DEDataQueryCodeExp(name="REMINDMSGTEMPLNAME",expression="t1.REMINDMSGTEMPLNAME")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="WFAPPSETTINGID",expression="t1.WFAPPSETTINGID")
        ,@DEDataQueryCodeExp(name="WFAPPSETTINGNAME",expression="t1.WFAPPSETTINGNAME")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.APPLICATIONID, t1.CREATEDATE, t1.CREATEMAN, t1.MEMO, t1.REMINDMSGTEMPID, t1.REMINDMSGTEMPLNAME, t1.UPDATEDATE, t1.UPDATEMAN, t1.WFAPPSETTINGID, t1.WFAPPSETTINGNAME FROM T_SRFWFAPPSETTING t1 ",querycodetemp="",declarecode="",dbtype="PPAS",
    fieldexps={
        @DEDataQueryCodeExp(name="APPLICATIONID",expression="t1.APPLICATIONID")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="REMINDMSGTEMPID",expression="t1.REMINDMSGTEMPID")
        ,@DEDataQueryCodeExp(name="REMINDMSGTEMPLNAME",expression="t1.REMINDMSGTEMPLNAME")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="WFAPPSETTINGID",expression="t1.WFAPPSETTINGID")
        ,@DEDataQueryCodeExp(name="WFAPPSETTINGNAME",expression="t1.WFAPPSETTINGNAME")
    },
    conds={})
})
/**
 *  实体数据查询 [DEFAULT]模型基类
 */
public abstract class WFAppSettingDefaultDQModelBase extends net.ibizsys.paas.demodel.DEDataQueryModelBase {

    public WFAppSettingDefaultDQModelBase() {
        super();

        this.initAnnotation(WFAppSettingDefaultDQModelBase.class);
    }

}