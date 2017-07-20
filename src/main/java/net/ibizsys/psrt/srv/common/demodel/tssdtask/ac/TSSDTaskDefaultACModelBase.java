/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package net.ibizsys.psrt.srv.common.demodel.tssdtask.ac;

import net.ibizsys.paas.core.DEACMode;
import net.ibizsys.paas.data.DataItem;
import net.ibizsys.paas.data.DataItemParam;



@DEACMode(name="DEFAULT",id="f8d12641ce30b874fa6c58f749b0bb73",defaultmode=true,dataitems= {
    @DataItem(name="value",dataitemparams={
        @DataItemParam(name="TSSDTASKID",format="")
    })
    , @DataItem(name="text",dataitemparams={
        @DataItemParam(name="TSSDTASKNAME",format="")
    })
}
         )

/**
 *  实体自动填充 [DEFAULT]对象模型基类
 */
public abstract class TSSDTaskDefaultACModelBase extends net.ibizsys.paas.demodel.DEACModelBase {

    public final static String NAME = "DEFAULT";

    public TSSDTaskDefaultACModelBase() {
        super();

        this.initAnnotation(TSSDTaskDefaultACModelBase.class);
    }

}