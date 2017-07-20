/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package net.ibizsys.psrt.srv.common.demodel.msgtemplate.dataquery;



import net.ibizsys.paas.core.DEDataQuery;
import net.ibizsys.paas.core.DEDataQueryCodes;
import net.ibizsys.paas.core.DEDataQueryCode;
import net.ibizsys.paas.core.DEDataQueryCodeExp;
import net.ibizsys.paas.core.DEDataQueryCodeCond;

@DEDataQuery(id="563B84B0-DE2A-4EF1-92D2-3BA701879891",name="DEFAULT")
@DEDataQueryCodes({
    @DEDataQueryCode(querycode="SELECT t1.CONTENTTYPE, t1.CREATEDATE, t1.CREATEMAN, t1.DEID, t11.DENAME, t1.ENABLE, t1.IMCONTENT, t1.MAILGROUPSEND, t1.MSGTEMPLATEID, t1.MSGTEMPLATENAME, t1.RESERVER, t1.RESERVER2, t1.RESERVER3, t1.RESERVER4, t1.SMSCONTENT, t1.SRFSYSPUB, t1.SRFUSERPUB, t1.SUBJECT, t1.UPDATEDATE, t1.UPDATEMAN FROM T_SRFMSGTEMPLATE t1  LEFT JOIN t_srfdataentity t11 ON t1.DEID = t11.DEID ",querycodetemp="",declarecode="",dbtype="DB2",
    fieldexps={
        @DEDataQueryCodeExp(name="CONTENT",expression="t1.CONTENT")
        ,@DEDataQueryCodeExp(name="WCCONTENT",expression="t1.WCCONTENT")
        ,@DEDataQueryCodeExp(name="CONTENTTYPE",expression="t1.CONTENTTYPE")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="DEID",expression="t1.DEID")
        ,@DEDataQueryCodeExp(name="DENAME",expression="t11.DENAME")
        ,@DEDataQueryCodeExp(name="ENABLE",expression="t1.ENABLE")
        ,@DEDataQueryCodeExp(name="IMCONTENT",expression="t1.IMCONTENT")
        ,@DEDataQueryCodeExp(name="MAILGROUPSEND",expression="t1.MAILGROUPSEND")
        ,@DEDataQueryCodeExp(name="MSGTEMPLATEID",expression="t1.MSGTEMPLATEID")
        ,@DEDataQueryCodeExp(name="MSGTEMPLATENAME",expression="t1.MSGTEMPLATENAME")
        ,@DEDataQueryCodeExp(name="RESERVER",expression="t1.RESERVER")
        ,@DEDataQueryCodeExp(name="RESERVER2",expression="t1.RESERVER2")
        ,@DEDataQueryCodeExp(name="RESERVER3",expression="t1.RESERVER3")
        ,@DEDataQueryCodeExp(name="RESERVER4",expression="t1.RESERVER4")
        ,@DEDataQueryCodeExp(name="SMSCONTENT",expression="t1.SMSCONTENT")
        ,@DEDataQueryCodeExp(name="SRFSYSPUB",expression="t1.SRFSYSPUB")
        ,@DEDataQueryCodeExp(name="SRFUSERPUB",expression="t1.SRFUSERPUB")
        ,@DEDataQueryCodeExp(name="SUBJECT",expression="t1.SUBJECT")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
    },
    conds={
        @DEDataQueryCodeCond(condition="t1.ENABLE = 1")
    }),
    @DEDataQueryCode(querycode="SELECT t1.`CONTENTTYPE`, t1.`CREATEDATE`, t1.`CREATEMAN`, t1.`DEID`, t11.`DENAME`, t1.`ENABLE`, t1.`IMCONTENT`, t1.`MAILGROUPSEND`, t1.`MSGTEMPLATEID`, t1.`MSGTEMPLATENAME`, t1.`RESERVER`, t1.`RESERVER2`, t1.`RESERVER3`, t1.`RESERVER4`, t1.`SMSCONTENT`, t1.`SRFSYSPUB`, t1.`SRFUSERPUB`, t1.`SUBJECT`, t1.`UPDATEDATE`, t1.`UPDATEMAN` FROM `T_SRFMSGTEMPLATE` t1  LEFT JOIN t_srfdataentity t11 ON t1.DEID = t11.DEID ",querycodetemp="",declarecode="",dbtype="MYSQL5",
    fieldexps={
        @DEDataQueryCodeExp(name="CONTENT",expression="t1.`CONTENT`")
        ,@DEDataQueryCodeExp(name="WCCONTENT",expression="t1.`WCCONTENT`")
        ,@DEDataQueryCodeExp(name="CONTENTTYPE",expression="t1.`CONTENTTYPE`")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.`CREATEDATE`")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.`CREATEMAN`")
        ,@DEDataQueryCodeExp(name="DEID",expression="t1.`DEID`")
        ,@DEDataQueryCodeExp(name="DENAME",expression="t11.`DENAME`")
        ,@DEDataQueryCodeExp(name="ENABLE",expression="t1.`ENABLE`")
        ,@DEDataQueryCodeExp(name="IMCONTENT",expression="t1.`IMCONTENT`")
        ,@DEDataQueryCodeExp(name="MAILGROUPSEND",expression="t1.`MAILGROUPSEND`")
        ,@DEDataQueryCodeExp(name="MSGTEMPLATEID",expression="t1.`MSGTEMPLATEID`")
        ,@DEDataQueryCodeExp(name="MSGTEMPLATENAME",expression="t1.`MSGTEMPLATENAME`")
        ,@DEDataQueryCodeExp(name="RESERVER",expression="t1.`RESERVER`")
        ,@DEDataQueryCodeExp(name="RESERVER2",expression="t1.`RESERVER2`")
        ,@DEDataQueryCodeExp(name="RESERVER3",expression="t1.`RESERVER3`")
        ,@DEDataQueryCodeExp(name="RESERVER4",expression="t1.`RESERVER4`")
        ,@DEDataQueryCodeExp(name="SMSCONTENT",expression="t1.`SMSCONTENT`")
        ,@DEDataQueryCodeExp(name="SRFSYSPUB",expression="t1.`SRFSYSPUB`")
        ,@DEDataQueryCodeExp(name="SRFUSERPUB",expression="t1.`SRFUSERPUB`")
        ,@DEDataQueryCodeExp(name="SUBJECT",expression="t1.`SUBJECT`")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.`UPDATEDATE`")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.`UPDATEMAN`")
    },
    conds={
        @DEDataQueryCodeCond(condition="t1.ENABLE = 1")
    }),
    @DEDataQueryCode(querycode="SELECT t1.CONTENTTYPE, t1.CREATEDATE, t1.CREATEMAN, t1.DEID, t11.DENAME, t1.ENABLE, t1.IMCONTENT, t1.MAILGROUPSEND, t1.MSGTEMPLATEID, t1.MSGTEMPLATENAME, t1.RESERVER, t1.RESERVER2, t1.RESERVER3, t1.RESERVER4, t1.SMSCONTENT, t1.SRFSYSPUB, t1.SRFUSERPUB, t1.SUBJECT, t1.UPDATEDATE, t1.UPDATEMAN FROM T_SRFMSGTEMPLATE t1  LEFT JOIN t_srfdataentity t11 ON t1.DEID = t11.DEID ",querycodetemp="",declarecode="",dbtype="ORACLE",
    fieldexps={
        @DEDataQueryCodeExp(name="CONTENT",expression="t1.CONTENT")
        ,@DEDataQueryCodeExp(name="WCCONTENT",expression="t1.WCCONTENT")
        ,@DEDataQueryCodeExp(name="CONTENTTYPE",expression="t1.CONTENTTYPE")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="DEID",expression="t1.DEID")
        ,@DEDataQueryCodeExp(name="DENAME",expression="t11.DENAME")
        ,@DEDataQueryCodeExp(name="ENABLE",expression="t1.ENABLE")
        ,@DEDataQueryCodeExp(name="IMCONTENT",expression="t1.IMCONTENT")
        ,@DEDataQueryCodeExp(name="MAILGROUPSEND",expression="t1.MAILGROUPSEND")
        ,@DEDataQueryCodeExp(name="MSGTEMPLATEID",expression="t1.MSGTEMPLATEID")
        ,@DEDataQueryCodeExp(name="MSGTEMPLATENAME",expression="t1.MSGTEMPLATENAME")
        ,@DEDataQueryCodeExp(name="RESERVER",expression="t1.RESERVER")
        ,@DEDataQueryCodeExp(name="RESERVER2",expression="t1.RESERVER2")
        ,@DEDataQueryCodeExp(name="RESERVER3",expression="t1.RESERVER3")
        ,@DEDataQueryCodeExp(name="RESERVER4",expression="t1.RESERVER4")
        ,@DEDataQueryCodeExp(name="SMSCONTENT",expression="t1.SMSCONTENT")
        ,@DEDataQueryCodeExp(name="SRFSYSPUB",expression="t1.SRFSYSPUB")
        ,@DEDataQueryCodeExp(name="SRFUSERPUB",expression="t1.SRFUSERPUB")
        ,@DEDataQueryCodeExp(name="SUBJECT",expression="t1.SUBJECT")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
    },
    conds={
        @DEDataQueryCodeCond(condition="t1.ENABLE = 1")
    }),
    @DEDataQueryCode(querycode="SELECT t1.[CONTENTTYPE], t1.[CREATEDATE], t1.[CREATEMAN], t1.[DEID], t11.[DENAME], t1.[ENABLE], t1.[IMCONTENT], t1.[MAILGROUPSEND], t1.[MSGTEMPLATEID], t1.[MSGTEMPLATENAME], t1.[RESERVER], t1.[RESERVER2], t1.[RESERVER3], t1.[RESERVER4], t1.[SMSCONTENT], t1.[SRFSYSPUB], t1.[SRFUSERPUB], t1.[SUBJECT], t1.[UPDATEDATE], t1.[UPDATEMAN] FROM [T_SRFMSGTEMPLATE] t1  LEFT JOIN t_srfdataentity t11 ON t1.DEID = t11.DEID ",querycodetemp="",declarecode="",dbtype="SQLSERVER",
    fieldexps={
        @DEDataQueryCodeExp(name="CONTENT",expression="t1.[CONTENT]")
        ,@DEDataQueryCodeExp(name="WCCONTENT",expression="t1.[WCCONTENT]")
        ,@DEDataQueryCodeExp(name="CONTENTTYPE",expression="t1.[CONTENTTYPE]")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.[CREATEDATE]")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.[CREATEMAN]")
        ,@DEDataQueryCodeExp(name="DEID",expression="t1.[DEID]")
        ,@DEDataQueryCodeExp(name="DENAME",expression="t11.[DENAME]")
        ,@DEDataQueryCodeExp(name="ENABLE",expression="t1.[ENABLE]")
        ,@DEDataQueryCodeExp(name="IMCONTENT",expression="t1.[IMCONTENT]")
        ,@DEDataQueryCodeExp(name="MAILGROUPSEND",expression="t1.[MAILGROUPSEND]")
        ,@DEDataQueryCodeExp(name="MSGTEMPLATEID",expression="t1.[MSGTEMPLATEID]")
        ,@DEDataQueryCodeExp(name="MSGTEMPLATENAME",expression="t1.[MSGTEMPLATENAME]")
        ,@DEDataQueryCodeExp(name="RESERVER",expression="t1.[RESERVER]")
        ,@DEDataQueryCodeExp(name="RESERVER2",expression="t1.[RESERVER2]")
        ,@DEDataQueryCodeExp(name="RESERVER3",expression="t1.[RESERVER3]")
        ,@DEDataQueryCodeExp(name="RESERVER4",expression="t1.[RESERVER4]")
        ,@DEDataQueryCodeExp(name="SMSCONTENT",expression="t1.[SMSCONTENT]")
        ,@DEDataQueryCodeExp(name="SRFSYSPUB",expression="t1.[SRFSYSPUB]")
        ,@DEDataQueryCodeExp(name="SRFUSERPUB",expression="t1.[SRFUSERPUB]")
        ,@DEDataQueryCodeExp(name="SUBJECT",expression="t1.[SUBJECT]")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.[UPDATEDATE]")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.[UPDATEMAN]")
    },
    conds={
        @DEDataQueryCodeCond(condition="t1.ENABLE = 1")
    }),
    @DEDataQueryCode(querycode="SELECT t1.CONTENTTYPE, t1.CREATEDATE, t1.CREATEMAN, t1.DEID, t11.DENAME, t1.ENABLE, t1.IMCONTENT, t1.MAILGROUPSEND, t1.MSGTEMPLATEID, t1.MSGTEMPLATENAME, t1.RESERVER, t1.RESERVER2, t1.RESERVER3, t1.RESERVER4, t1.SMSCONTENT, t1.SRFSYSPUB, t1.SRFUSERPUB, t1.SUBJECT, t1.UPDATEDATE, t1.UPDATEMAN FROM T_SRFMSGTEMPLATE t1  LEFT JOIN t_srfdataentity t11 ON t1.DEID = t11.DEID ",querycodetemp="",declarecode="",dbtype="POSTGRESQL",
    fieldexps={
        @DEDataQueryCodeExp(name="CONTENT",expression="t1.CONTENT")
        ,@DEDataQueryCodeExp(name="WCCONTENT",expression="t1.WCCONTENT")
        ,@DEDataQueryCodeExp(name="CONTENTTYPE",expression="t1.CONTENTTYPE")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="DEID",expression="t1.DEID")
        ,@DEDataQueryCodeExp(name="DENAME",expression="t11.DENAME")
        ,@DEDataQueryCodeExp(name="ENABLE",expression="t1.ENABLE")
        ,@DEDataQueryCodeExp(name="IMCONTENT",expression="t1.IMCONTENT")
        ,@DEDataQueryCodeExp(name="MAILGROUPSEND",expression="t1.MAILGROUPSEND")
        ,@DEDataQueryCodeExp(name="MSGTEMPLATEID",expression="t1.MSGTEMPLATEID")
        ,@DEDataQueryCodeExp(name="MSGTEMPLATENAME",expression="t1.MSGTEMPLATENAME")
        ,@DEDataQueryCodeExp(name="RESERVER",expression="t1.RESERVER")
        ,@DEDataQueryCodeExp(name="RESERVER2",expression="t1.RESERVER2")
        ,@DEDataQueryCodeExp(name="RESERVER3",expression="t1.RESERVER3")
        ,@DEDataQueryCodeExp(name="RESERVER4",expression="t1.RESERVER4")
        ,@DEDataQueryCodeExp(name="SMSCONTENT",expression="t1.SMSCONTENT")
        ,@DEDataQueryCodeExp(name="SRFSYSPUB",expression="t1.SRFSYSPUB")
        ,@DEDataQueryCodeExp(name="SRFUSERPUB",expression="t1.SRFUSERPUB")
        ,@DEDataQueryCodeExp(name="SUBJECT",expression="t1.SUBJECT")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
    },
    conds={
        @DEDataQueryCodeCond(condition="t1.ENABLE = 1")
    }),
    @DEDataQueryCode(querycode="SELECT t1.CONTENTTYPE, t1.CREATEDATE, t1.CREATEMAN, t1.DEID, t11.DENAME, t1.ENABLE, t1.IMCONTENT, t1.MAILGROUPSEND, t1.MSGTEMPLATEID, t1.MSGTEMPLATENAME, t1.RESERVER, t1.RESERVER2, t1.RESERVER3, t1.RESERVER4, t1.SMSCONTENT, t1.SRFSYSPUB, t1.SRFUSERPUB, t1.SUBJECT, t1.UPDATEDATE, t1.UPDATEMAN FROM T_SRFMSGTEMPLATE t1  LEFT JOIN t_srfdataentity t11 ON t1.DEID = t11.DEID ",querycodetemp="",declarecode="",dbtype="PPAS",
    fieldexps={
        @DEDataQueryCodeExp(name="CONTENT",expression="t1.CONTENT")
        ,@DEDataQueryCodeExp(name="WCCONTENT",expression="t1.WCCONTENT")
        ,@DEDataQueryCodeExp(name="CONTENTTYPE",expression="t1.CONTENTTYPE")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="DEID",expression="t1.DEID")
        ,@DEDataQueryCodeExp(name="DENAME",expression="t11.DENAME")
        ,@DEDataQueryCodeExp(name="ENABLE",expression="t1.ENABLE")
        ,@DEDataQueryCodeExp(name="IMCONTENT",expression="t1.IMCONTENT")
        ,@DEDataQueryCodeExp(name="MAILGROUPSEND",expression="t1.MAILGROUPSEND")
        ,@DEDataQueryCodeExp(name="MSGTEMPLATEID",expression="t1.MSGTEMPLATEID")
        ,@DEDataQueryCodeExp(name="MSGTEMPLATENAME",expression="t1.MSGTEMPLATENAME")
        ,@DEDataQueryCodeExp(name="RESERVER",expression="t1.RESERVER")
        ,@DEDataQueryCodeExp(name="RESERVER2",expression="t1.RESERVER2")
        ,@DEDataQueryCodeExp(name="RESERVER3",expression="t1.RESERVER3")
        ,@DEDataQueryCodeExp(name="RESERVER4",expression="t1.RESERVER4")
        ,@DEDataQueryCodeExp(name="SMSCONTENT",expression="t1.SMSCONTENT")
        ,@DEDataQueryCodeExp(name="SRFSYSPUB",expression="t1.SRFSYSPUB")
        ,@DEDataQueryCodeExp(name="SRFUSERPUB",expression="t1.SRFUSERPUB")
        ,@DEDataQueryCodeExp(name="SUBJECT",expression="t1.SUBJECT")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
    },
    conds={
        @DEDataQueryCodeCond(condition="t1.ENABLE = 1")
    })
})
/**
 *  实体数据查询 [DEFAULT]模型基类
 */
public abstract class MsgTemplateDefaultDQModelBase extends net.ibizsys.paas.demodel.DEDataQueryModelBase {

    public MsgTemplateDefaultDQModelBase() {
        super();

        this.initAnnotation(MsgTemplateDefaultDQModelBase.class);
    }

}