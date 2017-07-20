/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package net.ibizsys.psrt.srv.wf.entity;


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
 * 实体[WFWorkList] 数据对象基类
 */
public abstract class WFWorkListBase extends net.ibizsys.paas.entity.EntityBase implements Serializable {

    private static final long serialVersionUID = -1L;
    private static final Log log = LogFactory.getLog(WFWorkListBase.class);
    /**
     * 属性[工作取消标志]
     */
    public final static String FIELD_CANCELFLAG = "CANCELFLAG";
    /**
     * 属性[取消通知]
     */
    public final static String FIELD_CANCELINFORM = "CANCELINFORM";
    /**
     * 属性[建立时间]
     */
    public final static String FIELD_CREATEDATE = "CREATEDATE";
    /**
     * 属性[建立人]
     */
    public final static String FIELD_CREATEMAN = "CREATEMAN";
    /**
     * 属性[源流程用户]
     */
    public final static String FIELD_ORIGINALWFUSERID = "ORIGINALWFUSERID";
    /**
     * 属性[源流程用户]
     */
    public final static String FIELD_ORIGINALWFUSERNAME = "ORIGINALWFUSERNAME";
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
     * 属性[用户数据]
     */
    public final static String FIELD_USERDATA2 = "USERDATA2";
    /**
     * 属性[用户数据]
     */
    public final static String FIELD_USERDATA3 = "USERDATA3";
    /**
     * 属性[用户数据]
     */
    public final static String FIELD_USERDATA4 = "USERDATA4";
    /**
     * 属性[用户数据信息]
     */
    public final static String FIELD_USERDATAINFO = "USERDATAINFO";
    /**
     * 属性[用户标识]
     */
    public final static String FIELD_WFACTORID = "WFACTORID";
    /**
     * 属性[流程实例]
     */
    public final static String FIELD_WFINSTANCEID = "WFINSTANCEID";
    /**
     * 属性[流程实例]
     */
    public final static String FIELD_WFINSTANCENAME = "WFINSTANCENAME";
    /**
     * 属性[流程步骤标识]
     */
    public final static String FIELD_WFSTEPID = "WFSTEPID";
    /**
     * 属性[流程步骤名称]
     */
    public final static String FIELD_WFSTEPNAME = "WFSTEPNAME";
    /**
     * 属性[工作流标识]
     */
    public final static String FIELD_WFWORKFLOWID = "WFWORKFLOWID";
    /**
     * 属性[工作流名称]
     */
    public final static String FIELD_WFWORKFLOWNAME = "WFWORKFLOWNAME";
    /**
     * 属性[流程工作列表标识]
     */
    public final static String FIELD_WFWORKLISTID = "WFWORKLISTID";
    /**
     * 属性[流程工作列表名称]
     */
    public final static String FIELD_WFWORKLISTNAME = "WFWORKLISTNAME";
    /**
     * 属性[工作通知]
     */
    public final static String FIELD_WORKINFORM = "WORKINFORM";

    private final static int INDEX_CANCELFLAG = 0;
    private final static int INDEX_CANCELINFORM = 1;
    private final static int INDEX_CREATEDATE = 2;
    private final static int INDEX_CREATEMAN = 3;
    private final static int INDEX_ORIGINALWFUSERID = 4;
    private final static int INDEX_ORIGINALWFUSERNAME = 5;
    private final static int INDEX_UPDATEDATE = 6;
    private final static int INDEX_UPDATEMAN = 7;
    private final static int INDEX_USERDATA = 8;
    private final static int INDEX_USERDATA2 = 9;
    private final static int INDEX_USERDATA3 = 10;
    private final static int INDEX_USERDATA4 = 11;
    private final static int INDEX_USERDATAINFO = 12;
    private final static int INDEX_WFACTORID = 13;
    private final static int INDEX_WFINSTANCEID = 14;
    private final static int INDEX_WFINSTANCENAME = 15;
    private final static int INDEX_WFSTEPID = 16;
    private final static int INDEX_WFSTEPNAME = 17;
    private final static int INDEX_WFWORKFLOWID = 18;
    private final static int INDEX_WFWORKFLOWNAME = 19;
    private final static int INDEX_WFWORKLISTID = 20;
    private final static int INDEX_WFWORKLISTNAME = 21;
    private final static int INDEX_WORKINFORM = 22;

    private final static HashMap<String, Integer> fieldIndexMap = new HashMap<String, Integer>();
    static {
        fieldIndexMap.put( FIELD_CANCELFLAG, INDEX_CANCELFLAG);
        fieldIndexMap.put( FIELD_CANCELINFORM, INDEX_CANCELINFORM);
        fieldIndexMap.put( FIELD_CREATEDATE, INDEX_CREATEDATE);
        fieldIndexMap.put( FIELD_CREATEMAN, INDEX_CREATEMAN);
        fieldIndexMap.put( FIELD_ORIGINALWFUSERID, INDEX_ORIGINALWFUSERID);
        fieldIndexMap.put( FIELD_ORIGINALWFUSERNAME, INDEX_ORIGINALWFUSERNAME);
        fieldIndexMap.put( FIELD_UPDATEDATE, INDEX_UPDATEDATE);
        fieldIndexMap.put( FIELD_UPDATEMAN, INDEX_UPDATEMAN);
        fieldIndexMap.put( FIELD_USERDATA, INDEX_USERDATA);
        fieldIndexMap.put( FIELD_USERDATA2, INDEX_USERDATA2);
        fieldIndexMap.put( FIELD_USERDATA3, INDEX_USERDATA3);
        fieldIndexMap.put( FIELD_USERDATA4, INDEX_USERDATA4);
        fieldIndexMap.put( FIELD_USERDATAINFO, INDEX_USERDATAINFO);
        fieldIndexMap.put( FIELD_WFACTORID, INDEX_WFACTORID);
        fieldIndexMap.put( FIELD_WFINSTANCEID, INDEX_WFINSTANCEID);
        fieldIndexMap.put( FIELD_WFINSTANCENAME, INDEX_WFINSTANCENAME);
        fieldIndexMap.put( FIELD_WFSTEPID, INDEX_WFSTEPID);
        fieldIndexMap.put( FIELD_WFSTEPNAME, INDEX_WFSTEPNAME);
        fieldIndexMap.put( FIELD_WFWORKFLOWID, INDEX_WFWORKFLOWID);
        fieldIndexMap.put( FIELD_WFWORKFLOWNAME, INDEX_WFWORKFLOWNAME);
        fieldIndexMap.put( FIELD_WFWORKLISTID, INDEX_WFWORKLISTID);
        fieldIndexMap.put( FIELD_WFWORKLISTNAME, INDEX_WFWORKLISTNAME);
        fieldIndexMap.put( FIELD_WORKINFORM, INDEX_WORKINFORM);
    }

    private WFWorkListBase proxyWFWorkListBase = null;
    public WFWorkListBase() {
        super();
    }
    private boolean cancelflagDirtyFlag = false;
    private boolean cancelinformDirtyFlag = false;
    private boolean createdateDirtyFlag = false;
    private boolean createmanDirtyFlag = false;
    private boolean originalwfuseridDirtyFlag = false;
    private boolean originalwfusernameDirtyFlag = false;
    private boolean updatedateDirtyFlag = false;
    private boolean updatemanDirtyFlag = false;
    private boolean userdataDirtyFlag = false;
    private boolean userdata2DirtyFlag = false;
    private boolean userdata3DirtyFlag = false;
    private boolean userdata4DirtyFlag = false;
    private boolean userdatainfoDirtyFlag = false;
    private boolean wfactoridDirtyFlag = false;
    private boolean wfinstanceidDirtyFlag = false;
    private boolean wfinstancenameDirtyFlag = false;
    private boolean wfstepidDirtyFlag = false;
    private boolean wfstepnameDirtyFlag = false;
    private boolean wfworkflowidDirtyFlag = false;
    private boolean wfworkflownameDirtyFlag = false;
    private boolean wfworklistidDirtyFlag = false;
    private boolean wfworklistnameDirtyFlag = false;
    private boolean workinformDirtyFlag = false;

    @Column(name="cancelflag")
    private Integer cancelflag;
    @Column(name="cancelinform")
    private Integer cancelinform;
    @Column(name="createdate")
    private Timestamp createdate;
    @Column(name="createman")
    private String createman;
    @Column(name="originalwfuserid")
    private String originalwfuserid;
    @Column(name="originalwfusername")
    private String originalwfusername;
    @Column(name="updatedate")
    private Timestamp updatedate;
    @Column(name="updateman")
    private String updateman;
    @Column(name="userdata")
    private String userdata;
    @Column(name="userdata2")
    private String userdata2;
    @Column(name="userdata3")
    private String userdata3;
    @Column(name="userdata4")
    private String userdata4;
    @Column(name="userdatainfo")
    private String userdatainfo;
    @Column(name="wfactorid")
    private String wfactorid;
    @Column(name="wfinstanceid")
    private String wfinstanceid;
    @Column(name="wfinstancename")
    private String wfinstancename;
    @Column(name="wfstepid")
    private String wfstepid;
    @Column(name="wfstepname")
    private String wfstepname;
    @Column(name="wfworkflowid")
    private String wfworkflowid;
    @Column(name="wfworkflowname")
    private String wfworkflowname;
    @Column(name="wfworklistid")
    private String wfworklistid;
    @Column(name="wfworklistname")
    private String wfworklistname;
    @Column(name="workinform")
    private Integer workinform;


    /**
     *  设置属性值[工作取消标志]代码表：net.ibizsys.psrt.srv.codelist.YesNoCodeListModel
     *  @param cancelflag
     */
    public void setCancelFlag(Integer cancelflag) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setCancelFlag(cancelflag);
            return;
        }
        this.cancelflag = cancelflag;
        this.cancelflagDirtyFlag  = true;
    }

    /**
     *  获取属性值[工作取消标志]代码表：net.ibizsys.psrt.srv.codelist.YesNoCodeListModel
     */
    public Integer getCancelFlag() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getCancelFlag();
        }
        return this.cancelflag;
    }

    /**
     *  获取属性值[工作取消标志]是否修改
     */
    public boolean isCancelFlagDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isCancelFlagDirty();
        }
        return this.cancelflagDirtyFlag;
    }

    /**
     *  重置属性值[工作取消标志]
     */
    public void resetCancelFlag() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetCancelFlag();
            return;
        }

        this.cancelflagDirtyFlag = false;
        this.cancelflag = null;
    }
    /**
     *  设置属性值[取消通知]代码表：net.ibizsys.psrt.srv.codelist.YesNoCodeListModel
     *  @param cancelinform
     */
    public void setCancelInform(Integer cancelinform) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setCancelInform(cancelinform);
            return;
        }
        this.cancelinform = cancelinform;
        this.cancelinformDirtyFlag  = true;
    }

    /**
     *  获取属性值[取消通知]代码表：net.ibizsys.psrt.srv.codelist.YesNoCodeListModel
     */
    public Integer getCancelInform() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getCancelInform();
        }
        return this.cancelinform;
    }

    /**
     *  获取属性值[取消通知]是否修改
     */
    public boolean isCancelInformDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isCancelInformDirty();
        }
        return this.cancelinformDirtyFlag;
    }

    /**
     *  重置属性值[取消通知]
     */
    public void resetCancelInform() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetCancelInform();
            return;
        }

        this.cancelinformDirtyFlag = false;
        this.cancelinform = null;
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
     *  设置属性值[源流程用户]
     *  @param originalwfuserid
     */
    public void setOriginalWFUserId(String originalwfuserid) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setOriginalWFUserId(originalwfuserid);
            return;
        }
        if(originalwfuserid!=null) {
            originalwfuserid = StringHelper.trimRight(originalwfuserid);
            if(originalwfuserid.length()==0) {
                originalwfuserid = null;
            }
        }
        this.originalwfuserid = originalwfuserid;
        this.originalwfuseridDirtyFlag  = true;
    }

    /**
     *  获取属性值[源流程用户]
     */
    public String getOriginalWFUserId() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getOriginalWFUserId();
        }
        return this.originalwfuserid;
    }

    /**
     *  获取属性值[源流程用户]是否修改
     */
    public boolean isOriginalWFUserIdDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isOriginalWFUserIdDirty();
        }
        return this.originalwfuseridDirtyFlag;
    }

    /**
     *  重置属性值[源流程用户]
     */
    public void resetOriginalWFUserId() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetOriginalWFUserId();
            return;
        }

        this.originalwfuseridDirtyFlag = false;
        this.originalwfuserid = null;
    }
    /**
     *  设置属性值[源流程用户]
     *  @param originalwfusername
     */
    public void setOriginalWFUserName(String originalwfusername) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setOriginalWFUserName(originalwfusername);
            return;
        }
        if(originalwfusername!=null) {
            originalwfusername = StringHelper.trimRight(originalwfusername);
            if(originalwfusername.length()==0) {
                originalwfusername = null;
            }
        }
        this.originalwfusername = originalwfusername;
        this.originalwfusernameDirtyFlag  = true;
    }

    /**
     *  获取属性值[源流程用户]
     */
    public String getOriginalWFUserName() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getOriginalWFUserName();
        }
        return this.originalwfusername;
    }

    /**
     *  获取属性值[源流程用户]是否修改
     */
    public boolean isOriginalWFUserNameDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isOriginalWFUserNameDirty();
        }
        return this.originalwfusernameDirtyFlag;
    }

    /**
     *  重置属性值[源流程用户]
     */
    public void resetOriginalWFUserName() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetOriginalWFUserName();
            return;
        }

        this.originalwfusernameDirtyFlag = false;
        this.originalwfusername = null;
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
     *  设置属性值[用户数据]
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
     *  获取属性值[用户数据]
     */
    public String getUserData2() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getUserData2();
        }
        return this.userdata2;
    }

    /**
     *  获取属性值[用户数据]是否修改
     */
    public boolean isUserData2Dirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isUserData2Dirty();
        }
        return this.userdata2DirtyFlag;
    }

    /**
     *  重置属性值[用户数据]
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
     *  设置属性值[用户数据]
     *  @param userdata3
     */
    public void setUserData3(String userdata3) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setUserData3(userdata3);
            return;
        }
        if(userdata3!=null) {
            userdata3 = StringHelper.trimRight(userdata3);
            if(userdata3.length()==0) {
                userdata3 = null;
            }
        }
        this.userdata3 = userdata3;
        this.userdata3DirtyFlag  = true;
    }

    /**
     *  获取属性值[用户数据]
     */
    public String getUserData3() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getUserData3();
        }
        return this.userdata3;
    }

    /**
     *  获取属性值[用户数据]是否修改
     */
    public boolean isUserData3Dirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isUserData3Dirty();
        }
        return this.userdata3DirtyFlag;
    }

    /**
     *  重置属性值[用户数据]
     */
    public void resetUserData3() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetUserData3();
            return;
        }

        this.userdata3DirtyFlag = false;
        this.userdata3 = null;
    }
    /**
     *  设置属性值[用户数据]
     *  @param userdata4
     */
    public void setUserData4(String userdata4) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setUserData4(userdata4);
            return;
        }
        if(userdata4!=null) {
            userdata4 = StringHelper.trimRight(userdata4);
            if(userdata4.length()==0) {
                userdata4 = null;
            }
        }
        this.userdata4 = userdata4;
        this.userdata4DirtyFlag  = true;
    }

    /**
     *  获取属性值[用户数据]
     */
    public String getUserData4() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getUserData4();
        }
        return this.userdata4;
    }

    /**
     *  获取属性值[用户数据]是否修改
     */
    public boolean isUserData4Dirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isUserData4Dirty();
        }
        return this.userdata4DirtyFlag;
    }

    /**
     *  重置属性值[用户数据]
     */
    public void resetUserData4() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetUserData4();
            return;
        }

        this.userdata4DirtyFlag = false;
        this.userdata4 = null;
    }
    /**
     *  设置属性值[用户数据信息]
     *  @param userdatainfo
     */
    public void setUserDataInfo(String userdatainfo) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setUserDataInfo(userdatainfo);
            return;
        }
        if(userdatainfo!=null) {
            userdatainfo = StringHelper.trimRight(userdatainfo);
            if(userdatainfo.length()==0) {
                userdatainfo = null;
            }
        }
        this.userdatainfo = userdatainfo;
        this.userdatainfoDirtyFlag  = true;
    }

    /**
     *  获取属性值[用户数据信息]
     */
    public String getUserDataInfo() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getUserDataInfo();
        }
        return this.userdatainfo;
    }

    /**
     *  获取属性值[用户数据信息]是否修改
     */
    public boolean isUserDataInfoDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isUserDataInfoDirty();
        }
        return this.userdatainfoDirtyFlag;
    }

    /**
     *  重置属性值[用户数据信息]
     */
    public void resetUserDataInfo() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetUserDataInfo();
            return;
        }

        this.userdatainfoDirtyFlag = false;
        this.userdatainfo = null;
    }
    /**
     *  设置属性值[用户标识]
     *  @param wfactorid
     */
    public void setWFActorId(String wfactorid) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setWFActorId(wfactorid);
            return;
        }
        if(wfactorid!=null) {
            wfactorid = StringHelper.trimRight(wfactorid);
            if(wfactorid.length()==0) {
                wfactorid = null;
            }
        }
        this.wfactorid = wfactorid;
        this.wfactoridDirtyFlag  = true;
    }

    /**
     *  获取属性值[用户标识]
     */
    public String getWFActorId() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getWFActorId();
        }
        return this.wfactorid;
    }

    /**
     *  获取属性值[用户标识]是否修改
     */
    public boolean isWFActorIdDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isWFActorIdDirty();
        }
        return this.wfactoridDirtyFlag;
    }

    /**
     *  重置属性值[用户标识]
     */
    public void resetWFActorId() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetWFActorId();
            return;
        }

        this.wfactoridDirtyFlag = false;
        this.wfactorid = null;
    }
    /**
     *  设置属性值[流程实例]
     *  @param wfinstanceid
     */
    public void setWFInstanceId(String wfinstanceid) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setWFInstanceId(wfinstanceid);
            return;
        }
        if(wfinstanceid!=null) {
            wfinstanceid = StringHelper.trimRight(wfinstanceid);
            if(wfinstanceid.length()==0) {
                wfinstanceid = null;
            }
        }
        this.wfinstanceid = wfinstanceid;
        this.wfinstanceidDirtyFlag  = true;
    }

    /**
     *  获取属性值[流程实例]
     */
    public String getWFInstanceId() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getWFInstanceId();
        }
        return this.wfinstanceid;
    }

    /**
     *  获取属性值[流程实例]是否修改
     */
    public boolean isWFInstanceIdDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isWFInstanceIdDirty();
        }
        return this.wfinstanceidDirtyFlag;
    }

    /**
     *  重置属性值[流程实例]
     */
    public void resetWFInstanceId() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetWFInstanceId();
            return;
        }

        this.wfinstanceidDirtyFlag = false;
        this.wfinstanceid = null;
    }
    /**
     *  设置属性值[流程实例]
     *  @param wfinstancename
     */
    public void setWFInstanceName(String wfinstancename) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setWFInstanceName(wfinstancename);
            return;
        }
        if(wfinstancename!=null) {
            wfinstancename = StringHelper.trimRight(wfinstancename);
            if(wfinstancename.length()==0) {
                wfinstancename = null;
            }
        }
        this.wfinstancename = wfinstancename;
        this.wfinstancenameDirtyFlag  = true;
    }

    /**
     *  获取属性值[流程实例]
     */
    public String getWFInstanceName() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getWFInstanceName();
        }
        return this.wfinstancename;
    }

    /**
     *  获取属性值[流程实例]是否修改
     */
    public boolean isWFInstanceNameDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isWFInstanceNameDirty();
        }
        return this.wfinstancenameDirtyFlag;
    }

    /**
     *  重置属性值[流程实例]
     */
    public void resetWFInstanceName() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetWFInstanceName();
            return;
        }

        this.wfinstancenameDirtyFlag = false;
        this.wfinstancename = null;
    }
    /**
     *  设置属性值[流程步骤标识]
     *  @param wfstepid
     */
    public void setWFStepId(String wfstepid) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setWFStepId(wfstepid);
            return;
        }
        if(wfstepid!=null) {
            wfstepid = StringHelper.trimRight(wfstepid);
            if(wfstepid.length()==0) {
                wfstepid = null;
            }
        }
        this.wfstepid = wfstepid;
        this.wfstepidDirtyFlag  = true;
    }

    /**
     *  获取属性值[流程步骤标识]
     */
    public String getWFStepId() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getWFStepId();
        }
        return this.wfstepid;
    }

    /**
     *  获取属性值[流程步骤标识]是否修改
     */
    public boolean isWFStepIdDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isWFStepIdDirty();
        }
        return this.wfstepidDirtyFlag;
    }

    /**
     *  重置属性值[流程步骤标识]
     */
    public void resetWFStepId() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetWFStepId();
            return;
        }

        this.wfstepidDirtyFlag = false;
        this.wfstepid = null;
    }
    /**
     *  设置属性值[流程步骤名称]
     *  @param wfstepname
     */
    public void setWFStepName(String wfstepname) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setWFStepName(wfstepname);
            return;
        }
        if(wfstepname!=null) {
            wfstepname = StringHelper.trimRight(wfstepname);
            if(wfstepname.length()==0) {
                wfstepname = null;
            }
        }
        this.wfstepname = wfstepname;
        this.wfstepnameDirtyFlag  = true;
    }

    /**
     *  获取属性值[流程步骤名称]
     */
    public String getWFStepName() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getWFStepName();
        }
        return this.wfstepname;
    }

    /**
     *  获取属性值[流程步骤名称]是否修改
     */
    public boolean isWFStepNameDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isWFStepNameDirty();
        }
        return this.wfstepnameDirtyFlag;
    }

    /**
     *  重置属性值[流程步骤名称]
     */
    public void resetWFStepName() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetWFStepName();
            return;
        }

        this.wfstepnameDirtyFlag = false;
        this.wfstepname = null;
    }
    /**
     *  设置属性值[工作流标识]
     *  @param wfworkflowid
     */
    public void setWFWorkflowId(String wfworkflowid) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setWFWorkflowId(wfworkflowid);
            return;
        }
        if(wfworkflowid!=null) {
            wfworkflowid = StringHelper.trimRight(wfworkflowid);
            if(wfworkflowid.length()==0) {
                wfworkflowid = null;
            }
        }
        this.wfworkflowid = wfworkflowid;
        this.wfworkflowidDirtyFlag  = true;
    }

    /**
     *  获取属性值[工作流标识]
     */
    public String getWFWorkflowId() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getWFWorkflowId();
        }
        return this.wfworkflowid;
    }

    /**
     *  获取属性值[工作流标识]是否修改
     */
    public boolean isWFWorkflowIdDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isWFWorkflowIdDirty();
        }
        return this.wfworkflowidDirtyFlag;
    }

    /**
     *  重置属性值[工作流标识]
     */
    public void resetWFWorkflowId() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetWFWorkflowId();
            return;
        }

        this.wfworkflowidDirtyFlag = false;
        this.wfworkflowid = null;
    }
    /**
     *  设置属性值[工作流名称]
     *  @param wfworkflowname
     */
    public void setWFWorkflowName(String wfworkflowname) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setWFWorkflowName(wfworkflowname);
            return;
        }
        if(wfworkflowname!=null) {
            wfworkflowname = StringHelper.trimRight(wfworkflowname);
            if(wfworkflowname.length()==0) {
                wfworkflowname = null;
            }
        }
        this.wfworkflowname = wfworkflowname;
        this.wfworkflownameDirtyFlag  = true;
    }

    /**
     *  获取属性值[工作流名称]
     */
    public String getWFWorkflowName() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getWFWorkflowName();
        }
        return this.wfworkflowname;
    }

    /**
     *  获取属性值[工作流名称]是否修改
     */
    public boolean isWFWorkflowNameDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isWFWorkflowNameDirty();
        }
        return this.wfworkflownameDirtyFlag;
    }

    /**
     *  重置属性值[工作流名称]
     */
    public void resetWFWorkflowName() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetWFWorkflowName();
            return;
        }

        this.wfworkflownameDirtyFlag = false;
        this.wfworkflowname = null;
    }
    /**
     *  设置属性值[流程工作列表标识]
     *  @param wfworklistid
     */
    public void setWFWorkListId(String wfworklistid) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setWFWorkListId(wfworklistid);
            return;
        }
        if(wfworklistid!=null) {
            wfworklistid = StringHelper.trimRight(wfworklistid);
            if(wfworklistid.length()==0) {
                wfworklistid = null;
            }
        }
        this.wfworklistid = wfworklistid;
        this.wfworklistidDirtyFlag  = true;
    }

    /**
     *  获取属性值[流程工作列表标识]
     */
    public String getWFWorkListId() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getWFWorkListId();
        }
        return this.wfworklistid;
    }

    /**
     *  获取属性值[流程工作列表标识]是否修改
     */
    public boolean isWFWorkListIdDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isWFWorkListIdDirty();
        }
        return this.wfworklistidDirtyFlag;
    }

    /**
     *  重置属性值[流程工作列表标识]
     */
    public void resetWFWorkListId() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetWFWorkListId();
            return;
        }

        this.wfworklistidDirtyFlag = false;
        this.wfworklistid = null;
    }
    /**
     *  设置属性值[流程工作列表名称]
     *  @param wfworklistname
     */
    public void setWFWorkListName(String wfworklistname) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setWFWorkListName(wfworklistname);
            return;
        }
        if(wfworklistname!=null) {
            wfworklistname = StringHelper.trimRight(wfworklistname);
            if(wfworklistname.length()==0) {
                wfworklistname = null;
            }
        }
        this.wfworklistname = wfworklistname;
        this.wfworklistnameDirtyFlag  = true;
    }

    /**
     *  获取属性值[流程工作列表名称]
     */
    public String getWFWorkListName() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getWFWorkListName();
        }
        return this.wfworklistname;
    }

    /**
     *  获取属性值[流程工作列表名称]是否修改
     */
    public boolean isWFWorkListNameDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isWFWorkListNameDirty();
        }
        return this.wfworklistnameDirtyFlag;
    }

    /**
     *  重置属性值[流程工作列表名称]
     */
    public void resetWFWorkListName() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetWFWorkListName();
            return;
        }

        this.wfworklistnameDirtyFlag = false;
        this.wfworklistname = null;
    }
    /**
     *  设置属性值[工作通知]代码表：net.ibizsys.psrt.srv.codelist.YesNoCodeListModel
     *  @param workinform
     */
    public void setWorkInform(Integer workinform) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setWorkInform(workinform);
            return;
        }
        this.workinform = workinform;
        this.workinformDirtyFlag  = true;
    }

    /**
     *  获取属性值[工作通知]代码表：net.ibizsys.psrt.srv.codelist.YesNoCodeListModel
     */
    public Integer getWorkInform() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getWorkInform();
        }
        return this.workinform;
    }

    /**
     *  获取属性值[工作通知]是否修改
     */
    public boolean isWorkInformDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isWorkInformDirty();
        }
        return this.workinformDirtyFlag;
    }

    /**
     *  重置属性值[工作通知]
     */
    public void resetWorkInform() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetWorkInform();
            return;
        }

        this.workinformDirtyFlag = false;
        this.workinform = null;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onReset()
     */
    @Override
    protected void onReset() {
        WFWorkListBase.resetAll(this);
        super.onReset();
    }

    /**
     * 重置当前数据对象属性值
     * @param entity
     */
    private static void resetAll(WFWorkListBase et) {
        et.resetCancelFlag();
        et.resetCancelInform();
        et.resetCreateDate();
        et.resetCreateMan();
        et.resetOriginalWFUserId();
        et.resetOriginalWFUserName();
        et.resetUpdateDate();
        et.resetUpdateMan();
        et.resetUserData();
        et.resetUserData2();
        et.resetUserData3();
        et.resetUserData4();
        et.resetUserDataInfo();
        et.resetWFActorId();
        et.resetWFInstanceId();
        et.resetWFInstanceName();
        et.resetWFStepId();
        et.resetWFStepName();
        et.resetWFWorkflowId();
        et.resetWFWorkflowName();
        et.resetWFWorkListId();
        et.resetWFWorkListName();
        et.resetWorkInform();
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onFillMap(java.util.HashMap, boolean)
     */
    @Override
    protected void onFillMap(HashMap<String, Object> params, boolean bDirtyOnly) {
        if(!bDirtyOnly || isCancelFlagDirty()) {
            params.put(FIELD_CANCELFLAG,getCancelFlag());
        }
        if(!bDirtyOnly || isCancelInformDirty()) {
            params.put(FIELD_CANCELINFORM,getCancelInform());
        }
        if(!bDirtyOnly || isCreateDateDirty()) {
            params.put(FIELD_CREATEDATE,getCreateDate());
        }
        if(!bDirtyOnly || isCreateManDirty()) {
            params.put(FIELD_CREATEMAN,getCreateMan());
        }
        if(!bDirtyOnly || isOriginalWFUserIdDirty()) {
            params.put(FIELD_ORIGINALWFUSERID,getOriginalWFUserId());
        }
        if(!bDirtyOnly || isOriginalWFUserNameDirty()) {
            params.put(FIELD_ORIGINALWFUSERNAME,getOriginalWFUserName());
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
        if(!bDirtyOnly || isUserData3Dirty()) {
            params.put(FIELD_USERDATA3,getUserData3());
        }
        if(!bDirtyOnly || isUserData4Dirty()) {
            params.put(FIELD_USERDATA4,getUserData4());
        }
        if(!bDirtyOnly || isUserDataInfoDirty()) {
            params.put(FIELD_USERDATAINFO,getUserDataInfo());
        }
        if(!bDirtyOnly || isWFActorIdDirty()) {
            params.put(FIELD_WFACTORID,getWFActorId());
        }
        if(!bDirtyOnly || isWFInstanceIdDirty()) {
            params.put(FIELD_WFINSTANCEID,getWFInstanceId());
        }
        if(!bDirtyOnly || isWFInstanceNameDirty()) {
            params.put(FIELD_WFINSTANCENAME,getWFInstanceName());
        }
        if(!bDirtyOnly || isWFStepIdDirty()) {
            params.put(FIELD_WFSTEPID,getWFStepId());
        }
        if(!bDirtyOnly || isWFStepNameDirty()) {
            params.put(FIELD_WFSTEPNAME,getWFStepName());
        }
        if(!bDirtyOnly || isWFWorkflowIdDirty()) {
            params.put(FIELD_WFWORKFLOWID,getWFWorkflowId());
        }
        if(!bDirtyOnly || isWFWorkflowNameDirty()) {
            params.put(FIELD_WFWORKFLOWNAME,getWFWorkflowName());
        }
        if(!bDirtyOnly || isWFWorkListIdDirty()) {
            params.put(FIELD_WFWORKLISTID,getWFWorkListId());
        }
        if(!bDirtyOnly || isWFWorkListNameDirty()) {
            params.put(FIELD_WFWORKLISTNAME,getWFWorkListName());
        }
        if(!bDirtyOnly || isWorkInformDirty()) {
            params.put(FIELD_WORKINFORM,getWorkInform());
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

        return  WFWorkListBase.get(this, index);
    }

    /**
     * 通过属性标识获取属性值
     * @param et 数据对象
     * @param index 属性标识
     * @return
     * @throws Exception
     */
    private static Object get(WFWorkListBase et,int index) throws Exception {

        switch(index) {
        case INDEX_CANCELFLAG:
            return et.getCancelFlag();
        case INDEX_CANCELINFORM:
            return et.getCancelInform();
        case INDEX_CREATEDATE:
            return et.getCreateDate();
        case INDEX_CREATEMAN:
            return et.getCreateMan();
        case INDEX_ORIGINALWFUSERID:
            return et.getOriginalWFUserId();
        case INDEX_ORIGINALWFUSERNAME:
            return et.getOriginalWFUserName();
        case INDEX_UPDATEDATE:
            return et.getUpdateDate();
        case INDEX_UPDATEMAN:
            return et.getUpdateMan();
        case INDEX_USERDATA:
            return et.getUserData();
        case INDEX_USERDATA2:
            return et.getUserData2();
        case INDEX_USERDATA3:
            return et.getUserData3();
        case INDEX_USERDATA4:
            return et.getUserData4();
        case INDEX_USERDATAINFO:
            return et.getUserDataInfo();
        case INDEX_WFACTORID:
            return et.getWFActorId();
        case INDEX_WFINSTANCEID:
            return et.getWFInstanceId();
        case INDEX_WFINSTANCENAME:
            return et.getWFInstanceName();
        case INDEX_WFSTEPID:
            return et.getWFStepId();
        case INDEX_WFSTEPNAME:
            return et.getWFStepName();
        case INDEX_WFWORKFLOWID:
            return et.getWFWorkflowId();
        case INDEX_WFWORKFLOWNAME:
            return et.getWFWorkflowName();
        case INDEX_WFWORKLISTID:
            return et.getWFWorkListId();
        case INDEX_WFWORKLISTNAME:
            return et.getWFWorkListName();
        case INDEX_WORKINFORM:
            return et.getWorkInform();
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

        WFWorkListBase.set(this,index,objValue);
    }

    /**
     * 通过属性标识设定属性值
     * @param et 数据对象
     * @param index 属性标识
     * @param obj 值
     * @throws Exception
     */
    private static void set(WFWorkListBase et,int index,Object obj) throws Exception {
        switch(index) {
        case INDEX_CANCELFLAG:
            et.setCancelFlag(DataObject.getIntegerValue(obj));
            return ;
        case INDEX_CANCELINFORM:
            et.setCancelInform(DataObject.getIntegerValue(obj));
            return ;
        case INDEX_CREATEDATE:
            et.setCreateDate(DataObject.getTimestampValue(obj));
            return ;
        case INDEX_CREATEMAN:
            et.setCreateMan(DataObject.getStringValue(obj));
            return ;
        case INDEX_ORIGINALWFUSERID:
            et.setOriginalWFUserId(DataObject.getStringValue(obj));
            return ;
        case INDEX_ORIGINALWFUSERNAME:
            et.setOriginalWFUserName(DataObject.getStringValue(obj));
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
        case INDEX_USERDATA3:
            et.setUserData3(DataObject.getStringValue(obj));
            return ;
        case INDEX_USERDATA4:
            et.setUserData4(DataObject.getStringValue(obj));
            return ;
        case INDEX_USERDATAINFO:
            et.setUserDataInfo(DataObject.getStringValue(obj));
            return ;
        case INDEX_WFACTORID:
            et.setWFActorId(DataObject.getStringValue(obj));
            return ;
        case INDEX_WFINSTANCEID:
            et.setWFInstanceId(DataObject.getStringValue(obj));
            return ;
        case INDEX_WFINSTANCENAME:
            et.setWFInstanceName(DataObject.getStringValue(obj));
            return ;
        case INDEX_WFSTEPID:
            et.setWFStepId(DataObject.getStringValue(obj));
            return ;
        case INDEX_WFSTEPNAME:
            et.setWFStepName(DataObject.getStringValue(obj));
            return ;
        case INDEX_WFWORKFLOWID:
            et.setWFWorkflowId(DataObject.getStringValue(obj));
            return ;
        case INDEX_WFWORKFLOWNAME:
            et.setWFWorkflowName(DataObject.getStringValue(obj));
            return ;
        case INDEX_WFWORKLISTID:
            et.setWFWorkListId(DataObject.getStringValue(obj));
            return ;
        case INDEX_WFWORKLISTNAME:
            et.setWFWorkListName(DataObject.getStringValue(obj));
            return ;
        case INDEX_WORKINFORM:
            et.setWorkInform(DataObject.getIntegerValue(obj));
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

        return  WFWorkListBase.isNull(this, index);
    }

    /**
     * 判断指定属性值是否为空值
     * @param et
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean isNull(WFWorkListBase et,int index) throws Exception {

        switch(index) {
        case INDEX_CANCELFLAG:
            return et.getCancelFlag()==null;
        case INDEX_CANCELINFORM:
            return et.getCancelInform()==null;
        case INDEX_CREATEDATE:
            return et.getCreateDate()==null;
        case INDEX_CREATEMAN:
            return et.getCreateMan()==null;
        case INDEX_ORIGINALWFUSERID:
            return et.getOriginalWFUserId()==null;
        case INDEX_ORIGINALWFUSERNAME:
            return et.getOriginalWFUserName()==null;
        case INDEX_UPDATEDATE:
            return et.getUpdateDate()==null;
        case INDEX_UPDATEMAN:
            return et.getUpdateMan()==null;
        case INDEX_USERDATA:
            return et.getUserData()==null;
        case INDEX_USERDATA2:
            return et.getUserData2()==null;
        case INDEX_USERDATA3:
            return et.getUserData3()==null;
        case INDEX_USERDATA4:
            return et.getUserData4()==null;
        case INDEX_USERDATAINFO:
            return et.getUserDataInfo()==null;
        case INDEX_WFACTORID:
            return et.getWFActorId()==null;
        case INDEX_WFINSTANCEID:
            return et.getWFInstanceId()==null;
        case INDEX_WFINSTANCENAME:
            return et.getWFInstanceName()==null;
        case INDEX_WFSTEPID:
            return et.getWFStepId()==null;
        case INDEX_WFSTEPNAME:
            return et.getWFStepName()==null;
        case INDEX_WFWORKFLOWID:
            return et.getWFWorkflowId()==null;
        case INDEX_WFWORKFLOWNAME:
            return et.getWFWorkflowName()==null;
        case INDEX_WFWORKLISTID:
            return et.getWFWorkListId()==null;
        case INDEX_WFWORKLISTNAME:
            return et.getWFWorkListName()==null;
        case INDEX_WORKINFORM:
            return et.getWorkInform()==null;
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
        return  WFWorkListBase.contains(this, index);
    }

    /**
     * 获取判断对象是否存在指定属性值
     * @param et
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean contains(WFWorkListBase et,int index) throws Exception {

        switch(index) {
        case INDEX_CANCELFLAG:
            return et.isCancelFlagDirty();
        case INDEX_CANCELINFORM:
            return et.isCancelInformDirty();
        case INDEX_CREATEDATE:
            return et.isCreateDateDirty();
        case INDEX_CREATEMAN:
            return et.isCreateManDirty();
        case INDEX_ORIGINALWFUSERID:
            return et.isOriginalWFUserIdDirty();
        case INDEX_ORIGINALWFUSERNAME:
            return et.isOriginalWFUserNameDirty();
        case INDEX_UPDATEDATE:
            return et.isUpdateDateDirty();
        case INDEX_UPDATEMAN:
            return et.isUpdateManDirty();
        case INDEX_USERDATA:
            return et.isUserDataDirty();
        case INDEX_USERDATA2:
            return et.isUserData2Dirty();
        case INDEX_USERDATA3:
            return et.isUserData3Dirty();
        case INDEX_USERDATA4:
            return et.isUserData4Dirty();
        case INDEX_USERDATAINFO:
            return et.isUserDataInfoDirty();
        case INDEX_WFACTORID:
            return et.isWFActorIdDirty();
        case INDEX_WFINSTANCEID:
            return et.isWFInstanceIdDirty();
        case INDEX_WFINSTANCENAME:
            return et.isWFInstanceNameDirty();
        case INDEX_WFSTEPID:
            return et.isWFStepIdDirty();
        case INDEX_WFSTEPNAME:
            return et.isWFStepNameDirty();
        case INDEX_WFWORKFLOWID:
            return et.isWFWorkflowIdDirty();
        case INDEX_WFWORKFLOWNAME:
            return et.isWFWorkflowNameDirty();
        case INDEX_WFWORKLISTID:
            return et.isWFWorkListIdDirty();
        case INDEX_WFWORKLISTNAME:
            return et.isWFWorkListNameDirty();
        case INDEX_WORKINFORM:
            return et.isWorkInformDirty();
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
    private static  void fillJSONObject(WFWorkListBase et,JSONObject json, boolean bIncEmpty) throws Exception {
        if(bIncEmpty||et.getCancelFlag()!=null) {
            JSONObjectHelper.put(json,"cancelflag",getJSONValue(et.getCancelFlag()),false);
        }
        if(bIncEmpty||et.getCancelInform()!=null) {
            JSONObjectHelper.put(json,"cancelinform",getJSONValue(et.getCancelInform()),false);
        }
        if(bIncEmpty||et.getCreateDate()!=null) {
            JSONObjectHelper.put(json,"createdate",getJSONValue(et.getCreateDate()),false);
        }
        if(bIncEmpty||et.getCreateMan()!=null) {
            JSONObjectHelper.put(json,"createman",getJSONValue(et.getCreateMan()),false);
        }
        if(bIncEmpty||et.getOriginalWFUserId()!=null) {
            JSONObjectHelper.put(json,"originalwfuserid",getJSONValue(et.getOriginalWFUserId()),false);
        }
        if(bIncEmpty||et.getOriginalWFUserName()!=null) {
            JSONObjectHelper.put(json,"originalwfusername",getJSONValue(et.getOriginalWFUserName()),false);
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
        if(bIncEmpty||et.getUserData3()!=null) {
            JSONObjectHelper.put(json,"userdata3",getJSONValue(et.getUserData3()),false);
        }
        if(bIncEmpty||et.getUserData4()!=null) {
            JSONObjectHelper.put(json,"userdata4",getJSONValue(et.getUserData4()),false);
        }
        if(bIncEmpty||et.getUserDataInfo()!=null) {
            JSONObjectHelper.put(json,"userdatainfo",getJSONValue(et.getUserDataInfo()),false);
        }
        if(bIncEmpty||et.getWFActorId()!=null) {
            JSONObjectHelper.put(json,"wfactorid",getJSONValue(et.getWFActorId()),false);
        }
        if(bIncEmpty||et.getWFInstanceId()!=null) {
            JSONObjectHelper.put(json,"wfinstanceid",getJSONValue(et.getWFInstanceId()),false);
        }
        if(bIncEmpty||et.getWFInstanceName()!=null) {
            JSONObjectHelper.put(json,"wfinstancename",getJSONValue(et.getWFInstanceName()),false);
        }
        if(bIncEmpty||et.getWFStepId()!=null) {
            JSONObjectHelper.put(json,"wfstepid",getJSONValue(et.getWFStepId()),false);
        }
        if(bIncEmpty||et.getWFStepName()!=null) {
            JSONObjectHelper.put(json,"wfstepname",getJSONValue(et.getWFStepName()),false);
        }
        if(bIncEmpty||et.getWFWorkflowId()!=null) {
            JSONObjectHelper.put(json,"wfworkflowid",getJSONValue(et.getWFWorkflowId()),false);
        }
        if(bIncEmpty||et.getWFWorkflowName()!=null) {
            JSONObjectHelper.put(json,"wfworkflowname",getJSONValue(et.getWFWorkflowName()),false);
        }
        if(bIncEmpty||et.getWFWorkListId()!=null) {
            JSONObjectHelper.put(json,"wfworklistid",getJSONValue(et.getWFWorkListId()),false);
        }
        if(bIncEmpty||et.getWFWorkListName()!=null) {
            JSONObjectHelper.put(json,"wfworklistname",getJSONValue(et.getWFWorkListName()),false);
        }
        if(bIncEmpty||et.getWorkInform()!=null) {
            JSONObjectHelper.put(json,"workinform",getJSONValue(et.getWorkInform()),false);
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
    private static void fillXmlNode(WFWorkListBase et,XmlNode node,boolean bIncEmpty) throws Exception {
        if(bIncEmpty||et.getCancelFlag()!=null) {
            Object obj = et.getCancelFlag();
            node.setAttribute("CANCELFLAG",(obj==null)?"":StringHelper.format("%1$s",obj));
        }
        if(bIncEmpty||et.getCancelInform()!=null) {
            Object obj = et.getCancelInform();
            node.setAttribute("CANCELINFORM",(obj==null)?"":StringHelper.format("%1$s",obj));
        }
        if(bIncEmpty||et.getCreateDate()!=null) {
            Object obj = et.getCreateDate();
            node.setAttribute("CREATEDATE",(obj==null)?"":StringHelper.format("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS",obj));
        }
        if(bIncEmpty||et.getCreateMan()!=null) {
            Object obj = et.getCreateMan();
            node.setAttribute("CREATEMAN",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getOriginalWFUserId()!=null) {
            Object obj = et.getOriginalWFUserId();
            node.setAttribute("ORIGINALWFUSERID",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getOriginalWFUserName()!=null) {
            Object obj = et.getOriginalWFUserName();
            node.setAttribute("ORIGINALWFUSERNAME",(obj==null)?"":(String)obj);
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
        if(bIncEmpty||et.getUserData3()!=null) {
            Object obj = et.getUserData3();
            node.setAttribute("USERDATA3",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getUserData4()!=null) {
            Object obj = et.getUserData4();
            node.setAttribute("USERDATA4",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getUserDataInfo()!=null) {
            Object obj = et.getUserDataInfo();
            node.setAttribute("USERDATAINFO",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getWFActorId()!=null) {
            Object obj = et.getWFActorId();
            node.setAttribute("WFACTORID",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getWFInstanceId()!=null) {
            Object obj = et.getWFInstanceId();
            node.setAttribute("WFINSTANCEID",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getWFInstanceName()!=null) {
            Object obj = et.getWFInstanceName();
            node.setAttribute("WFINSTANCENAME",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getWFStepId()!=null) {
            Object obj = et.getWFStepId();
            node.setAttribute("WFSTEPID",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getWFStepName()!=null) {
            Object obj = et.getWFStepName();
            node.setAttribute("WFSTEPNAME",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getWFWorkflowId()!=null) {
            Object obj = et.getWFWorkflowId();
            node.setAttribute("WFWORKFLOWID",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getWFWorkflowName()!=null) {
            Object obj = et.getWFWorkflowName();
            node.setAttribute("WFWORKFLOWNAME",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getWFWorkListId()!=null) {
            Object obj = et.getWFWorkListId();
            node.setAttribute("WFWORKLISTID",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getWFWorkListName()!=null) {
            Object obj = et.getWFWorkListName();
            node.setAttribute("WFWORKLISTNAME",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getWorkInform()!=null) {
            Object obj = et.getWorkInform();
            node.setAttribute("WORKINFORM",(obj==null)?"":StringHelper.format("%1$s",obj));
        }


    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onCopyTo(net.ibizsys.paas.data.IDataObject, boolean)
     */
    @Override
    protected void onCopyTo(IDataObject dataEntity, boolean bIncludeEmtpy) throws Exception {
        WFWorkListBase.copyTo(this,dataEntity,bIncludeEmtpy);
        super.onCopyTo(dataEntity,bIncludeEmtpy);
    }

    /**
     * 复制当前对象数据到目标对象
     * @param et 当前数据对象
     * @param dst 目标数据对象
     * @param bIncEmpty 是否包括空值
     * @throws Exception
     */
    private static void copyTo(WFWorkListBase et,IDataObject dst,boolean bIncEmpty) throws Exception {
        if(et.isCancelFlagDirty() && (bIncEmpty||et.getCancelFlag()!=null)) {
            dst.set(FIELD_CANCELFLAG,et.getCancelFlag());
        }
        if(et.isCancelInformDirty() && (bIncEmpty||et.getCancelInform()!=null)) {
            dst.set(FIELD_CANCELINFORM,et.getCancelInform());
        }
        if(et.isCreateDateDirty() && (bIncEmpty||et.getCreateDate()!=null)) {
            dst.set(FIELD_CREATEDATE,et.getCreateDate());
        }
        if(et.isCreateManDirty() && (bIncEmpty||et.getCreateMan()!=null)) {
            dst.set(FIELD_CREATEMAN,et.getCreateMan());
        }
        if(et.isOriginalWFUserIdDirty() && (bIncEmpty||et.getOriginalWFUserId()!=null)) {
            dst.set(FIELD_ORIGINALWFUSERID,et.getOriginalWFUserId());
        }
        if(et.isOriginalWFUserNameDirty() && (bIncEmpty||et.getOriginalWFUserName()!=null)) {
            dst.set(FIELD_ORIGINALWFUSERNAME,et.getOriginalWFUserName());
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
        if(et.isUserData3Dirty() && (bIncEmpty||et.getUserData3()!=null)) {
            dst.set(FIELD_USERDATA3,et.getUserData3());
        }
        if(et.isUserData4Dirty() && (bIncEmpty||et.getUserData4()!=null)) {
            dst.set(FIELD_USERDATA4,et.getUserData4());
        }
        if(et.isUserDataInfoDirty() && (bIncEmpty||et.getUserDataInfo()!=null)) {
            dst.set(FIELD_USERDATAINFO,et.getUserDataInfo());
        }
        if(et.isWFActorIdDirty() && (bIncEmpty||et.getWFActorId()!=null)) {
            dst.set(FIELD_WFACTORID,et.getWFActorId());
        }
        if(et.isWFInstanceIdDirty() && (bIncEmpty||et.getWFInstanceId()!=null)) {
            dst.set(FIELD_WFINSTANCEID,et.getWFInstanceId());
        }
        if(et.isWFInstanceNameDirty() && (bIncEmpty||et.getWFInstanceName()!=null)) {
            dst.set(FIELD_WFINSTANCENAME,et.getWFInstanceName());
        }
        if(et.isWFStepIdDirty() && (bIncEmpty||et.getWFStepId()!=null)) {
            dst.set(FIELD_WFSTEPID,et.getWFStepId());
        }
        if(et.isWFStepNameDirty() && (bIncEmpty||et.getWFStepName()!=null)) {
            dst.set(FIELD_WFSTEPNAME,et.getWFStepName());
        }
        if(et.isWFWorkflowIdDirty() && (bIncEmpty||et.getWFWorkflowId()!=null)) {
            dst.set(FIELD_WFWORKFLOWID,et.getWFWorkflowId());
        }
        if(et.isWFWorkflowNameDirty() && (bIncEmpty||et.getWFWorkflowName()!=null)) {
            dst.set(FIELD_WFWORKFLOWNAME,et.getWFWorkflowName());
        }
        if(et.isWFWorkListIdDirty() && (bIncEmpty||et.getWFWorkListId()!=null)) {
            dst.set(FIELD_WFWORKLISTID,et.getWFWorkListId());
        }
        if(et.isWFWorkListNameDirty() && (bIncEmpty||et.getWFWorkListName()!=null)) {
            dst.set(FIELD_WFWORKLISTNAME,et.getWFWorkListName());
        }
        if(et.isWorkInformDirty() && (bIncEmpty||et.getWorkInform()!=null)) {
            dst.set(FIELD_WORKINFORM,et.getWorkInform());
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
        return  WFWorkListBase.remove(this, index);
    }

    /**
     * 通过属性标识删除属性值
     * @param entity
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean remove(WFWorkListBase et,int index) throws Exception {
        switch(index) {
        case INDEX_CANCELFLAG:
            et.resetCancelFlag();
            return true;
        case INDEX_CANCELINFORM:
            et.resetCancelInform();
            return true;
        case INDEX_CREATEDATE:
            et.resetCreateDate();
            return true;
        case INDEX_CREATEMAN:
            et.resetCreateMan();
            return true;
        case INDEX_ORIGINALWFUSERID:
            et.resetOriginalWFUserId();
            return true;
        case INDEX_ORIGINALWFUSERNAME:
            et.resetOriginalWFUserName();
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
        case INDEX_USERDATA3:
            et.resetUserData3();
            return true;
        case INDEX_USERDATA4:
            et.resetUserData4();
            return true;
        case INDEX_USERDATAINFO:
            et.resetUserDataInfo();
            return true;
        case INDEX_WFACTORID:
            et.resetWFActorId();
            return true;
        case INDEX_WFINSTANCEID:
            et.resetWFInstanceId();
            return true;
        case INDEX_WFINSTANCENAME:
            et.resetWFInstanceName();
            return true;
        case INDEX_WFSTEPID:
            et.resetWFStepId();
            return true;
        case INDEX_WFSTEPNAME:
            et.resetWFStepName();
            return true;
        case INDEX_WFWORKFLOWID:
            et.resetWFWorkflowId();
            return true;
        case INDEX_WFWORKFLOWNAME:
            et.resetWFWorkflowName();
            return true;
        case INDEX_WFWORKLISTID:
            et.resetWFWorkListId();
            return true;
        case INDEX_WFWORKLISTNAME:
            et.resetWFWorkListName();
            return true;
        case INDEX_WORKINFORM:
            et.resetWorkInform();
            return true;
        default:
            throw new Exception("不明属性标识");
        }
    }


    private Object objWFInstanceLock = new Object();
    private net.ibizsys.psrt.srv.wf.entity.WFInstance wfinstance = null;
    /**
    * 获取父数据 工作流实例
     * @throws Exception
    */
    public net.ibizsys.psrt.srv.wf.entity.WFInstance getWFInstance() throws Exception {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getWFInstance();
        }

        if(this.getWFInstanceId()==null)
            return null;
        synchronized(objWFInstanceLock) {
            if(wfinstance==null) {
                wfinstance = new net.ibizsys.psrt.srv.wf.entity.WFInstance();
                wfinstance.setWFInstanceId(this.getWFInstanceId());
                net.ibizsys.psrt.srv.wf.service.WFInstanceService service = (net.ibizsys.psrt.srv.wf.service.WFInstanceService)ServiceGlobal.getService(net.ibizsys.psrt.srv.wf.service.WFInstanceService.class,this.getSessionFactory());
                if(this.getWFInstanceId().indexOf(net.ibizsys.paas.service.ServiceBase.TEMPKEY) == 0)
                    service.getTemp(wfinstance);
                else
                    service.get(wfinstance);
            }
            return wfinstance;
        }
    }

    private Object objOriginalWFUserLock = new Object();
    private net.ibizsys.psrt.srv.wf.entity.WFUser originalwfuser = null;
    /**
    * 获取父数据 工作流用户
     * @throws Exception
    */
    public net.ibizsys.psrt.srv.wf.entity.WFUser getOriginalWFUser() throws Exception {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getOriginalWFUser();
        }

        if(this.getOriginalWFUserId()==null)
            return null;
        synchronized(objOriginalWFUserLock) {
            if(originalwfuser==null) {
                originalwfuser = new net.ibizsys.psrt.srv.wf.entity.WFUser();
                originalwfuser.setWFUserId(this.getOriginalWFUserId());
                net.ibizsys.psrt.srv.wf.service.WFUserService service = (net.ibizsys.psrt.srv.wf.service.WFUserService)ServiceGlobal.getService(net.ibizsys.psrt.srv.wf.service.WFUserService.class,this.getSessionFactory());
                if(this.getOriginalWFUserId().indexOf(net.ibizsys.paas.service.ServiceBase.TEMPKEY) == 0)
                    service.getTemp(originalwfuser);
                else
                    service.get(originalwfuser);
            }
            return originalwfuser;
        }
    }



    /**
     *  获取代理的数据对象
     */
    private WFWorkListBase getProxyEntity() {
        return this.proxyWFWorkListBase;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.data.DataObject#onProxy(net.ibizsys.paas.data.IDataObject)
     */
    @Override
    protected void onProxy(IDataObject proxyDataObject) {
        this.proxyWFWorkListBase = null;
        if(proxyDataObject!=null && proxyDataObject instanceof WFWorkListBase) {
            this.proxyWFWorkListBase = (WFWorkListBase)proxyDataObject;
        }
    }

}