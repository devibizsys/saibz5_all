package net.ibizsys.pswf.core;

/**
 * 流程结束处理模型
 * @author lionlau
 *
 */
public abstract class WFEndProcessModelBase extends WFProcessModelBase
{
	
	/* (non-Javadoc)
	 * @see net.ibizsys.pswf.core.WFProcessModelBase#isTerminalProcess()
	 */
	@Override
	public boolean isTerminalProcess()
	{
		return true;
	}


	/* (non-Javadoc)
	 * @see net.ibizsys.pswf.core.WFProcessModelBase#getWFProcessType()
	 */
	@Override
	public String getWFProcessType()
	{
		return IWFProcessModel.End;
	}
	

}
