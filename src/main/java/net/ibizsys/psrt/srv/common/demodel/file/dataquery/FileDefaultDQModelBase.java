/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package net.ibizsys.psrt.srv.common.demodel.file.dataquery;



import net.ibizsys.paas.core.DEDataQuery;
import net.ibizsys.paas.core.DEDataQueryCodes;
import net.ibizsys.paas.core.DEDataQueryCode;
import net.ibizsys.paas.core.DEDataQueryCodeExp;
import net.ibizsys.paas.core.DEDataQueryCodeCond;

@DEDataQuery(id="160D07ED-4D8E-4292-A60C-63F66CCFAE27",name="DEFAULT")
@DEDataQueryCodes({
    @DEDataQueryCode(querycode="SELECT t1.`CREATEDATE`, t1.`CREATEMAN`, t1.`DIGESTCODE`, t1.`ENABLE`, t1.`FILENAME2`, t1.`FILESIZE`, t1.`FILE_ID`, t1.`FILE_NAME`, t1.`FOLDER`, t1.`LOCALPATH`, t1.`LOCALPATH2`, t1.`OWNERID`, t1.`OWNERTYPE`, t1.`PICHEIGHT`, t1.`PICWIDTH`, t1.`RESERVER`, t1.`RESERVER2`, t1.`RESERVER3`, t1.`RESERVER4`, t1.`UPDATEDATE`, t1.`UPDATEMAN` FROM `T_SRFFILE` t1 ",querycodetemp="",declarecode="",dbtype="MYSQL5",
    fieldexps={
        @DEDataQueryCodeExp(name="MEMO",expression="t1.`MEMO`")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.`CREATEDATE`")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.`CREATEMAN`")
        ,@DEDataQueryCodeExp(name="DIGESTCODE",expression="t1.`DIGESTCODE`")
        ,@DEDataQueryCodeExp(name="ENABLE",expression="t1.`ENABLE`")
        ,@DEDataQueryCodeExp(name="FILENAME2",expression="t1.`FILENAME2`")
        ,@DEDataQueryCodeExp(name="FILESIZE",expression="t1.`FILESIZE`")
        ,@DEDataQueryCodeExp(name="FILE_ID",expression="t1.`FILE_ID`")
        ,@DEDataQueryCodeExp(name="FILE_NAME",expression="t1.`FILE_NAME`")
        ,@DEDataQueryCodeExp(name="FOLDER",expression="t1.`FOLDER`")
        ,@DEDataQueryCodeExp(name="LOCALPATH",expression="t1.`LOCALPATH`")
        ,@DEDataQueryCodeExp(name="LOCALPATH2",expression="t1.`LOCALPATH2`")
        ,@DEDataQueryCodeExp(name="OWNERID",expression="t1.`OWNERID`")
        ,@DEDataQueryCodeExp(name="OWNERTYPE",expression="t1.`OWNERTYPE`")
        ,@DEDataQueryCodeExp(name="PICHEIGHT",expression="t1.`PICHEIGHT`")
        ,@DEDataQueryCodeExp(name="PICWIDTH",expression="t1.`PICWIDTH`")
        ,@DEDataQueryCodeExp(name="RESERVER",expression="t1.`RESERVER`")
        ,@DEDataQueryCodeExp(name="RESERVER2",expression="t1.`RESERVER2`")
        ,@DEDataQueryCodeExp(name="RESERVER3",expression="t1.`RESERVER3`")
        ,@DEDataQueryCodeExp(name="RESERVER4",expression="t1.`RESERVER4`")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.`UPDATEDATE`")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.`UPDATEMAN`")
    },
    conds={
        @DEDataQueryCodeCond(condition="t1.ENABLE = 1")
    }),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE, t1.CREATEMAN, t1.DIGESTCODE, t1.ENABLE, t1.FILENAME2, t1.FILESIZE, t1.FILE_ID, t1.FILE_NAME, t1.FOLDER, t1.LOCALPATH, t1.LOCALPATH2, t1.OWNERID, t1.OWNERTYPE, t1.PICHEIGHT, t1.PICWIDTH, t1.RESERVER, t1.RESERVER2, t1.RESERVER3, t1.RESERVER4, t1.UPDATEDATE, t1.UPDATEMAN FROM T_SRFFILE t1 ",querycodetemp="",declarecode="",dbtype="DB2",
    fieldexps={
        @DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="DIGESTCODE",expression="t1.DIGESTCODE")
        ,@DEDataQueryCodeExp(name="ENABLE",expression="t1.ENABLE")
        ,@DEDataQueryCodeExp(name="FILENAME2",expression="t1.FILENAME2")
        ,@DEDataQueryCodeExp(name="FILESIZE",expression="t1.FILESIZE")
        ,@DEDataQueryCodeExp(name="FILE_ID",expression="t1.FILE_ID")
        ,@DEDataQueryCodeExp(name="FILE_NAME",expression="t1.FILE_NAME")
        ,@DEDataQueryCodeExp(name="FOLDER",expression="t1.FOLDER")
        ,@DEDataQueryCodeExp(name="LOCALPATH",expression="t1.LOCALPATH")
        ,@DEDataQueryCodeExp(name="LOCALPATH2",expression="t1.LOCALPATH2")
        ,@DEDataQueryCodeExp(name="OWNERID",expression="t1.OWNERID")
        ,@DEDataQueryCodeExp(name="OWNERTYPE",expression="t1.OWNERTYPE")
        ,@DEDataQueryCodeExp(name="PICHEIGHT",expression="t1.PICHEIGHT")
        ,@DEDataQueryCodeExp(name="PICWIDTH",expression="t1.PICWIDTH")
        ,@DEDataQueryCodeExp(name="RESERVER",expression="t1.RESERVER")
        ,@DEDataQueryCodeExp(name="RESERVER2",expression="t1.RESERVER2")
        ,@DEDataQueryCodeExp(name="RESERVER3",expression="t1.RESERVER3")
        ,@DEDataQueryCodeExp(name="RESERVER4",expression="t1.RESERVER4")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
    },
    conds={
        @DEDataQueryCodeCond(condition="t1.ENABLE = 1")
    }),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE, t1.CREATEMAN, t1.DIGESTCODE, t1.ENABLE, t1.FILENAME2, t1.FILESIZE, t1.FILE_ID, t1.FILE_NAME, t1.FOLDER, t1.LOCALPATH, t1.LOCALPATH2, t1.OWNERID, t1.OWNERTYPE, t1.PICHEIGHT, t1.PICWIDTH, t1.RESERVER, t1.RESERVER2, t1.RESERVER3, t1.RESERVER4, t1.UPDATEDATE, t1.UPDATEMAN FROM T_SRFFILE t1 ",querycodetemp="",declarecode="",dbtype="ORACLE",
    fieldexps={
        @DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="DIGESTCODE",expression="t1.DIGESTCODE")
        ,@DEDataQueryCodeExp(name="ENABLE",expression="t1.ENABLE")
        ,@DEDataQueryCodeExp(name="FILENAME2",expression="t1.FILENAME2")
        ,@DEDataQueryCodeExp(name="FILESIZE",expression="t1.FILESIZE")
        ,@DEDataQueryCodeExp(name="FILE_ID",expression="t1.FILE_ID")
        ,@DEDataQueryCodeExp(name="FILE_NAME",expression="t1.FILE_NAME")
        ,@DEDataQueryCodeExp(name="FOLDER",expression="t1.FOLDER")
        ,@DEDataQueryCodeExp(name="LOCALPATH",expression="t1.LOCALPATH")
        ,@DEDataQueryCodeExp(name="LOCALPATH2",expression="t1.LOCALPATH2")
        ,@DEDataQueryCodeExp(name="OWNERID",expression="t1.OWNERID")
        ,@DEDataQueryCodeExp(name="OWNERTYPE",expression="t1.OWNERTYPE")
        ,@DEDataQueryCodeExp(name="PICHEIGHT",expression="t1.PICHEIGHT")
        ,@DEDataQueryCodeExp(name="PICWIDTH",expression="t1.PICWIDTH")
        ,@DEDataQueryCodeExp(name="RESERVER",expression="t1.RESERVER")
        ,@DEDataQueryCodeExp(name="RESERVER2",expression="t1.RESERVER2")
        ,@DEDataQueryCodeExp(name="RESERVER3",expression="t1.RESERVER3")
        ,@DEDataQueryCodeExp(name="RESERVER4",expression="t1.RESERVER4")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
    },
    conds={
        @DEDataQueryCodeCond(condition="t1.ENABLE = 1")
    }),
    @DEDataQueryCode(querycode="SELECT t1.[CREATEDATE], t1.[CREATEMAN], t1.[DIGESTCODE], t1.[ENABLE], t1.[FILENAME2], t1.[FILESIZE], t1.[FILE_ID], t1.[FILE_NAME], t1.[FOLDER], t1.[LOCALPATH], t1.[LOCALPATH2], t1.[OWNERID], t1.[OWNERTYPE], t1.[PICHEIGHT], t1.[PICWIDTH], t1.[RESERVER], t1.[RESERVER2], t1.[RESERVER3], t1.[RESERVER4], t1.[UPDATEDATE], t1.[UPDATEMAN] FROM [T_SRFFILE] t1 ",querycodetemp="",declarecode="",dbtype="SQLSERVER",
    fieldexps={
        @DEDataQueryCodeExp(name="MEMO",expression="t1.[MEMO]")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.[CREATEDATE]")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.[CREATEMAN]")
        ,@DEDataQueryCodeExp(name="DIGESTCODE",expression="t1.[DIGESTCODE]")
        ,@DEDataQueryCodeExp(name="ENABLE",expression="t1.[ENABLE]")
        ,@DEDataQueryCodeExp(name="FILENAME2",expression="t1.[FILENAME2]")
        ,@DEDataQueryCodeExp(name="FILESIZE",expression="t1.[FILESIZE]")
        ,@DEDataQueryCodeExp(name="FILE_ID",expression="t1.[FILE_ID]")
        ,@DEDataQueryCodeExp(name="FILE_NAME",expression="t1.[FILE_NAME]")
        ,@DEDataQueryCodeExp(name="FOLDER",expression="t1.[FOLDER]")
        ,@DEDataQueryCodeExp(name="LOCALPATH",expression="t1.[LOCALPATH]")
        ,@DEDataQueryCodeExp(name="LOCALPATH2",expression="t1.[LOCALPATH2]")
        ,@DEDataQueryCodeExp(name="OWNERID",expression="t1.[OWNERID]")
        ,@DEDataQueryCodeExp(name="OWNERTYPE",expression="t1.[OWNERTYPE]")
        ,@DEDataQueryCodeExp(name="PICHEIGHT",expression="t1.[PICHEIGHT]")
        ,@DEDataQueryCodeExp(name="PICWIDTH",expression="t1.[PICWIDTH]")
        ,@DEDataQueryCodeExp(name="RESERVER",expression="t1.[RESERVER]")
        ,@DEDataQueryCodeExp(name="RESERVER2",expression="t1.[RESERVER2]")
        ,@DEDataQueryCodeExp(name="RESERVER3",expression="t1.[RESERVER3]")
        ,@DEDataQueryCodeExp(name="RESERVER4",expression="t1.[RESERVER4]")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.[UPDATEDATE]")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.[UPDATEMAN]")
    },
    conds={
        @DEDataQueryCodeCond(condition="t1.ENABLE = 1")
    }),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE, t1.CREATEMAN, t1.DIGESTCODE, t1.ENABLE, t1.FILENAME2, t1.FILESIZE, t1.FILE_ID, t1.FILE_NAME, t1.FOLDER, t1.LOCALPATH, t1.LOCALPATH2, t1.OWNERID, t1.OWNERTYPE, t1.PICHEIGHT, t1.PICWIDTH, t1.RESERVER, t1.RESERVER2, t1.RESERVER3, t1.RESERVER4, t1.UPDATEDATE, t1.UPDATEMAN FROM T_SRFFILE t1 ",querycodetemp="",declarecode="",dbtype="POSTGRESQL",
    fieldexps={
        @DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="DIGESTCODE",expression="t1.DIGESTCODE")
        ,@DEDataQueryCodeExp(name="ENABLE",expression="t1.ENABLE")
        ,@DEDataQueryCodeExp(name="FILENAME2",expression="t1.FILENAME2")
        ,@DEDataQueryCodeExp(name="FILESIZE",expression="t1.FILESIZE")
        ,@DEDataQueryCodeExp(name="FILE_ID",expression="t1.FILE_ID")
        ,@DEDataQueryCodeExp(name="FILE_NAME",expression="t1.FILE_NAME")
        ,@DEDataQueryCodeExp(name="FOLDER",expression="t1.FOLDER")
        ,@DEDataQueryCodeExp(name="LOCALPATH",expression="t1.LOCALPATH")
        ,@DEDataQueryCodeExp(name="LOCALPATH2",expression="t1.LOCALPATH2")
        ,@DEDataQueryCodeExp(name="OWNERID",expression="t1.OWNERID")
        ,@DEDataQueryCodeExp(name="OWNERTYPE",expression="t1.OWNERTYPE")
        ,@DEDataQueryCodeExp(name="PICHEIGHT",expression="t1.PICHEIGHT")
        ,@DEDataQueryCodeExp(name="PICWIDTH",expression="t1.PICWIDTH")
        ,@DEDataQueryCodeExp(name="RESERVER",expression="t1.RESERVER")
        ,@DEDataQueryCodeExp(name="RESERVER2",expression="t1.RESERVER2")
        ,@DEDataQueryCodeExp(name="RESERVER3",expression="t1.RESERVER3")
        ,@DEDataQueryCodeExp(name="RESERVER4",expression="t1.RESERVER4")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
    },
    conds={
        @DEDataQueryCodeCond(condition="t1.ENABLE = 1")
    }),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE, t1.CREATEMAN, t1.DIGESTCODE, t1.ENABLE, t1.FILENAME2, t1.FILESIZE, t1.FILE_ID, t1.FILE_NAME, t1.FOLDER, t1.LOCALPATH, t1.LOCALPATH2, t1.OWNERID, t1.OWNERTYPE, t1.PICHEIGHT, t1.PICWIDTH, t1.RESERVER, t1.RESERVER2, t1.RESERVER3, t1.RESERVER4, t1.UPDATEDATE, t1.UPDATEMAN FROM T_SRFFILE t1 ",querycodetemp="",declarecode="",dbtype="PPAS",
    fieldexps={
        @DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="DIGESTCODE",expression="t1.DIGESTCODE")
        ,@DEDataQueryCodeExp(name="ENABLE",expression="t1.ENABLE")
        ,@DEDataQueryCodeExp(name="FILENAME2",expression="t1.FILENAME2")
        ,@DEDataQueryCodeExp(name="FILESIZE",expression="t1.FILESIZE")
        ,@DEDataQueryCodeExp(name="FILE_ID",expression="t1.FILE_ID")
        ,@DEDataQueryCodeExp(name="FILE_NAME",expression="t1.FILE_NAME")
        ,@DEDataQueryCodeExp(name="FOLDER",expression="t1.FOLDER")
        ,@DEDataQueryCodeExp(name="LOCALPATH",expression="t1.LOCALPATH")
        ,@DEDataQueryCodeExp(name="LOCALPATH2",expression="t1.LOCALPATH2")
        ,@DEDataQueryCodeExp(name="OWNERID",expression="t1.OWNERID")
        ,@DEDataQueryCodeExp(name="OWNERTYPE",expression="t1.OWNERTYPE")
        ,@DEDataQueryCodeExp(name="PICHEIGHT",expression="t1.PICHEIGHT")
        ,@DEDataQueryCodeExp(name="PICWIDTH",expression="t1.PICWIDTH")
        ,@DEDataQueryCodeExp(name="RESERVER",expression="t1.RESERVER")
        ,@DEDataQueryCodeExp(name="RESERVER2",expression="t1.RESERVER2")
        ,@DEDataQueryCodeExp(name="RESERVER3",expression="t1.RESERVER3")
        ,@DEDataQueryCodeExp(name="RESERVER4",expression="t1.RESERVER4")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
    },
    conds={
        @DEDataQueryCodeCond(condition="t1.ENABLE = 1")
    })
})
/**
 *  实体数据查询 [DEFAULT]模型基类
 */
public abstract class FileDefaultDQModelBase extends net.ibizsys.paas.demodel.DEDataQueryModelBase {

    public FileDefaultDQModelBase() {
        super();

        this.initAnnotation(FileDefaultDQModelBase.class);
    }

}