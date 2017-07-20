/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package net.ibizsys.psrt.srv.common.demodel.usergroup.dataquery;



import net.ibizsys.paas.core.DEDataQuery;
import net.ibizsys.paas.core.DEDataQueryCodes;
import net.ibizsys.paas.core.DEDataQueryCode;
import net.ibizsys.paas.core.DEDataQueryCodeExp;
import net.ibizsys.paas.core.DEDataQueryCodeCond;

@DEDataQuery(id="66C21513-F456-4E58-BC4F-12AED848D7D4",name="DEFAULT")
@DEDataQueryCodes({
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE AS CREATEDATE, t1.CREATEMAN AS CREATEMAN, t1.ENABLE AS ENABLE, t11.MEMO AS MEMO, t11.OWNERID AS OWNERID, t11.OWNERTYPE AS OWNERTYPE, t11.SUBTYPE AS SUBTYPE, t1.UPDATEDATE AS UPDATEDATE, t1.UPDATEMAN AS UPDATEMAN, t11.USERDATA AS USERDATA, t11.USERDATA2 AS USERDATA2, t1.USERGROUPID AS USERGROUPID, t1.USERGROUPNAME AS USERGROUPNAME, t11.USEROBJECTLEVEL AS USEROBJECTLEVEL, t11.USEROBJECTTYPE AS USEROBJECTTYPE FROM T_SRFUSERGROUP t1  LEFT JOIN T_SRFUSEROBJECT t11 ON t1.USERGROUPID = t11.USEROBJECTID ",querycodetemp="",declarecode="",dbtype="DB2",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="ENABLE",expression="t1.ENABLE")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t11.MEMO")
        ,@DEDataQueryCodeExp(name="OWNERID",expression="t11.OWNERID")
        ,@DEDataQueryCodeExp(name="OWNERTYPE",expression="t11.OWNERTYPE")
        ,@DEDataQueryCodeExp(name="SUBTYPE",expression="t11.SUBTYPE")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="USERDATA",expression="t11.USERDATA")
        ,@DEDataQueryCodeExp(name="USERDATA2",expression="t11.USERDATA2")
        ,@DEDataQueryCodeExp(name="USERGROUPID",expression="t1.USERGROUPID")
        ,@DEDataQueryCodeExp(name="USERGROUPNAME",expression="t1.USERGROUPNAME")
        ,@DEDataQueryCodeExp(name="USEROBJECTLEVEL",expression="t11.USEROBJECTLEVEL")
        ,@DEDataQueryCodeExp(name="USEROBJECTTYPE",expression="t11.USEROBJECTTYPE")
    },
    conds={
        @DEDataQueryCodeCond(condition="t1.ENABLE = 1")
    }),
    @DEDataQueryCode(querycode="SELECT t1.`CREATEDATE` AS `CREATEDATE`, t1.`CREATEMAN` AS `CREATEMAN`, t1.`ENABLE` AS `ENABLE`, t11.`MEMO` AS `MEMO`, t11.`OWNERID` AS `OWNERID`, t11.`OWNERTYPE` AS `OWNERTYPE`, t11.`SUBTYPE` AS `SUBTYPE`, t1.`UPDATEDATE` AS `UPDATEDATE`, t1.`UPDATEMAN` AS `UPDATEMAN`, t11.`USERDATA` AS `USERDATA`, t11.`USERDATA2` AS `USERDATA2`, t1.`USERGROUPID` AS `USERGROUPID`, t1.`USERGROUPNAME` AS `USERGROUPNAME`, t11.`USEROBJECTLEVEL` AS `USEROBJECTLEVEL`, t11.`USEROBJECTTYPE` AS `USEROBJECTTYPE` FROM `T_SRFUSERGROUP` t1  LEFT JOIN T_SRFUSEROBJECT t11 ON t1.USERGROUPID = t11.USEROBJECTID ",querycodetemp="",declarecode="",dbtype="MYSQL5",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.`CREATEDATE`")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.`CREATEMAN`")
        ,@DEDataQueryCodeExp(name="ENABLE",expression="t1.`ENABLE`")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t11.`MEMO`")
        ,@DEDataQueryCodeExp(name="OWNERID",expression="t11.`OWNERID`")
        ,@DEDataQueryCodeExp(name="OWNERTYPE",expression="t11.`OWNERTYPE`")
        ,@DEDataQueryCodeExp(name="SUBTYPE",expression="t11.`SUBTYPE`")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.`UPDATEDATE`")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.`UPDATEMAN`")
        ,@DEDataQueryCodeExp(name="USERDATA",expression="t11.`USERDATA`")
        ,@DEDataQueryCodeExp(name="USERDATA2",expression="t11.`USERDATA2`")
        ,@DEDataQueryCodeExp(name="USERGROUPID",expression="t1.`USERGROUPID`")
        ,@DEDataQueryCodeExp(name="USERGROUPNAME",expression="t1.`USERGROUPNAME`")
        ,@DEDataQueryCodeExp(name="USEROBJECTLEVEL",expression="t11.`USEROBJECTLEVEL`")
        ,@DEDataQueryCodeExp(name="USEROBJECTTYPE",expression="t11.`USEROBJECTTYPE`")
    },
    conds={
        @DEDataQueryCodeCond(condition="t1.ENABLE = 1")
    }),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE AS CREATEDATE, t1.CREATEMAN AS CREATEMAN, t1.ENABLE AS ENABLE, t11.MEMO AS MEMO, t11.OWNERID AS OWNERID, t11.OWNERTYPE AS OWNERTYPE, t11.SUBTYPE AS SUBTYPE, t1.UPDATEDATE AS UPDATEDATE, t1.UPDATEMAN AS UPDATEMAN, t11.USERDATA AS USERDATA, t11.USERDATA2 AS USERDATA2, t1.USERGROUPID AS USERGROUPID, t1.USERGROUPNAME AS USERGROUPNAME, t11.USEROBJECTLEVEL AS USEROBJECTLEVEL, t11.USEROBJECTTYPE AS USEROBJECTTYPE FROM T_SRFUSERGROUP t1  LEFT JOIN T_SRFUSEROBJECT t11 ON t1.USERGROUPID = t11.USEROBJECTID ",querycodetemp="",declarecode="",dbtype="ORACLE",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="ENABLE",expression="t1.ENABLE")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t11.MEMO")
        ,@DEDataQueryCodeExp(name="OWNERID",expression="t11.OWNERID")
        ,@DEDataQueryCodeExp(name="OWNERTYPE",expression="t11.OWNERTYPE")
        ,@DEDataQueryCodeExp(name="SUBTYPE",expression="t11.SUBTYPE")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="USERDATA",expression="t11.USERDATA")
        ,@DEDataQueryCodeExp(name="USERDATA2",expression="t11.USERDATA2")
        ,@DEDataQueryCodeExp(name="USERGROUPID",expression="t1.USERGROUPID")
        ,@DEDataQueryCodeExp(name="USERGROUPNAME",expression="t1.USERGROUPNAME")
        ,@DEDataQueryCodeExp(name="USEROBJECTLEVEL",expression="t11.USEROBJECTLEVEL")
        ,@DEDataQueryCodeExp(name="USEROBJECTTYPE",expression="t11.USEROBJECTTYPE")
    },
    conds={
        @DEDataQueryCodeCond(condition="t1.ENABLE = 1")
    }),
    @DEDataQueryCode(querycode="SELECT t1.[CREATEDATE] AS [CREATEDATE], t1.[CREATEMAN] AS [CREATEMAN], t1.[ENABLE] AS [ENABLE], t11.[MEMO] AS [MEMO], t11.[OWNERID] AS [OWNERID], t11.[OWNERTYPE] AS [OWNERTYPE], t11.[SUBTYPE] AS [SUBTYPE], t1.[UPDATEDATE] AS [UPDATEDATE], t1.[UPDATEMAN] AS [UPDATEMAN], t11.[USERDATA] AS [USERDATA], t11.[USERDATA2] AS [USERDATA2], t1.[USERGROUPID] AS [USERGROUPID], t1.[USERGROUPNAME] AS [USERGROUPNAME], t11.[USEROBJECTLEVEL] AS [USEROBJECTLEVEL], t11.[USEROBJECTTYPE] AS [USEROBJECTTYPE] FROM [T_SRFUSERGROUP] t1  LEFT JOIN T_SRFUSEROBJECT t11 ON t1.USERGROUPID = t11.USEROBJECTID ",querycodetemp="",declarecode="",dbtype="SQLSERVER",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.[CREATEDATE]")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.[CREATEMAN]")
        ,@DEDataQueryCodeExp(name="ENABLE",expression="t1.[ENABLE]")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t11.[MEMO]")
        ,@DEDataQueryCodeExp(name="OWNERID",expression="t11.[OWNERID]")
        ,@DEDataQueryCodeExp(name="OWNERTYPE",expression="t11.[OWNERTYPE]")
        ,@DEDataQueryCodeExp(name="SUBTYPE",expression="t11.[SUBTYPE]")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.[UPDATEDATE]")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.[UPDATEMAN]")
        ,@DEDataQueryCodeExp(name="USERDATA",expression="t11.[USERDATA]")
        ,@DEDataQueryCodeExp(name="USERDATA2",expression="t11.[USERDATA2]")
        ,@DEDataQueryCodeExp(name="USERGROUPID",expression="t1.[USERGROUPID]")
        ,@DEDataQueryCodeExp(name="USERGROUPNAME",expression="t1.[USERGROUPNAME]")
        ,@DEDataQueryCodeExp(name="USEROBJECTLEVEL",expression="t11.[USEROBJECTLEVEL]")
        ,@DEDataQueryCodeExp(name="USEROBJECTTYPE",expression="t11.[USEROBJECTTYPE]")
    },
    conds={
        @DEDataQueryCodeCond(condition="t1.ENABLE = 1")
    }),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE AS CREATEDATE, t1.CREATEMAN AS CREATEMAN, t1.ENABLE AS ENABLE, t11.MEMO AS MEMO, t11.OWNERID AS OWNERID, t11.OWNERTYPE AS OWNERTYPE, t11.SUBTYPE AS SUBTYPE, t1.UPDATEDATE AS UPDATEDATE, t1.UPDATEMAN AS UPDATEMAN, t11.USERDATA AS USERDATA, t11.USERDATA2 AS USERDATA2, t1.USERGROUPID AS USERGROUPID, t1.USERGROUPNAME AS USERGROUPNAME, t11.USEROBJECTLEVEL AS USEROBJECTLEVEL, t11.USEROBJECTTYPE AS USEROBJECTTYPE FROM T_SRFUSERGROUP t1  LEFT JOIN T_SRFUSEROBJECT t11 ON t1.USERGROUPID = t11.USEROBJECTID ",querycodetemp="",declarecode="",dbtype="POSTGRESQL",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="ENABLE",expression="t1.ENABLE")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t11.MEMO")
        ,@DEDataQueryCodeExp(name="OWNERID",expression="t11.OWNERID")
        ,@DEDataQueryCodeExp(name="OWNERTYPE",expression="t11.OWNERTYPE")
        ,@DEDataQueryCodeExp(name="SUBTYPE",expression="t11.SUBTYPE")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="USERDATA",expression="t11.USERDATA")
        ,@DEDataQueryCodeExp(name="USERDATA2",expression="t11.USERDATA2")
        ,@DEDataQueryCodeExp(name="USERGROUPID",expression="t1.USERGROUPID")
        ,@DEDataQueryCodeExp(name="USERGROUPNAME",expression="t1.USERGROUPNAME")
        ,@DEDataQueryCodeExp(name="USEROBJECTLEVEL",expression="t11.USEROBJECTLEVEL")
        ,@DEDataQueryCodeExp(name="USEROBJECTTYPE",expression="t11.USEROBJECTTYPE")
    },
    conds={
        @DEDataQueryCodeCond(condition="t1.ENABLE = 1")
    }),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE AS CREATEDATE, t1.CREATEMAN AS CREATEMAN, t1.ENABLE AS ENABLE, t11.MEMO AS MEMO, t11.OWNERID AS OWNERID, t11.OWNERTYPE AS OWNERTYPE, t11.SUBTYPE AS SUBTYPE, t1.UPDATEDATE AS UPDATEDATE, t1.UPDATEMAN AS UPDATEMAN, t11.USERDATA AS USERDATA, t11.USERDATA2 AS USERDATA2, t1.USERGROUPID AS USERGROUPID, t1.USERGROUPNAME AS USERGROUPNAME, t11.USEROBJECTLEVEL AS USEROBJECTLEVEL, t11.USEROBJECTTYPE AS USEROBJECTTYPE FROM T_SRFUSERGROUP t1  LEFT JOIN T_SRFUSEROBJECT t11 ON t1.USERGROUPID = t11.USEROBJECTID ",querycodetemp="",declarecode="",dbtype="PPAS",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="ENABLE",expression="t1.ENABLE")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t11.MEMO")
        ,@DEDataQueryCodeExp(name="OWNERID",expression="t11.OWNERID")
        ,@DEDataQueryCodeExp(name="OWNERTYPE",expression="t11.OWNERTYPE")
        ,@DEDataQueryCodeExp(name="SUBTYPE",expression="t11.SUBTYPE")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="USERDATA",expression="t11.USERDATA")
        ,@DEDataQueryCodeExp(name="USERDATA2",expression="t11.USERDATA2")
        ,@DEDataQueryCodeExp(name="USERGROUPID",expression="t1.USERGROUPID")
        ,@DEDataQueryCodeExp(name="USERGROUPNAME",expression="t1.USERGROUPNAME")
        ,@DEDataQueryCodeExp(name="USEROBJECTLEVEL",expression="t11.USEROBJECTLEVEL")
        ,@DEDataQueryCodeExp(name="USEROBJECTTYPE",expression="t11.USEROBJECTTYPE")
    },
    conds={
        @DEDataQueryCodeCond(condition="t1.ENABLE = 1")
    })
})
/**
 *  实体数据查询 [DEFAULT]模型基类
 */
public abstract class UserGroupDefaultDQModelBase extends net.ibizsys.paas.demodel.DEDataQueryModelBase {

    public UserGroupDefaultDQModelBase() {
        super();

        this.initAnnotation(UserGroupDefaultDQModelBase.class);
    }

}