/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package net.ibizsys.psrt.srv.wf.demodel.wfusergroupdetail.dataquery;



import net.ibizsys.paas.core.DEDataQuery;
import net.ibizsys.paas.core.DEDataQueryCodes;
import net.ibizsys.paas.core.DEDataQueryCode;
import net.ibizsys.paas.core.DEDataQueryCodeExp;
import net.ibizsys.paas.core.DEDataQueryCodeCond;

@DEDataQuery(id="F42CBB37-C6B1-42C6-AE9E-7675648D338A",name="DEFAULT")
@DEDataQueryCodes({
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE, t1.CREATEMAN, t1.MEMO, t1.UPDATEDATE, t1.UPDATEMAN, t1.WFUSERGROUPDETAILID, t1.WFUSERGROUPDETAILNAME, t1.WFUSERGROUPID, t11.WFUSERGROUPNAME, t1.WFUSERID, t21.WFUSERNAME FROM T_SRFWFUSERGROUPDETAIL t1  LEFT JOIN T_SRFWFUSERGROUP t11 ON t1.WFUSERGROUPID = t11.WFUSERGROUPID  LEFT JOIN T_SRFWFUSER t21 ON t1.WFUSERID = t21.WFUSERID ",querycodetemp="",declarecode="",dbtype="DB2",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="WFUSERGROUPDETAILID",expression="t1.WFUSERGROUPDETAILID")
        ,@DEDataQueryCodeExp(name="WFUSERGROUPDETAILNAME",expression="t1.WFUSERGROUPDETAILNAME")
        ,@DEDataQueryCodeExp(name="WFUSERGROUPID",expression="t1.WFUSERGROUPID")
        ,@DEDataQueryCodeExp(name="WFUSERGROUPNAME",expression="t11.WFUSERGROUPNAME")
        ,@DEDataQueryCodeExp(name="WFUSERID",expression="t1.WFUSERID")
        ,@DEDataQueryCodeExp(name="WFUSERNAME",expression="t21.WFUSERNAME")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.`CREATEDATE`, t1.`CREATEMAN`, t1.`MEMO`, t1.`UPDATEDATE`, t1.`UPDATEMAN`, t1.`WFUSERGROUPDETAILID`, t1.`WFUSERGROUPDETAILNAME`, t1.`WFUSERGROUPID`, t11.`WFUSERGROUPNAME`, t1.`WFUSERID`, t21.`WFUSERNAME` FROM `T_SRFWFUSERGROUPDETAIL` t1  LEFT JOIN T_SRFWFUSERGROUP t11 ON t1.WFUSERGROUPID = t11.WFUSERGROUPID  LEFT JOIN T_SRFWFUSER t21 ON t1.WFUSERID = t21.WFUSERID ",querycodetemp="",declarecode="",dbtype="MYSQL5",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.`CREATEDATE`")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.`CREATEMAN`")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.`MEMO`")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.`UPDATEDATE`")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.`UPDATEMAN`")
        ,@DEDataQueryCodeExp(name="WFUSERGROUPDETAILID",expression="t1.`WFUSERGROUPDETAILID`")
        ,@DEDataQueryCodeExp(name="WFUSERGROUPDETAILNAME",expression="t1.`WFUSERGROUPDETAILNAME`")
        ,@DEDataQueryCodeExp(name="WFUSERGROUPID",expression="t1.`WFUSERGROUPID`")
        ,@DEDataQueryCodeExp(name="WFUSERGROUPNAME",expression="t11.`WFUSERGROUPNAME`")
        ,@DEDataQueryCodeExp(name="WFUSERID",expression="t1.`WFUSERID`")
        ,@DEDataQueryCodeExp(name="WFUSERNAME",expression="t21.`WFUSERNAME`")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE, t1.CREATEMAN, t1.MEMO, t1.UPDATEDATE, t1.UPDATEMAN, t1.WFUSERGROUPDETAILID, t1.WFUSERGROUPDETAILNAME, t1.WFUSERGROUPID, t11.WFUSERGROUPNAME, t1.WFUSERID, t21.WFUSERNAME FROM T_SRFWFUSERGROUPDETAIL t1  LEFT JOIN T_SRFWFUSERGROUP t11 ON t1.WFUSERGROUPID = t11.WFUSERGROUPID  LEFT JOIN T_SRFWFUSER t21 ON t1.WFUSERID = t21.WFUSERID ",querycodetemp="",declarecode="",dbtype="ORACLE",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="WFUSERGROUPDETAILID",expression="t1.WFUSERGROUPDETAILID")
        ,@DEDataQueryCodeExp(name="WFUSERGROUPDETAILNAME",expression="t1.WFUSERGROUPDETAILNAME")
        ,@DEDataQueryCodeExp(name="WFUSERGROUPID",expression="t1.WFUSERGROUPID")
        ,@DEDataQueryCodeExp(name="WFUSERGROUPNAME",expression="t11.WFUSERGROUPNAME")
        ,@DEDataQueryCodeExp(name="WFUSERID",expression="t1.WFUSERID")
        ,@DEDataQueryCodeExp(name="WFUSERNAME",expression="t21.WFUSERNAME")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.[CREATEDATE], t1.[CREATEMAN], t1.[MEMO], t1.[UPDATEDATE], t1.[UPDATEMAN], t1.[WFUSERGROUPDETAILID], t1.[WFUSERGROUPDETAILNAME], t1.[WFUSERGROUPID], t11.[WFUSERGROUPNAME], t1.[WFUSERID], t21.[WFUSERNAME] FROM [T_SRFWFUSERGROUPDETAIL] t1  LEFT JOIN T_SRFWFUSERGROUP t11 ON t1.WFUSERGROUPID = t11.WFUSERGROUPID  LEFT JOIN T_SRFWFUSER t21 ON t1.WFUSERID = t21.WFUSERID ",querycodetemp="",declarecode="",dbtype="SQLSERVER",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.[CREATEDATE]")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.[CREATEMAN]")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.[MEMO]")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.[UPDATEDATE]")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.[UPDATEMAN]")
        ,@DEDataQueryCodeExp(name="WFUSERGROUPDETAILID",expression="t1.[WFUSERGROUPDETAILID]")
        ,@DEDataQueryCodeExp(name="WFUSERGROUPDETAILNAME",expression="t1.[WFUSERGROUPDETAILNAME]")
        ,@DEDataQueryCodeExp(name="WFUSERGROUPID",expression="t1.[WFUSERGROUPID]")
        ,@DEDataQueryCodeExp(name="WFUSERGROUPNAME",expression="t11.[WFUSERGROUPNAME]")
        ,@DEDataQueryCodeExp(name="WFUSERID",expression="t1.[WFUSERID]")
        ,@DEDataQueryCodeExp(name="WFUSERNAME",expression="t21.[WFUSERNAME]")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE, t1.CREATEMAN, t1.MEMO, t1.UPDATEDATE, t1.UPDATEMAN, t1.WFUSERGROUPDETAILID, t1.WFUSERGROUPDETAILNAME, t1.WFUSERGROUPID, t11.WFUSERGROUPNAME, t1.WFUSERID, t21.WFUSERNAME FROM T_SRFWFUSERGROUPDETAIL t1  LEFT JOIN T_SRFWFUSERGROUP t11 ON t1.WFUSERGROUPID = t11.WFUSERGROUPID  LEFT JOIN T_SRFWFUSER t21 ON t1.WFUSERID = t21.WFUSERID ",querycodetemp="",declarecode="",dbtype="POSTGRESQL",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="WFUSERGROUPDETAILID",expression="t1.WFUSERGROUPDETAILID")
        ,@DEDataQueryCodeExp(name="WFUSERGROUPDETAILNAME",expression="t1.WFUSERGROUPDETAILNAME")
        ,@DEDataQueryCodeExp(name="WFUSERGROUPID",expression="t1.WFUSERGROUPID")
        ,@DEDataQueryCodeExp(name="WFUSERGROUPNAME",expression="t11.WFUSERGROUPNAME")
        ,@DEDataQueryCodeExp(name="WFUSERID",expression="t1.WFUSERID")
        ,@DEDataQueryCodeExp(name="WFUSERNAME",expression="t21.WFUSERNAME")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE, t1.CREATEMAN, t1.MEMO, t1.UPDATEDATE, t1.UPDATEMAN, t1.WFUSERGROUPDETAILID, t1.WFUSERGROUPDETAILNAME, t1.WFUSERGROUPID, t11.WFUSERGROUPNAME, t1.WFUSERID, t21.WFUSERNAME FROM T_SRFWFUSERGROUPDETAIL t1  LEFT JOIN T_SRFWFUSERGROUP t11 ON t1.WFUSERGROUPID = t11.WFUSERGROUPID  LEFT JOIN T_SRFWFUSER t21 ON t1.WFUSERID = t21.WFUSERID ",querycodetemp="",declarecode="",dbtype="PPAS",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="WFUSERGROUPDETAILID",expression="t1.WFUSERGROUPDETAILID")
        ,@DEDataQueryCodeExp(name="WFUSERGROUPDETAILNAME",expression="t1.WFUSERGROUPDETAILNAME")
        ,@DEDataQueryCodeExp(name="WFUSERGROUPID",expression="t1.WFUSERGROUPID")
        ,@DEDataQueryCodeExp(name="WFUSERGROUPNAME",expression="t11.WFUSERGROUPNAME")
        ,@DEDataQueryCodeExp(name="WFUSERID",expression="t1.WFUSERID")
        ,@DEDataQueryCodeExp(name="WFUSERNAME",expression="t21.WFUSERNAME")
    },
    conds={})
})
/**
 *  实体数据查询 [DEFAULT]模型基类
 */
public abstract class WFUserGroupDetailDefaultDQModelBase extends net.ibizsys.paas.demodel.DEDataQueryModelBase {

    public WFUserGroupDetailDefaultDQModelBase() {
        super();

        this.initAnnotation(WFUserGroupDetailDefaultDQModelBase.class);
    }

}