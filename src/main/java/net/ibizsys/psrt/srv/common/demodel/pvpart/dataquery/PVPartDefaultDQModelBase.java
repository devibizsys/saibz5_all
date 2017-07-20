/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package net.ibizsys.psrt.srv.common.demodel.pvpart.dataquery;



import net.ibizsys.paas.core.DEDataQuery;
import net.ibizsys.paas.core.DEDataQueryCodes;
import net.ibizsys.paas.core.DEDataQueryCode;
import net.ibizsys.paas.core.DEDataQueryCodeExp;
import net.ibizsys.paas.core.DEDataQueryCodeCond;

@DEDataQuery(id="306522FB-7103-4DDC-B334-51BC3D1AFF10",name="DEFAULT")
@DEDataQueryCodes({
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE, t1.CREATEMAN, t1.CTRLID, t1.MEMO, t1.PORTALPAGEID, t11.PORTALPAGENAME, t1.PVPARTID, t1.PVPARTNAME, t1.PVPARTTYPE, t1.UPDATEDATE, t1.UPDATEMAN FROM T_SRFPVPART t1  LEFT JOIN T_SRFPORTALPAGE t11 ON t1.PORTALPAGEID = t11.PORTALPAGEID ",querycodetemp="",declarecode="",dbtype="DB2",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="CTRLID",expression="t1.CTRLID")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="PORTALPAGEID",expression="t1.PORTALPAGEID")
        ,@DEDataQueryCodeExp(name="PORTALPAGENAME",expression="t11.PORTALPAGENAME")
        ,@DEDataQueryCodeExp(name="PVPARTID",expression="t1.PVPARTID")
        ,@DEDataQueryCodeExp(name="PVPARTNAME",expression="t1.PVPARTNAME")
        ,@DEDataQueryCodeExp(name="PVPARTTYPE",expression="t1.PVPARTTYPE")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.`CREATEDATE`, t1.`CREATEMAN`, t1.`CTRLID`, t1.`MEMO`, t1.`PORTALPAGEID`, t11.`PORTALPAGENAME`, t1.`PVPARTID`, t1.`PVPARTNAME`, t1.`PVPARTTYPE`, t1.`UPDATEDATE`, t1.`UPDATEMAN` FROM `T_SRFPVPART` t1  LEFT JOIN T_SRFPORTALPAGE t11 ON t1.PORTALPAGEID = t11.PORTALPAGEID ",querycodetemp="",declarecode="",dbtype="MYSQL5",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.`CREATEDATE`")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.`CREATEMAN`")
        ,@DEDataQueryCodeExp(name="CTRLID",expression="t1.`CTRLID`")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.`MEMO`")
        ,@DEDataQueryCodeExp(name="PORTALPAGEID",expression="t1.`PORTALPAGEID`")
        ,@DEDataQueryCodeExp(name="PORTALPAGENAME",expression="t11.`PORTALPAGENAME`")
        ,@DEDataQueryCodeExp(name="PVPARTID",expression="t1.`PVPARTID`")
        ,@DEDataQueryCodeExp(name="PVPARTNAME",expression="t1.`PVPARTNAME`")
        ,@DEDataQueryCodeExp(name="PVPARTTYPE",expression="t1.`PVPARTTYPE`")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.`UPDATEDATE`")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.`UPDATEMAN`")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE, t1.CREATEMAN, t1.CTRLID, t1.MEMO, t1.PORTALPAGEID, t11.PORTALPAGENAME, t1.PVPARTID, t1.PVPARTNAME, t1.PVPARTTYPE, t1.UPDATEDATE, t1.UPDATEMAN FROM T_SRFPVPART t1  LEFT JOIN T_SRFPORTALPAGE t11 ON t1.PORTALPAGEID = t11.PORTALPAGEID ",querycodetemp="",declarecode="",dbtype="ORACLE",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="CTRLID",expression="t1.CTRLID")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="PORTALPAGEID",expression="t1.PORTALPAGEID")
        ,@DEDataQueryCodeExp(name="PORTALPAGENAME",expression="t11.PORTALPAGENAME")
        ,@DEDataQueryCodeExp(name="PVPARTID",expression="t1.PVPARTID")
        ,@DEDataQueryCodeExp(name="PVPARTNAME",expression="t1.PVPARTNAME")
        ,@DEDataQueryCodeExp(name="PVPARTTYPE",expression="t1.PVPARTTYPE")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.[CREATEDATE], t1.[CREATEMAN], t1.[CTRLID], t1.[MEMO], t1.[PORTALPAGEID], t11.[PORTALPAGENAME], t1.[PVPARTID], t1.[PVPARTNAME], t1.[PVPARTTYPE], t1.[UPDATEDATE], t1.[UPDATEMAN] FROM [T_SRFPVPART] t1  LEFT JOIN T_SRFPORTALPAGE t11 ON t1.PORTALPAGEID = t11.PORTALPAGEID ",querycodetemp="",declarecode="",dbtype="SQLSERVER",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.[CREATEDATE]")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.[CREATEMAN]")
        ,@DEDataQueryCodeExp(name="CTRLID",expression="t1.[CTRLID]")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.[MEMO]")
        ,@DEDataQueryCodeExp(name="PORTALPAGEID",expression="t1.[PORTALPAGEID]")
        ,@DEDataQueryCodeExp(name="PORTALPAGENAME",expression="t11.[PORTALPAGENAME]")
        ,@DEDataQueryCodeExp(name="PVPARTID",expression="t1.[PVPARTID]")
        ,@DEDataQueryCodeExp(name="PVPARTNAME",expression="t1.[PVPARTNAME]")
        ,@DEDataQueryCodeExp(name="PVPARTTYPE",expression="t1.[PVPARTTYPE]")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.[UPDATEDATE]")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.[UPDATEMAN]")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE, t1.CREATEMAN, t1.CTRLID, t1.MEMO, t1.PORTALPAGEID, t11.PORTALPAGENAME, t1.PVPARTID, t1.PVPARTNAME, t1.PVPARTTYPE, t1.UPDATEDATE, t1.UPDATEMAN FROM T_SRFPVPART t1  LEFT JOIN T_SRFPORTALPAGE t11 ON t1.PORTALPAGEID = t11.PORTALPAGEID ",querycodetemp="",declarecode="",dbtype="POSTGRESQL",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="CTRLID",expression="t1.CTRLID")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="PORTALPAGEID",expression="t1.PORTALPAGEID")
        ,@DEDataQueryCodeExp(name="PORTALPAGENAME",expression="t11.PORTALPAGENAME")
        ,@DEDataQueryCodeExp(name="PVPARTID",expression="t1.PVPARTID")
        ,@DEDataQueryCodeExp(name="PVPARTNAME",expression="t1.PVPARTNAME")
        ,@DEDataQueryCodeExp(name="PVPARTTYPE",expression="t1.PVPARTTYPE")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE, t1.CREATEMAN, t1.CTRLID, t1.MEMO, t1.PORTALPAGEID, t11.PORTALPAGENAME, t1.PVPARTID, t1.PVPARTNAME, t1.PVPARTTYPE, t1.UPDATEDATE, t1.UPDATEMAN FROM T_SRFPVPART t1  LEFT JOIN T_SRFPORTALPAGE t11 ON t1.PORTALPAGEID = t11.PORTALPAGEID ",querycodetemp="",declarecode="",dbtype="PPAS",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="CTRLID",expression="t1.CTRLID")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="PORTALPAGEID",expression="t1.PORTALPAGEID")
        ,@DEDataQueryCodeExp(name="PORTALPAGENAME",expression="t11.PORTALPAGENAME")
        ,@DEDataQueryCodeExp(name="PVPARTID",expression="t1.PVPARTID")
        ,@DEDataQueryCodeExp(name="PVPARTNAME",expression="t1.PVPARTNAME")
        ,@DEDataQueryCodeExp(name="PVPARTTYPE",expression="t1.PVPARTTYPE")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
    },
    conds={})
})
/**
 *  实体数据查询 [DEFAULT]模型基类
 */
public abstract class PVPartDefaultDQModelBase extends net.ibizsys.paas.demodel.DEDataQueryModelBase {

    public PVPartDefaultDQModelBase() {
        super();

        this.initAnnotation(PVPartDefaultDQModelBase.class);
    }

}