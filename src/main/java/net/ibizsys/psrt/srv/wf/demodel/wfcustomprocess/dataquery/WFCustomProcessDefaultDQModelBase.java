/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package net.ibizsys.psrt.srv.wf.demodel.wfcustomprocess.dataquery;



import net.ibizsys.paas.core.DEDataQuery;
import net.ibizsys.paas.core.DEDataQueryCodes;
import net.ibizsys.paas.core.DEDataQueryCode;
import net.ibizsys.paas.core.DEDataQueryCodeExp;
import net.ibizsys.paas.core.DEDataQueryCodeCond;

@DEDataQuery(id="042C742C-717B-4437-83DA-6717A0D1A255",name="DEFAULT")
@DEDataQueryCodes({
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE, t1.CREATEMAN, t1.MEMO, t1.PROCESSOBJECT, t1.UPDATEDATE, t1.UPDATEMAN, t1.VERSION, t1.WFCUSTOMPROCESSID, t1.WFCUSTOMPROCESSNAME FROM T_SRFWFCUSTOMPROCESS t1 ",querycodetemp="",declarecode="",dbtype="DB2",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="PROCESSOBJECT",expression="t1.PROCESSOBJECT")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="VERSION",expression="t1.VERSION")
        ,@DEDataQueryCodeExp(name="WFCUSTOMPROCESSID",expression="t1.WFCUSTOMPROCESSID")
        ,@DEDataQueryCodeExp(name="WFCUSTOMPROCESSNAME",expression="t1.WFCUSTOMPROCESSNAME")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.`CREATEDATE`, t1.`CREATEMAN`, t1.`MEMO`, t1.`PROCESSOBJECT`, t1.`UPDATEDATE`, t1.`UPDATEMAN`, t1.`VERSION`, t1.`WFCUSTOMPROCESSID`, t1.`WFCUSTOMPROCESSNAME` FROM `T_SRFWFCUSTOMPROCESS` t1 ",querycodetemp="",declarecode="",dbtype="MYSQL5",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.`CREATEDATE`")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.`CREATEMAN`")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.`MEMO`")
        ,@DEDataQueryCodeExp(name="PROCESSOBJECT",expression="t1.`PROCESSOBJECT`")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.`UPDATEDATE`")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.`UPDATEMAN`")
        ,@DEDataQueryCodeExp(name="VERSION",expression="t1.`VERSION`")
        ,@DEDataQueryCodeExp(name="WFCUSTOMPROCESSID",expression="t1.`WFCUSTOMPROCESSID`")
        ,@DEDataQueryCodeExp(name="WFCUSTOMPROCESSNAME",expression="t1.`WFCUSTOMPROCESSNAME`")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE, t1.CREATEMAN, t1.MEMO, t1.PROCESSOBJECT, t1.UPDATEDATE, t1.UPDATEMAN, t1.VERSION, t1.WFCUSTOMPROCESSID, t1.WFCUSTOMPROCESSNAME FROM T_SRFWFCUSTOMPROCESS t1 ",querycodetemp="",declarecode="",dbtype="ORACLE",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="PROCESSOBJECT",expression="t1.PROCESSOBJECT")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="VERSION",expression="t1.VERSION")
        ,@DEDataQueryCodeExp(name="WFCUSTOMPROCESSID",expression="t1.WFCUSTOMPROCESSID")
        ,@DEDataQueryCodeExp(name="WFCUSTOMPROCESSNAME",expression="t1.WFCUSTOMPROCESSNAME")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.[CREATEDATE], t1.[CREATEMAN], t1.[MEMO], t1.[PROCESSOBJECT], t1.[UPDATEDATE], t1.[UPDATEMAN], t1.[VERSION], t1.[WFCUSTOMPROCESSID], t1.[WFCUSTOMPROCESSNAME] FROM [T_SRFWFCUSTOMPROCESS] t1 ",querycodetemp="",declarecode="",dbtype="SQLSERVER",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.[CREATEDATE]")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.[CREATEMAN]")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.[MEMO]")
        ,@DEDataQueryCodeExp(name="PROCESSOBJECT",expression="t1.[PROCESSOBJECT]")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.[UPDATEDATE]")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.[UPDATEMAN]")
        ,@DEDataQueryCodeExp(name="VERSION",expression="t1.[VERSION]")
        ,@DEDataQueryCodeExp(name="WFCUSTOMPROCESSID",expression="t1.[WFCUSTOMPROCESSID]")
        ,@DEDataQueryCodeExp(name="WFCUSTOMPROCESSNAME",expression="t1.[WFCUSTOMPROCESSNAME]")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE, t1.CREATEMAN, t1.MEMO, t1.PROCESSOBJECT, t1.UPDATEDATE, t1.UPDATEMAN, t1.VERSION, t1.WFCUSTOMPROCESSID, t1.WFCUSTOMPROCESSNAME FROM T_SRFWFCUSTOMPROCESS t1 ",querycodetemp="",declarecode="",dbtype="POSTGRESQL",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="PROCESSOBJECT",expression="t1.PROCESSOBJECT")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="VERSION",expression="t1.VERSION")
        ,@DEDataQueryCodeExp(name="WFCUSTOMPROCESSID",expression="t1.WFCUSTOMPROCESSID")
        ,@DEDataQueryCodeExp(name="WFCUSTOMPROCESSNAME",expression="t1.WFCUSTOMPROCESSNAME")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE, t1.CREATEMAN, t1.MEMO, t1.PROCESSOBJECT, t1.UPDATEDATE, t1.UPDATEMAN, t1.VERSION, t1.WFCUSTOMPROCESSID, t1.WFCUSTOMPROCESSNAME FROM T_SRFWFCUSTOMPROCESS t1 ",querycodetemp="",declarecode="",dbtype="PPAS",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="PROCESSOBJECT",expression="t1.PROCESSOBJECT")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="VERSION",expression="t1.VERSION")
        ,@DEDataQueryCodeExp(name="WFCUSTOMPROCESSID",expression="t1.WFCUSTOMPROCESSID")
        ,@DEDataQueryCodeExp(name="WFCUSTOMPROCESSNAME",expression="t1.WFCUSTOMPROCESSNAME")
    },
    conds={})
})
/**
 *  实体数据查询 [DEFAULT]模型基类
 */
public abstract class WFCustomProcessDefaultDQModelBase extends net.ibizsys.paas.demodel.DEDataQueryModelBase {

    public WFCustomProcessDefaultDQModelBase() {
        super();

        this.initAnnotation(WFCustomProcessDefaultDQModelBase.class);
    }

}