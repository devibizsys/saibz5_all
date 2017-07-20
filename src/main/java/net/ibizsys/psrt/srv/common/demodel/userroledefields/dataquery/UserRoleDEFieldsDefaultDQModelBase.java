/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package net.ibizsys.psrt.srv.common.demodel.userroledefields.dataquery;



import net.ibizsys.paas.core.DEDataQuery;
import net.ibizsys.paas.core.DEDataQueryCodes;
import net.ibizsys.paas.core.DEDataQueryCode;
import net.ibizsys.paas.core.DEDataQueryCodeExp;
import net.ibizsys.paas.core.DEDataQueryCodeCond;

@DEDataQuery(id="CA944323-1549-4BB0-86D9-D5574F891AA9",name="DEFAULT")
@DEDataQueryCodes({
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE, t1.CREATEMAN, t1.RESERVER, t1.RESERVER2, t1.RESERVER3, t1.RESERVER4, t1.UPDATEDATE, t1.UPDATEMAN, t1.USERROLEDEFIELDID, t11.USERROLEDEFIELDNAME, t1.USERROLEDEFIELDSID, t1.USERROLEDEFIELDSNAME, t1.USERROLEID, t21.USERROLENAME FROM T_SRFUSERROLEDEFIELDS t1  LEFT JOIN T_SRFUSERROLEDEFIELD t11 ON t1.USERROLEDEFIELDID = t11.USERROLEDEFIELDID  LEFT JOIN T_SRFUSERROLE t21 ON t1.USERROLEID = t21.USERROLEID ",querycodetemp="",declarecode="",dbtype="DB2",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="RESERVER",expression="t1.RESERVER")
        ,@DEDataQueryCodeExp(name="RESERVER2",expression="t1.RESERVER2")
        ,@DEDataQueryCodeExp(name="RESERVER3",expression="t1.RESERVER3")
        ,@DEDataQueryCodeExp(name="RESERVER4",expression="t1.RESERVER4")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="USERROLEDEFIELDID",expression="t1.USERROLEDEFIELDID")
        ,@DEDataQueryCodeExp(name="USERROLEDEFIELDNAME",expression="t11.USERROLEDEFIELDNAME")
        ,@DEDataQueryCodeExp(name="USERROLEDEFIELDSID",expression="t1.USERROLEDEFIELDSID")
        ,@DEDataQueryCodeExp(name="USERROLEDEFIELDSNAME",expression="t1.USERROLEDEFIELDSNAME")
        ,@DEDataQueryCodeExp(name="USERROLEID",expression="t1.USERROLEID")
        ,@DEDataQueryCodeExp(name="USERROLENAME",expression="t21.USERROLENAME")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.`CREATEDATE`, t1.`CREATEMAN`, t1.`RESERVER`, t1.`RESERVER2`, t1.`RESERVER3`, t1.`RESERVER4`, t1.`UPDATEDATE`, t1.`UPDATEMAN`, t1.`USERROLEDEFIELDID`, t11.`USERROLEDEFIELDNAME`, t1.`USERROLEDEFIELDSID`, t1.`USERROLEDEFIELDSNAME`, t1.`USERROLEID`, t21.`USERROLENAME` FROM `T_SRFUSERROLEDEFIELDS` t1  LEFT JOIN T_SRFUSERROLEDEFIELD t11 ON t1.USERROLEDEFIELDID = t11.USERROLEDEFIELDID  LEFT JOIN T_SRFUSERROLE t21 ON t1.USERROLEID = t21.USERROLEID ",querycodetemp="",declarecode="",dbtype="MYSQL5",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.`CREATEDATE`")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.`CREATEMAN`")
        ,@DEDataQueryCodeExp(name="RESERVER",expression="t1.`RESERVER`")
        ,@DEDataQueryCodeExp(name="RESERVER2",expression="t1.`RESERVER2`")
        ,@DEDataQueryCodeExp(name="RESERVER3",expression="t1.`RESERVER3`")
        ,@DEDataQueryCodeExp(name="RESERVER4",expression="t1.`RESERVER4`")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.`UPDATEDATE`")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.`UPDATEMAN`")
        ,@DEDataQueryCodeExp(name="USERROLEDEFIELDID",expression="t1.`USERROLEDEFIELDID`")
        ,@DEDataQueryCodeExp(name="USERROLEDEFIELDNAME",expression="t11.`USERROLEDEFIELDNAME`")
        ,@DEDataQueryCodeExp(name="USERROLEDEFIELDSID",expression="t1.`USERROLEDEFIELDSID`")
        ,@DEDataQueryCodeExp(name="USERROLEDEFIELDSNAME",expression="t1.`USERROLEDEFIELDSNAME`")
        ,@DEDataQueryCodeExp(name="USERROLEID",expression="t1.`USERROLEID`")
        ,@DEDataQueryCodeExp(name="USERROLENAME",expression="t21.`USERROLENAME`")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE, t1.CREATEMAN, t1.RESERVER, t1.RESERVER2, t1.RESERVER3, t1.RESERVER4, t1.UPDATEDATE, t1.UPDATEMAN, t1.USERROLEDEFIELDID, t11.USERROLEDEFIELDNAME, t1.USERROLEDEFIELDSID, t1.USERROLEDEFIELDSNAME, t1.USERROLEID, t21.USERROLENAME FROM T_SRFUSERROLEDEFIELDS t1  LEFT JOIN T_SRFUSERROLEDEFIELD t11 ON t1.USERROLEDEFIELDID = t11.USERROLEDEFIELDID  LEFT JOIN T_SRFUSERROLE t21 ON t1.USERROLEID = t21.USERROLEID ",querycodetemp="",declarecode="",dbtype="ORACLE",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="RESERVER",expression="t1.RESERVER")
        ,@DEDataQueryCodeExp(name="RESERVER2",expression="t1.RESERVER2")
        ,@DEDataQueryCodeExp(name="RESERVER3",expression="t1.RESERVER3")
        ,@DEDataQueryCodeExp(name="RESERVER4",expression="t1.RESERVER4")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="USERROLEDEFIELDID",expression="t1.USERROLEDEFIELDID")
        ,@DEDataQueryCodeExp(name="USERROLEDEFIELDNAME",expression="t11.USERROLEDEFIELDNAME")
        ,@DEDataQueryCodeExp(name="USERROLEDEFIELDSID",expression="t1.USERROLEDEFIELDSID")
        ,@DEDataQueryCodeExp(name="USERROLEDEFIELDSNAME",expression="t1.USERROLEDEFIELDSNAME")
        ,@DEDataQueryCodeExp(name="USERROLEID",expression="t1.USERROLEID")
        ,@DEDataQueryCodeExp(name="USERROLENAME",expression="t21.USERROLENAME")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.[CREATEDATE], t1.[CREATEMAN], t1.[RESERVER], t1.[RESERVER2], t1.[RESERVER3], t1.[RESERVER4], t1.[UPDATEDATE], t1.[UPDATEMAN], t1.[USERROLEDEFIELDID], t11.[USERROLEDEFIELDNAME], t1.[USERROLEDEFIELDSID], t1.[USERROLEDEFIELDSNAME], t1.[USERROLEID], t21.[USERROLENAME] FROM [T_SRFUSERROLEDEFIELDS] t1  LEFT JOIN T_SRFUSERROLEDEFIELD t11 ON t1.USERROLEDEFIELDID = t11.USERROLEDEFIELDID  LEFT JOIN T_SRFUSERROLE t21 ON t1.USERROLEID = t21.USERROLEID ",querycodetemp="",declarecode="",dbtype="SQLSERVER",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.[CREATEDATE]")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.[CREATEMAN]")
        ,@DEDataQueryCodeExp(name="RESERVER",expression="t1.[RESERVER]")
        ,@DEDataQueryCodeExp(name="RESERVER2",expression="t1.[RESERVER2]")
        ,@DEDataQueryCodeExp(name="RESERVER3",expression="t1.[RESERVER3]")
        ,@DEDataQueryCodeExp(name="RESERVER4",expression="t1.[RESERVER4]")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.[UPDATEDATE]")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.[UPDATEMAN]")
        ,@DEDataQueryCodeExp(name="USERROLEDEFIELDID",expression="t1.[USERROLEDEFIELDID]")
        ,@DEDataQueryCodeExp(name="USERROLEDEFIELDNAME",expression="t11.[USERROLEDEFIELDNAME]")
        ,@DEDataQueryCodeExp(name="USERROLEDEFIELDSID",expression="t1.[USERROLEDEFIELDSID]")
        ,@DEDataQueryCodeExp(name="USERROLEDEFIELDSNAME",expression="t1.[USERROLEDEFIELDSNAME]")
        ,@DEDataQueryCodeExp(name="USERROLEID",expression="t1.[USERROLEID]")
        ,@DEDataQueryCodeExp(name="USERROLENAME",expression="t21.[USERROLENAME]")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE, t1.CREATEMAN, t1.RESERVER, t1.RESERVER2, t1.RESERVER3, t1.RESERVER4, t1.UPDATEDATE, t1.UPDATEMAN, t1.USERROLEDEFIELDID, t11.USERROLEDEFIELDNAME, t1.USERROLEDEFIELDSID, t1.USERROLEDEFIELDSNAME, t1.USERROLEID, t21.USERROLENAME FROM T_SRFUSERROLEDEFIELDS t1  LEFT JOIN T_SRFUSERROLEDEFIELD t11 ON t1.USERROLEDEFIELDID = t11.USERROLEDEFIELDID  LEFT JOIN T_SRFUSERROLE t21 ON t1.USERROLEID = t21.USERROLEID ",querycodetemp="",declarecode="",dbtype="POSTGRESQL",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="RESERVER",expression="t1.RESERVER")
        ,@DEDataQueryCodeExp(name="RESERVER2",expression="t1.RESERVER2")
        ,@DEDataQueryCodeExp(name="RESERVER3",expression="t1.RESERVER3")
        ,@DEDataQueryCodeExp(name="RESERVER4",expression="t1.RESERVER4")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="USERROLEDEFIELDID",expression="t1.USERROLEDEFIELDID")
        ,@DEDataQueryCodeExp(name="USERROLEDEFIELDNAME",expression="t11.USERROLEDEFIELDNAME")
        ,@DEDataQueryCodeExp(name="USERROLEDEFIELDSID",expression="t1.USERROLEDEFIELDSID")
        ,@DEDataQueryCodeExp(name="USERROLEDEFIELDSNAME",expression="t1.USERROLEDEFIELDSNAME")
        ,@DEDataQueryCodeExp(name="USERROLEID",expression="t1.USERROLEID")
        ,@DEDataQueryCodeExp(name="USERROLENAME",expression="t21.USERROLENAME")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE, t1.CREATEMAN, t1.RESERVER, t1.RESERVER2, t1.RESERVER3, t1.RESERVER4, t1.UPDATEDATE, t1.UPDATEMAN, t1.USERROLEDEFIELDID, t11.USERROLEDEFIELDNAME, t1.USERROLEDEFIELDSID, t1.USERROLEDEFIELDSNAME, t1.USERROLEID, t21.USERROLENAME FROM T_SRFUSERROLEDEFIELDS t1  LEFT JOIN T_SRFUSERROLEDEFIELD t11 ON t1.USERROLEDEFIELDID = t11.USERROLEDEFIELDID  LEFT JOIN T_SRFUSERROLE t21 ON t1.USERROLEID = t21.USERROLEID ",querycodetemp="",declarecode="",dbtype="PPAS",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="RESERVER",expression="t1.RESERVER")
        ,@DEDataQueryCodeExp(name="RESERVER2",expression="t1.RESERVER2")
        ,@DEDataQueryCodeExp(name="RESERVER3",expression="t1.RESERVER3")
        ,@DEDataQueryCodeExp(name="RESERVER4",expression="t1.RESERVER4")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="USERROLEDEFIELDID",expression="t1.USERROLEDEFIELDID")
        ,@DEDataQueryCodeExp(name="USERROLEDEFIELDNAME",expression="t11.USERROLEDEFIELDNAME")
        ,@DEDataQueryCodeExp(name="USERROLEDEFIELDSID",expression="t1.USERROLEDEFIELDSID")
        ,@DEDataQueryCodeExp(name="USERROLEDEFIELDSNAME",expression="t1.USERROLEDEFIELDSNAME")
        ,@DEDataQueryCodeExp(name="USERROLEID",expression="t1.USERROLEID")
        ,@DEDataQueryCodeExp(name="USERROLENAME",expression="t21.USERROLENAME")
    },
    conds={})
})
/**
 *  实体数据查询 [DEFAULT]模型基类
 */
public abstract class UserRoleDEFieldsDefaultDQModelBase extends net.ibizsys.paas.demodel.DEDataQueryModelBase {

    public UserRoleDEFieldsDefaultDQModelBase() {
        super();

        this.initAnnotation(UserRoleDEFieldsDefaultDQModelBase.class);
    }

}