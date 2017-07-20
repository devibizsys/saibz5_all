/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package net.ibizsys.psrt.srv.common.demodel.tssdpolicyowner.dataquery;



import net.ibizsys.paas.core.DEDataQuery;
import net.ibizsys.paas.core.DEDataQueryCodes;
import net.ibizsys.paas.core.DEDataQueryCode;
import net.ibizsys.paas.core.DEDataQueryCodeExp;
import net.ibizsys.paas.core.DEDataQueryCodeCond;

@DEDataQuery(id="D365105B-BF2D-435F-A0E1-C5C4A6AC7816",name="DEFAULT")
@DEDataQueryCodes({
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE AS CREATEDATE, t1.CREATEMAN AS CREATEMAN, t1.RESERVER AS RESERVER, t1.RESERVER2 AS RESERVER2, t1.RESERVER3 AS RESERVER3, t1.RESERVER4 AS RESERVER4, t1.TSSDPOLICYOWNERID AS TSSDPOLICYOWNERID, t1.TSSDPOLICYOWNERID2 AS TSSDPOLICYOWNERID2, t1.TSSDPOLICYOWNERNAME AS TSSDPOLICYOWNERNAME, t1.TSSDPOLICYOWNERTYPE AS TSSDPOLICYOWNERTYPE, t1.UPDATEDATE AS UPDATEDATE, t1.UPDATEMAN AS UPDATEMAN FROM T_SRFTSSDPOLICYOWNER t1 ",querycodetemp="",declarecode="",dbtype="DB2",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="RESERVER",expression="t1.RESERVER")
        ,@DEDataQueryCodeExp(name="RESERVER2",expression="t1.RESERVER2")
        ,@DEDataQueryCodeExp(name="RESERVER3",expression="t1.RESERVER3")
        ,@DEDataQueryCodeExp(name="RESERVER4",expression="t1.RESERVER4")
        ,@DEDataQueryCodeExp(name="TSSDPOLICYOWNERID",expression="t1.TSSDPOLICYOWNERID")
        ,@DEDataQueryCodeExp(name="TSSDPOLICYOWNERID2",expression="t1.TSSDPOLICYOWNERID2")
        ,@DEDataQueryCodeExp(name="TSSDPOLICYOWNERNAME",expression="t1.TSSDPOLICYOWNERNAME")
        ,@DEDataQueryCodeExp(name="TSSDPOLICYOWNERTYPE",expression="t1.TSSDPOLICYOWNERTYPE")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.`CREATEDATE` AS `CREATEDATE`, t1.`CREATEMAN` AS `CREATEMAN`, t1.`RESERVER` AS `RESERVER`, t1.`RESERVER2` AS `RESERVER2`, t1.`RESERVER3` AS `RESERVER3`, t1.`RESERVER4` AS `RESERVER4`, t1.`TSSDPOLICYOWNERID` AS `TSSDPOLICYOWNERID`, t1.`TSSDPOLICYOWNERID2` AS `TSSDPOLICYOWNERID2`, t1.`TSSDPOLICYOWNERNAME` AS `TSSDPOLICYOWNERNAME`, t1.`TSSDPOLICYOWNERTYPE` AS `TSSDPOLICYOWNERTYPE`, t1.`UPDATEDATE` AS `UPDATEDATE`, t1.`UPDATEMAN` AS `UPDATEMAN` FROM `T_SRFTSSDPOLICYOWNER` t1 ",querycodetemp="",declarecode="",dbtype="MYSQL5",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.`CREATEDATE`")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.`CREATEMAN`")
        ,@DEDataQueryCodeExp(name="RESERVER",expression="t1.`RESERVER`")
        ,@DEDataQueryCodeExp(name="RESERVER2",expression="t1.`RESERVER2`")
        ,@DEDataQueryCodeExp(name="RESERVER3",expression="t1.`RESERVER3`")
        ,@DEDataQueryCodeExp(name="RESERVER4",expression="t1.`RESERVER4`")
        ,@DEDataQueryCodeExp(name="TSSDPOLICYOWNERID",expression="t1.`TSSDPOLICYOWNERID`")
        ,@DEDataQueryCodeExp(name="TSSDPOLICYOWNERID2",expression="t1.`TSSDPOLICYOWNERID2`")
        ,@DEDataQueryCodeExp(name="TSSDPOLICYOWNERNAME",expression="t1.`TSSDPOLICYOWNERNAME`")
        ,@DEDataQueryCodeExp(name="TSSDPOLICYOWNERTYPE",expression="t1.`TSSDPOLICYOWNERTYPE`")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.`UPDATEDATE`")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.`UPDATEMAN`")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE AS CREATEDATE, t1.CREATEMAN AS CREATEMAN, t1.RESERVER AS RESERVER, t1.RESERVER2 AS RESERVER2, t1.RESERVER3 AS RESERVER3, t1.RESERVER4 AS RESERVER4, t1.TSSDPOLICYOWNERID AS TSSDPOLICYOWNERID, t1.TSSDPOLICYOWNERID2 AS TSSDPOLICYOWNERID2, t1.TSSDPOLICYOWNERNAME AS TSSDPOLICYOWNERNAME, t1.TSSDPOLICYOWNERTYPE AS TSSDPOLICYOWNERTYPE, t1.UPDATEDATE AS UPDATEDATE, t1.UPDATEMAN AS UPDATEMAN FROM T_SRFTSSDPOLICYOWNER t1 ",querycodetemp="",declarecode="",dbtype="ORACLE",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="RESERVER",expression="t1.RESERVER")
        ,@DEDataQueryCodeExp(name="RESERVER2",expression="t1.RESERVER2")
        ,@DEDataQueryCodeExp(name="RESERVER3",expression="t1.RESERVER3")
        ,@DEDataQueryCodeExp(name="RESERVER4",expression="t1.RESERVER4")
        ,@DEDataQueryCodeExp(name="TSSDPOLICYOWNERID",expression="t1.TSSDPOLICYOWNERID")
        ,@DEDataQueryCodeExp(name="TSSDPOLICYOWNERID2",expression="t1.TSSDPOLICYOWNERID2")
        ,@DEDataQueryCodeExp(name="TSSDPOLICYOWNERNAME",expression="t1.TSSDPOLICYOWNERNAME")
        ,@DEDataQueryCodeExp(name="TSSDPOLICYOWNERTYPE",expression="t1.TSSDPOLICYOWNERTYPE")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.[CREATEDATE] AS [CREATEDATE], t1.[CREATEMAN] AS [CREATEMAN], t1.[RESERVER] AS [RESERVER], t1.[RESERVER2] AS [RESERVER2], t1.[RESERVER3] AS [RESERVER3], t1.[RESERVER4] AS [RESERVER4], t1.[TSSDPOLICYOWNERID] AS [TSSDPOLICYOWNERID], t1.[TSSDPOLICYOWNERID2] AS [TSSDPOLICYOWNERID2], t1.[TSSDPOLICYOWNERNAME] AS [TSSDPOLICYOWNERNAME], t1.[TSSDPOLICYOWNERTYPE] AS [TSSDPOLICYOWNERTYPE], t1.[UPDATEDATE] AS [UPDATEDATE], t1.[UPDATEMAN] AS [UPDATEMAN] FROM [T_SRFTSSDPOLICYOWNER] t1 ",querycodetemp="",declarecode="",dbtype="SQLSERVER",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.[CREATEDATE]")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.[CREATEMAN]")
        ,@DEDataQueryCodeExp(name="RESERVER",expression="t1.[RESERVER]")
        ,@DEDataQueryCodeExp(name="RESERVER2",expression="t1.[RESERVER2]")
        ,@DEDataQueryCodeExp(name="RESERVER3",expression="t1.[RESERVER3]")
        ,@DEDataQueryCodeExp(name="RESERVER4",expression="t1.[RESERVER4]")
        ,@DEDataQueryCodeExp(name="TSSDPOLICYOWNERID",expression="t1.[TSSDPOLICYOWNERID]")
        ,@DEDataQueryCodeExp(name="TSSDPOLICYOWNERID2",expression="t1.[TSSDPOLICYOWNERID2]")
        ,@DEDataQueryCodeExp(name="TSSDPOLICYOWNERNAME",expression="t1.[TSSDPOLICYOWNERNAME]")
        ,@DEDataQueryCodeExp(name="TSSDPOLICYOWNERTYPE",expression="t1.[TSSDPOLICYOWNERTYPE]")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.[UPDATEDATE]")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.[UPDATEMAN]")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE AS CREATEDATE, t1.CREATEMAN AS CREATEMAN, t1.RESERVER AS RESERVER, t1.RESERVER2 AS RESERVER2, t1.RESERVER3 AS RESERVER3, t1.RESERVER4 AS RESERVER4, t1.TSSDPOLICYOWNERID AS TSSDPOLICYOWNERID, t1.TSSDPOLICYOWNERID2 AS TSSDPOLICYOWNERID2, t1.TSSDPOLICYOWNERNAME AS TSSDPOLICYOWNERNAME, t1.TSSDPOLICYOWNERTYPE AS TSSDPOLICYOWNERTYPE, t1.UPDATEDATE AS UPDATEDATE, t1.UPDATEMAN AS UPDATEMAN FROM T_SRFTSSDPOLICYOWNER t1 ",querycodetemp="",declarecode="",dbtype="POSTGRESQL",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="RESERVER",expression="t1.RESERVER")
        ,@DEDataQueryCodeExp(name="RESERVER2",expression="t1.RESERVER2")
        ,@DEDataQueryCodeExp(name="RESERVER3",expression="t1.RESERVER3")
        ,@DEDataQueryCodeExp(name="RESERVER4",expression="t1.RESERVER4")
        ,@DEDataQueryCodeExp(name="TSSDPOLICYOWNERID",expression="t1.TSSDPOLICYOWNERID")
        ,@DEDataQueryCodeExp(name="TSSDPOLICYOWNERID2",expression="t1.TSSDPOLICYOWNERID2")
        ,@DEDataQueryCodeExp(name="TSSDPOLICYOWNERNAME",expression="t1.TSSDPOLICYOWNERNAME")
        ,@DEDataQueryCodeExp(name="TSSDPOLICYOWNERTYPE",expression="t1.TSSDPOLICYOWNERTYPE")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE AS CREATEDATE, t1.CREATEMAN AS CREATEMAN, t1.RESERVER AS RESERVER, t1.RESERVER2 AS RESERVER2, t1.RESERVER3 AS RESERVER3, t1.RESERVER4 AS RESERVER4, t1.TSSDPOLICYOWNERID AS TSSDPOLICYOWNERID, t1.TSSDPOLICYOWNERID2 AS TSSDPOLICYOWNERID2, t1.TSSDPOLICYOWNERNAME AS TSSDPOLICYOWNERNAME, t1.TSSDPOLICYOWNERTYPE AS TSSDPOLICYOWNERTYPE, t1.UPDATEDATE AS UPDATEDATE, t1.UPDATEMAN AS UPDATEMAN FROM T_SRFTSSDPOLICYOWNER t1 ",querycodetemp="",declarecode="",dbtype="PPAS",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="RESERVER",expression="t1.RESERVER")
        ,@DEDataQueryCodeExp(name="RESERVER2",expression="t1.RESERVER2")
        ,@DEDataQueryCodeExp(name="RESERVER3",expression="t1.RESERVER3")
        ,@DEDataQueryCodeExp(name="RESERVER4",expression="t1.RESERVER4")
        ,@DEDataQueryCodeExp(name="TSSDPOLICYOWNERID",expression="t1.TSSDPOLICYOWNERID")
        ,@DEDataQueryCodeExp(name="TSSDPOLICYOWNERID2",expression="t1.TSSDPOLICYOWNERID2")
        ,@DEDataQueryCodeExp(name="TSSDPOLICYOWNERNAME",expression="t1.TSSDPOLICYOWNERNAME")
        ,@DEDataQueryCodeExp(name="TSSDPOLICYOWNERTYPE",expression="t1.TSSDPOLICYOWNERTYPE")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
    },
    conds={})
})
/**
 *  实体数据查询 [DEFAULT]模型基类
 */
public abstract class TSSDPolicyOwnerDefaultDQModelBase extends net.ibizsys.paas.demodel.DEDataQueryModelBase {

    public TSSDPolicyOwnerDefaultDQModelBase() {
        super();

        this.initAnnotation(TSSDPolicyOwnerDefaultDQModelBase.class);
    }

}