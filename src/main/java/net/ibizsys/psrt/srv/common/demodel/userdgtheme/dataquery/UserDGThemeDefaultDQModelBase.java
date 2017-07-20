/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package net.ibizsys.psrt.srv.common.demodel.userdgtheme.dataquery;



import net.ibizsys.paas.core.DEDataQuery;
import net.ibizsys.paas.core.DEDataQueryCodes;
import net.ibizsys.paas.core.DEDataQueryCode;
import net.ibizsys.paas.core.DEDataQueryCodeExp;
import net.ibizsys.paas.core.DEDataQueryCodeCond;

@DEDataQuery(id="5C414785-C655-4789-9CE6-01E8C1D66AEC",name="DEFAULT")
@DEDataQueryCodes({
    @DEDataQueryCode(querycode="SELECT t1.`CREATEDATE` AS `CREATEDATE`, t1.`CREATEMAN` AS `CREATEMAN`, t1.`DATAGRIDID` AS `DATAGRIDID`, t1.`DGTHEMEMODEL` AS `DGTHEMEMODEL`, t1.`PERSONID` AS `PERSONID`, t1.`PROJECTID` AS `PROJECTID`, t1.`RESERVER` AS `RESERVER`, t1.`RESERVER2` AS `RESERVER2`, t1.`RESERVER3` AS `RESERVER3`, t1.`UPDATEDATE` AS `UPDATEDATE`, t1.`UPDATEMAN` AS `UPDATEMAN`, t1.`USERDGTHEMEID` AS `USERDGTHEMEID`, t1.`USERDGTHEMENAME` AS `USERDGTHEMENAME` FROM `T_SRFUSERDGTHEME` t1 ",querycodetemp="",declarecode="",dbtype="MYSQL5",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.`CREATEDATE`")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.`CREATEMAN`")
        ,@DEDataQueryCodeExp(name="DATAGRIDID",expression="t1.`DATAGRIDID`")
        ,@DEDataQueryCodeExp(name="DGTHEMEMODEL",expression="t1.`DGTHEMEMODEL`")
        ,@DEDataQueryCodeExp(name="PERSONID",expression="t1.`PERSONID`")
        ,@DEDataQueryCodeExp(name="PROJECTID",expression="t1.`PROJECTID`")
        ,@DEDataQueryCodeExp(name="RESERVER",expression="t1.`RESERVER`")
        ,@DEDataQueryCodeExp(name="RESERVER2",expression="t1.`RESERVER2`")
        ,@DEDataQueryCodeExp(name="RESERVER3",expression="t1.`RESERVER3`")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.`UPDATEDATE`")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.`UPDATEMAN`")
        ,@DEDataQueryCodeExp(name="USERDGTHEMEID",expression="t1.`USERDGTHEMEID`")
        ,@DEDataQueryCodeExp(name="USERDGTHEMENAME",expression="t1.`USERDGTHEMENAME`")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE AS CREATEDATE, t1.CREATEMAN AS CREATEMAN, t1.DATAGRIDID AS DATAGRIDID, t1.DGTHEMEMODEL AS DGTHEMEMODEL, t1.PERSONID AS PERSONID, t1.PROJECTID AS PROJECTID, t1.RESERVER AS RESERVER, t1.RESERVER2 AS RESERVER2, t1.RESERVER3 AS RESERVER3, t1.UPDATEDATE AS UPDATEDATE, t1.UPDATEMAN AS UPDATEMAN, t1.USERDGTHEMEID AS USERDGTHEMEID, t1.USERDGTHEMENAME AS USERDGTHEMENAME FROM T_SRFUSERDGTHEME t1 ",querycodetemp="",declarecode="",dbtype="DB2",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="DATAGRIDID",expression="t1.DATAGRIDID")
        ,@DEDataQueryCodeExp(name="DGTHEMEMODEL",expression="t1.DGTHEMEMODEL")
        ,@DEDataQueryCodeExp(name="PERSONID",expression="t1.PERSONID")
        ,@DEDataQueryCodeExp(name="PROJECTID",expression="t1.PROJECTID")
        ,@DEDataQueryCodeExp(name="RESERVER",expression="t1.RESERVER")
        ,@DEDataQueryCodeExp(name="RESERVER2",expression="t1.RESERVER2")
        ,@DEDataQueryCodeExp(name="RESERVER3",expression="t1.RESERVER3")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="USERDGTHEMEID",expression="t1.USERDGTHEMEID")
        ,@DEDataQueryCodeExp(name="USERDGTHEMENAME",expression="t1.USERDGTHEMENAME")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE AS CREATEDATE, t1.CREATEMAN AS CREATEMAN, t1.DATAGRIDID AS DATAGRIDID, t1.DGTHEMEMODEL AS DGTHEMEMODEL, t1.PERSONID AS PERSONID, t1.PROJECTID AS PROJECTID, t1.RESERVER AS RESERVER, t1.RESERVER2 AS RESERVER2, t1.RESERVER3 AS RESERVER3, t1.UPDATEDATE AS UPDATEDATE, t1.UPDATEMAN AS UPDATEMAN, t1.USERDGTHEMEID AS USERDGTHEMEID, t1.USERDGTHEMENAME AS USERDGTHEMENAME FROM T_SRFUSERDGTHEME t1 ",querycodetemp="",declarecode="",dbtype="ORACLE",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="DATAGRIDID",expression="t1.DATAGRIDID")
        ,@DEDataQueryCodeExp(name="DGTHEMEMODEL",expression="t1.DGTHEMEMODEL")
        ,@DEDataQueryCodeExp(name="PERSONID",expression="t1.PERSONID")
        ,@DEDataQueryCodeExp(name="PROJECTID",expression="t1.PROJECTID")
        ,@DEDataQueryCodeExp(name="RESERVER",expression="t1.RESERVER")
        ,@DEDataQueryCodeExp(name="RESERVER2",expression="t1.RESERVER2")
        ,@DEDataQueryCodeExp(name="RESERVER3",expression="t1.RESERVER3")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="USERDGTHEMEID",expression="t1.USERDGTHEMEID")
        ,@DEDataQueryCodeExp(name="USERDGTHEMENAME",expression="t1.USERDGTHEMENAME")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.[CREATEDATE] AS [CREATEDATE], t1.[CREATEMAN] AS [CREATEMAN], t1.[DATAGRIDID] AS [DATAGRIDID], t1.[DGTHEMEMODEL] AS [DGTHEMEMODEL], t1.[PERSONID] AS [PERSONID], t1.[PROJECTID] AS [PROJECTID], t1.[RESERVER] AS [RESERVER], t1.[RESERVER2] AS [RESERVER2], t1.[RESERVER3] AS [RESERVER3], t1.[UPDATEDATE] AS [UPDATEDATE], t1.[UPDATEMAN] AS [UPDATEMAN], t1.[USERDGTHEMEID] AS [USERDGTHEMEID], t1.[USERDGTHEMENAME] AS [USERDGTHEMENAME] FROM [T_SRFUSERDGTHEME] t1 ",querycodetemp="",declarecode="",dbtype="SQLSERVER",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.[CREATEDATE]")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.[CREATEMAN]")
        ,@DEDataQueryCodeExp(name="DATAGRIDID",expression="t1.[DATAGRIDID]")
        ,@DEDataQueryCodeExp(name="DGTHEMEMODEL",expression="t1.[DGTHEMEMODEL]")
        ,@DEDataQueryCodeExp(name="PERSONID",expression="t1.[PERSONID]")
        ,@DEDataQueryCodeExp(name="PROJECTID",expression="t1.[PROJECTID]")
        ,@DEDataQueryCodeExp(name="RESERVER",expression="t1.[RESERVER]")
        ,@DEDataQueryCodeExp(name="RESERVER2",expression="t1.[RESERVER2]")
        ,@DEDataQueryCodeExp(name="RESERVER3",expression="t1.[RESERVER3]")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.[UPDATEDATE]")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.[UPDATEMAN]")
        ,@DEDataQueryCodeExp(name="USERDGTHEMEID",expression="t1.[USERDGTHEMEID]")
        ,@DEDataQueryCodeExp(name="USERDGTHEMENAME",expression="t1.[USERDGTHEMENAME]")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE AS CREATEDATE, t1.CREATEMAN AS CREATEMAN, t1.DATAGRIDID AS DATAGRIDID, t1.DGTHEMEMODEL AS DGTHEMEMODEL, t1.PERSONID AS PERSONID, t1.PROJECTID AS PROJECTID, t1.RESERVER AS RESERVER, t1.RESERVER2 AS RESERVER2, t1.RESERVER3 AS RESERVER3, t1.UPDATEDATE AS UPDATEDATE, t1.UPDATEMAN AS UPDATEMAN, t1.USERDGTHEMEID AS USERDGTHEMEID, t1.USERDGTHEMENAME AS USERDGTHEMENAME FROM T_SRFUSERDGTHEME t1 ",querycodetemp="",declarecode="",dbtype="POSTGRESQL",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="DATAGRIDID",expression="t1.DATAGRIDID")
        ,@DEDataQueryCodeExp(name="DGTHEMEMODEL",expression="t1.DGTHEMEMODEL")
        ,@DEDataQueryCodeExp(name="PERSONID",expression="t1.PERSONID")
        ,@DEDataQueryCodeExp(name="PROJECTID",expression="t1.PROJECTID")
        ,@DEDataQueryCodeExp(name="RESERVER",expression="t1.RESERVER")
        ,@DEDataQueryCodeExp(name="RESERVER2",expression="t1.RESERVER2")
        ,@DEDataQueryCodeExp(name="RESERVER3",expression="t1.RESERVER3")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="USERDGTHEMEID",expression="t1.USERDGTHEMEID")
        ,@DEDataQueryCodeExp(name="USERDGTHEMENAME",expression="t1.USERDGTHEMENAME")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE AS CREATEDATE, t1.CREATEMAN AS CREATEMAN, t1.DATAGRIDID AS DATAGRIDID, t1.DGTHEMEMODEL AS DGTHEMEMODEL, t1.PERSONID AS PERSONID, t1.PROJECTID AS PROJECTID, t1.RESERVER AS RESERVER, t1.RESERVER2 AS RESERVER2, t1.RESERVER3 AS RESERVER3, t1.UPDATEDATE AS UPDATEDATE, t1.UPDATEMAN AS UPDATEMAN, t1.USERDGTHEMEID AS USERDGTHEMEID, t1.USERDGTHEMENAME AS USERDGTHEMENAME FROM T_SRFUSERDGTHEME t1 ",querycodetemp="",declarecode="",dbtype="PPAS",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="DATAGRIDID",expression="t1.DATAGRIDID")
        ,@DEDataQueryCodeExp(name="DGTHEMEMODEL",expression="t1.DGTHEMEMODEL")
        ,@DEDataQueryCodeExp(name="PERSONID",expression="t1.PERSONID")
        ,@DEDataQueryCodeExp(name="PROJECTID",expression="t1.PROJECTID")
        ,@DEDataQueryCodeExp(name="RESERVER",expression="t1.RESERVER")
        ,@DEDataQueryCodeExp(name="RESERVER2",expression="t1.RESERVER2")
        ,@DEDataQueryCodeExp(name="RESERVER3",expression="t1.RESERVER3")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="USERDGTHEMEID",expression="t1.USERDGTHEMEID")
        ,@DEDataQueryCodeExp(name="USERDGTHEMENAME",expression="t1.USERDGTHEMENAME")
    },
    conds={})
})
/**
 *  实体数据查询 [DEFAULT]模型基类
 */
public abstract class UserDGThemeDefaultDQModelBase extends net.ibizsys.paas.demodel.DEDataQueryModelBase {

    public UserDGThemeDefaultDQModelBase() {
        super();

        this.initAnnotation(UserDGThemeDefaultDQModelBase.class);
    }

}