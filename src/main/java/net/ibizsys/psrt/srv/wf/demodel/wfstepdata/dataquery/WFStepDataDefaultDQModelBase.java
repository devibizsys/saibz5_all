/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package net.ibizsys.psrt.srv.wf.demodel.wfstepdata.dataquery;



import net.ibizsys.paas.core.DEDataQuery;
import net.ibizsys.paas.core.DEDataQueryCodes;
import net.ibizsys.paas.core.DEDataQueryCode;
import net.ibizsys.paas.core.DEDataQueryCodeExp;
import net.ibizsys.paas.core.DEDataQueryCodeCond;

@DEDataQuery(id="7FEA8600-CF0F-4557-8530-B16D2FA5690A",name="DEFAULT")
@DEDataQueryCodes({
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE AS ACTIONTIME, t1.ACTORID, t1.ACTORNAME, t1.ACTORNAME2, t1.CONNECTIONNAME, t1.CREATEDATE, t1.CREATEMAN, t1.MEMO, t1.NEXTTO, t1.ORIGINALWFUSERID, t1.ORIGINALWFUSERNAME, t1.SDPARAM, t1.SDPARAM2, t1.UPDATEDATE, t1.UPDATEMAN, t1.USERDATA, t1.USERDATADESC, t1.WFINSTANCEID, t1.WFINSTANCENAME, t1.WFPLOGICNAME, t1.WFSTEPDATAID, t1.WFSTEPDATANAME, t1.WFSTEPID, t1.WFSTEPNAME FROM T_SRFWFSTEPDATA t1 ",querycodetemp="",declarecode="",dbtype="DB2",
    fieldexps={
        @DEDataQueryCodeExp(name="ACTIONTIME",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="ACTORID",expression="t1.ACTORID")
        ,@DEDataQueryCodeExp(name="ACTORNAME",expression="t1.ACTORNAME")
        ,@DEDataQueryCodeExp(name="ACTORNAME2",expression="t1.ACTORNAME2")
        ,@DEDataQueryCodeExp(name="CONNECTIONNAME",expression="t1.CONNECTIONNAME")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="NEXTTO",expression="t1.NEXTTO")
        ,@DEDataQueryCodeExp(name="ORIGINALWFUSERID",expression="t1.ORIGINALWFUSERID")
        ,@DEDataQueryCodeExp(name="ORIGINALWFUSERNAME",expression="t1.ORIGINALWFUSERNAME")
        ,@DEDataQueryCodeExp(name="SDPARAM",expression="t1.SDPARAM")
        ,@DEDataQueryCodeExp(name="SDPARAM2",expression="t1.SDPARAM2")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="USERDATA",expression="t1.USERDATA")
        ,@DEDataQueryCodeExp(name="USERDATADESC",expression="t1.USERDATADESC")
        ,@DEDataQueryCodeExp(name="WFINSTANCEID",expression="t1.WFINSTANCEID")
        ,@DEDataQueryCodeExp(name="WFINSTANCENAME",expression="t1.WFINSTANCENAME")
        ,@DEDataQueryCodeExp(name="WFPLOGICNAME",expression="t1.WFPLOGICNAME")
        ,@DEDataQueryCodeExp(name="WFSTEPDATAID",expression="t1.WFSTEPDATAID")
        ,@DEDataQueryCodeExp(name="WFSTEPDATANAME",expression="t1.WFSTEPDATANAME")
        ,@DEDataQueryCodeExp(name="WFSTEPID",expression="t1.WFSTEPID")
        ,@DEDataQueryCodeExp(name="WFSTEPNAME",expression="t1.WFSTEPNAME")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.`CREATEDATE` AS `ACTIONTIME`, t1.`ACTORID`, t1.`ACTORNAME`, t1.`ACTORNAME2`, t1.`CONNECTIONNAME`, t1.`CREATEDATE`, t1.`CREATEMAN`, t1.`MEMO`, t1.`NEXTTO`, t1.`ORIGINALWFUSERID`, t1.`ORIGINALWFUSERNAME`, t1.`SDPARAM`, t1.`SDPARAM2`, t1.`UPDATEDATE`, t1.`UPDATEMAN`, t1.`USERDATA`, t1.`USERDATADESC`, t1.`WFINSTANCEID`, t1.`WFINSTANCENAME`, t1.`WFPLOGICNAME`, t1.`WFSTEPDATAID`, t1.`WFSTEPDATANAME`, t1.`WFSTEPID`, t1.`WFSTEPNAME` FROM `T_SRFWFSTEPDATA` t1 ",querycodetemp="",declarecode="",dbtype="MYSQL5",
    fieldexps={
        @DEDataQueryCodeExp(name="ACTIONTIME",expression="t1.`CREATEDATE`")
        ,@DEDataQueryCodeExp(name="ACTORID",expression="t1.`ACTORID`")
        ,@DEDataQueryCodeExp(name="ACTORNAME",expression="t1.`ACTORNAME`")
        ,@DEDataQueryCodeExp(name="ACTORNAME2",expression="t1.`ACTORNAME2`")
        ,@DEDataQueryCodeExp(name="CONNECTIONNAME",expression="t1.`CONNECTIONNAME`")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.`CREATEDATE`")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.`CREATEMAN`")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.`MEMO`")
        ,@DEDataQueryCodeExp(name="NEXTTO",expression="t1.`NEXTTO`")
        ,@DEDataQueryCodeExp(name="ORIGINALWFUSERID",expression="t1.`ORIGINALWFUSERID`")
        ,@DEDataQueryCodeExp(name="ORIGINALWFUSERNAME",expression="t1.`ORIGINALWFUSERNAME`")
        ,@DEDataQueryCodeExp(name="SDPARAM",expression="t1.`SDPARAM`")
        ,@DEDataQueryCodeExp(name="SDPARAM2",expression="t1.`SDPARAM2`")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.`UPDATEDATE`")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.`UPDATEMAN`")
        ,@DEDataQueryCodeExp(name="USERDATA",expression="t1.`USERDATA`")
        ,@DEDataQueryCodeExp(name="USERDATADESC",expression="t1.`USERDATADESC`")
        ,@DEDataQueryCodeExp(name="WFINSTANCEID",expression="t1.`WFINSTANCEID`")
        ,@DEDataQueryCodeExp(name="WFINSTANCENAME",expression="t1.`WFINSTANCENAME`")
        ,@DEDataQueryCodeExp(name="WFPLOGICNAME",expression="t1.`WFPLOGICNAME`")
        ,@DEDataQueryCodeExp(name="WFSTEPDATAID",expression="t1.`WFSTEPDATAID`")
        ,@DEDataQueryCodeExp(name="WFSTEPDATANAME",expression="t1.`WFSTEPDATANAME`")
        ,@DEDataQueryCodeExp(name="WFSTEPID",expression="t1.`WFSTEPID`")
        ,@DEDataQueryCodeExp(name="WFSTEPNAME",expression="t1.`WFSTEPNAME`")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE AS ACTIONTIME, t1.ACTORID, t1.ACTORNAME, t1.ACTORNAME2, t1.CONNECTIONNAME, t1.CREATEDATE, t1.CREATEMAN, t1.MEMO, t1.NEXTTO, t1.ORIGINALWFUSERID, t1.ORIGINALWFUSERNAME, t1.SDPARAM, t1.SDPARAM2, t1.UPDATEDATE, t1.UPDATEMAN, t1.USERDATA, t1.USERDATADESC, t1.WFINSTANCEID, t1.WFINSTANCENAME, t1.WFPLOGICNAME, t1.WFSTEPDATAID, t1.WFSTEPDATANAME, t1.WFSTEPID, t1.WFSTEPNAME FROM T_SRFWFSTEPDATA t1 ",querycodetemp="",declarecode="",dbtype="ORACLE",
    fieldexps={
        @DEDataQueryCodeExp(name="ACTIONTIME",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="ACTORID",expression="t1.ACTORID")
        ,@DEDataQueryCodeExp(name="ACTORNAME",expression="t1.ACTORNAME")
        ,@DEDataQueryCodeExp(name="ACTORNAME2",expression="t1.ACTORNAME2")
        ,@DEDataQueryCodeExp(name="CONNECTIONNAME",expression="t1.CONNECTIONNAME")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="NEXTTO",expression="t1.NEXTTO")
        ,@DEDataQueryCodeExp(name="ORIGINALWFUSERID",expression="t1.ORIGINALWFUSERID")
        ,@DEDataQueryCodeExp(name="ORIGINALWFUSERNAME",expression="t1.ORIGINALWFUSERNAME")
        ,@DEDataQueryCodeExp(name="SDPARAM",expression="t1.SDPARAM")
        ,@DEDataQueryCodeExp(name="SDPARAM2",expression="t1.SDPARAM2")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="USERDATA",expression="t1.USERDATA")
        ,@DEDataQueryCodeExp(name="USERDATADESC",expression="t1.USERDATADESC")
        ,@DEDataQueryCodeExp(name="WFINSTANCEID",expression="t1.WFINSTANCEID")
        ,@DEDataQueryCodeExp(name="WFINSTANCENAME",expression="t1.WFINSTANCENAME")
        ,@DEDataQueryCodeExp(name="WFPLOGICNAME",expression="t1.WFPLOGICNAME")
        ,@DEDataQueryCodeExp(name="WFSTEPDATAID",expression="t1.WFSTEPDATAID")
        ,@DEDataQueryCodeExp(name="WFSTEPDATANAME",expression="t1.WFSTEPDATANAME")
        ,@DEDataQueryCodeExp(name="WFSTEPID",expression="t1.WFSTEPID")
        ,@DEDataQueryCodeExp(name="WFSTEPNAME",expression="t1.WFSTEPNAME")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.[CREATEDATE] AS [ACTIONTIME], t1.[ACTORID], t1.[ACTORNAME], t1.[ACTORNAME2], t1.[CONNECTIONNAME], t1.[CREATEDATE], t1.[CREATEMAN], t1.[MEMO], t1.[NEXTTO], t1.[ORIGINALWFUSERID], t1.[ORIGINALWFUSERNAME], t1.[SDPARAM], t1.[SDPARAM2], t1.[UPDATEDATE], t1.[UPDATEMAN], t1.[USERDATA], t1.[USERDATADESC], t1.[WFINSTANCEID], t1.[WFINSTANCENAME], t1.[WFPLOGICNAME], t1.[WFSTEPDATAID], t1.[WFSTEPDATANAME], t1.[WFSTEPID], t1.[WFSTEPNAME] FROM [T_SRFWFSTEPDATA] t1 ",querycodetemp="",declarecode="",dbtype="SQLSERVER",
    fieldexps={
        @DEDataQueryCodeExp(name="ACTIONTIME",expression="t1.[CREATEDATE]")
        ,@DEDataQueryCodeExp(name="ACTORID",expression="t1.[ACTORID]")
        ,@DEDataQueryCodeExp(name="ACTORNAME",expression="t1.[ACTORNAME]")
        ,@DEDataQueryCodeExp(name="ACTORNAME2",expression="t1.[ACTORNAME2]")
        ,@DEDataQueryCodeExp(name="CONNECTIONNAME",expression="t1.[CONNECTIONNAME]")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.[CREATEDATE]")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.[CREATEMAN]")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.[MEMO]")
        ,@DEDataQueryCodeExp(name="NEXTTO",expression="t1.[NEXTTO]")
        ,@DEDataQueryCodeExp(name="ORIGINALWFUSERID",expression="t1.[ORIGINALWFUSERID]")
        ,@DEDataQueryCodeExp(name="ORIGINALWFUSERNAME",expression="t1.[ORIGINALWFUSERNAME]")
        ,@DEDataQueryCodeExp(name="SDPARAM",expression="t1.[SDPARAM]")
        ,@DEDataQueryCodeExp(name="SDPARAM2",expression="t1.[SDPARAM2]")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.[UPDATEDATE]")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.[UPDATEMAN]")
        ,@DEDataQueryCodeExp(name="USERDATA",expression="t1.[USERDATA]")
        ,@DEDataQueryCodeExp(name="USERDATADESC",expression="t1.[USERDATADESC]")
        ,@DEDataQueryCodeExp(name="WFINSTANCEID",expression="t1.[WFINSTANCEID]")
        ,@DEDataQueryCodeExp(name="WFINSTANCENAME",expression="t1.[WFINSTANCENAME]")
        ,@DEDataQueryCodeExp(name="WFPLOGICNAME",expression="t1.[WFPLOGICNAME]")
        ,@DEDataQueryCodeExp(name="WFSTEPDATAID",expression="t1.[WFSTEPDATAID]")
        ,@DEDataQueryCodeExp(name="WFSTEPDATANAME",expression="t1.[WFSTEPDATANAME]")
        ,@DEDataQueryCodeExp(name="WFSTEPID",expression="t1.[WFSTEPID]")
        ,@DEDataQueryCodeExp(name="WFSTEPNAME",expression="t1.[WFSTEPNAME]")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE AS ACTIONTIME, t1.ACTORID, t1.ACTORNAME, t1.ACTORNAME2, t1.CONNECTIONNAME, t1.CREATEDATE, t1.CREATEMAN, t1.MEMO, t1.NEXTTO, t1.ORIGINALWFUSERID, t1.ORIGINALWFUSERNAME, t1.SDPARAM, t1.SDPARAM2, t1.UPDATEDATE, t1.UPDATEMAN, t1.USERDATA, t1.USERDATADESC, t1.WFINSTANCEID, t1.WFINSTANCENAME, t1.WFPLOGICNAME, t1.WFSTEPDATAID, t1.WFSTEPDATANAME, t1.WFSTEPID, t1.WFSTEPNAME FROM T_SRFWFSTEPDATA t1 ",querycodetemp="",declarecode="",dbtype="POSTGRESQL",
    fieldexps={
        @DEDataQueryCodeExp(name="ACTIONTIME",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="ACTORID",expression="t1.ACTORID")
        ,@DEDataQueryCodeExp(name="ACTORNAME",expression="t1.ACTORNAME")
        ,@DEDataQueryCodeExp(name="ACTORNAME2",expression="t1.ACTORNAME2")
        ,@DEDataQueryCodeExp(name="CONNECTIONNAME",expression="t1.CONNECTIONNAME")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="NEXTTO",expression="t1.NEXTTO")
        ,@DEDataQueryCodeExp(name="ORIGINALWFUSERID",expression="t1.ORIGINALWFUSERID")
        ,@DEDataQueryCodeExp(name="ORIGINALWFUSERNAME",expression="t1.ORIGINALWFUSERNAME")
        ,@DEDataQueryCodeExp(name="SDPARAM",expression="t1.SDPARAM")
        ,@DEDataQueryCodeExp(name="SDPARAM2",expression="t1.SDPARAM2")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="USERDATA",expression="t1.USERDATA")
        ,@DEDataQueryCodeExp(name="USERDATADESC",expression="t1.USERDATADESC")
        ,@DEDataQueryCodeExp(name="WFINSTANCEID",expression="t1.WFINSTANCEID")
        ,@DEDataQueryCodeExp(name="WFINSTANCENAME",expression="t1.WFINSTANCENAME")
        ,@DEDataQueryCodeExp(name="WFPLOGICNAME",expression="t1.WFPLOGICNAME")
        ,@DEDataQueryCodeExp(name="WFSTEPDATAID",expression="t1.WFSTEPDATAID")
        ,@DEDataQueryCodeExp(name="WFSTEPDATANAME",expression="t1.WFSTEPDATANAME")
        ,@DEDataQueryCodeExp(name="WFSTEPID",expression="t1.WFSTEPID")
        ,@DEDataQueryCodeExp(name="WFSTEPNAME",expression="t1.WFSTEPNAME")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE AS ACTIONTIME, t1.ACTORID, t1.ACTORNAME, t1.ACTORNAME2, t1.CONNECTIONNAME, t1.CREATEDATE, t1.CREATEMAN, t1.MEMO, t1.NEXTTO, t1.ORIGINALWFUSERID, t1.ORIGINALWFUSERNAME, t1.SDPARAM, t1.SDPARAM2, t1.UPDATEDATE, t1.UPDATEMAN, t1.USERDATA, t1.USERDATADESC, t1.WFINSTANCEID, t1.WFINSTANCENAME, t1.WFPLOGICNAME, t1.WFSTEPDATAID, t1.WFSTEPDATANAME, t1.WFSTEPID, t1.WFSTEPNAME FROM T_SRFWFSTEPDATA t1 ",querycodetemp="",declarecode="",dbtype="PPAS",
    fieldexps={
        @DEDataQueryCodeExp(name="ACTIONTIME",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="ACTORID",expression="t1.ACTORID")
        ,@DEDataQueryCodeExp(name="ACTORNAME",expression="t1.ACTORNAME")
        ,@DEDataQueryCodeExp(name="ACTORNAME2",expression="t1.ACTORNAME2")
        ,@DEDataQueryCodeExp(name="CONNECTIONNAME",expression="t1.CONNECTIONNAME")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="NEXTTO",expression="t1.NEXTTO")
        ,@DEDataQueryCodeExp(name="ORIGINALWFUSERID",expression="t1.ORIGINALWFUSERID")
        ,@DEDataQueryCodeExp(name="ORIGINALWFUSERNAME",expression="t1.ORIGINALWFUSERNAME")
        ,@DEDataQueryCodeExp(name="SDPARAM",expression="t1.SDPARAM")
        ,@DEDataQueryCodeExp(name="SDPARAM2",expression="t1.SDPARAM2")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="USERDATA",expression="t1.USERDATA")
        ,@DEDataQueryCodeExp(name="USERDATADESC",expression="t1.USERDATADESC")
        ,@DEDataQueryCodeExp(name="WFINSTANCEID",expression="t1.WFINSTANCEID")
        ,@DEDataQueryCodeExp(name="WFINSTANCENAME",expression="t1.WFINSTANCENAME")
        ,@DEDataQueryCodeExp(name="WFPLOGICNAME",expression="t1.WFPLOGICNAME")
        ,@DEDataQueryCodeExp(name="WFSTEPDATAID",expression="t1.WFSTEPDATAID")
        ,@DEDataQueryCodeExp(name="WFSTEPDATANAME",expression="t1.WFSTEPDATANAME")
        ,@DEDataQueryCodeExp(name="WFSTEPID",expression="t1.WFSTEPID")
        ,@DEDataQueryCodeExp(name="WFSTEPNAME",expression="t1.WFSTEPNAME")
    },
    conds={})
})
/**
 *  实体数据查询 [DEFAULT]模型基类
 */
public abstract class WFStepDataDefaultDQModelBase extends net.ibizsys.paas.demodel.DEDataQueryModelBase {

    public WFStepDataDefaultDQModelBase() {
        super();

        this.initAnnotation(WFStepDataDefaultDQModelBase.class);
    }

}