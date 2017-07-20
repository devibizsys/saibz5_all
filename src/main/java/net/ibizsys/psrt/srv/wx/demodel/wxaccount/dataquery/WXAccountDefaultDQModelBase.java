/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package net.ibizsys.psrt.srv.wx.demodel.wxaccount.dataquery;



import net.ibizsys.paas.core.DEDataQuery;
import net.ibizsys.paas.core.DEDataQueryCodes;
import net.ibizsys.paas.core.DEDataQueryCode;
import net.ibizsys.paas.core.DEDataQueryCodeExp;
import net.ibizsys.paas.core.DEDataQueryCodeCond;

@DEDataQuery(id="AF7FA7D0-D44C-4AA5-BC41-79CF578892B4",name="DEFAULT")
@DEDataQueryCodes({
    @DEDataQueryCode(querycode="SELECT t1.APIAPPID, t1.APIAPPSECRET, t1.APITOKEN, t1.APIURL, t1.CREATEDATE, t1.CREATEMAN, t1.MEMO, t1.ORGID, t11.ORGNAME, t1.RESERVER, t1.RESERVER2, t1.RESERVER3, t1.RESERVER4, t1.UPDATEDATE, t1.UPDATEMAN, t1.VALIDFLAG, t1.WXACCOUNTID, t1.WXACCOUNTNAME FROM T_SRFWXACCOUNT t1  LEFT JOIN T_SRFORG t11 ON t1.ORGID = t11.ORGID ",querycodetemp="",declarecode="",dbtype="DB2",
    fieldexps={
        @DEDataQueryCodeExp(name="APIAPPID",expression="t1.APIAPPID")
        ,@DEDataQueryCodeExp(name="APIAPPSECRET",expression="t1.APIAPPSECRET")
        ,@DEDataQueryCodeExp(name="APITOKEN",expression="t1.APITOKEN")
        ,@DEDataQueryCodeExp(name="APIURL",expression="t1.APIURL")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="ORGID",expression="t1.ORGID")
        ,@DEDataQueryCodeExp(name="ORGNAME",expression="t11.ORGNAME")
        ,@DEDataQueryCodeExp(name="RESERVER",expression="t1.RESERVER")
        ,@DEDataQueryCodeExp(name="RESERVER2",expression="t1.RESERVER2")
        ,@DEDataQueryCodeExp(name="RESERVER3",expression="t1.RESERVER3")
        ,@DEDataQueryCodeExp(name="RESERVER4",expression="t1.RESERVER4")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="VALIDFLAG",expression="t1.VALIDFLAG")
        ,@DEDataQueryCodeExp(name="WXACCOUNTID",expression="t1.WXACCOUNTID")
        ,@DEDataQueryCodeExp(name="WXACCOUNTNAME",expression="t1.WXACCOUNTNAME")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.`APIAPPID`, t1.`APIAPPSECRET`, t1.`APITOKEN`, t1.`APIURL`, t1.`CREATEDATE`, t1.`CREATEMAN`, t1.`MEMO`, t1.`ORGID`, t11.`ORGNAME`, t1.`RESERVER`, t1.`RESERVER2`, t1.`RESERVER3`, t1.`RESERVER4`, t1.`UPDATEDATE`, t1.`UPDATEMAN`, t1.`VALIDFLAG`, t1.`WXACCOUNTID`, t1.`WXACCOUNTNAME` FROM `T_SRFWXACCOUNT` t1  LEFT JOIN T_SRFORG t11 ON t1.ORGID = t11.ORGID ",querycodetemp="",declarecode="",dbtype="MYSQL5",
    fieldexps={
        @DEDataQueryCodeExp(name="APIAPPID",expression="t1.`APIAPPID`")
        ,@DEDataQueryCodeExp(name="APIAPPSECRET",expression="t1.`APIAPPSECRET`")
        ,@DEDataQueryCodeExp(name="APITOKEN",expression="t1.`APITOKEN`")
        ,@DEDataQueryCodeExp(name="APIURL",expression="t1.`APIURL`")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.`CREATEDATE`")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.`CREATEMAN`")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.`MEMO`")
        ,@DEDataQueryCodeExp(name="ORGID",expression="t1.`ORGID`")
        ,@DEDataQueryCodeExp(name="ORGNAME",expression="t11.`ORGNAME`")
        ,@DEDataQueryCodeExp(name="RESERVER",expression="t1.`RESERVER`")
        ,@DEDataQueryCodeExp(name="RESERVER2",expression="t1.`RESERVER2`")
        ,@DEDataQueryCodeExp(name="RESERVER3",expression="t1.`RESERVER3`")
        ,@DEDataQueryCodeExp(name="RESERVER4",expression="t1.`RESERVER4`")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.`UPDATEDATE`")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.`UPDATEMAN`")
        ,@DEDataQueryCodeExp(name="VALIDFLAG",expression="t1.`VALIDFLAG`")
        ,@DEDataQueryCodeExp(name="WXACCOUNTID",expression="t1.`WXACCOUNTID`")
        ,@DEDataQueryCodeExp(name="WXACCOUNTNAME",expression="t1.`WXACCOUNTNAME`")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.APIAPPID, t1.APIAPPSECRET, t1.APITOKEN, t1.APIURL, t1.CREATEDATE, t1.CREATEMAN, t1.MEMO, t1.ORGID, t11.ORGNAME, t1.RESERVER, t1.RESERVER2, t1.RESERVER3, t1.RESERVER4, t1.UPDATEDATE, t1.UPDATEMAN, t1.VALIDFLAG, t1.WXACCOUNTID, t1.WXACCOUNTNAME FROM T_SRFWXACCOUNT t1  LEFT JOIN T_SRFORG t11 ON t1.ORGID = t11.ORGID ",querycodetemp="",declarecode="",dbtype="ORACLE",
    fieldexps={
        @DEDataQueryCodeExp(name="APIAPPID",expression="t1.APIAPPID")
        ,@DEDataQueryCodeExp(name="APIAPPSECRET",expression="t1.APIAPPSECRET")
        ,@DEDataQueryCodeExp(name="APITOKEN",expression="t1.APITOKEN")
        ,@DEDataQueryCodeExp(name="APIURL",expression="t1.APIURL")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="ORGID",expression="t1.ORGID")
        ,@DEDataQueryCodeExp(name="ORGNAME",expression="t11.ORGNAME")
        ,@DEDataQueryCodeExp(name="RESERVER",expression="t1.RESERVER")
        ,@DEDataQueryCodeExp(name="RESERVER2",expression="t1.RESERVER2")
        ,@DEDataQueryCodeExp(name="RESERVER3",expression="t1.RESERVER3")
        ,@DEDataQueryCodeExp(name="RESERVER4",expression="t1.RESERVER4")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="VALIDFLAG",expression="t1.VALIDFLAG")
        ,@DEDataQueryCodeExp(name="WXACCOUNTID",expression="t1.WXACCOUNTID")
        ,@DEDataQueryCodeExp(name="WXACCOUNTNAME",expression="t1.WXACCOUNTNAME")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.APIAPPID, t1.APIAPPSECRET, t1.APITOKEN, t1.APIURL, t1.CREATEDATE, t1.CREATEMAN, t1.MEMO, t1.ORGID, t11.ORGNAME, t1.RESERVER, t1.RESERVER2, t1.RESERVER3, t1.RESERVER4, t1.UPDATEDATE, t1.UPDATEMAN, t1.VALIDFLAG, t1.WXACCOUNTID, t1.WXACCOUNTNAME FROM T_SRFWXACCOUNT t1  LEFT JOIN T_SRFORG t11 ON t1.ORGID = t11.ORGID ",querycodetemp="",declarecode="",dbtype="POSTGRESQL",
    fieldexps={
        @DEDataQueryCodeExp(name="APIAPPID",expression="t1.APIAPPID")
        ,@DEDataQueryCodeExp(name="APIAPPSECRET",expression="t1.APIAPPSECRET")
        ,@DEDataQueryCodeExp(name="APITOKEN",expression="t1.APITOKEN")
        ,@DEDataQueryCodeExp(name="APIURL",expression="t1.APIURL")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="ORGID",expression="t1.ORGID")
        ,@DEDataQueryCodeExp(name="ORGNAME",expression="t11.ORGNAME")
        ,@DEDataQueryCodeExp(name="RESERVER",expression="t1.RESERVER")
        ,@DEDataQueryCodeExp(name="RESERVER2",expression="t1.RESERVER2")
        ,@DEDataQueryCodeExp(name="RESERVER3",expression="t1.RESERVER3")
        ,@DEDataQueryCodeExp(name="RESERVER4",expression="t1.RESERVER4")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="VALIDFLAG",expression="t1.VALIDFLAG")
        ,@DEDataQueryCodeExp(name="WXACCOUNTID",expression="t1.WXACCOUNTID")
        ,@DEDataQueryCodeExp(name="WXACCOUNTNAME",expression="t1.WXACCOUNTNAME")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.APIAPPID, t1.APIAPPSECRET, t1.APITOKEN, t1.APIURL, t1.CREATEDATE, t1.CREATEMAN, t1.MEMO, t1.ORGID, t11.ORGNAME, t1.RESERVER, t1.RESERVER2, t1.RESERVER3, t1.RESERVER4, t1.UPDATEDATE, t1.UPDATEMAN, t1.VALIDFLAG, t1.WXACCOUNTID, t1.WXACCOUNTNAME FROM T_SRFWXACCOUNT t1  LEFT JOIN T_SRFORG t11 ON t1.ORGID = t11.ORGID ",querycodetemp="",declarecode="",dbtype="PPAS",
    fieldexps={
        @DEDataQueryCodeExp(name="APIAPPID",expression="t1.APIAPPID")
        ,@DEDataQueryCodeExp(name="APIAPPSECRET",expression="t1.APIAPPSECRET")
        ,@DEDataQueryCodeExp(name="APITOKEN",expression="t1.APITOKEN")
        ,@DEDataQueryCodeExp(name="APIURL",expression="t1.APIURL")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="ORGID",expression="t1.ORGID")
        ,@DEDataQueryCodeExp(name="ORGNAME",expression="t11.ORGNAME")
        ,@DEDataQueryCodeExp(name="RESERVER",expression="t1.RESERVER")
        ,@DEDataQueryCodeExp(name="RESERVER2",expression="t1.RESERVER2")
        ,@DEDataQueryCodeExp(name="RESERVER3",expression="t1.RESERVER3")
        ,@DEDataQueryCodeExp(name="RESERVER4",expression="t1.RESERVER4")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="VALIDFLAG",expression="t1.VALIDFLAG")
        ,@DEDataQueryCodeExp(name="WXACCOUNTID",expression="t1.WXACCOUNTID")
        ,@DEDataQueryCodeExp(name="WXACCOUNTNAME",expression="t1.WXACCOUNTNAME")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.[APIAPPID], t1.[APIAPPSECRET], t1.[APITOKEN], t1.[APIURL], t1.[CREATEDATE], t1.[CREATEMAN], t1.[MEMO], t1.[ORGID], t11.[ORGNAME], t1.[RESERVER], t1.[RESERVER2], t1.[RESERVER3], t1.[RESERVER4], t1.[UPDATEDATE], t1.[UPDATEMAN], t1.[VALIDFLAG], t1.[WXACCOUNTID], t1.[WXACCOUNTNAME] FROM [T_SRFWXACCOUNT] t1  LEFT JOIN T_SRFORG t11 ON t1.ORGID = t11.ORGID ",querycodetemp="",declarecode="",dbtype="SQLSERVER",
    fieldexps={
        @DEDataQueryCodeExp(name="APIAPPID",expression="t1.[APIAPPID]")
        ,@DEDataQueryCodeExp(name="APIAPPSECRET",expression="t1.[APIAPPSECRET]")
        ,@DEDataQueryCodeExp(name="APITOKEN",expression="t1.[APITOKEN]")
        ,@DEDataQueryCodeExp(name="APIURL",expression="t1.[APIURL]")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.[CREATEDATE]")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.[CREATEMAN]")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.[MEMO]")
        ,@DEDataQueryCodeExp(name="ORGID",expression="t1.[ORGID]")
        ,@DEDataQueryCodeExp(name="ORGNAME",expression="t11.[ORGNAME]")
        ,@DEDataQueryCodeExp(name="RESERVER",expression="t1.[RESERVER]")
        ,@DEDataQueryCodeExp(name="RESERVER2",expression="t1.[RESERVER2]")
        ,@DEDataQueryCodeExp(name="RESERVER3",expression="t1.[RESERVER3]")
        ,@DEDataQueryCodeExp(name="RESERVER4",expression="t1.[RESERVER4]")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.[UPDATEDATE]")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.[UPDATEMAN]")
        ,@DEDataQueryCodeExp(name="VALIDFLAG",expression="t1.[VALIDFLAG]")
        ,@DEDataQueryCodeExp(name="WXACCOUNTID",expression="t1.[WXACCOUNTID]")
        ,@DEDataQueryCodeExp(name="WXACCOUNTNAME",expression="t1.[WXACCOUNTNAME]")
    },
    conds={})
})
/**
 *  实体数据查询 [DEFAULT]模型基类
 */
public abstract class WXAccountDefaultDQModelBase extends net.ibizsys.paas.demodel.DEDataQueryModelBase {

    public WXAccountDefaultDQModelBase() {
        super();

        this.initAnnotation(WXAccountDefaultDQModelBase.class);
    }

}