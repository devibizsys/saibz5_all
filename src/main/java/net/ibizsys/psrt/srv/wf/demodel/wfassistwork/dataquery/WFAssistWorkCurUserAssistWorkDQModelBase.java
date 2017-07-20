/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package net.ibizsys.psrt.srv.wf.demodel.wfassistwork.dataquery;



import net.ibizsys.paas.core.DEDataQuery;
import net.ibizsys.paas.core.DEDataQueryCodes;
import net.ibizsys.paas.core.DEDataQueryCode;
import net.ibizsys.paas.core.DEDataQueryCodeExp;
import net.ibizsys.paas.core.DEDataQueryCodeCond;

@DEDataQuery(id="8664F623-FF9B-42A5-8E56-EEFE09023E56",name="CurUserAssistWork")
@DEDataQueryCodes({
    @DEDataQueryCode(querycode="select t2.WFINSTANCEID AS WFASSISTWORKID,t2.WFINSTANCENAME  AS WFASSISTWORKNAME,t2.WFINSTANCEID,t2.WFINSTANCENAME,t2.ACTIVESTEPID,t2.USERDATA,t3.WFWORKFLOWID,t3.WFWORKFLOWNAME,t1.WFPLOGICNAME,t4.ACTORID,t4.CREATEDATE,t4.WFSTEPACTORNAME,t1.WFSTEPNAME,t2.USERDATA4,t4.WFSTEPACTORID from T_SRFWFSTEP t1 INNER JOIN t_SRFWFINSTANCE t2 on  t2.ACTIVESTEPID = t1.WFSTEPID AND ( t2.ISCLOSE IS NULL OR t2.ISCLOSE=0)  INNER JOIN T_SRFWFWORKFLOW t3 on t2.WFWORKFLOWID = t3.WFWORKFLOWID  INNER JOIN T_SRFWFSTEPACTOR t4 on  t4.WFSTEPID = t1.WFSTEPID   INNER JOIN T_SRFWFUSER t7 ON t7.WFUSERID = t4.ACTORID LEFT JOIN T_SRFWFSTEPDATA t5 ON (t5.ACTORID=T4.ACTORID and  t5.WFSTEPID = t2.ACTIVESTEPID AND  t5.CONNECTIONNAME<>'SRFWFRESUBMIT') INNER JOIN T_SRFWFUSERASSIST t6 on (t6.WFMAJORUSERID = t4.ACTORID AND ( t6.WFWORKFLOWID IS NULL OR   t6.WFWORKFLOWID=t2.wfworkflowid))   AND (t6.WFSTEP IS NULL OR t6.WFSTEP = '*'  or  (t6.wfstep is not null and  (LOCATE(t6.wfstep ,t1.wfstepname) > 0)  ) )",querycodetemp="",declarecode="",dbtype="DB2",
    fieldexps={
        @DEDataQueryCodeExp(name="USERDATA",expression="t2.USERDATA")
        ,@DEDataQueryCodeExp(name="WFPLOGICNAME",expression="t1.WFPLOGICNAME")
        ,@DEDataQueryCodeExp(name="ACTORID",expression="t4.ACTORID")
        ,@DEDataQueryCodeExp(name="WFWORKFLOWID",expression="t3.WFWORKFLOWID")
        ,@DEDataQueryCodeExp(name="ACTIVESTEPID",expression="t2.ACTIVESTEPID")
        ,@DEDataQueryCodeExp(name="WFINSTANCEID",expression="t2.WFINSTANCEID")
        ,@DEDataQueryCodeExp(name="WFWORKFLOWNAME",expression="t3.WFWORKFLOWNAME")
        ,@DEDataQueryCodeExp(name="WFINSTANCENAME",expression="t2.WFINSTANCENAME")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t4.CREATEDATE")
        ,@DEDataQueryCodeExp(name="WFUSERNAME",expression="t7.WFUSERNAME")
        ,@DEDataQueryCodeExp(name="USERDATA4",expression="t2.USERDATA4")
        ,@DEDataQueryCodeExp(name="WFSTEPNAME",expression="t1.WFSTEPNAME")
        ,@DEDataQueryCodeExp(name="WFSTEPACTORID",expression="t4.WFSTEPACTORID")
    },
    conds={
        @DEDataQueryCodeCond(condition="t5.WFSTEPDATAID IS NULL AND t6.WFMINORUSERID=${srfsessioncontext('SRFPERSONID')}")
    }),
    @DEDataQueryCode(querycode="select   t2.WFINSTANCEID AS WFASSISTWORKID,t2.WFINSTANCENAME  AS WFASSISTWORKNAME, t2.WFINSTANCEID,t2.WFINSTANCENAME,t2.ACTIVESTEPID,t2.USERDATA,t3.WFWORKFLOWID,t3.WFWORKFLOWNAME,t1.WFPLOGICNAME,t4.ACTORID,t4.CREATEDATE,t4.WFSTEPACTORNAME,t1.WFSTEPNAME,t2.USERDATA4,t4.WFSTEPACTORID from T_SRFWFSTEP t1 INNER JOIN t_SRFWFINSTANCE t2 on  t2.ACTIVESTEPID = t1.WFSTEPID AND ( t2.ISCLOSE IS NULL OR t2.ISCLOSE=0)  INNER JOIN T_SRFWFWORKFLOW t3 on t2.WFWORKFLOWID = t3.WFWORKFLOWID  INNER JOIN T_SRFWFSTEPACTOR t4 on  t4.WFSTEPID = t1.WFSTEPID   INNER JOIN T_SRFWFUSER t7 ON t7.WFUSERID = t4.ACTORID LEFT JOIN T_SRFWFSTEPDATA t5 ON (t5.ACTORID=T4.ACTORID and  t5.WFSTEPID = t2.ACTIVESTEPID AND  t5.CONNECTIONNAME<>'SRFWFRESUBMIT') INNER JOIN T_SRFWFUSERASSIST t6 on (t6.WFMAJORUSERID = t4.ACTORID AND ( t6.WFWORKFLOWID IS NULL OR   t6.WFWORKFLOWID=t2.wfworkflowid))   AND (t6.WFSTEP IS NULL OR t6.WFSTEP = '*'  or  (t6.wfstep is not null and   ';'||t6.wfstep||';' like '%;'||t1.wfstepname||';%'  ) )",querycodetemp="",declarecode="",dbtype="MYSQL5",
    fieldexps={
        @DEDataQueryCodeExp(name="USERDATA",expression="t2.USERDATA")
        ,@DEDataQueryCodeExp(name="WFPLOGICNAME",expression="t1.WFPLOGICNAME")
        ,@DEDataQueryCodeExp(name="ACTORID",expression="t4.ACTORID")
        ,@DEDataQueryCodeExp(name="WFWORKFLOWID",expression="t3.WFWORKFLOWID")
        ,@DEDataQueryCodeExp(name="ACTIVESTEPID",expression="t2.ACTIVESTEPID")
        ,@DEDataQueryCodeExp(name="WFINSTANCEID",expression="t2.WFINSTANCEID")
        ,@DEDataQueryCodeExp(name="WFWORKFLOWNAME",expression="t3.WFWORKFLOWNAME")
        ,@DEDataQueryCodeExp(name="WFINSTANCENAME",expression="t2.WFINSTANCENAME")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t4.CREATEDATE")
        ,@DEDataQueryCodeExp(name="WFUSERNAME",expression="t7.WFUSERNAME")
        ,@DEDataQueryCodeExp(name="USERDATA4",expression="t2.USERDATA4")
        ,@DEDataQueryCodeExp(name="WFSTEPNAME",expression="t1.WFSTEPNAME")
        ,@DEDataQueryCodeExp(name="WFSTEPACTORID",expression="t4.WFSTEPACTORID")
    },
    conds={
        @DEDataQueryCodeCond(condition="t5.WFSTEPDATAID IS NULL AND t6.WFMINORUSERID=${srfsessioncontext('SRFPERSONID')}")
    }),
    @DEDataQueryCode(querycode="select t2.WFINSTANCEID AS WFASSISTWORKID,t2.WFINSTANCENAME  AS WFASSISTWORKNAME,t2.WFINSTANCEID,t2.WFINSTANCENAME,t2.ACTIVESTEPID,t2.USERDATA,t3.WFWORKFLOWID,t3.WFWORKFLOWNAME,t1.WFPLOGICNAME,t4.ACTORID,t4.CREATEDATE,t4.WFSTEPACTORNAME,t1.WFSTEPNAME,t2.USERDATA4,t4.WFSTEPACTORID from T_SRFWFSTEP t1 INNER JOIN t_SRFWFINSTANCE t2 on  t2.ACTIVESTEPID = t1.WFSTEPID AND ( t2.ISCLOSE IS NULL OR t2.ISCLOSE=0)  INNER JOIN T_SRFWFWORKFLOW t3 on t2.WFWORKFLOWID = t3.WFWORKFLOWID  INNER JOIN T_SRFWFSTEPACTOR t4 on  t4.WFSTEPID = t1.WFSTEPID   INNER JOIN T_SRFWFUSER t7 ON t7.WFUSERID = t4.ACTORID LEFT JOIN T_SRFWFSTEPDATA t5 ON (t5.ACTORID=T4.ACTORID and  t5.WFSTEPID = t2.ACTIVESTEPID AND  t5.CONNECTIONNAME<>'SRFWFRESUBMIT') INNER JOIN T_SRFWFUSERASSIST t6 on (t6.WFMAJORUSERID = t4.ACTORID AND ( t6.WFWORKFLOWID IS NULL OR   t6.WFWORKFLOWID=t2.wfworkflowid))   AND (t6.WFSTEP IS NULL OR t6.WFSTEP = '*'  or  (t6.wfstep is not null and   ';'||t6.wfstep||';' like '%;'||t1.wfstepname||';%'  ) )",querycodetemp="",declarecode="",dbtype="ORACLE",
    fieldexps={
        @DEDataQueryCodeExp(name="USERDATA",expression="t2.USERDATA")
        ,@DEDataQueryCodeExp(name="WFPLOGICNAME",expression="t1.WFPLOGICNAME")
        ,@DEDataQueryCodeExp(name="ACTORID",expression="t4.ACTORID")
        ,@DEDataQueryCodeExp(name="WFWORKFLOWID",expression="t3.WFWORKFLOWID")
        ,@DEDataQueryCodeExp(name="ACTIVESTEPID",expression="t2.ACTIVESTEPID")
        ,@DEDataQueryCodeExp(name="WFINSTANCEID",expression="t2.WFINSTANCEID")
        ,@DEDataQueryCodeExp(name="WFWORKFLOWNAME",expression="t3.WFWORKFLOWNAME")
        ,@DEDataQueryCodeExp(name="WFINSTANCENAME",expression="t2.WFINSTANCENAME")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t4.CREATEDATE")
        ,@DEDataQueryCodeExp(name="WFUSERNAME",expression="t7.WFUSERNAME")
        ,@DEDataQueryCodeExp(name="WFSTEPNAME",expression="t1.WFSTEPNAME")
        ,@DEDataQueryCodeExp(name="USERDATA4",expression="t2.USERDATA4")
        ,@DEDataQueryCodeExp(name="WFSTEPACTORID",expression="t4.WFSTEPACTORID")
    },
    conds={
        @DEDataQueryCodeCond(condition="t5.WFSTEPDATAID IS NULL AND t6.WFMINORUSERID=${srfsessioncontext('SRFPERSONID')}")
    }),
    @DEDataQueryCode(querycode="",querycodetemp="",declarecode="",dbtype="SQLSERVER",
    fieldexps={},
    conds={}),
    @DEDataQueryCode(querycode="",querycodetemp="",declarecode="",dbtype="POSTGRESQL",
    fieldexps={},
    conds={}),
    @DEDataQueryCode(querycode="",querycodetemp="",declarecode="",dbtype="PPAS",
    fieldexps={},
    conds={})
})
/**
 *  实体数据查询 [当前用户代办工作]模型基类
 */
public abstract class WFAssistWorkCurUserAssistWorkDQModelBase extends net.ibizsys.paas.demodel.DEDataQueryModelBase {

    public WFAssistWorkCurUserAssistWorkDQModelBase() {
        super();

        this.initAnnotation(WFAssistWorkCurUserAssistWorkDQModelBase.class);
    }

}