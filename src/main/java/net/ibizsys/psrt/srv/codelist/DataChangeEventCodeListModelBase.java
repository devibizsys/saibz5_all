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


@CodeList(id="b2d07f091fbac36e499f4904f56d4b41",name="数据通知监控行为",type="STATIC",userscope=false,emptytext="未定义")

@CodeItems({
    @CodeItem(value="1",text="新建",realtext="新建")
    ,@CodeItem(value="2",text="更新",realtext="更新")
    ,@CodeItem(value="3",text="新建或更新",realtext="新建或更新")
    ,@CodeItem(value="4",text="删除",realtext="删除")
})


/**
 * 静态代码表[数据通知监控行为]模型基类
 */
public abstract class DataChangeEventCodeListModelBase extends net.ibizsys.paas.sysmodel.StaticCodeListModelBase  {

    /**
     *  新建
     */
    public final static Integer CREATE = 1;
    /**
     *  更新
     */
    public final static Integer UPDATE = 2;
    /**
     *  新建或更新
     */
    public final static Integer CREATEORUPDATE = 3;
    /**
     *  删除
     */
    public final static Integer DELETE = 4;


    public DataChangeEventCodeListModelBase() {
        super();
        this.initAnnotation(DataChangeEventCodeListModelBase.class);
        CodeListGlobal.registerCodeList("net.ibizsys.psrt.srv.codelist.DataChangeEventCodeListModel", this);
    }

}