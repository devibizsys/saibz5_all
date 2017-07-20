/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package net.ibizsys.psrt.srv.common.demodel.datasyncagent.dataquery;



import net.ibizsys.paas.core.DEDataQuery;
import net.ibizsys.paas.core.DEDataQueryCodes;
import net.ibizsys.paas.core.DEDataQueryCode;
import net.ibizsys.paas.core.DEDataQueryCodeExp;
import net.ibizsys.paas.core.DEDataQueryCodeCond;

@DEDataQuery(id="DD1326DD-0A81-4D3C-BB7C-E3F1CEDC95FE",name="DEFAULT")
@DEDataQueryCodes({
    @DEDataQueryCode(querycode="SELECT t1.AGENTTYPE, t1.CLIENTID, t1.CREATEDATE, t1.CREATEMAN, t1.DATASYNCAGENTID, t1.DATASYNCAGENTNAME, t1.ENABLE, t1.MEMO, t1.PWD, t1.SERVERPATH, t1.SERVICENAME, t1.SYNCDIR, t1.UPDATEDATE, t1.UPDATEMAN, t1.USERNAME FROM T_SRFDATASYNCAGENT t1 ",querycodetemp="",declarecode="",dbtype="DB2",
    fieldexps={
        @DEDataQueryCodeExp(name="AGENTPARAM",expression="t1.AGENTPARAM")
        ,@DEDataQueryCodeExp(name="AGENTTYPE",expression="t1.AGENTTYPE")
        ,@DEDataQueryCodeExp(name="CLIENTID",expression="t1.CLIENTID")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="DATASYNCAGENTID",expression="t1.DATASYNCAGENTID")
        ,@DEDataQueryCodeExp(name="DATASYNCAGENTNAME",expression="t1.DATASYNCAGENTNAME")
        ,@DEDataQueryCodeExp(name="ENABLE",expression="t1.ENABLE")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="PWD",expression="t1.PWD")
        ,@DEDataQueryCodeExp(name="SERVERPATH",expression="t1.SERVERPATH")
        ,@DEDataQueryCodeExp(name="SERVICENAME",expression="t1.SERVICENAME")
        ,@DEDataQueryCodeExp(name="SYNCDIR",expression="t1.SYNCDIR")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="USERNAME",expression="t1.USERNAME")
    },
    conds={
        @DEDataQueryCodeCond(condition="t1.ENABLE = 1")
    }),
    @DEDataQueryCode(querycode="SELECT t1.`AGENTTYPE`, t1.`CLIENTID`, t1.`CREATEDATE`, t1.`CREATEMAN`, t1.`DATASYNCAGENTID`, t1.`DATASYNCAGENTNAME`, t1.`ENABLE`, t1.`MEMO`, t1.`PWD`, t1.`SERVERPATH`, t1.`SERVICENAME`, t1.`SYNCDIR`, t1.`UPDATEDATE`, t1.`UPDATEMAN`, t1.`USERNAME` FROM `T_SRFDATASYNCAGENT` t1 ",querycodetemp="",declarecode="",dbtype="MYSQL5",
    fieldexps={
        @DEDataQueryCodeExp(name="AGENTPARAM",expression="t1.`AGENTPARAM`")
        ,@DEDataQueryCodeExp(name="AGENTTYPE",expression="t1.`AGENTTYPE`")
        ,@DEDataQueryCodeExp(name="CLIENTID",expression="t1.`CLIENTID`")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.`CREATEDATE`")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.`CREATEMAN`")
        ,@DEDataQueryCodeExp(name="DATASYNCAGENTID",expression="t1.`DATASYNCAGENTID`")
        ,@DEDataQueryCodeExp(name="DATASYNCAGENTNAME",expression="t1.`DATASYNCAGENTNAME`")
        ,@DEDataQueryCodeExp(name="ENABLE",expression="t1.`ENABLE`")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.`MEMO`")
        ,@DEDataQueryCodeExp(name="PWD",expression="t1.`PWD`")
        ,@DEDataQueryCodeExp(name="SERVERPATH",expression="t1.`SERVERPATH`")
        ,@DEDataQueryCodeExp(name="SERVICENAME",expression="t1.`SERVICENAME`")
        ,@DEDataQueryCodeExp(name="SYNCDIR",expression="t1.`SYNCDIR`")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.`UPDATEDATE`")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.`UPDATEMAN`")
        ,@DEDataQueryCodeExp(name="USERNAME",expression="t1.`USERNAME`")
    },
    conds={
        @DEDataQueryCodeCond(condition="t1.ENABLE = 1")
    }),
    @DEDataQueryCode(querycode="SELECT t1.AGENTTYPE, t1.CLIENTID, t1.CREATEDATE, t1.CREATEMAN, t1.DATASYNCAGENTID, t1.DATASYNCAGENTNAME, t1.ENABLE, t1.MEMO, t1.PWD, t1.SERVERPATH, t1.SERVICENAME, t1.SYNCDIR, t1.UPDATEDATE, t1.UPDATEMAN, t1.USERNAME FROM T_SRFDATASYNCAGENT t1 ",querycodetemp="",declarecode="",dbtype="ORACLE",
    fieldexps={
        @DEDataQueryCodeExp(name="AGENTPARAM",expression="t1.AGENTPARAM")
        ,@DEDataQueryCodeExp(name="AGENTTYPE",expression="t1.AGENTTYPE")
        ,@DEDataQueryCodeExp(name="CLIENTID",expression="t1.CLIENTID")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="DATASYNCAGENTID",expression="t1.DATASYNCAGENTID")
        ,@DEDataQueryCodeExp(name="DATASYNCAGENTNAME",expression="t1.DATASYNCAGENTNAME")
        ,@DEDataQueryCodeExp(name="ENABLE",expression="t1.ENABLE")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="PWD",expression="t1.PWD")
        ,@DEDataQueryCodeExp(name="SERVERPATH",expression="t1.SERVERPATH")
        ,@DEDataQueryCodeExp(name="SERVICENAME",expression="t1.SERVICENAME")
        ,@DEDataQueryCodeExp(name="SYNCDIR",expression="t1.SYNCDIR")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="USERNAME",expression="t1.USERNAME")
    },
    conds={
        @DEDataQueryCodeCond(condition="t1.ENABLE = 1")
    }),
    @DEDataQueryCode(querycode="SELECT t1.[AGENTTYPE], t1.[CLIENTID], t1.[CREATEDATE], t1.[CREATEMAN], t1.[DATASYNCAGENTID], t1.[DATASYNCAGENTNAME], t1.[ENABLE], t1.[MEMO], t1.[PWD], t1.[SERVERPATH], t1.[SERVICENAME], t1.[SYNCDIR], t1.[UPDATEDATE], t1.[UPDATEMAN], t1.[USERNAME] FROM [T_SRFDATASYNCAGENT] t1 ",querycodetemp="",declarecode="",dbtype="SQLSERVER",
    fieldexps={
        @DEDataQueryCodeExp(name="AGENTPARAM",expression="t1.[AGENTPARAM]")
        ,@DEDataQueryCodeExp(name="AGENTTYPE",expression="t1.[AGENTTYPE]")
        ,@DEDataQueryCodeExp(name="CLIENTID",expression="t1.[CLIENTID]")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.[CREATEDATE]")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.[CREATEMAN]")
        ,@DEDataQueryCodeExp(name="DATASYNCAGENTID",expression="t1.[DATASYNCAGENTID]")
        ,@DEDataQueryCodeExp(name="DATASYNCAGENTNAME",expression="t1.[DATASYNCAGENTNAME]")
        ,@DEDataQueryCodeExp(name="ENABLE",expression="t1.[ENABLE]")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.[MEMO]")
        ,@DEDataQueryCodeExp(name="PWD",expression="t1.[PWD]")
        ,@DEDataQueryCodeExp(name="SERVERPATH",expression="t1.[SERVERPATH]")
        ,@DEDataQueryCodeExp(name="SERVICENAME",expression="t1.[SERVICENAME]")
        ,@DEDataQueryCodeExp(name="SYNCDIR",expression="t1.[SYNCDIR]")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.[UPDATEDATE]")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.[UPDATEMAN]")
        ,@DEDataQueryCodeExp(name="USERNAME",expression="t1.[USERNAME]")
    },
    conds={
        @DEDataQueryCodeCond(condition="t1.ENABLE = 1")
    }),
    @DEDataQueryCode(querycode="SELECT t1.AGENTTYPE, t1.CLIENTID, t1.CREATEDATE, t1.CREATEMAN, t1.DATASYNCAGENTID, t1.DATASYNCAGENTNAME, t1.ENABLE, t1.MEMO, t1.PWD, t1.SERVERPATH, t1.SERVICENAME, t1.SYNCDIR, t1.UPDATEDATE, t1.UPDATEMAN, t1.USERNAME FROM T_SRFDATASYNCAGENT t1 ",querycodetemp="",declarecode="",dbtype="POSTGRESQL",
    fieldexps={
        @DEDataQueryCodeExp(name="AGENTPARAM",expression="t1.AGENTPARAM")
        ,@DEDataQueryCodeExp(name="AGENTTYPE",expression="t1.AGENTTYPE")
        ,@DEDataQueryCodeExp(name="CLIENTID",expression="t1.CLIENTID")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="DATASYNCAGENTID",expression="t1.DATASYNCAGENTID")
        ,@DEDataQueryCodeExp(name="DATASYNCAGENTNAME",expression="t1.DATASYNCAGENTNAME")
        ,@DEDataQueryCodeExp(name="ENABLE",expression="t1.ENABLE")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="PWD",expression="t1.PWD")
        ,@DEDataQueryCodeExp(name="SERVERPATH",expression="t1.SERVERPATH")
        ,@DEDataQueryCodeExp(name="SERVICENAME",expression="t1.SERVICENAME")
        ,@DEDataQueryCodeExp(name="SYNCDIR",expression="t1.SYNCDIR")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="USERNAME",expression="t1.USERNAME")
    },
    conds={
        @DEDataQueryCodeCond(condition="t1.ENABLE = 1")
    }),
    @DEDataQueryCode(querycode="SELECT t1.AGENTTYPE, t1.CLIENTID, t1.CREATEDATE, t1.CREATEMAN, t1.DATASYNCAGENTID, t1.DATASYNCAGENTNAME, t1.ENABLE, t1.MEMO, t1.PWD, t1.SERVERPATH, t1.SERVICENAME, t1.SYNCDIR, t1.UPDATEDATE, t1.UPDATEMAN, t1.USERNAME FROM T_SRFDATASYNCAGENT t1 ",querycodetemp="",declarecode="",dbtype="PPAS",
    fieldexps={
        @DEDataQueryCodeExp(name="AGENTPARAM",expression="t1.AGENTPARAM")
        ,@DEDataQueryCodeExp(name="AGENTTYPE",expression="t1.AGENTTYPE")
        ,@DEDataQueryCodeExp(name="CLIENTID",expression="t1.CLIENTID")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="DATASYNCAGENTID",expression="t1.DATASYNCAGENTID")
        ,@DEDataQueryCodeExp(name="DATASYNCAGENTNAME",expression="t1.DATASYNCAGENTNAME")
        ,@DEDataQueryCodeExp(name="ENABLE",expression="t1.ENABLE")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="PWD",expression="t1.PWD")
        ,@DEDataQueryCodeExp(name="SERVERPATH",expression="t1.SERVERPATH")
        ,@DEDataQueryCodeExp(name="SERVICENAME",expression="t1.SERVICENAME")
        ,@DEDataQueryCodeExp(name="SYNCDIR",expression="t1.SYNCDIR")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="USERNAME",expression="t1.USERNAME")
    },
    conds={
        @DEDataQueryCodeCond(condition="t1.ENABLE = 1")
    })
})
/**
 *  实体数据查询 [DEFAULT]模型基类
 */
public abstract class DataSyncAgentDefaultDQModelBase extends net.ibizsys.paas.demodel.DEDataQueryModelBase {

    public DataSyncAgentDefaultDQModelBase() {
        super();

        this.initAnnotation(DataSyncAgentDefaultDQModelBase.class);
    }

}