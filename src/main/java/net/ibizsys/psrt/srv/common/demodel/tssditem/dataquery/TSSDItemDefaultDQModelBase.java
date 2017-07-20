/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package net.ibizsys.psrt.srv.common.demodel.tssditem.dataquery;



import net.ibizsys.paas.core.DEDataQuery;
import net.ibizsys.paas.core.DEDataQueryCodes;
import net.ibizsys.paas.core.DEDataQueryCode;
import net.ibizsys.paas.core.DEDataQueryCodeExp;
import net.ibizsys.paas.core.DEDataQueryCodeCond;

@DEDataQuery(id="DC63C7D0-E4DD-4CAB-BBF9-FE8ECAEE1432",name="DEFAULT")
@DEDataQueryCodes({
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE AS CREATEDATE, t1.CREATEMAN AS CREATEMAN, t1.HOURTYPE AS HOURTYPE, t1.HOURVALUE AS HOURVALUE, t1.MINUTETYPE AS MINUTETYPE, t1.MINUTEVALUE AS MINUTEVALUE, t1.MONTHDAYTYPE AS MONTHDAYTYPE, t1.MONTHDAYVALUE AS MONTHDAYVALUE, t1.MONTHTYPE AS MONTHTYPE, t1.MONTHVALUE AS MONTHVALUE, t1.MONTHWEEKTYPE AS MONTHWEEKTYPE, t1.MONTHWEEKVALUE AS MONTHWEEKVALUE, t1.SECONDTYPE AS SECONDTYPE, t1.SECONDVALUE AS SECONDVALUE, t1.TSSDITEMID AS TSSDITEMID, t1.TSSDITEMNAME AS TSSDITEMNAME, t1.UPDATEDATE AS UPDATEDATE, t1.UPDATEMAN AS UPDATEMAN, t1.VERSION AS VERSION FROM T_SRFTSSDITEM t1 ",querycodetemp="",declarecode="",dbtype="DB2",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="HOURTYPE",expression="t1.HOURTYPE")
        ,@DEDataQueryCodeExp(name="HOURVALUE",expression="t1.HOURVALUE")
        ,@DEDataQueryCodeExp(name="MINUTETYPE",expression="t1.MINUTETYPE")
        ,@DEDataQueryCodeExp(name="MINUTEVALUE",expression="t1.MINUTEVALUE")
        ,@DEDataQueryCodeExp(name="MONTHDAYTYPE",expression="t1.MONTHDAYTYPE")
        ,@DEDataQueryCodeExp(name="MONTHDAYVALUE",expression="t1.MONTHDAYVALUE")
        ,@DEDataQueryCodeExp(name="MONTHTYPE",expression="t1.MONTHTYPE")
        ,@DEDataQueryCodeExp(name="MONTHVALUE",expression="t1.MONTHVALUE")
        ,@DEDataQueryCodeExp(name="MONTHWEEKTYPE",expression="t1.MONTHWEEKTYPE")
        ,@DEDataQueryCodeExp(name="MONTHWEEKVALUE",expression="t1.MONTHWEEKVALUE")
        ,@DEDataQueryCodeExp(name="SECONDTYPE",expression="t1.SECONDTYPE")
        ,@DEDataQueryCodeExp(name="SECONDVALUE",expression="t1.SECONDVALUE")
        ,@DEDataQueryCodeExp(name="TSSDITEMID",expression="t1.TSSDITEMID")
        ,@DEDataQueryCodeExp(name="TSSDITEMNAME",expression="t1.TSSDITEMNAME")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="VERSION",expression="t1.VERSION")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.`CREATEDATE` AS `CREATEDATE`, t1.`CREATEMAN` AS `CREATEMAN`, t1.`HOURTYPE` AS `HOURTYPE`, t1.`HOURVALUE` AS `HOURVALUE`, t1.`MINUTETYPE` AS `MINUTETYPE`, t1.`MINUTEVALUE` AS `MINUTEVALUE`, t1.`MONTHDAYTYPE` AS `MONTHDAYTYPE`, t1.`MONTHDAYVALUE` AS `MONTHDAYVALUE`, t1.`MONTHTYPE` AS `MONTHTYPE`, t1.`MONTHVALUE` AS `MONTHVALUE`, t1.`MONTHWEEKTYPE` AS `MONTHWEEKTYPE`, t1.`MONTHWEEKVALUE` AS `MONTHWEEKVALUE`, t1.`SECONDTYPE` AS `SECONDTYPE`, t1.`SECONDVALUE` AS `SECONDVALUE`, t1.`TSSDITEMID` AS `TSSDITEMID`, t1.`TSSDITEMNAME` AS `TSSDITEMNAME`, t1.`UPDATEDATE` AS `UPDATEDATE`, t1.`UPDATEMAN` AS `UPDATEMAN`, t1.`VERSION` AS `VERSION` FROM `T_SRFTSSDITEM` t1 ",querycodetemp="",declarecode="",dbtype="MYSQL5",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.`CREATEDATE`")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.`CREATEMAN`")
        ,@DEDataQueryCodeExp(name="HOURTYPE",expression="t1.`HOURTYPE`")
        ,@DEDataQueryCodeExp(name="HOURVALUE",expression="t1.`HOURVALUE`")
        ,@DEDataQueryCodeExp(name="MINUTETYPE",expression="t1.`MINUTETYPE`")
        ,@DEDataQueryCodeExp(name="MINUTEVALUE",expression="t1.`MINUTEVALUE`")
        ,@DEDataQueryCodeExp(name="MONTHDAYTYPE",expression="t1.`MONTHDAYTYPE`")
        ,@DEDataQueryCodeExp(name="MONTHDAYVALUE",expression="t1.`MONTHDAYVALUE`")
        ,@DEDataQueryCodeExp(name="MONTHTYPE",expression="t1.`MONTHTYPE`")
        ,@DEDataQueryCodeExp(name="MONTHVALUE",expression="t1.`MONTHVALUE`")
        ,@DEDataQueryCodeExp(name="MONTHWEEKTYPE",expression="t1.`MONTHWEEKTYPE`")
        ,@DEDataQueryCodeExp(name="MONTHWEEKVALUE",expression="t1.`MONTHWEEKVALUE`")
        ,@DEDataQueryCodeExp(name="SECONDTYPE",expression="t1.`SECONDTYPE`")
        ,@DEDataQueryCodeExp(name="SECONDVALUE",expression="t1.`SECONDVALUE`")
        ,@DEDataQueryCodeExp(name="TSSDITEMID",expression="t1.`TSSDITEMID`")
        ,@DEDataQueryCodeExp(name="TSSDITEMNAME",expression="t1.`TSSDITEMNAME`")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.`UPDATEDATE`")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.`UPDATEMAN`")
        ,@DEDataQueryCodeExp(name="VERSION",expression="t1.`VERSION`")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE AS CREATEDATE, t1.CREATEMAN AS CREATEMAN, t1.HOURTYPE AS HOURTYPE, t1.HOURVALUE AS HOURVALUE, t1.MINUTETYPE AS MINUTETYPE, t1.MINUTEVALUE AS MINUTEVALUE, t1.MONTHDAYTYPE AS MONTHDAYTYPE, t1.MONTHDAYVALUE AS MONTHDAYVALUE, t1.MONTHTYPE AS MONTHTYPE, t1.MONTHVALUE AS MONTHVALUE, t1.MONTHWEEKTYPE AS MONTHWEEKTYPE, t1.MONTHWEEKVALUE AS MONTHWEEKVALUE, t1.SECONDTYPE AS SECONDTYPE, t1.SECONDVALUE AS SECONDVALUE, t1.TSSDITEMID AS TSSDITEMID, t1.TSSDITEMNAME AS TSSDITEMNAME, t1.UPDATEDATE AS UPDATEDATE, t1.UPDATEMAN AS UPDATEMAN, t1.VERSION AS VERSION FROM T_SRFTSSDITEM t1 ",querycodetemp="",declarecode="",dbtype="ORACLE",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="HOURTYPE",expression="t1.HOURTYPE")
        ,@DEDataQueryCodeExp(name="HOURVALUE",expression="t1.HOURVALUE")
        ,@DEDataQueryCodeExp(name="MINUTETYPE",expression="t1.MINUTETYPE")
        ,@DEDataQueryCodeExp(name="MINUTEVALUE",expression="t1.MINUTEVALUE")
        ,@DEDataQueryCodeExp(name="MONTHDAYTYPE",expression="t1.MONTHDAYTYPE")
        ,@DEDataQueryCodeExp(name="MONTHDAYVALUE",expression="t1.MONTHDAYVALUE")
        ,@DEDataQueryCodeExp(name="MONTHTYPE",expression="t1.MONTHTYPE")
        ,@DEDataQueryCodeExp(name="MONTHVALUE",expression="t1.MONTHVALUE")
        ,@DEDataQueryCodeExp(name="MONTHWEEKTYPE",expression="t1.MONTHWEEKTYPE")
        ,@DEDataQueryCodeExp(name="MONTHWEEKVALUE",expression="t1.MONTHWEEKVALUE")
        ,@DEDataQueryCodeExp(name="SECONDTYPE",expression="t1.SECONDTYPE")
        ,@DEDataQueryCodeExp(name="SECONDVALUE",expression="t1.SECONDVALUE")
        ,@DEDataQueryCodeExp(name="TSSDITEMID",expression="t1.TSSDITEMID")
        ,@DEDataQueryCodeExp(name="TSSDITEMNAME",expression="t1.TSSDITEMNAME")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="VERSION",expression="t1.VERSION")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.[CREATEDATE] AS [CREATEDATE], t1.[CREATEMAN] AS [CREATEMAN], t1.[HOURTYPE] AS [HOURTYPE], t1.[HOURVALUE] AS [HOURVALUE], t1.[MINUTETYPE] AS [MINUTETYPE], t1.[MINUTEVALUE] AS [MINUTEVALUE], t1.[MONTHDAYTYPE] AS [MONTHDAYTYPE], t1.[MONTHDAYVALUE] AS [MONTHDAYVALUE], t1.[MONTHTYPE] AS [MONTHTYPE], t1.[MONTHVALUE] AS [MONTHVALUE], t1.[MONTHWEEKTYPE] AS [MONTHWEEKTYPE], t1.[MONTHWEEKVALUE] AS [MONTHWEEKVALUE], t1.[SECONDTYPE] AS [SECONDTYPE], t1.[SECONDVALUE] AS [SECONDVALUE], t1.[TSSDITEMID] AS [TSSDITEMID], t1.[TSSDITEMNAME] AS [TSSDITEMNAME], t1.[UPDATEDATE] AS [UPDATEDATE], t1.[UPDATEMAN] AS [UPDATEMAN], t1.[VERSION] AS [VERSION] FROM [T_SRFTSSDITEM] t1 ",querycodetemp="",declarecode="",dbtype="SQLSERVER",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.[CREATEDATE]")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.[CREATEMAN]")
        ,@DEDataQueryCodeExp(name="HOURTYPE",expression="t1.[HOURTYPE]")
        ,@DEDataQueryCodeExp(name="HOURVALUE",expression="t1.[HOURVALUE]")
        ,@DEDataQueryCodeExp(name="MINUTETYPE",expression="t1.[MINUTETYPE]")
        ,@DEDataQueryCodeExp(name="MINUTEVALUE",expression="t1.[MINUTEVALUE]")
        ,@DEDataQueryCodeExp(name="MONTHDAYTYPE",expression="t1.[MONTHDAYTYPE]")
        ,@DEDataQueryCodeExp(name="MONTHDAYVALUE",expression="t1.[MONTHDAYVALUE]")
        ,@DEDataQueryCodeExp(name="MONTHTYPE",expression="t1.[MONTHTYPE]")
        ,@DEDataQueryCodeExp(name="MONTHVALUE",expression="t1.[MONTHVALUE]")
        ,@DEDataQueryCodeExp(name="MONTHWEEKTYPE",expression="t1.[MONTHWEEKTYPE]")
        ,@DEDataQueryCodeExp(name="MONTHWEEKVALUE",expression="t1.[MONTHWEEKVALUE]")
        ,@DEDataQueryCodeExp(name="SECONDTYPE",expression="t1.[SECONDTYPE]")
        ,@DEDataQueryCodeExp(name="SECONDVALUE",expression="t1.[SECONDVALUE]")
        ,@DEDataQueryCodeExp(name="TSSDITEMID",expression="t1.[TSSDITEMID]")
        ,@DEDataQueryCodeExp(name="TSSDITEMNAME",expression="t1.[TSSDITEMNAME]")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.[UPDATEDATE]")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.[UPDATEMAN]")
        ,@DEDataQueryCodeExp(name="VERSION",expression="t1.[VERSION]")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE AS CREATEDATE, t1.CREATEMAN AS CREATEMAN, t1.HOURTYPE AS HOURTYPE, t1.HOURVALUE AS HOURVALUE, t1.MINUTETYPE AS MINUTETYPE, t1.MINUTEVALUE AS MINUTEVALUE, t1.MONTHDAYTYPE AS MONTHDAYTYPE, t1.MONTHDAYVALUE AS MONTHDAYVALUE, t1.MONTHTYPE AS MONTHTYPE, t1.MONTHVALUE AS MONTHVALUE, t1.MONTHWEEKTYPE AS MONTHWEEKTYPE, t1.MONTHWEEKVALUE AS MONTHWEEKVALUE, t1.SECONDTYPE AS SECONDTYPE, t1.SECONDVALUE AS SECONDVALUE, t1.TSSDITEMID AS TSSDITEMID, t1.TSSDITEMNAME AS TSSDITEMNAME, t1.UPDATEDATE AS UPDATEDATE, t1.UPDATEMAN AS UPDATEMAN, t1.VERSION AS VERSION FROM T_SRFTSSDITEM t1 ",querycodetemp="",declarecode="",dbtype="POSTGRESQL",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="HOURTYPE",expression="t1.HOURTYPE")
        ,@DEDataQueryCodeExp(name="HOURVALUE",expression="t1.HOURVALUE")
        ,@DEDataQueryCodeExp(name="MINUTETYPE",expression="t1.MINUTETYPE")
        ,@DEDataQueryCodeExp(name="MINUTEVALUE",expression="t1.MINUTEVALUE")
        ,@DEDataQueryCodeExp(name="MONTHDAYTYPE",expression="t1.MONTHDAYTYPE")
        ,@DEDataQueryCodeExp(name="MONTHDAYVALUE",expression="t1.MONTHDAYVALUE")
        ,@DEDataQueryCodeExp(name="MONTHTYPE",expression="t1.MONTHTYPE")
        ,@DEDataQueryCodeExp(name="MONTHVALUE",expression="t1.MONTHVALUE")
        ,@DEDataQueryCodeExp(name="MONTHWEEKTYPE",expression="t1.MONTHWEEKTYPE")
        ,@DEDataQueryCodeExp(name="MONTHWEEKVALUE",expression="t1.MONTHWEEKVALUE")
        ,@DEDataQueryCodeExp(name="SECONDTYPE",expression="t1.SECONDTYPE")
        ,@DEDataQueryCodeExp(name="SECONDVALUE",expression="t1.SECONDVALUE")
        ,@DEDataQueryCodeExp(name="TSSDITEMID",expression="t1.TSSDITEMID")
        ,@DEDataQueryCodeExp(name="TSSDITEMNAME",expression="t1.TSSDITEMNAME")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="VERSION",expression="t1.VERSION")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE AS CREATEDATE, t1.CREATEMAN AS CREATEMAN, t1.HOURTYPE AS HOURTYPE, t1.HOURVALUE AS HOURVALUE, t1.MINUTETYPE AS MINUTETYPE, t1.MINUTEVALUE AS MINUTEVALUE, t1.MONTHDAYTYPE AS MONTHDAYTYPE, t1.MONTHDAYVALUE AS MONTHDAYVALUE, t1.MONTHTYPE AS MONTHTYPE, t1.MONTHVALUE AS MONTHVALUE, t1.MONTHWEEKTYPE AS MONTHWEEKTYPE, t1.MONTHWEEKVALUE AS MONTHWEEKVALUE, t1.SECONDTYPE AS SECONDTYPE, t1.SECONDVALUE AS SECONDVALUE, t1.TSSDITEMID AS TSSDITEMID, t1.TSSDITEMNAME AS TSSDITEMNAME, t1.UPDATEDATE AS UPDATEDATE, t1.UPDATEMAN AS UPDATEMAN, t1.VERSION AS VERSION FROM T_SRFTSSDITEM t1 ",querycodetemp="",declarecode="",dbtype="PPAS",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="HOURTYPE",expression="t1.HOURTYPE")
        ,@DEDataQueryCodeExp(name="HOURVALUE",expression="t1.HOURVALUE")
        ,@DEDataQueryCodeExp(name="MINUTETYPE",expression="t1.MINUTETYPE")
        ,@DEDataQueryCodeExp(name="MINUTEVALUE",expression="t1.MINUTEVALUE")
        ,@DEDataQueryCodeExp(name="MONTHDAYTYPE",expression="t1.MONTHDAYTYPE")
        ,@DEDataQueryCodeExp(name="MONTHDAYVALUE",expression="t1.MONTHDAYVALUE")
        ,@DEDataQueryCodeExp(name="MONTHTYPE",expression="t1.MONTHTYPE")
        ,@DEDataQueryCodeExp(name="MONTHVALUE",expression="t1.MONTHVALUE")
        ,@DEDataQueryCodeExp(name="MONTHWEEKTYPE",expression="t1.MONTHWEEKTYPE")
        ,@DEDataQueryCodeExp(name="MONTHWEEKVALUE",expression="t1.MONTHWEEKVALUE")
        ,@DEDataQueryCodeExp(name="SECONDTYPE",expression="t1.SECONDTYPE")
        ,@DEDataQueryCodeExp(name="SECONDVALUE",expression="t1.SECONDVALUE")
        ,@DEDataQueryCodeExp(name="TSSDITEMID",expression="t1.TSSDITEMID")
        ,@DEDataQueryCodeExp(name="TSSDITEMNAME",expression="t1.TSSDITEMNAME")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="VERSION",expression="t1.VERSION")
    },
    conds={})
})
/**
 *  实体数据查询 [DEFAULT]模型基类
 */
public abstract class TSSDItemDefaultDQModelBase extends net.ibizsys.paas.demodel.DEDataQueryModelBase {

    public TSSDItemDefaultDQModelBase() {
        super();

        this.initAnnotation(TSSDItemDefaultDQModelBase.class);
    }

}