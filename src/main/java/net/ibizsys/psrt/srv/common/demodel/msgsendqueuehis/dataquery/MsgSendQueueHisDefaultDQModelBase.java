/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package net.ibizsys.psrt.srv.common.demodel.msgsendqueuehis.dataquery;



import net.ibizsys.paas.core.DEDataQuery;
import net.ibizsys.paas.core.DEDataQueryCodes;
import net.ibizsys.paas.core.DEDataQueryCode;
import net.ibizsys.paas.core.DEDataQueryCodeExp;
import net.ibizsys.paas.core.DEDataQueryCodeCond;

@DEDataQuery(id="0B9D6E00-228F-4715-A0D4-202C0702124E",name="DEFAULT")
@DEDataQueryCodes({
    @DEDataQueryCode(querycode="SELECT t1.CONTENTTYPE AS CONTENTTYPE, t1.CREATEDATE AS CREATEDATE, t1.CREATEMAN AS CREATEMAN, t1.DSTADDRESSES AS DSTADDRESSES, t1.DSTUSERS AS DSTUSERS, t1.FILEAT AS FILEAT, t1.FILEAT2 AS FILEAT2, t1.FILEAT3 AS FILEAT3, t1.FILEAT4 AS FILEAT4, t1.IMPORTANCEFLAG AS IMPORTANCEFLAG, t1.ISERROR AS ISERROR, t1.ISSEND AS ISSEND, t1.MSGSENDQUEUEHISID AS MSGSENDQUEUEHISID, t1.MSGSENDQUEUEHISNAME AS MSGSENDQUEUEHISNAME, t1.MSGTYPE AS MSGTYPE, t1.PLANSENDTIME AS PLANSENDTIME, t1.PROCESSTIME AS PROCESSTIME, t1.SENDTAG AS SENDTAG, t1.SUBJECT AS SUBJECT, t1.TOTALDSTADDRESSES AS TOTALDSTADDRESSES, t1.UPDATEDATE AS UPDATEDATE, t1.UPDATEMAN AS UPDATEMAN, t1.USERDATA AS USERDATA, t1.USERDATA2 AS USERDATA2, t1.USERDATA3 AS USERDATA3, t1.USERDATA4 AS USERDATA4 FROM T_SRFMSGSENDQUEUEHIS t1 ",querycodetemp="",declarecode="",dbtype="DB2",
    fieldexps={
        @DEDataQueryCodeExp(name="CONTENT",expression="t1.CONTENT")
        ,@DEDataQueryCodeExp(name="ERRORINFO",expression="t1.ERRORINFO")
        ,@DEDataQueryCodeExp(name="CONTENTTYPE",expression="t1.CONTENTTYPE")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="DSTADDRESSES",expression="t1.DSTADDRESSES")
        ,@DEDataQueryCodeExp(name="DSTUSERS",expression="t1.DSTUSERS")
        ,@DEDataQueryCodeExp(name="FILEAT",expression="t1.FILEAT")
        ,@DEDataQueryCodeExp(name="FILEAT2",expression="t1.FILEAT2")
        ,@DEDataQueryCodeExp(name="FILEAT3",expression="t1.FILEAT3")
        ,@DEDataQueryCodeExp(name="FILEAT4",expression="t1.FILEAT4")
        ,@DEDataQueryCodeExp(name="IMPORTANCEFLAG",expression="t1.IMPORTANCEFLAG")
        ,@DEDataQueryCodeExp(name="ISERROR",expression="t1.ISERROR")
        ,@DEDataQueryCodeExp(name="ISSEND",expression="t1.ISSEND")
        ,@DEDataQueryCodeExp(name="MSGSENDQUEUEHISID",expression="t1.MSGSENDQUEUEHISID")
        ,@DEDataQueryCodeExp(name="MSGSENDQUEUEHISNAME",expression="t1.MSGSENDQUEUEHISNAME")
        ,@DEDataQueryCodeExp(name="MSGTYPE",expression="t1.MSGTYPE")
        ,@DEDataQueryCodeExp(name="PLANSENDTIME",expression="t1.PLANSENDTIME")
        ,@DEDataQueryCodeExp(name="PROCESSTIME",expression="t1.PROCESSTIME")
        ,@DEDataQueryCodeExp(name="SENDTAG",expression="t1.SENDTAG")
        ,@DEDataQueryCodeExp(name="SUBJECT",expression="t1.SUBJECT")
        ,@DEDataQueryCodeExp(name="TOTALDSTADDRESSES",expression="t1.TOTALDSTADDRESSES")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="USERDATA",expression="t1.USERDATA")
        ,@DEDataQueryCodeExp(name="USERDATA2",expression="t1.USERDATA2")
        ,@DEDataQueryCodeExp(name="USERDATA3",expression="t1.USERDATA3")
        ,@DEDataQueryCodeExp(name="USERDATA4",expression="t1.USERDATA4")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.`CONTENTTYPE` AS `CONTENTTYPE`, t1.`CREATEDATE` AS `CREATEDATE`, t1.`CREATEMAN` AS `CREATEMAN`, t1.`DSTADDRESSES` AS `DSTADDRESSES`, t1.`DSTUSERS` AS `DSTUSERS`, t1.`FILEAT` AS `FILEAT`, t1.`FILEAT2` AS `FILEAT2`, t1.`FILEAT3` AS `FILEAT3`, t1.`FILEAT4` AS `FILEAT4`, t1.`IMPORTANCEFLAG` AS `IMPORTANCEFLAG`, t1.`ISERROR` AS `ISERROR`, t1.`ISSEND` AS `ISSEND`, t1.`MSGSENDQUEUEHISID` AS `MSGSENDQUEUEHISID`, t1.`MSGSENDQUEUEHISNAME` AS `MSGSENDQUEUEHISNAME`, t1.`MSGTYPE` AS `MSGTYPE`, t1.`PLANSENDTIME` AS `PLANSENDTIME`, t1.`PROCESSTIME` AS `PROCESSTIME`, t1.`SENDTAG` AS `SENDTAG`, t1.`SUBJECT` AS `SUBJECT`, t1.`TOTALDSTADDRESSES` AS `TOTALDSTADDRESSES`, t1.`UPDATEDATE` AS `UPDATEDATE`, t1.`UPDATEMAN` AS `UPDATEMAN`, t1.`USERDATA` AS `USERDATA`, t1.`USERDATA2` AS `USERDATA2`, t1.`USERDATA3` AS `USERDATA3`, t1.`USERDATA4` AS `USERDATA4` FROM `T_SRFMSGSENDQUEUEHIS` t1 ",querycodetemp="",declarecode="",dbtype="MYSQL5",
    fieldexps={
        @DEDataQueryCodeExp(name="CONTENT",expression="t1.`CONTENT`")
        ,@DEDataQueryCodeExp(name="ERRORINFO",expression="t1.`ERRORINFO`")
        ,@DEDataQueryCodeExp(name="CONTENTTYPE",expression="t1.`CONTENTTYPE`")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.`CREATEDATE`")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.`CREATEMAN`")
        ,@DEDataQueryCodeExp(name="DSTADDRESSES",expression="t1.`DSTADDRESSES`")
        ,@DEDataQueryCodeExp(name="DSTUSERS",expression="t1.`DSTUSERS`")
        ,@DEDataQueryCodeExp(name="FILEAT",expression="t1.`FILEAT`")
        ,@DEDataQueryCodeExp(name="FILEAT2",expression="t1.`FILEAT2`")
        ,@DEDataQueryCodeExp(name="FILEAT3",expression="t1.`FILEAT3`")
        ,@DEDataQueryCodeExp(name="FILEAT4",expression="t1.`FILEAT4`")
        ,@DEDataQueryCodeExp(name="IMPORTANCEFLAG",expression="t1.`IMPORTANCEFLAG`")
        ,@DEDataQueryCodeExp(name="ISERROR",expression="t1.`ISERROR`")
        ,@DEDataQueryCodeExp(name="ISSEND",expression="t1.`ISSEND`")
        ,@DEDataQueryCodeExp(name="MSGSENDQUEUEHISID",expression="t1.`MSGSENDQUEUEHISID`")
        ,@DEDataQueryCodeExp(name="MSGSENDQUEUEHISNAME",expression="t1.`MSGSENDQUEUEHISNAME`")
        ,@DEDataQueryCodeExp(name="MSGTYPE",expression="t1.`MSGTYPE`")
        ,@DEDataQueryCodeExp(name="PLANSENDTIME",expression="t1.`PLANSENDTIME`")
        ,@DEDataQueryCodeExp(name="PROCESSTIME",expression="t1.`PROCESSTIME`")
        ,@DEDataQueryCodeExp(name="SENDTAG",expression="t1.`SENDTAG`")
        ,@DEDataQueryCodeExp(name="SUBJECT",expression="t1.`SUBJECT`")
        ,@DEDataQueryCodeExp(name="TOTALDSTADDRESSES",expression="t1.`TOTALDSTADDRESSES`")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.`UPDATEDATE`")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.`UPDATEMAN`")
        ,@DEDataQueryCodeExp(name="USERDATA",expression="t1.`USERDATA`")
        ,@DEDataQueryCodeExp(name="USERDATA2",expression="t1.`USERDATA2`")
        ,@DEDataQueryCodeExp(name="USERDATA3",expression="t1.`USERDATA3`")
        ,@DEDataQueryCodeExp(name="USERDATA4",expression="t1.`USERDATA4`")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CONTENTTYPE AS CONTENTTYPE, t1.CREATEDATE AS CREATEDATE, t1.CREATEMAN AS CREATEMAN, t1.DSTADDRESSES AS DSTADDRESSES, t1.DSTUSERS AS DSTUSERS, t1.FILEAT AS FILEAT, t1.FILEAT2 AS FILEAT2, t1.FILEAT3 AS FILEAT3, t1.FILEAT4 AS FILEAT4, t1.IMPORTANCEFLAG AS IMPORTANCEFLAG, t1.ISERROR AS ISERROR, t1.ISSEND AS ISSEND, t1.MSGSENDQUEUEHISID AS MSGSENDQUEUEHISID, t1.MSGSENDQUEUEHISNAME AS MSGSENDQUEUEHISNAME, t1.MSGTYPE AS MSGTYPE, t1.PLANSENDTIME AS PLANSENDTIME, t1.PROCESSTIME AS PROCESSTIME, t1.SENDTAG AS SENDTAG, t1.SUBJECT AS SUBJECT, t1.TOTALDSTADDRESSES AS TOTALDSTADDRESSES, t1.UPDATEDATE AS UPDATEDATE, t1.UPDATEMAN AS UPDATEMAN, t1.USERDATA AS USERDATA, t1.USERDATA2 AS USERDATA2, t1.USERDATA3 AS USERDATA3, t1.USERDATA4 AS USERDATA4 FROM T_SRFMSGSENDQUEUEHIS t1 ",querycodetemp="",declarecode="",dbtype="ORACLE",
    fieldexps={
        @DEDataQueryCodeExp(name="CONTENT",expression="t1.CONTENT")
        ,@DEDataQueryCodeExp(name="ERRORINFO",expression="t1.ERRORINFO")
        ,@DEDataQueryCodeExp(name="CONTENTTYPE",expression="t1.CONTENTTYPE")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="DSTADDRESSES",expression="t1.DSTADDRESSES")
        ,@DEDataQueryCodeExp(name="DSTUSERS",expression="t1.DSTUSERS")
        ,@DEDataQueryCodeExp(name="FILEAT",expression="t1.FILEAT")
        ,@DEDataQueryCodeExp(name="FILEAT2",expression="t1.FILEAT2")
        ,@DEDataQueryCodeExp(name="FILEAT3",expression="t1.FILEAT3")
        ,@DEDataQueryCodeExp(name="FILEAT4",expression="t1.FILEAT4")
        ,@DEDataQueryCodeExp(name="IMPORTANCEFLAG",expression="t1.IMPORTANCEFLAG")
        ,@DEDataQueryCodeExp(name="ISERROR",expression="t1.ISERROR")
        ,@DEDataQueryCodeExp(name="ISSEND",expression="t1.ISSEND")
        ,@DEDataQueryCodeExp(name="MSGSENDQUEUEHISID",expression="t1.MSGSENDQUEUEHISID")
        ,@DEDataQueryCodeExp(name="MSGSENDQUEUEHISNAME",expression="t1.MSGSENDQUEUEHISNAME")
        ,@DEDataQueryCodeExp(name="MSGTYPE",expression="t1.MSGTYPE")
        ,@DEDataQueryCodeExp(name="PLANSENDTIME",expression="t1.PLANSENDTIME")
        ,@DEDataQueryCodeExp(name="PROCESSTIME",expression="t1.PROCESSTIME")
        ,@DEDataQueryCodeExp(name="SENDTAG",expression="t1.SENDTAG")
        ,@DEDataQueryCodeExp(name="SUBJECT",expression="t1.SUBJECT")
        ,@DEDataQueryCodeExp(name="TOTALDSTADDRESSES",expression="t1.TOTALDSTADDRESSES")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="USERDATA",expression="t1.USERDATA")
        ,@DEDataQueryCodeExp(name="USERDATA2",expression="t1.USERDATA2")
        ,@DEDataQueryCodeExp(name="USERDATA3",expression="t1.USERDATA3")
        ,@DEDataQueryCodeExp(name="USERDATA4",expression="t1.USERDATA4")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.[CONTENTTYPE] AS [CONTENTTYPE], t1.[CREATEDATE] AS [CREATEDATE], t1.[CREATEMAN] AS [CREATEMAN], t1.[DSTADDRESSES] AS [DSTADDRESSES], t1.[DSTUSERS] AS [DSTUSERS], t1.[FILEAT] AS [FILEAT], t1.[FILEAT2] AS [FILEAT2], t1.[FILEAT3] AS [FILEAT3], t1.[FILEAT4] AS [FILEAT4], t1.[IMPORTANCEFLAG] AS [IMPORTANCEFLAG], t1.[ISERROR] AS [ISERROR], t1.[ISSEND] AS [ISSEND], t1.[MSGSENDQUEUEHISID] AS [MSGSENDQUEUEHISID], t1.[MSGSENDQUEUEHISNAME] AS [MSGSENDQUEUEHISNAME], t1.[MSGTYPE] AS [MSGTYPE], t1.[PLANSENDTIME] AS [PLANSENDTIME], t1.[PROCESSTIME] AS [PROCESSTIME], t1.[SENDTAG] AS [SENDTAG], t1.[SUBJECT] AS [SUBJECT], t1.[TOTALDSTADDRESSES] AS [TOTALDSTADDRESSES], t1.[UPDATEDATE] AS [UPDATEDATE], t1.[UPDATEMAN] AS [UPDATEMAN], t1.[USERDATA] AS [USERDATA], t1.[USERDATA2] AS [USERDATA2], t1.[USERDATA3] AS [USERDATA3], t1.[USERDATA4] AS [USERDATA4] FROM [T_SRFMSGSENDQUEUEHIS] t1 ",querycodetemp="",declarecode="",dbtype="SQLSERVER",
    fieldexps={
        @DEDataQueryCodeExp(name="CONTENT",expression="t1.[CONTENT]")
        ,@DEDataQueryCodeExp(name="ERRORINFO",expression="t1.[ERRORINFO]")
        ,@DEDataQueryCodeExp(name="CONTENTTYPE",expression="t1.[CONTENTTYPE]")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.[CREATEDATE]")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.[CREATEMAN]")
        ,@DEDataQueryCodeExp(name="DSTADDRESSES",expression="t1.[DSTADDRESSES]")
        ,@DEDataQueryCodeExp(name="DSTUSERS",expression="t1.[DSTUSERS]")
        ,@DEDataQueryCodeExp(name="FILEAT",expression="t1.[FILEAT]")
        ,@DEDataQueryCodeExp(name="FILEAT2",expression="t1.[FILEAT2]")
        ,@DEDataQueryCodeExp(name="FILEAT3",expression="t1.[FILEAT3]")
        ,@DEDataQueryCodeExp(name="FILEAT4",expression="t1.[FILEAT4]")
        ,@DEDataQueryCodeExp(name="IMPORTANCEFLAG",expression="t1.[IMPORTANCEFLAG]")
        ,@DEDataQueryCodeExp(name="ISERROR",expression="t1.[ISERROR]")
        ,@DEDataQueryCodeExp(name="ISSEND",expression="t1.[ISSEND]")
        ,@DEDataQueryCodeExp(name="MSGSENDQUEUEHISID",expression="t1.[MSGSENDQUEUEHISID]")
        ,@DEDataQueryCodeExp(name="MSGSENDQUEUEHISNAME",expression="t1.[MSGSENDQUEUEHISNAME]")
        ,@DEDataQueryCodeExp(name="MSGTYPE",expression="t1.[MSGTYPE]")
        ,@DEDataQueryCodeExp(name="PLANSENDTIME",expression="t1.[PLANSENDTIME]")
        ,@DEDataQueryCodeExp(name="PROCESSTIME",expression="t1.[PROCESSTIME]")
        ,@DEDataQueryCodeExp(name="SENDTAG",expression="t1.[SENDTAG]")
        ,@DEDataQueryCodeExp(name="SUBJECT",expression="t1.[SUBJECT]")
        ,@DEDataQueryCodeExp(name="TOTALDSTADDRESSES",expression="t1.[TOTALDSTADDRESSES]")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.[UPDATEDATE]")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.[UPDATEMAN]")
        ,@DEDataQueryCodeExp(name="USERDATA",expression="t1.[USERDATA]")
        ,@DEDataQueryCodeExp(name="USERDATA2",expression="t1.[USERDATA2]")
        ,@DEDataQueryCodeExp(name="USERDATA3",expression="t1.[USERDATA3]")
        ,@DEDataQueryCodeExp(name="USERDATA4",expression="t1.[USERDATA4]")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CONTENTTYPE AS CONTENTTYPE, t1.CREATEDATE AS CREATEDATE, t1.CREATEMAN AS CREATEMAN, t1.DSTADDRESSES AS DSTADDRESSES, t1.DSTUSERS AS DSTUSERS, t1.FILEAT AS FILEAT, t1.FILEAT2 AS FILEAT2, t1.FILEAT3 AS FILEAT3, t1.FILEAT4 AS FILEAT4, t1.IMPORTANCEFLAG AS IMPORTANCEFLAG, t1.ISERROR AS ISERROR, t1.ISSEND AS ISSEND, t1.MSGSENDQUEUEHISID AS MSGSENDQUEUEHISID, t1.MSGSENDQUEUEHISNAME AS MSGSENDQUEUEHISNAME, t1.MSGTYPE AS MSGTYPE, t1.PLANSENDTIME AS PLANSENDTIME, t1.PROCESSTIME AS PROCESSTIME, t1.SENDTAG AS SENDTAG, t1.SUBJECT AS SUBJECT, t1.TOTALDSTADDRESSES AS TOTALDSTADDRESSES, t1.UPDATEDATE AS UPDATEDATE, t1.UPDATEMAN AS UPDATEMAN, t1.USERDATA AS USERDATA, t1.USERDATA2 AS USERDATA2, t1.USERDATA3 AS USERDATA3, t1.USERDATA4 AS USERDATA4 FROM T_SRFMSGSENDQUEUEHIS t1 ",querycodetemp="",declarecode="",dbtype="POSTGRESQL",
    fieldexps={
        @DEDataQueryCodeExp(name="CONTENT",expression="t1.CONTENT")
        ,@DEDataQueryCodeExp(name="ERRORINFO",expression="t1.ERRORINFO")
        ,@DEDataQueryCodeExp(name="CONTENTTYPE",expression="t1.CONTENTTYPE")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="DSTADDRESSES",expression="t1.DSTADDRESSES")
        ,@DEDataQueryCodeExp(name="DSTUSERS",expression="t1.DSTUSERS")
        ,@DEDataQueryCodeExp(name="FILEAT",expression="t1.FILEAT")
        ,@DEDataQueryCodeExp(name="FILEAT2",expression="t1.FILEAT2")
        ,@DEDataQueryCodeExp(name="FILEAT3",expression="t1.FILEAT3")
        ,@DEDataQueryCodeExp(name="FILEAT4",expression="t1.FILEAT4")
        ,@DEDataQueryCodeExp(name="IMPORTANCEFLAG",expression="t1.IMPORTANCEFLAG")
        ,@DEDataQueryCodeExp(name="ISERROR",expression="t1.ISERROR")
        ,@DEDataQueryCodeExp(name="ISSEND",expression="t1.ISSEND")
        ,@DEDataQueryCodeExp(name="MSGSENDQUEUEHISID",expression="t1.MSGSENDQUEUEHISID")
        ,@DEDataQueryCodeExp(name="MSGSENDQUEUEHISNAME",expression="t1.MSGSENDQUEUEHISNAME")
        ,@DEDataQueryCodeExp(name="MSGTYPE",expression="t1.MSGTYPE")
        ,@DEDataQueryCodeExp(name="PLANSENDTIME",expression="t1.PLANSENDTIME")
        ,@DEDataQueryCodeExp(name="PROCESSTIME",expression="t1.PROCESSTIME")
        ,@DEDataQueryCodeExp(name="SENDTAG",expression="t1.SENDTAG")
        ,@DEDataQueryCodeExp(name="SUBJECT",expression="t1.SUBJECT")
        ,@DEDataQueryCodeExp(name="TOTALDSTADDRESSES",expression="t1.TOTALDSTADDRESSES")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="USERDATA",expression="t1.USERDATA")
        ,@DEDataQueryCodeExp(name="USERDATA2",expression="t1.USERDATA2")
        ,@DEDataQueryCodeExp(name="USERDATA3",expression="t1.USERDATA3")
        ,@DEDataQueryCodeExp(name="USERDATA4",expression="t1.USERDATA4")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CONTENTTYPE AS CONTENTTYPE, t1.CREATEDATE AS CREATEDATE, t1.CREATEMAN AS CREATEMAN, t1.DSTADDRESSES AS DSTADDRESSES, t1.DSTUSERS AS DSTUSERS, t1.FILEAT AS FILEAT, t1.FILEAT2 AS FILEAT2, t1.FILEAT3 AS FILEAT3, t1.FILEAT4 AS FILEAT4, t1.IMPORTANCEFLAG AS IMPORTANCEFLAG, t1.ISERROR AS ISERROR, t1.ISSEND AS ISSEND, t1.MSGSENDQUEUEHISID AS MSGSENDQUEUEHISID, t1.MSGSENDQUEUEHISNAME AS MSGSENDQUEUEHISNAME, t1.MSGTYPE AS MSGTYPE, t1.PLANSENDTIME AS PLANSENDTIME, t1.PROCESSTIME AS PROCESSTIME, t1.SENDTAG AS SENDTAG, t1.SUBJECT AS SUBJECT, t1.TOTALDSTADDRESSES AS TOTALDSTADDRESSES, t1.UPDATEDATE AS UPDATEDATE, t1.UPDATEMAN AS UPDATEMAN, t1.USERDATA AS USERDATA, t1.USERDATA2 AS USERDATA2, t1.USERDATA3 AS USERDATA3, t1.USERDATA4 AS USERDATA4 FROM T_SRFMSGSENDQUEUEHIS t1 ",querycodetemp="",declarecode="",dbtype="PPAS",
    fieldexps={
        @DEDataQueryCodeExp(name="CONTENT",expression="t1.CONTENT")
        ,@DEDataQueryCodeExp(name="ERRORINFO",expression="t1.ERRORINFO")
        ,@DEDataQueryCodeExp(name="CONTENTTYPE",expression="t1.CONTENTTYPE")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="DSTADDRESSES",expression="t1.DSTADDRESSES")
        ,@DEDataQueryCodeExp(name="DSTUSERS",expression="t1.DSTUSERS")
        ,@DEDataQueryCodeExp(name="FILEAT",expression="t1.FILEAT")
        ,@DEDataQueryCodeExp(name="FILEAT2",expression="t1.FILEAT2")
        ,@DEDataQueryCodeExp(name="FILEAT3",expression="t1.FILEAT3")
        ,@DEDataQueryCodeExp(name="FILEAT4",expression="t1.FILEAT4")
        ,@DEDataQueryCodeExp(name="IMPORTANCEFLAG",expression="t1.IMPORTANCEFLAG")
        ,@DEDataQueryCodeExp(name="ISERROR",expression="t1.ISERROR")
        ,@DEDataQueryCodeExp(name="ISSEND",expression="t1.ISSEND")
        ,@DEDataQueryCodeExp(name="MSGSENDQUEUEHISID",expression="t1.MSGSENDQUEUEHISID")
        ,@DEDataQueryCodeExp(name="MSGSENDQUEUEHISNAME",expression="t1.MSGSENDQUEUEHISNAME")
        ,@DEDataQueryCodeExp(name="MSGTYPE",expression="t1.MSGTYPE")
        ,@DEDataQueryCodeExp(name="PLANSENDTIME",expression="t1.PLANSENDTIME")
        ,@DEDataQueryCodeExp(name="PROCESSTIME",expression="t1.PROCESSTIME")
        ,@DEDataQueryCodeExp(name="SENDTAG",expression="t1.SENDTAG")
        ,@DEDataQueryCodeExp(name="SUBJECT",expression="t1.SUBJECT")
        ,@DEDataQueryCodeExp(name="TOTALDSTADDRESSES",expression="t1.TOTALDSTADDRESSES")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="USERDATA",expression="t1.USERDATA")
        ,@DEDataQueryCodeExp(name="USERDATA2",expression="t1.USERDATA2")
        ,@DEDataQueryCodeExp(name="USERDATA3",expression="t1.USERDATA3")
        ,@DEDataQueryCodeExp(name="USERDATA4",expression="t1.USERDATA4")
    },
    conds={})
})
/**
 *  实体数据查询 [DEFAULT]模型基类
 */
public abstract class MsgSendQueueHisDefaultDQModelBase extends net.ibizsys.paas.demodel.DEDataQueryModelBase {

    public MsgSendQueueHisDefaultDQModelBase() {
        super();

        this.initAnnotation(MsgSendQueueHisDefaultDQModelBase.class);
    }

}