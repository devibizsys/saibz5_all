package net.ibizsys.paas.db;

import java.util.Iterator;

import net.ibizsys.paas.core.DataTypes;
import net.ibizsys.paas.core.IDEDataQueryCodeCond;
import net.ibizsys.paas.core.ModelBaseImpl;

/**
 * 选择过滤条件
 * @author Administrator
 *
 */
public abstract class SelectFilterBase extends ModelBaseImpl implements ISelectFilter,IDEDataQueryCodeCond {

	protected String strCondOp = null;
	protected String strDEFName = null;
	protected String strCondValue = null;
	protected String strCustomCond = null;
	protected String strDEFieldExp = null;
	protected int nStdDataType = DataTypes.UNKNOWN;
	protected boolean bNotMode = false;
	
	
	@Override
	public String getDEFName() {
		return this.strDEFName;
	}


	@Override
	public String getCondOp() {
		return this.strCondOp;
	}
	
	/**
	 * 设置条件操作
	 * @param strCondOp
	 */
	public void setCondOp(String strCondOp){
		this.strCondOp = strCondOp;
	}
	

	/* (non-Javadoc)
	 * @see net.ibizsys.paas.core.IDEDataQueryCodeCond#getCondValue()
	 */
	@Override
	public String getCondValue() {
		return this.strCondValue;
	}

	@Override
	public String getCustomCond() {
		return this.strCustomCond;
	}

	@Override
	public String getPredefindedCond() {
		return null;
	}

	@Override
	public Iterator<IDEDataQueryCodeCond> getChildDEDataQueryConds() {
		return null;
	}

	@Override
	public String getDEFieldExp() {
		return this.strDEFieldExp;
	}

	@Override
	public boolean isNotMode() {
		return this.bNotMode;
	}

	@Override
	public int getStdDataType() {
		return this.nStdDataType;
	}

}
