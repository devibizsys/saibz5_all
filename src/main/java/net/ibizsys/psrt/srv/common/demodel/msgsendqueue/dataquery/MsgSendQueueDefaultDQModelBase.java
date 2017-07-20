/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package net.ibizsys.psrt.srv.common.demodel.msgsendqueue.dataquery;



import net.ibizsys.paas.core.DEDataQuery;
import net.ibizsys.paas.core.DEDataQueryCodes;
import net.ibizsys.paas.core.DEDataQueryCode;
import net.ibizsys.paas.core.DEDataQueryCodeExp;
import net.ibizsys.paas.core.DEDataQueryCodeCond;

@DEDataQuery(id="F4834CCA-AF33-42BA-80A4-F70106F4DEC1",name="DEFAULT")
@DEDataQueryCodes({
    @DEDataQueryCode(querycode="SELECT t1.CONTENTTYPE, t1.CREATEDATE, t1.CREATEMAN, t1.DSTADDRESSES, t1.DSTUSERS, t1.FILEAT, t1.FILEAT2, t1.FILEAT3, t1.FILEAT4, t1.IMPORTANCEFLAG, t1.ISERROR, t1.ISSEND, t1.MSGSENDQUEUEID, t1.MSGSENDQUEUENAME, t1.MSGTYPE, t1.PLANSENDTIME, t1.PROCESSTIME, t1.SENDTAG, t1.SUBJECT, t1.UPDATEDATE, t1.UPDATEMAN, t1.USERDATA, t1.USERDATA2, t1.USERDATA3, t1.USERDATA4 FROM T_SRFMSGSENDQUEUE t1 ",querycodetemp="",declarecode="",dbtype="DB2",
    fieldexps={
        @DEDataQueryCodeExp(name="CONTENT",expression="t1.CONTENT")
        ,@DEDataQueryCodeExp(name="ERRORINFO",expression="t1.ERRORINFO")
        ,@DEDataQueryCodeExp(name="TOTALDSTADDRESSES",expression="t1.TOTALDSTADDRESSES")
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
        ,@DEDataQueryCodeExp(name="MSGSENDQUEUEID",expression="t1.MSGSENDQUEUEID")
        ,@DEDataQueryCodeExp(name="MSGSENDQUEUENAME",expression="t1.MSGSENDQUEUENAME")
        ,@DEDataQueryCodeExp(name="MSGTYPE",expression="t1.MSGTYPE")
        ,@DEDataQueryCodeExp(name="PLANSENDTIME",expression="t1.PLANSENDTIME")
        ,@DEDataQueryCodeExp(name="PROCESSTIME",expression="t1.PROCESSTIME")
        ,@DEDataQueryCodeExp(name="SENDTAG",expression="t1.SENDTAG")
        ,@DEDataQueryCodeExp(name="SUBJECT",expression="t1.SUBJECT")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="USERDATA",expression="t1.USERDATA")
        ,@DEDataQueryCodeExp(name="USERDATA2",expression="t1.USERDATA2")
        ,@DEDataQueryCodeExp(name="USERDATA3",expression="t1.USERDATA3")
        ,@DEDataQueryCodeExp(name="USERDATA4",expression="t1.USERDATA4")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.`CONTENTTYPE`, t1.`CREATEDATE`, t1.`CREATEMAN`, t1.`DSTADDRESSES`, t1.`DSTUSERS`, t1.`FILEAT`, t1.`FILEAT2`, t1.`FILEAT3`, t1.`FILEAT4`, t1.`IMPORTANCEFLAG`, t1.`ISERROR`, t1.`ISSEND`, t1.`MSGSENDQUEUEID`, t1.`MSGSENDQUEUENAME`, t1.`MSGTYPE`, t1.`PLANSENDTIME`, t1.`PROCESSTIME`, t1.`SENDTAG`, t1.`SUBJECT`, t1.`UPDATEDATE`, t1.`UPDATEMAN`, t1.`USERDATA`, t1.`USERDATA2`, t1.`USERDATA3`, t1.`USERDATA4` FROM `T_SRFMSGSENDQUEUE` t1 ",querycodetemp="",declarecode="",dbtype="MYSQL5",
    fieldexps={
        @DEDataQueryCodeExp(name="CONTENT",expression="t1.`CONTENT`")
        ,@DEDataQueryCodeExp(name="ERRORINFO",expression="t1.`ERRORINFO`")
        ,@DEDataQueryCodeExp(name="TOTALDSTADDRESSES",expression="t1.`TOTALDSTADDRESSES`")
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
        ,@DEDataQueryCodeExp(name="MSGSENDQUEUEID",expression="t1.`MSGSENDQUEUEID`")
        ,@DEDataQueryCodeExp(name="MSGSENDQUEUENAME",expression="t1.`MSGSENDQUEUENAME`")
        ,@DEDataQueryCodeExp(name="MSGTYPE",expression="t1.`MSGTYPE`")
        ,@DEDataQueryCodeExp(name="PLANSENDTIME",expression="t1.`PLANSENDTIME`")
        ,@DEDataQueryCodeExp(name="PROCESSTIME",expression="t1.`PROCESSTIME`")
        ,@DEDataQueryCodeExp(name="SENDTAG",expression="t1.`SENDTAG`")
        ,@DEDataQueryCodeExp(name="SUBJECT",expression="t1.`SUBJECT`")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.`UPDATEDATE`")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.`UPDATEMAN`")
        ,@DEDataQueryCodeExp(name="USERDATA",expression="t1.`USERDATA`")
        ,@DEDataQueryCodeExp(name="USERDATA2",expression="t1.`USERDATA2`")
        ,@DEDataQueryCodeExp(name="USERDATA3",expression="t1.`USERDATA3`")
        ,@DEDataQueryCodeExp(name="USERDATA4",expression="t1.`USERDATA4`")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CONTENTTYPE, t1.CREATEDATE, t1.CREATEMAN, t1.DSTADDRESSES, t1.DSTUSERS, t1.FILEAT, t1.FILEAT2, t1.FILEAT3, t1.FILEAT4, t1.IMPORTANCEFLAG, t1.ISERROR, t1.ISSEND, t1.MSGSENDQUEUEID, t1.MSGSENDQUEUENAME, t1.MSGTYPE, t1.PLANSENDTIME, t1.PROCESSTIME, t1.SENDTAG, t1.SUBJECT, t1.UPDATEDATE, t1.UPDATEMAN, t1.USERDATA, t1.USERDATA2, t1.USERDATA3, t1.USERDATA4 FROM T_SRFMSGSENDQUEUE t1 ",querycodetemp="",declarecode="",dbtype="ORACLE",
    fieldexps={
        @DEDataQueryCodeExp(name="CONTENT",expression="t1.CONTENT")
        ,@DEDataQueryCodeExp(name="ERRORINFO",expression="t1.ERRORINFO")
        ,@DEDataQueryCodeExp(name="TOTALDSTADDRESSES",expression="t1.TOTALDSTADDRESSES")
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
        ,@DEDataQueryCodeExp(name="MSGSENDQUEUEID",expression="t1.MSGSENDQUEUEID")
        ,@DEDataQueryCodeExp(name="MSGSENDQUEUENAME",expression="t1.MSGSENDQUEUENAME")
        ,@DEDataQueryCodeExp(name="MSGTYPE",expression="t1.MSGTYPE")
        ,@DEDataQueryCodeExp(name="PLANSENDTIME",expression="t1.PLANSENDTIME")
        ,@DEDataQueryCodeExp(name="PROCESSTIME",expression="t1.PROCESSTIME")
        ,@DEDataQueryCodeExp(name="SENDTAG",expression="t1.SENDTAG")
        ,@DEDataQueryCodeExp(name="SUBJECT",expression="t1.SUBJECT")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="USERDATA",expression="t1.USERDATA")
        ,@DEDataQueryCodeExp(name="USERDATA2",expression="t1.USERDATA2")
        ,@DEDataQueryCodeExp(name="USERDATA3",expression="t1.USERDATA3")
        ,@DEDataQueryCodeExp(name="USERDATA4",expression="t1.USERDATA4")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.[CONTENTTYPE], t1.[CREATEDATE], t1.[CREATEMAN], t1.[DSTADDRESSES], t1.[DSTUSERS], t1.[FILEAT], t1.[FILEAT2], t1.[FILEAT3], t1.[FILEAT4], t1.[IMPORTANCEFLAG], t1.[ISERROR], t1.[ISSEND], t1.[MSGSENDQUEUEID], t1.[MSGSENDQUEUENAME], t1.[MSGTYPE], t1.[PLANSENDTIME], t1.[PROCESSTIME], t1.[SENDTAG], t1.[SUBJECT], t1.[UPDATEDATE], t1.[UPDATEMAN], t1.[USERDATA], t1.[USERDATA2], t1.[USERDATA3], t1.[USERDATA4] FROM [T_SRFMSGSENDQUEUE] t1 ",querycodetemp="",declarecode="",dbtype="SQLSERVER",
    fieldexps={
        @DEDataQueryCodeExp(name="CONTENT",expression="t1.[CONTENT]")
        ,@DEDataQueryCodeExp(name="ERRORINFO",expression="t1.[ERRORINFO]")
        ,@DEDataQueryCodeExp(name="TOTALDSTADDRESSES",expression="t1.[TOTALDSTADDRESSES]")
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
        ,@DEDataQueryCodeExp(name="MSGSENDQUEUEID",expression="t1.[MSGSENDQUEUEID]")
        ,@DEDataQueryCodeExp(name="MSGSENDQUEUENAME",expression="t1.[MSGSENDQUEUENAME]")
        ,@DEDataQueryCodeExp(name="MSGTYPE",expression="t1.[MSGTYPE]")
        ,@DEDataQueryCodeExp(name="PLANSENDTIME",expression="t1.[PLANSENDTIME]")
        ,@DEDataQueryCodeExp(name="PROCESSTIME",expression="t1.[PROCESSTIME]")
        ,@DEDataQueryCodeExp(name="SENDTAG",expression="t1.[SENDTAG]")
        ,@DEDataQueryCodeExp(name="SUBJECT",expression="t1.[SUBJECT]")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.[UPDATEDATE]")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.[UPDATEMAN]")
        ,@DEDataQueryCodeExp(name="USERDATA",expression="t1.[USERDATA]")
        ,@DEDataQueryCodeExp(name="USERDATA2",expression="t1.[USERDATA2]")
        ,@DEDataQueryCodeExp(name="USERDATA3",expression="t1.[USERDATA3]")
        ,@DEDataQueryCodeExp(name="USERDATA4",expression="t1.[USERDATA4]")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CONTENTTYPE, t1.CREATEDATE, t1.CREATEMAN, t1.DSTADDRESSES, t1.DSTUSERS, t1.FILEAT, t1.FILEAT2, t1.FILEAT3, t1.FILEAT4, t1.IMPORTANCEFLAG, t1.ISERROR, t1.ISSEND, t1.MSGSENDQUEUEID, t1.MSGSENDQUEUENAME, t1.MSGTYPE, t1.PLANSENDTIME, t1.PROCESSTIME, t1.SENDTAG, t1.SUBJECT, t1.UPDATEDATE, t1.UPDATEMAN, t1.USERDATA, t1.USERDATA2, t1.USERDATA3, t1.USERDATA4 FROM T_SRFMSGSENDQUEUE t1 ",querycodetemp="",declarecode="",dbtype="POSTGRESQL",
    fieldexps={
        @DEDataQueryCodeExp(name="CONTENT",expression="t1.CONTENT")
        ,@DEDataQueryCodeExp(name="ERRORINFO",expression="t1.ERRORINFO")
        ,@DEDataQueryCodeExp(name="TOTALDSTADDRESSES",expression="t1.TOTALDSTADDRESSES")
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
        ,@DEDataQueryCodeExp(name="MSGSENDQUEUEID",expression="t1.MSGSENDQUEUEID")
        ,@DEDataQueryCodeExp(name="MSGSENDQUEUENAME",expression="t1.MSGSENDQUEUENAME")
        ,@DEDataQueryCodeExp(name="MSGTYPE",expression="t1.MSGTYPE")
        ,@DEDataQueryCodeExp(name="PLANSENDTIME",expression="t1.PLANSENDTIME")
        ,@DEDataQueryCodeExp(name="PROCESSTIME",expression="t1.PROCESSTIME")
        ,@DEDataQueryCodeExp(name="SENDTAG",expression="t1.SENDTAG")
        ,@DEDataQueryCodeExp(name="SUBJECT",expression="t1.SUBJECT")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="USERDATA",expression="t1.USERDATA")
        ,@DEDataQueryCodeExp(name="USERDATA2",expression="t1.USERDATA2")
        ,@DEDataQueryCodeExp(name="USERDATA3",expression="t1.USERDATA3")
        ,@DEDataQueryCodeExp(name="USERDATA4",expression="t1.USERDATA4")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CONTENTTYPE, t1.CREATEDATE, t1.CREATEMAN, t1.DSTADDRESSES, t1.DSTUSERS, t1.FILEAT, t1.FILEAT2, t1.FILEAT3, t1.FILEAT4, t1.IMPORTANCEFLAG, t1.ISERROR, t1.ISSEND, t1.MSGSENDQUEUEID, t1.MSGSENDQUEUENAME, t1.MSGTYPE, t1.PLANSENDTIME, t1.PROCESSTIME, t1.SENDTAG, t1.SUBJECT, t1.UPDATEDATE, t1.UPDATEMAN, t1.USERDATA, t1.USERDATA2, t1.USERDATA3, t1.USERDATA4 FROM T_SRFMSGSENDQUEUE t1 ",querycodetemp="",declarecode="",dbtype="PPAS",
    fieldexps={
        @DEDataQueryCodeExp(name="CONTENT",expression="t1.CONTENT")
        ,@DEDataQueryCodeExp(name="ERRORINFO",expression="t1.ERRORINFO")
        ,@DEDataQueryCodeExp(name="TOTALDSTADDRESSES",expression="t1.TOTALDSTADDRESSES")
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
        ,@DEDataQueryCodeExp(name="MSGSENDQUEUEID",expression="t1.MSGSENDQUEUEID")
        ,@DEDataQueryCodeExp(name="MSGSENDQUEUENAME",expression="t1.MSGSENDQUEUENAME")
        ,@DEDataQueryCodeExp(name="MSGTYPE",expression="t1.MSGTYPE")
        ,@DEDataQueryCodeExp(name="PLANSENDTIME",expression="t1.PLANSENDTIME")
        ,@DEDataQueryCodeExp(name="PROCESSTIME",expression="t1.PROCESSTIME")
        ,@DEDataQueryCodeExp(name="SENDTAG",expression="t1.SENDTAG")
        ,@DEDataQueryCodeExp(name="SUBJECT",expression="t1.SUBJECT")
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
public abstract class MsgSendQueueDefaultDQModelBase extends net.ibizsys.paas.demodel.DEDataQueryModelBase {

    public MsgSendQueueDefaultDQModelBase() {
        super();

        this.initAnnotation(MsgSendQueueDefaultDQModelBase.class);
    }

}