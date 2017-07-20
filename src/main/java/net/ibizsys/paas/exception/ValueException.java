package net.ibizsys.paas.exception;

/**
 * 值错误异常
 * 
 * @author Administrator
 *
 */
public class ValueException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	public ValueException(String strError) {
		super(strError);
	}
}
