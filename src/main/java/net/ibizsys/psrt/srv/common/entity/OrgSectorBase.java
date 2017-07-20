/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package net.ibizsys.psrt.srv.common.entity;


import java.io.Serializable;
import java.util.HashMap;
import java.util.ArrayList;

import javax.persistence.Column;

import java.sql.Timestamp;
import net.ibizsys.paas.data.IDataObject;
import net.ibizsys.paas.data.DataObject;
import net.ibizsys.paas.util.StringHelper;
import net.sf.json.JSONObject;
import net.ibizsys.paas.util.JSONObjectHelper;
import net.ibizsys.paas.xml.XmlNode;
import net.ibizsys.paas.service.ServiceGlobal;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


/**
 * 实体[OrgSector] 数据对象基类
 */
public abstract class OrgSectorBase extends net.ibizsys.paas.entity.EntityBase implements Serializable {

    private static final long serialVersionUID = -1L;
    private static final Log log = LogFactory.getLog(OrgSectorBase.class);
    /**
     * 属性[条线代码]
     */
    public final static String FIELD_BIZCODE = "BIZCODE";
    /**
     * 属性[建立时间]
     */
    public final static String FIELD_CREATEDATE = "CREATEDATE";
    /**
     * 属性[建立人]
     */
    public final static String FIELD_CREATEMAN = "CREATEMAN";
    /**
     * 属性[级别编码]
     */
    public final static String FIELD_LEVELCODE = "LEVELCODE";
    /**
     * 属性[备注]
     */
    public final static String FIELD_MEMO = "MEMO";
    /**
     * 属性[显示次序]
     */
    public final static String FIELD_ORDERVALUE = "ORDERVALUE";
    /**
     * 属性[部门组织编号]
     */
    public final static String FIELD_ORGCODE = "ORGCODE";
    /**
     * 属性[组织机构]
     */
    public final static String FIELD_ORGID = "ORGID";
    /**
     * 属性[组织机构]
     */
    public final static String FIELD_ORGNAME = "ORGNAME";
    /**
     * 属性[部门标识]
     */
    public final static String FIELD_ORGSECTORID = "ORGSECTORID";
    /**
     * 属性[部门名称]
     */
    public final static String FIELD_ORGSECTORNAME = "ORGSECTORNAME";
    /**
     * 属性[上级部门]
     */
    public final static String FIELD_PORGSECTORID = "PORGSECTORID";
    /**
     * 属性[上级部门]
     */
    public final static String FIELD_PORGSECTORNAME = "PORGSECTORNAME";
    /**
     * 属性[汇报部门]
     */
    public final static String FIELD_REPORGSECTORID = "REPORGSECTORID";
    /**
     * 属性[汇报部门]
     */
    public final static String FIELD_REPORGSECTORNAME = "REPORGSECTORNAME";
    /**
     * 属性[保留字段]
     */
    public final static String FIELD_RESERVER = "RESERVER";
    /**
     * 属性[保留字段10]
     */
    public final static String FIELD_RESERVER10 = "RESERVER10";
    /**
     * 属性[保留字段11]
     */
    public final static String FIELD_RESERVER11 = "RESERVER11";
    /**
     * 属性[保留字段12]
     */
    public final static String FIELD_RESERVER12 = "RESERVER12";
    /**
     * 属性[保留字段13]
     */
    public final static String FIELD_RESERVER13 = "RESERVER13";
    /**
     * 属性[保留字段14]
     */
    public final static String FIELD_RESERVER14 = "RESERVER14";
    /**
     * 属性[保留字段15]
     */
    public final static String FIELD_RESERVER15 = "RESERVER15";
    /**
     * 属性[保留字段16]
     */
    public final static String FIELD_RESERVER16 = "RESERVER16";
    /**
     * 属性[保留字段17]
     */
    public final static String FIELD_RESERVER17 = "RESERVER17";
    /**
     * 属性[保留字段18]
     */
    public final static String FIELD_RESERVER18 = "RESERVER18";
    /**
     * 属性[保留字段19]
     */
    public final static String FIELD_RESERVER19 = "RESERVER19";
    /**
     * 属性[保留字段2]
     */
    public final static String FIELD_RESERVER2 = "RESERVER2";
    /**
     * 属性[保留字段20]
     */
    public final static String FIELD_RESERVER20 = "RESERVER20";
    /**
     * 属性[保留字段21]
     */
    public final static String FIELD_RESERVER21 = "RESERVER21";
    /**
     * 属性[保留字段22]
     */
    public final static String FIELD_RESERVER22 = "RESERVER22";
    /**
     * 属性[保留字段23]
     */
    public final static String FIELD_RESERVER23 = "RESERVER23";
    /**
     * 属性[保留字段24]
     */
    public final static String FIELD_RESERVER24 = "RESERVER24";
    /**
     * 属性[保留字段25]
     */
    public final static String FIELD_RESERVER25 = "RESERVER25";
    /**
     * 属性[保留字段26]
     */
    public final static String FIELD_RESERVER26 = "RESERVER26";
    /**
     * 属性[保留字段27]
     */
    public final static String FIELD_RESERVER27 = "RESERVER27";
    /**
     * 属性[保留字段28]
     */
    public final static String FIELD_RESERVER28 = "RESERVER28";
    /**
     * 属性[保留字段29]
     */
    public final static String FIELD_RESERVER29 = "RESERVER29";
    /**
     * 属性[保留字段3]
     */
    public final static String FIELD_RESERVER3 = "RESERVER3";
    /**
     * 属性[保留字段30]
     */
    public final static String FIELD_RESERVER30 = "RESERVER30";
    /**
     * 属性[保留字段4]
     */
    public final static String FIELD_RESERVER4 = "RESERVER4";
    /**
     * 属性[保留字段5]
     */
    public final static String FIELD_RESERVER5 = "RESERVER5";
    /**
     * 属性[保留字段6]
     */
    public final static String FIELD_RESERVER6 = "RESERVER6";
    /**
     * 属性[保留字段7]
     */
    public final static String FIELD_RESERVER7 = "RESERVER7";
    /**
     * 属性[保留字段8]
     */
    public final static String FIELD_RESERVER8 = "RESERVER8";
    /**
     * 属性[保留字段9]
     */
    public final static String FIELD_RESERVER9 = "RESERVER9";
    /**
     * 属性[简称 ]
     */
    public final static String FIELD_SHORTNAME = "SHORTNAME";
    /**
     * 属性[更新时间]
     */
    public final static String FIELD_UPDATEDATE = "UPDATEDATE";
    /**
     * 属性[更新人]
     */
    public final static String FIELD_UPDATEMAN = "UPDATEMAN";
    /**
     * 属性[用户数据]
     */
    public final static String FIELD_USERDATA = "USERDATA";
    /**
     * 属性[用户数据2]
     */
    public final static String FIELD_USERDATA2 = "USERDATA2";
    /**
     * 属性[启用标志]
     */
    public final static String FIELD_VALIDFLAG = "VALIDFLAG";
    /**
     * 属性[虚拟部门]
     */
    public final static String FIELD_VIRTUALFLAG = "VIRTUALFLAG";

    private final static int INDEX_BIZCODE = 0;
    private final static int INDEX_CREATEDATE = 1;
    private final static int INDEX_CREATEMAN = 2;
    private final static int INDEX_LEVELCODE = 3;
    private final static int INDEX_MEMO = 4;
    private final static int INDEX_ORDERVALUE = 5;
    private final static int INDEX_ORGCODE = 6;
    private final static int INDEX_ORGID = 7;
    private final static int INDEX_ORGNAME = 8;
    private final static int INDEX_ORGSECTORID = 9;
    private final static int INDEX_ORGSECTORNAME = 10;
    private final static int INDEX_PORGSECTORID = 11;
    private final static int INDEX_PORGSECTORNAME = 12;
    private final static int INDEX_REPORGSECTORID = 13;
    private final static int INDEX_REPORGSECTORNAME = 14;
    private final static int INDEX_RESERVER = 15;
    private final static int INDEX_RESERVER10 = 16;
    private final static int INDEX_RESERVER11 = 17;
    private final static int INDEX_RESERVER12 = 18;
    private final static int INDEX_RESERVER13 = 19;
    private final static int INDEX_RESERVER14 = 20;
    private final static int INDEX_RESERVER15 = 21;
    private final static int INDEX_RESERVER16 = 22;
    private final static int INDEX_RESERVER17 = 23;
    private final static int INDEX_RESERVER18 = 24;
    private final static int INDEX_RESERVER19 = 25;
    private final static int INDEX_RESERVER2 = 26;
    private final static int INDEX_RESERVER20 = 27;
    private final static int INDEX_RESERVER21 = 28;
    private final static int INDEX_RESERVER22 = 29;
    private final static int INDEX_RESERVER23 = 30;
    private final static int INDEX_RESERVER24 = 31;
    private final static int INDEX_RESERVER25 = 32;
    private final static int INDEX_RESERVER26 = 33;
    private final static int INDEX_RESERVER27 = 34;
    private final static int INDEX_RESERVER28 = 35;
    private final static int INDEX_RESERVER29 = 36;
    private final static int INDEX_RESERVER3 = 37;
    private final static int INDEX_RESERVER30 = 38;
    private final static int INDEX_RESERVER4 = 39;
    private final static int INDEX_RESERVER5 = 40;
    private final static int INDEX_RESERVER6 = 41;
    private final static int INDEX_RESERVER7 = 42;
    private final static int INDEX_RESERVER8 = 43;
    private final static int INDEX_RESERVER9 = 44;
    private final static int INDEX_SHORTNAME = 45;
    private final static int INDEX_UPDATEDATE = 46;
    private final static int INDEX_UPDATEMAN = 47;
    private final static int INDEX_USERDATA = 48;
    private final static int INDEX_USERDATA2 = 49;
    private final static int INDEX_VALIDFLAG = 50;
    private final static int INDEX_VIRTUALFLAG = 51;

    private final static HashMap<String, Integer> fieldIndexMap = new HashMap<String, Integer>();
    static {
        fieldIndexMap.put( FIELD_BIZCODE, INDEX_BIZCODE);
        fieldIndexMap.put( FIELD_CREATEDATE, INDEX_CREATEDATE);
        fieldIndexMap.put( FIELD_CREATEMAN, INDEX_CREATEMAN);
        fieldIndexMap.put( FIELD_LEVELCODE, INDEX_LEVELCODE);
        fieldIndexMap.put( FIELD_MEMO, INDEX_MEMO);
        fieldIndexMap.put( FIELD_ORDERVALUE, INDEX_ORDERVALUE);
        fieldIndexMap.put( FIELD_ORGCODE, INDEX_ORGCODE);
        fieldIndexMap.put( FIELD_ORGID, INDEX_ORGID);
        fieldIndexMap.put( FIELD_ORGNAME, INDEX_ORGNAME);
        fieldIndexMap.put( FIELD_ORGSECTORID, INDEX_ORGSECTORID);
        fieldIndexMap.put( FIELD_ORGSECTORNAME, INDEX_ORGSECTORNAME);
        fieldIndexMap.put( FIELD_PORGSECTORID, INDEX_PORGSECTORID);
        fieldIndexMap.put( FIELD_PORGSECTORNAME, INDEX_PORGSECTORNAME);
        fieldIndexMap.put( FIELD_REPORGSECTORID, INDEX_REPORGSECTORID);
        fieldIndexMap.put( FIELD_REPORGSECTORNAME, INDEX_REPORGSECTORNAME);
        fieldIndexMap.put( FIELD_RESERVER, INDEX_RESERVER);
        fieldIndexMap.put( FIELD_RESERVER10, INDEX_RESERVER10);
        fieldIndexMap.put( FIELD_RESERVER11, INDEX_RESERVER11);
        fieldIndexMap.put( FIELD_RESERVER12, INDEX_RESERVER12);
        fieldIndexMap.put( FIELD_RESERVER13, INDEX_RESERVER13);
        fieldIndexMap.put( FIELD_RESERVER14, INDEX_RESERVER14);
        fieldIndexMap.put( FIELD_RESERVER15, INDEX_RESERVER15);
        fieldIndexMap.put( FIELD_RESERVER16, INDEX_RESERVER16);
        fieldIndexMap.put( FIELD_RESERVER17, INDEX_RESERVER17);
        fieldIndexMap.put( FIELD_RESERVER18, INDEX_RESERVER18);
        fieldIndexMap.put( FIELD_RESERVER19, INDEX_RESERVER19);
        fieldIndexMap.put( FIELD_RESERVER2, INDEX_RESERVER2);
        fieldIndexMap.put( FIELD_RESERVER20, INDEX_RESERVER20);
        fieldIndexMap.put( FIELD_RESERVER21, INDEX_RESERVER21);
        fieldIndexMap.put( FIELD_RESERVER22, INDEX_RESERVER22);
        fieldIndexMap.put( FIELD_RESERVER23, INDEX_RESERVER23);
        fieldIndexMap.put( FIELD_RESERVER24, INDEX_RESERVER24);
        fieldIndexMap.put( FIELD_RESERVER25, INDEX_RESERVER25);
        fieldIndexMap.put( FIELD_RESERVER26, INDEX_RESERVER26);
        fieldIndexMap.put( FIELD_RESERVER27, INDEX_RESERVER27);
        fieldIndexMap.put( FIELD_RESERVER28, INDEX_RESERVER28);
        fieldIndexMap.put( FIELD_RESERVER29, INDEX_RESERVER29);
        fieldIndexMap.put( FIELD_RESERVER3, INDEX_RESERVER3);
        fieldIndexMap.put( FIELD_RESERVER30, INDEX_RESERVER30);
        fieldIndexMap.put( FIELD_RESERVER4, INDEX_RESERVER4);
        fieldIndexMap.put( FIELD_RESERVER5, INDEX_RESERVER5);
        fieldIndexMap.put( FIELD_RESERVER6, INDEX_RESERVER6);
        fieldIndexMap.put( FIELD_RESERVER7, INDEX_RESERVER7);
        fieldIndexMap.put( FIELD_RESERVER8, INDEX_RESERVER8);
        fieldIndexMap.put( FIELD_RESERVER9, INDEX_RESERVER9);
        fieldIndexMap.put( FIELD_SHORTNAME, INDEX_SHORTNAME);
        fieldIndexMap.put( FIELD_UPDATEDATE, INDEX_UPDATEDATE);
        fieldIndexMap.put( FIELD_UPDATEMAN, INDEX_UPDATEMAN);
        fieldIndexMap.put( FIELD_USERDATA, INDEX_USERDATA);
        fieldIndexMap.put( FIELD_USERDATA2, INDEX_USERDATA2);
        fieldIndexMap.put( FIELD_VALIDFLAG, INDEX_VALIDFLAG);
        fieldIndexMap.put( FIELD_VIRTUALFLAG, INDEX_VIRTUALFLAG);
    }

    private OrgSectorBase proxyOrgSectorBase = null;
    public OrgSectorBase() {
        super();
    }
    private boolean bizcodeDirtyFlag = false;
    private boolean createdateDirtyFlag = false;
    private boolean createmanDirtyFlag = false;
    private boolean levelcodeDirtyFlag = false;
    private boolean memoDirtyFlag = false;
    private boolean ordervalueDirtyFlag = false;
    private boolean orgcodeDirtyFlag = false;
    private boolean orgidDirtyFlag = false;
    private boolean orgnameDirtyFlag = false;
    private boolean orgsectoridDirtyFlag = false;
    private boolean orgsectornameDirtyFlag = false;
    private boolean porgsectoridDirtyFlag = false;
    private boolean porgsectornameDirtyFlag = false;
    private boolean reporgsectoridDirtyFlag = false;
    private boolean reporgsectornameDirtyFlag = false;
    private boolean reserverDirtyFlag = false;
    private boolean reserver10DirtyFlag = false;
    private boolean reserver11DirtyFlag = false;
    private boolean reserver12DirtyFlag = false;
    private boolean reserver13DirtyFlag = false;
    private boolean reserver14DirtyFlag = false;
    private boolean reserver15DirtyFlag = false;
    private boolean reserver16DirtyFlag = false;
    private boolean reserver17DirtyFlag = false;
    private boolean reserver18DirtyFlag = false;
    private boolean reserver19DirtyFlag = false;
    private boolean reserver2DirtyFlag = false;
    private boolean reserver20DirtyFlag = false;
    private boolean reserver21DirtyFlag = false;
    private boolean reserver22DirtyFlag = false;
    private boolean reserver23DirtyFlag = false;
    private boolean reserver24DirtyFlag = false;
    private boolean reserver25DirtyFlag = false;
    private boolean reserver26DirtyFlag = false;
    private boolean reserver27DirtyFlag = false;
    private boolean reserver28DirtyFlag = false;
    private boolean reserver29DirtyFlag = false;
    private boolean reserver3DirtyFlag = false;
    private boolean reserver30DirtyFlag = false;
    private boolean reserver4DirtyFlag = false;
    private boolean reserver5DirtyFlag = false;
    private boolean reserver6DirtyFlag = false;
    private boolean reserver7DirtyFlag = false;
    private boolean reserver8DirtyFlag = false;
    private boolean reserver9DirtyFlag = false;
    private boolean shortnameDirtyFlag = false;
    private boolean updatedateDirtyFlag = false;
    private boolean updatemanDirtyFlag = false;
    private boolean userdataDirtyFlag = false;
    private boolean userdata2DirtyFlag = false;
    private boolean validflagDirtyFlag = false;
    private boolean virtualflagDirtyFlag = false;

    @Column(name="bizcode")
    private String bizcode;
    @Column(name="createdate")
    private Timestamp createdate;
    @Column(name="createman")
    private String createman;
    @Column(name="levelcode")
    private String levelcode;
    @Column(name="memo")
    private String memo;
    @Column(name="ordervalue")
    private Integer ordervalue;
    @Column(name="orgcode")
    private String orgcode;
    @Column(name="orgid")
    private String orgid;
    @Column(name="orgname")
    private String orgname;
    @Column(name="orgsectorid")
    private String orgsectorid;
    @Column(name="orgsectorname")
    private String orgsectorname;
    @Column(name="porgsectorid")
    private String porgsectorid;
    @Column(name="porgsectorname")
    private String porgsectorname;
    @Column(name="reporgsectorid")
    private String reporgsectorid;
    @Column(name="reporgsectorname")
    private String reporgsectorname;
    @Column(name="reserver")
    private String reserver;
    @Column(name="reserver10")
    private String reserver10;
    @Column(name="reserver11")
    private Integer reserver11;
    @Column(name="reserver12")
    private Integer reserver12;
    @Column(name="reserver13")
    private Integer reserver13;
    @Column(name="reserver14")
    private Integer reserver14;
    @Column(name="reserver15")
    private Double reserver15;
    @Column(name="reserver16")
    private Double reserver16;
    @Column(name="reserver17")
    private Double reserver17;
    @Column(name="reserver18")
    private Double reserver18;
    @Column(name="reserver19")
    private Timestamp reserver19;
    @Column(name="reserver2")
    private String reserver2;
    @Column(name="reserver20")
    private Timestamp reserver20;
    @Column(name="reserver21")
    private Timestamp reserver21;
    @Column(name="reserver22")
    private Timestamp reserver22;
    @Column(name="reserver23")
    private String reserver23;
    @Column(name="reserver24")
    private String reserver24;
    @Column(name="reserver25")
    private String reserver25;
    @Column(name="reserver26")
    private String reserver26;
    @Column(name="reserver27")
    private String reserver27;
    @Column(name="reserver28")
    private String reserver28;
    @Column(name="reserver29")
    private String reserver29;
    @Column(name="reserver3")
    private String reserver3;
    @Column(name="reserver30")
    private String reserver30;
    @Column(name="reserver4")
    private String reserver4;
    @Column(name="reserver5")
    private String reserver5;
    @Column(name="reserver6")
    private String reserver6;
    @Column(name="reserver7")
    private String reserver7;
    @Column(name="reserver8")
    private String reserver8;
    @Column(name="reserver9")
    private String reserver9;
    @Column(name="shortname")
    private String shortname;
    @Column(name="updatedate")
    private Timestamp updatedate;
    @Column(name="updateman")
    private String updateman;
    @Column(name="userdata")
    private String userdata;
    @Column(name="userdata2")
    private String userdata2;
    @Column(name="validflag")
    private Integer validflag;
    @Column(name="virtualflag")
    private Integer virtualflag;


    /**
     *  设置属性值[条线代码]
     *  @param bizcode
     */
    public void setBizCode(String bizcode) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setBizCode(bizcode);
            return;
        }
        if(bizcode!=null) {
            bizcode = StringHelper.trimRight(bizcode);
            if(bizcode.length()==0) {
                bizcode = null;
            }
        }
        this.bizcode = bizcode;
        this.bizcodeDirtyFlag  = true;
    }

    /**
     *  获取属性值[条线代码]
     */
    public String getBizCode() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getBizCode();
        }
        return this.bizcode;
    }

    /**
     *  获取属性值[条线代码]是否修改
     */
    public boolean isBizCodeDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isBizCodeDirty();
        }
        return this.bizcodeDirtyFlag;
    }

    /**
     *  重置属性值[条线代码]
     */
    public void resetBizCode() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetBizCode();
            return;
        }

        this.bizcodeDirtyFlag = false;
        this.bizcode = null;
    }
    /**
     *  设置属性值[建立时间]
     *  @param createdate
     */
    public void setCreateDate(Timestamp createdate) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setCreateDate(createdate);
            return;
        }
        this.createdate = createdate;
        this.createdateDirtyFlag  = true;
    }

    /**
     *  获取属性值[建立时间]
     */
    public Timestamp getCreateDate() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getCreateDate();
        }
        return this.createdate;
    }

    /**
     *  获取属性值[建立时间]是否修改
     */
    public boolean isCreateDateDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isCreateDateDirty();
        }
        return this.createdateDirtyFlag;
    }

    /**
     *  重置属性值[建立时间]
     */
    public void resetCreateDate() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetCreateDate();
            return;
        }

        this.createdateDirtyFlag = false;
        this.createdate = null;
    }
    /**
     *  设置属性值[建立人]代码表：net.ibizsys.psrt.srv.codelist.SysOperatorCodeListModel
     *  @param createman
     */
    public void setCreateMan(String createman) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setCreateMan(createman);
            return;
        }
        if(createman!=null) {
            createman = StringHelper.trimRight(createman);
            if(createman.length()==0) {
                createman = null;
            }
        }
        this.createman = createman;
        this.createmanDirtyFlag  = true;
    }

    /**
     *  获取属性值[建立人]代码表：net.ibizsys.psrt.srv.codelist.SysOperatorCodeListModel
     */
    public String getCreateMan() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getCreateMan();
        }
        return this.createman;
    }

    /**
     *  获取属性值[建立人]是否修改
     */
    public boolean isCreateManDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isCreateManDirty();
        }
        return this.createmanDirtyFlag;
    }

    /**
     *  重置属性值[建立人]
     */
    public void resetCreateMan() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetCreateMan();
            return;
        }

        this.createmanDirtyFlag = false;
        this.createman = null;
    }
    /**
     *  设置属性值[级别编码]
     *  @param levelcode
     */
    public void setLevelCode(String levelcode) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setLevelCode(levelcode);
            return;
        }
        if(levelcode!=null) {
            levelcode = StringHelper.trimRight(levelcode);
            if(levelcode.length()==0) {
                levelcode = null;
            }
        }
        this.levelcode = levelcode;
        this.levelcodeDirtyFlag  = true;
    }

    /**
     *  获取属性值[级别编码]
     */
    public String getLevelCode() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getLevelCode();
        }
        return this.levelcode;
    }

    /**
     *  获取属性值[级别编码]是否修改
     */
    public boolean isLevelCodeDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isLevelCodeDirty();
        }
        return this.levelcodeDirtyFlag;
    }

    /**
     *  重置属性值[级别编码]
     */
    public void resetLevelCode() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetLevelCode();
            return;
        }

        this.levelcodeDirtyFlag = false;
        this.levelcode = null;
    }
    /**
     *  设置属性值[备注]
     *  @param memo
     */
    public void setMemo(String memo) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setMemo(memo);
            return;
        }
        if(memo!=null) {
            memo = StringHelper.trimRight(memo);
            if(memo.length()==0) {
                memo = null;
            }
        }
        this.memo = memo;
        this.memoDirtyFlag  = true;
    }

    /**
     *  获取属性值[备注]
     */
    public String getMemo() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getMemo();
        }
        return this.memo;
    }

    /**
     *  获取属性值[备注]是否修改
     */
    public boolean isMemoDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isMemoDirty();
        }
        return this.memoDirtyFlag;
    }

    /**
     *  重置属性值[备注]
     */
    public void resetMemo() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetMemo();
            return;
        }

        this.memoDirtyFlag = false;
        this.memo = null;
    }
    /**
     *  设置属性值[显示次序]
     *  @param ordervalue
     */
    public void setOrderValue(Integer ordervalue) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setOrderValue(ordervalue);
            return;
        }
        this.ordervalue = ordervalue;
        this.ordervalueDirtyFlag  = true;
    }

    /**
     *  获取属性值[显示次序]
     */
    public Integer getOrderValue() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getOrderValue();
        }
        return this.ordervalue;
    }

    /**
     *  获取属性值[显示次序]是否修改
     */
    public boolean isOrderValueDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isOrderValueDirty();
        }
        return this.ordervalueDirtyFlag;
    }

    /**
     *  重置属性值[显示次序]
     */
    public void resetOrderValue() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetOrderValue();
            return;
        }

        this.ordervalueDirtyFlag = false;
        this.ordervalue = null;
    }
    /**
     *  设置属性值[部门组织编号]
     *  @param orgcode
     */
    public void setOrgCode(String orgcode) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setOrgCode(orgcode);
            return;
        }
        if(orgcode!=null) {
            orgcode = StringHelper.trimRight(orgcode);
            if(orgcode.length()==0) {
                orgcode = null;
            }
        }
        this.orgcode = orgcode;
        this.orgcodeDirtyFlag  = true;
    }

    /**
     *  获取属性值[部门组织编号]
     */
    public String getOrgCode() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getOrgCode();
        }
        return this.orgcode;
    }

    /**
     *  获取属性值[部门组织编号]是否修改
     */
    public boolean isOrgCodeDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isOrgCodeDirty();
        }
        return this.orgcodeDirtyFlag;
    }

    /**
     *  重置属性值[部门组织编号]
     */
    public void resetOrgCode() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetOrgCode();
            return;
        }

        this.orgcodeDirtyFlag = false;
        this.orgcode = null;
    }
    /**
     *  设置属性值[组织机构]
     *  @param orgid
     */
    public void setOrgId(String orgid) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setOrgId(orgid);
            return;
        }
        if(orgid!=null) {
            orgid = StringHelper.trimRight(orgid);
            if(orgid.length()==0) {
                orgid = null;
            }
        }
        this.orgid = orgid;
        this.orgidDirtyFlag  = true;
    }

    /**
     *  获取属性值[组织机构]
     */
    public String getOrgId() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getOrgId();
        }
        return this.orgid;
    }

    /**
     *  获取属性值[组织机构]是否修改
     */
    public boolean isOrgIdDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isOrgIdDirty();
        }
        return this.orgidDirtyFlag;
    }

    /**
     *  重置属性值[组织机构]
     */
    public void resetOrgId() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetOrgId();
            return;
        }

        this.orgidDirtyFlag = false;
        this.orgid = null;
    }
    /**
     *  设置属性值[组织机构]
     *  @param orgname
     */
    public void setOrgName(String orgname) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setOrgName(orgname);
            return;
        }
        if(orgname!=null) {
            orgname = StringHelper.trimRight(orgname);
            if(orgname.length()==0) {
                orgname = null;
            }
        }
        this.orgname = orgname;
        this.orgnameDirtyFlag  = true;
    }

    /**
     *  获取属性值[组织机构]
     */
    public String getOrgName() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getOrgName();
        }
        return this.orgname;
    }

    /**
     *  获取属性值[组织机构]是否修改
     */
    public boolean isOrgNameDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isOrgNameDirty();
        }
        return this.orgnameDirtyFlag;
    }

    /**
     *  重置属性值[组织机构]
     */
    public void resetOrgName() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetOrgName();
            return;
        }

        this.orgnameDirtyFlag = false;
        this.orgname = null;
    }
    /**
     *  设置属性值[部门标识]
     *  @param orgsectorid
     */
    public void setOrgSectorId(String orgsectorid) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setOrgSectorId(orgsectorid);
            return;
        }
        if(orgsectorid!=null) {
            orgsectorid = StringHelper.trimRight(orgsectorid);
            if(orgsectorid.length()==0) {
                orgsectorid = null;
            }
        }
        this.orgsectorid = orgsectorid;
        this.orgsectoridDirtyFlag  = true;
    }

    /**
     *  获取属性值[部门标识]
     */
    public String getOrgSectorId() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getOrgSectorId();
        }
        return this.orgsectorid;
    }

    /**
     *  获取属性值[部门标识]是否修改
     */
    public boolean isOrgSectorIdDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isOrgSectorIdDirty();
        }
        return this.orgsectoridDirtyFlag;
    }

    /**
     *  重置属性值[部门标识]
     */
    public void resetOrgSectorId() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetOrgSectorId();
            return;
        }

        this.orgsectoridDirtyFlag = false;
        this.orgsectorid = null;
    }
    /**
     *  设置属性值[部门名称]
     *  @param orgsectorname
     */
    public void setOrgSectorName(String orgsectorname) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setOrgSectorName(orgsectorname);
            return;
        }
        if(orgsectorname!=null) {
            orgsectorname = StringHelper.trimRight(orgsectorname);
            if(orgsectorname.length()==0) {
                orgsectorname = null;
            }
        }
        this.orgsectorname = orgsectorname;
        this.orgsectornameDirtyFlag  = true;
    }

    /**
     *  获取属性值[部门名称]
     */
    public String getOrgSectorName() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getOrgSectorName();
        }
        return this.orgsectorname;
    }

    /**
     *  获取属性值[部门名称]是否修改
     */
    public boolean isOrgSectorNameDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isOrgSectorNameDirty();
        }
        return this.orgsectornameDirtyFlag;
    }

    /**
     *  重置属性值[部门名称]
     */
    public void resetOrgSectorName() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetOrgSectorName();
            return;
        }

        this.orgsectornameDirtyFlag = false;
        this.orgsectorname = null;
    }
    /**
     *  设置属性值[上级部门]
     *  @param porgsectorid
     */
    public void setPOrgSectorId(String porgsectorid) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setPOrgSectorId(porgsectorid);
            return;
        }
        if(porgsectorid!=null) {
            porgsectorid = StringHelper.trimRight(porgsectorid);
            if(porgsectorid.length()==0) {
                porgsectorid = null;
            }
        }
        this.porgsectorid = porgsectorid;
        this.porgsectoridDirtyFlag  = true;
    }

    /**
     *  获取属性值[上级部门]
     */
    public String getPOrgSectorId() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getPOrgSectorId();
        }
        return this.porgsectorid;
    }

    /**
     *  获取属性值[上级部门]是否修改
     */
    public boolean isPOrgSectorIdDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isPOrgSectorIdDirty();
        }
        return this.porgsectoridDirtyFlag;
    }

    /**
     *  重置属性值[上级部门]
     */
    public void resetPOrgSectorId() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetPOrgSectorId();
            return;
        }

        this.porgsectoridDirtyFlag = false;
        this.porgsectorid = null;
    }
    /**
     *  设置属性值[上级部门]
     *  @param porgsectorname
     */
    public void setPOrgSectorName(String porgsectorname) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setPOrgSectorName(porgsectorname);
            return;
        }
        if(porgsectorname!=null) {
            porgsectorname = StringHelper.trimRight(porgsectorname);
            if(porgsectorname.length()==0) {
                porgsectorname = null;
            }
        }
        this.porgsectorname = porgsectorname;
        this.porgsectornameDirtyFlag  = true;
    }

    /**
     *  获取属性值[上级部门]
     */
    public String getPOrgSectorName() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getPOrgSectorName();
        }
        return this.porgsectorname;
    }

    /**
     *  获取属性值[上级部门]是否修改
     */
    public boolean isPOrgSectorNameDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isPOrgSectorNameDirty();
        }
        return this.porgsectornameDirtyFlag;
    }

    /**
     *  重置属性值[上级部门]
     */
    public void resetPOrgSectorName() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetPOrgSectorName();
            return;
        }

        this.porgsectornameDirtyFlag = false;
        this.porgsectorname = null;
    }
    /**
     *  设置属性值[汇报部门]
     *  @param reporgsectorid
     */
    public void setRepOrgSectorId(String reporgsectorid) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setRepOrgSectorId(reporgsectorid);
            return;
        }
        if(reporgsectorid!=null) {
            reporgsectorid = StringHelper.trimRight(reporgsectorid);
            if(reporgsectorid.length()==0) {
                reporgsectorid = null;
            }
        }
        this.reporgsectorid = reporgsectorid;
        this.reporgsectoridDirtyFlag  = true;
    }

    /**
     *  获取属性值[汇报部门]
     */
    public String getRepOrgSectorId() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getRepOrgSectorId();
        }
        return this.reporgsectorid;
    }

    /**
     *  获取属性值[汇报部门]是否修改
     */
    public boolean isRepOrgSectorIdDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isRepOrgSectorIdDirty();
        }
        return this.reporgsectoridDirtyFlag;
    }

    /**
     *  重置属性值[汇报部门]
     */
    public void resetRepOrgSectorId() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetRepOrgSectorId();
            return;
        }

        this.reporgsectoridDirtyFlag = false;
        this.reporgsectorid = null;
    }
    /**
     *  设置属性值[汇报部门]
     *  @param reporgsectorname
     */
    public void setRepOrgSectorName(String reporgsectorname) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setRepOrgSectorName(reporgsectorname);
            return;
        }
        if(reporgsectorname!=null) {
            reporgsectorname = StringHelper.trimRight(reporgsectorname);
            if(reporgsectorname.length()==0) {
                reporgsectorname = null;
            }
        }
        this.reporgsectorname = reporgsectorname;
        this.reporgsectornameDirtyFlag  = true;
    }

    /**
     *  获取属性值[汇报部门]
     */
    public String getRepOrgSectorName() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getRepOrgSectorName();
        }
        return this.reporgsectorname;
    }

    /**
     *  获取属性值[汇报部门]是否修改
     */
    public boolean isRepOrgSectorNameDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isRepOrgSectorNameDirty();
        }
        return this.reporgsectornameDirtyFlag;
    }

    /**
     *  重置属性值[汇报部门]
     */
    public void resetRepOrgSectorName() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetRepOrgSectorName();
            return;
        }

        this.reporgsectornameDirtyFlag = false;
        this.reporgsectorname = null;
    }
    /**
     *  设置属性值[保留字段]
     *  @param reserver
     */
    public void setReserver(String reserver) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setReserver(reserver);
            return;
        }
        if(reserver!=null) {
            reserver = StringHelper.trimRight(reserver);
            if(reserver.length()==0) {
                reserver = null;
            }
        }
        this.reserver = reserver;
        this.reserverDirtyFlag  = true;
    }

    /**
     *  获取属性值[保留字段]
     */
    public String getReserver() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getReserver();
        }
        return this.reserver;
    }

    /**
     *  获取属性值[保留字段]是否修改
     */
    public boolean isReserverDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isReserverDirty();
        }
        return this.reserverDirtyFlag;
    }

    /**
     *  重置属性值[保留字段]
     */
    public void resetReserver() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetReserver();
            return;
        }

        this.reserverDirtyFlag = false;
        this.reserver = null;
    }
    /**
     *  设置属性值[保留字段10]
     *  @param reserver10
     */
    public void setReserver10(String reserver10) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setReserver10(reserver10);
            return;
        }
        if(reserver10!=null) {
            reserver10 = StringHelper.trimRight(reserver10);
            if(reserver10.length()==0) {
                reserver10 = null;
            }
        }
        this.reserver10 = reserver10;
        this.reserver10DirtyFlag  = true;
    }

    /**
     *  获取属性值[保留字段10]
     */
    public String getReserver10() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getReserver10();
        }
        return this.reserver10;
    }

    /**
     *  获取属性值[保留字段10]是否修改
     */
    public boolean isReserver10Dirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isReserver10Dirty();
        }
        return this.reserver10DirtyFlag;
    }

    /**
     *  重置属性值[保留字段10]
     */
    public void resetReserver10() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetReserver10();
            return;
        }

        this.reserver10DirtyFlag = false;
        this.reserver10 = null;
    }
    /**
     *  设置属性值[保留字段11]
     *  @param reserver11
     */
    public void setReserver11(Integer reserver11) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setReserver11(reserver11);
            return;
        }
        this.reserver11 = reserver11;
        this.reserver11DirtyFlag  = true;
    }

    /**
     *  获取属性值[保留字段11]
     */
    public Integer getReserver11() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getReserver11();
        }
        return this.reserver11;
    }

    /**
     *  获取属性值[保留字段11]是否修改
     */
    public boolean isReserver11Dirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isReserver11Dirty();
        }
        return this.reserver11DirtyFlag;
    }

    /**
     *  重置属性值[保留字段11]
     */
    public void resetReserver11() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetReserver11();
            return;
        }

        this.reserver11DirtyFlag = false;
        this.reserver11 = null;
    }
    /**
     *  设置属性值[保留字段12]
     *  @param reserver12
     */
    public void setReserver12(Integer reserver12) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setReserver12(reserver12);
            return;
        }
        this.reserver12 = reserver12;
        this.reserver12DirtyFlag  = true;
    }

    /**
     *  获取属性值[保留字段12]
     */
    public Integer getReserver12() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getReserver12();
        }
        return this.reserver12;
    }

    /**
     *  获取属性值[保留字段12]是否修改
     */
    public boolean isReserver12Dirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isReserver12Dirty();
        }
        return this.reserver12DirtyFlag;
    }

    /**
     *  重置属性值[保留字段12]
     */
    public void resetReserver12() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetReserver12();
            return;
        }

        this.reserver12DirtyFlag = false;
        this.reserver12 = null;
    }
    /**
     *  设置属性值[保留字段13]
     *  @param reserver13
     */
    public void setReserver13(Integer reserver13) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setReserver13(reserver13);
            return;
        }
        this.reserver13 = reserver13;
        this.reserver13DirtyFlag  = true;
    }

    /**
     *  获取属性值[保留字段13]
     */
    public Integer getReserver13() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getReserver13();
        }
        return this.reserver13;
    }

    /**
     *  获取属性值[保留字段13]是否修改
     */
    public boolean isReserver13Dirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isReserver13Dirty();
        }
        return this.reserver13DirtyFlag;
    }

    /**
     *  重置属性值[保留字段13]
     */
    public void resetReserver13() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetReserver13();
            return;
        }

        this.reserver13DirtyFlag = false;
        this.reserver13 = null;
    }
    /**
     *  设置属性值[保留字段14]
     *  @param reserver14
     */
    public void setReserver14(Integer reserver14) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setReserver14(reserver14);
            return;
        }
        this.reserver14 = reserver14;
        this.reserver14DirtyFlag  = true;
    }

    /**
     *  获取属性值[保留字段14]
     */
    public Integer getReserver14() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getReserver14();
        }
        return this.reserver14;
    }

    /**
     *  获取属性值[保留字段14]是否修改
     */
    public boolean isReserver14Dirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isReserver14Dirty();
        }
        return this.reserver14DirtyFlag;
    }

    /**
     *  重置属性值[保留字段14]
     */
    public void resetReserver14() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetReserver14();
            return;
        }

        this.reserver14DirtyFlag = false;
        this.reserver14 = null;
    }
    /**
     *  设置属性值[保留字段15]
     *  @param reserver15
     */
    public void setReserver15(Double reserver15) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setReserver15(reserver15);
            return;
        }
        this.reserver15 = reserver15;
        this.reserver15DirtyFlag  = true;
    }

    /**
     *  获取属性值[保留字段15]
     */
    public Double getReserver15() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getReserver15();
        }
        return this.reserver15;
    }

    /**
     *  获取属性值[保留字段15]是否修改
     */
    public boolean isReserver15Dirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isReserver15Dirty();
        }
        return this.reserver15DirtyFlag;
    }

    /**
     *  重置属性值[保留字段15]
     */
    public void resetReserver15() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetReserver15();
            return;
        }

        this.reserver15DirtyFlag = false;
        this.reserver15 = null;
    }
    /**
     *  设置属性值[保留字段16]
     *  @param reserver16
     */
    public void setReserver16(Double reserver16) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setReserver16(reserver16);
            return;
        }
        this.reserver16 = reserver16;
        this.reserver16DirtyFlag  = true;
    }

    /**
     *  获取属性值[保留字段16]
     */
    public Double getReserver16() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getReserver16();
        }
        return this.reserver16;
    }

    /**
     *  获取属性值[保留字段16]是否修改
     */
    public boolean isReserver16Dirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isReserver16Dirty();
        }
        return this.reserver16DirtyFlag;
    }

    /**
     *  重置属性值[保留字段16]
     */
    public void resetReserver16() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetReserver16();
            return;
        }

        this.reserver16DirtyFlag = false;
        this.reserver16 = null;
    }
    /**
     *  设置属性值[保留字段17]
     *  @param reserver17
     */
    public void setReserver17(Double reserver17) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setReserver17(reserver17);
            return;
        }
        this.reserver17 = reserver17;
        this.reserver17DirtyFlag  = true;
    }

    /**
     *  获取属性值[保留字段17]
     */
    public Double getReserver17() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getReserver17();
        }
        return this.reserver17;
    }

    /**
     *  获取属性值[保留字段17]是否修改
     */
    public boolean isReserver17Dirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isReserver17Dirty();
        }
        return this.reserver17DirtyFlag;
    }

    /**
     *  重置属性值[保留字段17]
     */
    public void resetReserver17() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetReserver17();
            return;
        }

        this.reserver17DirtyFlag = false;
        this.reserver17 = null;
    }
    /**
     *  设置属性值[保留字段18]
     *  @param reserver18
     */
    public void setReserver18(Double reserver18) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setReserver18(reserver18);
            return;
        }
        this.reserver18 = reserver18;
        this.reserver18DirtyFlag  = true;
    }

    /**
     *  获取属性值[保留字段18]
     */
    public Double getReserver18() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getReserver18();
        }
        return this.reserver18;
    }

    /**
     *  获取属性值[保留字段18]是否修改
     */
    public boolean isReserver18Dirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isReserver18Dirty();
        }
        return this.reserver18DirtyFlag;
    }

    /**
     *  重置属性值[保留字段18]
     */
    public void resetReserver18() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetReserver18();
            return;
        }

        this.reserver18DirtyFlag = false;
        this.reserver18 = null;
    }
    /**
     *  设置属性值[保留字段19]
     *  @param reserver19
     */
    public void setReserver19(Timestamp reserver19) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setReserver19(reserver19);
            return;
        }
        this.reserver19 = reserver19;
        this.reserver19DirtyFlag  = true;
    }

    /**
     *  获取属性值[保留字段19]
     */
    public Timestamp getReserver19() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getReserver19();
        }
        return this.reserver19;
    }

    /**
     *  获取属性值[保留字段19]是否修改
     */
    public boolean isReserver19Dirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isReserver19Dirty();
        }
        return this.reserver19DirtyFlag;
    }

    /**
     *  重置属性值[保留字段19]
     */
    public void resetReserver19() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetReserver19();
            return;
        }

        this.reserver19DirtyFlag = false;
        this.reserver19 = null;
    }
    /**
     *  设置属性值[保留字段2]
     *  @param reserver2
     */
    public void setReserver2(String reserver2) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setReserver2(reserver2);
            return;
        }
        if(reserver2!=null) {
            reserver2 = StringHelper.trimRight(reserver2);
            if(reserver2.length()==0) {
                reserver2 = null;
            }
        }
        this.reserver2 = reserver2;
        this.reserver2DirtyFlag  = true;
    }

    /**
     *  获取属性值[保留字段2]
     */
    public String getReserver2() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getReserver2();
        }
        return this.reserver2;
    }

    /**
     *  获取属性值[保留字段2]是否修改
     */
    public boolean isReserver2Dirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isReserver2Dirty();
        }
        return this.reserver2DirtyFlag;
    }

    /**
     *  重置属性值[保留字段2]
     */
    public void resetReserver2() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetReserver2();
            return;
        }

        this.reserver2DirtyFlag = false;
        this.reserver2 = null;
    }
    /**
     *  设置属性值[保留字段20]
     *  @param reserver20
     */
    public void setReserver20(Timestamp reserver20) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setReserver20(reserver20);
            return;
        }
        this.reserver20 = reserver20;
        this.reserver20DirtyFlag  = true;
    }

    /**
     *  获取属性值[保留字段20]
     */
    public Timestamp getReserver20() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getReserver20();
        }
        return this.reserver20;
    }

    /**
     *  获取属性值[保留字段20]是否修改
     */
    public boolean isReserver20Dirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isReserver20Dirty();
        }
        return this.reserver20DirtyFlag;
    }

    /**
     *  重置属性值[保留字段20]
     */
    public void resetReserver20() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetReserver20();
            return;
        }

        this.reserver20DirtyFlag = false;
        this.reserver20 = null;
    }
    /**
     *  设置属性值[保留字段21]
     *  @param reserver21
     */
    public void setReserver21(Timestamp reserver21) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setReserver21(reserver21);
            return;
        }
        this.reserver21 = reserver21;
        this.reserver21DirtyFlag  = true;
    }

    /**
     *  获取属性值[保留字段21]
     */
    public Timestamp getReserver21() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getReserver21();
        }
        return this.reserver21;
    }

    /**
     *  获取属性值[保留字段21]是否修改
     */
    public boolean isReserver21Dirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isReserver21Dirty();
        }
        return this.reserver21DirtyFlag;
    }

    /**
     *  重置属性值[保留字段21]
     */
    public void resetReserver21() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetReserver21();
            return;
        }

        this.reserver21DirtyFlag = false;
        this.reserver21 = null;
    }
    /**
     *  设置属性值[保留字段22]
     *  @param reserver22
     */
    public void setReserver22(Timestamp reserver22) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setReserver22(reserver22);
            return;
        }
        this.reserver22 = reserver22;
        this.reserver22DirtyFlag  = true;
    }

    /**
     *  获取属性值[保留字段22]
     */
    public Timestamp getReserver22() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getReserver22();
        }
        return this.reserver22;
    }

    /**
     *  获取属性值[保留字段22]是否修改
     */
    public boolean isReserver22Dirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isReserver22Dirty();
        }
        return this.reserver22DirtyFlag;
    }

    /**
     *  重置属性值[保留字段22]
     */
    public void resetReserver22() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetReserver22();
            return;
        }

        this.reserver22DirtyFlag = false;
        this.reserver22 = null;
    }
    /**
     *  设置属性值[保留字段23]
     *  @param reserver23
     */
    public void setReserver23(String reserver23) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setReserver23(reserver23);
            return;
        }
        if(reserver23!=null) {
            reserver23 = StringHelper.trimRight(reserver23);
            if(reserver23.length()==0) {
                reserver23 = null;
            }
        }
        this.reserver23 = reserver23;
        this.reserver23DirtyFlag  = true;
    }

    /**
     *  获取属性值[保留字段23]
     */
    public String getReserver23() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getReserver23();
        }
        return this.reserver23;
    }

    /**
     *  获取属性值[保留字段23]是否修改
     */
    public boolean isReserver23Dirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isReserver23Dirty();
        }
        return this.reserver23DirtyFlag;
    }

    /**
     *  重置属性值[保留字段23]
     */
    public void resetReserver23() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetReserver23();
            return;
        }

        this.reserver23DirtyFlag = false;
        this.reserver23 = null;
    }
    /**
     *  设置属性值[保留字段24]
     *  @param reserver24
     */
    public void setReserver24(String reserver24) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setReserver24(reserver24);
            return;
        }
        if(reserver24!=null) {
            reserver24 = StringHelper.trimRight(reserver24);
            if(reserver24.length()==0) {
                reserver24 = null;
            }
        }
        this.reserver24 = reserver24;
        this.reserver24DirtyFlag  = true;
    }

    /**
     *  获取属性值[保留字段24]
     */
    public String getReserver24() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getReserver24();
        }
        return this.reserver24;
    }

    /**
     *  获取属性值[保留字段24]是否修改
     */
    public boolean isReserver24Dirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isReserver24Dirty();
        }
        return this.reserver24DirtyFlag;
    }

    /**
     *  重置属性值[保留字段24]
     */
    public void resetReserver24() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetReserver24();
            return;
        }

        this.reserver24DirtyFlag = false;
        this.reserver24 = null;
    }
    /**
     *  设置属性值[保留字段25]
     *  @param reserver25
     */
    public void setReserver25(String reserver25) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setReserver25(reserver25);
            return;
        }
        if(reserver25!=null) {
            reserver25 = StringHelper.trimRight(reserver25);
            if(reserver25.length()==0) {
                reserver25 = null;
            }
        }
        this.reserver25 = reserver25;
        this.reserver25DirtyFlag  = true;
    }

    /**
     *  获取属性值[保留字段25]
     */
    public String getReserver25() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getReserver25();
        }
        return this.reserver25;
    }

    /**
     *  获取属性值[保留字段25]是否修改
     */
    public boolean isReserver25Dirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isReserver25Dirty();
        }
        return this.reserver25DirtyFlag;
    }

    /**
     *  重置属性值[保留字段25]
     */
    public void resetReserver25() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetReserver25();
            return;
        }

        this.reserver25DirtyFlag = false;
        this.reserver25 = null;
    }
    /**
     *  设置属性值[保留字段26]
     *  @param reserver26
     */
    public void setReserver26(String reserver26) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setReserver26(reserver26);
            return;
        }
        if(reserver26!=null) {
            reserver26 = StringHelper.trimRight(reserver26);
            if(reserver26.length()==0) {
                reserver26 = null;
            }
        }
        this.reserver26 = reserver26;
        this.reserver26DirtyFlag  = true;
    }

    /**
     *  获取属性值[保留字段26]
     */
    public String getReserver26() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getReserver26();
        }
        return this.reserver26;
    }

    /**
     *  获取属性值[保留字段26]是否修改
     */
    public boolean isReserver26Dirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isReserver26Dirty();
        }
        return this.reserver26DirtyFlag;
    }

    /**
     *  重置属性值[保留字段26]
     */
    public void resetReserver26() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetReserver26();
            return;
        }

        this.reserver26DirtyFlag = false;
        this.reserver26 = null;
    }
    /**
     *  设置属性值[保留字段27]
     *  @param reserver27
     */
    public void setReserver27(String reserver27) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setReserver27(reserver27);
            return;
        }
        if(reserver27!=null) {
            reserver27 = StringHelper.trimRight(reserver27);
            if(reserver27.length()==0) {
                reserver27 = null;
            }
        }
        this.reserver27 = reserver27;
        this.reserver27DirtyFlag  = true;
    }

    /**
     *  获取属性值[保留字段27]
     */
    public String getReserver27() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getReserver27();
        }
        return this.reserver27;
    }

    /**
     *  获取属性值[保留字段27]是否修改
     */
    public boolean isReserver27Dirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isReserver27Dirty();
        }
        return this.reserver27DirtyFlag;
    }

    /**
     *  重置属性值[保留字段27]
     */
    public void resetReserver27() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetReserver27();
            return;
        }

        this.reserver27DirtyFlag = false;
        this.reserver27 = null;
    }
    /**
     *  设置属性值[保留字段28]
     *  @param reserver28
     */
    public void setReserver28(String reserver28) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setReserver28(reserver28);
            return;
        }
        if(reserver28!=null) {
            reserver28 = StringHelper.trimRight(reserver28);
            if(reserver28.length()==0) {
                reserver28 = null;
            }
        }
        this.reserver28 = reserver28;
        this.reserver28DirtyFlag  = true;
    }

    /**
     *  获取属性值[保留字段28]
     */
    public String getReserver28() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getReserver28();
        }
        return this.reserver28;
    }

    /**
     *  获取属性值[保留字段28]是否修改
     */
    public boolean isReserver28Dirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isReserver28Dirty();
        }
        return this.reserver28DirtyFlag;
    }

    /**
     *  重置属性值[保留字段28]
     */
    public void resetReserver28() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetReserver28();
            return;
        }

        this.reserver28DirtyFlag = false;
        this.reserver28 = null;
    }
    /**
     *  设置属性值[保留字段29]
     *  @param reserver29
     */
    public void setReserver29(String reserver29) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setReserver29(reserver29);
            return;
        }
        if(reserver29!=null) {
            reserver29 = StringHelper.trimRight(reserver29);
            if(reserver29.length()==0) {
                reserver29 = null;
            }
        }
        this.reserver29 = reserver29;
        this.reserver29DirtyFlag  = true;
    }

    /**
     *  获取属性值[保留字段29]
     */
    public String getReserver29() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getReserver29();
        }
        return this.reserver29;
    }

    /**
     *  获取属性值[保留字段29]是否修改
     */
    public boolean isReserver29Dirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isReserver29Dirty();
        }
        return this.reserver29DirtyFlag;
    }

    /**
     *  重置属性值[保留字段29]
     */
    public void resetReserver29() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetReserver29();
            return;
        }

        this.reserver29DirtyFlag = false;
        this.reserver29 = null;
    }
    /**
     *  设置属性值[保留字段3]
     *  @param reserver3
     */
    public void setReserver3(String reserver3) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setReserver3(reserver3);
            return;
        }
        if(reserver3!=null) {
            reserver3 = StringHelper.trimRight(reserver3);
            if(reserver3.length()==0) {
                reserver3 = null;
            }
        }
        this.reserver3 = reserver3;
        this.reserver3DirtyFlag  = true;
    }

    /**
     *  获取属性值[保留字段3]
     */
    public String getReserver3() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getReserver3();
        }
        return this.reserver3;
    }

    /**
     *  获取属性值[保留字段3]是否修改
     */
    public boolean isReserver3Dirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isReserver3Dirty();
        }
        return this.reserver3DirtyFlag;
    }

    /**
     *  重置属性值[保留字段3]
     */
    public void resetReserver3() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetReserver3();
            return;
        }

        this.reserver3DirtyFlag = false;
        this.reserver3 = null;
    }
    /**
     *  设置属性值[保留字段30]
     *  @param reserver30
     */
    public void setReserver30(String reserver30) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setReserver30(reserver30);
            return;
        }
        if(reserver30!=null) {
            reserver30 = StringHelper.trimRight(reserver30);
            if(reserver30.length()==0) {
                reserver30 = null;
            }
        }
        this.reserver30 = reserver30;
        this.reserver30DirtyFlag  = true;
    }

    /**
     *  获取属性值[保留字段30]
     */
    public String getReserver30() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getReserver30();
        }
        return this.reserver30;
    }

    /**
     *  获取属性值[保留字段30]是否修改
     */
    public boolean isReserver30Dirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isReserver30Dirty();
        }
        return this.reserver30DirtyFlag;
    }

    /**
     *  重置属性值[保留字段30]
     */
    public void resetReserver30() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetReserver30();
            return;
        }

        this.reserver30DirtyFlag = false;
        this.reserver30 = null;
    }
    /**
     *  设置属性值[保留字段4]
     *  @param reserver4
     */
    public void setReserver4(String reserver4) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setReserver4(reserver4);
            return;
        }
        if(reserver4!=null) {
            reserver4 = StringHelper.trimRight(reserver4);
            if(reserver4.length()==0) {
                reserver4 = null;
            }
        }
        this.reserver4 = reserver4;
        this.reserver4DirtyFlag  = true;
    }

    /**
     *  获取属性值[保留字段4]
     */
    public String getReserver4() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getReserver4();
        }
        return this.reserver4;
    }

    /**
     *  获取属性值[保留字段4]是否修改
     */
    public boolean isReserver4Dirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isReserver4Dirty();
        }
        return this.reserver4DirtyFlag;
    }

    /**
     *  重置属性值[保留字段4]
     */
    public void resetReserver4() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetReserver4();
            return;
        }

        this.reserver4DirtyFlag = false;
        this.reserver4 = null;
    }
    /**
     *  设置属性值[保留字段5]
     *  @param reserver5
     */
    public void setReserver5(String reserver5) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setReserver5(reserver5);
            return;
        }
        if(reserver5!=null) {
            reserver5 = StringHelper.trimRight(reserver5);
            if(reserver5.length()==0) {
                reserver5 = null;
            }
        }
        this.reserver5 = reserver5;
        this.reserver5DirtyFlag  = true;
    }

    /**
     *  获取属性值[保留字段5]
     */
    public String getReserver5() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getReserver5();
        }
        return this.reserver5;
    }

    /**
     *  获取属性值[保留字段5]是否修改
     */
    public boolean isReserver5Dirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isReserver5Dirty();
        }
        return this.reserver5DirtyFlag;
    }

    /**
     *  重置属性值[保留字段5]
     */
    public void resetReserver5() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetReserver5();
            return;
        }

        this.reserver5DirtyFlag = false;
        this.reserver5 = null;
    }
    /**
     *  设置属性值[保留字段6]
     *  @param reserver6
     */
    public void setReserver6(String reserver6) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setReserver6(reserver6);
            return;
        }
        if(reserver6!=null) {
            reserver6 = StringHelper.trimRight(reserver6);
            if(reserver6.length()==0) {
                reserver6 = null;
            }
        }
        this.reserver6 = reserver6;
        this.reserver6DirtyFlag  = true;
    }

    /**
     *  获取属性值[保留字段6]
     */
    public String getReserver6() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getReserver6();
        }
        return this.reserver6;
    }

    /**
     *  获取属性值[保留字段6]是否修改
     */
    public boolean isReserver6Dirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isReserver6Dirty();
        }
        return this.reserver6DirtyFlag;
    }

    /**
     *  重置属性值[保留字段6]
     */
    public void resetReserver6() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetReserver6();
            return;
        }

        this.reserver6DirtyFlag = false;
        this.reserver6 = null;
    }
    /**
     *  设置属性值[保留字段7]
     *  @param reserver7
     */
    public void setReserver7(String reserver7) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setReserver7(reserver7);
            return;
        }
        if(reserver7!=null) {
            reserver7 = StringHelper.trimRight(reserver7);
            if(reserver7.length()==0) {
                reserver7 = null;
            }
        }
        this.reserver7 = reserver7;
        this.reserver7DirtyFlag  = true;
    }

    /**
     *  获取属性值[保留字段7]
     */
    public String getReserver7() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getReserver7();
        }
        return this.reserver7;
    }

    /**
     *  获取属性值[保留字段7]是否修改
     */
    public boolean isReserver7Dirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isReserver7Dirty();
        }
        return this.reserver7DirtyFlag;
    }

    /**
     *  重置属性值[保留字段7]
     */
    public void resetReserver7() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetReserver7();
            return;
        }

        this.reserver7DirtyFlag = false;
        this.reserver7 = null;
    }
    /**
     *  设置属性值[保留字段8]
     *  @param reserver8
     */
    public void setReserver8(String reserver8) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setReserver8(reserver8);
            return;
        }
        if(reserver8!=null) {
            reserver8 = StringHelper.trimRight(reserver8);
            if(reserver8.length()==0) {
                reserver8 = null;
            }
        }
        this.reserver8 = reserver8;
        this.reserver8DirtyFlag  = true;
    }

    /**
     *  获取属性值[保留字段8]
     */
    public String getReserver8() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getReserver8();
        }
        return this.reserver8;
    }

    /**
     *  获取属性值[保留字段8]是否修改
     */
    public boolean isReserver8Dirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isReserver8Dirty();
        }
        return this.reserver8DirtyFlag;
    }

    /**
     *  重置属性值[保留字段8]
     */
    public void resetReserver8() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetReserver8();
            return;
        }

        this.reserver8DirtyFlag = false;
        this.reserver8 = null;
    }
    /**
     *  设置属性值[保留字段9]
     *  @param reserver9
     */
    public void setReserver9(String reserver9) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setReserver9(reserver9);
            return;
        }
        if(reserver9!=null) {
            reserver9 = StringHelper.trimRight(reserver9);
            if(reserver9.length()==0) {
                reserver9 = null;
            }
        }
        this.reserver9 = reserver9;
        this.reserver9DirtyFlag  = true;
    }

    /**
     *  获取属性值[保留字段9]
     */
    public String getReserver9() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getReserver9();
        }
        return this.reserver9;
    }

    /**
     *  获取属性值[保留字段9]是否修改
     */
    public boolean isReserver9Dirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isReserver9Dirty();
        }
        return this.reserver9DirtyFlag;
    }

    /**
     *  重置属性值[保留字段9]
     */
    public void resetReserver9() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetReserver9();
            return;
        }

        this.reserver9DirtyFlag = false;
        this.reserver9 = null;
    }
    /**
     *  设置属性值[简称 ]
     *  @param shortname
     */
    public void setShortName(String shortname) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setShortName(shortname);
            return;
        }
        if(shortname!=null) {
            shortname = StringHelper.trimRight(shortname);
            if(shortname.length()==0) {
                shortname = null;
            }
        }
        this.shortname = shortname;
        this.shortnameDirtyFlag  = true;
    }

    /**
     *  获取属性值[简称 ]
     */
    public String getShortName() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getShortName();
        }
        return this.shortname;
    }

    /**
     *  获取属性值[简称 ]是否修改
     */
    public boolean isShortNameDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isShortNameDirty();
        }
        return this.shortnameDirtyFlag;
    }

    /**
     *  重置属性值[简称 ]
     */
    public void resetShortName() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetShortName();
            return;
        }

        this.shortnameDirtyFlag = false;
        this.shortname = null;
    }
    /**
     *  设置属性值[更新时间]
     *  @param updatedate
     */
    public void setUpdateDate(Timestamp updatedate) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setUpdateDate(updatedate);
            return;
        }
        this.updatedate = updatedate;
        this.updatedateDirtyFlag  = true;
    }

    /**
     *  获取属性值[更新时间]
     */
    public Timestamp getUpdateDate() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getUpdateDate();
        }
        return this.updatedate;
    }

    /**
     *  获取属性值[更新时间]是否修改
     */
    public boolean isUpdateDateDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isUpdateDateDirty();
        }
        return this.updatedateDirtyFlag;
    }

    /**
     *  重置属性值[更新时间]
     */
    public void resetUpdateDate() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetUpdateDate();
            return;
        }

        this.updatedateDirtyFlag = false;
        this.updatedate = null;
    }
    /**
     *  设置属性值[更新人]代码表：net.ibizsys.psrt.srv.codelist.SysOperatorCodeListModel
     *  @param updateman
     */
    public void setUpdateMan(String updateman) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setUpdateMan(updateman);
            return;
        }
        if(updateman!=null) {
            updateman = StringHelper.trimRight(updateman);
            if(updateman.length()==0) {
                updateman = null;
            }
        }
        this.updateman = updateman;
        this.updatemanDirtyFlag  = true;
    }

    /**
     *  获取属性值[更新人]代码表：net.ibizsys.psrt.srv.codelist.SysOperatorCodeListModel
     */
    public String getUpdateMan() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getUpdateMan();
        }
        return this.updateman;
    }

    /**
     *  获取属性值[更新人]是否修改
     */
    public boolean isUpdateManDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isUpdateManDirty();
        }
        return this.updatemanDirtyFlag;
    }

    /**
     *  重置属性值[更新人]
     */
    public void resetUpdateMan() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetUpdateMan();
            return;
        }

        this.updatemanDirtyFlag = false;
        this.updateman = null;
    }
    /**
     *  设置属性值[用户数据]
     *  @param userdata
     */
    public void setUserData(String userdata) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setUserData(userdata);
            return;
        }
        if(userdata!=null) {
            userdata = StringHelper.trimRight(userdata);
            if(userdata.length()==0) {
                userdata = null;
            }
        }
        this.userdata = userdata;
        this.userdataDirtyFlag  = true;
    }

    /**
     *  获取属性值[用户数据]
     */
    public String getUserData() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getUserData();
        }
        return this.userdata;
    }

    /**
     *  获取属性值[用户数据]是否修改
     */
    public boolean isUserDataDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isUserDataDirty();
        }
        return this.userdataDirtyFlag;
    }

    /**
     *  重置属性值[用户数据]
     */
    public void resetUserData() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetUserData();
            return;
        }

        this.userdataDirtyFlag = false;
        this.userdata = null;
    }
    /**
     *  设置属性值[用户数据2]
     *  @param userdata2
     */
    public void setUserData2(String userdata2) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setUserData2(userdata2);
            return;
        }
        if(userdata2!=null) {
            userdata2 = StringHelper.trimRight(userdata2);
            if(userdata2.length()==0) {
                userdata2 = null;
            }
        }
        this.userdata2 = userdata2;
        this.userdata2DirtyFlag  = true;
    }

    /**
     *  获取属性值[用户数据2]
     */
    public String getUserData2() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getUserData2();
        }
        return this.userdata2;
    }

    /**
     *  获取属性值[用户数据2]是否修改
     */
    public boolean isUserData2Dirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isUserData2Dirty();
        }
        return this.userdata2DirtyFlag;
    }

    /**
     *  重置属性值[用户数据2]
     */
    public void resetUserData2() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetUserData2();
            return;
        }

        this.userdata2DirtyFlag = false;
        this.userdata2 = null;
    }
    /**
     *  设置属性值[启用标志]代码表：net.ibizsys.psrt.srv.codelist.YesNoCodeListModel
     *  @param validflag
     */
    public void setValidFlag(Integer validflag) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setValidFlag(validflag);
            return;
        }
        this.validflag = validflag;
        this.validflagDirtyFlag  = true;
    }

    /**
     *  获取属性值[启用标志]代码表：net.ibizsys.psrt.srv.codelist.YesNoCodeListModel
     */
    public Integer getValidFlag() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getValidFlag();
        }
        return this.validflag;
    }

    /**
     *  获取属性值[启用标志]是否修改
     */
    public boolean isValidFlagDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isValidFlagDirty();
        }
        return this.validflagDirtyFlag;
    }

    /**
     *  重置属性值[启用标志]
     */
    public void resetValidFlag() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetValidFlag();
            return;
        }

        this.validflagDirtyFlag = false;
        this.validflag = null;
    }
    /**
     *  设置属性值[虚拟部门]代码表：net.ibizsys.psrt.srv.codelist.YesNoCodeListModel
     *  @param virtualflag
     */
    public void setVirtualFlag(Integer virtualflag) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setVirtualFlag(virtualflag);
            return;
        }
        this.virtualflag = virtualflag;
        this.virtualflagDirtyFlag  = true;
    }

    /**
     *  获取属性值[虚拟部门]代码表：net.ibizsys.psrt.srv.codelist.YesNoCodeListModel
     */
    public Integer getVirtualFlag() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getVirtualFlag();
        }
        return this.virtualflag;
    }

    /**
     *  获取属性值[虚拟部门]是否修改
     */
    public boolean isVirtualFlagDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isVirtualFlagDirty();
        }
        return this.virtualflagDirtyFlag;
    }

    /**
     *  重置属性值[虚拟部门]
     */
    public void resetVirtualFlag() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetVirtualFlag();
            return;
        }

        this.virtualflagDirtyFlag = false;
        this.virtualflag = null;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onReset()
     */
    @Override
    protected void onReset() {
        OrgSectorBase.resetAll(this);
        super.onReset();
    }

    /**
     * 重置当前数据对象属性值
     * @param entity
     */
    private static void resetAll(OrgSectorBase et) {
        et.resetBizCode();
        et.resetCreateDate();
        et.resetCreateMan();
        et.resetLevelCode();
        et.resetMemo();
        et.resetOrderValue();
        et.resetOrgCode();
        et.resetOrgId();
        et.resetOrgName();
        et.resetOrgSectorId();
        et.resetOrgSectorName();
        et.resetPOrgSectorId();
        et.resetPOrgSectorName();
        et.resetRepOrgSectorId();
        et.resetRepOrgSectorName();
        et.resetReserver();
        et.resetReserver10();
        et.resetReserver11();
        et.resetReserver12();
        et.resetReserver13();
        et.resetReserver14();
        et.resetReserver15();
        et.resetReserver16();
        et.resetReserver17();
        et.resetReserver18();
        et.resetReserver19();
        et.resetReserver2();
        et.resetReserver20();
        et.resetReserver21();
        et.resetReserver22();
        et.resetReserver23();
        et.resetReserver24();
        et.resetReserver25();
        et.resetReserver26();
        et.resetReserver27();
        et.resetReserver28();
        et.resetReserver29();
        et.resetReserver3();
        et.resetReserver30();
        et.resetReserver4();
        et.resetReserver5();
        et.resetReserver6();
        et.resetReserver7();
        et.resetReserver8();
        et.resetReserver9();
        et.resetShortName();
        et.resetUpdateDate();
        et.resetUpdateMan();
        et.resetUserData();
        et.resetUserData2();
        et.resetValidFlag();
        et.resetVirtualFlag();
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onFillMap(java.util.HashMap, boolean)
     */
    @Override
    protected void onFillMap(HashMap<String, Object> params, boolean bDirtyOnly) {
        if(!bDirtyOnly || isBizCodeDirty()) {
            params.put(FIELD_BIZCODE,getBizCode());
        }
        if(!bDirtyOnly || isCreateDateDirty()) {
            params.put(FIELD_CREATEDATE,getCreateDate());
        }
        if(!bDirtyOnly || isCreateManDirty()) {
            params.put(FIELD_CREATEMAN,getCreateMan());
        }
        if(!bDirtyOnly || isLevelCodeDirty()) {
            params.put(FIELD_LEVELCODE,getLevelCode());
        }
        if(!bDirtyOnly || isMemoDirty()) {
            params.put(FIELD_MEMO,getMemo());
        }
        if(!bDirtyOnly || isOrderValueDirty()) {
            params.put(FIELD_ORDERVALUE,getOrderValue());
        }
        if(!bDirtyOnly || isOrgCodeDirty()) {
            params.put(FIELD_ORGCODE,getOrgCode());
        }
        if(!bDirtyOnly || isOrgIdDirty()) {
            params.put(FIELD_ORGID,getOrgId());
        }
        if(!bDirtyOnly || isOrgNameDirty()) {
            params.put(FIELD_ORGNAME,getOrgName());
        }
        if(!bDirtyOnly || isOrgSectorIdDirty()) {
            params.put(FIELD_ORGSECTORID,getOrgSectorId());
        }
        if(!bDirtyOnly || isOrgSectorNameDirty()) {
            params.put(FIELD_ORGSECTORNAME,getOrgSectorName());
        }
        if(!bDirtyOnly || isPOrgSectorIdDirty()) {
            params.put(FIELD_PORGSECTORID,getPOrgSectorId());
        }
        if(!bDirtyOnly || isPOrgSectorNameDirty()) {
            params.put(FIELD_PORGSECTORNAME,getPOrgSectorName());
        }
        if(!bDirtyOnly || isRepOrgSectorIdDirty()) {
            params.put(FIELD_REPORGSECTORID,getRepOrgSectorId());
        }
        if(!bDirtyOnly || isRepOrgSectorNameDirty()) {
            params.put(FIELD_REPORGSECTORNAME,getRepOrgSectorName());
        }
        if(!bDirtyOnly || isReserverDirty()) {
            params.put(FIELD_RESERVER,getReserver());
        }
        if(!bDirtyOnly || isReserver10Dirty()) {
            params.put(FIELD_RESERVER10,getReserver10());
        }
        if(!bDirtyOnly || isReserver11Dirty()) {
            params.put(FIELD_RESERVER11,getReserver11());
        }
        if(!bDirtyOnly || isReserver12Dirty()) {
            params.put(FIELD_RESERVER12,getReserver12());
        }
        if(!bDirtyOnly || isReserver13Dirty()) {
            params.put(FIELD_RESERVER13,getReserver13());
        }
        if(!bDirtyOnly || isReserver14Dirty()) {
            params.put(FIELD_RESERVER14,getReserver14());
        }
        if(!bDirtyOnly || isReserver15Dirty()) {
            params.put(FIELD_RESERVER15,getReserver15());
        }
        if(!bDirtyOnly || isReserver16Dirty()) {
            params.put(FIELD_RESERVER16,getReserver16());
        }
        if(!bDirtyOnly || isReserver17Dirty()) {
            params.put(FIELD_RESERVER17,getReserver17());
        }
        if(!bDirtyOnly || isReserver18Dirty()) {
            params.put(FIELD_RESERVER18,getReserver18());
        }
        if(!bDirtyOnly || isReserver19Dirty()) {
            params.put(FIELD_RESERVER19,getReserver19());
        }
        if(!bDirtyOnly || isReserver2Dirty()) {
            params.put(FIELD_RESERVER2,getReserver2());
        }
        if(!bDirtyOnly || isReserver20Dirty()) {
            params.put(FIELD_RESERVER20,getReserver20());
        }
        if(!bDirtyOnly || isReserver21Dirty()) {
            params.put(FIELD_RESERVER21,getReserver21());
        }
        if(!bDirtyOnly || isReserver22Dirty()) {
            params.put(FIELD_RESERVER22,getReserver22());
        }
        if(!bDirtyOnly || isReserver23Dirty()) {
            params.put(FIELD_RESERVER23,getReserver23());
        }
        if(!bDirtyOnly || isReserver24Dirty()) {
            params.put(FIELD_RESERVER24,getReserver24());
        }
        if(!bDirtyOnly || isReserver25Dirty()) {
            params.put(FIELD_RESERVER25,getReserver25());
        }
        if(!bDirtyOnly || isReserver26Dirty()) {
            params.put(FIELD_RESERVER26,getReserver26());
        }
        if(!bDirtyOnly || isReserver27Dirty()) {
            params.put(FIELD_RESERVER27,getReserver27());
        }
        if(!bDirtyOnly || isReserver28Dirty()) {
            params.put(FIELD_RESERVER28,getReserver28());
        }
        if(!bDirtyOnly || isReserver29Dirty()) {
            params.put(FIELD_RESERVER29,getReserver29());
        }
        if(!bDirtyOnly || isReserver3Dirty()) {
            params.put(FIELD_RESERVER3,getReserver3());
        }
        if(!bDirtyOnly || isReserver30Dirty()) {
            params.put(FIELD_RESERVER30,getReserver30());
        }
        if(!bDirtyOnly || isReserver4Dirty()) {
            params.put(FIELD_RESERVER4,getReserver4());
        }
        if(!bDirtyOnly || isReserver5Dirty()) {
            params.put(FIELD_RESERVER5,getReserver5());
        }
        if(!bDirtyOnly || isReserver6Dirty()) {
            params.put(FIELD_RESERVER6,getReserver6());
        }
        if(!bDirtyOnly || isReserver7Dirty()) {
            params.put(FIELD_RESERVER7,getReserver7());
        }
        if(!bDirtyOnly || isReserver8Dirty()) {
            params.put(FIELD_RESERVER8,getReserver8());
        }
        if(!bDirtyOnly || isReserver9Dirty()) {
            params.put(FIELD_RESERVER9,getReserver9());
        }
        if(!bDirtyOnly || isShortNameDirty()) {
            params.put(FIELD_SHORTNAME,getShortName());
        }
        if(!bDirtyOnly || isUpdateDateDirty()) {
            params.put(FIELD_UPDATEDATE,getUpdateDate());
        }
        if(!bDirtyOnly || isUpdateManDirty()) {
            params.put(FIELD_UPDATEMAN,getUpdateMan());
        }
        if(!bDirtyOnly || isUserDataDirty()) {
            params.put(FIELD_USERDATA,getUserData());
        }
        if(!bDirtyOnly || isUserData2Dirty()) {
            params.put(FIELD_USERDATA2,getUserData2());
        }
        if(!bDirtyOnly || isValidFlagDirty()) {
            params.put(FIELD_VALIDFLAG,getValidFlag());
        }
        if(!bDirtyOnly || isVirtualFlagDirty()) {
            params.put(FIELD_VIRTUALFLAG,getVirtualFlag());
        }
        super.onFillMap(params, bDirtyOnly);
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.data.DataObject#get(java.lang.String)
     */
    @Override
    public Object get(String strParamName) throws Exception {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().get(strParamName);
        }

        if(StringHelper.isNullOrEmpty(strParamName))
            throw new Exception("没有指定属性");
        Integer index=fieldIndexMap.get(strParamName.toUpperCase());
        if(index==null)
            return super.get(strParamName);

        return  OrgSectorBase.get(this, index);
    }

    /**
     * 通过属性标识获取属性值
     * @param et 数据对象
     * @param index 属性标识
     * @return
     * @throws Exception
     */
    private static Object get(OrgSectorBase et,int index) throws Exception {

        switch(index) {
        case INDEX_BIZCODE:
            return et.getBizCode();
        case INDEX_CREATEDATE:
            return et.getCreateDate();
        case INDEX_CREATEMAN:
            return et.getCreateMan();
        case INDEX_LEVELCODE:
            return et.getLevelCode();
        case INDEX_MEMO:
            return et.getMemo();
        case INDEX_ORDERVALUE:
            return et.getOrderValue();
        case INDEX_ORGCODE:
            return et.getOrgCode();
        case INDEX_ORGID:
            return et.getOrgId();
        case INDEX_ORGNAME:
            return et.getOrgName();
        case INDEX_ORGSECTORID:
            return et.getOrgSectorId();
        case INDEX_ORGSECTORNAME:
            return et.getOrgSectorName();
        case INDEX_PORGSECTORID:
            return et.getPOrgSectorId();
        case INDEX_PORGSECTORNAME:
            return et.getPOrgSectorName();
        case INDEX_REPORGSECTORID:
            return et.getRepOrgSectorId();
        case INDEX_REPORGSECTORNAME:
            return et.getRepOrgSectorName();
        case INDEX_RESERVER:
            return et.getReserver();
        case INDEX_RESERVER10:
            return et.getReserver10();
        case INDEX_RESERVER11:
            return et.getReserver11();
        case INDEX_RESERVER12:
            return et.getReserver12();
        case INDEX_RESERVER13:
            return et.getReserver13();
        case INDEX_RESERVER14:
            return et.getReserver14();
        case INDEX_RESERVER15:
            return et.getReserver15();
        case INDEX_RESERVER16:
            return et.getReserver16();
        case INDEX_RESERVER17:
            return et.getReserver17();
        case INDEX_RESERVER18:
            return et.getReserver18();
        case INDEX_RESERVER19:
            return et.getReserver19();
        case INDEX_RESERVER2:
            return et.getReserver2();
        case INDEX_RESERVER20:
            return et.getReserver20();
        case INDEX_RESERVER21:
            return et.getReserver21();
        case INDEX_RESERVER22:
            return et.getReserver22();
        case INDEX_RESERVER23:
            return et.getReserver23();
        case INDEX_RESERVER24:
            return et.getReserver24();
        case INDEX_RESERVER25:
            return et.getReserver25();
        case INDEX_RESERVER26:
            return et.getReserver26();
        case INDEX_RESERVER27:
            return et.getReserver27();
        case INDEX_RESERVER28:
            return et.getReserver28();
        case INDEX_RESERVER29:
            return et.getReserver29();
        case INDEX_RESERVER3:
            return et.getReserver3();
        case INDEX_RESERVER30:
            return et.getReserver30();
        case INDEX_RESERVER4:
            return et.getReserver4();
        case INDEX_RESERVER5:
            return et.getReserver5();
        case INDEX_RESERVER6:
            return et.getReserver6();
        case INDEX_RESERVER7:
            return et.getReserver7();
        case INDEX_RESERVER8:
            return et.getReserver8();
        case INDEX_RESERVER9:
            return et.getReserver9();
        case INDEX_SHORTNAME:
            return et.getShortName();
        case INDEX_UPDATEDATE:
            return et.getUpdateDate();
        case INDEX_UPDATEMAN:
            return et.getUpdateMan();
        case INDEX_USERDATA:
            return et.getUserData();
        case INDEX_USERDATA2:
            return et.getUserData2();
        case INDEX_VALIDFLAG:
            return et.getValidFlag();
        case INDEX_VIRTUALFLAG:
            return et.getVirtualFlag();
        default:
            throw new Exception("不明属性标识");
        }
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.data.DataObject#set(java.lang.String, java.lang.Object)
     */
    @Override
    public void set(String strParamName,Object objValue) throws Exception {
        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().set(strParamName,objValue);
            return;
        }
        if(StringHelper.isNullOrEmpty(strParamName))
            throw new Exception("没有指定属性");

        Integer index=fieldIndexMap.get(strParamName.toUpperCase());
        if(index==null) {
            super.set(strParamName,objValue);
            return;
        }

        OrgSectorBase.set(this,index,objValue);
    }

    /**
     * 通过属性标识设定属性值
     * @param et 数据对象
     * @param index 属性标识
     * @param obj 值
     * @throws Exception
     */
    private static void set(OrgSectorBase et,int index,Object obj) throws Exception {
        switch(index) {
        case INDEX_BIZCODE:
            et.setBizCode(DataObject.getStringValue(obj));
            return ;
        case INDEX_CREATEDATE:
            et.setCreateDate(DataObject.getTimestampValue(obj));
            return ;
        case INDEX_CREATEMAN:
            et.setCreateMan(DataObject.getStringValue(obj));
            return ;
        case INDEX_LEVELCODE:
            et.setLevelCode(DataObject.getStringValue(obj));
            return ;
        case INDEX_MEMO:
            et.setMemo(DataObject.getStringValue(obj));
            return ;
        case INDEX_ORDERVALUE:
            et.setOrderValue(DataObject.getIntegerValue(obj));
            return ;
        case INDEX_ORGCODE:
            et.setOrgCode(DataObject.getStringValue(obj));
            return ;
        case INDEX_ORGID:
            et.setOrgId(DataObject.getStringValue(obj));
            return ;
        case INDEX_ORGNAME:
            et.setOrgName(DataObject.getStringValue(obj));
            return ;
        case INDEX_ORGSECTORID:
            et.setOrgSectorId(DataObject.getStringValue(obj));
            return ;
        case INDEX_ORGSECTORNAME:
            et.setOrgSectorName(DataObject.getStringValue(obj));
            return ;
        case INDEX_PORGSECTORID:
            et.setPOrgSectorId(DataObject.getStringValue(obj));
            return ;
        case INDEX_PORGSECTORNAME:
            et.setPOrgSectorName(DataObject.getStringValue(obj));
            return ;
        case INDEX_REPORGSECTORID:
            et.setRepOrgSectorId(DataObject.getStringValue(obj));
            return ;
        case INDEX_REPORGSECTORNAME:
            et.setRepOrgSectorName(DataObject.getStringValue(obj));
            return ;
        case INDEX_RESERVER:
            et.setReserver(DataObject.getStringValue(obj));
            return ;
        case INDEX_RESERVER10:
            et.setReserver10(DataObject.getStringValue(obj));
            return ;
        case INDEX_RESERVER11:
            et.setReserver11(DataObject.getIntegerValue(obj));
            return ;
        case INDEX_RESERVER12:
            et.setReserver12(DataObject.getIntegerValue(obj));
            return ;
        case INDEX_RESERVER13:
            et.setReserver13(DataObject.getIntegerValue(obj));
            return ;
        case INDEX_RESERVER14:
            et.setReserver14(DataObject.getIntegerValue(obj));
            return ;
        case INDEX_RESERVER15:
            et.setReserver15(DataObject.getDoubleValue(obj));
            return ;
        case INDEX_RESERVER16:
            et.setReserver16(DataObject.getDoubleValue(obj));
            return ;
        case INDEX_RESERVER17:
            et.setReserver17(DataObject.getDoubleValue(obj));
            return ;
        case INDEX_RESERVER18:
            et.setReserver18(DataObject.getDoubleValue(obj));
            return ;
        case INDEX_RESERVER19:
            et.setReserver19(DataObject.getTimestampValue(obj));
            return ;
        case INDEX_RESERVER2:
            et.setReserver2(DataObject.getStringValue(obj));
            return ;
        case INDEX_RESERVER20:
            et.setReserver20(DataObject.getTimestampValue(obj));
            return ;
        case INDEX_RESERVER21:
            et.setReserver21(DataObject.getTimestampValue(obj));
            return ;
        case INDEX_RESERVER22:
            et.setReserver22(DataObject.getTimestampValue(obj));
            return ;
        case INDEX_RESERVER23:
            et.setReserver23(DataObject.getStringValue(obj));
            return ;
        case INDEX_RESERVER24:
            et.setReserver24(DataObject.getStringValue(obj));
            return ;
        case INDEX_RESERVER25:
            et.setReserver25(DataObject.getStringValue(obj));
            return ;
        case INDEX_RESERVER26:
            et.setReserver26(DataObject.getStringValue(obj));
            return ;
        case INDEX_RESERVER27:
            et.setReserver27(DataObject.getStringValue(obj));
            return ;
        case INDEX_RESERVER28:
            et.setReserver28(DataObject.getStringValue(obj));
            return ;
        case INDEX_RESERVER29:
            et.setReserver29(DataObject.getStringValue(obj));
            return ;
        case INDEX_RESERVER3:
            et.setReserver3(DataObject.getStringValue(obj));
            return ;
        case INDEX_RESERVER30:
            et.setReserver30(DataObject.getStringValue(obj));
            return ;
        case INDEX_RESERVER4:
            et.setReserver4(DataObject.getStringValue(obj));
            return ;
        case INDEX_RESERVER5:
            et.setReserver5(DataObject.getStringValue(obj));
            return ;
        case INDEX_RESERVER6:
            et.setReserver6(DataObject.getStringValue(obj));
            return ;
        case INDEX_RESERVER7:
            et.setReserver7(DataObject.getStringValue(obj));
            return ;
        case INDEX_RESERVER8:
            et.setReserver8(DataObject.getStringValue(obj));
            return ;
        case INDEX_RESERVER9:
            et.setReserver9(DataObject.getStringValue(obj));
            return ;
        case INDEX_SHORTNAME:
            et.setShortName(DataObject.getStringValue(obj));
            return ;
        case INDEX_UPDATEDATE:
            et.setUpdateDate(DataObject.getTimestampValue(obj));
            return ;
        case INDEX_UPDATEMAN:
            et.setUpdateMan(DataObject.getStringValue(obj));
            return ;
        case INDEX_USERDATA:
            et.setUserData(DataObject.getStringValue(obj));
            return ;
        case INDEX_USERDATA2:
            et.setUserData2(DataObject.getStringValue(obj));
            return ;
        case INDEX_VALIDFLAG:
            et.setValidFlag(DataObject.getIntegerValue(obj));
            return ;
        case INDEX_VIRTUALFLAG:
            et.setVirtualFlag(DataObject.getIntegerValue(obj));
            return ;
        default:
            throw new Exception("不明属性标识");
        }
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.data.DataObject#isNull(java.lang.String)
     */
    @Override
    public boolean isNull(String strParamName) throws Exception {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isNull(strParamName);
        }
        if(StringHelper.isNullOrEmpty(strParamName))
            throw new Exception("没有指定属性");

        Integer index=fieldIndexMap.get(strParamName.toUpperCase());
        if(index==null)
            return super.isNull(strParamName);

        return  OrgSectorBase.isNull(this, index);
    }

    /**
     * 判断指定属性值是否为空值
     * @param et
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean isNull(OrgSectorBase et,int index) throws Exception {

        switch(index) {
        case INDEX_BIZCODE:
            return et.getBizCode()==null;
        case INDEX_CREATEDATE:
            return et.getCreateDate()==null;
        case INDEX_CREATEMAN:
            return et.getCreateMan()==null;
        case INDEX_LEVELCODE:
            return et.getLevelCode()==null;
        case INDEX_MEMO:
            return et.getMemo()==null;
        case INDEX_ORDERVALUE:
            return et.getOrderValue()==null;
        case INDEX_ORGCODE:
            return et.getOrgCode()==null;
        case INDEX_ORGID:
            return et.getOrgId()==null;
        case INDEX_ORGNAME:
            return et.getOrgName()==null;
        case INDEX_ORGSECTORID:
            return et.getOrgSectorId()==null;
        case INDEX_ORGSECTORNAME:
            return et.getOrgSectorName()==null;
        case INDEX_PORGSECTORID:
            return et.getPOrgSectorId()==null;
        case INDEX_PORGSECTORNAME:
            return et.getPOrgSectorName()==null;
        case INDEX_REPORGSECTORID:
            return et.getRepOrgSectorId()==null;
        case INDEX_REPORGSECTORNAME:
            return et.getRepOrgSectorName()==null;
        case INDEX_RESERVER:
            return et.getReserver()==null;
        case INDEX_RESERVER10:
            return et.getReserver10()==null;
        case INDEX_RESERVER11:
            return et.getReserver11()==null;
        case INDEX_RESERVER12:
            return et.getReserver12()==null;
        case INDEX_RESERVER13:
            return et.getReserver13()==null;
        case INDEX_RESERVER14:
            return et.getReserver14()==null;
        case INDEX_RESERVER15:
            return et.getReserver15()==null;
        case INDEX_RESERVER16:
            return et.getReserver16()==null;
        case INDEX_RESERVER17:
            return et.getReserver17()==null;
        case INDEX_RESERVER18:
            return et.getReserver18()==null;
        case INDEX_RESERVER19:
            return et.getReserver19()==null;
        case INDEX_RESERVER2:
            return et.getReserver2()==null;
        case INDEX_RESERVER20:
            return et.getReserver20()==null;
        case INDEX_RESERVER21:
            return et.getReserver21()==null;
        case INDEX_RESERVER22:
            return et.getReserver22()==null;
        case INDEX_RESERVER23:
            return et.getReserver23()==null;
        case INDEX_RESERVER24:
            return et.getReserver24()==null;
        case INDEX_RESERVER25:
            return et.getReserver25()==null;
        case INDEX_RESERVER26:
            return et.getReserver26()==null;
        case INDEX_RESERVER27:
            return et.getReserver27()==null;
        case INDEX_RESERVER28:
            return et.getReserver28()==null;
        case INDEX_RESERVER29:
            return et.getReserver29()==null;
        case INDEX_RESERVER3:
            return et.getReserver3()==null;
        case INDEX_RESERVER30:
            return et.getReserver30()==null;
        case INDEX_RESERVER4:
            return et.getReserver4()==null;
        case INDEX_RESERVER5:
            return et.getReserver5()==null;
        case INDEX_RESERVER6:
            return et.getReserver6()==null;
        case INDEX_RESERVER7:
            return et.getReserver7()==null;
        case INDEX_RESERVER8:
            return et.getReserver8()==null;
        case INDEX_RESERVER9:
            return et.getReserver9()==null;
        case INDEX_SHORTNAME:
            return et.getShortName()==null;
        case INDEX_UPDATEDATE:
            return et.getUpdateDate()==null;
        case INDEX_UPDATEMAN:
            return et.getUpdateMan()==null;
        case INDEX_USERDATA:
            return et.getUserData()==null;
        case INDEX_USERDATA2:
            return et.getUserData2()==null;
        case INDEX_VALIDFLAG:
            return et.getValidFlag()==null;
        case INDEX_VIRTUALFLAG:
            return et.getVirtualFlag()==null;
        default:
            throw new Exception("不明属性标识");
        }
    }


    /* (non-Javadoc)
     * @see net.ibizsys.paas.data.DataObject#contains(java.lang.String)
     */
    @Override
    public boolean contains(String strParamName) throws Exception {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().contains(strParamName);
        }
        if(StringHelper.isNullOrEmpty(strParamName))
            throw new Exception("没有指定属性");
        Integer index=fieldIndexMap.get(strParamName.toUpperCase());
        if(index==null)
            return super.contains(strParamName);
        return  OrgSectorBase.contains(this, index);
    }

    /**
     * 获取判断对象是否存在指定属性值
     * @param et
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean contains(OrgSectorBase et,int index) throws Exception {

        switch(index) {
        case INDEX_BIZCODE:
            return et.isBizCodeDirty();
        case INDEX_CREATEDATE:
            return et.isCreateDateDirty();
        case INDEX_CREATEMAN:
            return et.isCreateManDirty();
        case INDEX_LEVELCODE:
            return et.isLevelCodeDirty();
        case INDEX_MEMO:
            return et.isMemoDirty();
        case INDEX_ORDERVALUE:
            return et.isOrderValueDirty();
        case INDEX_ORGCODE:
            return et.isOrgCodeDirty();
        case INDEX_ORGID:
            return et.isOrgIdDirty();
        case INDEX_ORGNAME:
            return et.isOrgNameDirty();
        case INDEX_ORGSECTORID:
            return et.isOrgSectorIdDirty();
        case INDEX_ORGSECTORNAME:
            return et.isOrgSectorNameDirty();
        case INDEX_PORGSECTORID:
            return et.isPOrgSectorIdDirty();
        case INDEX_PORGSECTORNAME:
            return et.isPOrgSectorNameDirty();
        case INDEX_REPORGSECTORID:
            return et.isRepOrgSectorIdDirty();
        case INDEX_REPORGSECTORNAME:
            return et.isRepOrgSectorNameDirty();
        case INDEX_RESERVER:
            return et.isReserverDirty();
        case INDEX_RESERVER10:
            return et.isReserver10Dirty();
        case INDEX_RESERVER11:
            return et.isReserver11Dirty();
        case INDEX_RESERVER12:
            return et.isReserver12Dirty();
        case INDEX_RESERVER13:
            return et.isReserver13Dirty();
        case INDEX_RESERVER14:
            return et.isReserver14Dirty();
        case INDEX_RESERVER15:
            return et.isReserver15Dirty();
        case INDEX_RESERVER16:
            return et.isReserver16Dirty();
        case INDEX_RESERVER17:
            return et.isReserver17Dirty();
        case INDEX_RESERVER18:
            return et.isReserver18Dirty();
        case INDEX_RESERVER19:
            return et.isReserver19Dirty();
        case INDEX_RESERVER2:
            return et.isReserver2Dirty();
        case INDEX_RESERVER20:
            return et.isReserver20Dirty();
        case INDEX_RESERVER21:
            return et.isReserver21Dirty();
        case INDEX_RESERVER22:
            return et.isReserver22Dirty();
        case INDEX_RESERVER23:
            return et.isReserver23Dirty();
        case INDEX_RESERVER24:
            return et.isReserver24Dirty();
        case INDEX_RESERVER25:
            return et.isReserver25Dirty();
        case INDEX_RESERVER26:
            return et.isReserver26Dirty();
        case INDEX_RESERVER27:
            return et.isReserver27Dirty();
        case INDEX_RESERVER28:
            return et.isReserver28Dirty();
        case INDEX_RESERVER29:
            return et.isReserver29Dirty();
        case INDEX_RESERVER3:
            return et.isReserver3Dirty();
        case INDEX_RESERVER30:
            return et.isReserver30Dirty();
        case INDEX_RESERVER4:
            return et.isReserver4Dirty();
        case INDEX_RESERVER5:
            return et.isReserver5Dirty();
        case INDEX_RESERVER6:
            return et.isReserver6Dirty();
        case INDEX_RESERVER7:
            return et.isReserver7Dirty();
        case INDEX_RESERVER8:
            return et.isReserver8Dirty();
        case INDEX_RESERVER9:
            return et.isReserver9Dirty();
        case INDEX_SHORTNAME:
            return et.isShortNameDirty();
        case INDEX_UPDATEDATE:
            return et.isUpdateDateDirty();
        case INDEX_UPDATEMAN:
            return et.isUpdateManDirty();
        case INDEX_USERDATA:
            return et.isUserDataDirty();
        case INDEX_USERDATA2:
            return et.isUserData2Dirty();
        case INDEX_VALIDFLAG:
            return et.isValidFlagDirty();
        case INDEX_VIRTUALFLAG:
            return et.isVirtualFlagDirty();
        default:
            throw new Exception("不明属性标识");
        }
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.data.DataObject#onFillJSONObject(net.sf.json.JSONObject, boolean)
     */
    @Override
    protected void onFillJSONObject(JSONObject objJSON, boolean bIncludeEmpty) throws Exception {
        fillJSONObject(this,objJSON,bIncludeEmpty);
        super.onFillJSONObject(objJSON, bIncludeEmpty);
    }

    /**
     * 填充当前对象到JSON
     * @param et 当前数据对象
     * @param json JSON对象
     * @param bIncEmpty 是否包括空值
     * @throws Exception
     */
    private static  void fillJSONObject(OrgSectorBase et,JSONObject json, boolean bIncEmpty) throws Exception {
        if(bIncEmpty||et.getBizCode()!=null) {
            JSONObjectHelper.put(json,"bizcode",getJSONValue(et.getBizCode()),false);
        }
        if(bIncEmpty||et.getCreateDate()!=null) {
            JSONObjectHelper.put(json,"createdate",getJSONValue(et.getCreateDate()),false);
        }
        if(bIncEmpty||et.getCreateMan()!=null) {
            JSONObjectHelper.put(json,"createman",getJSONValue(et.getCreateMan()),false);
        }
        if(bIncEmpty||et.getLevelCode()!=null) {
            JSONObjectHelper.put(json,"levelcode",getJSONValue(et.getLevelCode()),false);
        }
        if(bIncEmpty||et.getMemo()!=null) {
            JSONObjectHelper.put(json,"memo",getJSONValue(et.getMemo()),false);
        }
        if(bIncEmpty||et.getOrderValue()!=null) {
            JSONObjectHelper.put(json,"ordervalue",getJSONValue(et.getOrderValue()),false);
        }
        if(bIncEmpty||et.getOrgCode()!=null) {
            JSONObjectHelper.put(json,"orgcode",getJSONValue(et.getOrgCode()),false);
        }
        if(bIncEmpty||et.getOrgId()!=null) {
            JSONObjectHelper.put(json,"orgid",getJSONValue(et.getOrgId()),false);
        }
        if(bIncEmpty||et.getOrgName()!=null) {
            JSONObjectHelper.put(json,"orgname",getJSONValue(et.getOrgName()),false);
        }
        if(bIncEmpty||et.getOrgSectorId()!=null) {
            JSONObjectHelper.put(json,"orgsectorid",getJSONValue(et.getOrgSectorId()),false);
        }
        if(bIncEmpty||et.getOrgSectorName()!=null) {
            JSONObjectHelper.put(json,"orgsectorname",getJSONValue(et.getOrgSectorName()),false);
        }
        if(bIncEmpty||et.getPOrgSectorId()!=null) {
            JSONObjectHelper.put(json,"porgsectorid",getJSONValue(et.getPOrgSectorId()),false);
        }
        if(bIncEmpty||et.getPOrgSectorName()!=null) {
            JSONObjectHelper.put(json,"porgsectorname",getJSONValue(et.getPOrgSectorName()),false);
        }
        if(bIncEmpty||et.getRepOrgSectorId()!=null) {
            JSONObjectHelper.put(json,"reporgsectorid",getJSONValue(et.getRepOrgSectorId()),false);
        }
        if(bIncEmpty||et.getRepOrgSectorName()!=null) {
            JSONObjectHelper.put(json,"reporgsectorname",getJSONValue(et.getRepOrgSectorName()),false);
        }
        if(bIncEmpty||et.getReserver()!=null) {
            JSONObjectHelper.put(json,"reserver",getJSONValue(et.getReserver()),false);
        }
        if(bIncEmpty||et.getReserver10()!=null) {
            JSONObjectHelper.put(json,"reserver10",getJSONValue(et.getReserver10()),false);
        }
        if(bIncEmpty||et.getReserver11()!=null) {
            JSONObjectHelper.put(json,"reserver11",getJSONValue(et.getReserver11()),false);
        }
        if(bIncEmpty||et.getReserver12()!=null) {
            JSONObjectHelper.put(json,"reserver12",getJSONValue(et.getReserver12()),false);
        }
        if(bIncEmpty||et.getReserver13()!=null) {
            JSONObjectHelper.put(json,"reserver13",getJSONValue(et.getReserver13()),false);
        }
        if(bIncEmpty||et.getReserver14()!=null) {
            JSONObjectHelper.put(json,"reserver14",getJSONValue(et.getReserver14()),false);
        }
        if(bIncEmpty||et.getReserver15()!=null) {
            JSONObjectHelper.put(json,"reserver15",getJSONValue(et.getReserver15()),false);
        }
        if(bIncEmpty||et.getReserver16()!=null) {
            JSONObjectHelper.put(json,"reserver16",getJSONValue(et.getReserver16()),false);
        }
        if(bIncEmpty||et.getReserver17()!=null) {
            JSONObjectHelper.put(json,"reserver17",getJSONValue(et.getReserver17()),false);
        }
        if(bIncEmpty||et.getReserver18()!=null) {
            JSONObjectHelper.put(json,"reserver18",getJSONValue(et.getReserver18()),false);
        }
        if(bIncEmpty||et.getReserver19()!=null) {
            JSONObjectHelper.put(json,"reserver19",getJSONValue(et.getReserver19()),false);
        }
        if(bIncEmpty||et.getReserver2()!=null) {
            JSONObjectHelper.put(json,"reserver2",getJSONValue(et.getReserver2()),false);
        }
        if(bIncEmpty||et.getReserver20()!=null) {
            JSONObjectHelper.put(json,"reserver20",getJSONValue(et.getReserver20()),false);
        }
        if(bIncEmpty||et.getReserver21()!=null) {
            JSONObjectHelper.put(json,"reserver21",getJSONValue(et.getReserver21()),false);
        }
        if(bIncEmpty||et.getReserver22()!=null) {
            JSONObjectHelper.put(json,"reserver22",getJSONValue(et.getReserver22()),false);
        }
        if(bIncEmpty||et.getReserver23()!=null) {
            JSONObjectHelper.put(json,"reserver23",getJSONValue(et.getReserver23()),false);
        }
        if(bIncEmpty||et.getReserver24()!=null) {
            JSONObjectHelper.put(json,"reserver24",getJSONValue(et.getReserver24()),false);
        }
        if(bIncEmpty||et.getReserver25()!=null) {
            JSONObjectHelper.put(json,"reserver25",getJSONValue(et.getReserver25()),false);
        }
        if(bIncEmpty||et.getReserver26()!=null) {
            JSONObjectHelper.put(json,"reserver26",getJSONValue(et.getReserver26()),false);
        }
        if(bIncEmpty||et.getReserver27()!=null) {
            JSONObjectHelper.put(json,"reserver27",getJSONValue(et.getReserver27()),false);
        }
        if(bIncEmpty||et.getReserver28()!=null) {
            JSONObjectHelper.put(json,"reserver28",getJSONValue(et.getReserver28()),false);
        }
        if(bIncEmpty||et.getReserver29()!=null) {
            JSONObjectHelper.put(json,"reserver29",getJSONValue(et.getReserver29()),false);
        }
        if(bIncEmpty||et.getReserver3()!=null) {
            JSONObjectHelper.put(json,"reserver3",getJSONValue(et.getReserver3()),false);
        }
        if(bIncEmpty||et.getReserver30()!=null) {
            JSONObjectHelper.put(json,"reserver30",getJSONValue(et.getReserver30()),false);
        }
        if(bIncEmpty||et.getReserver4()!=null) {
            JSONObjectHelper.put(json,"reserver4",getJSONValue(et.getReserver4()),false);
        }
        if(bIncEmpty||et.getReserver5()!=null) {
            JSONObjectHelper.put(json,"reserver5",getJSONValue(et.getReserver5()),false);
        }
        if(bIncEmpty||et.getReserver6()!=null) {
            JSONObjectHelper.put(json,"reserver6",getJSONValue(et.getReserver6()),false);
        }
        if(bIncEmpty||et.getReserver7()!=null) {
            JSONObjectHelper.put(json,"reserver7",getJSONValue(et.getReserver7()),false);
        }
        if(bIncEmpty||et.getReserver8()!=null) {
            JSONObjectHelper.put(json,"reserver8",getJSONValue(et.getReserver8()),false);
        }
        if(bIncEmpty||et.getReserver9()!=null) {
            JSONObjectHelper.put(json,"reserver9",getJSONValue(et.getReserver9()),false);
        }
        if(bIncEmpty||et.getShortName()!=null) {
            JSONObjectHelper.put(json,"shortname",getJSONValue(et.getShortName()),false);
        }
        if(bIncEmpty||et.getUpdateDate()!=null) {
            JSONObjectHelper.put(json,"updatedate",getJSONValue(et.getUpdateDate()),false);
        }
        if(bIncEmpty||et.getUpdateMan()!=null) {
            JSONObjectHelper.put(json,"updateman",getJSONValue(et.getUpdateMan()),false);
        }
        if(bIncEmpty||et.getUserData()!=null) {
            JSONObjectHelper.put(json,"userdata",getJSONValue(et.getUserData()),false);
        }
        if(bIncEmpty||et.getUserData2()!=null) {
            JSONObjectHelper.put(json,"userdata2",getJSONValue(et.getUserData2()),false);
        }
        if(bIncEmpty||et.getValidFlag()!=null) {
            JSONObjectHelper.put(json,"validflag",getJSONValue(et.getValidFlag()),false);
        }
        if(bIncEmpty||et.getVirtualFlag()!=null) {
            JSONObjectHelper.put(json,"virtualflag",getJSONValue(et.getVirtualFlag()),false);
        }
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.data.DataObject#onFillXmlNode(net.ibizsys.paas.xml.XmlNode, boolean)
     */
    @Override
    protected void onFillXmlNode(XmlNode xmlNode,boolean bIncludeEmpty) throws Exception {
        fillXmlNode(this,xmlNode,bIncludeEmpty);
        super.onFillXmlNode(xmlNode, bIncludeEmpty);
    }

    /**
     * 填充当前对象到Xml节点中
     * @param et 当前数据对象
     * @param node Xml节点
     * @param bIncEmpty 是否包括空值
     * @throws Exception
     */
    private static void fillXmlNode(OrgSectorBase et,XmlNode node,boolean bIncEmpty) throws Exception {
        if(bIncEmpty||et.getBizCode()!=null) {
            Object obj = et.getBizCode();
            node.setAttribute("BIZCODE",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getCreateDate()!=null) {
            Object obj = et.getCreateDate();
            node.setAttribute("CREATEDATE",(obj==null)?"":StringHelper.format("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS",obj));
        }
        if(bIncEmpty||et.getCreateMan()!=null) {
            Object obj = et.getCreateMan();
            node.setAttribute("CREATEMAN",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getLevelCode()!=null) {
            Object obj = et.getLevelCode();
            node.setAttribute("LEVELCODE",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getMemo()!=null) {
            Object obj = et.getMemo();
            node.setAttribute("MEMO",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getOrderValue()!=null) {
            Object obj = et.getOrderValue();
            node.setAttribute("ORDERVALUE",(obj==null)?"":StringHelper.format("%1$s",obj));
        }
        if(bIncEmpty||et.getOrgCode()!=null) {
            Object obj = et.getOrgCode();
            node.setAttribute("ORGCODE",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getOrgId()!=null) {
            Object obj = et.getOrgId();
            node.setAttribute("ORGID",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getOrgName()!=null) {
            Object obj = et.getOrgName();
            node.setAttribute("ORGNAME",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getOrgSectorId()!=null) {
            Object obj = et.getOrgSectorId();
            node.setAttribute("ORGSECTORID",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getOrgSectorName()!=null) {
            Object obj = et.getOrgSectorName();
            node.setAttribute("ORGSECTORNAME",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getPOrgSectorId()!=null) {
            Object obj = et.getPOrgSectorId();
            node.setAttribute("PORGSECTORID",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getPOrgSectorName()!=null) {
            Object obj = et.getPOrgSectorName();
            node.setAttribute("PORGSECTORNAME",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getRepOrgSectorId()!=null) {
            Object obj = et.getRepOrgSectorId();
            node.setAttribute("REPORGSECTORID",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getRepOrgSectorName()!=null) {
            Object obj = et.getRepOrgSectorName();
            node.setAttribute("REPORGSECTORNAME",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getReserver()!=null) {
            Object obj = et.getReserver();
            node.setAttribute("RESERVER",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getReserver10()!=null) {
            Object obj = et.getReserver10();
            node.setAttribute("RESERVER10",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getReserver11()!=null) {
            Object obj = et.getReserver11();
            node.setAttribute("RESERVER11",(obj==null)?"":StringHelper.format("%1$s",obj));
        }
        if(bIncEmpty||et.getReserver12()!=null) {
            Object obj = et.getReserver12();
            node.setAttribute("RESERVER12",(obj==null)?"":StringHelper.format("%1$s",obj));
        }
        if(bIncEmpty||et.getReserver13()!=null) {
            Object obj = et.getReserver13();
            node.setAttribute("RESERVER13",(obj==null)?"":StringHelper.format("%1$s",obj));
        }
        if(bIncEmpty||et.getReserver14()!=null) {
            Object obj = et.getReserver14();
            node.setAttribute("RESERVER14",(obj==null)?"":StringHelper.format("%1$s",obj));
        }
        if(bIncEmpty||et.getReserver15()!=null) {
            Object obj = et.getReserver15();
            node.setAttribute("RESERVER15",(obj==null)?"":StringHelper.format("%1$s",obj));
        }
        if(bIncEmpty||et.getReserver16()!=null) {
            Object obj = et.getReserver16();
            node.setAttribute("RESERVER16",(obj==null)?"":StringHelper.format("%1$s",obj));
        }
        if(bIncEmpty||et.getReserver17()!=null) {
            Object obj = et.getReserver17();
            node.setAttribute("RESERVER17",(obj==null)?"":StringHelper.format("%1$s",obj));
        }
        if(bIncEmpty||et.getReserver18()!=null) {
            Object obj = et.getReserver18();
            node.setAttribute("RESERVER18",(obj==null)?"":StringHelper.format("%1$s",obj));
        }
        if(bIncEmpty||et.getReserver19()!=null) {
            Object obj = et.getReserver19();
            node.setAttribute("RESERVER19",(obj==null)?"":StringHelper.format("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS",obj));
        }
        if(bIncEmpty||et.getReserver2()!=null) {
            Object obj = et.getReserver2();
            node.setAttribute("RESERVER2",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getReserver20()!=null) {
            Object obj = et.getReserver20();
            node.setAttribute("RESERVER20",(obj==null)?"":StringHelper.format("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS",obj));
        }
        if(bIncEmpty||et.getReserver21()!=null) {
            Object obj = et.getReserver21();
            node.setAttribute("RESERVER21",(obj==null)?"":StringHelper.format("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS",obj));
        }
        if(bIncEmpty||et.getReserver22()!=null) {
            Object obj = et.getReserver22();
            node.setAttribute("RESERVER22",(obj==null)?"":StringHelper.format("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS",obj));
        }
        if(bIncEmpty||et.getReserver23()!=null) {
            Object obj = et.getReserver23();
            node.setAttribute("RESERVER23",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getReserver24()!=null) {
            Object obj = et.getReserver24();
            node.setAttribute("RESERVER24",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getReserver25()!=null) {
            Object obj = et.getReserver25();
            node.setAttribute("RESERVER25",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getReserver26()!=null) {
            Object obj = et.getReserver26();
            node.setAttribute("RESERVER26",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getReserver27()!=null) {
            Object obj = et.getReserver27();
            node.setAttribute("RESERVER27",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getReserver28()!=null) {
            Object obj = et.getReserver28();
            node.setAttribute("RESERVER28",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getReserver29()!=null) {
            Object obj = et.getReserver29();
            node.setAttribute("RESERVER29",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getReserver3()!=null) {
            Object obj = et.getReserver3();
            node.setAttribute("RESERVER3",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getReserver30()!=null) {
            Object obj = et.getReserver30();
            node.setAttribute("RESERVER30",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getReserver4()!=null) {
            Object obj = et.getReserver4();
            node.setAttribute("RESERVER4",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getReserver5()!=null) {
            Object obj = et.getReserver5();
            node.setAttribute("RESERVER5",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getReserver6()!=null) {
            Object obj = et.getReserver6();
            node.setAttribute("RESERVER6",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getReserver7()!=null) {
            Object obj = et.getReserver7();
            node.setAttribute("RESERVER7",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getReserver8()!=null) {
            Object obj = et.getReserver8();
            node.setAttribute("RESERVER8",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getReserver9()!=null) {
            Object obj = et.getReserver9();
            node.setAttribute("RESERVER9",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getShortName()!=null) {
            Object obj = et.getShortName();
            node.setAttribute("SHORTNAME",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getUpdateDate()!=null) {
            Object obj = et.getUpdateDate();
            node.setAttribute("UPDATEDATE",(obj==null)?"":StringHelper.format("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS",obj));
        }
        if(bIncEmpty||et.getUpdateMan()!=null) {
            Object obj = et.getUpdateMan();
            node.setAttribute("UPDATEMAN",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getUserData()!=null) {
            Object obj = et.getUserData();
            node.setAttribute("USERDATA",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getUserData2()!=null) {
            Object obj = et.getUserData2();
            node.setAttribute("USERDATA2",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getValidFlag()!=null) {
            Object obj = et.getValidFlag();
            node.setAttribute("VALIDFLAG",(obj==null)?"":StringHelper.format("%1$s",obj));
        }
        if(bIncEmpty||et.getVirtualFlag()!=null) {
            Object obj = et.getVirtualFlag();
            node.setAttribute("VIRTUALFLAG",(obj==null)?"":StringHelper.format("%1$s",obj));
        }


    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onCopyTo(net.ibizsys.paas.data.IDataObject, boolean)
     */
    @Override
    protected void onCopyTo(IDataObject dataEntity, boolean bIncludeEmtpy) throws Exception {
        OrgSectorBase.copyTo(this,dataEntity,bIncludeEmtpy);
        super.onCopyTo(dataEntity,bIncludeEmtpy);
    }

    /**
     * 复制当前对象数据到目标对象
     * @param et 当前数据对象
     * @param dst 目标数据对象
     * @param bIncEmpty 是否包括空值
     * @throws Exception
     */
    private static void copyTo(OrgSectorBase et,IDataObject dst,boolean bIncEmpty) throws Exception {
        if(et.isBizCodeDirty() && (bIncEmpty||et.getBizCode()!=null)) {
            dst.set(FIELD_BIZCODE,et.getBizCode());
        }
        if(et.isCreateDateDirty() && (bIncEmpty||et.getCreateDate()!=null)) {
            dst.set(FIELD_CREATEDATE,et.getCreateDate());
        }
        if(et.isCreateManDirty() && (bIncEmpty||et.getCreateMan()!=null)) {
            dst.set(FIELD_CREATEMAN,et.getCreateMan());
        }
        if(et.isLevelCodeDirty() && (bIncEmpty||et.getLevelCode()!=null)) {
            dst.set(FIELD_LEVELCODE,et.getLevelCode());
        }
        if(et.isMemoDirty() && (bIncEmpty||et.getMemo()!=null)) {
            dst.set(FIELD_MEMO,et.getMemo());
        }
        if(et.isOrderValueDirty() && (bIncEmpty||et.getOrderValue()!=null)) {
            dst.set(FIELD_ORDERVALUE,et.getOrderValue());
        }
        if(et.isOrgCodeDirty() && (bIncEmpty||et.getOrgCode()!=null)) {
            dst.set(FIELD_ORGCODE,et.getOrgCode());
        }
        if(et.isOrgIdDirty() && (bIncEmpty||et.getOrgId()!=null)) {
            dst.set(FIELD_ORGID,et.getOrgId());
        }
        if(et.isOrgNameDirty() && (bIncEmpty||et.getOrgName()!=null)) {
            dst.set(FIELD_ORGNAME,et.getOrgName());
        }
        if(et.isOrgSectorIdDirty() && (bIncEmpty||et.getOrgSectorId()!=null)) {
            dst.set(FIELD_ORGSECTORID,et.getOrgSectorId());
        }
        if(et.isOrgSectorNameDirty() && (bIncEmpty||et.getOrgSectorName()!=null)) {
            dst.set(FIELD_ORGSECTORNAME,et.getOrgSectorName());
        }
        if(et.isPOrgSectorIdDirty() && (bIncEmpty||et.getPOrgSectorId()!=null)) {
            dst.set(FIELD_PORGSECTORID,et.getPOrgSectorId());
        }
        if(et.isPOrgSectorNameDirty() && (bIncEmpty||et.getPOrgSectorName()!=null)) {
            dst.set(FIELD_PORGSECTORNAME,et.getPOrgSectorName());
        }
        if(et.isRepOrgSectorIdDirty() && (bIncEmpty||et.getRepOrgSectorId()!=null)) {
            dst.set(FIELD_REPORGSECTORID,et.getRepOrgSectorId());
        }
        if(et.isRepOrgSectorNameDirty() && (bIncEmpty||et.getRepOrgSectorName()!=null)) {
            dst.set(FIELD_REPORGSECTORNAME,et.getRepOrgSectorName());
        }
        if(et.isReserverDirty() && (bIncEmpty||et.getReserver()!=null)) {
            dst.set(FIELD_RESERVER,et.getReserver());
        }
        if(et.isReserver10Dirty() && (bIncEmpty||et.getReserver10()!=null)) {
            dst.set(FIELD_RESERVER10,et.getReserver10());
        }
        if(et.isReserver11Dirty() && (bIncEmpty||et.getReserver11()!=null)) {
            dst.set(FIELD_RESERVER11,et.getReserver11());
        }
        if(et.isReserver12Dirty() && (bIncEmpty||et.getReserver12()!=null)) {
            dst.set(FIELD_RESERVER12,et.getReserver12());
        }
        if(et.isReserver13Dirty() && (bIncEmpty||et.getReserver13()!=null)) {
            dst.set(FIELD_RESERVER13,et.getReserver13());
        }
        if(et.isReserver14Dirty() && (bIncEmpty||et.getReserver14()!=null)) {
            dst.set(FIELD_RESERVER14,et.getReserver14());
        }
        if(et.isReserver15Dirty() && (bIncEmpty||et.getReserver15()!=null)) {
            dst.set(FIELD_RESERVER15,et.getReserver15());
        }
        if(et.isReserver16Dirty() && (bIncEmpty||et.getReserver16()!=null)) {
            dst.set(FIELD_RESERVER16,et.getReserver16());
        }
        if(et.isReserver17Dirty() && (bIncEmpty||et.getReserver17()!=null)) {
            dst.set(FIELD_RESERVER17,et.getReserver17());
        }
        if(et.isReserver18Dirty() && (bIncEmpty||et.getReserver18()!=null)) {
            dst.set(FIELD_RESERVER18,et.getReserver18());
        }
        if(et.isReserver19Dirty() && (bIncEmpty||et.getReserver19()!=null)) {
            dst.set(FIELD_RESERVER19,et.getReserver19());
        }
        if(et.isReserver2Dirty() && (bIncEmpty||et.getReserver2()!=null)) {
            dst.set(FIELD_RESERVER2,et.getReserver2());
        }
        if(et.isReserver20Dirty() && (bIncEmpty||et.getReserver20()!=null)) {
            dst.set(FIELD_RESERVER20,et.getReserver20());
        }
        if(et.isReserver21Dirty() && (bIncEmpty||et.getReserver21()!=null)) {
            dst.set(FIELD_RESERVER21,et.getReserver21());
        }
        if(et.isReserver22Dirty() && (bIncEmpty||et.getReserver22()!=null)) {
            dst.set(FIELD_RESERVER22,et.getReserver22());
        }
        if(et.isReserver23Dirty() && (bIncEmpty||et.getReserver23()!=null)) {
            dst.set(FIELD_RESERVER23,et.getReserver23());
        }
        if(et.isReserver24Dirty() && (bIncEmpty||et.getReserver24()!=null)) {
            dst.set(FIELD_RESERVER24,et.getReserver24());
        }
        if(et.isReserver25Dirty() && (bIncEmpty||et.getReserver25()!=null)) {
            dst.set(FIELD_RESERVER25,et.getReserver25());
        }
        if(et.isReserver26Dirty() && (bIncEmpty||et.getReserver26()!=null)) {
            dst.set(FIELD_RESERVER26,et.getReserver26());
        }
        if(et.isReserver27Dirty() && (bIncEmpty||et.getReserver27()!=null)) {
            dst.set(FIELD_RESERVER27,et.getReserver27());
        }
        if(et.isReserver28Dirty() && (bIncEmpty||et.getReserver28()!=null)) {
            dst.set(FIELD_RESERVER28,et.getReserver28());
        }
        if(et.isReserver29Dirty() && (bIncEmpty||et.getReserver29()!=null)) {
            dst.set(FIELD_RESERVER29,et.getReserver29());
        }
        if(et.isReserver3Dirty() && (bIncEmpty||et.getReserver3()!=null)) {
            dst.set(FIELD_RESERVER3,et.getReserver3());
        }
        if(et.isReserver30Dirty() && (bIncEmpty||et.getReserver30()!=null)) {
            dst.set(FIELD_RESERVER30,et.getReserver30());
        }
        if(et.isReserver4Dirty() && (bIncEmpty||et.getReserver4()!=null)) {
            dst.set(FIELD_RESERVER4,et.getReserver4());
        }
        if(et.isReserver5Dirty() && (bIncEmpty||et.getReserver5()!=null)) {
            dst.set(FIELD_RESERVER5,et.getReserver5());
        }
        if(et.isReserver6Dirty() && (bIncEmpty||et.getReserver6()!=null)) {
            dst.set(FIELD_RESERVER6,et.getReserver6());
        }
        if(et.isReserver7Dirty() && (bIncEmpty||et.getReserver7()!=null)) {
            dst.set(FIELD_RESERVER7,et.getReserver7());
        }
        if(et.isReserver8Dirty() && (bIncEmpty||et.getReserver8()!=null)) {
            dst.set(FIELD_RESERVER8,et.getReserver8());
        }
        if(et.isReserver9Dirty() && (bIncEmpty||et.getReserver9()!=null)) {
            dst.set(FIELD_RESERVER9,et.getReserver9());
        }
        if(et.isShortNameDirty() && (bIncEmpty||et.getShortName()!=null)) {
            dst.set(FIELD_SHORTNAME,et.getShortName());
        }
        if(et.isUpdateDateDirty() && (bIncEmpty||et.getUpdateDate()!=null)) {
            dst.set(FIELD_UPDATEDATE,et.getUpdateDate());
        }
        if(et.isUpdateManDirty() && (bIncEmpty||et.getUpdateMan()!=null)) {
            dst.set(FIELD_UPDATEMAN,et.getUpdateMan());
        }
        if(et.isUserDataDirty() && (bIncEmpty||et.getUserData()!=null)) {
            dst.set(FIELD_USERDATA,et.getUserData());
        }
        if(et.isUserData2Dirty() && (bIncEmpty||et.getUserData2()!=null)) {
            dst.set(FIELD_USERDATA2,et.getUserData2());
        }
        if(et.isValidFlagDirty() && (bIncEmpty||et.getValidFlag()!=null)) {
            dst.set(FIELD_VALIDFLAG,et.getValidFlag());
        }
        if(et.isVirtualFlagDirty() && (bIncEmpty||et.getVirtualFlag()!=null)) {
            dst.set(FIELD_VIRTUALFLAG,et.getVirtualFlag());
        }
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.data.DataObject#remove(java.lang.String)
     */
    @Override
    public boolean remove(String strParamName) throws Exception {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().remove(strParamName);
        }
        if(StringHelper.isNullOrEmpty(strParamName))
            throw new Exception("没有指定属性");
        Integer index=fieldIndexMap.get(strParamName.toUpperCase());
        if(index==null)
            return super.remove(strParamName);
        return  OrgSectorBase.remove(this, index);
    }

    /**
     * 通过属性标识删除属性值
     * @param entity
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean remove(OrgSectorBase et,int index) throws Exception {
        switch(index) {
        case INDEX_BIZCODE:
            et.resetBizCode();
            return true;
        case INDEX_CREATEDATE:
            et.resetCreateDate();
            return true;
        case INDEX_CREATEMAN:
            et.resetCreateMan();
            return true;
        case INDEX_LEVELCODE:
            et.resetLevelCode();
            return true;
        case INDEX_MEMO:
            et.resetMemo();
            return true;
        case INDEX_ORDERVALUE:
            et.resetOrderValue();
            return true;
        case INDEX_ORGCODE:
            et.resetOrgCode();
            return true;
        case INDEX_ORGID:
            et.resetOrgId();
            return true;
        case INDEX_ORGNAME:
            et.resetOrgName();
            return true;
        case INDEX_ORGSECTORID:
            et.resetOrgSectorId();
            return true;
        case INDEX_ORGSECTORNAME:
            et.resetOrgSectorName();
            return true;
        case INDEX_PORGSECTORID:
            et.resetPOrgSectorId();
            return true;
        case INDEX_PORGSECTORNAME:
            et.resetPOrgSectorName();
            return true;
        case INDEX_REPORGSECTORID:
            et.resetRepOrgSectorId();
            return true;
        case INDEX_REPORGSECTORNAME:
            et.resetRepOrgSectorName();
            return true;
        case INDEX_RESERVER:
            et.resetReserver();
            return true;
        case INDEX_RESERVER10:
            et.resetReserver10();
            return true;
        case INDEX_RESERVER11:
            et.resetReserver11();
            return true;
        case INDEX_RESERVER12:
            et.resetReserver12();
            return true;
        case INDEX_RESERVER13:
            et.resetReserver13();
            return true;
        case INDEX_RESERVER14:
            et.resetReserver14();
            return true;
        case INDEX_RESERVER15:
            et.resetReserver15();
            return true;
        case INDEX_RESERVER16:
            et.resetReserver16();
            return true;
        case INDEX_RESERVER17:
            et.resetReserver17();
            return true;
        case INDEX_RESERVER18:
            et.resetReserver18();
            return true;
        case INDEX_RESERVER19:
            et.resetReserver19();
            return true;
        case INDEX_RESERVER2:
            et.resetReserver2();
            return true;
        case INDEX_RESERVER20:
            et.resetReserver20();
            return true;
        case INDEX_RESERVER21:
            et.resetReserver21();
            return true;
        case INDEX_RESERVER22:
            et.resetReserver22();
            return true;
        case INDEX_RESERVER23:
            et.resetReserver23();
            return true;
        case INDEX_RESERVER24:
            et.resetReserver24();
            return true;
        case INDEX_RESERVER25:
            et.resetReserver25();
            return true;
        case INDEX_RESERVER26:
            et.resetReserver26();
            return true;
        case INDEX_RESERVER27:
            et.resetReserver27();
            return true;
        case INDEX_RESERVER28:
            et.resetReserver28();
            return true;
        case INDEX_RESERVER29:
            et.resetReserver29();
            return true;
        case INDEX_RESERVER3:
            et.resetReserver3();
            return true;
        case INDEX_RESERVER30:
            et.resetReserver30();
            return true;
        case INDEX_RESERVER4:
            et.resetReserver4();
            return true;
        case INDEX_RESERVER5:
            et.resetReserver5();
            return true;
        case INDEX_RESERVER6:
            et.resetReserver6();
            return true;
        case INDEX_RESERVER7:
            et.resetReserver7();
            return true;
        case INDEX_RESERVER8:
            et.resetReserver8();
            return true;
        case INDEX_RESERVER9:
            et.resetReserver9();
            return true;
        case INDEX_SHORTNAME:
            et.resetShortName();
            return true;
        case INDEX_UPDATEDATE:
            et.resetUpdateDate();
            return true;
        case INDEX_UPDATEMAN:
            et.resetUpdateMan();
            return true;
        case INDEX_USERDATA:
            et.resetUserData();
            return true;
        case INDEX_USERDATA2:
            et.resetUserData2();
            return true;
        case INDEX_VALIDFLAG:
            et.resetValidFlag();
            return true;
        case INDEX_VIRTUALFLAG:
            et.resetVirtualFlag();
            return true;
        default:
            throw new Exception("不明属性标识");
        }
    }


    private Object objOrgLock = new Object();
    private net.ibizsys.psrt.srv.common.entity.Org org = null;
    /**
    * 获取父数据 组织机构
     * @throws Exception
    */
    public net.ibizsys.psrt.srv.common.entity.Org getOrg() throws Exception {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getOrg();
        }

        if(this.getOrgId()==null)
            return null;
        synchronized(objOrgLock) {
            if(org==null) {
                org = new net.ibizsys.psrt.srv.common.entity.Org();
                org.setOrgId(this.getOrgId());
                net.ibizsys.psrt.srv.common.service.OrgService service = (net.ibizsys.psrt.srv.common.service.OrgService)ServiceGlobal.getService(net.ibizsys.psrt.srv.common.service.OrgService.class,this.getSessionFactory());
                if(this.getOrgId().indexOf(net.ibizsys.paas.service.ServiceBase.TEMPKEY) == 0)
                    service.getTemp(org);
                else
                    service.get(org);
            }
            return org;
        }
    }

    private Object objPOrgSectorLock = new Object();
    private net.ibizsys.psrt.srv.common.entity.OrgSector porgsector = null;
    /**
    * 获取父数据 组织部门
     * @throws Exception
    */
    public net.ibizsys.psrt.srv.common.entity.OrgSector getPOrgSector() throws Exception {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getPOrgSector();
        }

        if(this.getPOrgSectorId()==null)
            return null;
        synchronized(objPOrgSectorLock) {
            if(porgsector==null) {
                porgsector = new net.ibizsys.psrt.srv.common.entity.OrgSector();
                porgsector.setOrgSectorId(this.getPOrgSectorId());
                net.ibizsys.psrt.srv.common.service.OrgSectorService service = (net.ibizsys.psrt.srv.common.service.OrgSectorService)ServiceGlobal.getService(net.ibizsys.psrt.srv.common.service.OrgSectorService.class,this.getSessionFactory());
                if(this.getPOrgSectorId().indexOf(net.ibizsys.paas.service.ServiceBase.TEMPKEY) == 0)
                    service.getTemp(porgsector);
                else
                    service.get(porgsector);
            }
            return porgsector;
        }
    }

    private Object objRepOrgSectorLock = new Object();
    private net.ibizsys.psrt.srv.common.entity.OrgSector reporgsector = null;
    /**
    * 获取父数据 组织部门
     * @throws Exception
    */
    public net.ibizsys.psrt.srv.common.entity.OrgSector getRepOrgSector() throws Exception {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getRepOrgSector();
        }

        if(this.getRepOrgSectorId()==null)
            return null;
        synchronized(objRepOrgSectorLock) {
            if(reporgsector==null) {
                reporgsector = new net.ibizsys.psrt.srv.common.entity.OrgSector();
                reporgsector.setOrgSectorId(this.getRepOrgSectorId());
                net.ibizsys.psrt.srv.common.service.OrgSectorService service = (net.ibizsys.psrt.srv.common.service.OrgSectorService)ServiceGlobal.getService(net.ibizsys.psrt.srv.common.service.OrgSectorService.class,this.getSessionFactory());
                if(this.getRepOrgSectorId().indexOf(net.ibizsys.paas.service.ServiceBase.TEMPKEY) == 0)
                    service.getTemp(reporgsector);
                else
                    service.get(reporgsector);
            }
            return reporgsector;
        }
    }



    /**
     *  获取代理的数据对象
     */
    private OrgSectorBase getProxyEntity() {
        return this.proxyOrgSectorBase;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.data.DataObject#onProxy(net.ibizsys.paas.data.IDataObject)
     */
    @Override
    protected void onProxy(IDataObject proxyDataObject) {
        this.proxyOrgSectorBase = null;
        if(proxyDataObject!=null && proxyDataObject instanceof OrgSectorBase) {
            this.proxyOrgSectorBase = (OrgSectorBase)proxyDataObject;
        }
    }

}