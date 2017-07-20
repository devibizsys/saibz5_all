/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package net.ibizsys.psrt.srv.common.demodel.userdictitem.dataquery;



import net.ibizsys.paas.core.DEDataQuery;
import net.ibizsys.paas.core.DEDataQueryCodes;
import net.ibizsys.paas.core.DEDataQueryCode;
import net.ibizsys.paas.core.DEDataQueryCodeExp;
import net.ibizsys.paas.core.DEDataQueryCodeCond;

@DEDataQuery(id="CDBE4F4A-8854-4711-8F5A-5C4D20878891",name="DEFAULT")
@DEDataQueryCodes({
    @DEDataQueryCode(querycode="SELECT t1.CONTENT, t1.CREATEDATE, t1.CREATEMAN, t1.MARKFLAG, t1.MEMO, t1.RESERVER, t1.RESERVER2, t1.RESERVER3, t1.RESERVER4, t1.UPDATEDATE, t1.UPDATEMAN, t1.USERDICTCATID, t11.USERDICTCATNAME, t1.USERDICTID, t1.USERDICTITEMID, t1.USERDICTITEMNAME, t21.USERDICTNAME FROM T_SRFUSERDICTITEM t1  LEFT JOIN T_SRFUSERDICTCAT t11 ON t1.USERDICTCATID = t11.USERDICTCATID  LEFT JOIN T_SRFUSERDICT t21 ON t1.USERDICTID = t21.USERDICTID ",querycodetemp="",declarecode="",dbtype="DB2",
    fieldexps={
        @DEDataQueryCodeExp(name="CONTENT",expression="t1.CONTENT")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="MARKFLAG",expression="t1.MARKFLAG")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="RESERVER",expression="t1.RESERVER")
        ,@DEDataQueryCodeExp(name="RESERVER2",expression="t1.RESERVER2")
        ,@DEDataQueryCodeExp(name="RESERVER3",expression="t1.RESERVER3")
        ,@DEDataQueryCodeExp(name="RESERVER4",expression="t1.RESERVER4")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="USERDICTCATID",expression="t1.USERDICTCATID")
        ,@DEDataQueryCodeExp(name="USERDICTCATNAME",expression="t11.USERDICTCATNAME")
        ,@DEDataQueryCodeExp(name="USERDICTID",expression="t1.USERDICTID")
        ,@DEDataQueryCodeExp(name="USERDICTITEMID",expression="t1.USERDICTITEMID")
        ,@DEDataQueryCodeExp(name="USERDICTITEMNAME",expression="t1.USERDICTITEMNAME")
        ,@DEDataQueryCodeExp(name="USERDICTNAME",expression="t21.USERDICTNAME")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.`CONTENT`, t1.`CREATEDATE`, t1.`CREATEMAN`, t1.`MARKFLAG`, t1.`MEMO`, t1.`RESERVER`, t1.`RESERVER2`, t1.`RESERVER3`, t1.`RESERVER4`, t1.`UPDATEDATE`, t1.`UPDATEMAN`, t1.`USERDICTCATID`, t11.`USERDICTCATNAME`, t1.`USERDICTID`, t1.`USERDICTITEMID`, t1.`USERDICTITEMNAME`, t21.`USERDICTNAME` FROM `T_SRFUSERDICTITEM` t1  LEFT JOIN T_SRFUSERDICTCAT t11 ON t1.USERDICTCATID = t11.USERDICTCATID  LEFT JOIN T_SRFUSERDICT t21 ON t1.USERDICTID = t21.USERDICTID ",querycodetemp="",declarecode="",dbtype="MYSQL5",
    fieldexps={
        @DEDataQueryCodeExp(name="CONTENT",expression="t1.`CONTENT`")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.`CREATEDATE`")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.`CREATEMAN`")
        ,@DEDataQueryCodeExp(name="MARKFLAG",expression="t1.`MARKFLAG`")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.`MEMO`")
        ,@DEDataQueryCodeExp(name="RESERVER",expression="t1.`RESERVER`")
        ,@DEDataQueryCodeExp(name="RESERVER2",expression="t1.`RESERVER2`")
        ,@DEDataQueryCodeExp(name="RESERVER3",expression="t1.`RESERVER3`")
        ,@DEDataQueryCodeExp(name="RESERVER4",expression="t1.`RESERVER4`")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.`UPDATEDATE`")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.`UPDATEMAN`")
        ,@DEDataQueryCodeExp(name="USERDICTCATID",expression="t1.`USERDICTCATID`")
        ,@DEDataQueryCodeExp(name="USERDICTCATNAME",expression="t11.`USERDICTCATNAME`")
        ,@DEDataQueryCodeExp(name="USERDICTID",expression="t1.`USERDICTID`")
        ,@DEDataQueryCodeExp(name="USERDICTITEMID",expression="t1.`USERDICTITEMID`")
        ,@DEDataQueryCodeExp(name="USERDICTITEMNAME",expression="t1.`USERDICTITEMNAME`")
        ,@DEDataQueryCodeExp(name="USERDICTNAME",expression="t21.`USERDICTNAME`")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CONTENT, t1.CREATEDATE, t1.CREATEMAN, t1.MARKFLAG, t1.MEMO, t1.RESERVER, t1.RESERVER2, t1.RESERVER3, t1.RESERVER4, t1.UPDATEDATE, t1.UPDATEMAN, t1.USERDICTCATID, t11.USERDICTCATNAME, t1.USERDICTID, t1.USERDICTITEMID, t1.USERDICTITEMNAME, t21.USERDICTNAME FROM T_SRFUSERDICTITEM t1  LEFT JOIN T_SRFUSERDICTCAT t11 ON t1.USERDICTCATID = t11.USERDICTCATID  LEFT JOIN T_SRFUSERDICT t21 ON t1.USERDICTID = t21.USERDICTID ",querycodetemp="",declarecode="",dbtype="ORACLE",
    fieldexps={
        @DEDataQueryCodeExp(name="CONTENT",expression="t1.CONTENT")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="MARKFLAG",expression="t1.MARKFLAG")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="RESERVER",expression="t1.RESERVER")
        ,@DEDataQueryCodeExp(name="RESERVER2",expression="t1.RESERVER2")
        ,@DEDataQueryCodeExp(name="RESERVER3",expression="t1.RESERVER3")
        ,@DEDataQueryCodeExp(name="RESERVER4",expression="t1.RESERVER4")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="USERDICTCATID",expression="t1.USERDICTCATID")
        ,@DEDataQueryCodeExp(name="USERDICTCATNAME",expression="t11.USERDICTCATNAME")
        ,@DEDataQueryCodeExp(name="USERDICTID",expression="t1.USERDICTID")
        ,@DEDataQueryCodeExp(name="USERDICTITEMID",expression="t1.USERDICTITEMID")
        ,@DEDataQueryCodeExp(name="USERDICTITEMNAME",expression="t1.USERDICTITEMNAME")
        ,@DEDataQueryCodeExp(name="USERDICTNAME",expression="t21.USERDICTNAME")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.[CONTENT], t1.[CREATEDATE], t1.[CREATEMAN], t1.[MARKFLAG], t1.[MEMO], t1.[RESERVER], t1.[RESERVER2], t1.[RESERVER3], t1.[RESERVER4], t1.[UPDATEDATE], t1.[UPDATEMAN], t1.[USERDICTCATID], t11.[USERDICTCATNAME], t1.[USERDICTID], t1.[USERDICTITEMID], t1.[USERDICTITEMNAME], t21.[USERDICTNAME] FROM [T_SRFUSERDICTITEM] t1  LEFT JOIN T_SRFUSERDICTCAT t11 ON t1.USERDICTCATID = t11.USERDICTCATID  LEFT JOIN T_SRFUSERDICT t21 ON t1.USERDICTID = t21.USERDICTID ",querycodetemp="",declarecode="",dbtype="SQLSERVER",
    fieldexps={
        @DEDataQueryCodeExp(name="CONTENT",expression="t1.[CONTENT]")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.[CREATEDATE]")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.[CREATEMAN]")
        ,@DEDataQueryCodeExp(name="MARKFLAG",expression="t1.[MARKFLAG]")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.[MEMO]")
        ,@DEDataQueryCodeExp(name="RESERVER",expression="t1.[RESERVER]")
        ,@DEDataQueryCodeExp(name="RESERVER2",expression="t1.[RESERVER2]")
        ,@DEDataQueryCodeExp(name="RESERVER3",expression="t1.[RESERVER3]")
        ,@DEDataQueryCodeExp(name="RESERVER4",expression="t1.[RESERVER4]")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.[UPDATEDATE]")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.[UPDATEMAN]")
        ,@DEDataQueryCodeExp(name="USERDICTCATID",expression="t1.[USERDICTCATID]")
        ,@DEDataQueryCodeExp(name="USERDICTCATNAME",expression="t11.[USERDICTCATNAME]")
        ,@DEDataQueryCodeExp(name="USERDICTID",expression="t1.[USERDICTID]")
        ,@DEDataQueryCodeExp(name="USERDICTITEMID",expression="t1.[USERDICTITEMID]")
        ,@DEDataQueryCodeExp(name="USERDICTITEMNAME",expression="t1.[USERDICTITEMNAME]")
        ,@DEDataQueryCodeExp(name="USERDICTNAME",expression="t21.[USERDICTNAME]")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CONTENT, t1.CREATEDATE, t1.CREATEMAN, t1.MARKFLAG, t1.MEMO, t1.RESERVER, t1.RESERVER2, t1.RESERVER3, t1.RESERVER4, t1.UPDATEDATE, t1.UPDATEMAN, t1.USERDICTCATID, t11.USERDICTCATNAME, t1.USERDICTID, t1.USERDICTITEMID, t1.USERDICTITEMNAME, t21.USERDICTNAME FROM T_SRFUSERDICTITEM t1  LEFT JOIN T_SRFUSERDICTCAT t11 ON t1.USERDICTCATID = t11.USERDICTCATID  LEFT JOIN T_SRFUSERDICT t21 ON t1.USERDICTID = t21.USERDICTID ",querycodetemp="",declarecode="",dbtype="POSTGRESQL",
    fieldexps={
        @DEDataQueryCodeExp(name="CONTENT",expression="t1.CONTENT")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="MARKFLAG",expression="t1.MARKFLAG")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="RESERVER",expression="t1.RESERVER")
        ,@DEDataQueryCodeExp(name="RESERVER2",expression="t1.RESERVER2")
        ,@DEDataQueryCodeExp(name="RESERVER3",expression="t1.RESERVER3")
        ,@DEDataQueryCodeExp(name="RESERVER4",expression="t1.RESERVER4")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="USERDICTCATID",expression="t1.USERDICTCATID")
        ,@DEDataQueryCodeExp(name="USERDICTCATNAME",expression="t11.USERDICTCATNAME")
        ,@DEDataQueryCodeExp(name="USERDICTID",expression="t1.USERDICTID")
        ,@DEDataQueryCodeExp(name="USERDICTITEMID",expression="t1.USERDICTITEMID")
        ,@DEDataQueryCodeExp(name="USERDICTITEMNAME",expression="t1.USERDICTITEMNAME")
        ,@DEDataQueryCodeExp(name="USERDICTNAME",expression="t21.USERDICTNAME")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CONTENT, t1.CREATEDATE, t1.CREATEMAN, t1.MARKFLAG, t1.MEMO, t1.RESERVER, t1.RESERVER2, t1.RESERVER3, t1.RESERVER4, t1.UPDATEDATE, t1.UPDATEMAN, t1.USERDICTCATID, t11.USERDICTCATNAME, t1.USERDICTID, t1.USERDICTITEMID, t1.USERDICTITEMNAME, t21.USERDICTNAME FROM T_SRFUSERDICTITEM t1  LEFT JOIN T_SRFUSERDICTCAT t11 ON t1.USERDICTCATID = t11.USERDICTCATID  LEFT JOIN T_SRFUSERDICT t21 ON t1.USERDICTID = t21.USERDICTID ",querycodetemp="",declarecode="",dbtype="PPAS",
    fieldexps={
        @DEDataQueryCodeExp(name="CONTENT",expression="t1.CONTENT")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="MARKFLAG",expression="t1.MARKFLAG")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="RESERVER",expression="t1.RESERVER")
        ,@DEDataQueryCodeExp(name="RESERVER2",expression="t1.RESERVER2")
        ,@DEDataQueryCodeExp(name="RESERVER3",expression="t1.RESERVER3")
        ,@DEDataQueryCodeExp(name="RESERVER4",expression="t1.RESERVER4")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="USERDICTCATID",expression="t1.USERDICTCATID")
        ,@DEDataQueryCodeExp(name="USERDICTCATNAME",expression="t11.USERDICTCATNAME")
        ,@DEDataQueryCodeExp(name="USERDICTID",expression="t1.USERDICTID")
        ,@DEDataQueryCodeExp(name="USERDICTITEMID",expression="t1.USERDICTITEMID")
        ,@DEDataQueryCodeExp(name="USERDICTITEMNAME",expression="t1.USERDICTITEMNAME")
        ,@DEDataQueryCodeExp(name="USERDICTNAME",expression="t21.USERDICTNAME")
    },
    conds={})
})
/**
 *  实体数据查询 [DEFAULT]模型基类
 */
public abstract class UserDictItemDefaultDQModelBase extends net.ibizsys.paas.demodel.DEDataQueryModelBase {

    public UserDictItemDefaultDQModelBase() {
        super();

        this.initAnnotation(UserDictItemDefaultDQModelBase.class);
    }

}