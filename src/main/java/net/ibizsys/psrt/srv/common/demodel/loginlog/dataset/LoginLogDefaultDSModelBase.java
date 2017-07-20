/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package net.ibizsys.psrt.srv.common.demodel.loginlog.dataset;


import net.ibizsys.paas.core.DEDataSet;
import net.ibizsys.paas.core.DEDataSetQuery;
import net.ibizsys.paas.sysmodel.CodeListGlobal;
import net.ibizsys.paas.codelist.ICodeList;
import net.ibizsys.paas.demodel.DEDataSetGroupParamModel;

@DEDataSet(id="7628b30c66aaeab68c9aec1aed3f7e21",name="DEFAULT",queries= {
    @DEDataSetQuery(queryid="1C4097C4-2AC5-4E47-9534-F4E676B4D549",queryname="DEFAULT")
})

/**
 *  实体数据集合[DEFAULT]模型基类
 */
public abstract class LoginLogDefaultDSModelBase extends net.ibizsys.paas.demodel.DEDataSetModelBase {
    public LoginLogDefaultDSModelBase() {
        super();

        this.initAnnotation(LoginLogDefaultDSModelBase.class);
    }




}