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


@CodeList(id="1e8acf2ededdd5ba8c440d940b493ef1",name="消息模板内容类型",type="STATIC",userscope=false)

@CodeItems({
@CodeItem(value="TEXT",text="纯文本",realtext="纯文本" )
,@CodeItem(value="HTML",text="HTML网页",realtext="HTML网页" )
})


/**
 * 消息模板内容类型代码表模型基类
 */
public abstract class CodeList42CodeListModelBase extends net.ibizsys.paas.sysmodel.StaticCodeListModelBase  {

   /**
    *  纯文本
    */
   public final static String TEXT = "TEXT";
   /**
    *  HTML网页
    */
   public final static String HTML = "HTML";


   public CodeList42CodeListModelBase(){
        super();
         this.initAnnotation(CodeList42CodeListModelBase.class); 
        CodeListGlobal.registerCodeList("net.ibizsys.psrt.srv.codelist.CodeList42CodeListModel", this);
      
   }


 
}