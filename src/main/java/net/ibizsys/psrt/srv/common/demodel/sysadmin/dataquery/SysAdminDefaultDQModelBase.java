/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package net.ibizsys.psrt.srv.common.demodel.sysadmin.dataquery;



import net.ibizsys.paas.core.DEDataQuery;
import net.ibizsys.paas.core.DEDataQueryCodes;
import net.ibizsys.paas.core.DEDataQueryCode;
import net.ibizsys.paas.core.DEDataQueryCodeExp;
import net.ibizsys.paas.core.DEDataQueryCodeCond;

@DEDataQuery(id="E569F918-C2CF-4BC5-8F13-60FCE083A83C",name="DEFAULT")
@DEDataQueryCodes({
    @DEDataQueryCode(querycode="SELECT t1.ADMINOBJECT, t1.CREATEDATE, t1.CREATEMAN, t1.MEMO, t1.RESERVER, t1.RESERVER2, t1.RESERVER3, t1.RESERVER4, t1.SYSADMINID, t1.SYSADMINNAME, t1.UPDATEDATE, t1.UPDATEMAN FROM T_SRFSYSADMIN t1 ",querycodetemp="",declarecode="",dbtype="DB2",
    fieldexps={
        @DEDataQueryCodeExp(name="ADMINOBJECT",expression="t1.ADMINOBJECT")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="RESERVER",expression="t1.RESERVER")
        ,@DEDataQueryCodeExp(name="RESERVER2",expression="t1.RESERVER2")
        ,@DEDataQueryCodeExp(name="RESERVER3",expression="t1.RESERVER3")
        ,@DEDataQueryCodeExp(name="RESERVER4",expression="t1.RESERVER4")
        ,@DEDataQueryCodeExp(name="SYSADMINID",expression="t1.SYSADMINID")
        ,@DEDataQueryCodeExp(name="SYSADMINNAME",expression="t1.SYSADMINNAME")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.`ADMINOBJECT`, t1.`CREATEDATE`, t1.`CREATEMAN`, t1.`MEMO`, t1.`RESERVER`, t1.`RESERVER2`, t1.`RESERVER3`, t1.`RESERVER4`, t1.`SYSADMINID`, t1.`SYSADMINNAME`, t1.`UPDATEDATE`, t1.`UPDATEMAN` FROM `T_SRFSYSADMIN` t1 ",querycodetemp="",declarecode="",dbtype="MYSQL5",
    fieldexps={
        @DEDataQueryCodeExp(name="ADMINOBJECT",expression="t1.`ADMINOBJECT`")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.`CREATEDATE`")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.`CREATEMAN`")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.`MEMO`")
        ,@DEDataQueryCodeExp(name="RESERVER",expression="t1.`RESERVER`")
        ,@DEDataQueryCodeExp(name="RESERVER2",expression="t1.`RESERVER2`")
        ,@DEDataQueryCodeExp(name="RESERVER3",expression="t1.`RESERVER3`")
        ,@DEDataQueryCodeExp(name="RESERVER4",expression="t1.`RESERVER4`")
        ,@DEDataQueryCodeExp(name="SYSADMINID",expression="t1.`SYSADMINID`")
        ,@DEDataQueryCodeExp(name="SYSADMINNAME",expression="t1.`SYSADMINNAME`")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.`UPDATEDATE`")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.`UPDATEMAN`")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.ADMINOBJECT, t1.CREATEDATE, t1.CREATEMAN, t1.MEMO, t1.RESERVER, t1.RESERVER2, t1.RESERVER3, t1.RESERVER4, t1.SYSADMINID, t1.SYSADMINNAME, t1.UPDATEDATE, t1.UPDATEMAN FROM T_SRFSYSADMIN t1 ",querycodetemp="",declarecode="",dbtype="ORACLE",
    fieldexps={
        @DEDataQueryCodeExp(name="ADMINOBJECT",expression="t1.ADMINOBJECT")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="RESERVER",expression="t1.RESERVER")
        ,@DEDataQueryCodeExp(name="RESERVER2",expression="t1.RESERVER2")
        ,@DEDataQueryCodeExp(name="RESERVER3",expression="t1.RESERVER3")
        ,@DEDataQueryCodeExp(name="RESERVER4",expression="t1.RESERVER4")
        ,@DEDataQueryCodeExp(name="SYSADMINID",expression="t1.SYSADMINID")
        ,@DEDataQueryCodeExp(name="SYSADMINNAME",expression="t1.SYSADMINNAME")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.[ADMINOBJECT], t1.[CREATEDATE], t1.[CREATEMAN], t1.[MEMO], t1.[RESERVER], t1.[RESERVER2], t1.[RESERVER3], t1.[RESERVER4], t1.[SYSADMINID], t1.[SYSADMINNAME], t1.[UPDATEDATE], t1.[UPDATEMAN] FROM [T_SRFSYSADMIN] t1 ",querycodetemp="",declarecode="",dbtype="SQLSERVER",
    fieldexps={
        @DEDataQueryCodeExp(name="ADMINOBJECT",expression="t1.[ADMINOBJECT]")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.[CREATEDATE]")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.[CREATEMAN]")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.[MEMO]")
        ,@DEDataQueryCodeExp(name="RESERVER",expression="t1.[RESERVER]")
        ,@DEDataQueryCodeExp(name="RESERVER2",expression="t1.[RESERVER2]")
        ,@DEDataQueryCodeExp(name="RESERVER3",expression="t1.[RESERVER3]")
        ,@DEDataQueryCodeExp(name="RESERVER4",expression="t1.[RESERVER4]")
        ,@DEDataQueryCodeExp(name="SYSADMINID",expression="t1.[SYSADMINID]")
        ,@DEDataQueryCodeExp(name="SYSADMINNAME",expression="t1.[SYSADMINNAME]")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.[UPDATEDATE]")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.[UPDATEMAN]")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.ADMINOBJECT, t1.CREATEDATE, t1.CREATEMAN, t1.MEMO, t1.RESERVER, t1.RESERVER2, t1.RESERVER3, t1.RESERVER4, t1.SYSADMINID, t1.SYSADMINNAME, t1.UPDATEDATE, t1.UPDATEMAN FROM T_SRFSYSADMIN t1 ",querycodetemp="",declarecode="",dbtype="POSTGRESQL",
    fieldexps={
        @DEDataQueryCodeExp(name="ADMINOBJECT",expression="t1.ADMINOBJECT")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="RESERVER",expression="t1.RESERVER")
        ,@DEDataQueryCodeExp(name="RESERVER2",expression="t1.RESERVER2")
        ,@DEDataQueryCodeExp(name="RESERVER3",expression="t1.RESERVER3")
        ,@DEDataQueryCodeExp(name="RESERVER4",expression="t1.RESERVER4")
        ,@DEDataQueryCodeExp(name="SYSADMINID",expression="t1.SYSADMINID")
        ,@DEDataQueryCodeExp(name="SYSADMINNAME",expression="t1.SYSADMINNAME")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.ADMINOBJECT, t1.CREATEDATE, t1.CREATEMAN, t1.MEMO, t1.RESERVER, t1.RESERVER2, t1.RESERVER3, t1.RESERVER4, t1.SYSADMINID, t1.SYSADMINNAME, t1.UPDATEDATE, t1.UPDATEMAN FROM T_SRFSYSADMIN t1 ",querycodetemp="",declarecode="",dbtype="PPAS",
    fieldexps={
        @DEDataQueryCodeExp(name="ADMINOBJECT",expression="t1.ADMINOBJECT")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="RESERVER",expression="t1.RESERVER")
        ,@DEDataQueryCodeExp(name="RESERVER2",expression="t1.RESERVER2")
        ,@DEDataQueryCodeExp(name="RESERVER3",expression="t1.RESERVER3")
        ,@DEDataQueryCodeExp(name="RESERVER4",expression="t1.RESERVER4")
        ,@DEDataQueryCodeExp(name="SYSADMINID",expression="t1.SYSADMINID")
        ,@DEDataQueryCodeExp(name="SYSADMINNAME",expression="t1.SYSADMINNAME")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
    },
    conds={})
})
/**
 *  实体数据查询 [DEFAULT]模型基类
 */
public abstract class SysAdminDefaultDQModelBase extends net.ibizsys.paas.demodel.DEDataQueryModelBase {

    public SysAdminDefaultDQModelBase() {
        super();

        this.initAnnotation(SysAdminDefaultDQModelBase.class);
    }

}