/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package net.ibizsys.psrt.srv.demodel.demodel.querymodel.dataquery;



import net.ibizsys.paas.core.DEDataQuery;
import net.ibizsys.paas.core.DEDataQueryCodes;
import net.ibizsys.paas.core.DEDataQueryCode;
import net.ibizsys.paas.core.DEDataQueryCodeExp;
import net.ibizsys.paas.core.DEDataQueryCodeCond;

@DEDataQuery(id="DAA168A0-06ED-41E7-AB10-F521457AF6C2",name="CurDE")
@DEDataQueryCodes({
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE AS CREATEDATE, t1.CREATEMAN AS CREATEMAN, t1.DEID AS DEID, t11.DENAME AS DENAME, t1.ISRAWMODE AS ISRAWMODE, t1.MEMO AS MEMO, t1.QMVERSION AS QMVERSION, t1.QUERYMODELID AS QUERYMODELID, t1.QUERYMODELNAME AS QUERYMODELNAME, t1.QUERYOBJECT AS QUERYOBJECT, t1.SELECTMODE AS SELECTMODE, t1.SELECTORDER AS SELECTORDER, t1.SRFSYSPUB AS SRFSYSPUB, t1.SRFUSERPUB AS SRFUSERPUB, t1.UPDATEDATE AS UPDATEDATE, t1.UPDATEMAN AS UPDATEMAN FROM T_SRFQUERYMODEL t1  LEFT JOIN t_srfdataentity t11 ON t1.DEID = t11.DEID ",querycodetemp="",declarecode="",dbtype="DB2",
    fieldexps={
        @DEDataQueryCodeExp(name="GROUPMODEL",expression="t1.GROUPMODEL")
        ,@DEDataQueryCodeExp(name="QUERYCOND",expression="t1.QUERYCOND")
        ,@DEDataQueryCodeExp(name="QUERYFIELD",expression="t1.QUERYFIELD")
        ,@DEDataQueryCodeExp(name="QUERYMODEL",expression="t1.QUERYMODEL")
        ,@DEDataQueryCodeExp(name="QUERYPARAM",expression="t1.QUERYPARAM")
        ,@DEDataQueryCodeExp(name="QUERYSQL",expression="t1.QUERYSQL")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="DEID",expression="t1.DEID")
        ,@DEDataQueryCodeExp(name="DENAME",expression="t11.DENAME")
        ,@DEDataQueryCodeExp(name="ISRAWMODE",expression="t1.ISRAWMODE")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="QMVERSION",expression="t1.QMVERSION")
        ,@DEDataQueryCodeExp(name="QUERYMODELID",expression="t1.QUERYMODELID")
        ,@DEDataQueryCodeExp(name="QUERYMODELNAME",expression="t1.QUERYMODELNAME")
        ,@DEDataQueryCodeExp(name="QUERYOBJECT",expression="t1.QUERYOBJECT")
        ,@DEDataQueryCodeExp(name="SELECTMODE",expression="t1.SELECTMODE")
        ,@DEDataQueryCodeExp(name="SELECTORDER",expression="t1.SELECTORDER")
        ,@DEDataQueryCodeExp(name="SRFSYSPUB",expression="t1.SRFSYSPUB")
        ,@DEDataQueryCodeExp(name="SRFUSERPUB",expression="t1.SRFUSERPUB")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
    },
    conds={
        @DEDataQueryCodeCond(condition="( t1.DEID =  ${srfdatacontext('deid','{\"defname\":\"DEID\",\"dename\":\"QUERYMODEL\"}')} )")
    }),
    @DEDataQueryCode(querycode="SELECT t1.`CREATEDATE` AS `CREATEDATE`, t1.`CREATEMAN` AS `CREATEMAN`, t1.`DEID` AS `DEID`, t11.`DENAME` AS `DENAME`, t1.`ISRAWMODE` AS `ISRAWMODE`, t1.`MEMO` AS `MEMO`, t1.`QMVERSION` AS `QMVERSION`, t1.`QUERYMODELID` AS `QUERYMODELID`, t1.`QUERYMODELNAME` AS `QUERYMODELNAME`, t1.`QUERYOBJECT` AS `QUERYOBJECT`, t1.`SELECTMODE` AS `SELECTMODE`, t1.`SELECTORDER` AS `SELECTORDER`, t1.`SRFSYSPUB` AS `SRFSYSPUB`, t1.`SRFUSERPUB` AS `SRFUSERPUB`, t1.`UPDATEDATE` AS `UPDATEDATE`, t1.`UPDATEMAN` AS `UPDATEMAN` FROM `T_SRFQUERYMODEL` t1  LEFT JOIN t_srfdataentity t11 ON t1.DEID = t11.DEID ",querycodetemp="",declarecode="",dbtype="MYSQL5",
    fieldexps={
        @DEDataQueryCodeExp(name="GROUPMODEL",expression="t1.`GROUPMODEL`")
        ,@DEDataQueryCodeExp(name="QUERYCOND",expression="t1.`QUERYCOND`")
        ,@DEDataQueryCodeExp(name="QUERYFIELD",expression="t1.`QUERYFIELD`")
        ,@DEDataQueryCodeExp(name="QUERYMODEL",expression="t1.`QUERYMODEL`")
        ,@DEDataQueryCodeExp(name="QUERYPARAM",expression="t1.`QUERYPARAM`")
        ,@DEDataQueryCodeExp(name="QUERYSQL",expression="t1.`QUERYSQL`")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.`CREATEDATE`")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.`CREATEMAN`")
        ,@DEDataQueryCodeExp(name="DEID",expression="t1.`DEID`")
        ,@DEDataQueryCodeExp(name="DENAME",expression="t11.`DENAME`")
        ,@DEDataQueryCodeExp(name="ISRAWMODE",expression="t1.`ISRAWMODE`")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.`MEMO`")
        ,@DEDataQueryCodeExp(name="QMVERSION",expression="t1.`QMVERSION`")
        ,@DEDataQueryCodeExp(name="QUERYMODELID",expression="t1.`QUERYMODELID`")
        ,@DEDataQueryCodeExp(name="QUERYMODELNAME",expression="t1.`QUERYMODELNAME`")
        ,@DEDataQueryCodeExp(name="QUERYOBJECT",expression="t1.`QUERYOBJECT`")
        ,@DEDataQueryCodeExp(name="SELECTMODE",expression="t1.`SELECTMODE`")
        ,@DEDataQueryCodeExp(name="SELECTORDER",expression="t1.`SELECTORDER`")
        ,@DEDataQueryCodeExp(name="SRFSYSPUB",expression="t1.`SRFSYSPUB`")
        ,@DEDataQueryCodeExp(name="SRFUSERPUB",expression="t1.`SRFUSERPUB`")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.`UPDATEDATE`")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.`UPDATEMAN`")
    },
    conds={
        @DEDataQueryCodeCond(condition="( t1.`DEID` =  ${srfdatacontext('deid','{\"defname\":\"DEID\",\"dename\":\"QUERYMODEL\"}')} )")
    }),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE AS CREATEDATE, t1.CREATEMAN AS CREATEMAN, t1.DEID AS DEID, t11.DENAME AS DENAME, t1.ISRAWMODE AS ISRAWMODE, t1.MEMO AS MEMO, t1.QMVERSION AS QMVERSION, t1.QUERYMODELID AS QUERYMODELID, t1.QUERYMODELNAME AS QUERYMODELNAME, t1.QUERYOBJECT AS QUERYOBJECT, t1.SELECTMODE AS SELECTMODE, t1.SELECTORDER AS SELECTORDER, t1.SRFSYSPUB AS SRFSYSPUB, t1.SRFUSERPUB AS SRFUSERPUB, t1.UPDATEDATE AS UPDATEDATE, t1.UPDATEMAN AS UPDATEMAN FROM T_SRFQUERYMODEL t1  LEFT JOIN t_srfdataentity t11 ON t1.DEID = t11.DEID ",querycodetemp="",declarecode="",dbtype="ORACLE",
    fieldexps={
        @DEDataQueryCodeExp(name="GROUPMODEL",expression="t1.GROUPMODEL")
        ,@DEDataQueryCodeExp(name="QUERYCOND",expression="t1.QUERYCOND")
        ,@DEDataQueryCodeExp(name="QUERYFIELD",expression="t1.QUERYFIELD")
        ,@DEDataQueryCodeExp(name="QUERYMODEL",expression="t1.QUERYMODEL")
        ,@DEDataQueryCodeExp(name="QUERYPARAM",expression="t1.QUERYPARAM")
        ,@DEDataQueryCodeExp(name="QUERYSQL",expression="t1.QUERYSQL")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="DEID",expression="t1.DEID")
        ,@DEDataQueryCodeExp(name="DENAME",expression="t11.DENAME")
        ,@DEDataQueryCodeExp(name="ISRAWMODE",expression="t1.ISRAWMODE")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="QMVERSION",expression="t1.QMVERSION")
        ,@DEDataQueryCodeExp(name="QUERYMODELID",expression="t1.QUERYMODELID")
        ,@DEDataQueryCodeExp(name="QUERYMODELNAME",expression="t1.QUERYMODELNAME")
        ,@DEDataQueryCodeExp(name="QUERYOBJECT",expression="t1.QUERYOBJECT")
        ,@DEDataQueryCodeExp(name="SELECTMODE",expression="t1.SELECTMODE")
        ,@DEDataQueryCodeExp(name="SELECTORDER",expression="t1.SELECTORDER")
        ,@DEDataQueryCodeExp(name="SRFSYSPUB",expression="t1.SRFSYSPUB")
        ,@DEDataQueryCodeExp(name="SRFUSERPUB",expression="t1.SRFUSERPUB")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
    },
    conds={
        @DEDataQueryCodeCond(condition="( t1.DEID =  ${srfdatacontext('deid','{\"defname\":\"DEID\",\"dename\":\"QUERYMODEL\"}')} )")
    }),
    @DEDataQueryCode(querycode="SELECT t1.[CREATEDATE] AS [CREATEDATE], t1.[CREATEMAN] AS [CREATEMAN], t1.[DEID] AS [DEID], t11.[DENAME] AS [DENAME], t1.[ISRAWMODE] AS [ISRAWMODE], t1.[MEMO] AS [MEMO], t1.[QMVERSION] AS [QMVERSION], t1.[QUERYMODELID] AS [QUERYMODELID], t1.[QUERYMODELNAME] AS [QUERYMODELNAME], t1.[QUERYOBJECT] AS [QUERYOBJECT], t1.[SELECTMODE] AS [SELECTMODE], t1.[SELECTORDER] AS [SELECTORDER], t1.[SRFSYSPUB] AS [SRFSYSPUB], t1.[SRFUSERPUB] AS [SRFUSERPUB], t1.[UPDATEDATE] AS [UPDATEDATE], t1.[UPDATEMAN] AS [UPDATEMAN] FROM [T_SRFQUERYMODEL] t1  LEFT JOIN t_srfdataentity t11 ON t1.DEID = t11.DEID ",querycodetemp="",declarecode="",dbtype="SQLSERVER",
    fieldexps={
        @DEDataQueryCodeExp(name="GROUPMODEL",expression="t1.[GROUPMODEL]")
        ,@DEDataQueryCodeExp(name="QUERYCOND",expression="t1.[QUERYCOND]")
        ,@DEDataQueryCodeExp(name="QUERYFIELD",expression="t1.[QUERYFIELD]")
        ,@DEDataQueryCodeExp(name="QUERYMODEL",expression="t1.[QUERYMODEL]")
        ,@DEDataQueryCodeExp(name="QUERYPARAM",expression="t1.[QUERYPARAM]")
        ,@DEDataQueryCodeExp(name="QUERYSQL",expression="t1.[QUERYSQL]")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.[CREATEDATE]")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.[CREATEMAN]")
        ,@DEDataQueryCodeExp(name="DEID",expression="t1.[DEID]")
        ,@DEDataQueryCodeExp(name="DENAME",expression="t11.[DENAME]")
        ,@DEDataQueryCodeExp(name="ISRAWMODE",expression="t1.[ISRAWMODE]")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.[MEMO]")
        ,@DEDataQueryCodeExp(name="QMVERSION",expression="t1.[QMVERSION]")
        ,@DEDataQueryCodeExp(name="QUERYMODELID",expression="t1.[QUERYMODELID]")
        ,@DEDataQueryCodeExp(name="QUERYMODELNAME",expression="t1.[QUERYMODELNAME]")
        ,@DEDataQueryCodeExp(name="QUERYOBJECT",expression="t1.[QUERYOBJECT]")
        ,@DEDataQueryCodeExp(name="SELECTMODE",expression="t1.[SELECTMODE]")
        ,@DEDataQueryCodeExp(name="SELECTORDER",expression="t1.[SELECTORDER]")
        ,@DEDataQueryCodeExp(name="SRFSYSPUB",expression="t1.[SRFSYSPUB]")
        ,@DEDataQueryCodeExp(name="SRFUSERPUB",expression="t1.[SRFUSERPUB]")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.[UPDATEDATE]")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.[UPDATEMAN]")
    },
    conds={
        @DEDataQueryCodeCond(condition="( t1.[DEID] =  ${srfdatacontext('deid','{\"defname\":\"DEID\",\"dename\":\"QUERYMODEL\"}')} )")
    }),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE AS CREATEDATE, t1.CREATEMAN AS CREATEMAN, t1.DEID AS DEID, t11.DENAME AS DENAME, t1.ISRAWMODE AS ISRAWMODE, t1.MEMO AS MEMO, t1.QMVERSION AS QMVERSION, t1.QUERYMODELID AS QUERYMODELID, t1.QUERYMODELNAME AS QUERYMODELNAME, t1.QUERYOBJECT AS QUERYOBJECT, t1.SELECTMODE AS SELECTMODE, t1.SELECTORDER AS SELECTORDER, t1.SRFSYSPUB AS SRFSYSPUB, t1.SRFUSERPUB AS SRFUSERPUB, t1.UPDATEDATE AS UPDATEDATE, t1.UPDATEMAN AS UPDATEMAN FROM T_SRFQUERYMODEL t1  LEFT JOIN t_srfdataentity t11 ON t1.DEID = t11.DEID ",querycodetemp="",declarecode="",dbtype="POSTGRESQL",
    fieldexps={
        @DEDataQueryCodeExp(name="GROUPMODEL",expression="t1.GROUPMODEL")
        ,@DEDataQueryCodeExp(name="QUERYCOND",expression="t1.QUERYCOND")
        ,@DEDataQueryCodeExp(name="QUERYFIELD",expression="t1.QUERYFIELD")
        ,@DEDataQueryCodeExp(name="QUERYMODEL",expression="t1.QUERYMODEL")
        ,@DEDataQueryCodeExp(name="QUERYPARAM",expression="t1.QUERYPARAM")
        ,@DEDataQueryCodeExp(name="QUERYSQL",expression="t1.QUERYSQL")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="DEID",expression="t1.DEID")
        ,@DEDataQueryCodeExp(name="DENAME",expression="t11.DENAME")
        ,@DEDataQueryCodeExp(name="ISRAWMODE",expression="t1.ISRAWMODE")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="QMVERSION",expression="t1.QMVERSION")
        ,@DEDataQueryCodeExp(name="QUERYMODELID",expression="t1.QUERYMODELID")
        ,@DEDataQueryCodeExp(name="QUERYMODELNAME",expression="t1.QUERYMODELNAME")
        ,@DEDataQueryCodeExp(name="QUERYOBJECT",expression="t1.QUERYOBJECT")
        ,@DEDataQueryCodeExp(name="SELECTMODE",expression="t1.SELECTMODE")
        ,@DEDataQueryCodeExp(name="SELECTORDER",expression="t1.SELECTORDER")
        ,@DEDataQueryCodeExp(name="SRFSYSPUB",expression="t1.SRFSYSPUB")
        ,@DEDataQueryCodeExp(name="SRFUSERPUB",expression="t1.SRFUSERPUB")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
    },
    conds={
        @DEDataQueryCodeCond(condition="( t1.DEID =  ${srfdatacontext('deid','{\"defname\":\"DEID\",\"dename\":\"QUERYMODEL\"}')} )")
    }),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE AS CREATEDATE, t1.CREATEMAN AS CREATEMAN, t1.DEID AS DEID, t11.DENAME AS DENAME, t1.ISRAWMODE AS ISRAWMODE, t1.MEMO AS MEMO, t1.QMVERSION AS QMVERSION, t1.QUERYMODELID AS QUERYMODELID, t1.QUERYMODELNAME AS QUERYMODELNAME, t1.QUERYOBJECT AS QUERYOBJECT, t1.SELECTMODE AS SELECTMODE, t1.SELECTORDER AS SELECTORDER, t1.SRFSYSPUB AS SRFSYSPUB, t1.SRFUSERPUB AS SRFUSERPUB, t1.UPDATEDATE AS UPDATEDATE, t1.UPDATEMAN AS UPDATEMAN FROM T_SRFQUERYMODEL t1  LEFT JOIN t_srfdataentity t11 ON t1.DEID = t11.DEID ",querycodetemp="",declarecode="",dbtype="PPAS",
    fieldexps={
        @DEDataQueryCodeExp(name="GROUPMODEL",expression="t1.GROUPMODEL")
        ,@DEDataQueryCodeExp(name="QUERYCOND",expression="t1.QUERYCOND")
        ,@DEDataQueryCodeExp(name="QUERYFIELD",expression="t1.QUERYFIELD")
        ,@DEDataQueryCodeExp(name="QUERYMODEL",expression="t1.QUERYMODEL")
        ,@DEDataQueryCodeExp(name="QUERYPARAM",expression="t1.QUERYPARAM")
        ,@DEDataQueryCodeExp(name="QUERYSQL",expression="t1.QUERYSQL")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="DEID",expression="t1.DEID")
        ,@DEDataQueryCodeExp(name="DENAME",expression="t11.DENAME")
        ,@DEDataQueryCodeExp(name="ISRAWMODE",expression="t1.ISRAWMODE")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="QMVERSION",expression="t1.QMVERSION")
        ,@DEDataQueryCodeExp(name="QUERYMODELID",expression="t1.QUERYMODELID")
        ,@DEDataQueryCodeExp(name="QUERYMODELNAME",expression="t1.QUERYMODELNAME")
        ,@DEDataQueryCodeExp(name="QUERYOBJECT",expression="t1.QUERYOBJECT")
        ,@DEDataQueryCodeExp(name="SELECTMODE",expression="t1.SELECTMODE")
        ,@DEDataQueryCodeExp(name="SELECTORDER",expression="t1.SELECTORDER")
        ,@DEDataQueryCodeExp(name="SRFSYSPUB",expression="t1.SRFSYSPUB")
        ,@DEDataQueryCodeExp(name="SRFUSERPUB",expression="t1.SRFUSERPUB")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
    },
    conds={
        @DEDataQueryCodeCond(condition="( t1.DEID =  ${srfdatacontext('deid','{\"defname\":\"DEID\",\"dename\":\"QUERYMODEL\"}')} )")
    })
})
/**
 *  实体数据查询 [当前实体]模型基类
 */
public abstract class QueryModelCurDEDQModelBase extends net.ibizsys.paas.demodel.DEDataQueryModelBase {

    public QueryModelCurDEDQModelBase() {
        super();

        this.initAnnotation(QueryModelCurDEDQModelBase.class);
    }

}