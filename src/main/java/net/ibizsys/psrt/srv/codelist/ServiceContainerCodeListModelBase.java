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


@CodeList(id="63748958-1A41-4576-89B9-1372F0121833",name="服务容器",type="STATIC",userscope=false,emptytext="未定义")

@CodeItems({
    @CodeItem(value="SC01",text="服务容器01",realtext="服务容器01")
    ,@CodeItem(value="SC02",text="服务容器02",realtext="服务容器02")
    ,@CodeItem(value="SC03",text="服务容器03",realtext="服务容器03")
    ,@CodeItem(value="SC04",text="服务容器04",realtext="服务容器04")
})


/**
 * 静态代码表[服务容器]模型基类
 */
public abstract class ServiceContainerCodeListModelBase extends net.ibizsys.paas.sysmodel.StaticCodeListModelBase  {

    /**
     *  服务容器01
     */
    public final static String SC01 = "SC01";
    /**
     *  服务容器02
     */
    public final static String SC02 = "SC02";
    /**
     *  服务容器03
     */
    public final static String SC03 = "SC03";
    /**
     *  服务容器04
     */
    public final static String SC04 = "SC04";


    public ServiceContainerCodeListModelBase() {
        super();
        this.initAnnotation(ServiceContainerCodeListModelBase.class);
        CodeListGlobal.registerCodeList("net.ibizsys.psrt.srv.codelist.ServiceContainerCodeListModel", this);
    }

}