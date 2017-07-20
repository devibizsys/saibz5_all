package net.ibizsys.paas.ctrlhandler;

import net.ibizsys.paas.appmodel.IApplicationModel;
import net.ibizsys.paas.control.grid.GridRowError;
import net.ibizsys.paas.control.grid.GridRowException;
import net.ibizsys.paas.control.grid.IGridEditItem;
import net.ibizsys.paas.core.CallResult;
import net.ibizsys.paas.core.Errors;
import net.ibizsys.paas.ctrlmodel.ICtrlModel;
import net.ibizsys.paas.ctrlmodel.IGridModel;
import net.ibizsys.paas.data.IDataObject;
import net.ibizsys.paas.db.IDataTable;
import net.ibizsys.paas.entity.EntityError;
import net.ibizsys.paas.entity.EntityException;
import net.ibizsys.paas.entity.EntityFieldError;
import net.ibizsys.paas.entity.IEntity;
import net.ibizsys.paas.exception.ErrorException;
import net.ibizsys.paas.util.DEDataExportHelper;
import net.ibizsys.paas.util.FileHelper;
import net.ibizsys.paas.util.StringHelper;
import net.ibizsys.paas.util.WebUtility;
import net.ibizsys.paas.web.AjaxActionResult;
import net.ibizsys.paas.web.GridRowAjaxActionResult;
import net.ibizsys.paas.web.IWebContext;
import net.ibizsys.paas.web.MDAjaxActionResult;
import net.ibizsys.paas.web.WebContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * 表格后台处理对象基类
 * 
 * @author lionlau
 *
 */
public abstract class GridHandlerBase extends MDCtrlHandlerBase implements IGridHandler {
	private static final Log log = LogFactory.getLog(GridHandlerBase.class);
	private boolean bEnableRowEdit = false;

	/**
	 * 获取当前的表格模型
	 * 
	 * @return
	 */
	protected IGridModel getGridModel() {
		return null;
	}

	/**
	 * 设置是否支持行编辑
	 * 
	 * @param bEnableRowEdit
	 */
	protected void setEnableRowEdit(boolean bEnableRowEdit) {
		this.bEnableRowEdit = bEnableRowEdit;
	}

	/**
	 * 获取是否支持行编辑
	 * 
	 * @return
	 */
	protected boolean isEnableRowEdit() {
		return this.bEnableRowEdit;
	}

	/**
	 * 填充数据获取结果
	 * 
	 * @param fetchResult 请求结果
	 * @param dt 数据
	 * @throws Exception
	 */
	@Override
	protected void fillFetchResult(MDAjaxActionResult fetchResult, IDataTable dt) throws Exception {
		getGridModel().fillFetchResult(fetchResult, dt);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.ctrlhandler.ICtrlHandler#getCtrlModel()
	 */
	@Override
	public ICtrlModel getCtrlModel() {
		return getGridModel();
	}

	@Override
	protected void fillExportFile(MDAjaxActionResult fetchResult, IDataTable dt, String strType) throws Exception {
		String strTempFileName = StringHelper.format("%1$tY%1$tm%1$td%1$tH%1$tM%1$tS", new java.util.Date());
		if (StringHelper.compare(strType, EXPORTTYPE_EXCEL, true) == 0) {
			String strTempFilePath = FileHelper.getTmpFileName(this.getWebContext(), strTempFileName, ".xls");
			DEDataExportHelper.output(strTempFilePath, dt, this.getGridModel(), this.getWebContext(), this.isEnableItemPriv());
			String strDownloadTmpFileUrl = this.getViewController().getAppModel().getUtilPageUrl(IApplicationModel.UTILPAGE_DOWNLOADTMPFILE);
			String strDownloadUrl = StringHelper.format("%1$sFILEID=%2$s", strDownloadTmpFileUrl, WebUtility.encodeURLParamValue(strTempFileName + ".xls"));
			fetchResult.setDownloadPath(strDownloadUrl);
			return;
		}

		throw new Exception(StringHelper.format("无法识别导出数据格式[%1$s]", strType));
	}

	/**
	 * 加载行数据草稿状态
	 * 
	 * @return
	 * @throws Exception
	 */
	protected AjaxActionResult onLoadDraft() throws Exception {
		GridRowAjaxActionResult gridRowAjaxActionResult = new GridRowAjaxActionResult();
		this.getWebContext().setCurAjaxActionResult(gridRowAjaxActionResult);

		IEntity iEntity = getDraftEntity();
		// 判断权限
		String strDataAccessAction = this.getDataAccessAction(ACTION_CREATE);
		CallResult callResult = testDataAccessAction(iEntity, strDataAccessAction);
		if (!callResult.isOk()) {
			this.fillDataAccActions(gridRowAjaxActionResult.getDataAccAction(true), false);
			gridRowAjaxActionResult.setRetCode(Errors.ACCESSDENY);
			gridRowAjaxActionResult.setErrorInfo(callResult.getErrorInfo());
			return gridRowAjaxActionResult;
		}
		// 获取数据
		iEntity.set(IGridEditItem.UF, 0);
		iEntity.set(IGridEditItem.TEMPMODE, this.getTempMode());
		this.fillRowOutputDatas(iEntity, false, gridRowAjaxActionResult);
		return gridRowAjaxActionResult;
	}

	/**
	 * 建立行数据
	 * 
	 * @return
	 * @throws Exception
	 */
	protected AjaxActionResult onCreate() throws Exception {
		GridRowAjaxActionResult gridRowAjaxActionResult = new GridRowAjaxActionResult();
		this.getWebContext().setCurAjaxActionResult(gridRowAjaxActionResult);

		IEntity iEntity = this.getDEModel().createEntity();
		this.fillRowInputValues(iEntity, false, false);
		this.testRowInputValueRule(iEntity, false);
		// 获取键值
		String strDataAccessAction = this.getDataAccessAction(ACTION_CREATE);
		CallResult callResult = this.testDataAccessAction(iEntity, strDataAccessAction);
		if (!callResult.isOk()) {
			this.fillDataAccActions(gridRowAjaxActionResult.getDataAccAction(true), false);
			gridRowAjaxActionResult.setRetCode(Errors.ACCESSDENY);
			gridRowAjaxActionResult.setErrorInfo(callResult.getErrorInfo());
			return gridRowAjaxActionResult;
		}

		iEntity = this.createEntity(iEntity);
		iEntity.set(IGridEditItem.UF, 1);
		iEntity.set(IGridEditItem.TEMPMODE, this.getTempMode());
		this.fillRowOutputDatas(iEntity, true, gridRowAjaxActionResult);
		this.fillDataAccActions(gridRowAjaxActionResult.getDataAccAction(true), iEntity);
		return gridRowAjaxActionResult;
	}

	/**
	 * 更新行数据
	 * 
	 * @return
	 * @throws Exception
	 */
	protected AjaxActionResult onUpdate() throws Exception {
		GridRowAjaxActionResult gridRowAjaxActionResult = new GridRowAjaxActionResult();
		this.getWebContext().setCurAjaxActionResult(gridRowAjaxActionResult);

		// 获取键值
		Object objKeyValue = getGridModel().getGridEditItemInputValue(IGridEditItem.KEY, this.getWebContext());
		if (objKeyValue == null) {
			gridRowAjaxActionResult.setRetCode(Errors.INVALIDDATAKEYS);
			return gridRowAjaxActionResult;
		}

		if(true){
			IEntity updateEntity = this.getSimpleEntity(objKeyValue);
			if (updateEntity != null) {
				// 判断权限
				String strDataAccessAction = this.getDataAccessAction(ACTION_UPDATE);
				CallResult callResult = this.testDataAccessAction(updateEntity, strDataAccessAction);
				if (!callResult.isOk()) {
					this.fillDataAccActions(gridRowAjaxActionResult.getDataAccAction(true), false);
					gridRowAjaxActionResult.setRetCode(Errors.ACCESSDENY);
					gridRowAjaxActionResult.setErrorInfo(callResult.getErrorInfo());
					return gridRowAjaxActionResult;
				}
			}
		}
		

		IEntity iEntity = this.getDEModel().createEntity();
		this.fillRowInputValues(iEntity, true, false);
		this.testRowInputValueRule(iEntity, true);

		iEntity.set(this.getDEModel().getKeyDEField().getName(), objKeyValue);

		iEntity = this.updateEntity(iEntity);
		iEntity.set(IGridEditItem.UF, 1);
		iEntity.set(IGridEditItem.TEMPMODE, this.getTempMode());
		this.fillRowOutputDatas(iEntity, true, gridRowAjaxActionResult);
		this.fillDataAccActions(gridRowAjaxActionResult.getDataAccAction(true), iEntity);
		return gridRowAjaxActionResult;
	}

	/**
	 * 通过数据实体填充行
	 * 
	 * @param iDataObject
	 * @return
	 */
	protected void fillRowOutputDatas(IDataObject iDataObject, Boolean bUpdate, GridRowAjaxActionResult gridRowAjaxActionResult) throws Exception {
		this.getGridModel().fillRowOutputDatas(iDataObject, bUpdate, gridRowAjaxActionResult.getData(true), gridRowAjaxActionResult.getState(true), gridRowAjaxActionResult.getConfig(true));
	}

	/**
	 * 填充数据实体对象
	 * 
	 * @param iDataObject 数据实体对象
	 * @param bIgnoreEmpty 是否忽略空检查
	 * @param formItemErrors 表格编辑项错误集合
	 * @return
	 */
	protected void fillRowInputValues(IDataObject iDataObject, boolean bUpdate, boolean bIgnoreEmpty) throws Exception {
		this.getGridModel().fillRowInputValues(iDataObject, bUpdate, bIgnoreEmpty);
	}

	/**
	 * 判断输入数据是否符合值规则
	 * 
	 * @param iDataObject
	 * @param bUpdate
	 * @param bIgnoreEmpty
	 * @throws Exception
	 */
	protected void testRowInputValueRule(IDataObject iDataObject, boolean bUpdate) throws Exception {
		this.getGridModel().testRowValueRule(this.getService(), iDataObject, bUpdate);
	}

	/**
	 * 填充默认值
	 * 
	 * @param iDataObject
	 * @param bUpdate
	 * @throws Exception
	 */
	protected void fillRowDefaultValues(IDataObject iDataObject, boolean bUpdate) throws Exception {
		this.getGridModel().fillRowDefaultValues(iDataObject, bUpdate);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.ctrlhandler.CtrlHandlerBase#processAction(java.lang.String, net.ibizsys.paas.web.IWebContext)
	 */
	@Override
	public AjaxActionResult processAction(String strAction, IWebContext iWebContext) throws Exception {
		try {
			return super.processAction(strAction, iWebContext);
		} catch (GridRowException ex) {
			log.error(ex.getMessage(), ex);
			GridRowAjaxActionResult gridRowAjaxActionResult = new GridRowAjaxActionResult();
			gridRowAjaxActionResult.setRetCode(Errors.INPUTERROR);
			gridRowAjaxActionResult.setErrorInfo(ex.getMessage());
			ex.getGridRowError().toJSONObject(gridRowAjaxActionResult.getError(true));
			return gridRowAjaxActionResult;
		} catch (EntityException ex) {
			log.error(ex.getMessage(), ex);
			GridRowAjaxActionResult gridRowAjaxActionResult = new GridRowAjaxActionResult();
			gridRowAjaxActionResult.setRetCode(Errors.INPUTERROR);
			gridRowAjaxActionResult.setErrorInfo(ex.getMessage());
			GridRowError gridRowError = getGridRowError(ex.getEntityError());
			gridRowError.toJSONObject(gridRowAjaxActionResult.getError(true));
			return gridRowAjaxActionResult;
		} catch (ErrorException ex) {
			log.error(ex.getMessage(), ex);
			GridRowAjaxActionResult gridRowAjaxActionResult = new GridRowAjaxActionResult();
			gridRowAjaxActionResult.setRetCode(ex.getErrorCode());
			gridRowAjaxActionResult.setErrorInfo(ex.getMessage());
			return gridRowAjaxActionResult;
		} catch (Exception ex) {
			log.error(ex.getMessage(), ex);
			GridRowAjaxActionResult gridRowAjaxActionResult = new GridRowAjaxActionResult();
			gridRowAjaxActionResult.setRetCode(Errors.INTERNALERROR);
			gridRowAjaxActionResult.setErrorInfo(ex.getMessage());
			return gridRowAjaxActionResult;
		}
	}

	@Override
	protected AjaxActionResult onProcessAction(String strAction) throws Exception {
		if (StringHelper.compare(strAction, ACTION_CREATE, true) == 0) {
			return onCreate();
		}

		if (StringHelper.compare(strAction, ACTION_UPDATE, true) == 0) {
			return onUpdate();
		}

		if (StringHelper.compare(strAction, ACTION_ITEMFETCH, true) == 0) {
			return onItemAction(strAction);
		}

		if (StringHelper.compare(strAction, ACTION_LOADDRAFT, true) == 0) {
			return onLoadDraft();
		}

		// if (StringHelper.compare(strAction, ACTION_LOADDRAFTFROM, true) == 0)
		// {
		// return onLoadDraftFrom();
		// }

		if (StringHelper.compare(strAction, ACTION_UPDATEGRIDEDITITEM, true) == 0) {
			return onUpdateGridEditItem(WebContext.getUFIMode(this.getWebContext()));
		}

		return super.onProcessAction(strAction);

	}

	/**
	 * 表格编辑项操作
	 * 
	 * @param strAction
	 * @return
	 * @throws Exception
	 */
	protected AjaxActionResult onItemAction(String strAction) throws Exception {
		String strFormItemName = WebContext.getFormItemId(this.getWebContext());
		ICtrlItemHandler iCtrlItemHandler = this.getCtrlItemHandler(ITEMACTIONTYPE_GRIDEDITITEM + strFormItemName);
		return iCtrlItemHandler.processAction(strAction);
	}

	/**
	 * 更新表格编辑项
	 * 
	 * @param strUFIMode
	 * @return
	 * @throws Exception
	 */
	protected AjaxActionResult onUpdateGridEditItem(String strUFIMode) throws Exception {
		String strCtrlItemName = strUFIMode;
		ICtrlItemHandler iCtrlItemHandler = this.getCtrlItemHandler(ITEMACTIONTYPE_GRIDEDITITEMUPDATE + strCtrlItemName);
		return iCtrlItemHandler.processAction(ACTION_UPDATEGRIDEDITITEM);
	}

	/**
	 * 转换表格行错误
	 * 
	 * @param entityError
	 * @return
	 * @throws Exception
	 */
	protected GridRowError getGridRowError(EntityError entityError) throws Exception {
		GridRowError gridRowError = new GridRowError();
		for (EntityFieldError entityFieldError : entityError.getEntityFieldErrorList()) {
			// 查找表格编辑项
			IGridEditItem iGridEditItem = this.getGridModel().getGridEditItem(entityFieldError.getFieldName(), true);
			if (iGridEditItem != null) {
				gridRowError.register(iGridEditItem.getName(), iGridEditItem.getCaption(), "", entityFieldError.getErrorType(), entityFieldError.getErrorInfo());
			} else {
				log.error(StringHelper.format("表格行不存在属性 [%1$s]，错误[%2$s]%3$s", entityFieldError.getFieldName(), entityFieldError.getErrorType(), entityFieldError.getErrorInfo()));
			}

		}
		return gridRowError;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.ctrlhandler.CtrlHandlerBase#convertEntityFieldError(net.ibizsys.paas.entity.EntityFieldError)
	 */
	@Override
	public boolean convertEntityFieldError(EntityFieldError entityFieldError) throws Exception {
		if (this.getGridModel().convertEntityFieldError(entityFieldError)) {
			return true;
		}
		return super.convertEntityFieldError(entityFieldError);
	}
}
