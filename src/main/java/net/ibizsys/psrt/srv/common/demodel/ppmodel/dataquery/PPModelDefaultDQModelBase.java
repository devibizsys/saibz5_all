/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package net.ibizsys.psrt.srv.common.demodel.ppmodel.dataquery;



import net.ibizsys.paas.core.DEDataQuery;
import net.ibizsys.paas.core.DEDataQueryCodes;
import net.ibizsys.paas.core.DEDataQueryCode;
import net.ibizsys.paas.core.DEDataQueryCodeExp;
import net.ibizsys.paas.core.DEDataQueryCodeCond;

@DEDataQuery(id="4F51433B-737D-4ED9-82AC-04FFB4F0AADF",name="DEFAULT")
@DEDataQueryCodes({
    @DEDataQueryCode(querycode="SELECT t1.C1PVPARTCTRLID, t1.C1PVPARTID, t1.C1PVPARTNAME, t1.C2PVPARTCTRLID, t1.C2PVPARTID, t1.C2PVPARTNAME, t1.C3PVPARTCTRLID, t1.C3PVPARTID, t1.C3PVPARTNAME, t1.C4PVPARTCTRLID, t1.C4PVPARTID, t1.C4PVPARTNAME, t1.CREATEDATE, t1.CREATEMAN, t1.ISSYSTEM, t1.L1PVPARTCTRLID, t1.L1PVPARTID, t1.L1PVPARTNAME, t1.L2PVPARTCTRLID, t1.L2PVPARTID, t1.L2PVPARTNAME, t1.L3PVPARTCTRLID, t1.L3PVPARTID, t1.L3PVPARTNAME, t1.L4PVPARTCTRLID, t1.L4PVPARTID, t1.L4PVPARTNAME, t1.OWNERID, t1.PORTALPAGEID, t1.PORTALPAGENAME, t1.PPMODEL, t1.PPMODELID, t1.PPMODELNAME, t1.PPMVERSION, t1.R1PVPARTCTRLID, t1.R1PVPARTID, t1.R1PVPARTNAME, t1.R2PVPARTCTRLID, t1.R2PVPARTID, t1.R2PVPARTNAME, t1.R3PVPARTCTRLID, t1.R3PVPARTID, t1.R3PVPARTNAME, t1.R4PVPARTCTRLID, t1.R4PVPARTID, t1.R4PVPARTNAME, t1.UPDATEDATE, t1.UPDATEMAN FROM T_SRFPPMODEL t1 ",querycodetemp="",declarecode="",dbtype="DB2",
    fieldexps={
        @DEDataQueryCodeExp(name="PPMODELDETAIL",expression="t1.PPMODELDETAIL")
        ,@DEDataQueryCodeExp(name="C1PVPARTCTRLID",expression="t1.C1PVPARTCTRLID")
        ,@DEDataQueryCodeExp(name="C1PVPARTID",expression="t1.C1PVPARTID")
        ,@DEDataQueryCodeExp(name="C1PVPARTNAME",expression="t1.C1PVPARTNAME")
        ,@DEDataQueryCodeExp(name="C2PVPARTCTRLID",expression="t1.C2PVPARTCTRLID")
        ,@DEDataQueryCodeExp(name="C2PVPARTID",expression="t1.C2PVPARTID")
        ,@DEDataQueryCodeExp(name="C2PVPARTNAME",expression="t1.C2PVPARTNAME")
        ,@DEDataQueryCodeExp(name="C3PVPARTCTRLID",expression="t1.C3PVPARTCTRLID")
        ,@DEDataQueryCodeExp(name="C3PVPARTID",expression="t1.C3PVPARTID")
        ,@DEDataQueryCodeExp(name="C3PVPARTNAME",expression="t1.C3PVPARTNAME")
        ,@DEDataQueryCodeExp(name="C4PVPARTCTRLID",expression="t1.C4PVPARTCTRLID")
        ,@DEDataQueryCodeExp(name="C4PVPARTID",expression="t1.C4PVPARTID")
        ,@DEDataQueryCodeExp(name="C4PVPARTNAME",expression="t1.C4PVPARTNAME")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="ISSYSTEM",expression="t1.ISSYSTEM")
        ,@DEDataQueryCodeExp(name="L1PVPARTCTRLID",expression="t1.L1PVPARTCTRLID")
        ,@DEDataQueryCodeExp(name="L1PVPARTID",expression="t1.L1PVPARTID")
        ,@DEDataQueryCodeExp(name="L1PVPARTNAME",expression="t1.L1PVPARTNAME")
        ,@DEDataQueryCodeExp(name="L2PVPARTCTRLID",expression="t1.L2PVPARTCTRLID")
        ,@DEDataQueryCodeExp(name="L2PVPARTID",expression="t1.L2PVPARTID")
        ,@DEDataQueryCodeExp(name="L2PVPARTNAME",expression="t1.L2PVPARTNAME")
        ,@DEDataQueryCodeExp(name="L3PVPARTCTRLID",expression="t1.L3PVPARTCTRLID")
        ,@DEDataQueryCodeExp(name="L3PVPARTID",expression="t1.L3PVPARTID")
        ,@DEDataQueryCodeExp(name="L3PVPARTNAME",expression="t1.L3PVPARTNAME")
        ,@DEDataQueryCodeExp(name="L4PVPARTCTRLID",expression="t1.L4PVPARTCTRLID")
        ,@DEDataQueryCodeExp(name="L4PVPARTID",expression="t1.L4PVPARTID")
        ,@DEDataQueryCodeExp(name="L4PVPARTNAME",expression="t1.L4PVPARTNAME")
        ,@DEDataQueryCodeExp(name="OWNERID",expression="t1.OWNERID")
        ,@DEDataQueryCodeExp(name="PORTALPAGEID",expression="t1.PORTALPAGEID")
        ,@DEDataQueryCodeExp(name="PORTALPAGENAME",expression="t1.PORTALPAGENAME")
        ,@DEDataQueryCodeExp(name="PPMODEL",expression="t1.PPMODEL")
        ,@DEDataQueryCodeExp(name="PPMODELID",expression="t1.PPMODELID")
        ,@DEDataQueryCodeExp(name="PPMODELNAME",expression="t1.PPMODELNAME")
        ,@DEDataQueryCodeExp(name="PPMVERSION",expression="t1.PPMVERSION")
        ,@DEDataQueryCodeExp(name="R1PVPARTCTRLID",expression="t1.R1PVPARTCTRLID")
        ,@DEDataQueryCodeExp(name="R1PVPARTID",expression="t1.R1PVPARTID")
        ,@DEDataQueryCodeExp(name="R1PVPARTNAME",expression="t1.R1PVPARTNAME")
        ,@DEDataQueryCodeExp(name="R2PVPARTCTRLID",expression="t1.R2PVPARTCTRLID")
        ,@DEDataQueryCodeExp(name="R2PVPARTID",expression="t1.R2PVPARTID")
        ,@DEDataQueryCodeExp(name="R2PVPARTNAME",expression="t1.R2PVPARTNAME")
        ,@DEDataQueryCodeExp(name="R3PVPARTCTRLID",expression="t1.R3PVPARTCTRLID")
        ,@DEDataQueryCodeExp(name="R3PVPARTID",expression="t1.R3PVPARTID")
        ,@DEDataQueryCodeExp(name="R3PVPARTNAME",expression="t1.R3PVPARTNAME")
        ,@DEDataQueryCodeExp(name="R4PVPARTCTRLID",expression="t1.R4PVPARTCTRLID")
        ,@DEDataQueryCodeExp(name="R4PVPARTID",expression="t1.R4PVPARTID")
        ,@DEDataQueryCodeExp(name="R4PVPARTNAME",expression="t1.R4PVPARTNAME")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.`C1PVPARTCTRLID`, t1.`C1PVPARTID`, t1.`C1PVPARTNAME`, t1.`C2PVPARTCTRLID`, t1.`C2PVPARTID`, t1.`C2PVPARTNAME`, t1.`C3PVPARTCTRLID`, t1.`C3PVPARTID`, t1.`C3PVPARTNAME`, t1.`C4PVPARTCTRLID`, t1.`C4PVPARTID`, t1.`C4PVPARTNAME`, t1.`CREATEDATE`, t1.`CREATEMAN`, t1.`ISSYSTEM`, t1.`L1PVPARTCTRLID`, t1.`L1PVPARTID`, t1.`L1PVPARTNAME`, t1.`L2PVPARTCTRLID`, t1.`L2PVPARTID`, t1.`L2PVPARTNAME`, t1.`L3PVPARTCTRLID`, t1.`L3PVPARTID`, t1.`L3PVPARTNAME`, t1.`L4PVPARTCTRLID`, t1.`L4PVPARTID`, t1.`L4PVPARTNAME`, t1.`OWNERID`, t1.`PORTALPAGEID`, t1.`PORTALPAGENAME`, t1.`PPMODEL`, t1.`PPMODELID`, t1.`PPMODELNAME`, t1.`PPMVERSION`, t1.`R1PVPARTCTRLID`, t1.`R1PVPARTID`, t1.`R1PVPARTNAME`, t1.`R2PVPARTCTRLID`, t1.`R2PVPARTID`, t1.`R2PVPARTNAME`, t1.`R3PVPARTCTRLID`, t1.`R3PVPARTID`, t1.`R3PVPARTNAME`, t1.`R4PVPARTCTRLID`, t1.`R4PVPARTID`, t1.`R4PVPARTNAME`, t1.`UPDATEDATE`, t1.`UPDATEMAN` FROM `T_SRFPPMODEL` t1 ",querycodetemp="",declarecode="",dbtype="MYSQL5",
    fieldexps={
        @DEDataQueryCodeExp(name="PPMODELDETAIL",expression="t1.`PPMODELDETAIL`")
        ,@DEDataQueryCodeExp(name="C1PVPARTCTRLID",expression="t1.`C1PVPARTCTRLID`")
        ,@DEDataQueryCodeExp(name="C1PVPARTID",expression="t1.`C1PVPARTID`")
        ,@DEDataQueryCodeExp(name="C1PVPARTNAME",expression="t1.`C1PVPARTNAME`")
        ,@DEDataQueryCodeExp(name="C2PVPARTCTRLID",expression="t1.`C2PVPARTCTRLID`")
        ,@DEDataQueryCodeExp(name="C2PVPARTID",expression="t1.`C2PVPARTID`")
        ,@DEDataQueryCodeExp(name="C2PVPARTNAME",expression="t1.`C2PVPARTNAME`")
        ,@DEDataQueryCodeExp(name="C3PVPARTCTRLID",expression="t1.`C3PVPARTCTRLID`")
        ,@DEDataQueryCodeExp(name="C3PVPARTID",expression="t1.`C3PVPARTID`")
        ,@DEDataQueryCodeExp(name="C3PVPARTNAME",expression="t1.`C3PVPARTNAME`")
        ,@DEDataQueryCodeExp(name="C4PVPARTCTRLID",expression="t1.`C4PVPARTCTRLID`")
        ,@DEDataQueryCodeExp(name="C4PVPARTID",expression="t1.`C4PVPARTID`")
        ,@DEDataQueryCodeExp(name="C4PVPARTNAME",expression="t1.`C4PVPARTNAME`")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.`CREATEDATE`")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.`CREATEMAN`")
        ,@DEDataQueryCodeExp(name="ISSYSTEM",expression="t1.`ISSYSTEM`")
        ,@DEDataQueryCodeExp(name="L1PVPARTCTRLID",expression="t1.`L1PVPARTCTRLID`")
        ,@DEDataQueryCodeExp(name="L1PVPARTID",expression="t1.`L1PVPARTID`")
        ,@DEDataQueryCodeExp(name="L1PVPARTNAME",expression="t1.`L1PVPARTNAME`")
        ,@DEDataQueryCodeExp(name="L2PVPARTCTRLID",expression="t1.`L2PVPARTCTRLID`")
        ,@DEDataQueryCodeExp(name="L2PVPARTID",expression="t1.`L2PVPARTID`")
        ,@DEDataQueryCodeExp(name="L2PVPARTNAME",expression="t1.`L2PVPARTNAME`")
        ,@DEDataQueryCodeExp(name="L3PVPARTCTRLID",expression="t1.`L3PVPARTCTRLID`")
        ,@DEDataQueryCodeExp(name="L3PVPARTID",expression="t1.`L3PVPARTID`")
        ,@DEDataQueryCodeExp(name="L3PVPARTNAME",expression="t1.`L3PVPARTNAME`")
        ,@DEDataQueryCodeExp(name="L4PVPARTCTRLID",expression="t1.`L4PVPARTCTRLID`")
        ,@DEDataQueryCodeExp(name="L4PVPARTID",expression="t1.`L4PVPARTID`")
        ,@DEDataQueryCodeExp(name="L4PVPARTNAME",expression="t1.`L4PVPARTNAME`")
        ,@DEDataQueryCodeExp(name="OWNERID",expression="t1.`OWNERID`")
        ,@DEDataQueryCodeExp(name="PORTALPAGEID",expression="t1.`PORTALPAGEID`")
        ,@DEDataQueryCodeExp(name="PORTALPAGENAME",expression="t1.`PORTALPAGENAME`")
        ,@DEDataQueryCodeExp(name="PPMODEL",expression="t1.`PPMODEL`")
        ,@DEDataQueryCodeExp(name="PPMODELID",expression="t1.`PPMODELID`")
        ,@DEDataQueryCodeExp(name="PPMODELNAME",expression="t1.`PPMODELNAME`")
        ,@DEDataQueryCodeExp(name="PPMVERSION",expression="t1.`PPMVERSION`")
        ,@DEDataQueryCodeExp(name="R1PVPARTCTRLID",expression="t1.`R1PVPARTCTRLID`")
        ,@DEDataQueryCodeExp(name="R1PVPARTID",expression="t1.`R1PVPARTID`")
        ,@DEDataQueryCodeExp(name="R1PVPARTNAME",expression="t1.`R1PVPARTNAME`")
        ,@DEDataQueryCodeExp(name="R2PVPARTCTRLID",expression="t1.`R2PVPARTCTRLID`")
        ,@DEDataQueryCodeExp(name="R2PVPARTID",expression="t1.`R2PVPARTID`")
        ,@DEDataQueryCodeExp(name="R2PVPARTNAME",expression="t1.`R2PVPARTNAME`")
        ,@DEDataQueryCodeExp(name="R3PVPARTCTRLID",expression="t1.`R3PVPARTCTRLID`")
        ,@DEDataQueryCodeExp(name="R3PVPARTID",expression="t1.`R3PVPARTID`")
        ,@DEDataQueryCodeExp(name="R3PVPARTNAME",expression="t1.`R3PVPARTNAME`")
        ,@DEDataQueryCodeExp(name="R4PVPARTCTRLID",expression="t1.`R4PVPARTCTRLID`")
        ,@DEDataQueryCodeExp(name="R4PVPARTID",expression="t1.`R4PVPARTID`")
        ,@DEDataQueryCodeExp(name="R4PVPARTNAME",expression="t1.`R4PVPARTNAME`")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.`UPDATEDATE`")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.`UPDATEMAN`")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.C1PVPARTCTRLID, t1.C1PVPARTID, t1.C1PVPARTNAME, t1.C2PVPARTCTRLID, t1.C2PVPARTID, t1.C2PVPARTNAME, t1.C3PVPARTCTRLID, t1.C3PVPARTID, t1.C3PVPARTNAME, t1.C4PVPARTCTRLID, t1.C4PVPARTID, t1.C4PVPARTNAME, t1.CREATEDATE, t1.CREATEMAN, t1.ISSYSTEM, t1.L1PVPARTCTRLID, t1.L1PVPARTID, t1.L1PVPARTNAME, t1.L2PVPARTCTRLID, t1.L2PVPARTID, t1.L2PVPARTNAME, t1.L3PVPARTCTRLID, t1.L3PVPARTID, t1.L3PVPARTNAME, t1.L4PVPARTCTRLID, t1.L4PVPARTID, t1.L4PVPARTNAME, t1.OWNERID, t1.PORTALPAGEID, t1.PORTALPAGENAME, t1.PPMODEL, t1.PPMODELID, t1.PPMODELNAME, t1.PPMVERSION, t1.R1PVPARTCTRLID, t1.R1PVPARTID, t1.R1PVPARTNAME, t1.R2PVPARTCTRLID, t1.R2PVPARTID, t1.R2PVPARTNAME, t1.R3PVPARTCTRLID, t1.R3PVPARTID, t1.R3PVPARTNAME, t1.R4PVPARTCTRLID, t1.R4PVPARTID, t1.R4PVPARTNAME, t1.UPDATEDATE, t1.UPDATEMAN FROM T_SRFPPMODEL t1 ",querycodetemp="",declarecode="",dbtype="ORACLE",
    fieldexps={
        @DEDataQueryCodeExp(name="PPMODELDETAIL",expression="t1.PPMODELDETAIL")
        ,@DEDataQueryCodeExp(name="C1PVPARTCTRLID",expression="t1.C1PVPARTCTRLID")
        ,@DEDataQueryCodeExp(name="C1PVPARTID",expression="t1.C1PVPARTID")
        ,@DEDataQueryCodeExp(name="C1PVPARTNAME",expression="t1.C1PVPARTNAME")
        ,@DEDataQueryCodeExp(name="C2PVPARTCTRLID",expression="t1.C2PVPARTCTRLID")
        ,@DEDataQueryCodeExp(name="C2PVPARTID",expression="t1.C2PVPARTID")
        ,@DEDataQueryCodeExp(name="C2PVPARTNAME",expression="t1.C2PVPARTNAME")
        ,@DEDataQueryCodeExp(name="C3PVPARTCTRLID",expression="t1.C3PVPARTCTRLID")
        ,@DEDataQueryCodeExp(name="C3PVPARTID",expression="t1.C3PVPARTID")
        ,@DEDataQueryCodeExp(name="C3PVPARTNAME",expression="t1.C3PVPARTNAME")
        ,@DEDataQueryCodeExp(name="C4PVPARTCTRLID",expression="t1.C4PVPARTCTRLID")
        ,@DEDataQueryCodeExp(name="C4PVPARTID",expression="t1.C4PVPARTID")
        ,@DEDataQueryCodeExp(name="C4PVPARTNAME",expression="t1.C4PVPARTNAME")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="ISSYSTEM",expression="t1.ISSYSTEM")
        ,@DEDataQueryCodeExp(name="L1PVPARTCTRLID",expression="t1.L1PVPARTCTRLID")
        ,@DEDataQueryCodeExp(name="L1PVPARTID",expression="t1.L1PVPARTID")
        ,@DEDataQueryCodeExp(name="L1PVPARTNAME",expression="t1.L1PVPARTNAME")
        ,@DEDataQueryCodeExp(name="L2PVPARTCTRLID",expression="t1.L2PVPARTCTRLID")
        ,@DEDataQueryCodeExp(name="L2PVPARTID",expression="t1.L2PVPARTID")
        ,@DEDataQueryCodeExp(name="L2PVPARTNAME",expression="t1.L2PVPARTNAME")
        ,@DEDataQueryCodeExp(name="L3PVPARTCTRLID",expression="t1.L3PVPARTCTRLID")
        ,@DEDataQueryCodeExp(name="L3PVPARTID",expression="t1.L3PVPARTID")
        ,@DEDataQueryCodeExp(name="L3PVPARTNAME",expression="t1.L3PVPARTNAME")
        ,@DEDataQueryCodeExp(name="L4PVPARTCTRLID",expression="t1.L4PVPARTCTRLID")
        ,@DEDataQueryCodeExp(name="L4PVPARTID",expression="t1.L4PVPARTID")
        ,@DEDataQueryCodeExp(name="L4PVPARTNAME",expression="t1.L4PVPARTNAME")
        ,@DEDataQueryCodeExp(name="OWNERID",expression="t1.OWNERID")
        ,@DEDataQueryCodeExp(name="PORTALPAGEID",expression="t1.PORTALPAGEID")
        ,@DEDataQueryCodeExp(name="PORTALPAGENAME",expression="t1.PORTALPAGENAME")
        ,@DEDataQueryCodeExp(name="PPMODEL",expression="t1.PPMODEL")
        ,@DEDataQueryCodeExp(name="PPMODELID",expression="t1.PPMODELID")
        ,@DEDataQueryCodeExp(name="PPMODELNAME",expression="t1.PPMODELNAME")
        ,@DEDataQueryCodeExp(name="PPMVERSION",expression="t1.PPMVERSION")
        ,@DEDataQueryCodeExp(name="R1PVPARTCTRLID",expression="t1.R1PVPARTCTRLID")
        ,@DEDataQueryCodeExp(name="R1PVPARTID",expression="t1.R1PVPARTID")
        ,@DEDataQueryCodeExp(name="R1PVPARTNAME",expression="t1.R1PVPARTNAME")
        ,@DEDataQueryCodeExp(name="R2PVPARTCTRLID",expression="t1.R2PVPARTCTRLID")
        ,@DEDataQueryCodeExp(name="R2PVPARTID",expression="t1.R2PVPARTID")
        ,@DEDataQueryCodeExp(name="R2PVPARTNAME",expression="t1.R2PVPARTNAME")
        ,@DEDataQueryCodeExp(name="R3PVPARTCTRLID",expression="t1.R3PVPARTCTRLID")
        ,@DEDataQueryCodeExp(name="R3PVPARTID",expression="t1.R3PVPARTID")
        ,@DEDataQueryCodeExp(name="R3PVPARTNAME",expression="t1.R3PVPARTNAME")
        ,@DEDataQueryCodeExp(name="R4PVPARTCTRLID",expression="t1.R4PVPARTCTRLID")
        ,@DEDataQueryCodeExp(name="R4PVPARTID",expression="t1.R4PVPARTID")
        ,@DEDataQueryCodeExp(name="R4PVPARTNAME",expression="t1.R4PVPARTNAME")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.[C1PVPARTCTRLID], t1.[C1PVPARTID], t1.[C1PVPARTNAME], t1.[C2PVPARTCTRLID], t1.[C2PVPARTID], t1.[C2PVPARTNAME], t1.[C3PVPARTCTRLID], t1.[C3PVPARTID], t1.[C3PVPARTNAME], t1.[C4PVPARTCTRLID], t1.[C4PVPARTID], t1.[C4PVPARTNAME], t1.[CREATEDATE], t1.[CREATEMAN], t1.[ISSYSTEM], t1.[L1PVPARTCTRLID], t1.[L1PVPARTID], t1.[L1PVPARTNAME], t1.[L2PVPARTCTRLID], t1.[L2PVPARTID], t1.[L2PVPARTNAME], t1.[L3PVPARTCTRLID], t1.[L3PVPARTID], t1.[L3PVPARTNAME], t1.[L4PVPARTCTRLID], t1.[L4PVPARTID], t1.[L4PVPARTNAME], t1.[OWNERID], t1.[PORTALPAGEID], t1.[PORTALPAGENAME], t1.[PPMODEL], t1.[PPMODELID], t1.[PPMODELNAME], t1.[PPMVERSION], t1.[R1PVPARTCTRLID], t1.[R1PVPARTID], t1.[R1PVPARTNAME], t1.[R2PVPARTCTRLID], t1.[R2PVPARTID], t1.[R2PVPARTNAME], t1.[R3PVPARTCTRLID], t1.[R3PVPARTID], t1.[R3PVPARTNAME], t1.[R4PVPARTCTRLID], t1.[R4PVPARTID], t1.[R4PVPARTNAME], t1.[UPDATEDATE], t1.[UPDATEMAN] FROM [T_SRFPPMODEL] t1 ",querycodetemp="",declarecode="",dbtype="SQLSERVER",
    fieldexps={
        @DEDataQueryCodeExp(name="PPMODELDETAIL",expression="t1.[PPMODELDETAIL]")
        ,@DEDataQueryCodeExp(name="C1PVPARTCTRLID",expression="t1.[C1PVPARTCTRLID]")
        ,@DEDataQueryCodeExp(name="C1PVPARTID",expression="t1.[C1PVPARTID]")
        ,@DEDataQueryCodeExp(name="C1PVPARTNAME",expression="t1.[C1PVPARTNAME]")
        ,@DEDataQueryCodeExp(name="C2PVPARTCTRLID",expression="t1.[C2PVPARTCTRLID]")
        ,@DEDataQueryCodeExp(name="C2PVPARTID",expression="t1.[C2PVPARTID]")
        ,@DEDataQueryCodeExp(name="C2PVPARTNAME",expression="t1.[C2PVPARTNAME]")
        ,@DEDataQueryCodeExp(name="C3PVPARTCTRLID",expression="t1.[C3PVPARTCTRLID]")
        ,@DEDataQueryCodeExp(name="C3PVPARTID",expression="t1.[C3PVPARTID]")
        ,@DEDataQueryCodeExp(name="C3PVPARTNAME",expression="t1.[C3PVPARTNAME]")
        ,@DEDataQueryCodeExp(name="C4PVPARTCTRLID",expression="t1.[C4PVPARTCTRLID]")
        ,@DEDataQueryCodeExp(name="C4PVPARTID",expression="t1.[C4PVPARTID]")
        ,@DEDataQueryCodeExp(name="C4PVPARTNAME",expression="t1.[C4PVPARTNAME]")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.[CREATEDATE]")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.[CREATEMAN]")
        ,@DEDataQueryCodeExp(name="ISSYSTEM",expression="t1.[ISSYSTEM]")
        ,@DEDataQueryCodeExp(name="L1PVPARTCTRLID",expression="t1.[L1PVPARTCTRLID]")
        ,@DEDataQueryCodeExp(name="L1PVPARTID",expression="t1.[L1PVPARTID]")
        ,@DEDataQueryCodeExp(name="L1PVPARTNAME",expression="t1.[L1PVPARTNAME]")
        ,@DEDataQueryCodeExp(name="L2PVPARTCTRLID",expression="t1.[L2PVPARTCTRLID]")
        ,@DEDataQueryCodeExp(name="L2PVPARTID",expression="t1.[L2PVPARTID]")
        ,@DEDataQueryCodeExp(name="L2PVPARTNAME",expression="t1.[L2PVPARTNAME]")
        ,@DEDataQueryCodeExp(name="L3PVPARTCTRLID",expression="t1.[L3PVPARTCTRLID]")
        ,@DEDataQueryCodeExp(name="L3PVPARTID",expression="t1.[L3PVPARTID]")
        ,@DEDataQueryCodeExp(name="L3PVPARTNAME",expression="t1.[L3PVPARTNAME]")
        ,@DEDataQueryCodeExp(name="L4PVPARTCTRLID",expression="t1.[L4PVPARTCTRLID]")
        ,@DEDataQueryCodeExp(name="L4PVPARTID",expression="t1.[L4PVPARTID]")
        ,@DEDataQueryCodeExp(name="L4PVPARTNAME",expression="t1.[L4PVPARTNAME]")
        ,@DEDataQueryCodeExp(name="OWNERID",expression="t1.[OWNERID]")
        ,@DEDataQueryCodeExp(name="PORTALPAGEID",expression="t1.[PORTALPAGEID]")
        ,@DEDataQueryCodeExp(name="PORTALPAGENAME",expression="t1.[PORTALPAGENAME]")
        ,@DEDataQueryCodeExp(name="PPMODEL",expression="t1.[PPMODEL]")
        ,@DEDataQueryCodeExp(name="PPMODELID",expression="t1.[PPMODELID]")
        ,@DEDataQueryCodeExp(name="PPMODELNAME",expression="t1.[PPMODELNAME]")
        ,@DEDataQueryCodeExp(name="PPMVERSION",expression="t1.[PPMVERSION]")
        ,@DEDataQueryCodeExp(name="R1PVPARTCTRLID",expression="t1.[R1PVPARTCTRLID]")
        ,@DEDataQueryCodeExp(name="R1PVPARTID",expression="t1.[R1PVPARTID]")
        ,@DEDataQueryCodeExp(name="R1PVPARTNAME",expression="t1.[R1PVPARTNAME]")
        ,@DEDataQueryCodeExp(name="R2PVPARTCTRLID",expression="t1.[R2PVPARTCTRLID]")
        ,@DEDataQueryCodeExp(name="R2PVPARTID",expression="t1.[R2PVPARTID]")
        ,@DEDataQueryCodeExp(name="R2PVPARTNAME",expression="t1.[R2PVPARTNAME]")
        ,@DEDataQueryCodeExp(name="R3PVPARTCTRLID",expression="t1.[R3PVPARTCTRLID]")
        ,@DEDataQueryCodeExp(name="R3PVPARTID",expression="t1.[R3PVPARTID]")
        ,@DEDataQueryCodeExp(name="R3PVPARTNAME",expression="t1.[R3PVPARTNAME]")
        ,@DEDataQueryCodeExp(name="R4PVPARTCTRLID",expression="t1.[R4PVPARTCTRLID]")
        ,@DEDataQueryCodeExp(name="R4PVPARTID",expression="t1.[R4PVPARTID]")
        ,@DEDataQueryCodeExp(name="R4PVPARTNAME",expression="t1.[R4PVPARTNAME]")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.[UPDATEDATE]")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.[UPDATEMAN]")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.C1PVPARTCTRLID, t1.C1PVPARTID, t1.C1PVPARTNAME, t1.C2PVPARTCTRLID, t1.C2PVPARTID, t1.C2PVPARTNAME, t1.C3PVPARTCTRLID, t1.C3PVPARTID, t1.C3PVPARTNAME, t1.C4PVPARTCTRLID, t1.C4PVPARTID, t1.C4PVPARTNAME, t1.CREATEDATE, t1.CREATEMAN, t1.ISSYSTEM, t1.L1PVPARTCTRLID, t1.L1PVPARTID, t1.L1PVPARTNAME, t1.L2PVPARTCTRLID, t1.L2PVPARTID, t1.L2PVPARTNAME, t1.L3PVPARTCTRLID, t1.L3PVPARTID, t1.L3PVPARTNAME, t1.L4PVPARTCTRLID, t1.L4PVPARTID, t1.L4PVPARTNAME, t1.OWNERID, t1.PORTALPAGEID, t1.PORTALPAGENAME, t1.PPMODEL, t1.PPMODELID, t1.PPMODELNAME, t1.PPMVERSION, t1.R1PVPARTCTRLID, t1.R1PVPARTID, t1.R1PVPARTNAME, t1.R2PVPARTCTRLID, t1.R2PVPARTID, t1.R2PVPARTNAME, t1.R3PVPARTCTRLID, t1.R3PVPARTID, t1.R3PVPARTNAME, t1.R4PVPARTCTRLID, t1.R4PVPARTID, t1.R4PVPARTNAME, t1.UPDATEDATE, t1.UPDATEMAN FROM T_SRFPPMODEL t1 ",querycodetemp="",declarecode="",dbtype="POSTGRESQL",
    fieldexps={
        @DEDataQueryCodeExp(name="PPMODELDETAIL",expression="t1.PPMODELDETAIL")
        ,@DEDataQueryCodeExp(name="C1PVPARTCTRLID",expression="t1.C1PVPARTCTRLID")
        ,@DEDataQueryCodeExp(name="C1PVPARTID",expression="t1.C1PVPARTID")
        ,@DEDataQueryCodeExp(name="C1PVPARTNAME",expression="t1.C1PVPARTNAME")
        ,@DEDataQueryCodeExp(name="C2PVPARTCTRLID",expression="t1.C2PVPARTCTRLID")
        ,@DEDataQueryCodeExp(name="C2PVPARTID",expression="t1.C2PVPARTID")
        ,@DEDataQueryCodeExp(name="C2PVPARTNAME",expression="t1.C2PVPARTNAME")
        ,@DEDataQueryCodeExp(name="C3PVPARTCTRLID",expression="t1.C3PVPARTCTRLID")
        ,@DEDataQueryCodeExp(name="C3PVPARTID",expression="t1.C3PVPARTID")
        ,@DEDataQueryCodeExp(name="C3PVPARTNAME",expression="t1.C3PVPARTNAME")
        ,@DEDataQueryCodeExp(name="C4PVPARTCTRLID",expression="t1.C4PVPARTCTRLID")
        ,@DEDataQueryCodeExp(name="C4PVPARTID",expression="t1.C4PVPARTID")
        ,@DEDataQueryCodeExp(name="C4PVPARTNAME",expression="t1.C4PVPARTNAME")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="ISSYSTEM",expression="t1.ISSYSTEM")
        ,@DEDataQueryCodeExp(name="L1PVPARTCTRLID",expression="t1.L1PVPARTCTRLID")
        ,@DEDataQueryCodeExp(name="L1PVPARTID",expression="t1.L1PVPARTID")
        ,@DEDataQueryCodeExp(name="L1PVPARTNAME",expression="t1.L1PVPARTNAME")
        ,@DEDataQueryCodeExp(name="L2PVPARTCTRLID",expression="t1.L2PVPARTCTRLID")
        ,@DEDataQueryCodeExp(name="L2PVPARTID",expression="t1.L2PVPARTID")
        ,@DEDataQueryCodeExp(name="L2PVPARTNAME",expression="t1.L2PVPARTNAME")
        ,@DEDataQueryCodeExp(name="L3PVPARTCTRLID",expression="t1.L3PVPARTCTRLID")
        ,@DEDataQueryCodeExp(name="L3PVPARTID",expression="t1.L3PVPARTID")
        ,@DEDataQueryCodeExp(name="L3PVPARTNAME",expression="t1.L3PVPARTNAME")
        ,@DEDataQueryCodeExp(name="L4PVPARTCTRLID",expression="t1.L4PVPARTCTRLID")
        ,@DEDataQueryCodeExp(name="L4PVPARTID",expression="t1.L4PVPARTID")
        ,@DEDataQueryCodeExp(name="L4PVPARTNAME",expression="t1.L4PVPARTNAME")
        ,@DEDataQueryCodeExp(name="OWNERID",expression="t1.OWNERID")
        ,@DEDataQueryCodeExp(name="PORTALPAGEID",expression="t1.PORTALPAGEID")
        ,@DEDataQueryCodeExp(name="PORTALPAGENAME",expression="t1.PORTALPAGENAME")
        ,@DEDataQueryCodeExp(name="PPMODEL",expression="t1.PPMODEL")
        ,@DEDataQueryCodeExp(name="PPMODELID",expression="t1.PPMODELID")
        ,@DEDataQueryCodeExp(name="PPMODELNAME",expression="t1.PPMODELNAME")
        ,@DEDataQueryCodeExp(name="PPMVERSION",expression="t1.PPMVERSION")
        ,@DEDataQueryCodeExp(name="R1PVPARTCTRLID",expression="t1.R1PVPARTCTRLID")
        ,@DEDataQueryCodeExp(name="R1PVPARTID",expression="t1.R1PVPARTID")
        ,@DEDataQueryCodeExp(name="R1PVPARTNAME",expression="t1.R1PVPARTNAME")
        ,@DEDataQueryCodeExp(name="R2PVPARTCTRLID",expression="t1.R2PVPARTCTRLID")
        ,@DEDataQueryCodeExp(name="R2PVPARTID",expression="t1.R2PVPARTID")
        ,@DEDataQueryCodeExp(name="R2PVPARTNAME",expression="t1.R2PVPARTNAME")
        ,@DEDataQueryCodeExp(name="R3PVPARTCTRLID",expression="t1.R3PVPARTCTRLID")
        ,@DEDataQueryCodeExp(name="R3PVPARTID",expression="t1.R3PVPARTID")
        ,@DEDataQueryCodeExp(name="R3PVPARTNAME",expression="t1.R3PVPARTNAME")
        ,@DEDataQueryCodeExp(name="R4PVPARTCTRLID",expression="t1.R4PVPARTCTRLID")
        ,@DEDataQueryCodeExp(name="R4PVPARTID",expression="t1.R4PVPARTID")
        ,@DEDataQueryCodeExp(name="R4PVPARTNAME",expression="t1.R4PVPARTNAME")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.C1PVPARTCTRLID, t1.C1PVPARTID, t1.C1PVPARTNAME, t1.C2PVPARTCTRLID, t1.C2PVPARTID, t1.C2PVPARTNAME, t1.C3PVPARTCTRLID, t1.C3PVPARTID, t1.C3PVPARTNAME, t1.C4PVPARTCTRLID, t1.C4PVPARTID, t1.C4PVPARTNAME, t1.CREATEDATE, t1.CREATEMAN, t1.ISSYSTEM, t1.L1PVPARTCTRLID, t1.L1PVPARTID, t1.L1PVPARTNAME, t1.L2PVPARTCTRLID, t1.L2PVPARTID, t1.L2PVPARTNAME, t1.L3PVPARTCTRLID, t1.L3PVPARTID, t1.L3PVPARTNAME, t1.L4PVPARTCTRLID, t1.L4PVPARTID, t1.L4PVPARTNAME, t1.OWNERID, t1.PORTALPAGEID, t1.PORTALPAGENAME, t1.PPMODEL, t1.PPMODELID, t1.PPMODELNAME, t1.PPMVERSION, t1.R1PVPARTCTRLID, t1.R1PVPARTID, t1.R1PVPARTNAME, t1.R2PVPARTCTRLID, t1.R2PVPARTID, t1.R2PVPARTNAME, t1.R3PVPARTCTRLID, t1.R3PVPARTID, t1.R3PVPARTNAME, t1.R4PVPARTCTRLID, t1.R4PVPARTID, t1.R4PVPARTNAME, t1.UPDATEDATE, t1.UPDATEMAN FROM T_SRFPPMODEL t1 ",querycodetemp="",declarecode="",dbtype="PPAS",
    fieldexps={
        @DEDataQueryCodeExp(name="PPMODELDETAIL",expression="t1.PPMODELDETAIL")
        ,@DEDataQueryCodeExp(name="C1PVPARTCTRLID",expression="t1.C1PVPARTCTRLID")
        ,@DEDataQueryCodeExp(name="C1PVPARTID",expression="t1.C1PVPARTID")
        ,@DEDataQueryCodeExp(name="C1PVPARTNAME",expression="t1.C1PVPARTNAME")
        ,@DEDataQueryCodeExp(name="C2PVPARTCTRLID",expression="t1.C2PVPARTCTRLID")
        ,@DEDataQueryCodeExp(name="C2PVPARTID",expression="t1.C2PVPARTID")
        ,@DEDataQueryCodeExp(name="C2PVPARTNAME",expression="t1.C2PVPARTNAME")
        ,@DEDataQueryCodeExp(name="C3PVPARTCTRLID",expression="t1.C3PVPARTCTRLID")
        ,@DEDataQueryCodeExp(name="C3PVPARTID",expression="t1.C3PVPARTID")
        ,@DEDataQueryCodeExp(name="C3PVPARTNAME",expression="t1.C3PVPARTNAME")
        ,@DEDataQueryCodeExp(name="C4PVPARTCTRLID",expression="t1.C4PVPARTCTRLID")
        ,@DEDataQueryCodeExp(name="C4PVPARTID",expression="t1.C4PVPARTID")
        ,@DEDataQueryCodeExp(name="C4PVPARTNAME",expression="t1.C4PVPARTNAME")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="ISSYSTEM",expression="t1.ISSYSTEM")
        ,@DEDataQueryCodeExp(name="L1PVPARTCTRLID",expression="t1.L1PVPARTCTRLID")
        ,@DEDataQueryCodeExp(name="L1PVPARTID",expression="t1.L1PVPARTID")
        ,@DEDataQueryCodeExp(name="L1PVPARTNAME",expression="t1.L1PVPARTNAME")
        ,@DEDataQueryCodeExp(name="L2PVPARTCTRLID",expression="t1.L2PVPARTCTRLID")
        ,@DEDataQueryCodeExp(name="L2PVPARTID",expression="t1.L2PVPARTID")
        ,@DEDataQueryCodeExp(name="L2PVPARTNAME",expression="t1.L2PVPARTNAME")
        ,@DEDataQueryCodeExp(name="L3PVPARTCTRLID",expression="t1.L3PVPARTCTRLID")
        ,@DEDataQueryCodeExp(name="L3PVPARTID",expression="t1.L3PVPARTID")
        ,@DEDataQueryCodeExp(name="L3PVPARTNAME",expression="t1.L3PVPARTNAME")
        ,@DEDataQueryCodeExp(name="L4PVPARTCTRLID",expression="t1.L4PVPARTCTRLID")
        ,@DEDataQueryCodeExp(name="L4PVPARTID",expression="t1.L4PVPARTID")
        ,@DEDataQueryCodeExp(name="L4PVPARTNAME",expression="t1.L4PVPARTNAME")
        ,@DEDataQueryCodeExp(name="OWNERID",expression="t1.OWNERID")
        ,@DEDataQueryCodeExp(name="PORTALPAGEID",expression="t1.PORTALPAGEID")
        ,@DEDataQueryCodeExp(name="PORTALPAGENAME",expression="t1.PORTALPAGENAME")
        ,@DEDataQueryCodeExp(name="PPMODEL",expression="t1.PPMODEL")
        ,@DEDataQueryCodeExp(name="PPMODELID",expression="t1.PPMODELID")
        ,@DEDataQueryCodeExp(name="PPMODELNAME",expression="t1.PPMODELNAME")
        ,@DEDataQueryCodeExp(name="PPMVERSION",expression="t1.PPMVERSION")
        ,@DEDataQueryCodeExp(name="R1PVPARTCTRLID",expression="t1.R1PVPARTCTRLID")
        ,@DEDataQueryCodeExp(name="R1PVPARTID",expression="t1.R1PVPARTID")
        ,@DEDataQueryCodeExp(name="R1PVPARTNAME",expression="t1.R1PVPARTNAME")
        ,@DEDataQueryCodeExp(name="R2PVPARTCTRLID",expression="t1.R2PVPARTCTRLID")
        ,@DEDataQueryCodeExp(name="R2PVPARTID",expression="t1.R2PVPARTID")
        ,@DEDataQueryCodeExp(name="R2PVPARTNAME",expression="t1.R2PVPARTNAME")
        ,@DEDataQueryCodeExp(name="R3PVPARTCTRLID",expression="t1.R3PVPARTCTRLID")
        ,@DEDataQueryCodeExp(name="R3PVPARTID",expression="t1.R3PVPARTID")
        ,@DEDataQueryCodeExp(name="R3PVPARTNAME",expression="t1.R3PVPARTNAME")
        ,@DEDataQueryCodeExp(name="R4PVPARTCTRLID",expression="t1.R4PVPARTCTRLID")
        ,@DEDataQueryCodeExp(name="R4PVPARTID",expression="t1.R4PVPARTID")
        ,@DEDataQueryCodeExp(name="R4PVPARTNAME",expression="t1.R4PVPARTNAME")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
    },
    conds={})
})
/**
 *  实体数据查询 [DEFAULT]模型基类
 */
public abstract class PPModelDefaultDQModelBase extends net.ibizsys.paas.demodel.DEDataQueryModelBase {

    public PPModelDefaultDQModelBase() {
        super();

        this.initAnnotation(PPModelDefaultDQModelBase.class);
    }

}