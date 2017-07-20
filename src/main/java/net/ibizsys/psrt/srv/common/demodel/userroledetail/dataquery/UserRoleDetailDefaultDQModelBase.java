/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package net.ibizsys.psrt.srv.common.demodel.userroledetail.dataquery;



import net.ibizsys.paas.core.DEDataQuery;
import net.ibizsys.paas.core.DEDataQueryCodes;
import net.ibizsys.paas.core.DEDataQueryCode;
import net.ibizsys.paas.core.DEDataQueryCodeExp;
import net.ibizsys.paas.core.DEDataQueryCodeCond;

@DEDataQuery(id="EF71FC47-262A-4437-8FB3-21B39CEC9ADC",name="DEFAULT")
@DEDataQueryCodes({
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE AS CREATEDATE, t1.CREATEMAN AS CREATEMAN, t1.RESERVER AS RESERVER, t1.RESERVER2 AS RESERVER2, t1.RESERVER3 AS RESERVER3, t1.RESERVER4 AS RESERVER4, t11.USERROLENAME AS UESRROLENAME, t1.UPDATEDATE AS UPDATEDATE, t1.UPDATEMAN AS UPDATEMAN, t1.USERDATA AS USERDATA, t1.USERDATA2 AS USERDATA2, t1.USEROBJECTID AS USEROBJECTID, t21.USEROBJECTNAME AS USEROBJECTNAME, t1.USERROLEDETAILID AS USERROLEDETAILID, t1.USERROLEDETAILNAME AS USERROLEDETAILNAME, t1.USERROLEID AS USERROLEID, t1.USERTAG AS USERTAG FROM T_SRFUSERROLEDETAIL t1  LEFT JOIN T_SRFUSERROLE t11 ON t1.USERROLEID = t11.USERROLEID  LEFT JOIN T_SRFUSEROBJECT t21 ON t1.USEROBJECTID = t21.USEROBJECTID ",querycodetemp="",declarecode="",dbtype="DB2",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="RESERVER",expression="t1.RESERVER")
        ,@DEDataQueryCodeExp(name="RESERVER2",expression="t1.RESERVER2")
        ,@DEDataQueryCodeExp(name="RESERVER3",expression="t1.RESERVER3")
        ,@DEDataQueryCodeExp(name="RESERVER4",expression="t1.RESERVER4")
        ,@DEDataQueryCodeExp(name="UESRROLENAME",expression="t11.USERROLENAME")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="USERDATA",expression="t1.USERDATA")
        ,@DEDataQueryCodeExp(name="USERDATA2",expression="t1.USERDATA2")
        ,@DEDataQueryCodeExp(name="USEROBJECTID",expression="t1.USEROBJECTID")
        ,@DEDataQueryCodeExp(name="USEROBJECTNAME",expression="t21.USEROBJECTNAME")
        ,@DEDataQueryCodeExp(name="USERROLEDETAILID",expression="t1.USERROLEDETAILID")
        ,@DEDataQueryCodeExp(name="USERROLEDETAILNAME",expression="t1.USERROLEDETAILNAME")
        ,@DEDataQueryCodeExp(name="USERROLEID",expression="t1.USERROLEID")
        ,@DEDataQueryCodeExp(name="USERTAG",expression="t1.USERTAG")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.`CREATEDATE` AS `CREATEDATE`, t1.`CREATEMAN` AS `CREATEMAN`, t1.`RESERVER` AS `RESERVER`, t1.`RESERVER2` AS `RESERVER2`, t1.`RESERVER3` AS `RESERVER3`, t1.`RESERVER4` AS `RESERVER4`, t11.`USERROLENAME` AS `UESRROLENAME`, t1.`UPDATEDATE` AS `UPDATEDATE`, t1.`UPDATEMAN` AS `UPDATEMAN`, t1.`USERDATA` AS `USERDATA`, t1.`USERDATA2` AS `USERDATA2`, t1.`USEROBJECTID` AS `USEROBJECTID`, t21.`USEROBJECTNAME` AS `USEROBJECTNAME`, t1.`USERROLEDETAILID` AS `USERROLEDETAILID`, t1.`USERROLEDETAILNAME` AS `USERROLEDETAILNAME`, t1.`USERROLEID` AS `USERROLEID`, t1.`USERTAG` AS `USERTAG` FROM `T_SRFUSERROLEDETAIL` t1  LEFT JOIN T_SRFUSERROLE t11 ON t1.USERROLEID = t11.USERROLEID  LEFT JOIN T_SRFUSEROBJECT t21 ON t1.USEROBJECTID = t21.USEROBJECTID ",querycodetemp="",declarecode="",dbtype="MYSQL5",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.`CREATEDATE`")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.`CREATEMAN`")
        ,@DEDataQueryCodeExp(name="RESERVER",expression="t1.`RESERVER`")
        ,@DEDataQueryCodeExp(name="RESERVER2",expression="t1.`RESERVER2`")
        ,@DEDataQueryCodeExp(name="RESERVER3",expression="t1.`RESERVER3`")
        ,@DEDataQueryCodeExp(name="RESERVER4",expression="t1.`RESERVER4`")
        ,@DEDataQueryCodeExp(name="UESRROLENAME",expression="t11.`USERROLENAME`")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.`UPDATEDATE`")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.`UPDATEMAN`")
        ,@DEDataQueryCodeExp(name="USERDATA",expression="t1.`USERDATA`")
        ,@DEDataQueryCodeExp(name="USERDATA2",expression="t1.`USERDATA2`")
        ,@DEDataQueryCodeExp(name="USEROBJECTID",expression="t1.`USEROBJECTID`")
        ,@DEDataQueryCodeExp(name="USEROBJECTNAME",expression="t21.`USEROBJECTNAME`")
        ,@DEDataQueryCodeExp(name="USERROLEDETAILID",expression="t1.`USERROLEDETAILID`")
        ,@DEDataQueryCodeExp(name="USERROLEDETAILNAME",expression="t1.`USERROLEDETAILNAME`")
        ,@DEDataQueryCodeExp(name="USERROLEID",expression="t1.`USERROLEID`")
        ,@DEDataQueryCodeExp(name="USERTAG",expression="t1.`USERTAG`")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE AS CREATEDATE, t1.CREATEMAN AS CREATEMAN, t1.RESERVER AS RESERVER, t1.RESERVER2 AS RESERVER2, t1.RESERVER3 AS RESERVER3, t1.RESERVER4 AS RESERVER4, t11.USERROLENAME AS UESRROLENAME, t1.UPDATEDATE AS UPDATEDATE, t1.UPDATEMAN AS UPDATEMAN, t1.USERDATA AS USERDATA, t1.USERDATA2 AS USERDATA2, t1.USEROBJECTID AS USEROBJECTID, t21.USEROBJECTNAME AS USEROBJECTNAME, t1.USERROLEDETAILID AS USERROLEDETAILID, t1.USERROLEDETAILNAME AS USERROLEDETAILNAME, t1.USERROLEID AS USERROLEID, t1.USERTAG AS USERTAG FROM T_SRFUSERROLEDETAIL t1  LEFT JOIN T_SRFUSERROLE t11 ON t1.USERROLEID = t11.USERROLEID  LEFT JOIN T_SRFUSEROBJECT t21 ON t1.USEROBJECTID = t21.USEROBJECTID ",querycodetemp="",declarecode="",dbtype="ORACLE",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="RESERVER",expression="t1.RESERVER")
        ,@DEDataQueryCodeExp(name="RESERVER2",expression="t1.RESERVER2")
        ,@DEDataQueryCodeExp(name="RESERVER3",expression="t1.RESERVER3")
        ,@DEDataQueryCodeExp(name="RESERVER4",expression="t1.RESERVER4")
        ,@DEDataQueryCodeExp(name="UESRROLENAME",expression="t11.USERROLENAME")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="USERDATA",expression="t1.USERDATA")
        ,@DEDataQueryCodeExp(name="USERDATA2",expression="t1.USERDATA2")
        ,@DEDataQueryCodeExp(name="USEROBJECTID",expression="t1.USEROBJECTID")
        ,@DEDataQueryCodeExp(name="USEROBJECTNAME",expression="t21.USEROBJECTNAME")
        ,@DEDataQueryCodeExp(name="USERROLEDETAILID",expression="t1.USERROLEDETAILID")
        ,@DEDataQueryCodeExp(name="USERROLEDETAILNAME",expression="t1.USERROLEDETAILNAME")
        ,@DEDataQueryCodeExp(name="USERROLEID",expression="t1.USERROLEID")
        ,@DEDataQueryCodeExp(name="USERTAG",expression="t1.USERTAG")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.[CREATEDATE] AS [CREATEDATE], t1.[CREATEMAN] AS [CREATEMAN], t1.[RESERVER] AS [RESERVER], t1.[RESERVER2] AS [RESERVER2], t1.[RESERVER3] AS [RESERVER3], t1.[RESERVER4] AS [RESERVER4], t11.[USERROLENAME] AS [UESRROLENAME], t1.[UPDATEDATE] AS [UPDATEDATE], t1.[UPDATEMAN] AS [UPDATEMAN], t1.[USERDATA] AS [USERDATA], t1.[USERDATA2] AS [USERDATA2], t1.[USEROBJECTID] AS [USEROBJECTID], t21.[USEROBJECTNAME] AS [USEROBJECTNAME], t1.[USERROLEDETAILID] AS [USERROLEDETAILID], t1.[USERROLEDETAILNAME] AS [USERROLEDETAILNAME], t1.[USERROLEID] AS [USERROLEID], t1.[USERTAG] AS [USERTAG] FROM [T_SRFUSERROLEDETAIL] t1  LEFT JOIN T_SRFUSERROLE t11 ON t1.USERROLEID = t11.USERROLEID  LEFT JOIN T_SRFUSEROBJECT t21 ON t1.USEROBJECTID = t21.USEROBJECTID ",querycodetemp="",declarecode="",dbtype="SQLSERVER",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.[CREATEDATE]")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.[CREATEMAN]")
        ,@DEDataQueryCodeExp(name="RESERVER",expression="t1.[RESERVER]")
        ,@DEDataQueryCodeExp(name="RESERVER2",expression="t1.[RESERVER2]")
        ,@DEDataQueryCodeExp(name="RESERVER3",expression="t1.[RESERVER3]")
        ,@DEDataQueryCodeExp(name="RESERVER4",expression="t1.[RESERVER4]")
        ,@DEDataQueryCodeExp(name="UESRROLENAME",expression="t11.[USERROLENAME]")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.[UPDATEDATE]")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.[UPDATEMAN]")
        ,@DEDataQueryCodeExp(name="USERDATA",expression="t1.[USERDATA]")
        ,@DEDataQueryCodeExp(name="USERDATA2",expression="t1.[USERDATA2]")
        ,@DEDataQueryCodeExp(name="USEROBJECTID",expression="t1.[USEROBJECTID]")
        ,@DEDataQueryCodeExp(name="USEROBJECTNAME",expression="t21.[USEROBJECTNAME]")
        ,@DEDataQueryCodeExp(name="USERROLEDETAILID",expression="t1.[USERROLEDETAILID]")
        ,@DEDataQueryCodeExp(name="USERROLEDETAILNAME",expression="t1.[USERROLEDETAILNAME]")
        ,@DEDataQueryCodeExp(name="USERROLEID",expression="t1.[USERROLEID]")
        ,@DEDataQueryCodeExp(name="USERTAG",expression="t1.[USERTAG]")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE AS CREATEDATE, t1.CREATEMAN AS CREATEMAN, t1.RESERVER AS RESERVER, t1.RESERVER2 AS RESERVER2, t1.RESERVER3 AS RESERVER3, t1.RESERVER4 AS RESERVER4, t11.USERROLENAME AS UESRROLENAME, t1.UPDATEDATE AS UPDATEDATE, t1.UPDATEMAN AS UPDATEMAN, t1.USERDATA AS USERDATA, t1.USERDATA2 AS USERDATA2, t1.USEROBJECTID AS USEROBJECTID, t21.USEROBJECTNAME AS USEROBJECTNAME, t1.USERROLEDETAILID AS USERROLEDETAILID, t1.USERROLEDETAILNAME AS USERROLEDETAILNAME, t1.USERROLEID AS USERROLEID, t1.USERTAG AS USERTAG FROM T_SRFUSERROLEDETAIL t1  LEFT JOIN T_SRFUSERROLE t11 ON t1.USERROLEID = t11.USERROLEID  LEFT JOIN T_SRFUSEROBJECT t21 ON t1.USEROBJECTID = t21.USEROBJECTID ",querycodetemp="",declarecode="",dbtype="POSTGRESQL",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="RESERVER",expression="t1.RESERVER")
        ,@DEDataQueryCodeExp(name="RESERVER2",expression="t1.RESERVER2")
        ,@DEDataQueryCodeExp(name="RESERVER3",expression="t1.RESERVER3")
        ,@DEDataQueryCodeExp(name="RESERVER4",expression="t1.RESERVER4")
        ,@DEDataQueryCodeExp(name="UESRROLENAME",expression="t11.USERROLENAME")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="USERDATA",expression="t1.USERDATA")
        ,@DEDataQueryCodeExp(name="USERDATA2",expression="t1.USERDATA2")
        ,@DEDataQueryCodeExp(name="USEROBJECTID",expression="t1.USEROBJECTID")
        ,@DEDataQueryCodeExp(name="USEROBJECTNAME",expression="t21.USEROBJECTNAME")
        ,@DEDataQueryCodeExp(name="USERROLEDETAILID",expression="t1.USERROLEDETAILID")
        ,@DEDataQueryCodeExp(name="USERROLEDETAILNAME",expression="t1.USERROLEDETAILNAME")
        ,@DEDataQueryCodeExp(name="USERROLEID",expression="t1.USERROLEID")
        ,@DEDataQueryCodeExp(name="USERTAG",expression="t1.USERTAG")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE AS CREATEDATE, t1.CREATEMAN AS CREATEMAN, t1.RESERVER AS RESERVER, t1.RESERVER2 AS RESERVER2, t1.RESERVER3 AS RESERVER3, t1.RESERVER4 AS RESERVER4, t11.USERROLENAME AS UESRROLENAME, t1.UPDATEDATE AS UPDATEDATE, t1.UPDATEMAN AS UPDATEMAN, t1.USERDATA AS USERDATA, t1.USERDATA2 AS USERDATA2, t1.USEROBJECTID AS USEROBJECTID, t21.USEROBJECTNAME AS USEROBJECTNAME, t1.USERROLEDETAILID AS USERROLEDETAILID, t1.USERROLEDETAILNAME AS USERROLEDETAILNAME, t1.USERROLEID AS USERROLEID, t1.USERTAG AS USERTAG FROM T_SRFUSERROLEDETAIL t1  LEFT JOIN T_SRFUSERROLE t11 ON t1.USERROLEID = t11.USERROLEID  LEFT JOIN T_SRFUSEROBJECT t21 ON t1.USEROBJECTID = t21.USEROBJECTID ",querycodetemp="",declarecode="",dbtype="PPAS",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="RESERVER",expression="t1.RESERVER")
        ,@DEDataQueryCodeExp(name="RESERVER2",expression="t1.RESERVER2")
        ,@DEDataQueryCodeExp(name="RESERVER3",expression="t1.RESERVER3")
        ,@DEDataQueryCodeExp(name="RESERVER4",expression="t1.RESERVER4")
        ,@DEDataQueryCodeExp(name="UESRROLENAME",expression="t11.USERROLENAME")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="USERDATA",expression="t1.USERDATA")
        ,@DEDataQueryCodeExp(name="USERDATA2",expression="t1.USERDATA2")
        ,@DEDataQueryCodeExp(name="USEROBJECTID",expression="t1.USEROBJECTID")
        ,@DEDataQueryCodeExp(name="USEROBJECTNAME",expression="t21.USEROBJECTNAME")
        ,@DEDataQueryCodeExp(name="USERROLEDETAILID",expression="t1.USERROLEDETAILID")
        ,@DEDataQueryCodeExp(name="USERROLEDETAILNAME",expression="t1.USERROLEDETAILNAME")
        ,@DEDataQueryCodeExp(name="USERROLEID",expression="t1.USERROLEID")
        ,@DEDataQueryCodeExp(name="USERTAG",expression="t1.USERTAG")
    },
    conds={})
})
/**
 *  实体数据查询 [DEFAULT]模型基类
 */
public abstract class UserRoleDetailDefaultDQModelBase extends net.ibizsys.paas.demodel.DEDataQueryModelBase {

    public UserRoleDetailDefaultDQModelBase() {
        super();

        this.initAnnotation(UserRoleDetailDefaultDQModelBase.class);
    }

}