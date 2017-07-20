/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package net.ibizsys.psrt.srv.common.demodel.portalpage.dataquery;



import net.ibizsys.paas.core.DEDataQuery;
import net.ibizsys.paas.core.DEDataQueryCodes;
import net.ibizsys.paas.core.DEDataQueryCode;
import net.ibizsys.paas.core.DEDataQueryCodeExp;
import net.ibizsys.paas.core.DEDataQueryCodeCond;

@DEDataQuery(id="13669A4D-36FB-4E42-82BF-34A2583D7CF1",name="DEFAULT")
@DEDataQueryCodes({
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE, t1.CREATEMAN, t1.ENABLECTX, t1.MEMO, t1.PORTALPAGEID, t1.PORTALPAGEMEMO, t1.PORTALPAGENAME, t1.UPDATEDATE, t1.UPDATEMAN FROM T_SRFPORTALPAGE t1 ",querycodetemp="",declarecode="",dbtype="DB2",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="ENABLECTX",expression="t1.ENABLECTX")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="PORTALPAGEID",expression="t1.PORTALPAGEID")
        ,@DEDataQueryCodeExp(name="PORTALPAGEMEMO",expression="t1.PORTALPAGEMEMO")
        ,@DEDataQueryCodeExp(name="PORTALPAGENAME",expression="t1.PORTALPAGENAME")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.`CREATEDATE`, t1.`CREATEMAN`, t1.`ENABLECTX`, t1.`MEMO`, t1.`PORTALPAGEID`, t1.`PORTALPAGEMEMO`, t1.`PORTALPAGENAME`, t1.`UPDATEDATE`, t1.`UPDATEMAN` FROM `T_SRFPORTALPAGE` t1 ",querycodetemp="",declarecode="",dbtype="MYSQL5",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.`CREATEDATE`")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.`CREATEMAN`")
        ,@DEDataQueryCodeExp(name="ENABLECTX",expression="t1.`ENABLECTX`")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.`MEMO`")
        ,@DEDataQueryCodeExp(name="PORTALPAGEID",expression="t1.`PORTALPAGEID`")
        ,@DEDataQueryCodeExp(name="PORTALPAGEMEMO",expression="t1.`PORTALPAGEMEMO`")
        ,@DEDataQueryCodeExp(name="PORTALPAGENAME",expression="t1.`PORTALPAGENAME`")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.`UPDATEDATE`")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.`UPDATEMAN`")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE, t1.CREATEMAN, t1.ENABLECTX, t1.MEMO, t1.PORTALPAGEID, t1.PORTALPAGEMEMO, t1.PORTALPAGENAME, t1.UPDATEDATE, t1.UPDATEMAN FROM T_SRFPORTALPAGE t1 ",querycodetemp="",declarecode="",dbtype="ORACLE",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="ENABLECTX",expression="t1.ENABLECTX")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="PORTALPAGEID",expression="t1.PORTALPAGEID")
        ,@DEDataQueryCodeExp(name="PORTALPAGEMEMO",expression="t1.PORTALPAGEMEMO")
        ,@DEDataQueryCodeExp(name="PORTALPAGENAME",expression="t1.PORTALPAGENAME")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.[CREATEDATE], t1.[CREATEMAN], t1.[ENABLECTX], t1.[MEMO], t1.[PORTALPAGEID], t1.[PORTALPAGEMEMO], t1.[PORTALPAGENAME], t1.[UPDATEDATE], t1.[UPDATEMAN] FROM [T_SRFPORTALPAGE] t1 ",querycodetemp="",declarecode="",dbtype="SQLSERVER",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.[CREATEDATE]")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.[CREATEMAN]")
        ,@DEDataQueryCodeExp(name="ENABLECTX",expression="t1.[ENABLECTX]")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.[MEMO]")
        ,@DEDataQueryCodeExp(name="PORTALPAGEID",expression="t1.[PORTALPAGEID]")
        ,@DEDataQueryCodeExp(name="PORTALPAGEMEMO",expression="t1.[PORTALPAGEMEMO]")
        ,@DEDataQueryCodeExp(name="PORTALPAGENAME",expression="t1.[PORTALPAGENAME]")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.[UPDATEDATE]")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.[UPDATEMAN]")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE, t1.CREATEMAN, t1.ENABLECTX, t1.MEMO, t1.PORTALPAGEID, t1.PORTALPAGEMEMO, t1.PORTALPAGENAME, t1.UPDATEDATE, t1.UPDATEMAN FROM T_SRFPORTALPAGE t1 ",querycodetemp="",declarecode="",dbtype="POSTGRESQL",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="ENABLECTX",expression="t1.ENABLECTX")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="PORTALPAGEID",expression="t1.PORTALPAGEID")
        ,@DEDataQueryCodeExp(name="PORTALPAGEMEMO",expression="t1.PORTALPAGEMEMO")
        ,@DEDataQueryCodeExp(name="PORTALPAGENAME",expression="t1.PORTALPAGENAME")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE, t1.CREATEMAN, t1.ENABLECTX, t1.MEMO, t1.PORTALPAGEID, t1.PORTALPAGEMEMO, t1.PORTALPAGENAME, t1.UPDATEDATE, t1.UPDATEMAN FROM T_SRFPORTALPAGE t1 ",querycodetemp="",declarecode="",dbtype="PPAS",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="ENABLECTX",expression="t1.ENABLECTX")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="PORTALPAGEID",expression="t1.PORTALPAGEID")
        ,@DEDataQueryCodeExp(name="PORTALPAGEMEMO",expression="t1.PORTALPAGEMEMO")
        ,@DEDataQueryCodeExp(name="PORTALPAGENAME",expression="t1.PORTALPAGENAME")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
    },
    conds={})
})
/**
 *  实体数据查询 [DEFAULT]模型基类
 */
public abstract class PortalPageDefaultDQModelBase extends net.ibizsys.paas.demodel.DEDataQueryModelBase {

    public PortalPageDefaultDQModelBase() {
        super();

        this.initAnnotation(PortalPageDefaultDQModelBase.class);
    }

}