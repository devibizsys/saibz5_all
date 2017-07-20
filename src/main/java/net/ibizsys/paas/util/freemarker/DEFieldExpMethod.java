package net.ibizsys.paas.util.freemarker;

import java.util.List;

import net.ibizsys.paas.core.DEDataSetFetchContext;
import net.ibizsys.paas.core.DataTypes;
import net.ibizsys.paas.core.IDEDataQueryCode;
import net.ibizsys.paas.core.IDEDataSetFetchContext;
import net.ibizsys.paas.data.DataObject;
import net.ibizsys.paas.data.ISimpleDataObject;
import net.ibizsys.paas.db.SqlParam;
import net.ibizsys.paas.db.SqlParamList;
import net.ibizsys.paas.demodel.DEModelGlobal;
import net.ibizsys.paas.demodel.IDEFieldModel;
import net.ibizsys.paas.demodel.IDataEntityModel;
import net.ibizsys.paas.entity.IEntity;
import net.ibizsys.paas.service.DataContextParam;
import net.ibizsys.paas.service.IDataContextParam;
import net.ibizsys.paas.service.ServiceBase;
import net.ibizsys.paas.util.DataTypeHelper;
import net.ibizsys.paas.util.StringHelper;
import net.ibizsys.paas.web.WebContext;
import net.sf.json.JSONObject;

import org.hibernate.SessionFactory;

import freemarker.template.TemplateMethodModel;
import freemarker.template.TemplateModelException;

/**
 * 实体属性表达式方法
 * 
 * @author Administrator
 *
 */
public class DEFieldExpMethod implements TemplateMethodModel {
	private IDEDataQueryCode iDEDataQueryCode = null;

	public DEFieldExpMethod(IDEDataQueryCode iDEDataQueryCode) {
		this.iDEDataQueryCode = iDEDataQueryCode;
	}

	public Object exec(List arg0) throws TemplateModelException {
		try {
			if (arg0.size() == 0) {
				throw new Exception(StringHelper.format("没有指定当前数据参数"));
			}

			String strKey = arg0.get(0).toString().toUpperCase();

			String strExp = iDEDataQueryCode.getDEFieldExp(strKey, false);
			return strExp;
		} catch (Exception ex) {
			throw new TemplateModelException(ex);
		}

	}

}
