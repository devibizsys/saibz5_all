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


@CodeList(id="58f0fed9747366a0a78600542825acf9",name="数据表空间",type="STATIC",userscope=false,emptytext="未定义")

@CodeItems({
    @CodeItem(value="USERSPACE2",text="16K",realtext="16K")
})


/**
 * 静态代码表[数据表空间]模型基类
 */
public abstract class DETableSpaceCodeListModelBase extends net.ibizsys.paas.sysmodel.StaticCodeListModelBase  {

    /**
     *  16K
     */
    public final static String USERSPACE2 = "USERSPACE2";


    public DETableSpaceCodeListModelBase() {
        super();
        this.initAnnotation(DETableSpaceCodeListModelBase.class);
        CodeListGlobal.registerCodeList("net.ibizsys.psrt.srv.codelist.DETableSpaceCodeListModel", this);
    }

}