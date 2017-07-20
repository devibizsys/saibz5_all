/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package net.ibizsys.psrt.srv.wf.demodel.wfcustomprocess.dataset;


import net.ibizsys.paas.core.DEDataSet;
import net.ibizsys.paas.core.DEDataSetQuery;
import net.ibizsys.paas.sysmodel.CodeListGlobal;
import net.ibizsys.paas.codelist.ICodeList;
import net.ibizsys.paas.demodel.DEDataSetGroupParamModel;

@DEDataSet(id="4b334725c65c703dfa12a6ed7103a9da",name="DEFAULT",queries= {
    @DEDataSetQuery(queryid="042C742C-717B-4437-83DA-6717A0D1A255",queryname="DEFAULT")
})

/**
 *  实体数据集合[DEFAULT]模型基类
 */
public abstract class WFCustomProcessDefaultDSModelBase extends net.ibizsys.paas.demodel.DEDataSetModelBase {
    public WFCustomProcessDefaultDSModelBase() {
        super();

        this.initAnnotation(WFCustomProcessDefaultDSModelBase.class);
    }




}