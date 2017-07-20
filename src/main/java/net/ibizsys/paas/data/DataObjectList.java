package net.ibizsys.paas.data;

import java.util.ArrayList;
import java.util.Vector;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**
 * 数据对象列表
 * 
 * @author lionlau
 *
 */
public class DataObjectList extends ArrayList<IDataObject> {
	/**
	 * 从JsonArray对象构建
	 * 
	 * @param jsonArray
	 * @return
	 * @throws Exception
	 */
	public static DataObjectList fromJSONArray(JSONArray jsonArray) throws Exception {
		DataObjectList dataObjects = new DataObjectList();
		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonobject = jsonArray.getJSONObject(i);
			IDataObject iDataObject = DataObject.fromJSONObject(jsonobject);
			dataObjects.add(iDataObject);
		}
		return dataObjects;
	}

	/**
	 * 将数据对象集合导出为JSON数组
	 * 
	 * @param bIncludeEmpty
	 * @return
	 */
	public JSONArray toJSONArray(boolean bIncludeEmpty) throws Exception {
		Vector<JSONObject> arr = new Vector<JSONObject>();
		for (IDataObject dataEntity : this) {
			JSONObject jsonObject = new JSONObject();
			dataEntity.fillJSONObject(jsonObject, bIncludeEmpty);
			arr.add(jsonObject);
		}
		return JSONArray.fromArray(arr.toArray());
	}
}
