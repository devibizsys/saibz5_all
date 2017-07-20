package net.ibizsys.paas.util;

import net.ibizsys.paas.data.IDataItem;
import net.ibizsys.paas.data.IDataItemParam;
import net.ibizsys.paas.data.ISimpleDataObject;
import net.ibizsys.paas.web.IWebContext;

/**
 * 数据项辅助对象
 * 
 * @author Administrator
 *
 */
public class DataItemHelper {

	/**
	 * 获取数据项结果
	 * 
	 * @param iDataItem
	 * @param iWebContext
	 * @param object
	 * @return
	 * @throws Exception
	 */
	public static Object getValue(IDataItem iDataItem, IWebContext iWebContext, Object object) throws Exception {
		if (iDataItem.getDataItemParams() == null || iDataItem.getDataItemParams().length == 0) {
			return internalGetDataItemValue(iDataItem, iWebContext, object);
		}

		Object[] objs = new Object[iDataItem.getDataItemParams().length];
		for (int i = 0; i < iDataItem.getDataItemParams().length; i++) {
			IDataItemParam iDataItemParam = (iDataItem.getDataItemParams())[i];
			objs[i] = internalGetDataItemParamValue(iDataItemParam, iWebContext, object);
		}

		return StringHelper.format(iDataItem.getFormat(), objs);
	}

	/**
	 * 获取数据项结果
	 * 
	 * @param iDataItem
	 * @param iWebContext
	 * @param object
	 * @return
	 * @throws Exception
	 */
	protected static Object internalGetDataItemValue(IDataItem iDataItem, IWebContext iWebContext, Object object) throws Exception {
		if (object instanceof ISimpleDataObject) {
			ISimpleDataObject iSimpleDataObject = (ISimpleDataObject) object;
			if (iSimpleDataObject.isNull(iDataItem.getName())) return iDataItem.getDefaultValue();

			Object objValue = iSimpleDataObject.get(iDataItem.getName());
			if (objValue == null) return iDataItem.getDefaultValue();

			if (!StringHelper.isNullOrEmpty(iDataItem.getFormat())) {
				objValue = StringHelper.format(iDataItem.getFormat(), objValue);
			}

			// if(!StringHelper.isNullOrEmpty(getCodeListId()))
			// {
			// ICodeList iCodeList = getCodeList(iWebContext,getCodeListId());
			// return iCodeList.getCodeListText(objValue.toString(), true);
			// }
			return objValue;
		}

		throw new Exception(StringHelper.format("无法识别的数据对象"));
	}

	/**
	 * 内部获取数据项参数值
	 * 
	 * @param iDataItemParam
	 * @param iWebContext
	 * @param object
	 * @return
	 * @throws Exception
	 */
	protected static Object internalGetDataItemParamValue(IDataItemParam iDataItemParam, IWebContext iWebContext, Object object) throws Exception {
		if (object instanceof ISimpleDataObject) {
			ISimpleDataObject iSimpleDataObject = (ISimpleDataObject) object;
			if (iSimpleDataObject.isNull(iDataItemParam.getName())) return iDataItemParam.getDefaultValue();

			Object objValue = iSimpleDataObject.get(iDataItemParam.getName());
			if (objValue == null) return iDataItemParam.getDefaultValue();

			if (!StringHelper.isNullOrEmpty(iDataItemParam.getFormat())) {
				objValue = StringHelper.format(iDataItemParam.getFormat(), objValue);
			}

			// if(!StringHelper.isNullOrEmpty(getCodeListId()))
			// {
			// ICodeList iCodeList = getCodeList(iWebContext,getCodeListId());
			// return iCodeList.getCodeListText(objValue.toString(), true);
			// }
			return objValue;
		}

		throw new Exception(StringHelper.format("无法识别的数据对象"));
	}

}
