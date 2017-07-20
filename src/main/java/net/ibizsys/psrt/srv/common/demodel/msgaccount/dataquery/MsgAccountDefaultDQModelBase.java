/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package net.ibizsys.psrt.srv.common.demodel.msgaccount.dataquery;



import net.ibizsys.paas.core.DEDataQuery;
import net.ibizsys.paas.core.DEDataQueryCodes;
import net.ibizsys.paas.core.DEDataQueryCode;
import net.ibizsys.paas.core.DEDataQueryCodeExp;
import net.ibizsys.paas.core.DEDataQueryCodeCond;

@DEDataQuery(id="B62E6807-6EBA-4D27-A5CB-ACA8E4987130",name="DEFAULT")
@DEDataQueryCodes({
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE, t1.CREATEMAN, t1.ENABLE, t1.ISLIST, t1.MAILADDRESS, t1.MOBILE, t1.MSGACCOUNTID, t1.MSGACCOUNTNAME, t1.MSGADDRESS, t1.MSNEMAIL, t1.RESERVER, t1.RESERVER2, t1.RESERVER3, t1.RESERVER4, t1.UPDATEDATE, t1.UPDATEMAN, t1.WECHARADDR, t1.WXADDR FROM T_SRFMSGACCOUNT t1 ",querycodetemp="",declarecode="",dbtype="DB2",
    fieldexps={
        @DEDataQueryCodeExp(name="FOLDERMODEL",expression="t1.FOLDERMODEL")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="ENABLE",expression="t1.ENABLE")
        ,@DEDataQueryCodeExp(name="ISLIST",expression="t1.ISLIST")
        ,@DEDataQueryCodeExp(name="MAILADDRESS",expression="t1.MAILADDRESS")
        ,@DEDataQueryCodeExp(name="MOBILE",expression="t1.MOBILE")
        ,@DEDataQueryCodeExp(name="MSGACCOUNTID",expression="t1.MSGACCOUNTID")
        ,@DEDataQueryCodeExp(name="MSGACCOUNTNAME",expression="t1.MSGACCOUNTNAME")
        ,@DEDataQueryCodeExp(name="MSGADDRESS",expression="t1.MSGADDRESS")
        ,@DEDataQueryCodeExp(name="MSNEMAIL",expression="t1.MSNEMAIL")
        ,@DEDataQueryCodeExp(name="RESERVER",expression="t1.RESERVER")
        ,@DEDataQueryCodeExp(name="RESERVER2",expression="t1.RESERVER2")
        ,@DEDataQueryCodeExp(name="RESERVER3",expression="t1.RESERVER3")
        ,@DEDataQueryCodeExp(name="RESERVER4",expression="t1.RESERVER4")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="WECHARADDR",expression="t1.WECHARADDR")
        ,@DEDataQueryCodeExp(name="WXADDR",expression="t1.WXADDR")
    },
    conds={
        @DEDataQueryCodeCond(condition="t1.ENABLE = 1")
    }),
    @DEDataQueryCode(querycode="SELECT t1.`CREATEDATE`, t1.`CREATEMAN`, t1.`ENABLE`, t1.`ISLIST`, t1.`MAILADDRESS`, t1.`MOBILE`, t1.`MSGACCOUNTID`, t1.`MSGACCOUNTNAME`, t1.`MSGADDRESS`, t1.`MSNEMAIL`, t1.`RESERVER`, t1.`RESERVER2`, t1.`RESERVER3`, t1.`RESERVER4`, t1.`UPDATEDATE`, t1.`UPDATEMAN`, t1.`WECHARADDR`, t1.`WXADDR` FROM `T_SRFMSGACCOUNT` t1 ",querycodetemp="",declarecode="",dbtype="MYSQL5",
    fieldexps={
        @DEDataQueryCodeExp(name="FOLDERMODEL",expression="t1.`FOLDERMODEL`")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.`CREATEDATE`")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.`CREATEMAN`")
        ,@DEDataQueryCodeExp(name="ENABLE",expression="t1.`ENABLE`")
        ,@DEDataQueryCodeExp(name="ISLIST",expression="t1.`ISLIST`")
        ,@DEDataQueryCodeExp(name="MAILADDRESS",expression="t1.`MAILADDRESS`")
        ,@DEDataQueryCodeExp(name="MOBILE",expression="t1.`MOBILE`")
        ,@DEDataQueryCodeExp(name="MSGACCOUNTID",expression="t1.`MSGACCOUNTID`")
        ,@DEDataQueryCodeExp(name="MSGACCOUNTNAME",expression="t1.`MSGACCOUNTNAME`")
        ,@DEDataQueryCodeExp(name="MSGADDRESS",expression="t1.`MSGADDRESS`")
        ,@DEDataQueryCodeExp(name="MSNEMAIL",expression="t1.`MSNEMAIL`")
        ,@DEDataQueryCodeExp(name="RESERVER",expression="t1.`RESERVER`")
        ,@DEDataQueryCodeExp(name="RESERVER2",expression="t1.`RESERVER2`")
        ,@DEDataQueryCodeExp(name="RESERVER3",expression="t1.`RESERVER3`")
        ,@DEDataQueryCodeExp(name="RESERVER4",expression="t1.`RESERVER4`")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.`UPDATEDATE`")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.`UPDATEMAN`")
        ,@DEDataQueryCodeExp(name="WECHARADDR",expression="t1.`WECHARADDR`")
        ,@DEDataQueryCodeExp(name="WXADDR",expression="t1.`WXADDR`")
    },
    conds={
        @DEDataQueryCodeCond(condition="t1.ENABLE = 1")
    }),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE, t1.CREATEMAN, t1.ENABLE, t1.ISLIST, t1.MAILADDRESS, t1.MOBILE, t1.MSGACCOUNTID, t1.MSGACCOUNTNAME, t1.MSGADDRESS, t1.MSNEMAIL, t1.RESERVER, t1.RESERVER2, t1.RESERVER3, t1.RESERVER4, t1.UPDATEDATE, t1.UPDATEMAN, t1.WECHARADDR, t1.WXADDR FROM T_SRFMSGACCOUNT t1 ",querycodetemp="",declarecode="",dbtype="ORACLE",
    fieldexps={
        @DEDataQueryCodeExp(name="FOLDERMODEL",expression="t1.FOLDERMODEL")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="ENABLE",expression="t1.ENABLE")
        ,@DEDataQueryCodeExp(name="ISLIST",expression="t1.ISLIST")
        ,@DEDataQueryCodeExp(name="MAILADDRESS",expression="t1.MAILADDRESS")
        ,@DEDataQueryCodeExp(name="MOBILE",expression="t1.MOBILE")
        ,@DEDataQueryCodeExp(name="MSGACCOUNTID",expression="t1.MSGACCOUNTID")
        ,@DEDataQueryCodeExp(name="MSGACCOUNTNAME",expression="t1.MSGACCOUNTNAME")
        ,@DEDataQueryCodeExp(name="MSGADDRESS",expression="t1.MSGADDRESS")
        ,@DEDataQueryCodeExp(name="MSNEMAIL",expression="t1.MSNEMAIL")
        ,@DEDataQueryCodeExp(name="RESERVER",expression="t1.RESERVER")
        ,@DEDataQueryCodeExp(name="RESERVER2",expression="t1.RESERVER2")
        ,@DEDataQueryCodeExp(name="RESERVER3",expression="t1.RESERVER3")
        ,@DEDataQueryCodeExp(name="RESERVER4",expression="t1.RESERVER4")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="WECHARADDR",expression="t1.WECHARADDR")
        ,@DEDataQueryCodeExp(name="WXADDR",expression="t1.WXADDR")
    },
    conds={
        @DEDataQueryCodeCond(condition="t1.ENABLE = 1")
    }),
    @DEDataQueryCode(querycode="SELECT t1.[CREATEDATE], t1.[CREATEMAN], t1.[ENABLE], t1.[ISLIST], t1.[MAILADDRESS], t1.[MOBILE], t1.[MSGACCOUNTID], t1.[MSGACCOUNTNAME], t1.[MSGADDRESS], t1.[MSNEMAIL], t1.[RESERVER], t1.[RESERVER2], t1.[RESERVER3], t1.[RESERVER4], t1.[UPDATEDATE], t1.[UPDATEMAN], t1.[WECHARADDR], t1.[WXADDR] FROM [T_SRFMSGACCOUNT] t1 ",querycodetemp="",declarecode="",dbtype="SQLSERVER",
    fieldexps={
        @DEDataQueryCodeExp(name="FOLDERMODEL",expression="t1.[FOLDERMODEL]")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.[CREATEDATE]")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.[CREATEMAN]")
        ,@DEDataQueryCodeExp(name="ENABLE",expression="t1.[ENABLE]")
        ,@DEDataQueryCodeExp(name="ISLIST",expression="t1.[ISLIST]")
        ,@DEDataQueryCodeExp(name="MAILADDRESS",expression="t1.[MAILADDRESS]")
        ,@DEDataQueryCodeExp(name="MOBILE",expression="t1.[MOBILE]")
        ,@DEDataQueryCodeExp(name="MSGACCOUNTID",expression="t1.[MSGACCOUNTID]")
        ,@DEDataQueryCodeExp(name="MSGACCOUNTNAME",expression="t1.[MSGACCOUNTNAME]")
        ,@DEDataQueryCodeExp(name="MSGADDRESS",expression="t1.[MSGADDRESS]")
        ,@DEDataQueryCodeExp(name="MSNEMAIL",expression="t1.[MSNEMAIL]")
        ,@DEDataQueryCodeExp(name="RESERVER",expression="t1.[RESERVER]")
        ,@DEDataQueryCodeExp(name="RESERVER2",expression="t1.[RESERVER2]")
        ,@DEDataQueryCodeExp(name="RESERVER3",expression="t1.[RESERVER3]")
        ,@DEDataQueryCodeExp(name="RESERVER4",expression="t1.[RESERVER4]")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.[UPDATEDATE]")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.[UPDATEMAN]")
        ,@DEDataQueryCodeExp(name="WECHARADDR",expression="t1.[WECHARADDR]")
        ,@DEDataQueryCodeExp(name="WXADDR",expression="t1.[WXADDR]")
    },
    conds={
        @DEDataQueryCodeCond(condition="t1.ENABLE = 1")
    }),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE, t1.CREATEMAN, t1.ENABLE, t1.ISLIST, t1.MAILADDRESS, t1.MOBILE, t1.MSGACCOUNTID, t1.MSGACCOUNTNAME, t1.MSGADDRESS, t1.MSNEMAIL, t1.RESERVER, t1.RESERVER2, t1.RESERVER3, t1.RESERVER4, t1.UPDATEDATE, t1.UPDATEMAN, t1.WECHARADDR, t1.WXADDR FROM T_SRFMSGACCOUNT t1 ",querycodetemp="",declarecode="",dbtype="POSTGRESQL",
    fieldexps={
        @DEDataQueryCodeExp(name="FOLDERMODEL",expression="t1.FOLDERMODEL")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="ENABLE",expression="t1.ENABLE")
        ,@DEDataQueryCodeExp(name="ISLIST",expression="t1.ISLIST")
        ,@DEDataQueryCodeExp(name="MAILADDRESS",expression="t1.MAILADDRESS")
        ,@DEDataQueryCodeExp(name="MOBILE",expression="t1.MOBILE")
        ,@DEDataQueryCodeExp(name="MSGACCOUNTID",expression="t1.MSGACCOUNTID")
        ,@DEDataQueryCodeExp(name="MSGACCOUNTNAME",expression="t1.MSGACCOUNTNAME")
        ,@DEDataQueryCodeExp(name="MSGADDRESS",expression="t1.MSGADDRESS")
        ,@DEDataQueryCodeExp(name="MSNEMAIL",expression="t1.MSNEMAIL")
        ,@DEDataQueryCodeExp(name="RESERVER",expression="t1.RESERVER")
        ,@DEDataQueryCodeExp(name="RESERVER2",expression="t1.RESERVER2")
        ,@DEDataQueryCodeExp(name="RESERVER3",expression="t1.RESERVER3")
        ,@DEDataQueryCodeExp(name="RESERVER4",expression="t1.RESERVER4")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="WECHARADDR",expression="t1.WECHARADDR")
        ,@DEDataQueryCodeExp(name="WXADDR",expression="t1.WXADDR")
    },
    conds={
        @DEDataQueryCodeCond(condition="t1.ENABLE = 1")
    }),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE, t1.CREATEMAN, t1.ENABLE, t1.ISLIST, t1.MAILADDRESS, t1.MOBILE, t1.MSGACCOUNTID, t1.MSGACCOUNTNAME, t1.MSGADDRESS, t1.MSNEMAIL, t1.RESERVER, t1.RESERVER2, t1.RESERVER3, t1.RESERVER4, t1.UPDATEDATE, t1.UPDATEMAN, t1.WECHARADDR, t1.WXADDR FROM T_SRFMSGACCOUNT t1 ",querycodetemp="",declarecode="",dbtype="PPAS",
    fieldexps={
        @DEDataQueryCodeExp(name="FOLDERMODEL",expression="t1.FOLDERMODEL")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="ENABLE",expression="t1.ENABLE")
        ,@DEDataQueryCodeExp(name="ISLIST",expression="t1.ISLIST")
        ,@DEDataQueryCodeExp(name="MAILADDRESS",expression="t1.MAILADDRESS")
        ,@DEDataQueryCodeExp(name="MOBILE",expression="t1.MOBILE")
        ,@DEDataQueryCodeExp(name="MSGACCOUNTID",expression="t1.MSGACCOUNTID")
        ,@DEDataQueryCodeExp(name="MSGACCOUNTNAME",expression="t1.MSGACCOUNTNAME")
        ,@DEDataQueryCodeExp(name="MSGADDRESS",expression="t1.MSGADDRESS")
        ,@DEDataQueryCodeExp(name="MSNEMAIL",expression="t1.MSNEMAIL")
        ,@DEDataQueryCodeExp(name="RESERVER",expression="t1.RESERVER")
        ,@DEDataQueryCodeExp(name="RESERVER2",expression="t1.RESERVER2")
        ,@DEDataQueryCodeExp(name="RESERVER3",expression="t1.RESERVER3")
        ,@DEDataQueryCodeExp(name="RESERVER4",expression="t1.RESERVER4")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="WECHARADDR",expression="t1.WECHARADDR")
        ,@DEDataQueryCodeExp(name="WXADDR",expression="t1.WXADDR")
    },
    conds={
        @DEDataQueryCodeCond(condition="t1.ENABLE = 1")
    })
})
/**
 *  实体数据查询 [DEFAULT]模型基类
 */
public abstract class MsgAccountDefaultDQModelBase extends net.ibizsys.paas.demodel.DEDataQueryModelBase {

    public MsgAccountDefaultDQModelBase() {
        super();

        this.initAnnotation(MsgAccountDefaultDQModelBase.class);
    }

}