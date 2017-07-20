/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package net.ibizsys.psrt.srv.wx.demodel.wxentapp.dataquery;



import net.ibizsys.paas.core.DEDataQuery;
import net.ibizsys.paas.core.DEDataQueryCodes;
import net.ibizsys.paas.core.DEDataQueryCode;
import net.ibizsys.paas.core.DEDataQueryCodeExp;
import net.ibizsys.paas.core.DEDataQueryCodeCond;

@DEDataQuery(id="6ECB5AD7-F77A-48F8-AD7A-66E06251E321",name="DEFAULT")
@DEDataQueryCodes({
    @DEDataQueryCode(querycode="SELECT t1.AGENTID, t1.APIAPPSECRET, t1.APIENCODINGAESKEY, t1.APITOKEN, t1.APIURL, t1.APPTYPE, t1.APPURL, t1.CREATEDATE, t1.CREATEMAN, t1.MEMO, t1.REPENTERFLAG, t1.REPLOCATIONFLAG, t1.RESERVER, t1.RESERVER2, t1.RESERVER3, t1.RESERVER4, t1.UPDATEDATE, t1.UPDATEMAN, t1.VALIDFLAG, t1.WXACCOUNTID, t11.WXACCOUNTNAME, t1.WXENTAPPID, t1.WXENTAPPNAME FROM T_SRFWXENTAPP t1  LEFT JOIN T_SRFWXACCOUNT t11 ON t1.WXACCOUNTID = t11.WXACCOUNTID ",querycodetemp="",declarecode="",dbtype="DB2",
    fieldexps={
        @DEDataQueryCodeExp(name="AGENTID",expression="t1.AGENTID")
        ,@DEDataQueryCodeExp(name="APIAPPSECRET",expression="t1.APIAPPSECRET")
        ,@DEDataQueryCodeExp(name="APIENCODINGAESKEY",expression="t1.APIENCODINGAESKEY")
        ,@DEDataQueryCodeExp(name="APITOKEN",expression="t1.APITOKEN")
        ,@DEDataQueryCodeExp(name="APIURL",expression="t1.APIURL")
        ,@DEDataQueryCodeExp(name="APPTYPE",expression="t1.APPTYPE")
        ,@DEDataQueryCodeExp(name="APPURL",expression="t1.APPURL")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="REPENTERFLAG",expression="t1.REPENTERFLAG")
        ,@DEDataQueryCodeExp(name="REPLOCATIONFLAG",expression="t1.REPLOCATIONFLAG")
        ,@DEDataQueryCodeExp(name="RESERVER",expression="t1.RESERVER")
        ,@DEDataQueryCodeExp(name="RESERVER2",expression="t1.RESERVER2")
        ,@DEDataQueryCodeExp(name="RESERVER3",expression="t1.RESERVER3")
        ,@DEDataQueryCodeExp(name="RESERVER4",expression="t1.RESERVER4")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="VALIDFLAG",expression="t1.VALIDFLAG")
        ,@DEDataQueryCodeExp(name="WXACCOUNTID",expression="t1.WXACCOUNTID")
        ,@DEDataQueryCodeExp(name="WXACCOUNTNAME",expression="t11.WXACCOUNTNAME")
        ,@DEDataQueryCodeExp(name="WXENTAPPID",expression="t1.WXENTAPPID")
        ,@DEDataQueryCodeExp(name="WXENTAPPNAME",expression="t1.WXENTAPPNAME")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.`AGENTID`, t1.`APIAPPSECRET`, t1.`APIENCODINGAESKEY`, t1.`APITOKEN`, t1.`APIURL`, t1.`APPTYPE`, t1.`APPURL`, t1.`CREATEDATE`, t1.`CREATEMAN`, t1.`MEMO`, t1.`REPENTERFLAG`, t1.`REPLOCATIONFLAG`, t1.`RESERVER`, t1.`RESERVER2`, t1.`RESERVER3`, t1.`RESERVER4`, t1.`UPDATEDATE`, t1.`UPDATEMAN`, t1.`VALIDFLAG`, t1.`WXACCOUNTID`, t11.`WXACCOUNTNAME`, t1.`WXENTAPPID`, t1.`WXENTAPPNAME` FROM `T_SRFWXENTAPP` t1  LEFT JOIN T_SRFWXACCOUNT t11 ON t1.WXACCOUNTID = t11.WXACCOUNTID ",querycodetemp="",declarecode="",dbtype="MYSQL5",
    fieldexps={
        @DEDataQueryCodeExp(name="AGENTID",expression="t1.`AGENTID`")
        ,@DEDataQueryCodeExp(name="APIAPPSECRET",expression="t1.`APIAPPSECRET`")
        ,@DEDataQueryCodeExp(name="APIENCODINGAESKEY",expression="t1.`APIENCODINGAESKEY`")
        ,@DEDataQueryCodeExp(name="APITOKEN",expression="t1.`APITOKEN`")
        ,@DEDataQueryCodeExp(name="APIURL",expression="t1.`APIURL`")
        ,@DEDataQueryCodeExp(name="APPTYPE",expression="t1.`APPTYPE`")
        ,@DEDataQueryCodeExp(name="APPURL",expression="t1.`APPURL`")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.`CREATEDATE`")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.`CREATEMAN`")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.`MEMO`")
        ,@DEDataQueryCodeExp(name="REPENTERFLAG",expression="t1.`REPENTERFLAG`")
        ,@DEDataQueryCodeExp(name="REPLOCATIONFLAG",expression="t1.`REPLOCATIONFLAG`")
        ,@DEDataQueryCodeExp(name="RESERVER",expression="t1.`RESERVER`")
        ,@DEDataQueryCodeExp(name="RESERVER2",expression="t1.`RESERVER2`")
        ,@DEDataQueryCodeExp(name="RESERVER3",expression="t1.`RESERVER3`")
        ,@DEDataQueryCodeExp(name="RESERVER4",expression="t1.`RESERVER4`")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.`UPDATEDATE`")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.`UPDATEMAN`")
        ,@DEDataQueryCodeExp(name="VALIDFLAG",expression="t1.`VALIDFLAG`")
        ,@DEDataQueryCodeExp(name="WXACCOUNTID",expression="t1.`WXACCOUNTID`")
        ,@DEDataQueryCodeExp(name="WXACCOUNTNAME",expression="t11.`WXACCOUNTNAME`")
        ,@DEDataQueryCodeExp(name="WXENTAPPID",expression="t1.`WXENTAPPID`")
        ,@DEDataQueryCodeExp(name="WXENTAPPNAME",expression="t1.`WXENTAPPNAME`")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.AGENTID, t1.APIAPPSECRET, t1.APIENCODINGAESKEY, t1.APITOKEN, t1.APIURL, t1.APPTYPE, t1.APPURL, t1.CREATEDATE, t1.CREATEMAN, t1.MEMO, t1.REPENTERFLAG, t1.REPLOCATIONFLAG, t1.RESERVER, t1.RESERVER2, t1.RESERVER3, t1.RESERVER4, t1.UPDATEDATE, t1.UPDATEMAN, t1.VALIDFLAG, t1.WXACCOUNTID, t11.WXACCOUNTNAME, t1.WXENTAPPID, t1.WXENTAPPNAME FROM T_SRFWXENTAPP t1  LEFT JOIN T_SRFWXACCOUNT t11 ON t1.WXACCOUNTID = t11.WXACCOUNTID ",querycodetemp="",declarecode="",dbtype="ORACLE",
    fieldexps={
        @DEDataQueryCodeExp(name="AGENTID",expression="t1.AGENTID")
        ,@DEDataQueryCodeExp(name="APIAPPSECRET",expression="t1.APIAPPSECRET")
        ,@DEDataQueryCodeExp(name="APIENCODINGAESKEY",expression="t1.APIENCODINGAESKEY")
        ,@DEDataQueryCodeExp(name="APITOKEN",expression="t1.APITOKEN")
        ,@DEDataQueryCodeExp(name="APIURL",expression="t1.APIURL")
        ,@DEDataQueryCodeExp(name="APPTYPE",expression="t1.APPTYPE")
        ,@DEDataQueryCodeExp(name="APPURL",expression="t1.APPURL")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="REPENTERFLAG",expression="t1.REPENTERFLAG")
        ,@DEDataQueryCodeExp(name="REPLOCATIONFLAG",expression="t1.REPLOCATIONFLAG")
        ,@DEDataQueryCodeExp(name="RESERVER",expression="t1.RESERVER")
        ,@DEDataQueryCodeExp(name="RESERVER2",expression="t1.RESERVER2")
        ,@DEDataQueryCodeExp(name="RESERVER3",expression="t1.RESERVER3")
        ,@DEDataQueryCodeExp(name="RESERVER4",expression="t1.RESERVER4")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="VALIDFLAG",expression="t1.VALIDFLAG")
        ,@DEDataQueryCodeExp(name="WXACCOUNTID",expression="t1.WXACCOUNTID")
        ,@DEDataQueryCodeExp(name="WXACCOUNTNAME",expression="t11.WXACCOUNTNAME")
        ,@DEDataQueryCodeExp(name="WXENTAPPID",expression="t1.WXENTAPPID")
        ,@DEDataQueryCodeExp(name="WXENTAPPNAME",expression="t1.WXENTAPPNAME")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.AGENTID, t1.APIAPPSECRET, t1.APIENCODINGAESKEY, t1.APITOKEN, t1.APIURL, t1.APPTYPE, t1.APPURL, t1.CREATEDATE, t1.CREATEMAN, t1.MEMO, t1.REPENTERFLAG, t1.REPLOCATIONFLAG, t1.RESERVER, t1.RESERVER2, t1.RESERVER3, t1.RESERVER4, t1.UPDATEDATE, t1.UPDATEMAN, t1.VALIDFLAG, t1.WXACCOUNTID, t11.WXACCOUNTNAME, t1.WXENTAPPID, t1.WXENTAPPNAME FROM T_SRFWXENTAPP t1  LEFT JOIN T_SRFWXACCOUNT t11 ON t1.WXACCOUNTID = t11.WXACCOUNTID ",querycodetemp="",declarecode="",dbtype="POSTGRESQL",
    fieldexps={
        @DEDataQueryCodeExp(name="AGENTID",expression="t1.AGENTID")
        ,@DEDataQueryCodeExp(name="APIAPPSECRET",expression="t1.APIAPPSECRET")
        ,@DEDataQueryCodeExp(name="APIENCODINGAESKEY",expression="t1.APIENCODINGAESKEY")
        ,@DEDataQueryCodeExp(name="APITOKEN",expression="t1.APITOKEN")
        ,@DEDataQueryCodeExp(name="APIURL",expression="t1.APIURL")
        ,@DEDataQueryCodeExp(name="APPTYPE",expression="t1.APPTYPE")
        ,@DEDataQueryCodeExp(name="APPURL",expression="t1.APPURL")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="REPENTERFLAG",expression="t1.REPENTERFLAG")
        ,@DEDataQueryCodeExp(name="REPLOCATIONFLAG",expression="t1.REPLOCATIONFLAG")
        ,@DEDataQueryCodeExp(name="RESERVER",expression="t1.RESERVER")
        ,@DEDataQueryCodeExp(name="RESERVER2",expression="t1.RESERVER2")
        ,@DEDataQueryCodeExp(name="RESERVER3",expression="t1.RESERVER3")
        ,@DEDataQueryCodeExp(name="RESERVER4",expression="t1.RESERVER4")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="VALIDFLAG",expression="t1.VALIDFLAG")
        ,@DEDataQueryCodeExp(name="WXACCOUNTID",expression="t1.WXACCOUNTID")
        ,@DEDataQueryCodeExp(name="WXACCOUNTNAME",expression="t11.WXACCOUNTNAME")
        ,@DEDataQueryCodeExp(name="WXENTAPPID",expression="t1.WXENTAPPID")
        ,@DEDataQueryCodeExp(name="WXENTAPPNAME",expression="t1.WXENTAPPNAME")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.AGENTID, t1.APIAPPSECRET, t1.APIENCODINGAESKEY, t1.APITOKEN, t1.APIURL, t1.APPTYPE, t1.APPURL, t1.CREATEDATE, t1.CREATEMAN, t1.MEMO, t1.REPENTERFLAG, t1.REPLOCATIONFLAG, t1.RESERVER, t1.RESERVER2, t1.RESERVER3, t1.RESERVER4, t1.UPDATEDATE, t1.UPDATEMAN, t1.VALIDFLAG, t1.WXACCOUNTID, t11.WXACCOUNTNAME, t1.WXENTAPPID, t1.WXENTAPPNAME FROM T_SRFWXENTAPP t1  LEFT JOIN T_SRFWXACCOUNT t11 ON t1.WXACCOUNTID = t11.WXACCOUNTID ",querycodetemp="",declarecode="",dbtype="PPAS",
    fieldexps={
        @DEDataQueryCodeExp(name="AGENTID",expression="t1.AGENTID")
        ,@DEDataQueryCodeExp(name="APIAPPSECRET",expression="t1.APIAPPSECRET")
        ,@DEDataQueryCodeExp(name="APIENCODINGAESKEY",expression="t1.APIENCODINGAESKEY")
        ,@DEDataQueryCodeExp(name="APITOKEN",expression="t1.APITOKEN")
        ,@DEDataQueryCodeExp(name="APIURL",expression="t1.APIURL")
        ,@DEDataQueryCodeExp(name="APPTYPE",expression="t1.APPTYPE")
        ,@DEDataQueryCodeExp(name="APPURL",expression="t1.APPURL")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="REPENTERFLAG",expression="t1.REPENTERFLAG")
        ,@DEDataQueryCodeExp(name="REPLOCATIONFLAG",expression="t1.REPLOCATIONFLAG")
        ,@DEDataQueryCodeExp(name="RESERVER",expression="t1.RESERVER")
        ,@DEDataQueryCodeExp(name="RESERVER2",expression="t1.RESERVER2")
        ,@DEDataQueryCodeExp(name="RESERVER3",expression="t1.RESERVER3")
        ,@DEDataQueryCodeExp(name="RESERVER4",expression="t1.RESERVER4")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="VALIDFLAG",expression="t1.VALIDFLAG")
        ,@DEDataQueryCodeExp(name="WXACCOUNTID",expression="t1.WXACCOUNTID")
        ,@DEDataQueryCodeExp(name="WXACCOUNTNAME",expression="t11.WXACCOUNTNAME")
        ,@DEDataQueryCodeExp(name="WXENTAPPID",expression="t1.WXENTAPPID")
        ,@DEDataQueryCodeExp(name="WXENTAPPNAME",expression="t1.WXENTAPPNAME")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.[AGENTID], t1.[APIAPPSECRET], t1.[APIENCODINGAESKEY], t1.[APITOKEN], t1.[APIURL], t1.[APPTYPE], t1.[APPURL], t1.[CREATEDATE], t1.[CREATEMAN], t1.[MEMO], t1.[REPENTERFLAG], t1.[REPLOCATIONFLAG], t1.[RESERVER], t1.[RESERVER2], t1.[RESERVER3], t1.[RESERVER4], t1.[UPDATEDATE], t1.[UPDATEMAN], t1.[VALIDFLAG], t1.[WXACCOUNTID], t11.[WXACCOUNTNAME], t1.[WXENTAPPID], t1.[WXENTAPPNAME] FROM [T_SRFWXENTAPP] t1  LEFT JOIN T_SRFWXACCOUNT t11 ON t1.WXACCOUNTID = t11.WXACCOUNTID ",querycodetemp="",declarecode="",dbtype="SQLSERVER",
    fieldexps={
        @DEDataQueryCodeExp(name="AGENTID",expression="t1.[AGENTID]")
        ,@DEDataQueryCodeExp(name="APIAPPSECRET",expression="t1.[APIAPPSECRET]")
        ,@DEDataQueryCodeExp(name="APIENCODINGAESKEY",expression="t1.[APIENCODINGAESKEY]")
        ,@DEDataQueryCodeExp(name="APITOKEN",expression="t1.[APITOKEN]")
        ,@DEDataQueryCodeExp(name="APIURL",expression="t1.[APIURL]")
        ,@DEDataQueryCodeExp(name="APPTYPE",expression="t1.[APPTYPE]")
        ,@DEDataQueryCodeExp(name="APPURL",expression="t1.[APPURL]")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.[CREATEDATE]")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.[CREATEMAN]")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.[MEMO]")
        ,@DEDataQueryCodeExp(name="REPENTERFLAG",expression="t1.[REPENTERFLAG]")
        ,@DEDataQueryCodeExp(name="REPLOCATIONFLAG",expression="t1.[REPLOCATIONFLAG]")
        ,@DEDataQueryCodeExp(name="RESERVER",expression="t1.[RESERVER]")
        ,@DEDataQueryCodeExp(name="RESERVER2",expression="t1.[RESERVER2]")
        ,@DEDataQueryCodeExp(name="RESERVER3",expression="t1.[RESERVER3]")
        ,@DEDataQueryCodeExp(name="RESERVER4",expression="t1.[RESERVER4]")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.[UPDATEDATE]")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.[UPDATEMAN]")
        ,@DEDataQueryCodeExp(name="VALIDFLAG",expression="t1.[VALIDFLAG]")
        ,@DEDataQueryCodeExp(name="WXACCOUNTID",expression="t1.[WXACCOUNTID]")
        ,@DEDataQueryCodeExp(name="WXACCOUNTNAME",expression="t11.[WXACCOUNTNAME]")
        ,@DEDataQueryCodeExp(name="WXENTAPPID",expression="t1.[WXENTAPPID]")
        ,@DEDataQueryCodeExp(name="WXENTAPPNAME",expression="t1.[WXENTAPPNAME]")
    },
    conds={})
})
/**
 *  实体数据查询 [DEFAULT]模型基类
 */
public abstract class WXEntAppDefaultDQModelBase extends net.ibizsys.paas.demodel.DEDataQueryModelBase {

    public WXEntAppDefaultDQModelBase() {
        super();

        this.initAnnotation(WXEntAppDefaultDQModelBase.class);
    }

}