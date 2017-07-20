/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package net.ibizsys.psrt.srv.common.demodel.dedatachg.dataquery;



import net.ibizsys.paas.core.DEDataQuery;
import net.ibizsys.paas.core.DEDataQueryCodes;
import net.ibizsys.paas.core.DEDataQueryCode;
import net.ibizsys.paas.core.DEDataQueryCodeExp;
import net.ibizsys.paas.core.DEDataQueryCodeCond;

@DEDataQuery(id="6EBA0D55-8C03-4647-B442-32399C8FA930",name="DEFAULT")
@DEDataQueryCodes({
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE, t1.CREATEMAN, t1.DATAKEY, t1.DEDATACHGID, t1.DEDATACHGNAME, t1.DEID, t1.DENAME, t1.EVENTTYPE, t1.UPDATEDATE, t1.UPDATEMAN FROM T_SRFDEDATACHG t1 ",querycodetemp="",declarecode="",dbtype="DB2",
    fieldexps={
        @DEDataQueryCodeExp(name="DATA",expression="t1.DATA")
        ,@DEDataQueryCodeExp(name="LOGICDATA",expression="t1.LOGICDATA")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="DATAKEY",expression="t1.DATAKEY")
        ,@DEDataQueryCodeExp(name="DEDATACHGID",expression="t1.DEDATACHGID")
        ,@DEDataQueryCodeExp(name="DEDATACHGNAME",expression="t1.DEDATACHGNAME")
        ,@DEDataQueryCodeExp(name="DEID",expression="t1.DEID")
        ,@DEDataQueryCodeExp(name="DENAME",expression="t1.DENAME")
        ,@DEDataQueryCodeExp(name="EVENTTYPE",expression="t1.EVENTTYPE")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.`CREATEDATE`, t1.`CREATEMAN`, t1.`DATAKEY`, t1.`DEDATACHGID`, t1.`DEDATACHGNAME`, t1.`DEID`, t1.`DENAME`, t1.`EVENTTYPE`, t1.`UPDATEDATE`, t1.`UPDATEMAN` FROM `T_SRFDEDATACHG` t1 ",querycodetemp="",declarecode="",dbtype="MYSQL5",
    fieldexps={
        @DEDataQueryCodeExp(name="DATA",expression="t1.`DATA`")
        ,@DEDataQueryCodeExp(name="LOGICDATA",expression="t1.`LOGICDATA`")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.`CREATEDATE`")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.`CREATEMAN`")
        ,@DEDataQueryCodeExp(name="DATAKEY",expression="t1.`DATAKEY`")
        ,@DEDataQueryCodeExp(name="DEDATACHGID",expression="t1.`DEDATACHGID`")
        ,@DEDataQueryCodeExp(name="DEDATACHGNAME",expression="t1.`DEDATACHGNAME`")
        ,@DEDataQueryCodeExp(name="DEID",expression="t1.`DEID`")
        ,@DEDataQueryCodeExp(name="DENAME",expression="t1.`DENAME`")
        ,@DEDataQueryCodeExp(name="EVENTTYPE",expression="t1.`EVENTTYPE`")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.`UPDATEDATE`")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.`UPDATEMAN`")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE, t1.CREATEMAN, t1.DATAKEY, t1.DEDATACHGID, t1.DEDATACHGNAME, t1.DEID, t1.DENAME, t1.EVENTTYPE, t1.UPDATEDATE, t1.UPDATEMAN FROM T_SRFDEDATACHG t1 ",querycodetemp="",declarecode="",dbtype="ORACLE",
    fieldexps={
        @DEDataQueryCodeExp(name="DATA",expression="t1.DATA")
        ,@DEDataQueryCodeExp(name="LOGICDATA",expression="t1.LOGICDATA")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="DATAKEY",expression="t1.DATAKEY")
        ,@DEDataQueryCodeExp(name="DEDATACHGID",expression="t1.DEDATACHGID")
        ,@DEDataQueryCodeExp(name="DEDATACHGNAME",expression="t1.DEDATACHGNAME")
        ,@DEDataQueryCodeExp(name="DEID",expression="t1.DEID")
        ,@DEDataQueryCodeExp(name="DENAME",expression="t1.DENAME")
        ,@DEDataQueryCodeExp(name="EVENTTYPE",expression="t1.EVENTTYPE")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.[CREATEDATE], t1.[CREATEMAN], t1.[DATAKEY], t1.[DEDATACHGID], t1.[DEDATACHGNAME], t1.[DEID], t1.[DENAME], t1.[EVENTTYPE], t1.[UPDATEDATE], t1.[UPDATEMAN] FROM [T_SRFDEDATACHG] t1 ",querycodetemp="",declarecode="",dbtype="SQLSERVER",
    fieldexps={
        @DEDataQueryCodeExp(name="DATA",expression="t1.[DATA]")
        ,@DEDataQueryCodeExp(name="LOGICDATA",expression="t1.[LOGICDATA]")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.[CREATEDATE]")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.[CREATEMAN]")
        ,@DEDataQueryCodeExp(name="DATAKEY",expression="t1.[DATAKEY]")
        ,@DEDataQueryCodeExp(name="DEDATACHGID",expression="t1.[DEDATACHGID]")
        ,@DEDataQueryCodeExp(name="DEDATACHGNAME",expression="t1.[DEDATACHGNAME]")
        ,@DEDataQueryCodeExp(name="DEID",expression="t1.[DEID]")
        ,@DEDataQueryCodeExp(name="DENAME",expression="t1.[DENAME]")
        ,@DEDataQueryCodeExp(name="EVENTTYPE",expression="t1.[EVENTTYPE]")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.[UPDATEDATE]")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.[UPDATEMAN]")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE, t1.CREATEMAN, t1.DATAKEY, t1.DEDATACHGID, t1.DEDATACHGNAME, t1.DEID, t1.DENAME, t1.EVENTTYPE, t1.UPDATEDATE, t1.UPDATEMAN FROM T_SRFDEDATACHG t1 ",querycodetemp="",declarecode="",dbtype="POSTGRESQL",
    fieldexps={
        @DEDataQueryCodeExp(name="DATA",expression="t1.DATA")
        ,@DEDataQueryCodeExp(name="LOGICDATA",expression="t1.LOGICDATA")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="DATAKEY",expression="t1.DATAKEY")
        ,@DEDataQueryCodeExp(name="DEDATACHGID",expression="t1.DEDATACHGID")
        ,@DEDataQueryCodeExp(name="DEDATACHGNAME",expression="t1.DEDATACHGNAME")
        ,@DEDataQueryCodeExp(name="DEID",expression="t1.DEID")
        ,@DEDataQueryCodeExp(name="DENAME",expression="t1.DENAME")
        ,@DEDataQueryCodeExp(name="EVENTTYPE",expression="t1.EVENTTYPE")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE, t1.CREATEMAN, t1.DATAKEY, t1.DEDATACHGID, t1.DEDATACHGNAME, t1.DEID, t1.DENAME, t1.EVENTTYPE, t1.UPDATEDATE, t1.UPDATEMAN FROM T_SRFDEDATACHG t1 ",querycodetemp="",declarecode="",dbtype="PPAS",
    fieldexps={
        @DEDataQueryCodeExp(name="DATA",expression="t1.DATA")
        ,@DEDataQueryCodeExp(name="LOGICDATA",expression="t1.LOGICDATA")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="DATAKEY",expression="t1.DATAKEY")
        ,@DEDataQueryCodeExp(name="DEDATACHGID",expression="t1.DEDATACHGID")
        ,@DEDataQueryCodeExp(name="DEDATACHGNAME",expression="t1.DEDATACHGNAME")
        ,@DEDataQueryCodeExp(name="DEID",expression="t1.DEID")
        ,@DEDataQueryCodeExp(name="DENAME",expression="t1.DENAME")
        ,@DEDataQueryCodeExp(name="EVENTTYPE",expression="t1.EVENTTYPE")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
    },
    conds={})
})
/**
 *  实体数据查询 [DEFAULT]模型基类
 */
public abstract class DEDataChgDefaultDQModelBase extends net.ibizsys.paas.demodel.DEDataQueryModelBase {

    public DEDataChgDefaultDQModelBase() {
        super();

        this.initAnnotation(DEDataChgDefaultDQModelBase.class);
    }

}