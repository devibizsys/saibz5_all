/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package net.ibizsys.psrt.srv.common.demodel.tssdtasktype.dataquery;



import net.ibizsys.paas.core.DEDataQuery;
import net.ibizsys.paas.core.DEDataQueryCodes;
import net.ibizsys.paas.core.DEDataQueryCode;
import net.ibizsys.paas.core.DEDataQueryCodeExp;
import net.ibizsys.paas.core.DEDataQueryCodeCond;

@DEDataQuery(id="71E909AB-2C02-4C2A-8CD2-BC4F9278FB7F",name="DEFAULT")
@DEDataQueryCodes({
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE, t1.CREATEMAN, t1.RESERVER, t1.RESERVER2, t1.RESERVER3, t1.RESERVER4, t1.TASKOBJECT, t1.TSSDTASKTYPEID, t1.TSSDTASKTYPENAME, t1.UPDATEDATE, t1.UPDATEMAN FROM T_SRFTSSDTASKTYPE t1 ",querycodetemp="",declarecode="",dbtype="DB2",
    fieldexps={
        @DEDataQueryCodeExp(name="TASKTYPEPARAM",expression="t1.TASKTYPEPARAM")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="RESERVER",expression="t1.RESERVER")
        ,@DEDataQueryCodeExp(name="RESERVER2",expression="t1.RESERVER2")
        ,@DEDataQueryCodeExp(name="RESERVER3",expression="t1.RESERVER3")
        ,@DEDataQueryCodeExp(name="RESERVER4",expression="t1.RESERVER4")
        ,@DEDataQueryCodeExp(name="TASKOBJECT",expression="t1.TASKOBJECT")
        ,@DEDataQueryCodeExp(name="TSSDTASKTYPEID",expression="t1.TSSDTASKTYPEID")
        ,@DEDataQueryCodeExp(name="TSSDTASKTYPENAME",expression="t1.TSSDTASKTYPENAME")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.`CREATEDATE`, t1.`CREATEMAN`, t1.`RESERVER`, t1.`RESERVER2`, t1.`RESERVER3`, t1.`RESERVER4`, t1.`TASKOBJECT`, t1.`TSSDTASKTYPEID`, t1.`TSSDTASKTYPENAME`, t1.`UPDATEDATE`, t1.`UPDATEMAN` FROM `T_SRFTSSDTASKTYPE` t1 ",querycodetemp="",declarecode="",dbtype="MYSQL5",
    fieldexps={
        @DEDataQueryCodeExp(name="TASKTYPEPARAM",expression="t1.`TASKTYPEPARAM`")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.`CREATEDATE`")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.`CREATEMAN`")
        ,@DEDataQueryCodeExp(name="RESERVER",expression="t1.`RESERVER`")
        ,@DEDataQueryCodeExp(name="RESERVER2",expression="t1.`RESERVER2`")
        ,@DEDataQueryCodeExp(name="RESERVER3",expression="t1.`RESERVER3`")
        ,@DEDataQueryCodeExp(name="RESERVER4",expression="t1.`RESERVER4`")
        ,@DEDataQueryCodeExp(name="TASKOBJECT",expression="t1.`TASKOBJECT`")
        ,@DEDataQueryCodeExp(name="TSSDTASKTYPEID",expression="t1.`TSSDTASKTYPEID`")
        ,@DEDataQueryCodeExp(name="TSSDTASKTYPENAME",expression="t1.`TSSDTASKTYPENAME`")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.`UPDATEDATE`")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.`UPDATEMAN`")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE, t1.CREATEMAN, t1.RESERVER, t1.RESERVER2, t1.RESERVER3, t1.RESERVER4, t1.TASKOBJECT, t1.TSSDTASKTYPEID, t1.TSSDTASKTYPENAME, t1.UPDATEDATE, t1.UPDATEMAN FROM T_SRFTSSDTASKTYPE t1 ",querycodetemp="",declarecode="",dbtype="ORACLE",
    fieldexps={
        @DEDataQueryCodeExp(name="TASKTYPEPARAM",expression="t1.TASKTYPEPARAM")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="RESERVER",expression="t1.RESERVER")
        ,@DEDataQueryCodeExp(name="RESERVER2",expression="t1.RESERVER2")
        ,@DEDataQueryCodeExp(name="RESERVER3",expression="t1.RESERVER3")
        ,@DEDataQueryCodeExp(name="RESERVER4",expression="t1.RESERVER4")
        ,@DEDataQueryCodeExp(name="TASKOBJECT",expression="t1.TASKOBJECT")
        ,@DEDataQueryCodeExp(name="TSSDTASKTYPEID",expression="t1.TSSDTASKTYPEID")
        ,@DEDataQueryCodeExp(name="TSSDTASKTYPENAME",expression="t1.TSSDTASKTYPENAME")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.[CREATEDATE], t1.[CREATEMAN], t1.[RESERVER], t1.[RESERVER2], t1.[RESERVER3], t1.[RESERVER4], t1.[TASKOBJECT], t1.[TSSDTASKTYPEID], t1.[TSSDTASKTYPENAME], t1.[UPDATEDATE], t1.[UPDATEMAN] FROM [T_SRFTSSDTASKTYPE] t1 ",querycodetemp="",declarecode="",dbtype="SQLSERVER",
    fieldexps={
        @DEDataQueryCodeExp(name="TASKTYPEPARAM",expression="t1.[TASKTYPEPARAM]")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.[CREATEDATE]")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.[CREATEMAN]")
        ,@DEDataQueryCodeExp(name="RESERVER",expression="t1.[RESERVER]")
        ,@DEDataQueryCodeExp(name="RESERVER2",expression="t1.[RESERVER2]")
        ,@DEDataQueryCodeExp(name="RESERVER3",expression="t1.[RESERVER3]")
        ,@DEDataQueryCodeExp(name="RESERVER4",expression="t1.[RESERVER4]")
        ,@DEDataQueryCodeExp(name="TASKOBJECT",expression="t1.[TASKOBJECT]")
        ,@DEDataQueryCodeExp(name="TSSDTASKTYPEID",expression="t1.[TSSDTASKTYPEID]")
        ,@DEDataQueryCodeExp(name="TSSDTASKTYPENAME",expression="t1.[TSSDTASKTYPENAME]")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.[UPDATEDATE]")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.[UPDATEMAN]")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE, t1.CREATEMAN, t1.RESERVER, t1.RESERVER2, t1.RESERVER3, t1.RESERVER4, t1.TASKOBJECT, t1.TSSDTASKTYPEID, t1.TSSDTASKTYPENAME, t1.UPDATEDATE, t1.UPDATEMAN FROM T_SRFTSSDTASKTYPE t1 ",querycodetemp="",declarecode="",dbtype="POSTGRESQL",
    fieldexps={
        @DEDataQueryCodeExp(name="TASKTYPEPARAM",expression="t1.TASKTYPEPARAM")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="RESERVER",expression="t1.RESERVER")
        ,@DEDataQueryCodeExp(name="RESERVER2",expression="t1.RESERVER2")
        ,@DEDataQueryCodeExp(name="RESERVER3",expression="t1.RESERVER3")
        ,@DEDataQueryCodeExp(name="RESERVER4",expression="t1.RESERVER4")
        ,@DEDataQueryCodeExp(name="TASKOBJECT",expression="t1.TASKOBJECT")
        ,@DEDataQueryCodeExp(name="TSSDTASKTYPEID",expression="t1.TSSDTASKTYPEID")
        ,@DEDataQueryCodeExp(name="TSSDTASKTYPENAME",expression="t1.TSSDTASKTYPENAME")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE, t1.CREATEMAN, t1.RESERVER, t1.RESERVER2, t1.RESERVER3, t1.RESERVER4, t1.TASKOBJECT, t1.TSSDTASKTYPEID, t1.TSSDTASKTYPENAME, t1.UPDATEDATE, t1.UPDATEMAN FROM T_SRFTSSDTASKTYPE t1 ",querycodetemp="",declarecode="",dbtype="PPAS",
    fieldexps={
        @DEDataQueryCodeExp(name="TASKTYPEPARAM",expression="t1.TASKTYPEPARAM")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="RESERVER",expression="t1.RESERVER")
        ,@DEDataQueryCodeExp(name="RESERVER2",expression="t1.RESERVER2")
        ,@DEDataQueryCodeExp(name="RESERVER3",expression="t1.RESERVER3")
        ,@DEDataQueryCodeExp(name="RESERVER4",expression="t1.RESERVER4")
        ,@DEDataQueryCodeExp(name="TASKOBJECT",expression="t1.TASKOBJECT")
        ,@DEDataQueryCodeExp(name="TSSDTASKTYPEID",expression="t1.TSSDTASKTYPEID")
        ,@DEDataQueryCodeExp(name="TSSDTASKTYPENAME",expression="t1.TSSDTASKTYPENAME")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
    },
    conds={})
})
/**
 *  实体数据查询 [DEFAULT]模型基类
 */
public abstract class TSSDTaskTypeDefaultDQModelBase extends net.ibizsys.paas.demodel.DEDataQueryModelBase {

    public TSSDTaskTypeDefaultDQModelBase() {
        super();

        this.initAnnotation(TSSDTaskTypeDefaultDQModelBase.class);
    }

}