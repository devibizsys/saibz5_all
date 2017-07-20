/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package net.ibizsys.psrt.srv.wf.demodel.wftmpstepactor.dataquery;



import net.ibizsys.paas.core.DEDataQuery;
import net.ibizsys.paas.core.DEDataQueryCodes;
import net.ibizsys.paas.core.DEDataQueryCode;
import net.ibizsys.paas.core.DEDataQueryCodeExp;
import net.ibizsys.paas.core.DEDataQueryCodeCond;

@DEDataQuery(id="8D0E57E7-5B46-40AD-AC63-E8B160197457",name="DEFAULT")
@DEDataQueryCodes({
    @DEDataQueryCode(querycode="SELECT t1.CONNECTION, t1.CREATEDATE, t1.CREATEMAN, t1.MEMO, t1.PREVPROCESS, t1.PREVWFSTEPID, t1.PREVWFSTEPNAME, t1.UPDATEDATE, t1.UPDATEMAN, t1.WFACTORID, t1.WFACTORNAME, t1.WFTMPSTEPACTORID, t1.WFTMPSTEPACTORNAME FROM T_SRFWFTMPSTEPACTOR t1 ",querycodetemp="",declarecode="",dbtype="DB2",
    fieldexps={
        @DEDataQueryCodeExp(name="CONNECTION",expression="t1.CONNECTION")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="PREVPROCESS",expression="t1.PREVPROCESS")
        ,@DEDataQueryCodeExp(name="PREVWFSTEPID",expression="t1.PREVWFSTEPID")
        ,@DEDataQueryCodeExp(name="PREVWFSTEPNAME",expression="t1.PREVWFSTEPNAME")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="WFACTORID",expression="t1.WFACTORID")
        ,@DEDataQueryCodeExp(name="WFACTORNAME",expression="t1.WFACTORNAME")
        ,@DEDataQueryCodeExp(name="WFTMPSTEPACTORID",expression="t1.WFTMPSTEPACTORID")
        ,@DEDataQueryCodeExp(name="WFTMPSTEPACTORNAME",expression="t1.WFTMPSTEPACTORNAME")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.`CONNECTION`, t1.`CREATEDATE`, t1.`CREATEMAN`, t1.`MEMO`, t1.`PREVPROCESS`, t1.`PREVWFSTEPID`, t1.`PREVWFSTEPNAME`, t1.`UPDATEDATE`, t1.`UPDATEMAN`, t1.`WFACTORID`, t1.`WFACTORNAME`, t1.`WFTMPSTEPACTORID`, t1.`WFTMPSTEPACTORNAME` FROM `T_SRFWFTMPSTEPACTOR` t1 ",querycodetemp="",declarecode="",dbtype="MYSQL5",
    fieldexps={
        @DEDataQueryCodeExp(name="CONNECTION",expression="t1.`CONNECTION`")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.`CREATEDATE`")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.`CREATEMAN`")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.`MEMO`")
        ,@DEDataQueryCodeExp(name="PREVPROCESS",expression="t1.`PREVPROCESS`")
        ,@DEDataQueryCodeExp(name="PREVWFSTEPID",expression="t1.`PREVWFSTEPID`")
        ,@DEDataQueryCodeExp(name="PREVWFSTEPNAME",expression="t1.`PREVWFSTEPNAME`")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.`UPDATEDATE`")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.`UPDATEMAN`")
        ,@DEDataQueryCodeExp(name="WFACTORID",expression="t1.`WFACTORID`")
        ,@DEDataQueryCodeExp(name="WFACTORNAME",expression="t1.`WFACTORNAME`")
        ,@DEDataQueryCodeExp(name="WFTMPSTEPACTORID",expression="t1.`WFTMPSTEPACTORID`")
        ,@DEDataQueryCodeExp(name="WFTMPSTEPACTORNAME",expression="t1.`WFTMPSTEPACTORNAME`")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CONNECTION, t1.CREATEDATE, t1.CREATEMAN, t1.MEMO, t1.PREVPROCESS, t1.PREVWFSTEPID, t1.PREVWFSTEPNAME, t1.UPDATEDATE, t1.UPDATEMAN, t1.WFACTORID, t1.WFACTORNAME, t1.WFTMPSTEPACTORID, t1.WFTMPSTEPACTORNAME FROM T_SRFWFTMPSTEPACTOR t1 ",querycodetemp="",declarecode="",dbtype="ORACLE",
    fieldexps={
        @DEDataQueryCodeExp(name="CONNECTION",expression="t1.CONNECTION")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="PREVPROCESS",expression="t1.PREVPROCESS")
        ,@DEDataQueryCodeExp(name="PREVWFSTEPID",expression="t1.PREVWFSTEPID")
        ,@DEDataQueryCodeExp(name="PREVWFSTEPNAME",expression="t1.PREVWFSTEPNAME")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="WFACTORID",expression="t1.WFACTORID")
        ,@DEDataQueryCodeExp(name="WFACTORNAME",expression="t1.WFACTORNAME")
        ,@DEDataQueryCodeExp(name="WFTMPSTEPACTORID",expression="t1.WFTMPSTEPACTORID")
        ,@DEDataQueryCodeExp(name="WFTMPSTEPACTORNAME",expression="t1.WFTMPSTEPACTORNAME")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.[CONNECTION], t1.[CREATEDATE], t1.[CREATEMAN], t1.[MEMO], t1.[PREVPROCESS], t1.[PREVWFSTEPID], t1.[PREVWFSTEPNAME], t1.[UPDATEDATE], t1.[UPDATEMAN], t1.[WFACTORID], t1.[WFACTORNAME], t1.[WFTMPSTEPACTORID], t1.[WFTMPSTEPACTORNAME] FROM [T_SRFWFTMPSTEPACTOR] t1 ",querycodetemp="",declarecode="",dbtype="SQLSERVER",
    fieldexps={
        @DEDataQueryCodeExp(name="CONNECTION",expression="t1.[CONNECTION]")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.[CREATEDATE]")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.[CREATEMAN]")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.[MEMO]")
        ,@DEDataQueryCodeExp(name="PREVPROCESS",expression="t1.[PREVPROCESS]")
        ,@DEDataQueryCodeExp(name="PREVWFSTEPID",expression="t1.[PREVWFSTEPID]")
        ,@DEDataQueryCodeExp(name="PREVWFSTEPNAME",expression="t1.[PREVWFSTEPNAME]")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.[UPDATEDATE]")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.[UPDATEMAN]")
        ,@DEDataQueryCodeExp(name="WFACTORID",expression="t1.[WFACTORID]")
        ,@DEDataQueryCodeExp(name="WFACTORNAME",expression="t1.[WFACTORNAME]")
        ,@DEDataQueryCodeExp(name="WFTMPSTEPACTORID",expression="t1.[WFTMPSTEPACTORID]")
        ,@DEDataQueryCodeExp(name="WFTMPSTEPACTORNAME",expression="t1.[WFTMPSTEPACTORNAME]")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CONNECTION, t1.CREATEDATE, t1.CREATEMAN, t1.MEMO, t1.PREVPROCESS, t1.PREVWFSTEPID, t1.PREVWFSTEPNAME, t1.UPDATEDATE, t1.UPDATEMAN, t1.WFACTORID, t1.WFACTORNAME, t1.WFTMPSTEPACTORID, t1.WFTMPSTEPACTORNAME FROM T_SRFWFTMPSTEPACTOR t1 ",querycodetemp="",declarecode="",dbtype="POSTGRESQL",
    fieldexps={
        @DEDataQueryCodeExp(name="CONNECTION",expression="t1.CONNECTION")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="PREVPROCESS",expression="t1.PREVPROCESS")
        ,@DEDataQueryCodeExp(name="PREVWFSTEPID",expression="t1.PREVWFSTEPID")
        ,@DEDataQueryCodeExp(name="PREVWFSTEPNAME",expression="t1.PREVWFSTEPNAME")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="WFACTORID",expression="t1.WFACTORID")
        ,@DEDataQueryCodeExp(name="WFACTORNAME",expression="t1.WFACTORNAME")
        ,@DEDataQueryCodeExp(name="WFTMPSTEPACTORID",expression="t1.WFTMPSTEPACTORID")
        ,@DEDataQueryCodeExp(name="WFTMPSTEPACTORNAME",expression="t1.WFTMPSTEPACTORNAME")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CONNECTION, t1.CREATEDATE, t1.CREATEMAN, t1.MEMO, t1.PREVPROCESS, t1.PREVWFSTEPID, t1.PREVWFSTEPNAME, t1.UPDATEDATE, t1.UPDATEMAN, t1.WFACTORID, t1.WFACTORNAME, t1.WFTMPSTEPACTORID, t1.WFTMPSTEPACTORNAME FROM T_SRFWFTMPSTEPACTOR t1 ",querycodetemp="",declarecode="",dbtype="PPAS",
    fieldexps={
        @DEDataQueryCodeExp(name="CONNECTION",expression="t1.CONNECTION")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="PREVPROCESS",expression="t1.PREVPROCESS")
        ,@DEDataQueryCodeExp(name="PREVWFSTEPID",expression="t1.PREVWFSTEPID")
        ,@DEDataQueryCodeExp(name="PREVWFSTEPNAME",expression="t1.PREVWFSTEPNAME")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="WFACTORID",expression="t1.WFACTORID")
        ,@DEDataQueryCodeExp(name="WFACTORNAME",expression="t1.WFACTORNAME")
        ,@DEDataQueryCodeExp(name="WFTMPSTEPACTORID",expression="t1.WFTMPSTEPACTORID")
        ,@DEDataQueryCodeExp(name="WFTMPSTEPACTORNAME",expression="t1.WFTMPSTEPACTORNAME")
    },
    conds={})
})
/**
 *  实体数据查询 [DEFAULT]模型基类
 */
public abstract class WFTmpStepActorDefaultDQModelBase extends net.ibizsys.paas.demodel.DEDataQueryModelBase {

    public WFTmpStepActorDefaultDQModelBase() {
        super();

        this.initAnnotation(WFTmpStepActorDefaultDQModelBase.class);
    }

}