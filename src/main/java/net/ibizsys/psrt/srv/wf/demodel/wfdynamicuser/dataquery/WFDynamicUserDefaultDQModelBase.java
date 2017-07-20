/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package net.ibizsys.psrt.srv.wf.demodel.wfdynamicuser.dataquery;



import net.ibizsys.paas.core.DEDataQuery;
import net.ibizsys.paas.core.DEDataQueryCodes;
import net.ibizsys.paas.core.DEDataQueryCode;
import net.ibizsys.paas.core.DEDataQueryCodeExp;
import net.ibizsys.paas.core.DEDataQueryCodeCond;

@DEDataQuery(id="7D21E4C3-A8FC-4A14-B817-5A5EEC5589F0",name="DEFAULT")
@DEDataQueryCodes({
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE, t1.CREATEMAN, t1.UPDATEDATE, t1.UPDATEMAN, t1.USEROBJECT, t1.USERTYPE, t1.WFDYNAMICUSERID, t1.WFDYNAMICUSERNAME FROM T_SRFWFDYNAMICUSER t1 ",querycodetemp="",declarecode="",dbtype="DB2",
    fieldexps={
        @DEDataQueryCodeExp(name="PARAMS",expression="t1.PARAMS")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="USEROBJECT",expression="t1.USEROBJECT")
        ,@DEDataQueryCodeExp(name="USERTYPE",expression="t1.USERTYPE")
        ,@DEDataQueryCodeExp(name="WFDYNAMICUSERID",expression="t1.WFDYNAMICUSERID")
        ,@DEDataQueryCodeExp(name="WFDYNAMICUSERNAME",expression="t1.WFDYNAMICUSERNAME")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.`CREATEDATE`, t1.`CREATEMAN`, t1.`UPDATEDATE`, t1.`UPDATEMAN`, t1.`USEROBJECT`, t1.`USERTYPE`, t1.`WFDYNAMICUSERID`, t1.`WFDYNAMICUSERNAME` FROM `T_SRFWFDYNAMICUSER` t1 ",querycodetemp="",declarecode="",dbtype="MYSQL5",
    fieldexps={
        @DEDataQueryCodeExp(name="PARAMS",expression="t1.`PARAMS`")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.`CREATEDATE`")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.`CREATEMAN`")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.`UPDATEDATE`")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.`UPDATEMAN`")
        ,@DEDataQueryCodeExp(name="USEROBJECT",expression="t1.`USEROBJECT`")
        ,@DEDataQueryCodeExp(name="USERTYPE",expression="t1.`USERTYPE`")
        ,@DEDataQueryCodeExp(name="WFDYNAMICUSERID",expression="t1.`WFDYNAMICUSERID`")
        ,@DEDataQueryCodeExp(name="WFDYNAMICUSERNAME",expression="t1.`WFDYNAMICUSERNAME`")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE, t1.CREATEMAN, t1.UPDATEDATE, t1.UPDATEMAN, t1.USEROBJECT, t1.USERTYPE, t1.WFDYNAMICUSERID, t1.WFDYNAMICUSERNAME FROM T_SRFWFDYNAMICUSER t1 ",querycodetemp="",declarecode="",dbtype="ORACLE",
    fieldexps={
        @DEDataQueryCodeExp(name="PARAMS",expression="t1.PARAMS")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="USEROBJECT",expression="t1.USEROBJECT")
        ,@DEDataQueryCodeExp(name="USERTYPE",expression="t1.USERTYPE")
        ,@DEDataQueryCodeExp(name="WFDYNAMICUSERID",expression="t1.WFDYNAMICUSERID")
        ,@DEDataQueryCodeExp(name="WFDYNAMICUSERNAME",expression="t1.WFDYNAMICUSERNAME")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.[CREATEDATE], t1.[CREATEMAN], t1.[UPDATEDATE], t1.[UPDATEMAN], t1.[USEROBJECT], t1.[USERTYPE], t1.[WFDYNAMICUSERID], t1.[WFDYNAMICUSERNAME] FROM [T_SRFWFDYNAMICUSER] t1 ",querycodetemp="",declarecode="",dbtype="SQLSERVER",
    fieldexps={
        @DEDataQueryCodeExp(name="PARAMS",expression="t1.[PARAMS]")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.[CREATEDATE]")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.[CREATEMAN]")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.[UPDATEDATE]")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.[UPDATEMAN]")
        ,@DEDataQueryCodeExp(name="USEROBJECT",expression="t1.[USEROBJECT]")
        ,@DEDataQueryCodeExp(name="USERTYPE",expression="t1.[USERTYPE]")
        ,@DEDataQueryCodeExp(name="WFDYNAMICUSERID",expression="t1.[WFDYNAMICUSERID]")
        ,@DEDataQueryCodeExp(name="WFDYNAMICUSERNAME",expression="t1.[WFDYNAMICUSERNAME]")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE, t1.CREATEMAN, t1.UPDATEDATE, t1.UPDATEMAN, t1.USEROBJECT, t1.USERTYPE, t1.WFDYNAMICUSERID, t1.WFDYNAMICUSERNAME FROM T_SRFWFDYNAMICUSER t1 ",querycodetemp="",declarecode="",dbtype="POSTGRESQL",
    fieldexps={
        @DEDataQueryCodeExp(name="PARAMS",expression="t1.PARAMS")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="USEROBJECT",expression="t1.USEROBJECT")
        ,@DEDataQueryCodeExp(name="USERTYPE",expression="t1.USERTYPE")
        ,@DEDataQueryCodeExp(name="WFDYNAMICUSERID",expression="t1.WFDYNAMICUSERID")
        ,@DEDataQueryCodeExp(name="WFDYNAMICUSERNAME",expression="t1.WFDYNAMICUSERNAME")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE, t1.CREATEMAN, t1.UPDATEDATE, t1.UPDATEMAN, t1.USEROBJECT, t1.USERTYPE, t1.WFDYNAMICUSERID, t1.WFDYNAMICUSERNAME FROM T_SRFWFDYNAMICUSER t1 ",querycodetemp="",declarecode="",dbtype="PPAS",
    fieldexps={
        @DEDataQueryCodeExp(name="PARAMS",expression="t1.PARAMS")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="USEROBJECT",expression="t1.USEROBJECT")
        ,@DEDataQueryCodeExp(name="USERTYPE",expression="t1.USERTYPE")
        ,@DEDataQueryCodeExp(name="WFDYNAMICUSERID",expression="t1.WFDYNAMICUSERID")
        ,@DEDataQueryCodeExp(name="WFDYNAMICUSERNAME",expression="t1.WFDYNAMICUSERNAME")
    },
    conds={})
})
/**
 *  实体数据查询 [DEFAULT]模型基类
 */
public abstract class WFDynamicUserDefaultDQModelBase extends net.ibizsys.paas.demodel.DEDataQueryModelBase {

    public WFDynamicUserDefaultDQModelBase() {
        super();

        this.initAnnotation(WFDynamicUserDefaultDQModelBase.class);
    }

}