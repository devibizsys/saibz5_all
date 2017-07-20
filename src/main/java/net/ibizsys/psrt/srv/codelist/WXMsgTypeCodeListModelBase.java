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


@CodeList(id="160cb29c905b8f5975d3ef6c756b0b40",name="微信消息类型",type="STATIC",userscope=false,emptytext="未定义")

@CodeItems({
    @CodeItem(value="text",text="text",realtext="text")
    ,@CodeItem(value="image",text="image",realtext="image")
    ,@CodeItem(value="voice",text="voice",realtext="voice")
    ,@CodeItem(value="video",text="video",realtext="video")
    ,@CodeItem(value="location",text="location",realtext="location")
    ,@CodeItem(value="link",text="link",realtext="link")
    ,@CodeItem(value="event",text="event",realtext="event")
    ,@CodeItem(value="simplenews",text="单一图文（无图片）",realtext="单一图文（无图片）")
})


/**
 * 静态代码表[微信消息类型]模型基类
 */
public abstract class WXMsgTypeCodeListModelBase extends net.ibizsys.paas.sysmodel.StaticCodeListModelBase  {

    /**
     *  text
     */
    public final static String TEXT = "text";
    /**
     *  image
     */
    public final static String IMAGE = "image";
    /**
     *  voice
     */
    public final static String VOICE = "voice";
    /**
     *  video
     */
    public final static String VIDEO = "video";
    /**
     *  location
     */
    public final static String LOCATION = "location";
    /**
     *  link
     */
    public final static String LINK = "link";
    /**
     *  event
     */
    public final static String EVENT = "event";
    /**
     *  单一图文（无图片）
     */
    public final static String SIMPLENEWS = "simplenews";


    public WXMsgTypeCodeListModelBase() {
        super();
        this.initAnnotation(WXMsgTypeCodeListModelBase.class);
        CodeListGlobal.registerCodeList("net.ibizsys.psrt.srv.codelist.WXMsgTypeCodeListModel", this);
    }

}