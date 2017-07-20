/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package net.ibizsys.psrt.srv.common.demodel.tssdtasklog.dataset;


import net.ibizsys.paas.core.DEDataSet;
import net.ibizsys.paas.core.DEDataSetQuery;
import net.ibizsys.paas.sysmodel.CodeListGlobal;
import net.ibizsys.paas.codelist.ICodeList;
import net.ibizsys.paas.demodel.DEDataSetGroupParamModel;

@DEDataSet(id="5d9604bc9220d47f935650303d154680",name="DEFAULT",queries= {
    @DEDataSetQuery(queryid="966CF9BD-AE11-4915-B195-7DA3DEEE7E0E",queryname="DEFAULT")
})

/**
 *  实体数据集合[DEFAULT]模型基类
 */
public abstract class TSSDTaskLogDefaultDSModelBase extends net.ibizsys.paas.demodel.DEDataSetModelBase {
    public TSSDTaskLogDefaultDSModelBase() {
        super();

        this.initAnnotation(TSSDTaskLogDefaultDSModelBase.class);
    }




}