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


@CodeList(id="b1399130682a28fb341c4b507f54a428",name="是否（蓝、红）",type="STATIC",userscope=false,emptytext="未定义")

@CodeItems({
    @CodeItem(value="1",text="是",realtext="是")
    ,@CodeItem(value="0",text="否",realtext="否")
})


/**
 * 静态代码表[是否（蓝、红）]模型基类
 */
public abstract class CodeList50CodeListModelBase extends net.ibizsys.paas.sysmodel.StaticCodeListModelBase  {

    /**
     *  是
     */
    public final static String ITEM_1 = "1";
    /**
     *  否
     */
    public final static String ITEM_0 = "0";


    public CodeList50CodeListModelBase() {
        super();
        this.initAnnotation(CodeList50CodeListModelBase.class);
        CodeListGlobal.registerCodeList("net.ibizsys.psrt.srv.codelist.CodeList50CodeListModel", this);
    }

}