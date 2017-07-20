/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package net.ibizsys.psrt.srv.common.demodel.sysadminfunc.dataquery;



import net.ibizsys.paas.core.DEDataQuery;
import net.ibizsys.paas.core.DEDataQueryCodes;
import net.ibizsys.paas.core.DEDataQueryCode;
import net.ibizsys.paas.core.DEDataQueryCodeExp;
import net.ibizsys.paas.core.DEDataQueryCodeCond;

@DEDataQuery(id="52B5E5D1-4857-479F-AEAF-69B444AE4B5A",name="DEFAULT")
@DEDataQueryCodes({
    @DEDataQueryCode(querycode="SELECT t11.ADMINOBJECT, t1.CREATEDATE, t1.CREATEMAN, t1.FUNCID, t1.MEMO, t1.PARAM, t1.SYSADMINFUNCID, t1.SYSADMINFUNCNAME, t1.SYSADMINID, t11.SYSADMINNAME, t1.UPDATEDATE, t1.UPDATEMAN FROM T_SRFSYSADMINFUNC t1  LEFT JOIN T_SRFSYSADMIN t11 ON t1.SYSADMINID = t11.SYSADMINID ",querycodetemp="",declarecode="",dbtype="DB2",
    fieldexps={
        @DEDataQueryCodeExp(name="ADMINOBJECT",expression="t11.ADMINOBJECT")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="FUNCID",expression="t1.FUNCID")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="PARAM",expression="t1.PARAM")
        ,@DEDataQueryCodeExp(name="SYSADMINFUNCID",expression="t1.SYSADMINFUNCID")
        ,@DEDataQueryCodeExp(name="SYSADMINFUNCNAME",expression="t1.SYSADMINFUNCNAME")
        ,@DEDataQueryCodeExp(name="SYSADMINID",expression="t1.SYSADMINID")
        ,@DEDataQueryCodeExp(name="SYSADMINNAME",expression="t11.SYSADMINNAME")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t11.`ADMINOBJECT`, t1.`CREATEDATE`, t1.`CREATEMAN`, t1.`FUNCID`, t1.`MEMO`, t1.`PARAM`, t1.`SYSADMINFUNCID`, t1.`SYSADMINFUNCNAME`, t1.`SYSADMINID`, t11.`SYSADMINNAME`, t1.`UPDATEDATE`, t1.`UPDATEMAN` FROM `T_SRFSYSADMINFUNC` t1  LEFT JOIN T_SRFSYSADMIN t11 ON t1.SYSADMINID = t11.SYSADMINID ",querycodetemp="",declarecode="",dbtype="MYSQL5",
    fieldexps={
        @DEDataQueryCodeExp(name="ADMINOBJECT",expression="t11.`ADMINOBJECT`")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.`CREATEDATE`")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.`CREATEMAN`")
        ,@DEDataQueryCodeExp(name="FUNCID",expression="t1.`FUNCID`")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.`MEMO`")
        ,@DEDataQueryCodeExp(name="PARAM",expression="t1.`PARAM`")
        ,@DEDataQueryCodeExp(name="SYSADMINFUNCID",expression="t1.`SYSADMINFUNCID`")
        ,@DEDataQueryCodeExp(name="SYSADMINFUNCNAME",expression="t1.`SYSADMINFUNCNAME`")
        ,@DEDataQueryCodeExp(name="SYSADMINID",expression="t1.`SYSADMINID`")
        ,@DEDataQueryCodeExp(name="SYSADMINNAME",expression="t11.`SYSADMINNAME`")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.`UPDATEDATE`")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.`UPDATEMAN`")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t11.ADMINOBJECT, t1.CREATEDATE, t1.CREATEMAN, t1.FUNCID, t1.MEMO, t1.PARAM, t1.SYSADMINFUNCID, t1.SYSADMINFUNCNAME, t1.SYSADMINID, t11.SYSADMINNAME, t1.UPDATEDATE, t1.UPDATEMAN FROM T_SRFSYSADMINFUNC t1  LEFT JOIN T_SRFSYSADMIN t11 ON t1.SYSADMINID = t11.SYSADMINID ",querycodetemp="",declarecode="",dbtype="ORACLE",
    fieldexps={
        @DEDataQueryCodeExp(name="ADMINOBJECT",expression="t11.ADMINOBJECT")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="FUNCID",expression="t1.FUNCID")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="PARAM",expression="t1.PARAM")
        ,@DEDataQueryCodeExp(name="SYSADMINFUNCID",expression="t1.SYSADMINFUNCID")
        ,@DEDataQueryCodeExp(name="SYSADMINFUNCNAME",expression="t1.SYSADMINFUNCNAME")
        ,@DEDataQueryCodeExp(name="SYSADMINID",expression="t1.SYSADMINID")
        ,@DEDataQueryCodeExp(name="SYSADMINNAME",expression="t11.SYSADMINNAME")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t11.[ADMINOBJECT], t1.[CREATEDATE], t1.[CREATEMAN], t1.[FUNCID], t1.[MEMO], t1.[PARAM], t1.[SYSADMINFUNCID], t1.[SYSADMINFUNCNAME], t1.[SYSADMINID], t11.[SYSADMINNAME], t1.[UPDATEDATE], t1.[UPDATEMAN] FROM [T_SRFSYSADMINFUNC] t1  LEFT JOIN T_SRFSYSADMIN t11 ON t1.SYSADMINID = t11.SYSADMINID ",querycodetemp="",declarecode="",dbtype="SQLSERVER",
    fieldexps={
        @DEDataQueryCodeExp(name="ADMINOBJECT",expression="t11.[ADMINOBJECT]")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.[CREATEDATE]")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.[CREATEMAN]")
        ,@DEDataQueryCodeExp(name="FUNCID",expression="t1.[FUNCID]")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.[MEMO]")
        ,@DEDataQueryCodeExp(name="PARAM",expression="t1.[PARAM]")
        ,@DEDataQueryCodeExp(name="SYSADMINFUNCID",expression="t1.[SYSADMINFUNCID]")
        ,@DEDataQueryCodeExp(name="SYSADMINFUNCNAME",expression="t1.[SYSADMINFUNCNAME]")
        ,@DEDataQueryCodeExp(name="SYSADMINID",expression="t1.[SYSADMINID]")
        ,@DEDataQueryCodeExp(name="SYSADMINNAME",expression="t11.[SYSADMINNAME]")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.[UPDATEDATE]")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.[UPDATEMAN]")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t11.ADMINOBJECT, t1.CREATEDATE, t1.CREATEMAN, t1.FUNCID, t1.MEMO, t1.PARAM, t1.SYSADMINFUNCID, t1.SYSADMINFUNCNAME, t1.SYSADMINID, t11.SYSADMINNAME, t1.UPDATEDATE, t1.UPDATEMAN FROM T_SRFSYSADMINFUNC t1  LEFT JOIN T_SRFSYSADMIN t11 ON t1.SYSADMINID = t11.SYSADMINID ",querycodetemp="",declarecode="",dbtype="POSTGRESQL",
    fieldexps={
        @DEDataQueryCodeExp(name="ADMINOBJECT",expression="t11.ADMINOBJECT")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="FUNCID",expression="t1.FUNCID")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="PARAM",expression="t1.PARAM")
        ,@DEDataQueryCodeExp(name="SYSADMINFUNCID",expression="t1.SYSADMINFUNCID")
        ,@DEDataQueryCodeExp(name="SYSADMINFUNCNAME",expression="t1.SYSADMINFUNCNAME")
        ,@DEDataQueryCodeExp(name="SYSADMINID",expression="t1.SYSADMINID")
        ,@DEDataQueryCodeExp(name="SYSADMINNAME",expression="t11.SYSADMINNAME")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t11.ADMINOBJECT, t1.CREATEDATE, t1.CREATEMAN, t1.FUNCID, t1.MEMO, t1.PARAM, t1.SYSADMINFUNCID, t1.SYSADMINFUNCNAME, t1.SYSADMINID, t11.SYSADMINNAME, t1.UPDATEDATE, t1.UPDATEMAN FROM T_SRFSYSADMINFUNC t1  LEFT JOIN T_SRFSYSADMIN t11 ON t1.SYSADMINID = t11.SYSADMINID ",querycodetemp="",declarecode="",dbtype="PPAS",
    fieldexps={
        @DEDataQueryCodeExp(name="ADMINOBJECT",expression="t11.ADMINOBJECT")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="FUNCID",expression="t1.FUNCID")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="PARAM",expression="t1.PARAM")
        ,@DEDataQueryCodeExp(name="SYSADMINFUNCID",expression="t1.SYSADMINFUNCID")
        ,@DEDataQueryCodeExp(name="SYSADMINFUNCNAME",expression="t1.SYSADMINFUNCNAME")
        ,@DEDataQueryCodeExp(name="SYSADMINID",expression="t1.SYSADMINID")
        ,@DEDataQueryCodeExp(name="SYSADMINNAME",expression="t11.SYSADMINNAME")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
    },
    conds={})
})
/**
 *  实体数据查询 [DEFAULT]模型基类
 */
public abstract class SysAdminFuncDefaultDQModelBase extends net.ibizsys.paas.demodel.DEDataQueryModelBase {

    public SysAdminFuncDefaultDQModelBase() {
        super();

        this.initAnnotation(SysAdminFuncDefaultDQModelBase.class);
    }

}