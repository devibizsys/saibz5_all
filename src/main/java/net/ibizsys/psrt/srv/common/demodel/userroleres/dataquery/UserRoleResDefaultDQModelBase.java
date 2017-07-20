/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package net.ibizsys.psrt.srv.common.demodel.userroleres.dataquery;



import net.ibizsys.paas.core.DEDataQuery;
import net.ibizsys.paas.core.DEDataQueryCodes;
import net.ibizsys.paas.core.DEDataQueryCode;
import net.ibizsys.paas.core.DEDataQueryCodeExp;
import net.ibizsys.paas.core.DEDataQueryCodeCond;

@DEDataQuery(id="1666E70A-5F02-4D25-AA47-8429338B76F9",name="DEFAULT")
@DEDataQueryCodes({
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE, t1.CREATEMAN, t1.ISALLOW, t1.RESERVER, t1.RESERVER2, t1.RESERVER3, t1.RESERVER4, t1.UNIRESID, t11.UNIRESNAME, t11.UNIRESTYPE, t1.UPDATEDATE, t1.UPDATEMAN, t1.USERROLEID, t21.USERROLENAME, t1.USERROLERESID, t1.USERROLERESNAME FROM T_SRFUSERROLERES t1  LEFT JOIN T_SRFUNIRES t11 ON t1.UNIRESID = t11.UNIRESID  LEFT JOIN T_SRFUSERROLE t21 ON t1.USERROLEID = t21.USERROLEID ",querycodetemp="",declarecode="",dbtype="DB2",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="ISALLOW",expression="t1.ISALLOW")
        ,@DEDataQueryCodeExp(name="RESERVER",expression="t1.RESERVER")
        ,@DEDataQueryCodeExp(name="RESERVER2",expression="t1.RESERVER2")
        ,@DEDataQueryCodeExp(name="RESERVER3",expression="t1.RESERVER3")
        ,@DEDataQueryCodeExp(name="RESERVER4",expression="t1.RESERVER4")
        ,@DEDataQueryCodeExp(name="UNIRESID",expression="t1.UNIRESID")
        ,@DEDataQueryCodeExp(name="UNIRESNAME",expression="t11.UNIRESNAME")
        ,@DEDataQueryCodeExp(name="UNIRESTYPE",expression="t11.UNIRESTYPE")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="USERROLEID",expression="t1.USERROLEID")
        ,@DEDataQueryCodeExp(name="USERROLENAME",expression="t21.USERROLENAME")
        ,@DEDataQueryCodeExp(name="USERROLERESID",expression="t1.USERROLERESID")
        ,@DEDataQueryCodeExp(name="USERROLERESNAME",expression="t1.USERROLERESNAME")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.`CREATEDATE`, t1.`CREATEMAN`, t1.`ISALLOW`, t1.`RESERVER`, t1.`RESERVER2`, t1.`RESERVER3`, t1.`RESERVER4`, t1.`UNIRESID`, t11.`UNIRESNAME`, t11.`UNIRESTYPE`, t1.`UPDATEDATE`, t1.`UPDATEMAN`, t1.`USERROLEID`, t21.`USERROLENAME`, t1.`USERROLERESID`, t1.`USERROLERESNAME` FROM `T_SRFUSERROLERES` t1  LEFT JOIN T_SRFUNIRES t11 ON t1.UNIRESID = t11.UNIRESID  LEFT JOIN T_SRFUSERROLE t21 ON t1.USERROLEID = t21.USERROLEID ",querycodetemp="",declarecode="",dbtype="MYSQL5",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.`CREATEDATE`")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.`CREATEMAN`")
        ,@DEDataQueryCodeExp(name="ISALLOW",expression="t1.`ISALLOW`")
        ,@DEDataQueryCodeExp(name="RESERVER",expression="t1.`RESERVER`")
        ,@DEDataQueryCodeExp(name="RESERVER2",expression="t1.`RESERVER2`")
        ,@DEDataQueryCodeExp(name="RESERVER3",expression="t1.`RESERVER3`")
        ,@DEDataQueryCodeExp(name="RESERVER4",expression="t1.`RESERVER4`")
        ,@DEDataQueryCodeExp(name="UNIRESID",expression="t1.`UNIRESID`")
        ,@DEDataQueryCodeExp(name="UNIRESNAME",expression="t11.`UNIRESNAME`")
        ,@DEDataQueryCodeExp(name="UNIRESTYPE",expression="t11.`UNIRESTYPE`")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.`UPDATEDATE`")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.`UPDATEMAN`")
        ,@DEDataQueryCodeExp(name="USERROLEID",expression="t1.`USERROLEID`")
        ,@DEDataQueryCodeExp(name="USERROLENAME",expression="t21.`USERROLENAME`")
        ,@DEDataQueryCodeExp(name="USERROLERESID",expression="t1.`USERROLERESID`")
        ,@DEDataQueryCodeExp(name="USERROLERESNAME",expression="t1.`USERROLERESNAME`")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE, t1.CREATEMAN, t1.ISALLOW, t1.RESERVER, t1.RESERVER2, t1.RESERVER3, t1.RESERVER4, t1.UNIRESID, t11.UNIRESNAME, t11.UNIRESTYPE, t1.UPDATEDATE, t1.UPDATEMAN, t1.USERROLEID, t21.USERROLENAME, t1.USERROLERESID, t1.USERROLERESNAME FROM T_SRFUSERROLERES t1  LEFT JOIN T_SRFUNIRES t11 ON t1.UNIRESID = t11.UNIRESID  LEFT JOIN T_SRFUSERROLE t21 ON t1.USERROLEID = t21.USERROLEID ",querycodetemp="",declarecode="",dbtype="ORACLE",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="ISALLOW",expression="t1.ISALLOW")
        ,@DEDataQueryCodeExp(name="RESERVER",expression="t1.RESERVER")
        ,@DEDataQueryCodeExp(name="RESERVER2",expression="t1.RESERVER2")
        ,@DEDataQueryCodeExp(name="RESERVER3",expression="t1.RESERVER3")
        ,@DEDataQueryCodeExp(name="RESERVER4",expression="t1.RESERVER4")
        ,@DEDataQueryCodeExp(name="UNIRESID",expression="t1.UNIRESID")
        ,@DEDataQueryCodeExp(name="UNIRESNAME",expression="t11.UNIRESNAME")
        ,@DEDataQueryCodeExp(name="UNIRESTYPE",expression="t11.UNIRESTYPE")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="USERROLEID",expression="t1.USERROLEID")
        ,@DEDataQueryCodeExp(name="USERROLENAME",expression="t21.USERROLENAME")
        ,@DEDataQueryCodeExp(name="USERROLERESID",expression="t1.USERROLERESID")
        ,@DEDataQueryCodeExp(name="USERROLERESNAME",expression="t1.USERROLERESNAME")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.[CREATEDATE], t1.[CREATEMAN], t1.[ISALLOW], t1.[RESERVER], t1.[RESERVER2], t1.[RESERVER3], t1.[RESERVER4], t1.[UNIRESID], t11.[UNIRESNAME], t11.[UNIRESTYPE], t1.[UPDATEDATE], t1.[UPDATEMAN], t1.[USERROLEID], t21.[USERROLENAME], t1.[USERROLERESID], t1.[USERROLERESNAME] FROM [T_SRFUSERROLERES] t1  LEFT JOIN T_SRFUNIRES t11 ON t1.UNIRESID = t11.UNIRESID  LEFT JOIN T_SRFUSERROLE t21 ON t1.USERROLEID = t21.USERROLEID ",querycodetemp="",declarecode="",dbtype="SQLSERVER",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.[CREATEDATE]")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.[CREATEMAN]")
        ,@DEDataQueryCodeExp(name="ISALLOW",expression="t1.[ISALLOW]")
        ,@DEDataQueryCodeExp(name="RESERVER",expression="t1.[RESERVER]")
        ,@DEDataQueryCodeExp(name="RESERVER2",expression="t1.[RESERVER2]")
        ,@DEDataQueryCodeExp(name="RESERVER3",expression="t1.[RESERVER3]")
        ,@DEDataQueryCodeExp(name="RESERVER4",expression="t1.[RESERVER4]")
        ,@DEDataQueryCodeExp(name="UNIRESID",expression="t1.[UNIRESID]")
        ,@DEDataQueryCodeExp(name="UNIRESNAME",expression="t11.[UNIRESNAME]")
        ,@DEDataQueryCodeExp(name="UNIRESTYPE",expression="t11.[UNIRESTYPE]")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.[UPDATEDATE]")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.[UPDATEMAN]")
        ,@DEDataQueryCodeExp(name="USERROLEID",expression="t1.[USERROLEID]")
        ,@DEDataQueryCodeExp(name="USERROLENAME",expression="t21.[USERROLENAME]")
        ,@DEDataQueryCodeExp(name="USERROLERESID",expression="t1.[USERROLERESID]")
        ,@DEDataQueryCodeExp(name="USERROLERESNAME",expression="t1.[USERROLERESNAME]")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE, t1.CREATEMAN, t1.ISALLOW, t1.RESERVER, t1.RESERVER2, t1.RESERVER3, t1.RESERVER4, t1.UNIRESID, t11.UNIRESNAME, t11.UNIRESTYPE, t1.UPDATEDATE, t1.UPDATEMAN, t1.USERROLEID, t21.USERROLENAME, t1.USERROLERESID, t1.USERROLERESNAME FROM T_SRFUSERROLERES t1  LEFT JOIN T_SRFUNIRES t11 ON t1.UNIRESID = t11.UNIRESID  LEFT JOIN T_SRFUSERROLE t21 ON t1.USERROLEID = t21.USERROLEID ",querycodetemp="",declarecode="",dbtype="POSTGRESQL",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="ISALLOW",expression="t1.ISALLOW")
        ,@DEDataQueryCodeExp(name="RESERVER",expression="t1.RESERVER")
        ,@DEDataQueryCodeExp(name="RESERVER2",expression="t1.RESERVER2")
        ,@DEDataQueryCodeExp(name="RESERVER3",expression="t1.RESERVER3")
        ,@DEDataQueryCodeExp(name="RESERVER4",expression="t1.RESERVER4")
        ,@DEDataQueryCodeExp(name="UNIRESID",expression="t1.UNIRESID")
        ,@DEDataQueryCodeExp(name="UNIRESNAME",expression="t11.UNIRESNAME")
        ,@DEDataQueryCodeExp(name="UNIRESTYPE",expression="t11.UNIRESTYPE")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="USERROLEID",expression="t1.USERROLEID")
        ,@DEDataQueryCodeExp(name="USERROLENAME",expression="t21.USERROLENAME")
        ,@DEDataQueryCodeExp(name="USERROLERESID",expression="t1.USERROLERESID")
        ,@DEDataQueryCodeExp(name="USERROLERESNAME",expression="t1.USERROLERESNAME")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE, t1.CREATEMAN, t1.ISALLOW, t1.RESERVER, t1.RESERVER2, t1.RESERVER3, t1.RESERVER4, t1.UNIRESID, t11.UNIRESNAME, t11.UNIRESTYPE, t1.UPDATEDATE, t1.UPDATEMAN, t1.USERROLEID, t21.USERROLENAME, t1.USERROLERESID, t1.USERROLERESNAME FROM T_SRFUSERROLERES t1  LEFT JOIN T_SRFUNIRES t11 ON t1.UNIRESID = t11.UNIRESID  LEFT JOIN T_SRFUSERROLE t21 ON t1.USERROLEID = t21.USERROLEID ",querycodetemp="",declarecode="",dbtype="PPAS",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="ISALLOW",expression="t1.ISALLOW")
        ,@DEDataQueryCodeExp(name="RESERVER",expression="t1.RESERVER")
        ,@DEDataQueryCodeExp(name="RESERVER2",expression="t1.RESERVER2")
        ,@DEDataQueryCodeExp(name="RESERVER3",expression="t1.RESERVER3")
        ,@DEDataQueryCodeExp(name="RESERVER4",expression="t1.RESERVER4")
        ,@DEDataQueryCodeExp(name="UNIRESID",expression="t1.UNIRESID")
        ,@DEDataQueryCodeExp(name="UNIRESNAME",expression="t11.UNIRESNAME")
        ,@DEDataQueryCodeExp(name="UNIRESTYPE",expression="t11.UNIRESTYPE")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="USERROLEID",expression="t1.USERROLEID")
        ,@DEDataQueryCodeExp(name="USERROLENAME",expression="t21.USERROLENAME")
        ,@DEDataQueryCodeExp(name="USERROLERESID",expression="t1.USERROLERESID")
        ,@DEDataQueryCodeExp(name="USERROLERESNAME",expression="t1.USERROLERESNAME")
    },
    conds={})
})
/**
 *  实体数据查询 [DEFAULT]模型基类
 */
public abstract class UserRoleResDefaultDQModelBase extends net.ibizsys.paas.demodel.DEDataQueryModelBase {

    public UserRoleResDefaultDQModelBase() {
        super();

        this.initAnnotation(UserRoleResDefaultDQModelBase.class);
    }

}