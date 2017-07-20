package net.ibizsys.paas.web.jquery.render;

import net.ibizsys.paas.core.DEDataSetFetchContext;
import net.ibizsys.paas.ctrlhandler.ICtrlRender;
import net.ibizsys.paas.ctrlhandler.IGridRender;
import net.ibizsys.paas.ctrlhandler.IMDCtrlRender;
import net.ibizsys.paas.ctrlhandler.MDCtrlHandlerBase;
import net.ibizsys.paas.ctrlmodel.IGridModel;
import net.ibizsys.paas.db.IDataTable;
import net.ibizsys.paas.util.StringHelper;
import net.ibizsys.paas.util.spring.IBizOverride;
import net.ibizsys.paas.web.AjaxActionResult;
import net.ibizsys.paas.web.IWebContext;
import net.ibizsys.paas.web.MDAjaxActionResult;
import net.ibizsys.paas.web.WebContext;
import net.sf.json.JSONObject;

@IBizOverride
public class GridPQGridRender  implements ICtrlRender, IMDCtrlRender, IGridRender{
	@Override
	public void fillDEDataSetFetchContext(DEDataSetFetchContext deDataSetFetchContextImpl) throws Exception
	{
		IWebContext iWebContext = WebContext.getCurrent();
		if (iWebContext == null)
		{
			return;
		}

		String strSort0 = null;
		String strOrder0Column = iWebContext.getPostOrParamValue("order[0][column]");
		String strOrder0Dir = iWebContext.getPostOrParamValue("order[0][dir]");

		if (!StringHelper.isNullOrEmpty(strOrder0Column) && !StringHelper.isNullOrEmpty(strOrder0Column))
		{
			strSort0 = iWebContext.getPostOrParamValue(String.format("columns[%1$s][data]", strOrder0Column));
		}

		String strSort1 = null;
		String strOrder1Column = iWebContext.getPostOrParamValue("order[1][column]");
		String strOrder1Dir = iWebContext.getPostOrParamValue("order[1][dir]");

		if (!StringHelper.isNullOrEmpty(strOrder1Column) && !StringHelper.isNullOrEmpty(strOrder1Column))
		{
			strSort1 = iWebContext.getPostOrParamValue(String.format("columns[%1$s][data]", strOrder1Column));
		}

		if (!StringHelper.isNullOrEmpty(strSort0))
		{
			deDataSetFetchContextImpl.setSort(strSort0);
			deDataSetFetchContextImpl.setSortDir(strOrder0Dir);
		}
		if (!StringHelper.isNullOrEmpty(strSort1))
		{
			deDataSetFetchContextImpl.setSort2(strSort1);
			deDataSetFetchContextImpl.setSort2Dir(strOrder1Dir);
		}

		String strLimit = iWebContext.getPostOrParamValue("length");
		String strOffset = iWebContext.getPostOrParamValue("start");
		int nStartRow = 0;
		if (!StringHelper.isNullOrEmpty(strOffset))
		{
			nStartRow = Integer.parseInt(strOffset);
		}

		int nSize = 25;
		if (!StringHelper.isNullOrEmpty(strLimit))
		{
			nSize = Integer.parseInt(strLimit);
		}

		deDataSetFetchContextImpl.setStartRow(nStartRow);
		deDataSetFetchContextImpl.setPageSize(nSize);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.ctrlhandler.IMDCtrlRender#getFetchQuickSearch()
	 */
	@Override
	public String getFetchQuickSearch()
	{
		IWebContext iWebContext = WebContext.getCurrent();
		if (iWebContext == null)
		{
			return null;

		}
		return iWebContext.getPostOrParamValue("search");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * net.ibizsys.paas.ctrlhandler.CtrlRenderBase#filteAjaxActionResult(net
	 * .ibizsys.paas.web.AjaxActionResult, net.sf.json.JSONObject)
	 */
	@Override
	public void filteAjaxActionResult(AjaxActionResult ajaxActionResult, JSONObject jo)
	{
		if (StringHelper.compare(ajaxActionResult.getAjaxAction(), MDCtrlHandlerBase.ACTION_FETCH, true) == 0)
		{
			MDAjaxActionResult mdAjaxActionResult = (MDAjaxActionResult) ajaxActionResult;

			jo.put("totalRecords", mdAjaxActionResult.getTotalRow());
			
			// objJSON.put("sEcho", nStartRow);
			if (mdAjaxActionResult.getPageSize() > 0)
			{
				jo.put("iTotalRecords", mdAjaxActionResult.getPageSize());
			}
			int nPageSize = mdAjaxActionResult.getPageSize();
			int nStartRow = mdAjaxActionResult.getStartRow();
			int curPage = nStartRow/nPageSize+1;
			jo.put("curPage", curPage);
		}
	}
	
	@Override
	public void fillFetchResult(IGridModel iGridModel, MDAjaxActionResult fetchResult, IDataTable dt) throws Exception
	{
		iGridModel.fillFetchResult(fetchResult, dt);
	}
}
