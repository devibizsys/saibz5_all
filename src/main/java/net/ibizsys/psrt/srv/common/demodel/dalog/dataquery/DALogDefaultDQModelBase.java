/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package net.ibizsys.psrt.srv.common.demodel.dalog.dataquery;



import net.ibizsys.paas.core.DEDataQuery;
import net.ibizsys.paas.core.DEDataQueryCodes;
import net.ibizsys.paas.core.DEDataQueryCode;
import net.ibizsys.paas.core.DEDataQueryCodeExp;
import net.ibizsys.paas.core.DEDataQueryCodeCond;

@DEDataQuery(id="75321108-277E-4E54-8CDD-C088F3F87263",name="DEFAULT")
@DEDataQueryCodes({
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE AS CREATEDATE, t1.CREATEMAN AS CREATEMAN, t1.DALOG_ID AS DALOG_ID, t1.DALOG_NAME AS DALOG_NAME, t1.LOGINFO AS LOGINFO, t1.LOGSN AS LOGSN, t1.LOGTYPE AS LOGTYPE, t1.OBJECTID AS OBJECTID, t1.OBJECTTYPE AS OBJECTTYPE, t1.REMOTEADDR AS REMOTEADDR, t1.UPDATEDATE AS UPDATEDATE, t1.UPDATEMAN AS UPDATEMAN FROM T_SRFDALOG t1 ",querycodetemp="",declarecode="",dbtype="DB2",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="DALOG_ID",expression="t1.DALOG_ID")
        ,@DEDataQueryCodeExp(name="DALOG_NAME",expression="t1.DALOG_NAME")
        ,@DEDataQueryCodeExp(name="LOGINFO",expression="t1.LOGINFO")
        ,@DEDataQueryCodeExp(name="LOGSN",expression="t1.LOGSN")
        ,@DEDataQueryCodeExp(name="LOGTYPE",expression="t1.LOGTYPE")
        ,@DEDataQueryCodeExp(name="OBJECTID",expression="t1.OBJECTID")
        ,@DEDataQueryCodeExp(name="OBJECTTYPE",expression="t1.OBJECTTYPE")
        ,@DEDataQueryCodeExp(name="REMOTEADDR",expression="t1.REMOTEADDR")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.`CREATEDATE` AS `CREATEDATE`, t1.`CREATEMAN` AS `CREATEMAN`, t1.`DALOG_ID` AS `DALOG_ID`, t1.`DALOG_NAME` AS `DALOG_NAME`, t1.`LOGINFO` AS `LOGINFO`, t1.`LOGSN` AS `LOGSN`, t1.`LOGTYPE` AS `LOGTYPE`, t1.`OBJECTID` AS `OBJECTID`, t1.`OBJECTTYPE` AS `OBJECTTYPE`, t1.`REMOTEADDR` AS `REMOTEADDR`, t1.`UPDATEDATE` AS `UPDATEDATE`, t1.`UPDATEMAN` AS `UPDATEMAN` FROM `T_SRFDALOG` t1 ",querycodetemp="",declarecode="",dbtype="MYSQL5",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.`CREATEDATE`")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.`CREATEMAN`")
        ,@DEDataQueryCodeExp(name="DALOG_ID",expression="t1.`DALOG_ID`")
        ,@DEDataQueryCodeExp(name="DALOG_NAME",expression="t1.`DALOG_NAME`")
        ,@DEDataQueryCodeExp(name="LOGINFO",expression="t1.`LOGINFO`")
        ,@DEDataQueryCodeExp(name="LOGSN",expression="t1.`LOGSN`")
        ,@DEDataQueryCodeExp(name="LOGTYPE",expression="t1.`LOGTYPE`")
        ,@DEDataQueryCodeExp(name="OBJECTID",expression="t1.`OBJECTID`")
        ,@DEDataQueryCodeExp(name="OBJECTTYPE",expression="t1.`OBJECTTYPE`")
        ,@DEDataQueryCodeExp(name="REMOTEADDR",expression="t1.`REMOTEADDR`")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.`UPDATEDATE`")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.`UPDATEMAN`")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE AS CREATEDATE, t1.CREATEMAN AS CREATEMAN, t1.DALOG_ID AS DALOG_ID, t1.DALOG_NAME AS DALOG_NAME, t1.LOGINFO AS LOGINFO, t1.LOGSN AS LOGSN, t1.LOGTYPE AS LOGTYPE, t1.OBJECTID AS OBJECTID, t1.OBJECTTYPE AS OBJECTTYPE, t1.REMOTEADDR AS REMOTEADDR, t1.UPDATEDATE AS UPDATEDATE, t1.UPDATEMAN AS UPDATEMAN FROM T_SRFDALOG t1 ",querycodetemp="",declarecode="",dbtype="ORACLE",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="DALOG_ID",expression="t1.DALOG_ID")
        ,@DEDataQueryCodeExp(name="DALOG_NAME",expression="t1.DALOG_NAME")
        ,@DEDataQueryCodeExp(name="LOGINFO",expression="t1.LOGINFO")
        ,@DEDataQueryCodeExp(name="LOGSN",expression="t1.LOGSN")
        ,@DEDataQueryCodeExp(name="LOGTYPE",expression="t1.LOGTYPE")
        ,@DEDataQueryCodeExp(name="OBJECTID",expression="t1.OBJECTID")
        ,@DEDataQueryCodeExp(name="OBJECTTYPE",expression="t1.OBJECTTYPE")
        ,@DEDataQueryCodeExp(name="REMOTEADDR",expression="t1.REMOTEADDR")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.[CREATEDATE] AS [CREATEDATE], t1.[CREATEMAN] AS [CREATEMAN], t1.[DALOG_ID] AS [DALOG_ID], t1.[DALOG_NAME] AS [DALOG_NAME], t1.[LOGINFO] AS [LOGINFO], t1.[LOGSN] AS [LOGSN], t1.[LOGTYPE] AS [LOGTYPE], t1.[OBJECTID] AS [OBJECTID], t1.[OBJECTTYPE] AS [OBJECTTYPE], t1.[REMOTEADDR] AS [REMOTEADDR], t1.[UPDATEDATE] AS [UPDATEDATE], t1.[UPDATEMAN] AS [UPDATEMAN] FROM [T_SRFDALOG] t1 ",querycodetemp="",declarecode="",dbtype="SQLSERVER",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.[CREATEDATE]")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.[CREATEMAN]")
        ,@DEDataQueryCodeExp(name="DALOG_ID",expression="t1.[DALOG_ID]")
        ,@DEDataQueryCodeExp(name="DALOG_NAME",expression="t1.[DALOG_NAME]")
        ,@DEDataQueryCodeExp(name="LOGINFO",expression="t1.[LOGINFO]")
        ,@DEDataQueryCodeExp(name="LOGSN",expression="t1.[LOGSN]")
        ,@DEDataQueryCodeExp(name="LOGTYPE",expression="t1.[LOGTYPE]")
        ,@DEDataQueryCodeExp(name="OBJECTID",expression="t1.[OBJECTID]")
        ,@DEDataQueryCodeExp(name="OBJECTTYPE",expression="t1.[OBJECTTYPE]")
        ,@DEDataQueryCodeExp(name="REMOTEADDR",expression="t1.[REMOTEADDR]")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.[UPDATEDATE]")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.[UPDATEMAN]")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE AS CREATEDATE, t1.CREATEMAN AS CREATEMAN, t1.DALOG_ID AS DALOG_ID, t1.DALOG_NAME AS DALOG_NAME, t1.LOGINFO AS LOGINFO, t1.LOGSN AS LOGSN, t1.LOGTYPE AS LOGTYPE, t1.OBJECTID AS OBJECTID, t1.OBJECTTYPE AS OBJECTTYPE, t1.REMOTEADDR AS REMOTEADDR, t1.UPDATEDATE AS UPDATEDATE, t1.UPDATEMAN AS UPDATEMAN FROM T_SRFDALOG t1 ",querycodetemp="",declarecode="",dbtype="POSTGRESQL",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="DALOG_ID",expression="t1.DALOG_ID")
        ,@DEDataQueryCodeExp(name="DALOG_NAME",expression="t1.DALOG_NAME")
        ,@DEDataQueryCodeExp(name="LOGINFO",expression="t1.LOGINFO")
        ,@DEDataQueryCodeExp(name="LOGSN",expression="t1.LOGSN")
        ,@DEDataQueryCodeExp(name="LOGTYPE",expression="t1.LOGTYPE")
        ,@DEDataQueryCodeExp(name="OBJECTID",expression="t1.OBJECTID")
        ,@DEDataQueryCodeExp(name="OBJECTTYPE",expression="t1.OBJECTTYPE")
        ,@DEDataQueryCodeExp(name="REMOTEADDR",expression="t1.REMOTEADDR")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE AS CREATEDATE, t1.CREATEMAN AS CREATEMAN, t1.DALOG_ID AS DALOG_ID, t1.DALOG_NAME AS DALOG_NAME, t1.LOGINFO AS LOGINFO, t1.LOGSN AS LOGSN, t1.LOGTYPE AS LOGTYPE, t1.OBJECTID AS OBJECTID, t1.OBJECTTYPE AS OBJECTTYPE, t1.REMOTEADDR AS REMOTEADDR, t1.UPDATEDATE AS UPDATEDATE, t1.UPDATEMAN AS UPDATEMAN FROM T_SRFDALOG t1 ",querycodetemp="",declarecode="",dbtype="PPAS",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="DALOG_ID",expression="t1.DALOG_ID")
        ,@DEDataQueryCodeExp(name="DALOG_NAME",expression="t1.DALOG_NAME")
        ,@DEDataQueryCodeExp(name="LOGINFO",expression="t1.LOGINFO")
        ,@DEDataQueryCodeExp(name="LOGSN",expression="t1.LOGSN")
        ,@DEDataQueryCodeExp(name="LOGTYPE",expression="t1.LOGTYPE")
        ,@DEDataQueryCodeExp(name="OBJECTID",expression="t1.OBJECTID")
        ,@DEDataQueryCodeExp(name="OBJECTTYPE",expression="t1.OBJECTTYPE")
        ,@DEDataQueryCodeExp(name="REMOTEADDR",expression="t1.REMOTEADDR")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
    },
    conds={})
})
/**
 *  实体数据查询 [DEFAULT]模型基类
 */
public abstract class DALogDefaultDQModelBase extends net.ibizsys.paas.demodel.DEDataQueryModelBase {

    public DALogDefaultDQModelBase() {
        super();

        this.initAnnotation(DALogDefaultDQModelBase.class);
    }

}