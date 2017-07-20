/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package net.ibizsys.psrt.srv.common.demodel.datasyncout2.dataquery;



import net.ibizsys.paas.core.DEDataQuery;
import net.ibizsys.paas.core.DEDataQueryCodes;
import net.ibizsys.paas.core.DEDataQueryCode;
import net.ibizsys.paas.core.DEDataQueryCodeExp;
import net.ibizsys.paas.core.DEDataQueryCodeCond;

@DEDataQuery(id="E4ECB98C-9832-4F2F-8159-427829CEAD43",name="DEFAULT")
@DEDataQueryCodes({
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE, t1.CREATEMAN, t1.DATAKEY, t1.DATASYNCOUT2ID, t1.DATASYNCOUT2NAME, t1.DEID, t1.DENAME, t1.ERROR, t1.EVENTTYPE, t1.SYNCAGENT, t1.UPDATEDATE, t1.UPDATEMAN FROM T_SRFDATASYNCOUT2 t1 ",querycodetemp="",declarecode="",dbtype="DB2",
    fieldexps={
        @DEDataQueryCodeExp(name="DATA",expression="t1.DATA")
        ,@DEDataQueryCodeExp(name="FILELIST",expression="t1.FILELIST")
        ,@DEDataQueryCodeExp(name="LOGICDATA",expression="t1.LOGICDATA")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="DATAKEY",expression="t1.DATAKEY")
        ,@DEDataQueryCodeExp(name="DATASYNCOUT2ID",expression="t1.DATASYNCOUT2ID")
        ,@DEDataQueryCodeExp(name="DATASYNCOUT2NAME",expression="t1.DATASYNCOUT2NAME")
        ,@DEDataQueryCodeExp(name="DEID",expression="t1.DEID")
        ,@DEDataQueryCodeExp(name="DENAME",expression="t1.DENAME")
        ,@DEDataQueryCodeExp(name="ERROR",expression="t1.ERROR")
        ,@DEDataQueryCodeExp(name="EVENTTYPE",expression="t1.EVENTTYPE")
        ,@DEDataQueryCodeExp(name="SYNCAGENT",expression="t1.SYNCAGENT")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.`CREATEDATE`, t1.`CREATEMAN`, t1.`DATAKEY`, t1.`DATASYNCOUT2ID`, t1.`DATASYNCOUT2NAME`, t1.`DEID`, t1.`DENAME`, t1.`ERROR`, t1.`EVENTTYPE`, t1.`SYNCAGENT`, t1.`UPDATEDATE`, t1.`UPDATEMAN` FROM `T_SRFDATASYNCOUT2` t1 ",querycodetemp="",declarecode="",dbtype="MYSQL5",
    fieldexps={
        @DEDataQueryCodeExp(name="DATA",expression="t1.`DATA`")
        ,@DEDataQueryCodeExp(name="FILELIST",expression="t1.`FILELIST`")
        ,@DEDataQueryCodeExp(name="LOGICDATA",expression="t1.`LOGICDATA`")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.`CREATEDATE`")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.`CREATEMAN`")
        ,@DEDataQueryCodeExp(name="DATAKEY",expression="t1.`DATAKEY`")
        ,@DEDataQueryCodeExp(name="DATASYNCOUT2ID",expression="t1.`DATASYNCOUT2ID`")
        ,@DEDataQueryCodeExp(name="DATASYNCOUT2NAME",expression="t1.`DATASYNCOUT2NAME`")
        ,@DEDataQueryCodeExp(name="DEID",expression="t1.`DEID`")
        ,@DEDataQueryCodeExp(name="DENAME",expression="t1.`DENAME`")
        ,@DEDataQueryCodeExp(name="ERROR",expression="t1.`ERROR`")
        ,@DEDataQueryCodeExp(name="EVENTTYPE",expression="t1.`EVENTTYPE`")
        ,@DEDataQueryCodeExp(name="SYNCAGENT",expression="t1.`SYNCAGENT`")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.`UPDATEDATE`")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.`UPDATEMAN`")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE, t1.CREATEMAN, t1.DATAKEY, t1.DATASYNCOUT2ID, t1.DATASYNCOUT2NAME, t1.DEID, t1.DENAME, t1.ERROR, t1.EVENTTYPE, t1.SYNCAGENT, t1.UPDATEDATE, t1.UPDATEMAN FROM T_SRFDATASYNCOUT2 t1 ",querycodetemp="",declarecode="",dbtype="ORACLE",
    fieldexps={
        @DEDataQueryCodeExp(name="DATA",expression="t1.DATA")
        ,@DEDataQueryCodeExp(name="FILELIST",expression="t1.FILELIST")
        ,@DEDataQueryCodeExp(name="LOGICDATA",expression="t1.LOGICDATA")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="DATAKEY",expression="t1.DATAKEY")
        ,@DEDataQueryCodeExp(name="DATASYNCOUT2ID",expression="t1.DATASYNCOUT2ID")
        ,@DEDataQueryCodeExp(name="DATASYNCOUT2NAME",expression="t1.DATASYNCOUT2NAME")
        ,@DEDataQueryCodeExp(name="DEID",expression="t1.DEID")
        ,@DEDataQueryCodeExp(name="DENAME",expression="t1.DENAME")
        ,@DEDataQueryCodeExp(name="ERROR",expression="t1.ERROR")
        ,@DEDataQueryCodeExp(name="EVENTTYPE",expression="t1.EVENTTYPE")
        ,@DEDataQueryCodeExp(name="SYNCAGENT",expression="t1.SYNCAGENT")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.[CREATEDATE], t1.[CREATEMAN], t1.[DATAKEY], t1.[DATASYNCOUT2ID], t1.[DATASYNCOUT2NAME], t1.[DEID], t1.[DENAME], t1.[ERROR], t1.[EVENTTYPE], t1.[SYNCAGENT], t1.[UPDATEDATE], t1.[UPDATEMAN] FROM [T_SRFDATASYNCOUT2] t1 ",querycodetemp="",declarecode="",dbtype="SQLSERVER",
    fieldexps={
        @DEDataQueryCodeExp(name="DATA",expression="t1.[DATA]")
        ,@DEDataQueryCodeExp(name="FILELIST",expression="t1.[FILELIST]")
        ,@DEDataQueryCodeExp(name="LOGICDATA",expression="t1.[LOGICDATA]")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.[CREATEDATE]")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.[CREATEMAN]")
        ,@DEDataQueryCodeExp(name="DATAKEY",expression="t1.[DATAKEY]")
        ,@DEDataQueryCodeExp(name="DATASYNCOUT2ID",expression="t1.[DATASYNCOUT2ID]")
        ,@DEDataQueryCodeExp(name="DATASYNCOUT2NAME",expression="t1.[DATASYNCOUT2NAME]")
        ,@DEDataQueryCodeExp(name="DEID",expression="t1.[DEID]")
        ,@DEDataQueryCodeExp(name="DENAME",expression="t1.[DENAME]")
        ,@DEDataQueryCodeExp(name="ERROR",expression="t1.[ERROR]")
        ,@DEDataQueryCodeExp(name="EVENTTYPE",expression="t1.[EVENTTYPE]")
        ,@DEDataQueryCodeExp(name="SYNCAGENT",expression="t1.[SYNCAGENT]")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.[UPDATEDATE]")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.[UPDATEMAN]")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE, t1.CREATEMAN, t1.DATAKEY, t1.DATASYNCOUT2ID, t1.DATASYNCOUT2NAME, t1.DEID, t1.DENAME, t1.ERROR, t1.EVENTTYPE, t1.SYNCAGENT, t1.UPDATEDATE, t1.UPDATEMAN FROM T_SRFDATASYNCOUT2 t1 ",querycodetemp="",declarecode="",dbtype="POSTGRESQL",
    fieldexps={
        @DEDataQueryCodeExp(name="DATA",expression="t1.DATA")
        ,@DEDataQueryCodeExp(name="FILELIST",expression="t1.FILELIST")
        ,@DEDataQueryCodeExp(name="LOGICDATA",expression="t1.LOGICDATA")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="DATAKEY",expression="t1.DATAKEY")
        ,@DEDataQueryCodeExp(name="DATASYNCOUT2ID",expression="t1.DATASYNCOUT2ID")
        ,@DEDataQueryCodeExp(name="DATASYNCOUT2NAME",expression="t1.DATASYNCOUT2NAME")
        ,@DEDataQueryCodeExp(name="DEID",expression="t1.DEID")
        ,@DEDataQueryCodeExp(name="DENAME",expression="t1.DENAME")
        ,@DEDataQueryCodeExp(name="ERROR",expression="t1.ERROR")
        ,@DEDataQueryCodeExp(name="EVENTTYPE",expression="t1.EVENTTYPE")
        ,@DEDataQueryCodeExp(name="SYNCAGENT",expression="t1.SYNCAGENT")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE, t1.CREATEMAN, t1.DATAKEY, t1.DATASYNCOUT2ID, t1.DATASYNCOUT2NAME, t1.DEID, t1.DENAME, t1.ERROR, t1.EVENTTYPE, t1.SYNCAGENT, t1.UPDATEDATE, t1.UPDATEMAN FROM T_SRFDATASYNCOUT2 t1 ",querycodetemp="",declarecode="",dbtype="PPAS",
    fieldexps={
        @DEDataQueryCodeExp(name="DATA",expression="t1.DATA")
        ,@DEDataQueryCodeExp(name="FILELIST",expression="t1.FILELIST")
        ,@DEDataQueryCodeExp(name="LOGICDATA",expression="t1.LOGICDATA")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="DATAKEY",expression="t1.DATAKEY")
        ,@DEDataQueryCodeExp(name="DATASYNCOUT2ID",expression="t1.DATASYNCOUT2ID")
        ,@DEDataQueryCodeExp(name="DATASYNCOUT2NAME",expression="t1.DATASYNCOUT2NAME")
        ,@DEDataQueryCodeExp(name="DEID",expression="t1.DEID")
        ,@DEDataQueryCodeExp(name="DENAME",expression="t1.DENAME")
        ,@DEDataQueryCodeExp(name="ERROR",expression="t1.ERROR")
        ,@DEDataQueryCodeExp(name="EVENTTYPE",expression="t1.EVENTTYPE")
        ,@DEDataQueryCodeExp(name="SYNCAGENT",expression="t1.SYNCAGENT")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
    },
    conds={})
})
/**
 *  实体数据查询 [DEFAULT]模型基类
 */
public abstract class DataSyncOut2DefaultDQModelBase extends net.ibizsys.paas.demodel.DEDataQueryModelBase {

    public DataSyncOut2DefaultDQModelBase() {
        super();

        this.initAnnotation(DataSyncOut2DefaultDQModelBase.class);
    }

}