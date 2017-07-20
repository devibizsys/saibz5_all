/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package net.ibizsys.psrt.srv.common.demodel.tssdpolicy.dataquery;



import net.ibizsys.paas.core.DEDataQuery;
import net.ibizsys.paas.core.DEDataQueryCodes;
import net.ibizsys.paas.core.DEDataQueryCode;
import net.ibizsys.paas.core.DEDataQueryCodeExp;
import net.ibizsys.paas.core.DEDataQueryCodeCond;

@DEDataQuery(id="39BEF198-DED9-4539-AEFE-8DC349BFF20E",name="DEFAULT")
@DEDataQueryCodes({
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE AS CREATEDATE, t1.CREATEMAN AS CREATEMAN, t1.MEMO AS MEMO, t1.RESERVER AS RESERVER, t1.RESERVER2 AS RESERVER2, t1.RESERVER3 AS RESERVER3, t1.RESERVER4 AS RESERVER4, t1.TSSDPOLICYID AS TSSDPOLICYID, t1.TSSDPOLICYNAME AS TSSDPOLICYNAME, t1.TSSDPOLICYTYPE AS TSSDPOLICYTYPE, t1.UPDATEDATE AS UPDATEDATE, t1.UPDATEMAN AS UPDATEMAN FROM T_SRFTSSDPOLICY t1 ",querycodetemp="",declarecode="",dbtype="DB2",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="RESERVER",expression="t1.RESERVER")
        ,@DEDataQueryCodeExp(name="RESERVER2",expression="t1.RESERVER2")
        ,@DEDataQueryCodeExp(name="RESERVER3",expression="t1.RESERVER3")
        ,@DEDataQueryCodeExp(name="RESERVER4",expression="t1.RESERVER4")
        ,@DEDataQueryCodeExp(name="TSSDPOLICYID",expression="t1.TSSDPOLICYID")
        ,@DEDataQueryCodeExp(name="TSSDPOLICYNAME",expression="t1.TSSDPOLICYNAME")
        ,@DEDataQueryCodeExp(name="TSSDPOLICYTYPE",expression="t1.TSSDPOLICYTYPE")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.`CREATEDATE` AS `CREATEDATE`, t1.`CREATEMAN` AS `CREATEMAN`, t1.`MEMO` AS `MEMO`, t1.`RESERVER` AS `RESERVER`, t1.`RESERVER2` AS `RESERVER2`, t1.`RESERVER3` AS `RESERVER3`, t1.`RESERVER4` AS `RESERVER4`, t1.`TSSDPOLICYID` AS `TSSDPOLICYID`, t1.`TSSDPOLICYNAME` AS `TSSDPOLICYNAME`, t1.`TSSDPOLICYTYPE` AS `TSSDPOLICYTYPE`, t1.`UPDATEDATE` AS `UPDATEDATE`, t1.`UPDATEMAN` AS `UPDATEMAN` FROM `T_SRFTSSDPOLICY` t1 ",querycodetemp="",declarecode="",dbtype="MYSQL5",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.`CREATEDATE`")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.`CREATEMAN`")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.`MEMO`")
        ,@DEDataQueryCodeExp(name="RESERVER",expression="t1.`RESERVER`")
        ,@DEDataQueryCodeExp(name="RESERVER2",expression="t1.`RESERVER2`")
        ,@DEDataQueryCodeExp(name="RESERVER3",expression="t1.`RESERVER3`")
        ,@DEDataQueryCodeExp(name="RESERVER4",expression="t1.`RESERVER4`")
        ,@DEDataQueryCodeExp(name="TSSDPOLICYID",expression="t1.`TSSDPOLICYID`")
        ,@DEDataQueryCodeExp(name="TSSDPOLICYNAME",expression="t1.`TSSDPOLICYNAME`")
        ,@DEDataQueryCodeExp(name="TSSDPOLICYTYPE",expression="t1.`TSSDPOLICYTYPE`")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.`UPDATEDATE`")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.`UPDATEMAN`")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE AS CREATEDATE, t1.CREATEMAN AS CREATEMAN, t1.MEMO AS MEMO, t1.RESERVER AS RESERVER, t1.RESERVER2 AS RESERVER2, t1.RESERVER3 AS RESERVER3, t1.RESERVER4 AS RESERVER4, t1.TSSDPOLICYID AS TSSDPOLICYID, t1.TSSDPOLICYNAME AS TSSDPOLICYNAME, t1.TSSDPOLICYTYPE AS TSSDPOLICYTYPE, t1.UPDATEDATE AS UPDATEDATE, t1.UPDATEMAN AS UPDATEMAN FROM T_SRFTSSDPOLICY t1 ",querycodetemp="",declarecode="",dbtype="ORACLE",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="RESERVER",expression="t1.RESERVER")
        ,@DEDataQueryCodeExp(name="RESERVER2",expression="t1.RESERVER2")
        ,@DEDataQueryCodeExp(name="RESERVER3",expression="t1.RESERVER3")
        ,@DEDataQueryCodeExp(name="RESERVER4",expression="t1.RESERVER4")
        ,@DEDataQueryCodeExp(name="TSSDPOLICYID",expression="t1.TSSDPOLICYID")
        ,@DEDataQueryCodeExp(name="TSSDPOLICYNAME",expression="t1.TSSDPOLICYNAME")
        ,@DEDataQueryCodeExp(name="TSSDPOLICYTYPE",expression="t1.TSSDPOLICYTYPE")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.[CREATEDATE] AS [CREATEDATE], t1.[CREATEMAN] AS [CREATEMAN], t1.[MEMO] AS [MEMO], t1.[RESERVER] AS [RESERVER], t1.[RESERVER2] AS [RESERVER2], t1.[RESERVER3] AS [RESERVER3], t1.[RESERVER4] AS [RESERVER4], t1.[TSSDPOLICYID] AS [TSSDPOLICYID], t1.[TSSDPOLICYNAME] AS [TSSDPOLICYNAME], t1.[TSSDPOLICYTYPE] AS [TSSDPOLICYTYPE], t1.[UPDATEDATE] AS [UPDATEDATE], t1.[UPDATEMAN] AS [UPDATEMAN] FROM [T_SRFTSSDPOLICY] t1 ",querycodetemp="",declarecode="",dbtype="SQLSERVER",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.[CREATEDATE]")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.[CREATEMAN]")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.[MEMO]")
        ,@DEDataQueryCodeExp(name="RESERVER",expression="t1.[RESERVER]")
        ,@DEDataQueryCodeExp(name="RESERVER2",expression="t1.[RESERVER2]")
        ,@DEDataQueryCodeExp(name="RESERVER3",expression="t1.[RESERVER3]")
        ,@DEDataQueryCodeExp(name="RESERVER4",expression="t1.[RESERVER4]")
        ,@DEDataQueryCodeExp(name="TSSDPOLICYID",expression="t1.[TSSDPOLICYID]")
        ,@DEDataQueryCodeExp(name="TSSDPOLICYNAME",expression="t1.[TSSDPOLICYNAME]")
        ,@DEDataQueryCodeExp(name="TSSDPOLICYTYPE",expression="t1.[TSSDPOLICYTYPE]")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.[UPDATEDATE]")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.[UPDATEMAN]")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE AS CREATEDATE, t1.CREATEMAN AS CREATEMAN, t1.MEMO AS MEMO, t1.RESERVER AS RESERVER, t1.RESERVER2 AS RESERVER2, t1.RESERVER3 AS RESERVER3, t1.RESERVER4 AS RESERVER4, t1.TSSDPOLICYID AS TSSDPOLICYID, t1.TSSDPOLICYNAME AS TSSDPOLICYNAME, t1.TSSDPOLICYTYPE AS TSSDPOLICYTYPE, t1.UPDATEDATE AS UPDATEDATE, t1.UPDATEMAN AS UPDATEMAN FROM T_SRFTSSDPOLICY t1 ",querycodetemp="",declarecode="",dbtype="POSTGRESQL",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="RESERVER",expression="t1.RESERVER")
        ,@DEDataQueryCodeExp(name="RESERVER2",expression="t1.RESERVER2")
        ,@DEDataQueryCodeExp(name="RESERVER3",expression="t1.RESERVER3")
        ,@DEDataQueryCodeExp(name="RESERVER4",expression="t1.RESERVER4")
        ,@DEDataQueryCodeExp(name="TSSDPOLICYID",expression="t1.TSSDPOLICYID")
        ,@DEDataQueryCodeExp(name="TSSDPOLICYNAME",expression="t1.TSSDPOLICYNAME")
        ,@DEDataQueryCodeExp(name="TSSDPOLICYTYPE",expression="t1.TSSDPOLICYTYPE")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE AS CREATEDATE, t1.CREATEMAN AS CREATEMAN, t1.MEMO AS MEMO, t1.RESERVER AS RESERVER, t1.RESERVER2 AS RESERVER2, t1.RESERVER3 AS RESERVER3, t1.RESERVER4 AS RESERVER4, t1.TSSDPOLICYID AS TSSDPOLICYID, t1.TSSDPOLICYNAME AS TSSDPOLICYNAME, t1.TSSDPOLICYTYPE AS TSSDPOLICYTYPE, t1.UPDATEDATE AS UPDATEDATE, t1.UPDATEMAN AS UPDATEMAN FROM T_SRFTSSDPOLICY t1 ",querycodetemp="",declarecode="",dbtype="PPAS",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="RESERVER",expression="t1.RESERVER")
        ,@DEDataQueryCodeExp(name="RESERVER2",expression="t1.RESERVER2")
        ,@DEDataQueryCodeExp(name="RESERVER3",expression="t1.RESERVER3")
        ,@DEDataQueryCodeExp(name="RESERVER4",expression="t1.RESERVER4")
        ,@DEDataQueryCodeExp(name="TSSDPOLICYID",expression="t1.TSSDPOLICYID")
        ,@DEDataQueryCodeExp(name="TSSDPOLICYNAME",expression="t1.TSSDPOLICYNAME")
        ,@DEDataQueryCodeExp(name="TSSDPOLICYTYPE",expression="t1.TSSDPOLICYTYPE")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
    },
    conds={})
})
/**
 *  实体数据查询 [DEFAULT]模型基类
 */
public abstract class TSSDPolicyDefaultDQModelBase extends net.ibizsys.paas.demodel.DEDataQueryModelBase {

    public TSSDPolicyDefaultDQModelBase() {
        super();

        this.initAnnotation(TSSDPolicyDefaultDQModelBase.class);
    }

}