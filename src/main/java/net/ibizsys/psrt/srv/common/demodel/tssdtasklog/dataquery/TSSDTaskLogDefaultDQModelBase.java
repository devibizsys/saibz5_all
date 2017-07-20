/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package net.ibizsys.psrt.srv.common.demodel.tssdtasklog.dataquery;



import net.ibizsys.paas.core.DEDataQuery;
import net.ibizsys.paas.core.DEDataQueryCodes;
import net.ibizsys.paas.core.DEDataQueryCode;
import net.ibizsys.paas.core.DEDataQueryCodeExp;
import net.ibizsys.paas.core.DEDataQueryCodeCond;

@DEDataQuery(id="966CF9BD-AE11-4915-B195-7DA3DEEE7E0E",name="DEFAULT")
@DEDataQueryCodes({
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE AS CREATEDATE, t1.CREATEMAN AS CREATEMAN, t1.DURATION AS DURATION, t1.ENDTIME AS ENDTIME, t1.RETCODE AS RETCODE, t1.RETINFO AS RETINFO, t1.STARTTIME AS STARTTIME, t1.TSSDTASKID AS TSSDTASKID, t1.TSSDTASKLOGID AS TSSDTASKLOGID, t1.TSSDTASKLOGNAME AS TSSDTASKLOGNAME, t1.TSSDTASKNAME AS TSSDTASKNAME, t1.UPDATEDATE AS UPDATEDATE, t1.UPDATEMAN AS UPDATEMAN FROM T_SRFTSSDTASKLOG t1 ",querycodetemp="",declarecode="",dbtype="DB2",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="DURATION",expression="t1.DURATION")
        ,@DEDataQueryCodeExp(name="ENDTIME",expression="t1.ENDTIME")
        ,@DEDataQueryCodeExp(name="RETCODE",expression="t1.RETCODE")
        ,@DEDataQueryCodeExp(name="RETINFO",expression="t1.RETINFO")
        ,@DEDataQueryCodeExp(name="STARTTIME",expression="t1.STARTTIME")
        ,@DEDataQueryCodeExp(name="TSSDTASKID",expression="t1.TSSDTASKID")
        ,@DEDataQueryCodeExp(name="TSSDTASKLOGID",expression="t1.TSSDTASKLOGID")
        ,@DEDataQueryCodeExp(name="TSSDTASKLOGNAME",expression="t1.TSSDTASKLOGNAME")
        ,@DEDataQueryCodeExp(name="TSSDTASKNAME",expression="t1.TSSDTASKNAME")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.`CREATEDATE` AS `CREATEDATE`, t1.`CREATEMAN` AS `CREATEMAN`, t1.`DURATION` AS `DURATION`, t1.`ENDTIME` AS `ENDTIME`, t1.`RETCODE` AS `RETCODE`, t1.`RETINFO` AS `RETINFO`, t1.`STARTTIME` AS `STARTTIME`, t1.`TSSDTASKID` AS `TSSDTASKID`, t1.`TSSDTASKLOGID` AS `TSSDTASKLOGID`, t1.`TSSDTASKLOGNAME` AS `TSSDTASKLOGNAME`, t1.`TSSDTASKNAME` AS `TSSDTASKNAME`, t1.`UPDATEDATE` AS `UPDATEDATE`, t1.`UPDATEMAN` AS `UPDATEMAN` FROM `T_SRFTSSDTASKLOG` t1 ",querycodetemp="",declarecode="",dbtype="MYSQL5",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.`CREATEDATE`")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.`CREATEMAN`")
        ,@DEDataQueryCodeExp(name="DURATION",expression="t1.`DURATION`")
        ,@DEDataQueryCodeExp(name="ENDTIME",expression="t1.`ENDTIME`")
        ,@DEDataQueryCodeExp(name="RETCODE",expression="t1.`RETCODE`")
        ,@DEDataQueryCodeExp(name="RETINFO",expression="t1.`RETINFO`")
        ,@DEDataQueryCodeExp(name="STARTTIME",expression="t1.`STARTTIME`")
        ,@DEDataQueryCodeExp(name="TSSDTASKID",expression="t1.`TSSDTASKID`")
        ,@DEDataQueryCodeExp(name="TSSDTASKLOGID",expression="t1.`TSSDTASKLOGID`")
        ,@DEDataQueryCodeExp(name="TSSDTASKLOGNAME",expression="t1.`TSSDTASKLOGNAME`")
        ,@DEDataQueryCodeExp(name="TSSDTASKNAME",expression="t1.`TSSDTASKNAME`")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.`UPDATEDATE`")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.`UPDATEMAN`")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE AS CREATEDATE, t1.CREATEMAN AS CREATEMAN, t1.DURATION AS DURATION, t1.ENDTIME AS ENDTIME, t1.RETCODE AS RETCODE, t1.RETINFO AS RETINFO, t1.STARTTIME AS STARTTIME, t1.TSSDTASKID AS TSSDTASKID, t1.TSSDTASKLOGID AS TSSDTASKLOGID, t1.TSSDTASKLOGNAME AS TSSDTASKLOGNAME, t1.TSSDTASKNAME AS TSSDTASKNAME, t1.UPDATEDATE AS UPDATEDATE, t1.UPDATEMAN AS UPDATEMAN FROM T_SRFTSSDTASKLOG t1 ",querycodetemp="",declarecode="",dbtype="ORACLE",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="DURATION",expression="t1.DURATION")
        ,@DEDataQueryCodeExp(name="ENDTIME",expression="t1.ENDTIME")
        ,@DEDataQueryCodeExp(name="RETCODE",expression="t1.RETCODE")
        ,@DEDataQueryCodeExp(name="RETINFO",expression="t1.RETINFO")
        ,@DEDataQueryCodeExp(name="STARTTIME",expression="t1.STARTTIME")
        ,@DEDataQueryCodeExp(name="TSSDTASKID",expression="t1.TSSDTASKID")
        ,@DEDataQueryCodeExp(name="TSSDTASKLOGID",expression="t1.TSSDTASKLOGID")
        ,@DEDataQueryCodeExp(name="TSSDTASKLOGNAME",expression="t1.TSSDTASKLOGNAME")
        ,@DEDataQueryCodeExp(name="TSSDTASKNAME",expression="t1.TSSDTASKNAME")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.[CREATEDATE] AS [CREATEDATE], t1.[CREATEMAN] AS [CREATEMAN], t1.[DURATION] AS [DURATION], t1.[ENDTIME] AS [ENDTIME], t1.[RETCODE] AS [RETCODE], t1.[RETINFO] AS [RETINFO], t1.[STARTTIME] AS [STARTTIME], t1.[TSSDTASKID] AS [TSSDTASKID], t1.[TSSDTASKLOGID] AS [TSSDTASKLOGID], t1.[TSSDTASKLOGNAME] AS [TSSDTASKLOGNAME], t1.[TSSDTASKNAME] AS [TSSDTASKNAME], t1.[UPDATEDATE] AS [UPDATEDATE], t1.[UPDATEMAN] AS [UPDATEMAN] FROM [T_SRFTSSDTASKLOG] t1 ",querycodetemp="",declarecode="",dbtype="SQLSERVER",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.[CREATEDATE]")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.[CREATEMAN]")
        ,@DEDataQueryCodeExp(name="DURATION",expression="t1.[DURATION]")
        ,@DEDataQueryCodeExp(name="ENDTIME",expression="t1.[ENDTIME]")
        ,@DEDataQueryCodeExp(name="RETCODE",expression="t1.[RETCODE]")
        ,@DEDataQueryCodeExp(name="RETINFO",expression="t1.[RETINFO]")
        ,@DEDataQueryCodeExp(name="STARTTIME",expression="t1.[STARTTIME]")
        ,@DEDataQueryCodeExp(name="TSSDTASKID",expression="t1.[TSSDTASKID]")
        ,@DEDataQueryCodeExp(name="TSSDTASKLOGID",expression="t1.[TSSDTASKLOGID]")
        ,@DEDataQueryCodeExp(name="TSSDTASKLOGNAME",expression="t1.[TSSDTASKLOGNAME]")
        ,@DEDataQueryCodeExp(name="TSSDTASKNAME",expression="t1.[TSSDTASKNAME]")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.[UPDATEDATE]")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.[UPDATEMAN]")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE AS CREATEDATE, t1.CREATEMAN AS CREATEMAN, t1.DURATION AS DURATION, t1.ENDTIME AS ENDTIME, t1.RETCODE AS RETCODE, t1.RETINFO AS RETINFO, t1.STARTTIME AS STARTTIME, t1.TSSDTASKID AS TSSDTASKID, t1.TSSDTASKLOGID AS TSSDTASKLOGID, t1.TSSDTASKLOGNAME AS TSSDTASKLOGNAME, t1.TSSDTASKNAME AS TSSDTASKNAME, t1.UPDATEDATE AS UPDATEDATE, t1.UPDATEMAN AS UPDATEMAN FROM T_SRFTSSDTASKLOG t1 ",querycodetemp="",declarecode="",dbtype="POSTGRESQL",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="DURATION",expression="t1.DURATION")
        ,@DEDataQueryCodeExp(name="ENDTIME",expression="t1.ENDTIME")
        ,@DEDataQueryCodeExp(name="RETCODE",expression="t1.RETCODE")
        ,@DEDataQueryCodeExp(name="RETINFO",expression="t1.RETINFO")
        ,@DEDataQueryCodeExp(name="STARTTIME",expression="t1.STARTTIME")
        ,@DEDataQueryCodeExp(name="TSSDTASKID",expression="t1.TSSDTASKID")
        ,@DEDataQueryCodeExp(name="TSSDTASKLOGID",expression="t1.TSSDTASKLOGID")
        ,@DEDataQueryCodeExp(name="TSSDTASKLOGNAME",expression="t1.TSSDTASKLOGNAME")
        ,@DEDataQueryCodeExp(name="TSSDTASKNAME",expression="t1.TSSDTASKNAME")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE AS CREATEDATE, t1.CREATEMAN AS CREATEMAN, t1.DURATION AS DURATION, t1.ENDTIME AS ENDTIME, t1.RETCODE AS RETCODE, t1.RETINFO AS RETINFO, t1.STARTTIME AS STARTTIME, t1.TSSDTASKID AS TSSDTASKID, t1.TSSDTASKLOGID AS TSSDTASKLOGID, t1.TSSDTASKLOGNAME AS TSSDTASKLOGNAME, t1.TSSDTASKNAME AS TSSDTASKNAME, t1.UPDATEDATE AS UPDATEDATE, t1.UPDATEMAN AS UPDATEMAN FROM T_SRFTSSDTASKLOG t1 ",querycodetemp="",declarecode="",dbtype="PPAS",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="DURATION",expression="t1.DURATION")
        ,@DEDataQueryCodeExp(name="ENDTIME",expression="t1.ENDTIME")
        ,@DEDataQueryCodeExp(name="RETCODE",expression="t1.RETCODE")
        ,@DEDataQueryCodeExp(name="RETINFO",expression="t1.RETINFO")
        ,@DEDataQueryCodeExp(name="STARTTIME",expression="t1.STARTTIME")
        ,@DEDataQueryCodeExp(name="TSSDTASKID",expression="t1.TSSDTASKID")
        ,@DEDataQueryCodeExp(name="TSSDTASKLOGID",expression="t1.TSSDTASKLOGID")
        ,@DEDataQueryCodeExp(name="TSSDTASKLOGNAME",expression="t1.TSSDTASKLOGNAME")
        ,@DEDataQueryCodeExp(name="TSSDTASKNAME",expression="t1.TSSDTASKNAME")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
    },
    conds={})
})
/**
 *  实体数据查询 [DEFAULT]模型基类
 */
public abstract class TSSDTaskLogDefaultDQModelBase extends net.ibizsys.paas.demodel.DEDataQueryModelBase {

    public TSSDTaskLogDefaultDQModelBase() {
        super();

        this.initAnnotation(TSSDTaskLogDefaultDQModelBase.class);
    }

}