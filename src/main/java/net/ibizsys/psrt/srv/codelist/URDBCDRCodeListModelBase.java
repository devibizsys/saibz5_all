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


@CodeList(id="9B2D286D-54EB-4586-BA34-57C963DA276A",name="数据对象能力条线数据范围",type="STATIC",userscope=false,emptytext="未定义",ormode="NUM",textseparator="、")

@CodeItems({
    @CodeItem(value="1",text="当前条线",realtext="当前条线")
})


/**
 * 静态代码表[数据对象能力条线数据范围]模型基类
 */
public abstract class URDBCDRCodeListModelBase extends net.ibizsys.paas.sysmodel.StaticCodeListModelBase  {

    /**
     *  当前条线
     */
    public final static Integer CURBC = 1;


    public URDBCDRCodeListModelBase() {
        super();
        this.initAnnotation(URDBCDRCodeListModelBase.class);
        CodeListGlobal.registerCodeList("net.ibizsys.psrt.srv.codelist.URDBCDRCodeListModel", this);
    }

}