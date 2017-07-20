/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package net.ibizsys.psrt.srv.common.demodel.user.dataquery;



import net.ibizsys.paas.core.DEDataQuery;
import net.ibizsys.paas.core.DEDataQueryCodes;
import net.ibizsys.paas.core.DEDataQueryCode;
import net.ibizsys.paas.core.DEDataQueryCodeExp;
import net.ibizsys.paas.core.DEDataQueryCodeCond;

@DEDataQuery(id="24680F99-7889-4963-B07A-123C1A0E94A1",name="DEFAULT")
@DEDataQueryCodes({
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE, t1.CREATEMAN, t1.ENABLE, t1.ISSYSTEM, t1.LOGINNAME, t1.LOGINPWD, t11.MEMO, t11.OWNERID, t11.OWNERTYPE, t11.SUBTYPE, t1.TIMEZONE, t1.UPDATEDATE, t1.UPDATEMAN, t11.USERDATA, t11.USERDATA2, t1.USERID, t1.USERMODE, t1.USERNAME, t11.USEROBJECTLEVEL, t11.USEROBJECTTYPE, t1.VALIDFLAG FROM T_SRFUSER t1  LEFT JOIN T_SRFUSEROBJECT t11 ON t1.USERID = t11.USEROBJECTID ",querycodetemp="",declarecode="",dbtype="DB2",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="ENABLE",expression="t1.ENABLE")
        ,@DEDataQueryCodeExp(name="ISSYSTEM",expression="t1.ISSYSTEM")
        ,@DEDataQueryCodeExp(name="LOGINNAME",expression="t1.LOGINNAME")
        ,@DEDataQueryCodeExp(name="LOGINPWD",expression="t1.LOGINPWD")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t11.MEMO")
        ,@DEDataQueryCodeExp(name="OWNERID",expression="t11.OWNERID")
        ,@DEDataQueryCodeExp(name="OWNERTYPE",expression="t11.OWNERTYPE")
        ,@DEDataQueryCodeExp(name="SUBTYPE",expression="t11.SUBTYPE")
        ,@DEDataQueryCodeExp(name="TIMEZONE",expression="t1.TIMEZONE")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="USERDATA",expression="t11.USERDATA")
        ,@DEDataQueryCodeExp(name="USERDATA2",expression="t11.USERDATA2")
        ,@DEDataQueryCodeExp(name="USERID",expression="t1.USERID")
        ,@DEDataQueryCodeExp(name="USERMODE",expression="t1.USERMODE")
        ,@DEDataQueryCodeExp(name="USERNAME",expression="t1.USERNAME")
        ,@DEDataQueryCodeExp(name="USEROBJECTLEVEL",expression="t11.USEROBJECTLEVEL")
        ,@DEDataQueryCodeExp(name="USEROBJECTTYPE",expression="t11.USEROBJECTTYPE")
        ,@DEDataQueryCodeExp(name="VALIDFLAG",expression="t1.VALIDFLAG")
    },
    conds={
        @DEDataQueryCodeCond(condition="t1.ENABLE = 1")
    }),
    @DEDataQueryCode(querycode="SELECT t1.`CREATEDATE`, t1.`CREATEMAN`, t1.`ENABLE`, t1.`ISSYSTEM`, t1.`LOGINNAME`, t1.`LOGINPWD`, t11.`MEMO`, t11.`OWNERID`, t11.`OWNERTYPE`, t11.`SUBTYPE`, t1.`TIMEZONE`, t1.`UPDATEDATE`, t1.`UPDATEMAN`, t11.`USERDATA`, t11.`USERDATA2`, t1.`USERID`, t1.`USERMODE`, t1.`USERNAME`, t11.`USEROBJECTLEVEL`, t11.`USEROBJECTTYPE`, t1.`VALIDFLAG` FROM `T_SRFUSER` t1  LEFT JOIN T_SRFUSEROBJECT t11 ON t1.USERID = t11.USEROBJECTID ",querycodetemp="",declarecode="",dbtype="MYSQL5",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.`CREATEDATE`")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.`CREATEMAN`")
        ,@DEDataQueryCodeExp(name="ENABLE",expression="t1.`ENABLE`")
        ,@DEDataQueryCodeExp(name="ISSYSTEM",expression="t1.`ISSYSTEM`")
        ,@DEDataQueryCodeExp(name="LOGINNAME",expression="t1.`LOGINNAME`")
        ,@DEDataQueryCodeExp(name="LOGINPWD",expression="t1.`LOGINPWD`")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t11.`MEMO`")
        ,@DEDataQueryCodeExp(name="OWNERID",expression="t11.`OWNERID`")
        ,@DEDataQueryCodeExp(name="OWNERTYPE",expression="t11.`OWNERTYPE`")
        ,@DEDataQueryCodeExp(name="SUBTYPE",expression="t11.`SUBTYPE`")
        ,@DEDataQueryCodeExp(name="TIMEZONE",expression="t1.`TIMEZONE`")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.`UPDATEDATE`")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.`UPDATEMAN`")
        ,@DEDataQueryCodeExp(name="USERDATA",expression="t11.`USERDATA`")
        ,@DEDataQueryCodeExp(name="USERDATA2",expression="t11.`USERDATA2`")
        ,@DEDataQueryCodeExp(name="USERID",expression="t1.`USERID`")
        ,@DEDataQueryCodeExp(name="USERMODE",expression="t1.`USERMODE`")
        ,@DEDataQueryCodeExp(name="USERNAME",expression="t1.`USERNAME`")
        ,@DEDataQueryCodeExp(name="USEROBJECTLEVEL",expression="t11.`USEROBJECTLEVEL`")
        ,@DEDataQueryCodeExp(name="USEROBJECTTYPE",expression="t11.`USEROBJECTTYPE`")
        ,@DEDataQueryCodeExp(name="VALIDFLAG",expression="t1.`VALIDFLAG`")
    },
    conds={
        @DEDataQueryCodeCond(condition="t1.ENABLE = 1")
    }),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE, t1.CREATEMAN, t1.ENABLE, t1.ISSYSTEM, t1.LOGINNAME, t1.LOGINPWD, t11.MEMO, t11.OWNERID, t11.OWNERTYPE, t11.SUBTYPE, t1.TIMEZONE, t1.UPDATEDATE, t1.UPDATEMAN, t11.USERDATA, t11.USERDATA2, t1.USERID, t1.USERMODE, t1.USERNAME, t11.USEROBJECTLEVEL, t11.USEROBJECTTYPE, t1.VALIDFLAG FROM T_SRFUSER t1  LEFT JOIN T_SRFUSEROBJECT t11 ON t1.USERID = t11.USEROBJECTID ",querycodetemp="",declarecode="",dbtype="ORACLE",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="ENABLE",expression="t1.ENABLE")
        ,@DEDataQueryCodeExp(name="ISSYSTEM",expression="t1.ISSYSTEM")
        ,@DEDataQueryCodeExp(name="LOGINNAME",expression="t1.LOGINNAME")
        ,@DEDataQueryCodeExp(name="LOGINPWD",expression="t1.LOGINPWD")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t11.MEMO")
        ,@DEDataQueryCodeExp(name="OWNERID",expression="t11.OWNERID")
        ,@DEDataQueryCodeExp(name="OWNERTYPE",expression="t11.OWNERTYPE")
        ,@DEDataQueryCodeExp(name="SUBTYPE",expression="t11.SUBTYPE")
        ,@DEDataQueryCodeExp(name="TIMEZONE",expression="t1.TIMEZONE")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="USERDATA",expression="t11.USERDATA")
        ,@DEDataQueryCodeExp(name="USERDATA2",expression="t11.USERDATA2")
        ,@DEDataQueryCodeExp(name="USERID",expression="t1.USERID")
        ,@DEDataQueryCodeExp(name="USERMODE",expression="t1.USERMODE")
        ,@DEDataQueryCodeExp(name="USERNAME",expression="t1.USERNAME")
        ,@DEDataQueryCodeExp(name="USEROBJECTLEVEL",expression="t11.USEROBJECTLEVEL")
        ,@DEDataQueryCodeExp(name="USEROBJECTTYPE",expression="t11.USEROBJECTTYPE")
        ,@DEDataQueryCodeExp(name="VALIDFLAG",expression="t1.VALIDFLAG")
    },
    conds={
        @DEDataQueryCodeCond(condition="t1.ENABLE = 1")
    }),
    @DEDataQueryCode(querycode="SELECT t1.[CREATEDATE], t1.[CREATEMAN], t1.[ENABLE], t1.[ISSYSTEM], t1.[LOGINNAME], t1.[LOGINPWD], t11.[MEMO], t11.[OWNERID], t11.[OWNERTYPE], t11.[SUBTYPE], t1.[TIMEZONE], t1.[UPDATEDATE], t1.[UPDATEMAN], t11.[USERDATA], t11.[USERDATA2], t1.[USERID], t1.[USERMODE], t1.[USERNAME], t11.[USEROBJECTLEVEL], t11.[USEROBJECTTYPE], t1.[VALIDFLAG] FROM [T_SRFUSER] t1  LEFT JOIN T_SRFUSEROBJECT t11 ON t1.USERID = t11.USEROBJECTID ",querycodetemp="",declarecode="",dbtype="SQLSERVER",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.[CREATEDATE]")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.[CREATEMAN]")
        ,@DEDataQueryCodeExp(name="ENABLE",expression="t1.[ENABLE]")
        ,@DEDataQueryCodeExp(name="ISSYSTEM",expression="t1.[ISSYSTEM]")
        ,@DEDataQueryCodeExp(name="LOGINNAME",expression="t1.[LOGINNAME]")
        ,@DEDataQueryCodeExp(name="LOGINPWD",expression="t1.[LOGINPWD]")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t11.[MEMO]")
        ,@DEDataQueryCodeExp(name="OWNERID",expression="t11.[OWNERID]")
        ,@DEDataQueryCodeExp(name="OWNERTYPE",expression="t11.[OWNERTYPE]")
        ,@DEDataQueryCodeExp(name="SUBTYPE",expression="t11.[SUBTYPE]")
        ,@DEDataQueryCodeExp(name="TIMEZONE",expression="t1.[TIMEZONE]")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.[UPDATEDATE]")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.[UPDATEMAN]")
        ,@DEDataQueryCodeExp(name="USERDATA",expression="t11.[USERDATA]")
        ,@DEDataQueryCodeExp(name="USERDATA2",expression="t11.[USERDATA2]")
        ,@DEDataQueryCodeExp(name="USERID",expression="t1.[USERID]")
        ,@DEDataQueryCodeExp(name="USERMODE",expression="t1.[USERMODE]")
        ,@DEDataQueryCodeExp(name="USERNAME",expression="t1.[USERNAME]")
        ,@DEDataQueryCodeExp(name="USEROBJECTLEVEL",expression="t11.[USEROBJECTLEVEL]")
        ,@DEDataQueryCodeExp(name="USEROBJECTTYPE",expression="t11.[USEROBJECTTYPE]")
        ,@DEDataQueryCodeExp(name="VALIDFLAG",expression="t1.[VALIDFLAG]")
    },
    conds={
        @DEDataQueryCodeCond(condition="t1.ENABLE = 1")
    }),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE, t1.CREATEMAN, t1.ENABLE, t1.ISSYSTEM, t1.LOGINNAME, t1.LOGINPWD, t11.MEMO, t11.OWNERID, t11.OWNERTYPE, t11.SUBTYPE, t1.TIMEZONE, t1.UPDATEDATE, t1.UPDATEMAN, t11.USERDATA, t11.USERDATA2, t1.USERID, t1.USERMODE, t1.USERNAME, t11.USEROBJECTLEVEL, t11.USEROBJECTTYPE, t1.VALIDFLAG FROM T_SRFUSER t1  LEFT JOIN T_SRFUSEROBJECT t11 ON t1.USERID = t11.USEROBJECTID ",querycodetemp="",declarecode="",dbtype="POSTGRESQL",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="ENABLE",expression="t1.ENABLE")
        ,@DEDataQueryCodeExp(name="ISSYSTEM",expression="t1.ISSYSTEM")
        ,@DEDataQueryCodeExp(name="LOGINNAME",expression="t1.LOGINNAME")
        ,@DEDataQueryCodeExp(name="LOGINPWD",expression="t1.LOGINPWD")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t11.MEMO")
        ,@DEDataQueryCodeExp(name="OWNERID",expression="t11.OWNERID")
        ,@DEDataQueryCodeExp(name="OWNERTYPE",expression="t11.OWNERTYPE")
        ,@DEDataQueryCodeExp(name="SUBTYPE",expression="t11.SUBTYPE")
        ,@DEDataQueryCodeExp(name="TIMEZONE",expression="t1.TIMEZONE")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="USERDATA",expression="t11.USERDATA")
        ,@DEDataQueryCodeExp(name="USERDATA2",expression="t11.USERDATA2")
        ,@DEDataQueryCodeExp(name="USERID",expression="t1.USERID")
        ,@DEDataQueryCodeExp(name="USERMODE",expression="t1.USERMODE")
        ,@DEDataQueryCodeExp(name="USERNAME",expression="t1.USERNAME")
        ,@DEDataQueryCodeExp(name="USEROBJECTLEVEL",expression="t11.USEROBJECTLEVEL")
        ,@DEDataQueryCodeExp(name="USEROBJECTTYPE",expression="t11.USEROBJECTTYPE")
        ,@DEDataQueryCodeExp(name="VALIDFLAG",expression="t1.VALIDFLAG")
    },
    conds={
        @DEDataQueryCodeCond(condition="t1.ENABLE = 1")
    }),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE, t1.CREATEMAN, t1.ENABLE, t1.ISSYSTEM, t1.LOGINNAME, t1.LOGINPWD, t11.MEMO, t11.OWNERID, t11.OWNERTYPE, t11.SUBTYPE, t1.TIMEZONE, t1.UPDATEDATE, t1.UPDATEMAN, t11.USERDATA, t11.USERDATA2, t1.USERID, t1.USERMODE, t1.USERNAME, t11.USEROBJECTLEVEL, t11.USEROBJECTTYPE, t1.VALIDFLAG FROM T_SRFUSER t1  LEFT JOIN T_SRFUSEROBJECT t11 ON t1.USERID = t11.USEROBJECTID ",querycodetemp="",declarecode="",dbtype="PPAS",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="ENABLE",expression="t1.ENABLE")
        ,@DEDataQueryCodeExp(name="ISSYSTEM",expression="t1.ISSYSTEM")
        ,@DEDataQueryCodeExp(name="LOGINNAME",expression="t1.LOGINNAME")
        ,@DEDataQueryCodeExp(name="LOGINPWD",expression="t1.LOGINPWD")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t11.MEMO")
        ,@DEDataQueryCodeExp(name="OWNERID",expression="t11.OWNERID")
        ,@DEDataQueryCodeExp(name="OWNERTYPE",expression="t11.OWNERTYPE")
        ,@DEDataQueryCodeExp(name="SUBTYPE",expression="t11.SUBTYPE")
        ,@DEDataQueryCodeExp(name="TIMEZONE",expression="t1.TIMEZONE")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="USERDATA",expression="t11.USERDATA")
        ,@DEDataQueryCodeExp(name="USERDATA2",expression="t11.USERDATA2")
        ,@DEDataQueryCodeExp(name="USERID",expression="t1.USERID")
        ,@DEDataQueryCodeExp(name="USERMODE",expression="t1.USERMODE")
        ,@DEDataQueryCodeExp(name="USERNAME",expression="t1.USERNAME")
        ,@DEDataQueryCodeExp(name="USEROBJECTLEVEL",expression="t11.USEROBJECTLEVEL")
        ,@DEDataQueryCodeExp(name="USEROBJECTTYPE",expression="t11.USEROBJECTTYPE")
        ,@DEDataQueryCodeExp(name="VALIDFLAG",expression="t1.VALIDFLAG")
    },
    conds={
        @DEDataQueryCodeCond(condition="t1.ENABLE = 1")
    })
})
/**
 *  实体数据查询 [DEFAULT]模型基类
 */
public abstract class UserDefaultDQModelBase extends net.ibizsys.paas.demodel.DEDataQueryModelBase {

    public UserDefaultDQModelBase() {
        super();

        this.initAnnotation(UserDefaultDQModelBase.class);
    }

}