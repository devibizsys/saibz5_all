/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package net.ibizsys.psrt.srv.wx.demodel.wxorgsector.dataquery;



import net.ibizsys.paas.core.DEDataQuery;
import net.ibizsys.paas.core.DEDataQueryCodes;
import net.ibizsys.paas.core.DEDataQueryCode;
import net.ibizsys.paas.core.DEDataQueryCodeExp;
import net.ibizsys.paas.core.DEDataQueryCodeCond;

@DEDataQuery(id="6E8FF7D3-FD25-43A7-92C0-000AD52828BC",name="DEFAULT")
@DEDataQueryCodes({
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE, t1.CREATEMAN, t1.DEPTID, t1.MEMO, t1.ORGSECTORID, t11.ORGSECTORNAME, t1.RESERVER, t1.RESERVER2, t1.RESERVER3, t1.RESERVER4, t1.UPDATEDATE, t1.UPDATEMAN, t1.WXACCOUNTID, t1.WXACCOUNTNAME, t1.WXORGSECTORID, t1.WXORGSECTORNAME FROM T_SRFWXORGSECTOR t1  LEFT JOIN T_SRFORGSECTOR t11 ON t1.ORGSECTORID = t11.ORGSECTORID ",querycodetemp="",declarecode="",dbtype="DB2",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="DEPTID",expression="t1.DEPTID")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="ORGSECTORID",expression="t1.ORGSECTORID")
        ,@DEDataQueryCodeExp(name="ORGSECTORNAME",expression="t11.ORGSECTORNAME")
        ,@DEDataQueryCodeExp(name="RESERVER",expression="t1.RESERVER")
        ,@DEDataQueryCodeExp(name="RESERVER2",expression="t1.RESERVER2")
        ,@DEDataQueryCodeExp(name="RESERVER3",expression="t1.RESERVER3")
        ,@DEDataQueryCodeExp(name="RESERVER4",expression="t1.RESERVER4")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="WXACCOUNTID",expression="t1.WXACCOUNTID")
        ,@DEDataQueryCodeExp(name="WXACCOUNTNAME",expression="t1.WXACCOUNTNAME")
        ,@DEDataQueryCodeExp(name="WXORGSECTORID",expression="t1.WXORGSECTORID")
        ,@DEDataQueryCodeExp(name="WXORGSECTORNAME",expression="t1.WXORGSECTORNAME")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.`CREATEDATE`, t1.`CREATEMAN`, t1.`DEPTID`, t1.`MEMO`, t1.`ORGSECTORID`, t11.`ORGSECTORNAME`, t1.`RESERVER`, t1.`RESERVER2`, t1.`RESERVER3`, t1.`RESERVER4`, t1.`UPDATEDATE`, t1.`UPDATEMAN`, t1.`WXACCOUNTID`, t1.`WXACCOUNTNAME`, t1.`WXORGSECTORID`, t1.`WXORGSECTORNAME` FROM `T_SRFWXORGSECTOR` t1  LEFT JOIN T_SRFORGSECTOR t11 ON t1.ORGSECTORID = t11.ORGSECTORID ",querycodetemp="",declarecode="",dbtype="MYSQL5",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.`CREATEDATE`")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.`CREATEMAN`")
        ,@DEDataQueryCodeExp(name="DEPTID",expression="t1.`DEPTID`")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.`MEMO`")
        ,@DEDataQueryCodeExp(name="ORGSECTORID",expression="t1.`ORGSECTORID`")
        ,@DEDataQueryCodeExp(name="ORGSECTORNAME",expression="t11.`ORGSECTORNAME`")
        ,@DEDataQueryCodeExp(name="RESERVER",expression="t1.`RESERVER`")
        ,@DEDataQueryCodeExp(name="RESERVER2",expression="t1.`RESERVER2`")
        ,@DEDataQueryCodeExp(name="RESERVER3",expression="t1.`RESERVER3`")
        ,@DEDataQueryCodeExp(name="RESERVER4",expression="t1.`RESERVER4`")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.`UPDATEDATE`")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.`UPDATEMAN`")
        ,@DEDataQueryCodeExp(name="WXACCOUNTID",expression="t1.`WXACCOUNTID`")
        ,@DEDataQueryCodeExp(name="WXACCOUNTNAME",expression="t1.`WXACCOUNTNAME`")
        ,@DEDataQueryCodeExp(name="WXORGSECTORID",expression="t1.`WXORGSECTORID`")
        ,@DEDataQueryCodeExp(name="WXORGSECTORNAME",expression="t1.`WXORGSECTORNAME`")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE, t1.CREATEMAN, t1.DEPTID, t1.MEMO, t1.ORGSECTORID, t11.ORGSECTORNAME, t1.RESERVER, t1.RESERVER2, t1.RESERVER3, t1.RESERVER4, t1.UPDATEDATE, t1.UPDATEMAN, t1.WXACCOUNTID, t1.WXACCOUNTNAME, t1.WXORGSECTORID, t1.WXORGSECTORNAME FROM T_SRFWXORGSECTOR t1  LEFT JOIN T_SRFORGSECTOR t11 ON t1.ORGSECTORID = t11.ORGSECTORID ",querycodetemp="",declarecode="",dbtype="ORACLE",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="DEPTID",expression="t1.DEPTID")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="ORGSECTORID",expression="t1.ORGSECTORID")
        ,@DEDataQueryCodeExp(name="ORGSECTORNAME",expression="t11.ORGSECTORNAME")
        ,@DEDataQueryCodeExp(name="RESERVER",expression="t1.RESERVER")
        ,@DEDataQueryCodeExp(name="RESERVER2",expression="t1.RESERVER2")
        ,@DEDataQueryCodeExp(name="RESERVER3",expression="t1.RESERVER3")
        ,@DEDataQueryCodeExp(name="RESERVER4",expression="t1.RESERVER4")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="WXACCOUNTID",expression="t1.WXACCOUNTID")
        ,@DEDataQueryCodeExp(name="WXACCOUNTNAME",expression="t1.WXACCOUNTNAME")
        ,@DEDataQueryCodeExp(name="WXORGSECTORID",expression="t1.WXORGSECTORID")
        ,@DEDataQueryCodeExp(name="WXORGSECTORNAME",expression="t1.WXORGSECTORNAME")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE, t1.CREATEMAN, t1.DEPTID, t1.MEMO, t1.ORGSECTORID, t11.ORGSECTORNAME, t1.RESERVER, t1.RESERVER2, t1.RESERVER3, t1.RESERVER4, t1.UPDATEDATE, t1.UPDATEMAN, t1.WXACCOUNTID, t1.WXACCOUNTNAME, t1.WXORGSECTORID, t1.WXORGSECTORNAME FROM T_SRFWXORGSECTOR t1  LEFT JOIN T_SRFORGSECTOR t11 ON t1.ORGSECTORID = t11.ORGSECTORID ",querycodetemp="",declarecode="",dbtype="POSTGRESQL",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="DEPTID",expression="t1.DEPTID")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="ORGSECTORID",expression="t1.ORGSECTORID")
        ,@DEDataQueryCodeExp(name="ORGSECTORNAME",expression="t11.ORGSECTORNAME")
        ,@DEDataQueryCodeExp(name="RESERVER",expression="t1.RESERVER")
        ,@DEDataQueryCodeExp(name="RESERVER2",expression="t1.RESERVER2")
        ,@DEDataQueryCodeExp(name="RESERVER3",expression="t1.RESERVER3")
        ,@DEDataQueryCodeExp(name="RESERVER4",expression="t1.RESERVER4")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="WXACCOUNTID",expression="t1.WXACCOUNTID")
        ,@DEDataQueryCodeExp(name="WXACCOUNTNAME",expression="t1.WXACCOUNTNAME")
        ,@DEDataQueryCodeExp(name="WXORGSECTORID",expression="t1.WXORGSECTORID")
        ,@DEDataQueryCodeExp(name="WXORGSECTORNAME",expression="t1.WXORGSECTORNAME")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE, t1.CREATEMAN, t1.DEPTID, t1.MEMO, t1.ORGSECTORID, t11.ORGSECTORNAME, t1.RESERVER, t1.RESERVER2, t1.RESERVER3, t1.RESERVER4, t1.UPDATEDATE, t1.UPDATEMAN, t1.WXACCOUNTID, t1.WXACCOUNTNAME, t1.WXORGSECTORID, t1.WXORGSECTORNAME FROM T_SRFWXORGSECTOR t1  LEFT JOIN T_SRFORGSECTOR t11 ON t1.ORGSECTORID = t11.ORGSECTORID ",querycodetemp="",declarecode="",dbtype="PPAS",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="DEPTID",expression="t1.DEPTID")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="ORGSECTORID",expression="t1.ORGSECTORID")
        ,@DEDataQueryCodeExp(name="ORGSECTORNAME",expression="t11.ORGSECTORNAME")
        ,@DEDataQueryCodeExp(name="RESERVER",expression="t1.RESERVER")
        ,@DEDataQueryCodeExp(name="RESERVER2",expression="t1.RESERVER2")
        ,@DEDataQueryCodeExp(name="RESERVER3",expression="t1.RESERVER3")
        ,@DEDataQueryCodeExp(name="RESERVER4",expression="t1.RESERVER4")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="WXACCOUNTID",expression="t1.WXACCOUNTID")
        ,@DEDataQueryCodeExp(name="WXACCOUNTNAME",expression="t1.WXACCOUNTNAME")
        ,@DEDataQueryCodeExp(name="WXORGSECTORID",expression="t1.WXORGSECTORID")
        ,@DEDataQueryCodeExp(name="WXORGSECTORNAME",expression="t1.WXORGSECTORNAME")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.[CREATEDATE], t1.[CREATEMAN], t1.[DEPTID], t1.[MEMO], t1.[ORGSECTORID], t11.[ORGSECTORNAME], t1.[RESERVER], t1.[RESERVER2], t1.[RESERVER3], t1.[RESERVER4], t1.[UPDATEDATE], t1.[UPDATEMAN], t1.[WXACCOUNTID], t1.[WXACCOUNTNAME], t1.[WXORGSECTORID], t1.[WXORGSECTORNAME] FROM [T_SRFWXORGSECTOR] t1  LEFT JOIN T_SRFORGSECTOR t11 ON t1.ORGSECTORID = t11.ORGSECTORID ",querycodetemp="",declarecode="",dbtype="SQLSERVER",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.[CREATEDATE]")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.[CREATEMAN]")
        ,@DEDataQueryCodeExp(name="DEPTID",expression="t1.[DEPTID]")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.[MEMO]")
        ,@DEDataQueryCodeExp(name="ORGSECTORID",expression="t1.[ORGSECTORID]")
        ,@DEDataQueryCodeExp(name="ORGSECTORNAME",expression="t11.[ORGSECTORNAME]")
        ,@DEDataQueryCodeExp(name="RESERVER",expression="t1.[RESERVER]")
        ,@DEDataQueryCodeExp(name="RESERVER2",expression="t1.[RESERVER2]")
        ,@DEDataQueryCodeExp(name="RESERVER3",expression="t1.[RESERVER3]")
        ,@DEDataQueryCodeExp(name="RESERVER4",expression="t1.[RESERVER4]")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.[UPDATEDATE]")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.[UPDATEMAN]")
        ,@DEDataQueryCodeExp(name="WXACCOUNTID",expression="t1.[WXACCOUNTID]")
        ,@DEDataQueryCodeExp(name="WXACCOUNTNAME",expression="t1.[WXACCOUNTNAME]")
        ,@DEDataQueryCodeExp(name="WXORGSECTORID",expression="t1.[WXORGSECTORID]")
        ,@DEDataQueryCodeExp(name="WXORGSECTORNAME",expression="t1.[WXORGSECTORNAME]")
    },
    conds={})
})
/**
 *  实体数据查询 [DEFAULT]模型基类
 */
public abstract class WXOrgSectorDefaultDQModelBase extends net.ibizsys.paas.demodel.DEDataQueryModelBase {

    public WXOrgSectorDefaultDQModelBase() {
        super();

        this.initAnnotation(WXOrgSectorDefaultDQModelBase.class);
    }

}