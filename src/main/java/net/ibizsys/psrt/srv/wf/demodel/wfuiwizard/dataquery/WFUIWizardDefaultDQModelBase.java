/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package net.ibizsys.psrt.srv.wf.demodel.wfuiwizard.dataquery;



import net.ibizsys.paas.core.DEDataQuery;
import net.ibizsys.paas.core.DEDataQueryCodes;
import net.ibizsys.paas.core.DEDataQueryCode;
import net.ibizsys.paas.core.DEDataQueryCodeExp;
import net.ibizsys.paas.core.DEDataQueryCodeCond;

@DEDataQuery(id="A42F37CA-9CD0-4B2D-9653-CFDC7B59AFBF",name="DEFAULT")
@DEDataQueryCodes({
    @DEDataQueryCode(querycode="SELECT t1.ACTIONMODE AS ACTIONMODE, t1.CREATEDATE AS CREATEDATE, t1.CREATEMAN AS CREATEMAN, t1.DATAINFO AS DATAINFO, t1.UPDATEDATE AS UPDATEDATE, t1.UPDATEMAN AS UPDATEMAN, t1.WFSTEPVALUE AS WFSTEPVALUE, t1.WFUIWIZARDID AS WFUIWIZARDID, t1.WFUIWIZARDNAME AS WFUIWIZARDNAME FROM t_WFUIWIZARD t1 ",querycodetemp="",declarecode="",dbtype="DB2",
    fieldexps={
        @DEDataQueryCodeExp(name="ACTIONPARAM",expression="t1.ACTIONPARAM")
        ,@DEDataQueryCodeExp(name="ACTIONMODE",expression="t1.ACTIONMODE")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="DATAINFO",expression="t1.DATAINFO")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="WFSTEPVALUE",expression="t1.WFSTEPVALUE")
        ,@DEDataQueryCodeExp(name="WFUIWIZARDID",expression="t1.WFUIWIZARDID")
        ,@DEDataQueryCodeExp(name="WFUIWIZARDNAME",expression="t1.WFUIWIZARDNAME")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.`ACTIONMODE` AS `ACTIONMODE`, t1.`CREATEDATE` AS `CREATEDATE`, t1.`CREATEMAN` AS `CREATEMAN`, t1.`DATAINFO` AS `DATAINFO`, t1.`UPDATEDATE` AS `UPDATEDATE`, t1.`UPDATEMAN` AS `UPDATEMAN`, t1.`WFSTEPVALUE` AS `WFSTEPVALUE`, t1.`WFUIWIZARDID` AS `WFUIWIZARDID`, t1.`WFUIWIZARDNAME` AS `WFUIWIZARDNAME` FROM `t_WFUIWIZARD` t1 ",querycodetemp="",declarecode="",dbtype="MYSQL5",
    fieldexps={
        @DEDataQueryCodeExp(name="ACTIONPARAM",expression="t1.`ACTIONPARAM`")
        ,@DEDataQueryCodeExp(name="ACTIONMODE",expression="t1.`ACTIONMODE`")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.`CREATEDATE`")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.`CREATEMAN`")
        ,@DEDataQueryCodeExp(name="DATAINFO",expression="t1.`DATAINFO`")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.`UPDATEDATE`")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.`UPDATEMAN`")
        ,@DEDataQueryCodeExp(name="WFSTEPVALUE",expression="t1.`WFSTEPVALUE`")
        ,@DEDataQueryCodeExp(name="WFUIWIZARDID",expression="t1.`WFUIWIZARDID`")
        ,@DEDataQueryCodeExp(name="WFUIWIZARDNAME",expression="t1.`WFUIWIZARDNAME`")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.ACTIONMODE AS ACTIONMODE, t1.CREATEDATE AS CREATEDATE, t1.CREATEMAN AS CREATEMAN, t1.DATAINFO AS DATAINFO, t1.UPDATEDATE AS UPDATEDATE, t1.UPDATEMAN AS UPDATEMAN, t1.WFSTEPVALUE AS WFSTEPVALUE, t1.WFUIWIZARDID AS WFUIWIZARDID, t1.WFUIWIZARDNAME AS WFUIWIZARDNAME FROM t_WFUIWIZARD t1 ",querycodetemp="",declarecode="",dbtype="ORACLE",
    fieldexps={
        @DEDataQueryCodeExp(name="ACTIONPARAM",expression="t1.ACTIONPARAM")
        ,@DEDataQueryCodeExp(name="ACTIONMODE",expression="t1.ACTIONMODE")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="DATAINFO",expression="t1.DATAINFO")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="WFSTEPVALUE",expression="t1.WFSTEPVALUE")
        ,@DEDataQueryCodeExp(name="WFUIWIZARDID",expression="t1.WFUIWIZARDID")
        ,@DEDataQueryCodeExp(name="WFUIWIZARDNAME",expression="t1.WFUIWIZARDNAME")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.[ACTIONMODE] AS [ACTIONMODE], t1.[CREATEDATE] AS [CREATEDATE], t1.[CREATEMAN] AS [CREATEMAN], t1.[DATAINFO] AS [DATAINFO], t1.[UPDATEDATE] AS [UPDATEDATE], t1.[UPDATEMAN] AS [UPDATEMAN], t1.[WFSTEPVALUE] AS [WFSTEPVALUE], t1.[WFUIWIZARDID] AS [WFUIWIZARDID], t1.[WFUIWIZARDNAME] AS [WFUIWIZARDNAME] FROM [t_WFUIWIZARD] t1 ",querycodetemp="",declarecode="",dbtype="SQLSERVER",
    fieldexps={
        @DEDataQueryCodeExp(name="ACTIONPARAM",expression="t1.[ACTIONPARAM]")
        ,@DEDataQueryCodeExp(name="ACTIONMODE",expression="t1.[ACTIONMODE]")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.[CREATEDATE]")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.[CREATEMAN]")
        ,@DEDataQueryCodeExp(name="DATAINFO",expression="t1.[DATAINFO]")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.[UPDATEDATE]")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.[UPDATEMAN]")
        ,@DEDataQueryCodeExp(name="WFSTEPVALUE",expression="t1.[WFSTEPVALUE]")
        ,@DEDataQueryCodeExp(name="WFUIWIZARDID",expression="t1.[WFUIWIZARDID]")
        ,@DEDataQueryCodeExp(name="WFUIWIZARDNAME",expression="t1.[WFUIWIZARDNAME]")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.ACTIONMODE AS ACTIONMODE, t1.CREATEDATE AS CREATEDATE, t1.CREATEMAN AS CREATEMAN, t1.DATAINFO AS DATAINFO, t1.UPDATEDATE AS UPDATEDATE, t1.UPDATEMAN AS UPDATEMAN, t1.WFSTEPVALUE AS WFSTEPVALUE, t1.WFUIWIZARDID AS WFUIWIZARDID, t1.WFUIWIZARDNAME AS WFUIWIZARDNAME FROM t_WFUIWIZARD t1 ",querycodetemp="",declarecode="",dbtype="POSTGRESQL",
    fieldexps={
        @DEDataQueryCodeExp(name="ACTIONPARAM",expression="t1.ACTIONPARAM")
        ,@DEDataQueryCodeExp(name="ACTIONMODE",expression="t1.ACTIONMODE")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="DATAINFO",expression="t1.DATAINFO")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="WFSTEPVALUE",expression="t1.WFSTEPVALUE")
        ,@DEDataQueryCodeExp(name="WFUIWIZARDID",expression="t1.WFUIWIZARDID")
        ,@DEDataQueryCodeExp(name="WFUIWIZARDNAME",expression="t1.WFUIWIZARDNAME")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.ACTIONMODE AS ACTIONMODE, t1.CREATEDATE AS CREATEDATE, t1.CREATEMAN AS CREATEMAN, t1.DATAINFO AS DATAINFO, t1.UPDATEDATE AS UPDATEDATE, t1.UPDATEMAN AS UPDATEMAN, t1.WFSTEPVALUE AS WFSTEPVALUE, t1.WFUIWIZARDID AS WFUIWIZARDID, t1.WFUIWIZARDNAME AS WFUIWIZARDNAME FROM t_WFUIWIZARD t1 ",querycodetemp="",declarecode="",dbtype="PPAS",
    fieldexps={
        @DEDataQueryCodeExp(name="ACTIONPARAM",expression="t1.ACTIONPARAM")
        ,@DEDataQueryCodeExp(name="ACTIONMODE",expression="t1.ACTIONMODE")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="DATAINFO",expression="t1.DATAINFO")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="WFSTEPVALUE",expression="t1.WFSTEPVALUE")
        ,@DEDataQueryCodeExp(name="WFUIWIZARDID",expression="t1.WFUIWIZARDID")
        ,@DEDataQueryCodeExp(name="WFUIWIZARDNAME",expression="t1.WFUIWIZARDNAME")
    },
    conds={})
})
/**
 *  实体数据查询 [DEFAULT]模型基类
 */
public abstract class WFUIWizardDefaultDQModelBase extends net.ibizsys.paas.demodel.DEDataQueryModelBase {

    public WFUIWizardDefaultDQModelBase() {
        super();

        this.initAnnotation(WFUIWizardDefaultDQModelBase.class);
    }

}