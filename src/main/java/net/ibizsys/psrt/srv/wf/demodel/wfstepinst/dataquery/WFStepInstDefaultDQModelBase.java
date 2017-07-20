/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package net.ibizsys.psrt.srv.wf.demodel.wfstepinst.dataquery;



import net.ibizsys.paas.core.DEDataQuery;
import net.ibizsys.paas.core.DEDataQueryCodes;
import net.ibizsys.paas.core.DEDataQueryCode;
import net.ibizsys.paas.core.DEDataQueryCodeExp;
import net.ibizsys.paas.core.DEDataQueryCodeCond;

@DEDataQuery(id="C9AE1372-E208-4120-B0F0-ABD3B1869845",name="DEFAULT")
@DEDataQueryCodes({
    @DEDataQueryCode(querycode="SELECT t1.CLOSEFLAG, t1.CREATEDATE, t1.CREATEMAN, t1.RETURNDATA, t1.UPDATEDATE, t1.UPDATEMAN, t1.WFINSTANCEID, t1.WFINSTANCENAME, t1.WFSTEPID, t1.WFSTEPINSTID, t1.WFSTEPINSTNAME, t1.WFSTEPNAME FROM T_SRFWFSTEPINST t1 ",querycodetemp="",declarecode="",dbtype="DB2",
    fieldexps={
        @DEDataQueryCodeExp(name="CLOSEFLAG",expression="t1.CLOSEFLAG")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="RETURNDATA",expression="t1.RETURNDATA")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="WFINSTANCEID",expression="t1.WFINSTANCEID")
        ,@DEDataQueryCodeExp(name="WFINSTANCENAME",expression="t1.WFINSTANCENAME")
        ,@DEDataQueryCodeExp(name="WFSTEPID",expression="t1.WFSTEPID")
        ,@DEDataQueryCodeExp(name="WFSTEPINSTID",expression="t1.WFSTEPINSTID")
        ,@DEDataQueryCodeExp(name="WFSTEPINSTNAME",expression="t1.WFSTEPINSTNAME")
        ,@DEDataQueryCodeExp(name="WFSTEPNAME",expression="t1.WFSTEPNAME")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.`CLOSEFLAG`, t1.`CREATEDATE`, t1.`CREATEMAN`, t1.`RETURNDATA`, t1.`UPDATEDATE`, t1.`UPDATEMAN`, t1.`WFINSTANCEID`, t1.`WFINSTANCENAME`, t1.`WFSTEPID`, t1.`WFSTEPINSTID`, t1.`WFSTEPINSTNAME`, t1.`WFSTEPNAME` FROM `T_SRFWFSTEPINST` t1 ",querycodetemp="",declarecode="",dbtype="MYSQL5",
    fieldexps={
        @DEDataQueryCodeExp(name="CLOSEFLAG",expression="t1.`CLOSEFLAG`")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.`CREATEDATE`")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.`CREATEMAN`")
        ,@DEDataQueryCodeExp(name="RETURNDATA",expression="t1.`RETURNDATA`")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.`UPDATEDATE`")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.`UPDATEMAN`")
        ,@DEDataQueryCodeExp(name="WFINSTANCEID",expression="t1.`WFINSTANCEID`")
        ,@DEDataQueryCodeExp(name="WFINSTANCENAME",expression="t1.`WFINSTANCENAME`")
        ,@DEDataQueryCodeExp(name="WFSTEPID",expression="t1.`WFSTEPID`")
        ,@DEDataQueryCodeExp(name="WFSTEPINSTID",expression="t1.`WFSTEPINSTID`")
        ,@DEDataQueryCodeExp(name="WFSTEPINSTNAME",expression="t1.`WFSTEPINSTNAME`")
        ,@DEDataQueryCodeExp(name="WFSTEPNAME",expression="t1.`WFSTEPNAME`")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CLOSEFLAG, t1.CREATEDATE, t1.CREATEMAN, t1.RETURNDATA, t1.UPDATEDATE, t1.UPDATEMAN, t1.WFINSTANCEID, t1.WFINSTANCENAME, t1.WFSTEPID, t1.WFSTEPINSTID, t1.WFSTEPINSTNAME, t1.WFSTEPNAME FROM T_SRFWFSTEPINST t1 ",querycodetemp="",declarecode="",dbtype="ORACLE",
    fieldexps={
        @DEDataQueryCodeExp(name="CLOSEFLAG",expression="t1.CLOSEFLAG")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="RETURNDATA",expression="t1.RETURNDATA")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="WFINSTANCEID",expression="t1.WFINSTANCEID")
        ,@DEDataQueryCodeExp(name="WFINSTANCENAME",expression="t1.WFINSTANCENAME")
        ,@DEDataQueryCodeExp(name="WFSTEPID",expression="t1.WFSTEPID")
        ,@DEDataQueryCodeExp(name="WFSTEPINSTID",expression="t1.WFSTEPINSTID")
        ,@DEDataQueryCodeExp(name="WFSTEPINSTNAME",expression="t1.WFSTEPINSTNAME")
        ,@DEDataQueryCodeExp(name="WFSTEPNAME",expression="t1.WFSTEPNAME")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.[CLOSEFLAG], t1.[CREATEDATE], t1.[CREATEMAN], t1.[RETURNDATA], t1.[UPDATEDATE], t1.[UPDATEMAN], t1.[WFINSTANCEID], t1.[WFINSTANCENAME], t1.[WFSTEPID], t1.[WFSTEPINSTID], t1.[WFSTEPINSTNAME], t1.[WFSTEPNAME] FROM [T_SRFWFSTEPINST] t1 ",querycodetemp="",declarecode="",dbtype="SQLSERVER",
    fieldexps={
        @DEDataQueryCodeExp(name="CLOSEFLAG",expression="t1.[CLOSEFLAG]")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.[CREATEDATE]")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.[CREATEMAN]")
        ,@DEDataQueryCodeExp(name="RETURNDATA",expression="t1.[RETURNDATA]")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.[UPDATEDATE]")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.[UPDATEMAN]")
        ,@DEDataQueryCodeExp(name="WFINSTANCEID",expression="t1.[WFINSTANCEID]")
        ,@DEDataQueryCodeExp(name="WFINSTANCENAME",expression="t1.[WFINSTANCENAME]")
        ,@DEDataQueryCodeExp(name="WFSTEPID",expression="t1.[WFSTEPID]")
        ,@DEDataQueryCodeExp(name="WFSTEPINSTID",expression="t1.[WFSTEPINSTID]")
        ,@DEDataQueryCodeExp(name="WFSTEPINSTNAME",expression="t1.[WFSTEPINSTNAME]")
        ,@DEDataQueryCodeExp(name="WFSTEPNAME",expression="t1.[WFSTEPNAME]")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CLOSEFLAG, t1.CREATEDATE, t1.CREATEMAN, t1.RETURNDATA, t1.UPDATEDATE, t1.UPDATEMAN, t1.WFINSTANCEID, t1.WFINSTANCENAME, t1.WFSTEPID, t1.WFSTEPINSTID, t1.WFSTEPINSTNAME, t1.WFSTEPNAME FROM T_SRFWFSTEPINST t1 ",querycodetemp="",declarecode="",dbtype="POSTGRESQL",
    fieldexps={
        @DEDataQueryCodeExp(name="CLOSEFLAG",expression="t1.CLOSEFLAG")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="RETURNDATA",expression="t1.RETURNDATA")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="WFINSTANCEID",expression="t1.WFINSTANCEID")
        ,@DEDataQueryCodeExp(name="WFINSTANCENAME",expression="t1.WFINSTANCENAME")
        ,@DEDataQueryCodeExp(name="WFSTEPID",expression="t1.WFSTEPID")
        ,@DEDataQueryCodeExp(name="WFSTEPINSTID",expression="t1.WFSTEPINSTID")
        ,@DEDataQueryCodeExp(name="WFSTEPINSTNAME",expression="t1.WFSTEPINSTNAME")
        ,@DEDataQueryCodeExp(name="WFSTEPNAME",expression="t1.WFSTEPNAME")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CLOSEFLAG, t1.CREATEDATE, t1.CREATEMAN, t1.RETURNDATA, t1.UPDATEDATE, t1.UPDATEMAN, t1.WFINSTANCEID, t1.WFINSTANCENAME, t1.WFSTEPID, t1.WFSTEPINSTID, t1.WFSTEPINSTNAME, t1.WFSTEPNAME FROM T_SRFWFSTEPINST t1 ",querycodetemp="",declarecode="",dbtype="PPAS",
    fieldexps={
        @DEDataQueryCodeExp(name="CLOSEFLAG",expression="t1.CLOSEFLAG")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="RETURNDATA",expression="t1.RETURNDATA")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="WFINSTANCEID",expression="t1.WFINSTANCEID")
        ,@DEDataQueryCodeExp(name="WFINSTANCENAME",expression="t1.WFINSTANCENAME")
        ,@DEDataQueryCodeExp(name="WFSTEPID",expression="t1.WFSTEPID")
        ,@DEDataQueryCodeExp(name="WFSTEPINSTID",expression="t1.WFSTEPINSTID")
        ,@DEDataQueryCodeExp(name="WFSTEPINSTNAME",expression="t1.WFSTEPINSTNAME")
        ,@DEDataQueryCodeExp(name="WFSTEPNAME",expression="t1.WFSTEPNAME")
    },
    conds={})
})
/**
 *  实体数据查询 [DEFAULT]模型基类
 */
public abstract class WFStepInstDefaultDQModelBase extends net.ibizsys.paas.demodel.DEDataQueryModelBase {

    public WFStepInstDefaultDQModelBase() {
        super();

        this.initAnnotation(WFStepInstDefaultDQModelBase.class);
    }

}