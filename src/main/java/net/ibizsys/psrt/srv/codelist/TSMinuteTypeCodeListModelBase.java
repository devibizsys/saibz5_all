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


@CodeList(id="7f9c59497ee367e966cdf72ee069b941",name="任务时刻策略分钟类型",type="STATIC",userscope=false,emptytext="未定义")

@CodeItems({
    @CodeItem(value="ZERO",text="0分",realtext="0分")
    ,@CodeItem(value="EVERY",text="每分钟",realtext="每分钟")
    ,@CodeItem(value="SOME",text="指定分钟",realtext="指定分钟")
})


/**
 * 静态代码表[任务时刻策略分钟类型]模型基类
 */
public abstract class TSMinuteTypeCodeListModelBase extends net.ibizsys.paas.sysmodel.StaticCodeListModelBase  {

    /**
     *  0分
     */
    public final static String ZERO = "ZERO";
    /**
     *  每分钟
     */
    public final static String EVERY = "EVERY";
    /**
     *  指定分钟
     */
    public final static String SOME = "SOME";


    public TSMinuteTypeCodeListModelBase() {
        super();
        this.initAnnotation(TSMinuteTypeCodeListModelBase.class);
        CodeListGlobal.registerCodeList("net.ibizsys.psrt.srv.codelist.TSMinuteTypeCodeListModel", this);
    }

}