/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package net.ibizsys.psrt.srv.common.demodel.loginlog.dataquery;



import net.ibizsys.paas.core.DEDataQuery;
import net.ibizsys.paas.core.DEDataQueryCodes;
import net.ibizsys.paas.core.DEDataQueryCode;
import net.ibizsys.paas.core.DEDataQueryCodeExp;
import net.ibizsys.paas.core.DEDataQueryCodeCond;

@DEDataQuery(id="1C4097C4-2AC5-4E47-9534-F4E676B4D549",name="DEFAULT")
@DEDataQueryCodes({
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE, t1.CREATEMAN, t1.IPADDRESS, t1.LOGINACCOUNTID, t1.LOGINACCOUNTNAME, t1.LOGINLOGID, t1.LOGINLOGNAME, t1.LOGINTIME, t1.LOGOUTTIME, t1.SERVERADDR, t1.UPDATEDATE, t1.UPDATEMAN, t1.USERAGENT FROM T_SRFLOGINLOG t1 ",querycodetemp="",declarecode="",dbtype="DB2",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="IPADDRESS",expression="t1.IPADDRESS")
        ,@DEDataQueryCodeExp(name="LOGINACCOUNTID",expression="t1.LOGINACCOUNTID")
        ,@DEDataQueryCodeExp(name="LOGINACCOUNTNAME",expression="t1.LOGINACCOUNTNAME")
        ,@DEDataQueryCodeExp(name="LOGINLOGID",expression="t1.LOGINLOGID")
        ,@DEDataQueryCodeExp(name="LOGINLOGNAME",expression="t1.LOGINLOGNAME")
        ,@DEDataQueryCodeExp(name="LOGINTIME",expression="t1.LOGINTIME")
        ,@DEDataQueryCodeExp(name="LOGOUTTIME",expression="t1.LOGOUTTIME")
        ,@DEDataQueryCodeExp(name="SERVERADDR",expression="t1.SERVERADDR")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="USERAGENT",expression="t1.USERAGENT")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.`CREATEDATE`, t1.`CREATEMAN`, t1.`IPADDRESS`, t1.`LOGINACCOUNTID`, t1.`LOGINACCOUNTNAME`, t1.`LOGINLOGID`, t1.`LOGINLOGNAME`, t1.`LOGINTIME`, t1.`LOGOUTTIME`, t1.`SERVERADDR`, t1.`UPDATEDATE`, t1.`UPDATEMAN`, t1.`USERAGENT` FROM `T_SRFLOGINLOG` t1 ",querycodetemp="",declarecode="",dbtype="MYSQL5",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.`CREATEDATE`")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.`CREATEMAN`")
        ,@DEDataQueryCodeExp(name="IPADDRESS",expression="t1.`IPADDRESS`")
        ,@DEDataQueryCodeExp(name="LOGINACCOUNTID",expression="t1.`LOGINACCOUNTID`")
        ,@DEDataQueryCodeExp(name="LOGINACCOUNTNAME",expression="t1.`LOGINACCOUNTNAME`")
        ,@DEDataQueryCodeExp(name="LOGINLOGID",expression="t1.`LOGINLOGID`")
        ,@DEDataQueryCodeExp(name="LOGINLOGNAME",expression="t1.`LOGINLOGNAME`")
        ,@DEDataQueryCodeExp(name="LOGINTIME",expression="t1.`LOGINTIME`")
        ,@DEDataQueryCodeExp(name="LOGOUTTIME",expression="t1.`LOGOUTTIME`")
        ,@DEDataQueryCodeExp(name="SERVERADDR",expression="t1.`SERVERADDR`")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.`UPDATEDATE`")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.`UPDATEMAN`")
        ,@DEDataQueryCodeExp(name="USERAGENT",expression="t1.`USERAGENT`")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE, t1.CREATEMAN, t1.IPADDRESS, t1.LOGINACCOUNTID, t1.LOGINACCOUNTNAME, t1.LOGINLOGID, t1.LOGINLOGNAME, t1.LOGINTIME, t1.LOGOUTTIME, t1.SERVERADDR, t1.UPDATEDATE, t1.UPDATEMAN, t1.USERAGENT FROM T_SRFLOGINLOG t1 ",querycodetemp="",declarecode="",dbtype="ORACLE",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="IPADDRESS",expression="t1.IPADDRESS")
        ,@DEDataQueryCodeExp(name="LOGINACCOUNTID",expression="t1.LOGINACCOUNTID")
        ,@DEDataQueryCodeExp(name="LOGINACCOUNTNAME",expression="t1.LOGINACCOUNTNAME")
        ,@DEDataQueryCodeExp(name="LOGINLOGID",expression="t1.LOGINLOGID")
        ,@DEDataQueryCodeExp(name="LOGINLOGNAME",expression="t1.LOGINLOGNAME")
        ,@DEDataQueryCodeExp(name="LOGINTIME",expression="t1.LOGINTIME")
        ,@DEDataQueryCodeExp(name="LOGOUTTIME",expression="t1.LOGOUTTIME")
        ,@DEDataQueryCodeExp(name="SERVERADDR",expression="t1.SERVERADDR")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="USERAGENT",expression="t1.USERAGENT")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.[CREATEDATE], t1.[CREATEMAN], t1.[IPADDRESS], t1.[LOGINACCOUNTID], t1.[LOGINACCOUNTNAME], t1.[LOGINLOGID], t1.[LOGINLOGNAME], t1.[LOGINTIME], t1.[LOGOUTTIME], t1.[SERVERADDR], t1.[UPDATEDATE], t1.[UPDATEMAN], t1.[USERAGENT] FROM [T_SRFLOGINLOG] t1 ",querycodetemp="",declarecode="",dbtype="SQLSERVER",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.[CREATEDATE]")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.[CREATEMAN]")
        ,@DEDataQueryCodeExp(name="IPADDRESS",expression="t1.[IPADDRESS]")
        ,@DEDataQueryCodeExp(name="LOGINACCOUNTID",expression="t1.[LOGINACCOUNTID]")
        ,@DEDataQueryCodeExp(name="LOGINACCOUNTNAME",expression="t1.[LOGINACCOUNTNAME]")
        ,@DEDataQueryCodeExp(name="LOGINLOGID",expression="t1.[LOGINLOGID]")
        ,@DEDataQueryCodeExp(name="LOGINLOGNAME",expression="t1.[LOGINLOGNAME]")
        ,@DEDataQueryCodeExp(name="LOGINTIME",expression="t1.[LOGINTIME]")
        ,@DEDataQueryCodeExp(name="LOGOUTTIME",expression="t1.[LOGOUTTIME]")
        ,@DEDataQueryCodeExp(name="SERVERADDR",expression="t1.[SERVERADDR]")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.[UPDATEDATE]")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.[UPDATEMAN]")
        ,@DEDataQueryCodeExp(name="USERAGENT",expression="t1.[USERAGENT]")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE, t1.CREATEMAN, t1.IPADDRESS, t1.LOGINACCOUNTID, t1.LOGINACCOUNTNAME, t1.LOGINLOGID, t1.LOGINLOGNAME, t1.LOGINTIME, t1.LOGOUTTIME, t1.SERVERADDR, t1.UPDATEDATE, t1.UPDATEMAN, t1.USERAGENT FROM T_SRFLOGINLOG t1 ",querycodetemp="",declarecode="",dbtype="POSTGRESQL",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="IPADDRESS",expression="t1.IPADDRESS")
        ,@DEDataQueryCodeExp(name="LOGINACCOUNTID",expression="t1.LOGINACCOUNTID")
        ,@DEDataQueryCodeExp(name="LOGINACCOUNTNAME",expression="t1.LOGINACCOUNTNAME")
        ,@DEDataQueryCodeExp(name="LOGINLOGID",expression="t1.LOGINLOGID")
        ,@DEDataQueryCodeExp(name="LOGINLOGNAME",expression="t1.LOGINLOGNAME")
        ,@DEDataQueryCodeExp(name="LOGINTIME",expression="t1.LOGINTIME")
        ,@DEDataQueryCodeExp(name="LOGOUTTIME",expression="t1.LOGOUTTIME")
        ,@DEDataQueryCodeExp(name="SERVERADDR",expression="t1.SERVERADDR")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="USERAGENT",expression="t1.USERAGENT")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE, t1.CREATEMAN, t1.IPADDRESS, t1.LOGINACCOUNTID, t1.LOGINACCOUNTNAME, t1.LOGINLOGID, t1.LOGINLOGNAME, t1.LOGINTIME, t1.LOGOUTTIME, t1.SERVERADDR, t1.UPDATEDATE, t1.UPDATEMAN, t1.USERAGENT FROM T_SRFLOGINLOG t1 ",querycodetemp="",declarecode="",dbtype="PPAS",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="IPADDRESS",expression="t1.IPADDRESS")
        ,@DEDataQueryCodeExp(name="LOGINACCOUNTID",expression="t1.LOGINACCOUNTID")
        ,@DEDataQueryCodeExp(name="LOGINACCOUNTNAME",expression="t1.LOGINACCOUNTNAME")
        ,@DEDataQueryCodeExp(name="LOGINLOGID",expression="t1.LOGINLOGID")
        ,@DEDataQueryCodeExp(name="LOGINLOGNAME",expression="t1.LOGINLOGNAME")
        ,@DEDataQueryCodeExp(name="LOGINTIME",expression="t1.LOGINTIME")
        ,@DEDataQueryCodeExp(name="LOGOUTTIME",expression="t1.LOGOUTTIME")
        ,@DEDataQueryCodeExp(name="SERVERADDR",expression="t1.SERVERADDR")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="USERAGENT",expression="t1.USERAGENT")
    },
    conds={})
})
/**
 *  实体数据查询 [DEFAULT]模型基类
 */
public abstract class LoginLogDefaultDQModelBase extends net.ibizsys.paas.demodel.DEDataQueryModelBase {

    public LoginLogDefaultDQModelBase() {
        super();

        this.initAnnotation(LoginLogDefaultDQModelBase.class);
    }

}