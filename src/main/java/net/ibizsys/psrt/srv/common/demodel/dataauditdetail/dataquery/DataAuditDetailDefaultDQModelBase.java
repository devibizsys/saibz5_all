/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package net.ibizsys.psrt.srv.common.demodel.dataauditdetail.dataquery;



import net.ibizsys.paas.core.DEDataQuery;
import net.ibizsys.paas.core.DEDataQueryCodes;
import net.ibizsys.paas.core.DEDataQueryCode;
import net.ibizsys.paas.core.DEDataQueryCodeExp;
import net.ibizsys.paas.core.DEDataQueryCodeCond;

@DEDataQuery(id="A81A0345-DAFE-42E3-8215-326D98C4FE55",name="DEFAULT")
@DEDataQueryCodes({
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE, t1.CREATEMAN, t1.DATAAUDITDETAILID, t1.DATAAUDITDETAILNAME, t1.DATAAUDITID, t1.DATAAUDITNAME, t1.NEWTEXT, t1.NEWVALUE, t1.OLDTEXT, t1.OLDVALUE, t1.UPDATEDATE, t1.UPDATEMAN FROM T_SRFDATAAUDITDETAIL t1 ",querycodetemp="",declarecode="",dbtype="DB2",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="DATAAUDITDETAILID",expression="t1.DATAAUDITDETAILID")
        ,@DEDataQueryCodeExp(name="DATAAUDITDETAILNAME",expression="t1.DATAAUDITDETAILNAME")
        ,@DEDataQueryCodeExp(name="DATAAUDITID",expression="t1.DATAAUDITID")
        ,@DEDataQueryCodeExp(name="DATAAUDITNAME",expression="t1.DATAAUDITNAME")
        ,@DEDataQueryCodeExp(name="NEWTEXT",expression="t1.NEWTEXT")
        ,@DEDataQueryCodeExp(name="NEWVALUE",expression="t1.NEWVALUE")
        ,@DEDataQueryCodeExp(name="OLDTEXT",expression="t1.OLDTEXT")
        ,@DEDataQueryCodeExp(name="OLDVALUE",expression="t1.OLDVALUE")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.`CREATEDATE`, t1.`CREATEMAN`, t1.`DATAAUDITDETAILID`, t1.`DATAAUDITDETAILNAME`, t1.`DATAAUDITID`, t1.`DATAAUDITNAME`, t1.`NEWTEXT`, t1.`NEWVALUE`, t1.`OLDTEXT`, t1.`OLDVALUE`, t1.`UPDATEDATE`, t1.`UPDATEMAN` FROM `T_SRFDATAAUDITDETAIL` t1 ",querycodetemp="",declarecode="",dbtype="MYSQL5",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.`CREATEDATE`")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.`CREATEMAN`")
        ,@DEDataQueryCodeExp(name="DATAAUDITDETAILID",expression="t1.`DATAAUDITDETAILID`")
        ,@DEDataQueryCodeExp(name="DATAAUDITDETAILNAME",expression="t1.`DATAAUDITDETAILNAME`")
        ,@DEDataQueryCodeExp(name="DATAAUDITID",expression="t1.`DATAAUDITID`")
        ,@DEDataQueryCodeExp(name="DATAAUDITNAME",expression="t1.`DATAAUDITNAME`")
        ,@DEDataQueryCodeExp(name="NEWTEXT",expression="t1.`NEWTEXT`")
        ,@DEDataQueryCodeExp(name="NEWVALUE",expression="t1.`NEWVALUE`")
        ,@DEDataQueryCodeExp(name="OLDTEXT",expression="t1.`OLDTEXT`")
        ,@DEDataQueryCodeExp(name="OLDVALUE",expression="t1.`OLDVALUE`")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.`UPDATEDATE`")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.`UPDATEMAN`")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE, t1.CREATEMAN, t1.DATAAUDITDETAILID, t1.DATAAUDITDETAILNAME, t1.DATAAUDITID, t1.DATAAUDITNAME, t1.NEWTEXT, t1.NEWVALUE, t1.OLDTEXT, t1.OLDVALUE, t1.UPDATEDATE, t1.UPDATEMAN FROM T_SRFDATAAUDITDETAIL t1 ",querycodetemp="",declarecode="",dbtype="ORACLE",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="DATAAUDITDETAILID",expression="t1.DATAAUDITDETAILID")
        ,@DEDataQueryCodeExp(name="DATAAUDITDETAILNAME",expression="t1.DATAAUDITDETAILNAME")
        ,@DEDataQueryCodeExp(name="DATAAUDITID",expression="t1.DATAAUDITID")
        ,@DEDataQueryCodeExp(name="DATAAUDITNAME",expression="t1.DATAAUDITNAME")
        ,@DEDataQueryCodeExp(name="NEWTEXT",expression="t1.NEWTEXT")
        ,@DEDataQueryCodeExp(name="NEWVALUE",expression="t1.NEWVALUE")
        ,@DEDataQueryCodeExp(name="OLDTEXT",expression="t1.OLDTEXT")
        ,@DEDataQueryCodeExp(name="OLDVALUE",expression="t1.OLDVALUE")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.[CREATEDATE], t1.[CREATEMAN], t1.[DATAAUDITDETAILID], t1.[DATAAUDITDETAILNAME], t1.[DATAAUDITID], t1.[DATAAUDITNAME], t1.[NEWTEXT], t1.[NEWVALUE], t1.[OLDTEXT], t1.[OLDVALUE], t1.[UPDATEDATE], t1.[UPDATEMAN] FROM [T_SRFDATAAUDITDETAIL] t1 ",querycodetemp="",declarecode="",dbtype="SQLSERVER",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.[CREATEDATE]")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.[CREATEMAN]")
        ,@DEDataQueryCodeExp(name="DATAAUDITDETAILID",expression="t1.[DATAAUDITDETAILID]")
        ,@DEDataQueryCodeExp(name="DATAAUDITDETAILNAME",expression="t1.[DATAAUDITDETAILNAME]")
        ,@DEDataQueryCodeExp(name="DATAAUDITID",expression="t1.[DATAAUDITID]")
        ,@DEDataQueryCodeExp(name="DATAAUDITNAME",expression="t1.[DATAAUDITNAME]")
        ,@DEDataQueryCodeExp(name="NEWTEXT",expression="t1.[NEWTEXT]")
        ,@DEDataQueryCodeExp(name="NEWVALUE",expression="t1.[NEWVALUE]")
        ,@DEDataQueryCodeExp(name="OLDTEXT",expression="t1.[OLDTEXT]")
        ,@DEDataQueryCodeExp(name="OLDVALUE",expression="t1.[OLDVALUE]")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.[UPDATEDATE]")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.[UPDATEMAN]")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE, t1.CREATEMAN, t1.DATAAUDITDETAILID, t1.DATAAUDITDETAILNAME, t1.DATAAUDITID, t1.DATAAUDITNAME, t1.NEWTEXT, t1.NEWVALUE, t1.OLDTEXT, t1.OLDVALUE, t1.UPDATEDATE, t1.UPDATEMAN FROM T_SRFDATAAUDITDETAIL t1 ",querycodetemp="",declarecode="",dbtype="POSTGRESQL",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="DATAAUDITDETAILID",expression="t1.DATAAUDITDETAILID")
        ,@DEDataQueryCodeExp(name="DATAAUDITDETAILNAME",expression="t1.DATAAUDITDETAILNAME")
        ,@DEDataQueryCodeExp(name="DATAAUDITID",expression="t1.DATAAUDITID")
        ,@DEDataQueryCodeExp(name="DATAAUDITNAME",expression="t1.DATAAUDITNAME")
        ,@DEDataQueryCodeExp(name="NEWTEXT",expression="t1.NEWTEXT")
        ,@DEDataQueryCodeExp(name="NEWVALUE",expression="t1.NEWVALUE")
        ,@DEDataQueryCodeExp(name="OLDTEXT",expression="t1.OLDTEXT")
        ,@DEDataQueryCodeExp(name="OLDVALUE",expression="t1.OLDVALUE")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE, t1.CREATEMAN, t1.DATAAUDITDETAILID, t1.DATAAUDITDETAILNAME, t1.DATAAUDITID, t1.DATAAUDITNAME, t1.NEWTEXT, t1.NEWVALUE, t1.OLDTEXT, t1.OLDVALUE, t1.UPDATEDATE, t1.UPDATEMAN FROM T_SRFDATAAUDITDETAIL t1 ",querycodetemp="",declarecode="",dbtype="PPAS",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="DATAAUDITDETAILID",expression="t1.DATAAUDITDETAILID")
        ,@DEDataQueryCodeExp(name="DATAAUDITDETAILNAME",expression="t1.DATAAUDITDETAILNAME")
        ,@DEDataQueryCodeExp(name="DATAAUDITID",expression="t1.DATAAUDITID")
        ,@DEDataQueryCodeExp(name="DATAAUDITNAME",expression="t1.DATAAUDITNAME")
        ,@DEDataQueryCodeExp(name="NEWTEXT",expression="t1.NEWTEXT")
        ,@DEDataQueryCodeExp(name="NEWVALUE",expression="t1.NEWVALUE")
        ,@DEDataQueryCodeExp(name="OLDTEXT",expression="t1.OLDTEXT")
        ,@DEDataQueryCodeExp(name="OLDVALUE",expression="t1.OLDVALUE")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
    },
    conds={})
})
/**
 *  实体数据查询 [DEFAULT]模型基类
 */
public abstract class DataAuditDetailDefaultDQModelBase extends net.ibizsys.paas.demodel.DEDataQueryModelBase {

    public DataAuditDetailDefaultDQModelBase() {
        super();

        this.initAnnotation(DataAuditDetailDefaultDQModelBase.class);
    }

}