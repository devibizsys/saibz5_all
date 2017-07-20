/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package net.ibizsys.psrt.srv.common.demodel.codeitem.dataquery;



import net.ibizsys.paas.core.DEDataQuery;
import net.ibizsys.paas.core.DEDataQueryCodes;
import net.ibizsys.paas.core.DEDataQueryCode;
import net.ibizsys.paas.core.DEDataQueryCodeExp;
import net.ibizsys.paas.core.DEDataQueryCodeCond;

@DEDataQuery(id="399859EB-1BCC-4F4B-8EC2-719F1D27DF8E",name="CurCL")
@DEDataQueryCodes({
    @DEDataQueryCode(querycode="SELECT t1.CODEITEMID, t1.CODEITEMNAME, t1.CODEITEMVALUE, t1.CODELISTID, t11.CODELISTNAME, t1.CREATEDATE, t1.CREATEMAN, t1.MEMO, t1.ORDERVALUE, t1.PCODEITEMID, t21.CODEITEMNAME AS PCODEITEMNAME, t1.SHORTKEY, t1.UPDATEDATE, t1.UPDATEMAN FROM T_SRFCODEITEM t1  LEFT JOIN T_SRFCODELIST t11 ON t1.CODELISTID = t11.CODELISTID  LEFT JOIN T_SRFCODEITEM t21 ON t1.PCODEITEMID = t21.CODEITEMID ",querycodetemp="",declarecode="",dbtype="DB2",
    fieldexps={
        @DEDataQueryCodeExp(name="CODEITEMID",expression="t1.CODEITEMID")
        ,@DEDataQueryCodeExp(name="CODEITEMNAME",expression="t1.CODEITEMNAME")
        ,@DEDataQueryCodeExp(name="CODEITEMVALUE",expression="t1.CODEITEMVALUE")
        ,@DEDataQueryCodeExp(name="CODELISTID",expression="t1.CODELISTID")
        ,@DEDataQueryCodeExp(name="CODELISTNAME",expression="t11.CODELISTNAME")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="ORDERVALUE",expression="t1.ORDERVALUE")
        ,@DEDataQueryCodeExp(name="PCODEITEMID",expression="t1.PCODEITEMID")
        ,@DEDataQueryCodeExp(name="PCODEITEMNAME",expression="t21.CODEITEMNAME")
        ,@DEDataQueryCodeExp(name="SHORTKEY",expression="t1.SHORTKEY")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
    },
    conds={
        @DEDataQueryCodeCond(condition="( t1.CODELISTID =  ${srfdatacontext('codelistid','{\"defname\":\"CODELISTID\",\"dename\":\"CODEITEM\"}')} )")
    }),
    @DEDataQueryCode(querycode="SELECT t1.`CODEITEMID`, t1.`CODEITEMNAME`, t1.`CODEITEMVALUE`, t1.`CODELISTID`, t11.`CODELISTNAME`, t1.`CREATEDATE`, t1.`CREATEMAN`, t1.`MEMO`, t1.`ORDERVALUE`, t1.`PCODEITEMID`, t21.`CODEITEMNAME` AS `PCODEITEMNAME`, t1.`SHORTKEY`, t1.`UPDATEDATE`, t1.`UPDATEMAN` FROM `T_SRFCODEITEM` t1  LEFT JOIN T_SRFCODELIST t11 ON t1.CODELISTID = t11.CODELISTID  LEFT JOIN T_SRFCODEITEM t21 ON t1.PCODEITEMID = t21.CODEITEMID ",querycodetemp="",declarecode="",dbtype="MYSQL5",
    fieldexps={
        @DEDataQueryCodeExp(name="CODEITEMID",expression="t1.`CODEITEMID`")
        ,@DEDataQueryCodeExp(name="CODEITEMNAME",expression="t1.`CODEITEMNAME`")
        ,@DEDataQueryCodeExp(name="CODEITEMVALUE",expression="t1.`CODEITEMVALUE`")
        ,@DEDataQueryCodeExp(name="CODELISTID",expression="t1.`CODELISTID`")
        ,@DEDataQueryCodeExp(name="CODELISTNAME",expression="t11.`CODELISTNAME`")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.`CREATEDATE`")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.`CREATEMAN`")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.`MEMO`")
        ,@DEDataQueryCodeExp(name="ORDERVALUE",expression="t1.`ORDERVALUE`")
        ,@DEDataQueryCodeExp(name="PCODEITEMID",expression="t1.`PCODEITEMID`")
        ,@DEDataQueryCodeExp(name="PCODEITEMNAME",expression="t21.`CODEITEMNAME`")
        ,@DEDataQueryCodeExp(name="SHORTKEY",expression="t1.`SHORTKEY`")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.`UPDATEDATE`")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.`UPDATEMAN`")
    },
    conds={
        @DEDataQueryCodeCond(condition="( t1.`CODELISTID` =  ${srfdatacontext('codelistid','{\"defname\":\"CODELISTID\",\"dename\":\"CODEITEM\"}')} )")
    }),
    @DEDataQueryCode(querycode="SELECT t1.CODEITEMID, t1.CODEITEMNAME, t1.CODEITEMVALUE, t1.CODELISTID, t11.CODELISTNAME, t1.CREATEDATE, t1.CREATEMAN, t1.MEMO, t1.ORDERVALUE, t1.PCODEITEMID, t21.CODEITEMNAME AS PCODEITEMNAME, t1.SHORTKEY, t1.UPDATEDATE, t1.UPDATEMAN FROM T_SRFCODEITEM t1  LEFT JOIN T_SRFCODELIST t11 ON t1.CODELISTID = t11.CODELISTID  LEFT JOIN T_SRFCODEITEM t21 ON t1.PCODEITEMID = t21.CODEITEMID ",querycodetemp="",declarecode="",dbtype="ORACLE",
    fieldexps={
        @DEDataQueryCodeExp(name="CODEITEMID",expression="t1.CODEITEMID")
        ,@DEDataQueryCodeExp(name="CODEITEMNAME",expression="t1.CODEITEMNAME")
        ,@DEDataQueryCodeExp(name="CODEITEMVALUE",expression="t1.CODEITEMVALUE")
        ,@DEDataQueryCodeExp(name="CODELISTID",expression="t1.CODELISTID")
        ,@DEDataQueryCodeExp(name="CODELISTNAME",expression="t11.CODELISTNAME")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="ORDERVALUE",expression="t1.ORDERVALUE")
        ,@DEDataQueryCodeExp(name="PCODEITEMID",expression="t1.PCODEITEMID")
        ,@DEDataQueryCodeExp(name="PCODEITEMNAME",expression="t21.CODEITEMNAME")
        ,@DEDataQueryCodeExp(name="SHORTKEY",expression="t1.SHORTKEY")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
    },
    conds={
        @DEDataQueryCodeCond(condition="( t1.CODELISTID =  ${srfdatacontext('codelistid','{\"defname\":\"CODELISTID\",\"dename\":\"CODEITEM\"}')} )")
    }),
    @DEDataQueryCode(querycode="SELECT t1.[CODEITEMID], t1.[CODEITEMNAME], t1.[CODEITEMVALUE], t1.[CODELISTID], t11.[CODELISTNAME], t1.[CREATEDATE], t1.[CREATEMAN], t1.[MEMO], t1.[ORDERVALUE], t1.[PCODEITEMID], t21.[CODEITEMNAME] AS [PCODEITEMNAME], t1.[SHORTKEY], t1.[UPDATEDATE], t1.[UPDATEMAN] FROM [T_SRFCODEITEM] t1  LEFT JOIN T_SRFCODELIST t11 ON t1.CODELISTID = t11.CODELISTID  LEFT JOIN T_SRFCODEITEM t21 ON t1.PCODEITEMID = t21.CODEITEMID ",querycodetemp="",declarecode="",dbtype="SQLSERVER",
    fieldexps={
        @DEDataQueryCodeExp(name="CODEITEMID",expression="t1.[CODEITEMID]")
        ,@DEDataQueryCodeExp(name="CODEITEMNAME",expression="t1.[CODEITEMNAME]")
        ,@DEDataQueryCodeExp(name="CODEITEMVALUE",expression="t1.[CODEITEMVALUE]")
        ,@DEDataQueryCodeExp(name="CODELISTID",expression="t1.[CODELISTID]")
        ,@DEDataQueryCodeExp(name="CODELISTNAME",expression="t11.[CODELISTNAME]")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.[CREATEDATE]")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.[CREATEMAN]")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.[MEMO]")
        ,@DEDataQueryCodeExp(name="ORDERVALUE",expression="t1.[ORDERVALUE]")
        ,@DEDataQueryCodeExp(name="PCODEITEMID",expression="t1.[PCODEITEMID]")
        ,@DEDataQueryCodeExp(name="PCODEITEMNAME",expression="t21.[CODEITEMNAME]")
        ,@DEDataQueryCodeExp(name="SHORTKEY",expression="t1.[SHORTKEY]")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.[UPDATEDATE]")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.[UPDATEMAN]")
    },
    conds={
        @DEDataQueryCodeCond(condition="( t1.[CODELISTID] =  ${srfdatacontext('codelistid','{\"defname\":\"CODELISTID\",\"dename\":\"CODEITEM\"}')} )")
    }),
    @DEDataQueryCode(querycode="SELECT t1.CODEITEMID, t1.CODEITEMNAME, t1.CODEITEMVALUE, t1.CODELISTID, t11.CODELISTNAME, t1.CREATEDATE, t1.CREATEMAN, t1.MEMO, t1.ORDERVALUE, t1.PCODEITEMID, t21.CODEITEMNAME AS PCODEITEMNAME, t1.SHORTKEY, t1.UPDATEDATE, t1.UPDATEMAN FROM T_SRFCODEITEM t1  LEFT JOIN T_SRFCODELIST t11 ON t1.CODELISTID = t11.CODELISTID  LEFT JOIN T_SRFCODEITEM t21 ON t1.PCODEITEMID = t21.CODEITEMID ",querycodetemp="",declarecode="",dbtype="POSTGRESQL",
    fieldexps={
        @DEDataQueryCodeExp(name="CODEITEMID",expression="t1.CODEITEMID")
        ,@DEDataQueryCodeExp(name="CODEITEMNAME",expression="t1.CODEITEMNAME")
        ,@DEDataQueryCodeExp(name="CODEITEMVALUE",expression="t1.CODEITEMVALUE")
        ,@DEDataQueryCodeExp(name="CODELISTID",expression="t1.CODELISTID")
        ,@DEDataQueryCodeExp(name="CODELISTNAME",expression="t11.CODELISTNAME")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="ORDERVALUE",expression="t1.ORDERVALUE")
        ,@DEDataQueryCodeExp(name="PCODEITEMID",expression="t1.PCODEITEMID")
        ,@DEDataQueryCodeExp(name="PCODEITEMNAME",expression="t21.CODEITEMNAME")
        ,@DEDataQueryCodeExp(name="SHORTKEY",expression="t1.SHORTKEY")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
    },
    conds={
        @DEDataQueryCodeCond(condition="( t1.CODELISTID =  ${srfdatacontext('codelistid','{\"defname\":\"CODELISTID\",\"dename\":\"CODEITEM\"}')} )")
    }),
    @DEDataQueryCode(querycode="SELECT t1.CODEITEMID, t1.CODEITEMNAME, t1.CODEITEMVALUE, t1.CODELISTID, t11.CODELISTNAME, t1.CREATEDATE, t1.CREATEMAN, t1.MEMO, t1.ORDERVALUE, t1.PCODEITEMID, t21.CODEITEMNAME AS PCODEITEMNAME, t1.SHORTKEY, t1.UPDATEDATE, t1.UPDATEMAN FROM T_SRFCODEITEM t1  LEFT JOIN T_SRFCODELIST t11 ON t1.CODELISTID = t11.CODELISTID  LEFT JOIN T_SRFCODEITEM t21 ON t1.PCODEITEMID = t21.CODEITEMID ",querycodetemp="",declarecode="",dbtype="PPAS",
    fieldexps={
        @DEDataQueryCodeExp(name="CODEITEMID",expression="t1.CODEITEMID")
        ,@DEDataQueryCodeExp(name="CODEITEMNAME",expression="t1.CODEITEMNAME")
        ,@DEDataQueryCodeExp(name="CODEITEMVALUE",expression="t1.CODEITEMVALUE")
        ,@DEDataQueryCodeExp(name="CODELISTID",expression="t1.CODELISTID")
        ,@DEDataQueryCodeExp(name="CODELISTNAME",expression="t11.CODELISTNAME")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="ORDERVALUE",expression="t1.ORDERVALUE")
        ,@DEDataQueryCodeExp(name="PCODEITEMID",expression="t1.PCODEITEMID")
        ,@DEDataQueryCodeExp(name="PCODEITEMNAME",expression="t21.CODEITEMNAME")
        ,@DEDataQueryCodeExp(name="SHORTKEY",expression="t1.SHORTKEY")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
    },
    conds={
        @DEDataQueryCodeCond(condition="( t1.CODELISTID =  ${srfdatacontext('codelistid','{\"defname\":\"CODELISTID\",\"dename\":\"CODEITEM\"}')} )")
    })
})
/**
 *  实体数据查询 [当前代码表]模型基类
 */
public abstract class CodeItemCurCLDQModelBase extends net.ibizsys.paas.demodel.DEDataQueryModelBase {

    public CodeItemCurCLDQModelBase() {
        super();

        this.initAnnotation(CodeItemCurCLDQModelBase.class);
    }

}