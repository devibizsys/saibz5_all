/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package net.ibizsys.psrt.srv.wf.demodel.wfsystemuser.dataquery;



import net.ibizsys.paas.core.DEDataQuery;
import net.ibizsys.paas.core.DEDataQueryCodes;
import net.ibizsys.paas.core.DEDataQueryCode;
import net.ibizsys.paas.core.DEDataQueryCodeExp;
import net.ibizsys.paas.core.DEDataQueryCodeCond;

@DEDataQuery(id="9424D163-710F-41B8-89CC-D8076504B6E1",name="DEFAULT")
@DEDataQueryCodes({
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE, t1.CREATEMAN, t1.UPDATEDATE, t1.UPDATEMAN, t1.WFSYSTEMUSERID, t1.WFSYSTEMUSERNAME FROM T_SRFWFSYSTEMUSER t1 ",querycodetemp="",declarecode="",dbtype="DB2",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="WFSYSTEMUSERID",expression="t1.WFSYSTEMUSERID")
        ,@DEDataQueryCodeExp(name="WFSYSTEMUSERNAME",expression="t1.WFSYSTEMUSERNAME")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.`CREATEDATE`, t1.`CREATEMAN`, t1.`UPDATEDATE`, t1.`UPDATEMAN`, t1.`WFSYSTEMUSERID`, t1.`WFSYSTEMUSERNAME` FROM `T_SRFWFSYSTEMUSER` t1 ",querycodetemp="",declarecode="",dbtype="MYSQL5",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.`CREATEDATE`")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.`CREATEMAN`")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.`UPDATEDATE`")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.`UPDATEMAN`")
        ,@DEDataQueryCodeExp(name="WFSYSTEMUSERID",expression="t1.`WFSYSTEMUSERID`")
        ,@DEDataQueryCodeExp(name="WFSYSTEMUSERNAME",expression="t1.`WFSYSTEMUSERNAME`")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE, t1.CREATEMAN, t1.UPDATEDATE, t1.UPDATEMAN, t1.WFSYSTEMUSERID, t1.WFSYSTEMUSERNAME FROM T_SRFWFSYSTEMUSER t1 ",querycodetemp="",declarecode="",dbtype="ORACLE",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="WFSYSTEMUSERID",expression="t1.WFSYSTEMUSERID")
        ,@DEDataQueryCodeExp(name="WFSYSTEMUSERNAME",expression="t1.WFSYSTEMUSERNAME")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.[CREATEDATE], t1.[CREATEMAN], t1.[UPDATEDATE], t1.[UPDATEMAN], t1.[WFSYSTEMUSERID], t1.[WFSYSTEMUSERNAME] FROM [T_SRFWFSYSTEMUSER] t1 ",querycodetemp="",declarecode="",dbtype="SQLSERVER",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.[CREATEDATE]")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.[CREATEMAN]")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.[UPDATEDATE]")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.[UPDATEMAN]")
        ,@DEDataQueryCodeExp(name="WFSYSTEMUSERID",expression="t1.[WFSYSTEMUSERID]")
        ,@DEDataQueryCodeExp(name="WFSYSTEMUSERNAME",expression="t1.[WFSYSTEMUSERNAME]")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE, t1.CREATEMAN, t1.UPDATEDATE, t1.UPDATEMAN, t1.WFSYSTEMUSERID, t1.WFSYSTEMUSERNAME FROM T_SRFWFSYSTEMUSER t1 ",querycodetemp="",declarecode="",dbtype="POSTGRESQL",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="WFSYSTEMUSERID",expression="t1.WFSYSTEMUSERID")
        ,@DEDataQueryCodeExp(name="WFSYSTEMUSERNAME",expression="t1.WFSYSTEMUSERNAME")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE, t1.CREATEMAN, t1.UPDATEDATE, t1.UPDATEMAN, t1.WFSYSTEMUSERID, t1.WFSYSTEMUSERNAME FROM T_SRFWFSYSTEMUSER t1 ",querycodetemp="",declarecode="",dbtype="PPAS",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="WFSYSTEMUSERID",expression="t1.WFSYSTEMUSERID")
        ,@DEDataQueryCodeExp(name="WFSYSTEMUSERNAME",expression="t1.WFSYSTEMUSERNAME")
    },
    conds={})
})
/**
 *  实体数据查询 [DEFAULT]模型基类
 */
public abstract class WFSystemUserDefaultDQModelBase extends net.ibizsys.paas.demodel.DEDataQueryModelBase {

    public WFSystemUserDefaultDQModelBase() {
        super();

        this.initAnnotation(WFSystemUserDefaultDQModelBase.class);
    }

}