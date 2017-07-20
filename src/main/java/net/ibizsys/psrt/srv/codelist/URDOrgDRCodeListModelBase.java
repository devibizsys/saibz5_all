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


@CodeList(id="9C23163B-9D1A-4822-A190-8072AD93C793",name="数据对象能力机构数据范围",type="STATIC",userscope=false,emptytext="未定义",ormode="NUM",textseparator="、")

@CodeItems({
    @CodeItem(value="1",text="当前机构",realtext="当前机构")
    ,@CodeItem(value="2",text="上级机构",realtext="上级机构")
    ,@CodeItem(value="4",text="下级机构",realtext="下级机构")
})


/**
 * 静态代码表[数据对象能力机构数据范围]模型基类
 */
public abstract class URDOrgDRCodeListModelBase extends net.ibizsys.paas.sysmodel.StaticCodeListModelBase  {

    /**
     *  当前机构
     */
    public final static String ITEM_1 = "1";
    /**
     *  上级机构
     */
    public final static String ITEM_2 = "2";
    /**
     *  下级机构
     */
    public final static String ITEM_4 = "4";


    public URDOrgDRCodeListModelBase() {
        super();
        this.initAnnotation(URDOrgDRCodeListModelBase.class);
        CodeListGlobal.registerCodeList("net.ibizsys.psrt.srv.codelist.URDOrgDRCodeListModel", this);
    }

}