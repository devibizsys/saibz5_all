/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package net.ibizsys.psrt.srv.common.demodel.userroledatadetail.dataquery;



import net.ibizsys.paas.core.DEDataQuery;
import net.ibizsys.paas.core.DEDataQueryCodes;
import net.ibizsys.paas.core.DEDataQueryCode;
import net.ibizsys.paas.core.DEDataQueryCodeExp;
import net.ibizsys.paas.core.DEDataQueryCodeCond;

@DEDataQuery(id="39A7C025-DE82-4378-81BC-47A95FA43616",name="DEFAULT")
@DEDataQueryCodes({
    @DEDataQueryCode(querycode="SELECT t1.`CREATEDATE` AS `CREATEDATE`, t1.`CREATEMAN` AS `CREATEMAN`, t1.`ISEXCLUDE` AS `ISEXCLUDE`, t1.`MEMO` AS `MEMO`, t1.`QUERYMODELID` AS `QUERYMODELID`, t11.`QUERYMODELNAME` AS `QUERYMODELNAME`, t1.`RESERVER` AS `RESERVER`, t1.`RESERVER2` AS `RESERVER2`, t1.`RESERVER3` AS `RESERVER3`, t1.`RESERVER4` AS `RESERVER4`, t1.`UPDATEDATE` AS `UPDATEDATE`, t1.`UPDATEMAN` AS `UPDATEMAN`, t1.`USERROLEDATADETAILID` AS `USERROLEDATADETAILID`, t1.`USERROLEDATADETAILNAME` AS `USERROLEDATADETAILNAME`, t1.`USERROLEDATAID` AS `USERROLEDATAID`, t21.`USERROLEDATANAME` AS `USERROLEDATANAME` FROM `T_SRFUSERROLEDATADETAIL` t1  LEFT JOIN T_SRFQUERYMODEL t11 ON t1.QUERYMODELID = t11.QUERYMODELID  LEFT JOIN T_SRFUSERROLEDATA t21 ON t1.USERROLEDATAID = t21.USERROLEDATAID ",querycodetemp="",declarecode="",dbtype="MYSQL5",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.`CREATEDATE`")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.`CREATEMAN`")
        ,@DEDataQueryCodeExp(name="ISEXCLUDE",expression="t1.`ISEXCLUDE`")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.`MEMO`")
        ,@DEDataQueryCodeExp(name="QUERYMODELID",expression="t1.`QUERYMODELID`")
        ,@DEDataQueryCodeExp(name="QUERYMODELNAME",expression="t11.`QUERYMODELNAME`")
        ,@DEDataQueryCodeExp(name="RESERVER",expression="t1.`RESERVER`")
        ,@DEDataQueryCodeExp(name="RESERVER2",expression="t1.`RESERVER2`")
        ,@DEDataQueryCodeExp(name="RESERVER3",expression="t1.`RESERVER3`")
        ,@DEDataQueryCodeExp(name="RESERVER4",expression="t1.`RESERVER4`")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.`UPDATEDATE`")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.`UPDATEMAN`")
        ,@DEDataQueryCodeExp(name="USERROLEDATADETAILID",expression="t1.`USERROLEDATADETAILID`")
        ,@DEDataQueryCodeExp(name="USERROLEDATADETAILNAME",expression="t1.`USERROLEDATADETAILNAME`")
        ,@DEDataQueryCodeExp(name="USERROLEDATAID",expression="t1.`USERROLEDATAID`")
        ,@DEDataQueryCodeExp(name="USERROLEDATANAME",expression="t21.`USERROLEDATANAME`")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE AS CREATEDATE, t1.CREATEMAN AS CREATEMAN, t1.ISEXCLUDE AS ISEXCLUDE, t1.MEMO AS MEMO, t1.QUERYMODELID AS QUERYMODELID, t11.QUERYMODELNAME AS QUERYMODELNAME, t1.RESERVER AS RESERVER, t1.RESERVER2 AS RESERVER2, t1.RESERVER3 AS RESERVER3, t1.RESERVER4 AS RESERVER4, t1.UPDATEDATE AS UPDATEDATE, t1.UPDATEMAN AS UPDATEMAN, t1.USERROLEDATADETAILID AS USERROLEDATADETAILID, t1.USERROLEDATADETAILNAME AS USERROLEDATADETAILNAME, t1.USERROLEDATAID AS USERROLEDATAID, t21.USERROLEDATANAME AS USERROLEDATANAME FROM T_SRFUSERROLEDATADETAIL t1  LEFT JOIN T_SRFQUERYMODEL t11 ON t1.QUERYMODELID = t11.QUERYMODELID  LEFT JOIN T_SRFUSERROLEDATA t21 ON t1.USERROLEDATAID = t21.USERROLEDATAID ",querycodetemp="",declarecode="",dbtype="DB2",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="ISEXCLUDE",expression="t1.ISEXCLUDE")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="QUERYMODELID",expression="t1.QUERYMODELID")
        ,@DEDataQueryCodeExp(name="QUERYMODELNAME",expression="t11.QUERYMODELNAME")
        ,@DEDataQueryCodeExp(name="RESERVER",expression="t1.RESERVER")
        ,@DEDataQueryCodeExp(name="RESERVER2",expression="t1.RESERVER2")
        ,@DEDataQueryCodeExp(name="RESERVER3",expression="t1.RESERVER3")
        ,@DEDataQueryCodeExp(name="RESERVER4",expression="t1.RESERVER4")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="USERROLEDATADETAILID",expression="t1.USERROLEDATADETAILID")
        ,@DEDataQueryCodeExp(name="USERROLEDATADETAILNAME",expression="t1.USERROLEDATADETAILNAME")
        ,@DEDataQueryCodeExp(name="USERROLEDATAID",expression="t1.USERROLEDATAID")
        ,@DEDataQueryCodeExp(name="USERROLEDATANAME",expression="t21.USERROLEDATANAME")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE AS CREATEDATE, t1.CREATEMAN AS CREATEMAN, t1.ISEXCLUDE AS ISEXCLUDE, t1.MEMO AS MEMO, t1.QUERYMODELID AS QUERYMODELID, t11.QUERYMODELNAME AS QUERYMODELNAME, t1.RESERVER AS RESERVER, t1.RESERVER2 AS RESERVER2, t1.RESERVER3 AS RESERVER3, t1.RESERVER4 AS RESERVER4, t1.UPDATEDATE AS UPDATEDATE, t1.UPDATEMAN AS UPDATEMAN, t1.USERROLEDATADETAILID AS USERROLEDATADETAILID, t1.USERROLEDATADETAILNAME AS USERROLEDATADETAILNAME, t1.USERROLEDATAID AS USERROLEDATAID, t21.USERROLEDATANAME AS USERROLEDATANAME FROM T_SRFUSERROLEDATADETAIL t1  LEFT JOIN T_SRFQUERYMODEL t11 ON t1.QUERYMODELID = t11.QUERYMODELID  LEFT JOIN T_SRFUSERROLEDATA t21 ON t1.USERROLEDATAID = t21.USERROLEDATAID ",querycodetemp="",declarecode="",dbtype="ORACLE",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="ISEXCLUDE",expression="t1.ISEXCLUDE")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="QUERYMODELID",expression="t1.QUERYMODELID")
        ,@DEDataQueryCodeExp(name="QUERYMODELNAME",expression="t11.QUERYMODELNAME")
        ,@DEDataQueryCodeExp(name="RESERVER",expression="t1.RESERVER")
        ,@DEDataQueryCodeExp(name="RESERVER2",expression="t1.RESERVER2")
        ,@DEDataQueryCodeExp(name="RESERVER3",expression="t1.RESERVER3")
        ,@DEDataQueryCodeExp(name="RESERVER4",expression="t1.RESERVER4")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="USERROLEDATADETAILID",expression="t1.USERROLEDATADETAILID")
        ,@DEDataQueryCodeExp(name="USERROLEDATADETAILNAME",expression="t1.USERROLEDATADETAILNAME")
        ,@DEDataQueryCodeExp(name="USERROLEDATAID",expression="t1.USERROLEDATAID")
        ,@DEDataQueryCodeExp(name="USERROLEDATANAME",expression="t21.USERROLEDATANAME")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.[CREATEDATE] AS [CREATEDATE], t1.[CREATEMAN] AS [CREATEMAN], t1.[ISEXCLUDE] AS [ISEXCLUDE], t1.[MEMO] AS [MEMO], t1.[QUERYMODELID] AS [QUERYMODELID], t11.[QUERYMODELNAME] AS [QUERYMODELNAME], t1.[RESERVER] AS [RESERVER], t1.[RESERVER2] AS [RESERVER2], t1.[RESERVER3] AS [RESERVER3], t1.[RESERVER4] AS [RESERVER4], t1.[UPDATEDATE] AS [UPDATEDATE], t1.[UPDATEMAN] AS [UPDATEMAN], t1.[USERROLEDATADETAILID] AS [USERROLEDATADETAILID], t1.[USERROLEDATADETAILNAME] AS [USERROLEDATADETAILNAME], t1.[USERROLEDATAID] AS [USERROLEDATAID], t21.[USERROLEDATANAME] AS [USERROLEDATANAME] FROM [T_SRFUSERROLEDATADETAIL] t1  LEFT JOIN T_SRFQUERYMODEL t11 ON t1.QUERYMODELID = t11.QUERYMODELID  LEFT JOIN T_SRFUSERROLEDATA t21 ON t1.USERROLEDATAID = t21.USERROLEDATAID ",querycodetemp="",declarecode="",dbtype="SQLSERVER",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.[CREATEDATE]")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.[CREATEMAN]")
        ,@DEDataQueryCodeExp(name="ISEXCLUDE",expression="t1.[ISEXCLUDE]")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.[MEMO]")
        ,@DEDataQueryCodeExp(name="QUERYMODELID",expression="t1.[QUERYMODELID]")
        ,@DEDataQueryCodeExp(name="QUERYMODELNAME",expression="t11.[QUERYMODELNAME]")
        ,@DEDataQueryCodeExp(name="RESERVER",expression="t1.[RESERVER]")
        ,@DEDataQueryCodeExp(name="RESERVER2",expression="t1.[RESERVER2]")
        ,@DEDataQueryCodeExp(name="RESERVER3",expression="t1.[RESERVER3]")
        ,@DEDataQueryCodeExp(name="RESERVER4",expression="t1.[RESERVER4]")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.[UPDATEDATE]")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.[UPDATEMAN]")
        ,@DEDataQueryCodeExp(name="USERROLEDATADETAILID",expression="t1.[USERROLEDATADETAILID]")
        ,@DEDataQueryCodeExp(name="USERROLEDATADETAILNAME",expression="t1.[USERROLEDATADETAILNAME]")
        ,@DEDataQueryCodeExp(name="USERROLEDATAID",expression="t1.[USERROLEDATAID]")
        ,@DEDataQueryCodeExp(name="USERROLEDATANAME",expression="t21.[USERROLEDATANAME]")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE AS CREATEDATE, t1.CREATEMAN AS CREATEMAN, t1.ISEXCLUDE AS ISEXCLUDE, t1.MEMO AS MEMO, t1.QUERYMODELID AS QUERYMODELID, t11.QUERYMODELNAME AS QUERYMODELNAME, t1.RESERVER AS RESERVER, t1.RESERVER2 AS RESERVER2, t1.RESERVER3 AS RESERVER3, t1.RESERVER4 AS RESERVER4, t1.UPDATEDATE AS UPDATEDATE, t1.UPDATEMAN AS UPDATEMAN, t1.USERROLEDATADETAILID AS USERROLEDATADETAILID, t1.USERROLEDATADETAILNAME AS USERROLEDATADETAILNAME, t1.USERROLEDATAID AS USERROLEDATAID, t21.USERROLEDATANAME AS USERROLEDATANAME FROM T_SRFUSERROLEDATADETAIL t1  LEFT JOIN T_SRFQUERYMODEL t11 ON t1.QUERYMODELID = t11.QUERYMODELID  LEFT JOIN T_SRFUSERROLEDATA t21 ON t1.USERROLEDATAID = t21.USERROLEDATAID ",querycodetemp="",declarecode="",dbtype="POSTGRESQL",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="ISEXCLUDE",expression="t1.ISEXCLUDE")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="QUERYMODELID",expression="t1.QUERYMODELID")
        ,@DEDataQueryCodeExp(name="QUERYMODELNAME",expression="t11.QUERYMODELNAME")
        ,@DEDataQueryCodeExp(name="RESERVER",expression="t1.RESERVER")
        ,@DEDataQueryCodeExp(name="RESERVER2",expression="t1.RESERVER2")
        ,@DEDataQueryCodeExp(name="RESERVER3",expression="t1.RESERVER3")
        ,@DEDataQueryCodeExp(name="RESERVER4",expression="t1.RESERVER4")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="USERROLEDATADETAILID",expression="t1.USERROLEDATADETAILID")
        ,@DEDataQueryCodeExp(name="USERROLEDATADETAILNAME",expression="t1.USERROLEDATADETAILNAME")
        ,@DEDataQueryCodeExp(name="USERROLEDATAID",expression="t1.USERROLEDATAID")
        ,@DEDataQueryCodeExp(name="USERROLEDATANAME",expression="t21.USERROLEDATANAME")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE AS CREATEDATE, t1.CREATEMAN AS CREATEMAN, t1.ISEXCLUDE AS ISEXCLUDE, t1.MEMO AS MEMO, t1.QUERYMODELID AS QUERYMODELID, t11.QUERYMODELNAME AS QUERYMODELNAME, t1.RESERVER AS RESERVER, t1.RESERVER2 AS RESERVER2, t1.RESERVER3 AS RESERVER3, t1.RESERVER4 AS RESERVER4, t1.UPDATEDATE AS UPDATEDATE, t1.UPDATEMAN AS UPDATEMAN, t1.USERROLEDATADETAILID AS USERROLEDATADETAILID, t1.USERROLEDATADETAILNAME AS USERROLEDATADETAILNAME, t1.USERROLEDATAID AS USERROLEDATAID, t21.USERROLEDATANAME AS USERROLEDATANAME FROM T_SRFUSERROLEDATADETAIL t1  LEFT JOIN T_SRFQUERYMODEL t11 ON t1.QUERYMODELID = t11.QUERYMODELID  LEFT JOIN T_SRFUSERROLEDATA t21 ON t1.USERROLEDATAID = t21.USERROLEDATAID ",querycodetemp="",declarecode="",dbtype="PPAS",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="ISEXCLUDE",expression="t1.ISEXCLUDE")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="QUERYMODELID",expression="t1.QUERYMODELID")
        ,@DEDataQueryCodeExp(name="QUERYMODELNAME",expression="t11.QUERYMODELNAME")
        ,@DEDataQueryCodeExp(name="RESERVER",expression="t1.RESERVER")
        ,@DEDataQueryCodeExp(name="RESERVER2",expression="t1.RESERVER2")
        ,@DEDataQueryCodeExp(name="RESERVER3",expression="t1.RESERVER3")
        ,@DEDataQueryCodeExp(name="RESERVER4",expression="t1.RESERVER4")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="USERROLEDATADETAILID",expression="t1.USERROLEDATADETAILID")
        ,@DEDataQueryCodeExp(name="USERROLEDATADETAILNAME",expression="t1.USERROLEDATADETAILNAME")
        ,@DEDataQueryCodeExp(name="USERROLEDATAID",expression="t1.USERROLEDATAID")
        ,@DEDataQueryCodeExp(name="USERROLEDATANAME",expression="t21.USERROLEDATANAME")
    },
    conds={})
})
/**
 *  实体数据查询 [DEFAULT]模型基类
 */
public abstract class UserRoleDataDetailDefaultDQModelBase extends net.ibizsys.paas.demodel.DEDataQueryModelBase {

    public UserRoleDataDetailDefaultDQModelBase() {
        super();

        this.initAnnotation(UserRoleDataDetailDefaultDQModelBase.class);
    }

}