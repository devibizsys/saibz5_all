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


@CodeList(id="f9136e01a897256172bd4b56ecc222e0",name="本地语言",type="STATIC",userscope=false,emptytext="未定义")

@CodeItems({
    @CodeItem(value="EN",text="英文",realtext="英文")
    ,@CodeItem(value="ZH_CN",text="中文简体",realtext="中文简体")
    ,@CodeItem(value="ZH_TW",text="中文繁体（台湾）",realtext="中文繁体（台湾）")
})


/**
 * 静态代码表[本地语言]模型基类
 */
public abstract class CodeList56CodeListModelBase extends net.ibizsys.paas.sysmodel.StaticCodeListModelBase  {

    /**
     *  英文
     */
    public final static String EN = "EN";
    /**
     *  中文简体
     */
    public final static String ZH_CN = "ZH_CN";
    /**
     *  中文繁体（台湾）
     */
    public final static String ZH_TW = "ZH_TW";


    public CodeList56CodeListModelBase() {
        super();
        this.initAnnotation(CodeList56CodeListModelBase.class);
        CodeListGlobal.registerCodeList("net.ibizsys.psrt.srv.codelist.CodeList56CodeListModel", this);
    }

}