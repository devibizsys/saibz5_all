/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package net.ibizsys.psrt.srv.common.demodel.codelist.dataquery;



import net.ibizsys.paas.core.DEDataQuery;
import net.ibizsys.paas.core.DEDataQueryCodes;
import net.ibizsys.paas.core.DEDataQueryCode;
import net.ibizsys.paas.core.DEDataQueryCodeExp;
import net.ibizsys.paas.core.DEDataQueryCodeCond;

@DEDataQuery(id="2979E21D-DCE4-4BB7-BFAD-979351BFA246",name="DEFAULT")
@DEDataQueryCodes({
    @DEDataQueryCode(querycode="SELECT t1.CLPATH, t1.CLVERSION, t1.CODELISTID, t1.CODELISTNAME, t1.CREATEDATE, t1.CREATEMAN, t1.DEID, t11.DENAME, t1.EMPTYTEXT, t1.FILLER, t1.ISSYSTEM, t1.ISUSERSCOPE, t1.MEMO, t1.NOVALUEEMPTY, t1.ORMODE, t1.SEPERATOR, t1.SRFSYSPUB, t1.SRFUSERPUB, t1.UPDATEDATE, t1.UPDATEMAN, t1.VALUESEPERATOR FROM T_SRFCODELIST t1  LEFT JOIN t_srfdataentity t11 ON t1.DEID = t11.DEID ",querycodetemp="",declarecode="",dbtype="DB2",
    fieldexps={
        @DEDataQueryCodeExp(name="CLMODEL",expression="t1.CLMODEL")
        ,@DEDataQueryCodeExp(name="CLPARAM",expression="t1.CLPARAM")
        ,@DEDataQueryCodeExp(name="CLPATH",expression="t1.CLPATH")
        ,@DEDataQueryCodeExp(name="CLVERSION",expression="t1.CLVERSION")
        ,@DEDataQueryCodeExp(name="CODELISTID",expression="t1.CODELISTID")
        ,@DEDataQueryCodeExp(name="CODELISTNAME",expression="t1.CODELISTNAME")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="DEID",expression="t1.DEID")
        ,@DEDataQueryCodeExp(name="DENAME",expression="t11.DENAME")
        ,@DEDataQueryCodeExp(name="EMPTYTEXT",expression="t1.EMPTYTEXT")
        ,@DEDataQueryCodeExp(name="FILLER",expression="t1.FILLER")
        ,@DEDataQueryCodeExp(name="ISSYSTEM",expression="t1.ISSYSTEM")
        ,@DEDataQueryCodeExp(name="ISUSERSCOPE",expression="t1.ISUSERSCOPE")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="NOVALUEEMPTY",expression="t1.NOVALUEEMPTY")
        ,@DEDataQueryCodeExp(name="ORMODE",expression="t1.ORMODE")
        ,@DEDataQueryCodeExp(name="SEPERATOR",expression="t1.SEPERATOR")
        ,@DEDataQueryCodeExp(name="SRFSYSPUB",expression="t1.SRFSYSPUB")
        ,@DEDataQueryCodeExp(name="SRFUSERPUB",expression="t1.SRFUSERPUB")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="VALUESEPERATOR",expression="t1.VALUESEPERATOR")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.`CLPATH`, t1.`CLVERSION`, t1.`CODELISTID`, t1.`CODELISTNAME`, t1.`CREATEDATE`, t1.`CREATEMAN`, t1.`DEID`, t11.`DENAME`, t1.`EMPTYTEXT`, t1.`FILLER`, t1.`ISSYSTEM`, t1.`ISUSERSCOPE`, t1.`MEMO`, t1.`NOVALUEEMPTY`, t1.`ORMODE`, t1.`SEPERATOR`, t1.`SRFSYSPUB`, t1.`SRFUSERPUB`, t1.`UPDATEDATE`, t1.`UPDATEMAN`, t1.`VALUESEPERATOR` FROM `T_SRFCODELIST` t1  LEFT JOIN t_srfdataentity t11 ON t1.DEID = t11.DEID ",querycodetemp="",declarecode="",dbtype="MYSQL5",
    fieldexps={
        @DEDataQueryCodeExp(name="CLMODEL",expression="t1.`CLMODEL`")
        ,@DEDataQueryCodeExp(name="CLPARAM",expression="t1.`CLPARAM`")
        ,@DEDataQueryCodeExp(name="CLPATH",expression="t1.`CLPATH`")
        ,@DEDataQueryCodeExp(name="CLVERSION",expression="t1.`CLVERSION`")
        ,@DEDataQueryCodeExp(name="CODELISTID",expression="t1.`CODELISTID`")
        ,@DEDataQueryCodeExp(name="CODELISTNAME",expression="t1.`CODELISTNAME`")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.`CREATEDATE`")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.`CREATEMAN`")
        ,@DEDataQueryCodeExp(name="DEID",expression="t1.`DEID`")
        ,@DEDataQueryCodeExp(name="DENAME",expression="t11.`DENAME`")
        ,@DEDataQueryCodeExp(name="EMPTYTEXT",expression="t1.`EMPTYTEXT`")
        ,@DEDataQueryCodeExp(name="FILLER",expression="t1.`FILLER`")
        ,@DEDataQueryCodeExp(name="ISSYSTEM",expression="t1.`ISSYSTEM`")
        ,@DEDataQueryCodeExp(name="ISUSERSCOPE",expression="t1.`ISUSERSCOPE`")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.`MEMO`")
        ,@DEDataQueryCodeExp(name="NOVALUEEMPTY",expression="t1.`NOVALUEEMPTY`")
        ,@DEDataQueryCodeExp(name="ORMODE",expression="t1.`ORMODE`")
        ,@DEDataQueryCodeExp(name="SEPERATOR",expression="t1.`SEPERATOR`")
        ,@DEDataQueryCodeExp(name="SRFSYSPUB",expression="t1.`SRFSYSPUB`")
        ,@DEDataQueryCodeExp(name="SRFUSERPUB",expression="t1.`SRFUSERPUB`")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.`UPDATEDATE`")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.`UPDATEMAN`")
        ,@DEDataQueryCodeExp(name="VALUESEPERATOR",expression="t1.`VALUESEPERATOR`")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CLPATH, t1.CLVERSION, t1.CODELISTID, t1.CODELISTNAME, t1.CREATEDATE, t1.CREATEMAN, t1.DEID, t11.DENAME, t1.EMPTYTEXT, t1.FILLER, t1.ISSYSTEM, t1.ISUSERSCOPE, t1.MEMO, t1.NOVALUEEMPTY, t1.ORMODE, t1.SEPERATOR, t1.SRFSYSPUB, t1.SRFUSERPUB, t1.UPDATEDATE, t1.UPDATEMAN, t1.VALUESEPERATOR FROM T_SRFCODELIST t1  LEFT JOIN t_srfdataentity t11 ON t1.DEID = t11.DEID ",querycodetemp="",declarecode="",dbtype="ORACLE",
    fieldexps={
        @DEDataQueryCodeExp(name="CLMODEL",expression="t1.CLMODEL")
        ,@DEDataQueryCodeExp(name="CLPARAM",expression="t1.CLPARAM")
        ,@DEDataQueryCodeExp(name="CLPATH",expression="t1.CLPATH")
        ,@DEDataQueryCodeExp(name="CLVERSION",expression="t1.CLVERSION")
        ,@DEDataQueryCodeExp(name="CODELISTID",expression="t1.CODELISTID")
        ,@DEDataQueryCodeExp(name="CODELISTNAME",expression="t1.CODELISTNAME")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="DEID",expression="t1.DEID")
        ,@DEDataQueryCodeExp(name="DENAME",expression="t11.DENAME")
        ,@DEDataQueryCodeExp(name="EMPTYTEXT",expression="t1.EMPTYTEXT")
        ,@DEDataQueryCodeExp(name="FILLER",expression="t1.FILLER")
        ,@DEDataQueryCodeExp(name="ISSYSTEM",expression="t1.ISSYSTEM")
        ,@DEDataQueryCodeExp(name="ISUSERSCOPE",expression="t1.ISUSERSCOPE")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="NOVALUEEMPTY",expression="t1.NOVALUEEMPTY")
        ,@DEDataQueryCodeExp(name="ORMODE",expression="t1.ORMODE")
        ,@DEDataQueryCodeExp(name="SEPERATOR",expression="t1.SEPERATOR")
        ,@DEDataQueryCodeExp(name="SRFSYSPUB",expression="t1.SRFSYSPUB")
        ,@DEDataQueryCodeExp(name="SRFUSERPUB",expression="t1.SRFUSERPUB")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="VALUESEPERATOR",expression="t1.VALUESEPERATOR")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.[CLPATH], t1.[CLVERSION], t1.[CODELISTID], t1.[CODELISTNAME], t1.[CREATEDATE], t1.[CREATEMAN], t1.[DEID], t11.[DENAME], t1.[EMPTYTEXT], t1.[FILLER], t1.[ISSYSTEM], t1.[ISUSERSCOPE], t1.[MEMO], t1.[NOVALUEEMPTY], t1.[ORMODE], t1.[SEPERATOR], t1.[SRFSYSPUB], t1.[SRFUSERPUB], t1.[UPDATEDATE], t1.[UPDATEMAN], t1.[VALUESEPERATOR] FROM [T_SRFCODELIST] t1  LEFT JOIN t_srfdataentity t11 ON t1.DEID = t11.DEID ",querycodetemp="",declarecode="",dbtype="SQLSERVER",
    fieldexps={
        @DEDataQueryCodeExp(name="CLMODEL",expression="t1.[CLMODEL]")
        ,@DEDataQueryCodeExp(name="CLPARAM",expression="t1.[CLPARAM]")
        ,@DEDataQueryCodeExp(name="CLPATH",expression="t1.[CLPATH]")
        ,@DEDataQueryCodeExp(name="CLVERSION",expression="t1.[CLVERSION]")
        ,@DEDataQueryCodeExp(name="CODELISTID",expression="t1.[CODELISTID]")
        ,@DEDataQueryCodeExp(name="CODELISTNAME",expression="t1.[CODELISTNAME]")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.[CREATEDATE]")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.[CREATEMAN]")
        ,@DEDataQueryCodeExp(name="DEID",expression="t1.[DEID]")
        ,@DEDataQueryCodeExp(name="DENAME",expression="t11.[DENAME]")
        ,@DEDataQueryCodeExp(name="EMPTYTEXT",expression="t1.[EMPTYTEXT]")
        ,@DEDataQueryCodeExp(name="FILLER",expression="t1.[FILLER]")
        ,@DEDataQueryCodeExp(name="ISSYSTEM",expression="t1.[ISSYSTEM]")
        ,@DEDataQueryCodeExp(name="ISUSERSCOPE",expression="t1.[ISUSERSCOPE]")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.[MEMO]")
        ,@DEDataQueryCodeExp(name="NOVALUEEMPTY",expression="t1.[NOVALUEEMPTY]")
        ,@DEDataQueryCodeExp(name="ORMODE",expression="t1.[ORMODE]")
        ,@DEDataQueryCodeExp(name="SEPERATOR",expression="t1.[SEPERATOR]")
        ,@DEDataQueryCodeExp(name="SRFSYSPUB",expression="t1.[SRFSYSPUB]")
        ,@DEDataQueryCodeExp(name="SRFUSERPUB",expression="t1.[SRFUSERPUB]")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.[UPDATEDATE]")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.[UPDATEMAN]")
        ,@DEDataQueryCodeExp(name="VALUESEPERATOR",expression="t1.[VALUESEPERATOR]")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CLPATH, t1.CLVERSION, t1.CODELISTID, t1.CODELISTNAME, t1.CREATEDATE, t1.CREATEMAN, t1.DEID, t11.DENAME, t1.EMPTYTEXT, t1.FILLER, t1.ISSYSTEM, t1.ISUSERSCOPE, t1.MEMO, t1.NOVALUEEMPTY, t1.ORMODE, t1.SEPERATOR, t1.SRFSYSPUB, t1.SRFUSERPUB, t1.UPDATEDATE, t1.UPDATEMAN, t1.VALUESEPERATOR FROM T_SRFCODELIST t1  LEFT JOIN t_srfdataentity t11 ON t1.DEID = t11.DEID ",querycodetemp="",declarecode="",dbtype="POSTGRESQL",
    fieldexps={
        @DEDataQueryCodeExp(name="CLMODEL",expression="t1.CLMODEL")
        ,@DEDataQueryCodeExp(name="CLPARAM",expression="t1.CLPARAM")
        ,@DEDataQueryCodeExp(name="CLPATH",expression="t1.CLPATH")
        ,@DEDataQueryCodeExp(name="CLVERSION",expression="t1.CLVERSION")
        ,@DEDataQueryCodeExp(name="CODELISTID",expression="t1.CODELISTID")
        ,@DEDataQueryCodeExp(name="CODELISTNAME",expression="t1.CODELISTNAME")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="DEID",expression="t1.DEID")
        ,@DEDataQueryCodeExp(name="DENAME",expression="t11.DENAME")
        ,@DEDataQueryCodeExp(name="EMPTYTEXT",expression="t1.EMPTYTEXT")
        ,@DEDataQueryCodeExp(name="FILLER",expression="t1.FILLER")
        ,@DEDataQueryCodeExp(name="ISSYSTEM",expression="t1.ISSYSTEM")
        ,@DEDataQueryCodeExp(name="ISUSERSCOPE",expression="t1.ISUSERSCOPE")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="NOVALUEEMPTY",expression="t1.NOVALUEEMPTY")
        ,@DEDataQueryCodeExp(name="ORMODE",expression="t1.ORMODE")
        ,@DEDataQueryCodeExp(name="SEPERATOR",expression="t1.SEPERATOR")
        ,@DEDataQueryCodeExp(name="SRFSYSPUB",expression="t1.SRFSYSPUB")
        ,@DEDataQueryCodeExp(name="SRFUSERPUB",expression="t1.SRFUSERPUB")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="VALUESEPERATOR",expression="t1.VALUESEPERATOR")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CLPATH, t1.CLVERSION, t1.CODELISTID, t1.CODELISTNAME, t1.CREATEDATE, t1.CREATEMAN, t1.DEID, t11.DENAME, t1.EMPTYTEXT, t1.FILLER, t1.ISSYSTEM, t1.ISUSERSCOPE, t1.MEMO, t1.NOVALUEEMPTY, t1.ORMODE, t1.SEPERATOR, t1.SRFSYSPUB, t1.SRFUSERPUB, t1.UPDATEDATE, t1.UPDATEMAN, t1.VALUESEPERATOR FROM T_SRFCODELIST t1  LEFT JOIN t_srfdataentity t11 ON t1.DEID = t11.DEID ",querycodetemp="",declarecode="",dbtype="PPAS",
    fieldexps={
        @DEDataQueryCodeExp(name="CLMODEL",expression="t1.CLMODEL")
        ,@DEDataQueryCodeExp(name="CLPARAM",expression="t1.CLPARAM")
        ,@DEDataQueryCodeExp(name="CLPATH",expression="t1.CLPATH")
        ,@DEDataQueryCodeExp(name="CLVERSION",expression="t1.CLVERSION")
        ,@DEDataQueryCodeExp(name="CODELISTID",expression="t1.CODELISTID")
        ,@DEDataQueryCodeExp(name="CODELISTNAME",expression="t1.CODELISTNAME")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="DEID",expression="t1.DEID")
        ,@DEDataQueryCodeExp(name="DENAME",expression="t11.DENAME")
        ,@DEDataQueryCodeExp(name="EMPTYTEXT",expression="t1.EMPTYTEXT")
        ,@DEDataQueryCodeExp(name="FILLER",expression="t1.FILLER")
        ,@DEDataQueryCodeExp(name="ISSYSTEM",expression="t1.ISSYSTEM")
        ,@DEDataQueryCodeExp(name="ISUSERSCOPE",expression="t1.ISUSERSCOPE")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="NOVALUEEMPTY",expression="t1.NOVALUEEMPTY")
        ,@DEDataQueryCodeExp(name="ORMODE",expression="t1.ORMODE")
        ,@DEDataQueryCodeExp(name="SEPERATOR",expression="t1.SEPERATOR")
        ,@DEDataQueryCodeExp(name="SRFSYSPUB",expression="t1.SRFSYSPUB")
        ,@DEDataQueryCodeExp(name="SRFUSERPUB",expression="t1.SRFUSERPUB")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="VALUESEPERATOR",expression="t1.VALUESEPERATOR")
    },
    conds={})
})
/**
 *  实体数据查询 [DEFAULT]模型基类
 */
public abstract class CodeListDefaultDQModelBase extends net.ibizsys.paas.demodel.DEDataQueryModelBase {

    public CodeListDefaultDQModelBase() {
        super();

        this.initAnnotation(CodeListDefaultDQModelBase.class);
    }

}