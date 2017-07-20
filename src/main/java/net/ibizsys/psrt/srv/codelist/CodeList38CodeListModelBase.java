package net.ibizsys.psrt.srv.codelist;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.lang.annotation.Annotation;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.stereotype.Component;
import net.ibizsys.paas.codelist.CodeItem;
import net.ibizsys.paas.codelist.CodeItems;
import net.ibizsys.paas.codelist.CodeList;
import net.ibizsys.paas.sysmodel.DynamicCodeListModelBase;
import net.ibizsys.paas.sysmodel.StaticCodeListModelBase;
import net.ibizsys.paas.sysmodel.CodeListGlobal;

import net.ibizsys.paas.db.DBFetchResult;


@CodeList(id="2970295eebeaab891a13f1634eadb668",name="服务运行状态",type="STATIC",userscope=false)

@CodeItems({
@CodeItem(value="START",text="启动",realtext="启动" )
,@CodeItem(value="STOP",text="停止",realtext="停止" )
})


/**
 * 服务运行状态代码表模型基类
 */
public abstract class CodeList38CodeListModelBase extends net.ibizsys.paas.sysmodel.StaticCodeListModelBase  {

   /**
    *  启动
    */
   public final static String START = "START";
   /**
    *  停止
    */
   public final static String STOP = "STOP";


   public CodeList38CodeListModelBase(){
        super();
         this.initAnnotation(CodeList38CodeListModelBase.class); 
        CodeListGlobal.registerCodeList("net.ibizsys.psrt.srv.codelist.CodeList38CodeListModel", this);
      
   }


 
}