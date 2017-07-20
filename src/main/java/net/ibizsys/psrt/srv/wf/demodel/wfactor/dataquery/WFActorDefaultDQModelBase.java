/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package net.ibizsys.psrt.srv.wf.demodel.wfactor.dataquery;



import net.ibizsys.paas.core.DEDataQuery;
import net.ibizsys.paas.core.DEDataQueryCodes;
import net.ibizsys.paas.core.DEDataQueryCode;
import net.ibizsys.paas.core.DEDataQueryCodeExp;
import net.ibizsys.paas.core.DEDataQueryCodeCond;

@DEDataQuery(id="456925D5-F501-4DEA-8CD1-F562029E1E4E",name="DEFAULT")
@DEDataQueryCodes({
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE, t1.CREATEMAN, t1.UPDATEDATE, t1.UPDATEMAN, t1.WFACTORID, t1.WFACTORNAME, t1.WFACTORPARAM, t1.WFACTORPARAM2, t1.WFACTORTYPE FROM T_SRFWFACTOR t1 ",querycodetemp="",declarecode="",dbtype="DB2",
    fieldexps={
        @DEDataQueryCodeExp(name="PARAMS",expression="t1.PARAMS")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="WFACTORID",expression="t1.WFACTORID")
        ,@DEDataQueryCodeExp(name="WFACTORNAME",expression="t1.WFACTORNAME")
        ,@DEDataQueryCodeExp(name="WFACTORPARAM",expression="t1.WFACTORPARAM")
        ,@DEDataQueryCodeExp(name="WFACTORPARAM2",expression="t1.WFACTORPARAM2")
        ,@DEDataQueryCodeExp(name="WFACTORTYPE",expression="t1.WFACTORTYPE")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.`CREATEDATE`, t1.`CREATEMAN`, t1.`UPDATEDATE`, t1.`UPDATEMAN`, t1.`WFACTORID`, t1.`WFACTORNAME`, t1.`WFACTORPARAM`, t1.`WFACTORPARAM2`, t1.`WFACTORTYPE` FROM `T_SRFWFACTOR` t1 ",querycodetemp="",declarecode="",dbtype="MYSQL5",
    fieldexps={
        @DEDataQueryCodeExp(name="PARAMS",expression="t1.`PARAMS`")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.`CREATEDATE`")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.`CREATEMAN`")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.`UPDATEDATE`")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.`UPDATEMAN`")
        ,@DEDataQueryCodeExp(name="WFACTORID",expression="t1.`WFACTORID`")
        ,@DEDataQueryCodeExp(name="WFACTORNAME",expression="t1.`WFACTORNAME`")
        ,@DEDataQueryCodeExp(name="WFACTORPARAM",expression="t1.`WFACTORPARAM`")
        ,@DEDataQueryCodeExp(name="WFACTORPARAM2",expression="t1.`WFACTORPARAM2`")
        ,@DEDataQueryCodeExp(name="WFACTORTYPE",expression="t1.`WFACTORTYPE`")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE, t1.CREATEMAN, t1.UPDATEDATE, t1.UPDATEMAN, t1.WFACTORID, t1.WFACTORNAME, t1.WFACTORPARAM, t1.WFACTORPARAM2, t1.WFACTORTYPE FROM T_SRFWFACTOR t1 ",querycodetemp="",declarecode="",dbtype="ORACLE",
    fieldexps={
        @DEDataQueryCodeExp(name="PARAMS",expression="t1.PARAMS")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="WFACTORID",expression="t1.WFACTORID")
        ,@DEDataQueryCodeExp(name="WFACTORNAME",expression="t1.WFACTORNAME")
        ,@DEDataQueryCodeExp(name="WFACTORPARAM",expression="t1.WFACTORPARAM")
        ,@DEDataQueryCodeExp(name="WFACTORPARAM2",expression="t1.WFACTORPARAM2")
        ,@DEDataQueryCodeExp(name="WFACTORTYPE",expression="t1.WFACTORTYPE")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.[CREATEDATE], t1.[CREATEMAN], t1.[UPDATEDATE], t1.[UPDATEMAN], t1.[WFACTORID], t1.[WFACTORNAME], t1.[WFACTORPARAM], t1.[WFACTORPARAM2], t1.[WFACTORTYPE] FROM [T_SRFWFACTOR] t1 ",querycodetemp="",declarecode="",dbtype="SQLSERVER",
    fieldexps={
        @DEDataQueryCodeExp(name="PARAMS",expression="t1.[PARAMS]")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.[CREATEDATE]")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.[CREATEMAN]")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.[UPDATEDATE]")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.[UPDATEMAN]")
        ,@DEDataQueryCodeExp(name="WFACTORID",expression="t1.[WFACTORID]")
        ,@DEDataQueryCodeExp(name="WFACTORNAME",expression="t1.[WFACTORNAME]")
        ,@DEDataQueryCodeExp(name="WFACTORPARAM",expression="t1.[WFACTORPARAM]")
        ,@DEDataQueryCodeExp(name="WFACTORPARAM2",expression="t1.[WFACTORPARAM2]")
        ,@DEDataQueryCodeExp(name="WFACTORTYPE",expression="t1.[WFACTORTYPE]")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE, t1.CREATEMAN, t1.UPDATEDATE, t1.UPDATEMAN, t1.WFACTORID, t1.WFACTORNAME, t1.WFACTORPARAM, t1.WFACTORPARAM2, t1.WFACTORTYPE FROM T_SRFWFACTOR t1 ",querycodetemp="",declarecode="",dbtype="POSTGRESQL",
    fieldexps={
        @DEDataQueryCodeExp(name="PARAMS",expression="t1.PARAMS")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="WFACTORID",expression="t1.WFACTORID")
        ,@DEDataQueryCodeExp(name="WFACTORNAME",expression="t1.WFACTORNAME")
        ,@DEDataQueryCodeExp(name="WFACTORPARAM",expression="t1.WFACTORPARAM")
        ,@DEDataQueryCodeExp(name="WFACTORPARAM2",expression="t1.WFACTORPARAM2")
        ,@DEDataQueryCodeExp(name="WFACTORTYPE",expression="t1.WFACTORTYPE")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE, t1.CREATEMAN, t1.UPDATEDATE, t1.UPDATEMAN, t1.WFACTORID, t1.WFACTORNAME, t1.WFACTORPARAM, t1.WFACTORPARAM2, t1.WFACTORTYPE FROM T_SRFWFACTOR t1 ",querycodetemp="",declarecode="",dbtype="PPAS",
    fieldexps={
        @DEDataQueryCodeExp(name="PARAMS",expression="t1.PARAMS")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="WFACTORID",expression="t1.WFACTORID")
        ,@DEDataQueryCodeExp(name="WFACTORNAME",expression="t1.WFACTORNAME")
        ,@DEDataQueryCodeExp(name="WFACTORPARAM",expression="t1.WFACTORPARAM")
        ,@DEDataQueryCodeExp(name="WFACTORPARAM2",expression="t1.WFACTORPARAM2")
        ,@DEDataQueryCodeExp(name="WFACTORTYPE",expression="t1.WFACTORTYPE")
    },
    conds={})
})
/**
 *  实体数据查询 [DEFAULT]模型基类
 */
public abstract class WFActorDefaultDQModelBase extends net.ibizsys.paas.demodel.DEDataQueryModelBase {

    public WFActorDefaultDQModelBase() {
        super();

        this.initAnnotation(WFActorDefaultDQModelBase.class);
    }

}