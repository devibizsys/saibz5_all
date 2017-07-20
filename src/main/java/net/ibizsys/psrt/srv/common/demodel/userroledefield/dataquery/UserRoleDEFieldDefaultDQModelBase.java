/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package net.ibizsys.psrt.srv.common.demodel.userroledefield.dataquery;



import net.ibizsys.paas.core.DEDataQuery;
import net.ibizsys.paas.core.DEDataQueryCodes;
import net.ibizsys.paas.core.DEDataQueryCode;
import net.ibizsys.paas.core.DEDataQueryCodeExp;
import net.ibizsys.paas.core.DEDataQueryCodeCond;

@DEDataQuery(id="EEFA7B6D-D93A-4BC9-8AAD-F2A83357F679",name="DEFAULT")
@DEDataQueryCodes({
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE, t1.CREATEMAN, t1.DEFACTION, t1.DEID, t1.DENAME, t1.RESERVER, t1.RESERVER2, t1.RESERVER3, t1.RESERVER4, t1.SRFSYSPUB, t1.SRFUSERPUB, t1.UPDATEDATE, t1.UPDATEMAN, t1.USERROLEDEFIELDID, t1.USERROLEDEFIELDNAME FROM T_SRFUSERROLEDEFIELD t1 ",querycodetemp="",declarecode="",dbtype="DB2",
    fieldexps={
        @DEDataQueryCodeExp(name="RELATEDDEFIELD",expression="t1.RELATEDDEFIELD")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="DEFACTION",expression="t1.DEFACTION")
        ,@DEDataQueryCodeExp(name="DEID",expression="t1.DEID")
        ,@DEDataQueryCodeExp(name="DENAME",expression="t1.DENAME")
        ,@DEDataQueryCodeExp(name="RESERVER",expression="t1.RESERVER")
        ,@DEDataQueryCodeExp(name="RESERVER2",expression="t1.RESERVER2")
        ,@DEDataQueryCodeExp(name="RESERVER3",expression="t1.RESERVER3")
        ,@DEDataQueryCodeExp(name="RESERVER4",expression="t1.RESERVER4")
        ,@DEDataQueryCodeExp(name="SRFSYSPUB",expression="t1.SRFSYSPUB")
        ,@DEDataQueryCodeExp(name="SRFUSERPUB",expression="t1.SRFUSERPUB")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="USERROLEDEFIELDID",expression="t1.USERROLEDEFIELDID")
        ,@DEDataQueryCodeExp(name="USERROLEDEFIELDNAME",expression="t1.USERROLEDEFIELDNAME")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.`CREATEDATE`, t1.`CREATEMAN`, t1.`DEFACTION`, t1.`DEID`, t1.`DENAME`, t1.`RESERVER`, t1.`RESERVER2`, t1.`RESERVER3`, t1.`RESERVER4`, t1.`SRFSYSPUB`, t1.`SRFUSERPUB`, t1.`UPDATEDATE`, t1.`UPDATEMAN`, t1.`USERROLEDEFIELDID`, t1.`USERROLEDEFIELDNAME` FROM `T_SRFUSERROLEDEFIELD` t1 ",querycodetemp="",declarecode="",dbtype="MYSQL5",
    fieldexps={
        @DEDataQueryCodeExp(name="RELATEDDEFIELD",expression="t1.`RELATEDDEFIELD`")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.`CREATEDATE`")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.`CREATEMAN`")
        ,@DEDataQueryCodeExp(name="DEFACTION",expression="t1.`DEFACTION`")
        ,@DEDataQueryCodeExp(name="DEID",expression="t1.`DEID`")
        ,@DEDataQueryCodeExp(name="DENAME",expression="t1.`DENAME`")
        ,@DEDataQueryCodeExp(name="RESERVER",expression="t1.`RESERVER`")
        ,@DEDataQueryCodeExp(name="RESERVER2",expression="t1.`RESERVER2`")
        ,@DEDataQueryCodeExp(name="RESERVER3",expression="t1.`RESERVER3`")
        ,@DEDataQueryCodeExp(name="RESERVER4",expression="t1.`RESERVER4`")
        ,@DEDataQueryCodeExp(name="SRFSYSPUB",expression="t1.`SRFSYSPUB`")
        ,@DEDataQueryCodeExp(name="SRFUSERPUB",expression="t1.`SRFUSERPUB`")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.`UPDATEDATE`")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.`UPDATEMAN`")
        ,@DEDataQueryCodeExp(name="USERROLEDEFIELDID",expression="t1.`USERROLEDEFIELDID`")
        ,@DEDataQueryCodeExp(name="USERROLEDEFIELDNAME",expression="t1.`USERROLEDEFIELDNAME`")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE, t1.CREATEMAN, t1.DEFACTION, t1.DEID, t1.DENAME, t1.RESERVER, t1.RESERVER2, t1.RESERVER3, t1.RESERVER4, t1.SRFSYSPUB, t1.SRFUSERPUB, t1.UPDATEDATE, t1.UPDATEMAN, t1.USERROLEDEFIELDID, t1.USERROLEDEFIELDNAME FROM T_SRFUSERROLEDEFIELD t1 ",querycodetemp="",declarecode="",dbtype="ORACLE",
    fieldexps={
        @DEDataQueryCodeExp(name="RELATEDDEFIELD",expression="t1.RELATEDDEFIELD")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="DEFACTION",expression="t1.DEFACTION")
        ,@DEDataQueryCodeExp(name="DEID",expression="t1.DEID")
        ,@DEDataQueryCodeExp(name="DENAME",expression="t1.DENAME")
        ,@DEDataQueryCodeExp(name="RESERVER",expression="t1.RESERVER")
        ,@DEDataQueryCodeExp(name="RESERVER2",expression="t1.RESERVER2")
        ,@DEDataQueryCodeExp(name="RESERVER3",expression="t1.RESERVER3")
        ,@DEDataQueryCodeExp(name="RESERVER4",expression="t1.RESERVER4")
        ,@DEDataQueryCodeExp(name="SRFSYSPUB",expression="t1.SRFSYSPUB")
        ,@DEDataQueryCodeExp(name="SRFUSERPUB",expression="t1.SRFUSERPUB")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="USERROLEDEFIELDID",expression="t1.USERROLEDEFIELDID")
        ,@DEDataQueryCodeExp(name="USERROLEDEFIELDNAME",expression="t1.USERROLEDEFIELDNAME")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.[CREATEDATE], t1.[CREATEMAN], t1.[DEFACTION], t1.[DEID], t1.[DENAME], t1.[RESERVER], t1.[RESERVER2], t1.[RESERVER3], t1.[RESERVER4], t1.[SRFSYSPUB], t1.[SRFUSERPUB], t1.[UPDATEDATE], t1.[UPDATEMAN], t1.[USERROLEDEFIELDID], t1.[USERROLEDEFIELDNAME] FROM [T_SRFUSERROLEDEFIELD] t1 ",querycodetemp="",declarecode="",dbtype="SQLSERVER",
    fieldexps={
        @DEDataQueryCodeExp(name="RELATEDDEFIELD",expression="t1.[RELATEDDEFIELD]")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.[CREATEDATE]")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.[CREATEMAN]")
        ,@DEDataQueryCodeExp(name="DEFACTION",expression="t1.[DEFACTION]")
        ,@DEDataQueryCodeExp(name="DEID",expression="t1.[DEID]")
        ,@DEDataQueryCodeExp(name="DENAME",expression="t1.[DENAME]")
        ,@DEDataQueryCodeExp(name="RESERVER",expression="t1.[RESERVER]")
        ,@DEDataQueryCodeExp(name="RESERVER2",expression="t1.[RESERVER2]")
        ,@DEDataQueryCodeExp(name="RESERVER3",expression="t1.[RESERVER3]")
        ,@DEDataQueryCodeExp(name="RESERVER4",expression="t1.[RESERVER4]")
        ,@DEDataQueryCodeExp(name="SRFSYSPUB",expression="t1.[SRFSYSPUB]")
        ,@DEDataQueryCodeExp(name="SRFUSERPUB",expression="t1.[SRFUSERPUB]")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.[UPDATEDATE]")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.[UPDATEMAN]")
        ,@DEDataQueryCodeExp(name="USERROLEDEFIELDID",expression="t1.[USERROLEDEFIELDID]")
        ,@DEDataQueryCodeExp(name="USERROLEDEFIELDNAME",expression="t1.[USERROLEDEFIELDNAME]")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE, t1.CREATEMAN, t1.DEFACTION, t1.DEID, t1.DENAME, t1.RESERVER, t1.RESERVER2, t1.RESERVER3, t1.RESERVER4, t1.SRFSYSPUB, t1.SRFUSERPUB, t1.UPDATEDATE, t1.UPDATEMAN, t1.USERROLEDEFIELDID, t1.USERROLEDEFIELDNAME FROM T_SRFUSERROLEDEFIELD t1 ",querycodetemp="",declarecode="",dbtype="POSTGRESQL",
    fieldexps={
        @DEDataQueryCodeExp(name="RELATEDDEFIELD",expression="t1.RELATEDDEFIELD")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="DEFACTION",expression="t1.DEFACTION")
        ,@DEDataQueryCodeExp(name="DEID",expression="t1.DEID")
        ,@DEDataQueryCodeExp(name="DENAME",expression="t1.DENAME")
        ,@DEDataQueryCodeExp(name="RESERVER",expression="t1.RESERVER")
        ,@DEDataQueryCodeExp(name="RESERVER2",expression="t1.RESERVER2")
        ,@DEDataQueryCodeExp(name="RESERVER3",expression="t1.RESERVER3")
        ,@DEDataQueryCodeExp(name="RESERVER4",expression="t1.RESERVER4")
        ,@DEDataQueryCodeExp(name="SRFSYSPUB",expression="t1.SRFSYSPUB")
        ,@DEDataQueryCodeExp(name="SRFUSERPUB",expression="t1.SRFUSERPUB")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="USERROLEDEFIELDID",expression="t1.USERROLEDEFIELDID")
        ,@DEDataQueryCodeExp(name="USERROLEDEFIELDNAME",expression="t1.USERROLEDEFIELDNAME")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE, t1.CREATEMAN, t1.DEFACTION, t1.DEID, t1.DENAME, t1.RESERVER, t1.RESERVER2, t1.RESERVER3, t1.RESERVER4, t1.SRFSYSPUB, t1.SRFUSERPUB, t1.UPDATEDATE, t1.UPDATEMAN, t1.USERROLEDEFIELDID, t1.USERROLEDEFIELDNAME FROM T_SRFUSERROLEDEFIELD t1 ",querycodetemp="",declarecode="",dbtype="PPAS",
    fieldexps={
        @DEDataQueryCodeExp(name="RELATEDDEFIELD",expression="t1.RELATEDDEFIELD")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="DEFACTION",expression="t1.DEFACTION")
        ,@DEDataQueryCodeExp(name="DEID",expression="t1.DEID")
        ,@DEDataQueryCodeExp(name="DENAME",expression="t1.DENAME")
        ,@DEDataQueryCodeExp(name="RESERVER",expression="t1.RESERVER")
        ,@DEDataQueryCodeExp(name="RESERVER2",expression="t1.RESERVER2")
        ,@DEDataQueryCodeExp(name="RESERVER3",expression="t1.RESERVER3")
        ,@DEDataQueryCodeExp(name="RESERVER4",expression="t1.RESERVER4")
        ,@DEDataQueryCodeExp(name="SRFSYSPUB",expression="t1.SRFSYSPUB")
        ,@DEDataQueryCodeExp(name="SRFUSERPUB",expression="t1.SRFUSERPUB")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="USERROLEDEFIELDID",expression="t1.USERROLEDEFIELDID")
        ,@DEDataQueryCodeExp(name="USERROLEDEFIELDNAME",expression="t1.USERROLEDEFIELDNAME")
    },
    conds={})
})
/**
 *  实体数据查询 [DEFAULT]模型基类
 */
public abstract class UserRoleDEFieldDefaultDQModelBase extends net.ibizsys.paas.demodel.DEDataQueryModelBase {

    public UserRoleDEFieldDefaultDQModelBase() {
        super();

        this.initAnnotation(UserRoleDEFieldDefaultDQModelBase.class);
    }

}