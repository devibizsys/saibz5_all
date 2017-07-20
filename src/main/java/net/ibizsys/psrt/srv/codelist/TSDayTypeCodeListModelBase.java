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


@CodeList(id="35036e9cf0dd69712323e8d5858f66c5",name="任务时刻策略天时类型",type="STATIC",userscope=false,emptytext="未定义")

@CodeItems({
    @CodeItem(value="EVERY",text="每小时",realtext="每小时")
    ,@CodeItem(value="SOME",text="指定小时",realtext="指定小时")
})


/**
 * 静态代码表[任务时刻策略天时类型]模型基类
 */
public abstract class TSDayTypeCodeListModelBase extends net.ibizsys.paas.sysmodel.StaticCodeListModelBase  {

    /**
     *  每小时
     */
    public final static String EVERY = "EVERY";
    /**
     *  指定小时
     */
    public final static String SOME = "SOME";


    public TSDayTypeCodeListModelBase() {
        super();
        this.initAnnotation(TSDayTypeCodeListModelBase.class);
        CodeListGlobal.registerCodeList("net.ibizsys.psrt.srv.codelist.TSDayTypeCodeListModel", this);
    }

}