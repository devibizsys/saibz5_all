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


@CodeList(id="2970295eebeaab891a13f1634eadb668",name="服务运行状态",type="STATIC",userscope=false,emptytext="未定义")

@CodeItems({
    @CodeItem(value="START",text="已启动",realtext="已启动")
    ,@CodeItem(value="STOP",text="已停止",realtext="已停止")
    ,@CodeItem(value="STARTERROR",text="启动错误",realtext="启动错误")
})


/**
 * 静态代码表[服务运行状态]模型基类
 */
public abstract class ServiceRunStateCodeListModelBase extends net.ibizsys.paas.sysmodel.StaticCodeListModelBase  {

    /**
     *  已启动
     */
    public final static String START = "START";
    /**
     *  已停止
     */
    public final static String STOP = "STOP";
    /**
     *  启动错误
     */
    public final static String STARTERROR = "STARTERROR";


    public ServiceRunStateCodeListModelBase() {
        super();
        this.initAnnotation(ServiceRunStateCodeListModelBase.class);
        CodeListGlobal.registerCodeList("net.ibizsys.psrt.srv.codelist.ServiceRunStateCodeListModel", this);
    }

}