package net.ibizsys.paas.view;

import net.ibizsys.paas.core.ModelBaseImpl;
import net.sf.json.JSONObject;

/**
 * 视图向导对象
 * 
 * @author Administrator
 *
 */
public class ViewWizard extends ModelBaseImpl implements IViewWizard {

	/**
	 * 标识
	 */
	public final static String ID = "id";
	
	/**
	 * 名称
	 */
	public final static String NAME = "name";
	
	
	/**
	 * URL
	 */
	public final static String URL = "url";
	

	private String strWizardUrl = null;



	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.view.IViewWizard#getWizardUrl()
	 */
	@Override
	public String getWizardUrl() {
		return this.strWizardUrl;
	}

	
	/**
	 * 设置向导的Url路径
	 * 
	 * @param strWizardUrl
	 */
	public void setWizardUrl(String strWizardUrl) {
		this.strWizardUrl = strWizardUrl;
	}

	
	/**
	 * 设置标识
	 * @param strId
	 */
	public void setId(String strId){
		this.strId = strId;
	}
	
	/**
	 * 设置名称
	 * @param strName
	 */
	public void setName(String strName){
		this.strName = strName;
	}
	

	/**
	 * 导出JSON对象
	 * 
	 * @param jsonObject
	 * @param iViewWizard
	 * @return
	 * @throws Exception
	 */
	public static JSONObject toJSONObject(JSONObject jsonObject, IViewWizard iViewWizard) throws Exception {
		if (jsonObject == null) jsonObject = new JSONObject();

		jsonObject.put(ID, iViewWizard.getId());
		jsonObject.put(NAME, iViewWizard.getName());
		jsonObject.put(URL, iViewWizard.getWizardUrl());
		
		return jsonObject;
	}

	

}
