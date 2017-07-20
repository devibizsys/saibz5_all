/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package net.ibizsys.psrt.srv.wx.demodel.wxaccesstoken.dataquery;



import net.ibizsys.paas.core.DEDataQuery;
import net.ibizsys.paas.core.DEDataQueryCodes;
import net.ibizsys.paas.core.DEDataQueryCode;
import net.ibizsys.paas.core.DEDataQueryCodeExp;
import net.ibizsys.paas.core.DEDataQueryCodeCond;

@DEDataQuery(id="D14A2FA5-7250-4DC0-A0D2-0C5358FCB44C",name="DEFAULT")
@DEDataQueryCodes({
    @DEDataQueryCode(querycode="SELECT t1.ACCESSTOKEN, t1.CREATEDATE, t1.CREATEMAN, t1.EXPIREDTIME, t1.RESERVER, t1.RESERVER2, t1.RESERVER3, t1.RESERVER4, t1.UPDATEDATE, t1.UPDATEMAN, t1.WXACCESSTOKENID, t1.WXACCESSTOKENNAME, t1.WXACCOUNTID, t1.WXACCOUNTNAME FROM T_SRFWXACCESSTOKEN t1 ",querycodetemp="",declarecode="",dbtype="DB2",
    fieldexps={
        @DEDataQueryCodeExp(name="ACCESSTOKEN",expression="t1.ACCESSTOKEN")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="EXPIREDTIME",expression="t1.EXPIREDTIME")
        ,@DEDataQueryCodeExp(name="RESERVER",expression="t1.RESERVER")
        ,@DEDataQueryCodeExp(name="RESERVER2",expression="t1.RESERVER2")
        ,@DEDataQueryCodeExp(name="RESERVER3",expression="t1.RESERVER3")
        ,@DEDataQueryCodeExp(name="RESERVER4",expression="t1.RESERVER4")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="WXACCESSTOKENID",expression="t1.WXACCESSTOKENID")
        ,@DEDataQueryCodeExp(name="WXACCESSTOKENNAME",expression="t1.WXACCESSTOKENNAME")
        ,@DEDataQueryCodeExp(name="WXACCOUNTID",expression="t1.WXACCOUNTID")
        ,@DEDataQueryCodeExp(name="WXACCOUNTNAME",expression="t1.WXACCOUNTNAME")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.`ACCESSTOKEN`, t1.`CREATEDATE`, t1.`CREATEMAN`, t1.`EXPIREDTIME`, t1.`RESERVER`, t1.`RESERVER2`, t1.`RESERVER3`, t1.`RESERVER4`, t1.`UPDATEDATE`, t1.`UPDATEMAN`, t1.`WXACCESSTOKENID`, t1.`WXACCESSTOKENNAME`, t1.`WXACCOUNTID`, t1.`WXACCOUNTNAME` FROM `T_SRFWXACCESSTOKEN` t1 ",querycodetemp="",declarecode="",dbtype="MYSQL5",
    fieldexps={
        @DEDataQueryCodeExp(name="ACCESSTOKEN",expression="t1.`ACCESSTOKEN`")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.`CREATEDATE`")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.`CREATEMAN`")
        ,@DEDataQueryCodeExp(name="EXPIREDTIME",expression="t1.`EXPIREDTIME`")
        ,@DEDataQueryCodeExp(name="RESERVER",expression="t1.`RESERVER`")
        ,@DEDataQueryCodeExp(name="RESERVER2",expression="t1.`RESERVER2`")
        ,@DEDataQueryCodeExp(name="RESERVER3",expression="t1.`RESERVER3`")
        ,@DEDataQueryCodeExp(name="RESERVER4",expression="t1.`RESERVER4`")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.`UPDATEDATE`")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.`UPDATEMAN`")
        ,@DEDataQueryCodeExp(name="WXACCESSTOKENID",expression="t1.`WXACCESSTOKENID`")
        ,@DEDataQueryCodeExp(name="WXACCESSTOKENNAME",expression="t1.`WXACCESSTOKENNAME`")
        ,@DEDataQueryCodeExp(name="WXACCOUNTID",expression="t1.`WXACCOUNTID`")
        ,@DEDataQueryCodeExp(name="WXACCOUNTNAME",expression="t1.`WXACCOUNTNAME`")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.ACCESSTOKEN, t1.CREATEDATE, t1.CREATEMAN, t1.EXPIREDTIME, t1.RESERVER, t1.RESERVER2, t1.RESERVER3, t1.RESERVER4, t1.UPDATEDATE, t1.UPDATEMAN, t1.WXACCESSTOKENID, t1.WXACCESSTOKENNAME, t1.WXACCOUNTID, t1.WXACCOUNTNAME FROM T_SRFWXACCESSTOKEN t1 ",querycodetemp="",declarecode="",dbtype="ORACLE",
    fieldexps={
        @DEDataQueryCodeExp(name="ACCESSTOKEN",expression="t1.ACCESSTOKEN")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="EXPIREDTIME",expression="t1.EXPIREDTIME")
        ,@DEDataQueryCodeExp(name="RESERVER",expression="t1.RESERVER")
        ,@DEDataQueryCodeExp(name="RESERVER2",expression="t1.RESERVER2")
        ,@DEDataQueryCodeExp(name="RESERVER3",expression="t1.RESERVER3")
        ,@DEDataQueryCodeExp(name="RESERVER4",expression="t1.RESERVER4")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="WXACCESSTOKENID",expression="t1.WXACCESSTOKENID")
        ,@DEDataQueryCodeExp(name="WXACCESSTOKENNAME",expression="t1.WXACCESSTOKENNAME")
        ,@DEDataQueryCodeExp(name="WXACCOUNTID",expression="t1.WXACCOUNTID")
        ,@DEDataQueryCodeExp(name="WXACCOUNTNAME",expression="t1.WXACCOUNTNAME")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.ACCESSTOKEN, t1.CREATEDATE, t1.CREATEMAN, t1.EXPIREDTIME, t1.RESERVER, t1.RESERVER2, t1.RESERVER3, t1.RESERVER4, t1.UPDATEDATE, t1.UPDATEMAN, t1.WXACCESSTOKENID, t1.WXACCESSTOKENNAME, t1.WXACCOUNTID, t1.WXACCOUNTNAME FROM T_SRFWXACCESSTOKEN t1 ",querycodetemp="",declarecode="",dbtype="POSTGRESQL",
    fieldexps={
        @DEDataQueryCodeExp(name="ACCESSTOKEN",expression="t1.ACCESSTOKEN")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="EXPIREDTIME",expression="t1.EXPIREDTIME")
        ,@DEDataQueryCodeExp(name="RESERVER",expression="t1.RESERVER")
        ,@DEDataQueryCodeExp(name="RESERVER2",expression="t1.RESERVER2")
        ,@DEDataQueryCodeExp(name="RESERVER3",expression="t1.RESERVER3")
        ,@DEDataQueryCodeExp(name="RESERVER4",expression="t1.RESERVER4")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="WXACCESSTOKENID",expression="t1.WXACCESSTOKENID")
        ,@DEDataQueryCodeExp(name="WXACCESSTOKENNAME",expression="t1.WXACCESSTOKENNAME")
        ,@DEDataQueryCodeExp(name="WXACCOUNTID",expression="t1.WXACCOUNTID")
        ,@DEDataQueryCodeExp(name="WXACCOUNTNAME",expression="t1.WXACCOUNTNAME")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.ACCESSTOKEN, t1.CREATEDATE, t1.CREATEMAN, t1.EXPIREDTIME, t1.RESERVER, t1.RESERVER2, t1.RESERVER3, t1.RESERVER4, t1.UPDATEDATE, t1.UPDATEMAN, t1.WXACCESSTOKENID, t1.WXACCESSTOKENNAME, t1.WXACCOUNTID, t1.WXACCOUNTNAME FROM T_SRFWXACCESSTOKEN t1 ",querycodetemp="",declarecode="",dbtype="PPAS",
    fieldexps={
        @DEDataQueryCodeExp(name="ACCESSTOKEN",expression="t1.ACCESSTOKEN")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="EXPIREDTIME",expression="t1.EXPIREDTIME")
        ,@DEDataQueryCodeExp(name="RESERVER",expression="t1.RESERVER")
        ,@DEDataQueryCodeExp(name="RESERVER2",expression="t1.RESERVER2")
        ,@DEDataQueryCodeExp(name="RESERVER3",expression="t1.RESERVER3")
        ,@DEDataQueryCodeExp(name="RESERVER4",expression="t1.RESERVER4")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="WXACCESSTOKENID",expression="t1.WXACCESSTOKENID")
        ,@DEDataQueryCodeExp(name="WXACCESSTOKENNAME",expression="t1.WXACCESSTOKENNAME")
        ,@DEDataQueryCodeExp(name="WXACCOUNTID",expression="t1.WXACCOUNTID")
        ,@DEDataQueryCodeExp(name="WXACCOUNTNAME",expression="t1.WXACCOUNTNAME")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.[ACCESSTOKEN], t1.[CREATEDATE], t1.[CREATEMAN], t1.[EXPIREDTIME], t1.[RESERVER], t1.[RESERVER2], t1.[RESERVER3], t1.[RESERVER4], t1.[UPDATEDATE], t1.[UPDATEMAN], t1.[WXACCESSTOKENID], t1.[WXACCESSTOKENNAME], t1.[WXACCOUNTID], t1.[WXACCOUNTNAME] FROM [T_SRFWXACCESSTOKEN] t1 ",querycodetemp="",declarecode="",dbtype="SQLSERVER",
    fieldexps={
        @DEDataQueryCodeExp(name="ACCESSTOKEN",expression="t1.[ACCESSTOKEN]")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.[CREATEDATE]")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.[CREATEMAN]")
        ,@DEDataQueryCodeExp(name="EXPIREDTIME",expression="t1.[EXPIREDTIME]")
        ,@DEDataQueryCodeExp(name="RESERVER",expression="t1.[RESERVER]")
        ,@DEDataQueryCodeExp(name="RESERVER2",expression="t1.[RESERVER2]")
        ,@DEDataQueryCodeExp(name="RESERVER3",expression="t1.[RESERVER3]")
        ,@DEDataQueryCodeExp(name="RESERVER4",expression="t1.[RESERVER4]")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.[UPDATEDATE]")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.[UPDATEMAN]")
        ,@DEDataQueryCodeExp(name="WXACCESSTOKENID",expression="t1.[WXACCESSTOKENID]")
        ,@DEDataQueryCodeExp(name="WXACCESSTOKENNAME",expression="t1.[WXACCESSTOKENNAME]")
        ,@DEDataQueryCodeExp(name="WXACCOUNTID",expression="t1.[WXACCOUNTID]")
        ,@DEDataQueryCodeExp(name="WXACCOUNTNAME",expression="t1.[WXACCOUNTNAME]")
    },
    conds={})
})
/**
 *  实体数据查询 [DEFAULT]模型基类
 */
public abstract class WXAccessTokenDefaultDQModelBase extends net.ibizsys.paas.demodel.DEDataQueryModelBase {

    public WXAccessTokenDefaultDQModelBase() {
        super();

        this.initAnnotation(WXAccessTokenDefaultDQModelBase.class);
    }

}