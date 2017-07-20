/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package net.ibizsys.psrt.srv.wx.demodel.wxmedia.dataquery;



import net.ibizsys.paas.core.DEDataQuery;
import net.ibizsys.paas.core.DEDataQueryCodes;
import net.ibizsys.paas.core.DEDataQueryCode;
import net.ibizsys.paas.core.DEDataQueryCodeExp;
import net.ibizsys.paas.core.DEDataQueryCodeCond;

@DEDataQuery(id="3BC17A20-6E4B-49A9-84A7-0ACA5DAFE51E",name="DEFAULT")
@DEDataQueryCodes({
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE, t1.CREATEMAN, t1.MEMO, t1.RESERVER, t1.RESERVER2, t1.RESERVER3, t1.RESERVER4, t1.UPDATEDATE, t1.UPDATEMAN, t1.WXACCOUNTID, t1.WXACCOUNTNAME, t1.WXENTAPPID, t1.WXENTAPPNAME, t1.WXMEDIAID, t1.WXMEDIANAME FROM T_SRFWXMEDIA t1 ",querycodetemp="",declarecode="",dbtype="DB2",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="RESERVER",expression="t1.RESERVER")
        ,@DEDataQueryCodeExp(name="RESERVER2",expression="t1.RESERVER2")
        ,@DEDataQueryCodeExp(name="RESERVER3",expression="t1.RESERVER3")
        ,@DEDataQueryCodeExp(name="RESERVER4",expression="t1.RESERVER4")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="WXACCOUNTID",expression="t1.WXACCOUNTID")
        ,@DEDataQueryCodeExp(name="WXACCOUNTNAME",expression="t1.WXACCOUNTNAME")
        ,@DEDataQueryCodeExp(name="WXENTAPPID",expression="t1.WXENTAPPID")
        ,@DEDataQueryCodeExp(name="WXENTAPPNAME",expression="t1.WXENTAPPNAME")
        ,@DEDataQueryCodeExp(name="WXMEDIAID",expression="t1.WXMEDIAID")
        ,@DEDataQueryCodeExp(name="WXMEDIANAME",expression="t1.WXMEDIANAME")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.`CREATEDATE`, t1.`CREATEMAN`, t1.`MEMO`, t1.`RESERVER`, t1.`RESERVER2`, t1.`RESERVER3`, t1.`RESERVER4`, t1.`UPDATEDATE`, t1.`UPDATEMAN`, t1.`WXACCOUNTID`, t1.`WXACCOUNTNAME`, t1.`WXENTAPPID`, t1.`WXENTAPPNAME`, t1.`WXMEDIAID`, t1.`WXMEDIANAME` FROM `T_SRFWXMEDIA` t1 ",querycodetemp="",declarecode="",dbtype="MYSQL5",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.`CREATEDATE`")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.`CREATEMAN`")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.`MEMO`")
        ,@DEDataQueryCodeExp(name="RESERVER",expression="t1.`RESERVER`")
        ,@DEDataQueryCodeExp(name="RESERVER2",expression="t1.`RESERVER2`")
        ,@DEDataQueryCodeExp(name="RESERVER3",expression="t1.`RESERVER3`")
        ,@DEDataQueryCodeExp(name="RESERVER4",expression="t1.`RESERVER4`")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.`UPDATEDATE`")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.`UPDATEMAN`")
        ,@DEDataQueryCodeExp(name="WXACCOUNTID",expression="t1.`WXACCOUNTID`")
        ,@DEDataQueryCodeExp(name="WXACCOUNTNAME",expression="t1.`WXACCOUNTNAME`")
        ,@DEDataQueryCodeExp(name="WXENTAPPID",expression="t1.`WXENTAPPID`")
        ,@DEDataQueryCodeExp(name="WXENTAPPNAME",expression="t1.`WXENTAPPNAME`")
        ,@DEDataQueryCodeExp(name="WXMEDIAID",expression="t1.`WXMEDIAID`")
        ,@DEDataQueryCodeExp(name="WXMEDIANAME",expression="t1.`WXMEDIANAME`")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE, t1.CREATEMAN, t1.MEMO, t1.RESERVER, t1.RESERVER2, t1.RESERVER3, t1.RESERVER4, t1.UPDATEDATE, t1.UPDATEMAN, t1.WXACCOUNTID, t1.WXACCOUNTNAME, t1.WXENTAPPID, t1.WXENTAPPNAME, t1.WXMEDIAID, t1.WXMEDIANAME FROM T_SRFWXMEDIA t1 ",querycodetemp="",declarecode="",dbtype="ORACLE",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="RESERVER",expression="t1.RESERVER")
        ,@DEDataQueryCodeExp(name="RESERVER2",expression="t1.RESERVER2")
        ,@DEDataQueryCodeExp(name="RESERVER3",expression="t1.RESERVER3")
        ,@DEDataQueryCodeExp(name="RESERVER4",expression="t1.RESERVER4")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="WXACCOUNTID",expression="t1.WXACCOUNTID")
        ,@DEDataQueryCodeExp(name="WXACCOUNTNAME",expression="t1.WXACCOUNTNAME")
        ,@DEDataQueryCodeExp(name="WXENTAPPID",expression="t1.WXENTAPPID")
        ,@DEDataQueryCodeExp(name="WXENTAPPNAME",expression="t1.WXENTAPPNAME")
        ,@DEDataQueryCodeExp(name="WXMEDIAID",expression="t1.WXMEDIAID")
        ,@DEDataQueryCodeExp(name="WXMEDIANAME",expression="t1.WXMEDIANAME")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE, t1.CREATEMAN, t1.MEMO, t1.RESERVER, t1.RESERVER2, t1.RESERVER3, t1.RESERVER4, t1.UPDATEDATE, t1.UPDATEMAN, t1.WXACCOUNTID, t1.WXACCOUNTNAME, t1.WXENTAPPID, t1.WXENTAPPNAME, t1.WXMEDIAID, t1.WXMEDIANAME FROM T_SRFWXMEDIA t1 ",querycodetemp="",declarecode="",dbtype="POSTGRESQL",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="RESERVER",expression="t1.RESERVER")
        ,@DEDataQueryCodeExp(name="RESERVER2",expression="t1.RESERVER2")
        ,@DEDataQueryCodeExp(name="RESERVER3",expression="t1.RESERVER3")
        ,@DEDataQueryCodeExp(name="RESERVER4",expression="t1.RESERVER4")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="WXACCOUNTID",expression="t1.WXACCOUNTID")
        ,@DEDataQueryCodeExp(name="WXACCOUNTNAME",expression="t1.WXACCOUNTNAME")
        ,@DEDataQueryCodeExp(name="WXENTAPPID",expression="t1.WXENTAPPID")
        ,@DEDataQueryCodeExp(name="WXENTAPPNAME",expression="t1.WXENTAPPNAME")
        ,@DEDataQueryCodeExp(name="WXMEDIAID",expression="t1.WXMEDIAID")
        ,@DEDataQueryCodeExp(name="WXMEDIANAME",expression="t1.WXMEDIANAME")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE, t1.CREATEMAN, t1.MEMO, t1.RESERVER, t1.RESERVER2, t1.RESERVER3, t1.RESERVER4, t1.UPDATEDATE, t1.UPDATEMAN, t1.WXACCOUNTID, t1.WXACCOUNTNAME, t1.WXENTAPPID, t1.WXENTAPPNAME, t1.WXMEDIAID, t1.WXMEDIANAME FROM T_SRFWXMEDIA t1 ",querycodetemp="",declarecode="",dbtype="PPAS",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="RESERVER",expression="t1.RESERVER")
        ,@DEDataQueryCodeExp(name="RESERVER2",expression="t1.RESERVER2")
        ,@DEDataQueryCodeExp(name="RESERVER3",expression="t1.RESERVER3")
        ,@DEDataQueryCodeExp(name="RESERVER4",expression="t1.RESERVER4")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="WXACCOUNTID",expression="t1.WXACCOUNTID")
        ,@DEDataQueryCodeExp(name="WXACCOUNTNAME",expression="t1.WXACCOUNTNAME")
        ,@DEDataQueryCodeExp(name="WXENTAPPID",expression="t1.WXENTAPPID")
        ,@DEDataQueryCodeExp(name="WXENTAPPNAME",expression="t1.WXENTAPPNAME")
        ,@DEDataQueryCodeExp(name="WXMEDIAID",expression="t1.WXMEDIAID")
        ,@DEDataQueryCodeExp(name="WXMEDIANAME",expression="t1.WXMEDIANAME")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.[CREATEDATE], t1.[CREATEMAN], t1.[MEMO], t1.[RESERVER], t1.[RESERVER2], t1.[RESERVER3], t1.[RESERVER4], t1.[UPDATEDATE], t1.[UPDATEMAN], t1.[WXACCOUNTID], t1.[WXACCOUNTNAME], t1.[WXENTAPPID], t1.[WXENTAPPNAME], t1.[WXMEDIAID], t1.[WXMEDIANAME] FROM [T_SRFWXMEDIA] t1 ",querycodetemp="",declarecode="",dbtype="SQLSERVER",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.[CREATEDATE]")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.[CREATEMAN]")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.[MEMO]")
        ,@DEDataQueryCodeExp(name="RESERVER",expression="t1.[RESERVER]")
        ,@DEDataQueryCodeExp(name="RESERVER2",expression="t1.[RESERVER2]")
        ,@DEDataQueryCodeExp(name="RESERVER3",expression="t1.[RESERVER3]")
        ,@DEDataQueryCodeExp(name="RESERVER4",expression="t1.[RESERVER4]")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.[UPDATEDATE]")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.[UPDATEMAN]")
        ,@DEDataQueryCodeExp(name="WXACCOUNTID",expression="t1.[WXACCOUNTID]")
        ,@DEDataQueryCodeExp(name="WXACCOUNTNAME",expression="t1.[WXACCOUNTNAME]")
        ,@DEDataQueryCodeExp(name="WXENTAPPID",expression="t1.[WXENTAPPID]")
        ,@DEDataQueryCodeExp(name="WXENTAPPNAME",expression="t1.[WXENTAPPNAME]")
        ,@DEDataQueryCodeExp(name="WXMEDIAID",expression="t1.[WXMEDIAID]")
        ,@DEDataQueryCodeExp(name="WXMEDIANAME",expression="t1.[WXMEDIANAME]")
    },
    conds={})
})
/**
 *  实体数据查询 [DEFAULT]模型基类
 */
public abstract class WXMediaDefaultDQModelBase extends net.ibizsys.paas.demodel.DEDataQueryModelBase {

    public WXMediaDefaultDQModelBase() {
        super();

        this.initAnnotation(WXMediaDefaultDQModelBase.class);
    }

}