package net.ibizsys.paas.entity;

/**
 * 数据对象值异常对象
 * 
 * @author lionlau
 *
 */
public class EntityException extends Exception {
	private EntityError entityError = null;

	public EntityException(EntityError entityError) {
		super();
		this.entityError = entityError;

	}

	/**
	 * 获取数据对象错误对象
	 * 
	 * @return
	 */
	public EntityError getEntityError() {
		return this.entityError;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Throwable#toString()
	 */
	@Override
	public String toString() {
		if (entityError != null) return entityError.toString();
		return super.toString();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Throwable#getMessage()
	 */
	@Override
	public String getMessage() {
		if (entityError != null) return entityError.toString();
		return super.getMessage();
	}
}
