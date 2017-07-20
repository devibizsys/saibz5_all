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


@CodeList(id="1d4e7da5672612464d0f950804264dee",name="数据同步代理类型（静态）",type="STATIC",userscope=false,emptytext="未定义")

@CodeItems({
    @CodeItem(value="ACTIVEMQ",text="ActiveMQ",realtext="ActiveMQ")
})


/**
 * 静态代码表[数据同步代理类型（静态）]模型基类
 */
public abstract class DataSyncAgentTypeCodeListModelBase extends net.ibizsys.paas.sysmodel.StaticCodeListModelBase  {

    /**
     *  ActiveMQ
     */
    public final static String ACTIVEMQ = "ACTIVEMQ";


    public DataSyncAgentTypeCodeListModelBase() {
        super();
        this.initAnnotation(DataSyncAgentTypeCodeListModelBase.class);
        CodeListGlobal.registerCodeList("net.ibizsys.psrt.srv.codelist.DataSyncAgentTypeCodeListModel", this);
    }

}