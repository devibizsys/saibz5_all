package net.ibizsys.paas.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**
 * JSONObject 辅助对象
 * 
 * @author lionlau
 *
 */
public class JSONObjectHelper {
	public JSONObjectHelper() {
	}

	/**
	 * 从文件中构建
	 * 
	 * @param file
	 * @return
	 */
	public static JSONObject fromFile(File file) throws Exception {
		ByteBuffer inBuf = null;
		// 读出源数据
		FileInputStream inFile = null;
		try {
			inFile = new FileInputStream(file);
			inBuf = ByteBuffer.allocate((int) inFile.getChannel().size());
			// 将内容读出
			ByteBuffer readBuf = ByteBuffer.allocate(8);
			FileChannel srcChannel = inFile.getChannel();
			while (true) {
				int nRet = replenish(srcChannel, readBuf);
				if (nRet == -1) {
					break;
				}

				inBuf.put(readBuf.array(), 0, nRet);

				readBuf.clear();
			}
			inFile.close();

		} catch (IOException ex) {
			throw ex;
		}

		String strRet = new String(inBuf.array(), "UTF-8");
		return JSONObject.fromString(strRet);
	}

	private static int replenish(FileChannel channel, ByteBuffer buf) throws IOException {
		long byteLeft = channel.size() - channel.position();
		if (byteLeft == 0L) {
			return -1;
		}
		buf.position(0);
		buf.limit(buf.position() + (byteLeft < 8 ? (int) byteLeft : 8));
		return channel.read(buf);
	}

	/**
	 * 设置对象属性
	 * 
	 * @param jsonObject
	 * @param strPropertyName
	 * @param objValue
	 * @throws Exception
	 */
	public static void put(JSONObject jsonObject, String strPropertyName, Object objValue) throws Exception {
		put(jsonObject, strPropertyName, objValue, true);
	}

	/**
	 * 设置对象属性
	 * 
	 * @param jsonObject
	 * @param strPropertyName
	 * @param objValue
	 * @param bRemoveIfExists 如存在属性，是否移除，不移除则忽略
	 * @throws Exception
	 */
	public static void put(JSONObject jsonObject, String strPropertyName, Object objValue, boolean bRemoveIfExists) throws Exception {
		if (jsonObject.has(strPropertyName)) {
			if (bRemoveIfExists)
				jsonObject.remove(strPropertyName);
			else
				return;
		}

		jsonObject.put(strPropertyName, objValue);
	}

	/**
	 * 删除对象属性
	 * 
	 * @param jsonObject
	 * @param strPropertyName
	 * @throws Exception
	 */
	public static void remove(JSONObject jsonObject, String strPropertyName) throws Exception {
		if (jsonObject.has(strPropertyName)) {
			jsonObject.remove(strPropertyName);
		}
	}

	/**
	 * 增加子对象（放到集合中）
	 * 
	 * @param jsonObject
	 * @param strPropertyName
	 * @param objValue
	 * @throws Exception
	 */
	public static void addToChildList(JSONObject jsonObject, String strPropertyName, Object objValue) throws Exception {
		JSONArray list = null;
		Object object = jsonObject.opt(strPropertyName);
		if (object != null) {
			if (!(object instanceof JSONArray)) {
				throw new Exception(StringHelper.format("子属性已经存在，但不是数组对象"));
			}
			list = (JSONArray) object;
		} else {
			list = new JSONArray();
			jsonObject.put(strPropertyName, list);
		}

		int nIndex = list.length();
		list.put(nIndex, objValue);
		jsonObject.remove(strPropertyName);
		jsonObject.put(strPropertyName, list);
	}

}
