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


@CodeList(id="411E3062-CE37-4A19-9BBD-782E474249FA",name="数据对象能力部门数据范围",type="STATIC",userscope=false,emptytext="未定义",ormode="NUM",textseparator="、")

@CodeItems({
    @CodeItem(value="1",text="当前部门",realtext="当前部门")
    ,@CodeItem(value="2",text="上级部门",realtext="上级部门")
    ,@CodeItem(value="4",text="下级部门",realtext="下级部门")
})


/**
 * 静态代码表[数据对象能力部门数据范围]模型基类
 */
public abstract class URDSecDRCodeListModelBase extends net.ibizsys.paas.sysmodel.StaticCodeListModelBase  {

    /**
     *  当前部门
     */
    public final static String ITEM_1 = "1";
    /**
     *  上级部门
     */
    public final static String ITEM_2 = "2";
    /**
     *  下级部门
     */
    public final static String ITEM_4 = "4";


    public URDSecDRCodeListModelBase() {
        super();
        this.initAnnotation(URDSecDRCodeListModelBase.class);
        CodeListGlobal.registerCodeList("net.ibizsys.psrt.srv.codelist.URDSecDRCodeListModel", this);
    }

}