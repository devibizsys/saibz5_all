/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package net.ibizsys.psrt.srv.wf.demodel.wfworkflow.dataquery;



import net.ibizsys.paas.core.DEDataQuery;
import net.ibizsys.paas.core.DEDataQueryCodes;
import net.ibizsys.paas.core.DEDataQueryCode;
import net.ibizsys.paas.core.DEDataQueryCodeExp;
import net.ibizsys.paas.core.DEDataQueryCodeCond;

@DEDataQuery(id="18EFC399-B211-44D6-B9AF-AF182EE81D53",name="DEFAULT")
@DEDataQueryCodes({
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE, t1.CREATEMAN, t1.ENABLE, t1.MEMO, t1.REMINDMSGTEMPLID, t11.MSGTEMPLATENAME AS REMINDMSGTEMPLNAME, t1.UPDATEDATE, t1.UPDATEMAN, t1.USERDATACMD, t1.USERDATACMD10, t1.USERDATACMD2, t1.USERDATACMD3, t1.USERDATACMD4, t1.USERDATACMD5, t1.USERDATACMD6, t1.USERDATACMD7, t1.USERDATACMD8, t1.USERDATACMD9, t1.USERDATANAME, t1.WFHELPER, t1.WFHELPERPARAM, t1.WFLOGICNAME, t1.WFSTATE, t1.WFTYPE, t1.WFVERSION, t1.WFWORKFLOWID, t1.WFWORKFLOWNAME FROM T_SRFWFWORKFLOW t1  LEFT JOIN T_SRFMSGTEMPLATE t11 ON t1.REMINDMSGTEMPLID = t11.MSGTEMPLATEID ",querycodetemp="",declarecode="",dbtype="DB2",
    fieldexps={
        @DEDataQueryCodeExp(name="WFMODEL",expression="t1.WFMODEL")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="ENABLE",expression="t1.ENABLE")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="REMINDMSGTEMPLID",expression="t1.REMINDMSGTEMPLID")
        ,@DEDataQueryCodeExp(name="REMINDMSGTEMPLNAME",expression="t11.MSGTEMPLATENAME")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="USERDATACMD",expression="t1.USERDATACMD")
        ,@DEDataQueryCodeExp(name="USERDATACMD10",expression="t1.USERDATACMD10")
        ,@DEDataQueryCodeExp(name="USERDATACMD2",expression="t1.USERDATACMD2")
        ,@DEDataQueryCodeExp(name="USERDATACMD3",expression="t1.USERDATACMD3")
        ,@DEDataQueryCodeExp(name="USERDATACMD4",expression="t1.USERDATACMD4")
        ,@DEDataQueryCodeExp(name="USERDATACMD5",expression="t1.USERDATACMD5")
        ,@DEDataQueryCodeExp(name="USERDATACMD6",expression="t1.USERDATACMD6")
        ,@DEDataQueryCodeExp(name="USERDATACMD7",expression="t1.USERDATACMD7")
        ,@DEDataQueryCodeExp(name="USERDATACMD8",expression="t1.USERDATACMD8")
        ,@DEDataQueryCodeExp(name="USERDATACMD9",expression="t1.USERDATACMD9")
        ,@DEDataQueryCodeExp(name="USERDATANAME",expression="t1.USERDATANAME")
        ,@DEDataQueryCodeExp(name="WFHELPER",expression="t1.WFHELPER")
        ,@DEDataQueryCodeExp(name="WFHELPERPARAM",expression="t1.WFHELPERPARAM")
        ,@DEDataQueryCodeExp(name="WFLOGICNAME",expression="t1.WFLOGICNAME")
        ,@DEDataQueryCodeExp(name="WFSTATE",expression="t1.WFSTATE")
        ,@DEDataQueryCodeExp(name="WFTYPE",expression="t1.WFTYPE")
        ,@DEDataQueryCodeExp(name="WFVERSION",expression="t1.WFVERSION")
        ,@DEDataQueryCodeExp(name="WFWORKFLOWID",expression="t1.WFWORKFLOWID")
        ,@DEDataQueryCodeExp(name="WFWORKFLOWNAME",expression="t1.WFWORKFLOWNAME")
    },
    conds={
        @DEDataQueryCodeCond(condition="t1.ENABLE = 1")
    }),
    @DEDataQueryCode(querycode="SELECT t1.`CREATEDATE`, t1.`CREATEMAN`, t1.`ENABLE`, t1.`MEMO`, t1.`REMINDMSGTEMPLID`, t11.`MSGTEMPLATENAME` AS `REMINDMSGTEMPLNAME`, t1.`UPDATEDATE`, t1.`UPDATEMAN`, t1.`USERDATACMD`, t1.`USERDATACMD10`, t1.`USERDATACMD2`, t1.`USERDATACMD3`, t1.`USERDATACMD4`, t1.`USERDATACMD5`, t1.`USERDATACMD6`, t1.`USERDATACMD7`, t1.`USERDATACMD8`, t1.`USERDATACMD9`, t1.`USERDATANAME`, t1.`WFHELPER`, t1.`WFHELPERPARAM`, t1.`WFLOGICNAME`, t1.`WFSTATE`, t1.`WFTYPE`, t1.`WFVERSION`, t1.`WFWORKFLOWID`, t1.`WFWORKFLOWNAME` FROM `T_SRFWFWORKFLOW` t1  LEFT JOIN T_SRFMSGTEMPLATE t11 ON t1.REMINDMSGTEMPLID = t11.MSGTEMPLATEID ",querycodetemp="",declarecode="",dbtype="MYSQL5",
    fieldexps={
        @DEDataQueryCodeExp(name="WFMODEL",expression="t1.`WFMODEL`")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.`CREATEDATE`")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.`CREATEMAN`")
        ,@DEDataQueryCodeExp(name="ENABLE",expression="t1.`ENABLE`")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.`MEMO`")
        ,@DEDataQueryCodeExp(name="REMINDMSGTEMPLID",expression="t1.`REMINDMSGTEMPLID`")
        ,@DEDataQueryCodeExp(name="REMINDMSGTEMPLNAME",expression="t11.`MSGTEMPLATENAME`")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.`UPDATEDATE`")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.`UPDATEMAN`")
        ,@DEDataQueryCodeExp(name="USERDATACMD",expression="t1.`USERDATACMD`")
        ,@DEDataQueryCodeExp(name="USERDATACMD10",expression="t1.`USERDATACMD10`")
        ,@DEDataQueryCodeExp(name="USERDATACMD2",expression="t1.`USERDATACMD2`")
        ,@DEDataQueryCodeExp(name="USERDATACMD3",expression="t1.`USERDATACMD3`")
        ,@DEDataQueryCodeExp(name="USERDATACMD4",expression="t1.`USERDATACMD4`")
        ,@DEDataQueryCodeExp(name="USERDATACMD5",expression="t1.`USERDATACMD5`")
        ,@DEDataQueryCodeExp(name="USERDATACMD6",expression="t1.`USERDATACMD6`")
        ,@DEDataQueryCodeExp(name="USERDATACMD7",expression="t1.`USERDATACMD7`")
        ,@DEDataQueryCodeExp(name="USERDATACMD8",expression="t1.`USERDATACMD8`")
        ,@DEDataQueryCodeExp(name="USERDATACMD9",expression="t1.`USERDATACMD9`")
        ,@DEDataQueryCodeExp(name="USERDATANAME",expression="t1.`USERDATANAME`")
        ,@DEDataQueryCodeExp(name="WFHELPER",expression="t1.`WFHELPER`")
        ,@DEDataQueryCodeExp(name="WFHELPERPARAM",expression="t1.`WFHELPERPARAM`")
        ,@DEDataQueryCodeExp(name="WFLOGICNAME",expression="t1.`WFLOGICNAME`")
        ,@DEDataQueryCodeExp(name="WFSTATE",expression="t1.`WFSTATE`")
        ,@DEDataQueryCodeExp(name="WFTYPE",expression="t1.`WFTYPE`")
        ,@DEDataQueryCodeExp(name="WFVERSION",expression="t1.`WFVERSION`")
        ,@DEDataQueryCodeExp(name="WFWORKFLOWID",expression="t1.`WFWORKFLOWID`")
        ,@DEDataQueryCodeExp(name="WFWORKFLOWNAME",expression="t1.`WFWORKFLOWNAME`")
    },
    conds={
        @DEDataQueryCodeCond(condition="t1.ENABLE = 1")
    }),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE, t1.CREATEMAN, t1.ENABLE, t1.MEMO, t1.REMINDMSGTEMPLID, t11.MSGTEMPLATENAME AS REMINDMSGTEMPLNAME, t1.UPDATEDATE, t1.UPDATEMAN, t1.USERDATACMD, t1.USERDATACMD10, t1.USERDATACMD2, t1.USERDATACMD3, t1.USERDATACMD4, t1.USERDATACMD5, t1.USERDATACMD6, t1.USERDATACMD7, t1.USERDATACMD8, t1.USERDATACMD9, t1.USERDATANAME, t1.WFHELPER, t1.WFHELPERPARAM, t1.WFLOGICNAME, t1.WFSTATE, t1.WFTYPE, t1.WFVERSION, t1.WFWORKFLOWID, t1.WFWORKFLOWNAME FROM T_SRFWFWORKFLOW t1  LEFT JOIN T_SRFMSGTEMPLATE t11 ON t1.REMINDMSGTEMPLID = t11.MSGTEMPLATEID ",querycodetemp="",declarecode="",dbtype="ORACLE",
    fieldexps={
        @DEDataQueryCodeExp(name="WFMODEL",expression="t1.WFMODEL")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="ENABLE",expression="t1.ENABLE")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="REMINDMSGTEMPLID",expression="t1.REMINDMSGTEMPLID")
        ,@DEDataQueryCodeExp(name="REMINDMSGTEMPLNAME",expression="t11.MSGTEMPLATENAME")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="USERDATACMD",expression="t1.USERDATACMD")
        ,@DEDataQueryCodeExp(name="USERDATACMD10",expression="t1.USERDATACMD10")
        ,@DEDataQueryCodeExp(name="USERDATACMD2",expression="t1.USERDATACMD2")
        ,@DEDataQueryCodeExp(name="USERDATACMD3",expression="t1.USERDATACMD3")
        ,@DEDataQueryCodeExp(name="USERDATACMD4",expression="t1.USERDATACMD4")
        ,@DEDataQueryCodeExp(name="USERDATACMD5",expression="t1.USERDATACMD5")
        ,@DEDataQueryCodeExp(name="USERDATACMD6",expression="t1.USERDATACMD6")
        ,@DEDataQueryCodeExp(name="USERDATACMD7",expression="t1.USERDATACMD7")
        ,@DEDataQueryCodeExp(name="USERDATACMD8",expression="t1.USERDATACMD8")
        ,@DEDataQueryCodeExp(name="USERDATACMD9",expression="t1.USERDATACMD9")
        ,@DEDataQueryCodeExp(name="USERDATANAME",expression="t1.USERDATANAME")
        ,@DEDataQueryCodeExp(name="WFHELPER",expression="t1.WFHELPER")
        ,@DEDataQueryCodeExp(name="WFHELPERPARAM",expression="t1.WFHELPERPARAM")
        ,@DEDataQueryCodeExp(name="WFLOGICNAME",expression="t1.WFLOGICNAME")
        ,@DEDataQueryCodeExp(name="WFSTATE",expression="t1.WFSTATE")
        ,@DEDataQueryCodeExp(name="WFTYPE",expression="t1.WFTYPE")
        ,@DEDataQueryCodeExp(name="WFVERSION",expression="t1.WFVERSION")
        ,@DEDataQueryCodeExp(name="WFWORKFLOWID",expression="t1.WFWORKFLOWID")
        ,@DEDataQueryCodeExp(name="WFWORKFLOWNAME",expression="t1.WFWORKFLOWNAME")
    },
    conds={
        @DEDataQueryCodeCond(condition="t1.ENABLE = 1")
    }),
    @DEDataQueryCode(querycode="SELECT t1.[CREATEDATE], t1.[CREATEMAN], t1.[ENABLE], t1.[MEMO], t1.[REMINDMSGTEMPLID], t11.[MSGTEMPLATENAME] AS [REMINDMSGTEMPLNAME], t1.[UPDATEDATE], t1.[UPDATEMAN], t1.[USERDATACMD], t1.[USERDATACMD10], t1.[USERDATACMD2], t1.[USERDATACMD3], t1.[USERDATACMD4], t1.[USERDATACMD5], t1.[USERDATACMD6], t1.[USERDATACMD7], t1.[USERDATACMD8], t1.[USERDATACMD9], t1.[USERDATANAME], t1.[WFHELPER], t1.[WFHELPERPARAM], t1.[WFLOGICNAME], t1.[WFSTATE], t1.[WFTYPE], t1.[WFVERSION], t1.[WFWORKFLOWID], t1.[WFWORKFLOWNAME] FROM [T_SRFWFWORKFLOW] t1  LEFT JOIN T_SRFMSGTEMPLATE t11 ON t1.REMINDMSGTEMPLID = t11.MSGTEMPLATEID ",querycodetemp="",declarecode="",dbtype="SQLSERVER",
    fieldexps={
        @DEDataQueryCodeExp(name="WFMODEL",expression="t1.[WFMODEL]")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.[CREATEDATE]")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.[CREATEMAN]")
        ,@DEDataQueryCodeExp(name="ENABLE",expression="t1.[ENABLE]")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.[MEMO]")
        ,@DEDataQueryCodeExp(name="REMINDMSGTEMPLID",expression="t1.[REMINDMSGTEMPLID]")
        ,@DEDataQueryCodeExp(name="REMINDMSGTEMPLNAME",expression="t11.[MSGTEMPLATENAME]")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.[UPDATEDATE]")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.[UPDATEMAN]")
        ,@DEDataQueryCodeExp(name="USERDATACMD",expression="t1.[USERDATACMD]")
        ,@DEDataQueryCodeExp(name="USERDATACMD10",expression="t1.[USERDATACMD10]")
        ,@DEDataQueryCodeExp(name="USERDATACMD2",expression="t1.[USERDATACMD2]")
        ,@DEDataQueryCodeExp(name="USERDATACMD3",expression="t1.[USERDATACMD3]")
        ,@DEDataQueryCodeExp(name="USERDATACMD4",expression="t1.[USERDATACMD4]")
        ,@DEDataQueryCodeExp(name="USERDATACMD5",expression="t1.[USERDATACMD5]")
        ,@DEDataQueryCodeExp(name="USERDATACMD6",expression="t1.[USERDATACMD6]")
        ,@DEDataQueryCodeExp(name="USERDATACMD7",expression="t1.[USERDATACMD7]")
        ,@DEDataQueryCodeExp(name="USERDATACMD8",expression="t1.[USERDATACMD8]")
        ,@DEDataQueryCodeExp(name="USERDATACMD9",expression="t1.[USERDATACMD9]")
        ,@DEDataQueryCodeExp(name="USERDATANAME",expression="t1.[USERDATANAME]")
        ,@DEDataQueryCodeExp(name="WFHELPER",expression="t1.[WFHELPER]")
        ,@DEDataQueryCodeExp(name="WFHELPERPARAM",expression="t1.[WFHELPERPARAM]")
        ,@DEDataQueryCodeExp(name="WFLOGICNAME",expression="t1.[WFLOGICNAME]")
        ,@DEDataQueryCodeExp(name="WFSTATE",expression="t1.[WFSTATE]")
        ,@DEDataQueryCodeExp(name="WFTYPE",expression="t1.[WFTYPE]")
        ,@DEDataQueryCodeExp(name="WFVERSION",expression="t1.[WFVERSION]")
        ,@DEDataQueryCodeExp(name="WFWORKFLOWID",expression="t1.[WFWORKFLOWID]")
        ,@DEDataQueryCodeExp(name="WFWORKFLOWNAME",expression="t1.[WFWORKFLOWNAME]")
    },
    conds={
        @DEDataQueryCodeCond(condition="t1.ENABLE = 1")
    }),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE, t1.CREATEMAN, t1.ENABLE, t1.MEMO, t1.REMINDMSGTEMPLID, t11.MSGTEMPLATENAME AS REMINDMSGTEMPLNAME, t1.UPDATEDATE, t1.UPDATEMAN, t1.USERDATACMD, t1.USERDATACMD10, t1.USERDATACMD2, t1.USERDATACMD3, t1.USERDATACMD4, t1.USERDATACMD5, t1.USERDATACMD6, t1.USERDATACMD7, t1.USERDATACMD8, t1.USERDATACMD9, t1.USERDATANAME, t1.WFHELPER, t1.WFHELPERPARAM, t1.WFLOGICNAME, t1.WFSTATE, t1.WFTYPE, t1.WFVERSION, t1.WFWORKFLOWID, t1.WFWORKFLOWNAME FROM T_SRFWFWORKFLOW t1  LEFT JOIN T_SRFMSGTEMPLATE t11 ON t1.REMINDMSGTEMPLID = t11.MSGTEMPLATEID ",querycodetemp="",declarecode="",dbtype="POSTGRESQL",
    fieldexps={
        @DEDataQueryCodeExp(name="WFMODEL",expression="t1.WFMODEL")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="ENABLE",expression="t1.ENABLE")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="REMINDMSGTEMPLID",expression="t1.REMINDMSGTEMPLID")
        ,@DEDataQueryCodeExp(name="REMINDMSGTEMPLNAME",expression="t11.MSGTEMPLATENAME")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="USERDATACMD",expression="t1.USERDATACMD")
        ,@DEDataQueryCodeExp(name="USERDATACMD10",expression="t1.USERDATACMD10")
        ,@DEDataQueryCodeExp(name="USERDATACMD2",expression="t1.USERDATACMD2")
        ,@DEDataQueryCodeExp(name="USERDATACMD3",expression="t1.USERDATACMD3")
        ,@DEDataQueryCodeExp(name="USERDATACMD4",expression="t1.USERDATACMD4")
        ,@DEDataQueryCodeExp(name="USERDATACMD5",expression="t1.USERDATACMD5")
        ,@DEDataQueryCodeExp(name="USERDATACMD6",expression="t1.USERDATACMD6")
        ,@DEDataQueryCodeExp(name="USERDATACMD7",expression="t1.USERDATACMD7")
        ,@DEDataQueryCodeExp(name="USERDATACMD8",expression="t1.USERDATACMD8")
        ,@DEDataQueryCodeExp(name="USERDATACMD9",expression="t1.USERDATACMD9")
        ,@DEDataQueryCodeExp(name="USERDATANAME",expression="t1.USERDATANAME")
        ,@DEDataQueryCodeExp(name="WFHELPER",expression="t1.WFHELPER")
        ,@DEDataQueryCodeExp(name="WFHELPERPARAM",expression="t1.WFHELPERPARAM")
        ,@DEDataQueryCodeExp(name="WFLOGICNAME",expression="t1.WFLOGICNAME")
        ,@DEDataQueryCodeExp(name="WFSTATE",expression="t1.WFSTATE")
        ,@DEDataQueryCodeExp(name="WFTYPE",expression="t1.WFTYPE")
        ,@DEDataQueryCodeExp(name="WFVERSION",expression="t1.WFVERSION")
        ,@DEDataQueryCodeExp(name="WFWORKFLOWID",expression="t1.WFWORKFLOWID")
        ,@DEDataQueryCodeExp(name="WFWORKFLOWNAME",expression="t1.WFWORKFLOWNAME")
    },
    conds={
        @DEDataQueryCodeCond(condition="t1.ENABLE = 1")
    }),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE, t1.CREATEMAN, t1.ENABLE, t1.MEMO, t1.REMINDMSGTEMPLID, t11.MSGTEMPLATENAME AS REMINDMSGTEMPLNAME, t1.UPDATEDATE, t1.UPDATEMAN, t1.USERDATACMD, t1.USERDATACMD10, t1.USERDATACMD2, t1.USERDATACMD3, t1.USERDATACMD4, t1.USERDATACMD5, t1.USERDATACMD6, t1.USERDATACMD7, t1.USERDATACMD8, t1.USERDATACMD9, t1.USERDATANAME, t1.WFHELPER, t1.WFHELPERPARAM, t1.WFLOGICNAME, t1.WFSTATE, t1.WFTYPE, t1.WFVERSION, t1.WFWORKFLOWID, t1.WFWORKFLOWNAME FROM T_SRFWFWORKFLOW t1  LEFT JOIN T_SRFMSGTEMPLATE t11 ON t1.REMINDMSGTEMPLID = t11.MSGTEMPLATEID ",querycodetemp="",declarecode="",dbtype="PPAS",
    fieldexps={
        @DEDataQueryCodeExp(name="WFMODEL",expression="t1.WFMODEL")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="ENABLE",expression="t1.ENABLE")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="REMINDMSGTEMPLID",expression="t1.REMINDMSGTEMPLID")
        ,@DEDataQueryCodeExp(name="REMINDMSGTEMPLNAME",expression="t11.MSGTEMPLATENAME")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="USERDATACMD",expression="t1.USERDATACMD")
        ,@DEDataQueryCodeExp(name="USERDATACMD10",expression="t1.USERDATACMD10")
        ,@DEDataQueryCodeExp(name="USERDATACMD2",expression="t1.USERDATACMD2")
        ,@DEDataQueryCodeExp(name="USERDATACMD3",expression="t1.USERDATACMD3")
        ,@DEDataQueryCodeExp(name="USERDATACMD4",expression="t1.USERDATACMD4")
        ,@DEDataQueryCodeExp(name="USERDATACMD5",expression="t1.USERDATACMD5")
        ,@DEDataQueryCodeExp(name="USERDATACMD6",expression="t1.USERDATACMD6")
        ,@DEDataQueryCodeExp(name="USERDATACMD7",expression="t1.USERDATACMD7")
        ,@DEDataQueryCodeExp(name="USERDATACMD8",expression="t1.USERDATACMD8")
        ,@DEDataQueryCodeExp(name="USERDATACMD9",expression="t1.USERDATACMD9")
        ,@DEDataQueryCodeExp(name="USERDATANAME",expression="t1.USERDATANAME")
        ,@DEDataQueryCodeExp(name="WFHELPER",expression="t1.WFHELPER")
        ,@DEDataQueryCodeExp(name="WFHELPERPARAM",expression="t1.WFHELPERPARAM")
        ,@DEDataQueryCodeExp(name="WFLOGICNAME",expression="t1.WFLOGICNAME")
        ,@DEDataQueryCodeExp(name="WFSTATE",expression="t1.WFSTATE")
        ,@DEDataQueryCodeExp(name="WFTYPE",expression="t1.WFTYPE")
        ,@DEDataQueryCodeExp(name="WFVERSION",expression="t1.WFVERSION")
        ,@DEDataQueryCodeExp(name="WFWORKFLOWID",expression="t1.WFWORKFLOWID")
        ,@DEDataQueryCodeExp(name="WFWORKFLOWNAME",expression="t1.WFWORKFLOWNAME")
    },
    conds={
        @DEDataQueryCodeCond(condition="t1.ENABLE = 1")
    })
})
/**
 *  实体数据查询 [DEFAULT]模型基类
 */
public abstract class WFWorkflowDefaultDQModelBase extends net.ibizsys.paas.demodel.DEDataQueryModelBase {

    public WFWorkflowDefaultDQModelBase() {
        super();

        this.initAnnotation(WFWorkflowDefaultDQModelBase.class);
    }

}