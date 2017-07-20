/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package net.ibizsys.psrt.srv.common.demodel.msgaccountdetail.dataquery;



import net.ibizsys.paas.core.DEDataQuery;
import net.ibizsys.paas.core.DEDataQueryCodes;
import net.ibizsys.paas.core.DEDataQueryCode;
import net.ibizsys.paas.core.DEDataQueryCodeExp;
import net.ibizsys.paas.core.DEDataQueryCodeCond;

@DEDataQuery(id="BBEB9F49-775E-43A2-A019-B588F9A9CAE4",name="DEFAULT")
@DEDataQueryCodes({
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE, t1.CREATEMAN, t1.MAJORMSGACCOUNTID, t11.MSGACCOUNTNAME AS MAJORMSGACCOUNTNAME, t1.MINORMSGACCOUNTID, t21.MSGACCOUNTNAME AS MINORMSGACCOUNTNAME, t1.MSGACCOUNTDETAILID, t1.MSGACCOUNTDETAILNAME, t1.UPDATEDATE, t1.UPDATEMAN FROM T_SRFMSGACCOUNTDETAIL t1  LEFT JOIN T_SRFMSGACCOUNT t11 ON t1.MAJORMSGACCOUNTID = t11.MSGACCOUNTID  LEFT JOIN T_SRFMSGACCOUNT t21 ON t1.MINORMSGACCOUNTID = t21.MSGACCOUNTID ",querycodetemp="",declarecode="",dbtype="DB2",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="MAJORMSGACCOUNTID",expression="t1.MAJORMSGACCOUNTID")
        ,@DEDataQueryCodeExp(name="MAJORMSGACCOUNTNAME",expression="t11.MSGACCOUNTNAME")
        ,@DEDataQueryCodeExp(name="MINORMSGACCOUNTID",expression="t1.MINORMSGACCOUNTID")
        ,@DEDataQueryCodeExp(name="MINORMSGACCOUNTNAME",expression="t21.MSGACCOUNTNAME")
        ,@DEDataQueryCodeExp(name="MSGACCOUNTDETAILID",expression="t1.MSGACCOUNTDETAILID")
        ,@DEDataQueryCodeExp(name="MSGACCOUNTDETAILNAME",expression="t1.MSGACCOUNTDETAILNAME")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.`CREATEDATE`, t1.`CREATEMAN`, t1.`MAJORMSGACCOUNTID`, t11.`MSGACCOUNTNAME` AS `MAJORMSGACCOUNTNAME`, t1.`MINORMSGACCOUNTID`, t21.`MSGACCOUNTNAME` AS `MINORMSGACCOUNTNAME`, t1.`MSGACCOUNTDETAILID`, t1.`MSGACCOUNTDETAILNAME`, t1.`UPDATEDATE`, t1.`UPDATEMAN` FROM `T_SRFMSGACCOUNTDETAIL` t1  LEFT JOIN T_SRFMSGACCOUNT t11 ON t1.MAJORMSGACCOUNTID = t11.MSGACCOUNTID  LEFT JOIN T_SRFMSGACCOUNT t21 ON t1.MINORMSGACCOUNTID = t21.MSGACCOUNTID ",querycodetemp="",declarecode="",dbtype="MYSQL5",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.`CREATEDATE`")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.`CREATEMAN`")
        ,@DEDataQueryCodeExp(name="MAJORMSGACCOUNTID",expression="t1.`MAJORMSGACCOUNTID`")
        ,@DEDataQueryCodeExp(name="MAJORMSGACCOUNTNAME",expression="t11.`MSGACCOUNTNAME`")
        ,@DEDataQueryCodeExp(name="MINORMSGACCOUNTID",expression="t1.`MINORMSGACCOUNTID`")
        ,@DEDataQueryCodeExp(name="MINORMSGACCOUNTNAME",expression="t21.`MSGACCOUNTNAME`")
        ,@DEDataQueryCodeExp(name="MSGACCOUNTDETAILID",expression="t1.`MSGACCOUNTDETAILID`")
        ,@DEDataQueryCodeExp(name="MSGACCOUNTDETAILNAME",expression="t1.`MSGACCOUNTDETAILNAME`")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.`UPDATEDATE`")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.`UPDATEMAN`")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE, t1.CREATEMAN, t1.MAJORMSGACCOUNTID, t11.MSGACCOUNTNAME AS MAJORMSGACCOUNTNAME, t1.MINORMSGACCOUNTID, t21.MSGACCOUNTNAME AS MINORMSGACCOUNTNAME, t1.MSGACCOUNTDETAILID, t1.MSGACCOUNTDETAILNAME, t1.UPDATEDATE, t1.UPDATEMAN FROM T_SRFMSGACCOUNTDETAIL t1  LEFT JOIN T_SRFMSGACCOUNT t11 ON t1.MAJORMSGACCOUNTID = t11.MSGACCOUNTID  LEFT JOIN T_SRFMSGACCOUNT t21 ON t1.MINORMSGACCOUNTID = t21.MSGACCOUNTID ",querycodetemp="",declarecode="",dbtype="ORACLE",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="MAJORMSGACCOUNTID",expression="t1.MAJORMSGACCOUNTID")
        ,@DEDataQueryCodeExp(name="MAJORMSGACCOUNTNAME",expression="t11.MSGACCOUNTNAME")
        ,@DEDataQueryCodeExp(name="MINORMSGACCOUNTID",expression="t1.MINORMSGACCOUNTID")
        ,@DEDataQueryCodeExp(name="MINORMSGACCOUNTNAME",expression="t21.MSGACCOUNTNAME")
        ,@DEDataQueryCodeExp(name="MSGACCOUNTDETAILID",expression="t1.MSGACCOUNTDETAILID")
        ,@DEDataQueryCodeExp(name="MSGACCOUNTDETAILNAME",expression="t1.MSGACCOUNTDETAILNAME")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.[CREATEDATE], t1.[CREATEMAN], t1.[MAJORMSGACCOUNTID], t11.[MSGACCOUNTNAME] AS [MAJORMSGACCOUNTNAME], t1.[MINORMSGACCOUNTID], t21.[MSGACCOUNTNAME] AS [MINORMSGACCOUNTNAME], t1.[MSGACCOUNTDETAILID], t1.[MSGACCOUNTDETAILNAME], t1.[UPDATEDATE], t1.[UPDATEMAN] FROM [T_SRFMSGACCOUNTDETAIL] t1  LEFT JOIN T_SRFMSGACCOUNT t11 ON t1.MAJORMSGACCOUNTID = t11.MSGACCOUNTID  LEFT JOIN T_SRFMSGACCOUNT t21 ON t1.MINORMSGACCOUNTID = t21.MSGACCOUNTID ",querycodetemp="",declarecode="",dbtype="SQLSERVER",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.[CREATEDATE]")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.[CREATEMAN]")
        ,@DEDataQueryCodeExp(name="MAJORMSGACCOUNTID",expression="t1.[MAJORMSGACCOUNTID]")
        ,@DEDataQueryCodeExp(name="MAJORMSGACCOUNTNAME",expression="t11.[MSGACCOUNTNAME]")
        ,@DEDataQueryCodeExp(name="MINORMSGACCOUNTID",expression="t1.[MINORMSGACCOUNTID]")
        ,@DEDataQueryCodeExp(name="MINORMSGACCOUNTNAME",expression="t21.[MSGACCOUNTNAME]")
        ,@DEDataQueryCodeExp(name="MSGACCOUNTDETAILID",expression="t1.[MSGACCOUNTDETAILID]")
        ,@DEDataQueryCodeExp(name="MSGACCOUNTDETAILNAME",expression="t1.[MSGACCOUNTDETAILNAME]")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.[UPDATEDATE]")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.[UPDATEMAN]")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE, t1.CREATEMAN, t1.MAJORMSGACCOUNTID, t11.MSGACCOUNTNAME AS MAJORMSGACCOUNTNAME, t1.MINORMSGACCOUNTID, t21.MSGACCOUNTNAME AS MINORMSGACCOUNTNAME, t1.MSGACCOUNTDETAILID, t1.MSGACCOUNTDETAILNAME, t1.UPDATEDATE, t1.UPDATEMAN FROM T_SRFMSGACCOUNTDETAIL t1  LEFT JOIN T_SRFMSGACCOUNT t11 ON t1.MAJORMSGACCOUNTID = t11.MSGACCOUNTID  LEFT JOIN T_SRFMSGACCOUNT t21 ON t1.MINORMSGACCOUNTID = t21.MSGACCOUNTID ",querycodetemp="",declarecode="",dbtype="POSTGRESQL",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="MAJORMSGACCOUNTID",expression="t1.MAJORMSGACCOUNTID")
        ,@DEDataQueryCodeExp(name="MAJORMSGACCOUNTNAME",expression="t11.MSGACCOUNTNAME")
        ,@DEDataQueryCodeExp(name="MINORMSGACCOUNTID",expression="t1.MINORMSGACCOUNTID")
        ,@DEDataQueryCodeExp(name="MINORMSGACCOUNTNAME",expression="t21.MSGACCOUNTNAME")
        ,@DEDataQueryCodeExp(name="MSGACCOUNTDETAILID",expression="t1.MSGACCOUNTDETAILID")
        ,@DEDataQueryCodeExp(name="MSGACCOUNTDETAILNAME",expression="t1.MSGACCOUNTDETAILNAME")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE, t1.CREATEMAN, t1.MAJORMSGACCOUNTID, t11.MSGACCOUNTNAME AS MAJORMSGACCOUNTNAME, t1.MINORMSGACCOUNTID, t21.MSGACCOUNTNAME AS MINORMSGACCOUNTNAME, t1.MSGACCOUNTDETAILID, t1.MSGACCOUNTDETAILNAME, t1.UPDATEDATE, t1.UPDATEMAN FROM T_SRFMSGACCOUNTDETAIL t1  LEFT JOIN T_SRFMSGACCOUNT t11 ON t1.MAJORMSGACCOUNTID = t11.MSGACCOUNTID  LEFT JOIN T_SRFMSGACCOUNT t21 ON t1.MINORMSGACCOUNTID = t21.MSGACCOUNTID ",querycodetemp="",declarecode="",dbtype="PPAS",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="MAJORMSGACCOUNTID",expression="t1.MAJORMSGACCOUNTID")
        ,@DEDataQueryCodeExp(name="MAJORMSGACCOUNTNAME",expression="t11.MSGACCOUNTNAME")
        ,@DEDataQueryCodeExp(name="MINORMSGACCOUNTID",expression="t1.MINORMSGACCOUNTID")
        ,@DEDataQueryCodeExp(name="MINORMSGACCOUNTNAME",expression="t21.MSGACCOUNTNAME")
        ,@DEDataQueryCodeExp(name="MSGACCOUNTDETAILID",expression="t1.MSGACCOUNTDETAILID")
        ,@DEDataQueryCodeExp(name="MSGACCOUNTDETAILNAME",expression="t1.MSGACCOUNTDETAILNAME")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
    },
    conds={})
})
/**
 *  实体数据查询 [DEFAULT]模型基类
 */
public abstract class MsgAccountDetailDefaultDQModelBase extends net.ibizsys.paas.demodel.DEDataQueryModelBase {

    public MsgAccountDetailDefaultDQModelBase() {
        super();

        this.initAnnotation(MsgAccountDetailDefaultDQModelBase.class);
    }

}