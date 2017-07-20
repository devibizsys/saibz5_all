package net.ibizsys.paas.db;

import java.util.ArrayList;
import java.util.Iterator;

import org.springframework.expression.spel.ast.ValueRef.NullValueRef;

import net.ibizsys.paas.core.IDEDataQueryCodeCond;
import net.ibizsys.paas.logic.ICondition;

/**
 * 查询过滤组过滤条件
 * @author Administrator
 *
 */
public class SelectGroupFilter extends SelectFilterBase implements ISelectGroupFilter {

	protected ArrayList<IDEDataQueryCodeCond> list = null; 
	
	public SelectGroupFilter(){
		this.strCondOp = ICondition.CONDOP_AND;
	}
	
	@Override
	public String getCondType() {
		return CONDTYPE_GROUP;
	}
	
	public void setNotMode(boolean bNotMode){
		this.bNotMode = bNotMode;
	}

	@Override
	public ArrayList<IDEDataQueryCodeCond> getSelectFilterList(boolean bCreateIfNotExists) {
		if(list == null && bCreateIfNotExists){
			list = new ArrayList<IDEDataQueryCodeCond>();
		}
		return list;
	}

	@Override
	public Iterator<IDEDataQueryCodeCond> getChildDEDataQueryConds() {
		if(list == null)
			return null;
		return list.iterator();
	}

	
	
}
