/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package net.ibizsys.psrt.srv.common.demodel.system.dataquery;



import net.ibizsys.paas.core.DEDataQuery;
import net.ibizsys.paas.core.DEDataQueryCodes;
import net.ibizsys.paas.core.DEDataQueryCode;
import net.ibizsys.paas.core.DEDataQueryCodeExp;
import net.ibizsys.paas.core.DEDataQueryCodeCond;

@DEDataQuery(id="02A70D34-9714-4ADE-B08D-A36D94C080AD",name="DEFAULT")
@DEDataQueryCodes({
    @DEDataQueryCode(querycode="SELECT t1.AURLOGINADDR, t1.AURLOGOUTADDR, t1.BIGICON, t1.CREATEDATE, t1.CREATEMAN, t1.FUNLIC, t1.SERVICE, t1.SYSTEMADDR, t1.SYSTEMFUN, t1.SYSTEMID, t1.SYSTEMNAME, t1.SYSTEMTYPE, t1.UPDATEDATE, t1.UPDATEMAN FROM T_SRFSYSTEM t1 ",querycodetemp="",declarecode="",dbtype="DB2",
    fieldexps={
        @DEDataQueryCodeExp(name="SYSTEMPARAM",expression="t1.SYSTEMPARAM")
        ,@DEDataQueryCodeExp(name="AURLOGINADDR",expression="t1.AURLOGINADDR")
        ,@DEDataQueryCodeExp(name="AURLOGOUTADDR",expression="t1.AURLOGOUTADDR")
        ,@DEDataQueryCodeExp(name="BIGICON",expression="t1.BIGICON")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="FUNLIC",expression="t1.FUNLIC")
        ,@DEDataQueryCodeExp(name="SERVICE",expression="t1.SERVICE")
        ,@DEDataQueryCodeExp(name="SYSTEMADDR",expression="t1.SYSTEMADDR")
        ,@DEDataQueryCodeExp(name="SYSTEMFUN",expression="t1.SYSTEMFUN")
        ,@DEDataQueryCodeExp(name="SYSTEMID",expression="t1.SYSTEMID")
        ,@DEDataQueryCodeExp(name="SYSTEMNAME",expression="t1.SYSTEMNAME")
        ,@DEDataQueryCodeExp(name="SYSTEMTYPE",expression="t1.SYSTEMTYPE")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.`AURLOGINADDR`, t1.`AURLOGOUTADDR`, t1.`BIGICON`, t1.`CREATEDATE`, t1.`CREATEMAN`, t1.`FUNLIC`, t1.`SERVICE`, t1.`SYSTEMADDR`, t1.`SYSTEMFUN`, t1.`SYSTEMID`, t1.`SYSTEMNAME`, t1.`SYSTEMTYPE`, t1.`UPDATEDATE`, t1.`UPDATEMAN` FROM `T_SRFSYSTEM` t1 ",querycodetemp="",declarecode="",dbtype="MYSQL5",
    fieldexps={
        @DEDataQueryCodeExp(name="SYSTEMPARAM",expression="t1.`SYSTEMPARAM`")
        ,@DEDataQueryCodeExp(name="AURLOGINADDR",expression="t1.`AURLOGINADDR`")
        ,@DEDataQueryCodeExp(name="AURLOGOUTADDR",expression="t1.`AURLOGOUTADDR`")
        ,@DEDataQueryCodeExp(name="BIGICON",expression="t1.`BIGICON`")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.`CREATEDATE`")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.`CREATEMAN`")
        ,@DEDataQueryCodeExp(name="FUNLIC",expression="t1.`FUNLIC`")
        ,@DEDataQueryCodeExp(name="SERVICE",expression="t1.`SERVICE`")
        ,@DEDataQueryCodeExp(name="SYSTEMADDR",expression="t1.`SYSTEMADDR`")
        ,@DEDataQueryCodeExp(name="SYSTEMFUN",expression="t1.`SYSTEMFUN`")
        ,@DEDataQueryCodeExp(name="SYSTEMID",expression="t1.`SYSTEMID`")
        ,@DEDataQueryCodeExp(name="SYSTEMNAME",expression="t1.`SYSTEMNAME`")
        ,@DEDataQueryCodeExp(name="SYSTEMTYPE",expression="t1.`SYSTEMTYPE`")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.`UPDATEDATE`")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.`UPDATEMAN`")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.AURLOGINADDR, t1.AURLOGOUTADDR, t1.BIGICON, t1.CREATEDATE, t1.CREATEMAN, t1.FUNLIC, t1.SERVICE, t1.SYSTEMADDR, t1.SYSTEMFUN, t1.SYSTEMID, t1.SYSTEMNAME, t1.SYSTEMTYPE, t1.UPDATEDATE, t1.UPDATEMAN FROM T_SRFSYSTEM t1 ",querycodetemp="",declarecode="",dbtype="ORACLE",
    fieldexps={
        @DEDataQueryCodeExp(name="SYSTEMPARAM",expression="t1.SYSTEMPARAM")
        ,@DEDataQueryCodeExp(name="AURLOGINADDR",expression="t1.AURLOGINADDR")
        ,@DEDataQueryCodeExp(name="AURLOGOUTADDR",expression="t1.AURLOGOUTADDR")
        ,@DEDataQueryCodeExp(name="BIGICON",expression="t1.BIGICON")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="FUNLIC",expression="t1.FUNLIC")
        ,@DEDataQueryCodeExp(name="SERVICE",expression="t1.SERVICE")
        ,@DEDataQueryCodeExp(name="SYSTEMADDR",expression="t1.SYSTEMADDR")
        ,@DEDataQueryCodeExp(name="SYSTEMFUN",expression="t1.SYSTEMFUN")
        ,@DEDataQueryCodeExp(name="SYSTEMID",expression="t1.SYSTEMID")
        ,@DEDataQueryCodeExp(name="SYSTEMNAME",expression="t1.SYSTEMNAME")
        ,@DEDataQueryCodeExp(name="SYSTEMTYPE",expression="t1.SYSTEMTYPE")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.[AURLOGINADDR], t1.[AURLOGOUTADDR], t1.[BIGICON], t1.[CREATEDATE], t1.[CREATEMAN], t1.[FUNLIC], t1.[SERVICE], t1.[SYSTEMADDR], t1.[SYSTEMFUN], t1.[SYSTEMID], t1.[SYSTEMNAME], t1.[SYSTEMTYPE], t1.[UPDATEDATE], t1.[UPDATEMAN] FROM [T_SRFSYSTEM] t1 ",querycodetemp="",declarecode="",dbtype="SQLSERVER",
    fieldexps={
        @DEDataQueryCodeExp(name="SYSTEMPARAM",expression="t1.[SYSTEMPARAM]")
        ,@DEDataQueryCodeExp(name="AURLOGINADDR",expression="t1.[AURLOGINADDR]")
        ,@DEDataQueryCodeExp(name="AURLOGOUTADDR",expression="t1.[AURLOGOUTADDR]")
        ,@DEDataQueryCodeExp(name="BIGICON",expression="t1.[BIGICON]")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.[CREATEDATE]")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.[CREATEMAN]")
        ,@DEDataQueryCodeExp(name="FUNLIC",expression="t1.[FUNLIC]")
        ,@DEDataQueryCodeExp(name="SERVICE",expression="t1.[SERVICE]")
        ,@DEDataQueryCodeExp(name="SYSTEMADDR",expression="t1.[SYSTEMADDR]")
        ,@DEDataQueryCodeExp(name="SYSTEMFUN",expression="t1.[SYSTEMFUN]")
        ,@DEDataQueryCodeExp(name="SYSTEMID",expression="t1.[SYSTEMID]")
        ,@DEDataQueryCodeExp(name="SYSTEMNAME",expression="t1.[SYSTEMNAME]")
        ,@DEDataQueryCodeExp(name="SYSTEMTYPE",expression="t1.[SYSTEMTYPE]")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.[UPDATEDATE]")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.[UPDATEMAN]")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.AURLOGINADDR, t1.AURLOGOUTADDR, t1.BIGICON, t1.CREATEDATE, t1.CREATEMAN, t1.FUNLIC, t1.SERVICE, t1.SYSTEMADDR, t1.SYSTEMFUN, t1.SYSTEMID, t1.SYSTEMNAME, t1.SYSTEMTYPE, t1.UPDATEDATE, t1.UPDATEMAN FROM T_SRFSYSTEM t1 ",querycodetemp="",declarecode="",dbtype="POSTGRESQL",
    fieldexps={
        @DEDataQueryCodeExp(name="SYSTEMPARAM",expression="t1.SYSTEMPARAM")
        ,@DEDataQueryCodeExp(name="AURLOGINADDR",expression="t1.AURLOGINADDR")
        ,@DEDataQueryCodeExp(name="AURLOGOUTADDR",expression="t1.AURLOGOUTADDR")
        ,@DEDataQueryCodeExp(name="BIGICON",expression="t1.BIGICON")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="FUNLIC",expression="t1.FUNLIC")
        ,@DEDataQueryCodeExp(name="SERVICE",expression="t1.SERVICE")
        ,@DEDataQueryCodeExp(name="SYSTEMADDR",expression="t1.SYSTEMADDR")
        ,@DEDataQueryCodeExp(name="SYSTEMFUN",expression="t1.SYSTEMFUN")
        ,@DEDataQueryCodeExp(name="SYSTEMID",expression="t1.SYSTEMID")
        ,@DEDataQueryCodeExp(name="SYSTEMNAME",expression="t1.SYSTEMNAME")
        ,@DEDataQueryCodeExp(name="SYSTEMTYPE",expression="t1.SYSTEMTYPE")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.AURLOGINADDR, t1.AURLOGOUTADDR, t1.BIGICON, t1.CREATEDATE, t1.CREATEMAN, t1.FUNLIC, t1.SERVICE, t1.SYSTEMADDR, t1.SYSTEMFUN, t1.SYSTEMID, t1.SYSTEMNAME, t1.SYSTEMTYPE, t1.UPDATEDATE, t1.UPDATEMAN FROM T_SRFSYSTEM t1 ",querycodetemp="",declarecode="",dbtype="PPAS",
    fieldexps={
        @DEDataQueryCodeExp(name="SYSTEMPARAM",expression="t1.SYSTEMPARAM")
        ,@DEDataQueryCodeExp(name="AURLOGINADDR",expression="t1.AURLOGINADDR")
        ,@DEDataQueryCodeExp(name="AURLOGOUTADDR",expression="t1.AURLOGOUTADDR")
        ,@DEDataQueryCodeExp(name="BIGICON",expression="t1.BIGICON")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="FUNLIC",expression="t1.FUNLIC")
        ,@DEDataQueryCodeExp(name="SERVICE",expression="t1.SERVICE")
        ,@DEDataQueryCodeExp(name="SYSTEMADDR",expression="t1.SYSTEMADDR")
        ,@DEDataQueryCodeExp(name="SYSTEMFUN",expression="t1.SYSTEMFUN")
        ,@DEDataQueryCodeExp(name="SYSTEMID",expression="t1.SYSTEMID")
        ,@DEDataQueryCodeExp(name="SYSTEMNAME",expression="t1.SYSTEMNAME")
        ,@DEDataQueryCodeExp(name="SYSTEMTYPE",expression="t1.SYSTEMTYPE")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
    },
    conds={})
})
/**
 *  实体数据查询 [DEFAULT]模型基类
 */
public abstract class SystemDefaultDQModelBase extends net.ibizsys.paas.demodel.DEDataQueryModelBase {

    public SystemDefaultDQModelBase() {
        super();

        this.initAnnotation(SystemDefaultDQModelBase.class);
    }

}