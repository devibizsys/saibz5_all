package net.ibizsys.paas.util;

import java.io.File;

import net.ibizsys.paas.web.IWebContext;
import net.ibizsys.paas.web.WebConfig;

/**
 * 文件辅助对象
 * 
 * @author Administrator
 *
 */
public class FileHelper {
	/**
	 * 获取临时文件
	 * 
	 * @param iWebContext
	 * @param strFileName
	 * @param strFileExt
	 * @return
	 * @throws Exception
	 */
	static public String getTmpFileName(IWebContext iWebContext, String strFileName, String strFileExt) throws Exception {
		if (StringHelper.isNullOrEmpty(strFileName)) {
			strFileName = KeyValueHelper.genGuidEx();
		}
		// if(StringHelper.isNullOrEmpty(strFileExt))
		// {
		// strFileExt = ".tmp";
		// }
		if (StringHelper.isNullOrEmpty(iWebContext)) {
			return StringHelper.format("%1$s%2$s%3$s", WebConfig.getCurrent().getTempPath(), strFileName, strFileExt);
		} else {
			String strFolder = StringHelper.format("%1$s%2$s%3$s", WebConfig.getCurrent().getTempPath(), iWebContext.getSessionId(), File.separator);
			File file = new File(strFolder);
			file.mkdirs();
			return StringHelper.format("%1$s%2$s%3$s%4$s%5$s", WebConfig.getCurrent().getTempPath(), iWebContext.getSessionId(), File.separator, strFileName, strFileExt);
		}
	}
}
