/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package net.ibizsys.psrt.srv.common.demodel.userobject.dataquery;



import net.ibizsys.paas.core.DEDataQuery;
import net.ibizsys.paas.core.DEDataQueryCodes;
import net.ibizsys.paas.core.DEDataQueryCode;
import net.ibizsys.paas.core.DEDataQueryCodeExp;
import net.ibizsys.paas.core.DEDataQueryCodeCond;

@DEDataQuery(id="AC308D65-082C-4F63-A4C3-12A1EEB9C7DB",name="DEFAULT")
@DEDataQueryCodes({
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE, t1.CREATEMAN, t1.ENABLE, t1.MEMO, t1.OWNERID, t1.OWNERTYPE, t1.SUBTYPE, t1.UPDATEDATE, t1.UPDATEMAN, t1.USERDATA, t1.USERDATA2, t1.USEROBJECTID, t1.USEROBJECTLEVEL, t1.USEROBJECTNAME, t1.USEROBJECTTYPE FROM T_SRFUSEROBJECT t1 ",querycodetemp="",declarecode="",dbtype="DB2",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="ENABLE",expression="t1.ENABLE")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="OWNERID",expression="t1.OWNERID")
        ,@DEDataQueryCodeExp(name="OWNERTYPE",expression="t1.OWNERTYPE")
        ,@DEDataQueryCodeExp(name="SUBTYPE",expression="t1.SUBTYPE")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="USERDATA",expression="t1.USERDATA")
        ,@DEDataQueryCodeExp(name="USERDATA2",expression="t1.USERDATA2")
        ,@DEDataQueryCodeExp(name="USEROBJECTID",expression="t1.USEROBJECTID")
        ,@DEDataQueryCodeExp(name="USEROBJECTLEVEL",expression="t1.USEROBJECTLEVEL")
        ,@DEDataQueryCodeExp(name="USEROBJECTNAME",expression="t1.USEROBJECTNAME")
        ,@DEDataQueryCodeExp(name="USEROBJECTTYPE",expression="t1.USEROBJECTTYPE")
    },
    conds={
        @DEDataQueryCodeCond(condition="t1.ENABLE = 1")
    }),
    @DEDataQueryCode(querycode="SELECT t1.`CREATEDATE`, t1.`CREATEMAN`, t1.`ENABLE`, t1.`MEMO`, t1.`OWNERID`, t1.`OWNERTYPE`, t1.`SUBTYPE`, t1.`UPDATEDATE`, t1.`UPDATEMAN`, t1.`USERDATA`, t1.`USERDATA2`, t1.`USEROBJECTID`, t1.`USEROBJECTLEVEL`, t1.`USEROBJECTNAME`, t1.`USEROBJECTTYPE` FROM `T_SRFUSEROBJECT` t1 ",querycodetemp="",declarecode="",dbtype="MYSQL5",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.`CREATEDATE`")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.`CREATEMAN`")
        ,@DEDataQueryCodeExp(name="ENABLE",expression="t1.`ENABLE`")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.`MEMO`")
        ,@DEDataQueryCodeExp(name="OWNERID",expression="t1.`OWNERID`")
        ,@DEDataQueryCodeExp(name="OWNERTYPE",expression="t1.`OWNERTYPE`")
        ,@DEDataQueryCodeExp(name="SUBTYPE",expression="t1.`SUBTYPE`")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.`UPDATEDATE`")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.`UPDATEMAN`")
        ,@DEDataQueryCodeExp(name="USERDATA",expression="t1.`USERDATA`")
        ,@DEDataQueryCodeExp(name="USERDATA2",expression="t1.`USERDATA2`")
        ,@DEDataQueryCodeExp(name="USEROBJECTID",expression="t1.`USEROBJECTID`")
        ,@DEDataQueryCodeExp(name="USEROBJECTLEVEL",expression="t1.`USEROBJECTLEVEL`")
        ,@DEDataQueryCodeExp(name="USEROBJECTNAME",expression="t1.`USEROBJECTNAME`")
        ,@DEDataQueryCodeExp(name="USEROBJECTTYPE",expression="t1.`USEROBJECTTYPE`")
    },
    conds={
        @DEDataQueryCodeCond(condition="t1.ENABLE = 1")
    }),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE, t1.CREATEMAN, t1.ENABLE, t1.MEMO, t1.OWNERID, t1.OWNERTYPE, t1.SUBTYPE, t1.UPDATEDATE, t1.UPDATEMAN, t1.USERDATA, t1.USERDATA2, t1.USEROBJECTID, t1.USEROBJECTLEVEL, t1.USEROBJECTNAME, t1.USEROBJECTTYPE FROM T_SRFUSEROBJECT t1 ",querycodetemp="",declarecode="",dbtype="ORACLE",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="ENABLE",expression="t1.ENABLE")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="OWNERID",expression="t1.OWNERID")
        ,@DEDataQueryCodeExp(name="OWNERTYPE",expression="t1.OWNERTYPE")
        ,@DEDataQueryCodeExp(name="SUBTYPE",expression="t1.SUBTYPE")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="USERDATA",expression="t1.USERDATA")
        ,@DEDataQueryCodeExp(name="USERDATA2",expression="t1.USERDATA2")
        ,@DEDataQueryCodeExp(name="USEROBJECTID",expression="t1.USEROBJECTID")
        ,@DEDataQueryCodeExp(name="USEROBJECTLEVEL",expression="t1.USEROBJECTLEVEL")
        ,@DEDataQueryCodeExp(name="USEROBJECTNAME",expression="t1.USEROBJECTNAME")
        ,@DEDataQueryCodeExp(name="USEROBJECTTYPE",expression="t1.USEROBJECTTYPE")
    },
    conds={
        @DEDataQueryCodeCond(condition="t1.ENABLE = 1")
    }),
    @DEDataQueryCode(querycode="SELECT t1.[CREATEDATE], t1.[CREATEMAN], t1.[ENABLE], t1.[MEMO], t1.[OWNERID], t1.[OWNERTYPE], t1.[SUBTYPE], t1.[UPDATEDATE], t1.[UPDATEMAN], t1.[USERDATA], t1.[USERDATA2], t1.[USEROBJECTID], t1.[USEROBJECTLEVEL], t1.[USEROBJECTNAME], t1.[USEROBJECTTYPE] FROM [T_SRFUSEROBJECT] t1 ",querycodetemp="",declarecode="",dbtype="SQLSERVER",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.[CREATEDATE]")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.[CREATEMAN]")
        ,@DEDataQueryCodeExp(name="ENABLE",expression="t1.[ENABLE]")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.[MEMO]")
        ,@DEDataQueryCodeExp(name="OWNERID",expression="t1.[OWNERID]")
        ,@DEDataQueryCodeExp(name="OWNERTYPE",expression="t1.[OWNERTYPE]")
        ,@DEDataQueryCodeExp(name="SUBTYPE",expression="t1.[SUBTYPE]")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.[UPDATEDATE]")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.[UPDATEMAN]")
        ,@DEDataQueryCodeExp(name="USERDATA",expression="t1.[USERDATA]")
        ,@DEDataQueryCodeExp(name="USERDATA2",expression="t1.[USERDATA2]")
        ,@DEDataQueryCodeExp(name="USEROBJECTID",expression="t1.[USEROBJECTID]")
        ,@DEDataQueryCodeExp(name="USEROBJECTLEVEL",expression="t1.[USEROBJECTLEVEL]")
        ,@DEDataQueryCodeExp(name="USEROBJECTNAME",expression="t1.[USEROBJECTNAME]")
        ,@DEDataQueryCodeExp(name="USEROBJECTTYPE",expression="t1.[USEROBJECTTYPE]")
    },
    conds={
        @DEDataQueryCodeCond(condition="t1.ENABLE = 1")
    }),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE, t1.CREATEMAN, t1.ENABLE, t1.MEMO, t1.OWNERID, t1.OWNERTYPE, t1.SUBTYPE, t1.UPDATEDATE, t1.UPDATEMAN, t1.USERDATA, t1.USERDATA2, t1.USEROBJECTID, t1.USEROBJECTLEVEL, t1.USEROBJECTNAME, t1.USEROBJECTTYPE FROM T_SRFUSEROBJECT t1 ",querycodetemp="",declarecode="",dbtype="POSTGRESQL",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="ENABLE",expression="t1.ENABLE")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="OWNERID",expression="t1.OWNERID")
        ,@DEDataQueryCodeExp(name="OWNERTYPE",expression="t1.OWNERTYPE")
        ,@DEDataQueryCodeExp(name="SUBTYPE",expression="t1.SUBTYPE")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="USERDATA",expression="t1.USERDATA")
        ,@DEDataQueryCodeExp(name="USERDATA2",expression="t1.USERDATA2")
        ,@DEDataQueryCodeExp(name="USEROBJECTID",expression="t1.USEROBJECTID")
        ,@DEDataQueryCodeExp(name="USEROBJECTLEVEL",expression="t1.USEROBJECTLEVEL")
        ,@DEDataQueryCodeExp(name="USEROBJECTNAME",expression="t1.USEROBJECTNAME")
        ,@DEDataQueryCodeExp(name="USEROBJECTTYPE",expression="t1.USEROBJECTTYPE")
    },
    conds={
        @DEDataQueryCodeCond(condition="t1.ENABLE = 1")
    }),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE, t1.CREATEMAN, t1.ENABLE, t1.MEMO, t1.OWNERID, t1.OWNERTYPE, t1.SUBTYPE, t1.UPDATEDATE, t1.UPDATEMAN, t1.USERDATA, t1.USERDATA2, t1.USEROBJECTID, t1.USEROBJECTLEVEL, t1.USEROBJECTNAME, t1.USEROBJECTTYPE FROM T_SRFUSEROBJECT t1 ",querycodetemp="",declarecode="",dbtype="PPAS",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="ENABLE",expression="t1.ENABLE")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="OWNERID",expression="t1.OWNERID")
        ,@DEDataQueryCodeExp(name="OWNERTYPE",expression="t1.OWNERTYPE")
        ,@DEDataQueryCodeExp(name="SUBTYPE",expression="t1.SUBTYPE")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="USERDATA",expression="t1.USERDATA")
        ,@DEDataQueryCodeExp(name="USERDATA2",expression="t1.USERDATA2")
        ,@DEDataQueryCodeExp(name="USEROBJECTID",expression="t1.USEROBJECTID")
        ,@DEDataQueryCodeExp(name="USEROBJECTLEVEL",expression="t1.USEROBJECTLEVEL")
        ,@DEDataQueryCodeExp(name="USEROBJECTNAME",expression="t1.USEROBJECTNAME")
        ,@DEDataQueryCodeExp(name="USEROBJECTTYPE",expression="t1.USEROBJECTTYPE")
    },
    conds={
        @DEDataQueryCodeCond(condition="t1.ENABLE = 1")
    })
})
/**
 *  实体数据查询 [DEFAULT]模型基类
 */
public abstract class UserObjectDefaultDQModelBase extends net.ibizsys.paas.demodel.DEDataQueryModelBase {

    public UserObjectDefaultDQModelBase() {
        super();

        this.initAnnotation(UserObjectDefaultDQModelBase.class);
    }

}