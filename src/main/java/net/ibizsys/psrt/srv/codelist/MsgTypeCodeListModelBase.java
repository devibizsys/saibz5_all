/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package net.ibizsys.psrt.srv.codelist;


import net.ibizsys.paas.codelist.CodeItem;
import net.ibizsys.paas.codelist.CodeItems;
import net.ibizsys.paas.codelist.CodeList;
import net.ibizsys.paas.sysmodel.StaticCodeListModelBase;
import net.ibizsys.paas.sysmodel.CodeListGlobal;


@CodeList(id="2a1660eb53ea29312d68746ce032bbe3",name="消息类型",type="STATIC",userscope=false,emptytext="未定义",ormode="NUM",textseparator="、")

@CodeItems({
    @CodeItem(value="1",text="系统消息",realtext="系统消息")
    ,@CodeItem(value="2",text="电子邮件",realtext="电子邮件")
    ,@CodeItem(value="4",text="手机短信",realtext="手机短信")
    ,@CodeItem(value="8",text="MSN消息",realtext="MSN消息")
    ,@CodeItem(value="16",text="检务通消息",realtext="检务通消息")
    ,@CodeItem(value="32",text="微信",realtext="微信")
})


/**
 * 静态代码表[消息类型]模型基类
 */
public abstract class MsgTypeCodeListModelBase extends net.ibizsys.paas.sysmodel.StaticCodeListModelBase  {

    /**
     *  系统消息
     */
    public final static Integer INTERNAL = 1;
    /**
     *  电子邮件
     */
    public final static Integer EMAIL = 2;
    /**
     *  手机短信
     */
    public final static Integer SMS = 4;
    /**
     *  MSN消息
     */
    public final static Integer MSN = 8;
    /**
     *  检务通消息
     */
    public final static Integer SAIM = 16;
    /**
     *  微信
     */
    public final static Integer WT = 32;


    public MsgTypeCodeListModelBase() {
        super();
        this.initAnnotation(MsgTypeCodeListModelBase.class);
        CodeListGlobal.registerCodeList("net.ibizsys.psrt.srv.codelist.MsgTypeCodeListModel", this);
    }

}