package com.lodging.domain;

import org.apache.log4j.Logger;

public abstract class AbstractBaseEntity 
implements java.io.Serializable
{
	protected static final Logger LOGGER = Logger.getLogger(AbstractBaseEntity.class);
	
	protected Long oid;
	
	public AbstractBaseEntity()
	{
		super();
		initialize();
	}
	
	protected void initialize()
	{
		this.oid = null;
	}

	public Long getOid() {
		return oid;
	}

	public void setOid(Long oid) {
		this.oid = oid;
	}
	
	public boolean isPersistent()
	{
		return oid != null;
	}
	
	public String getOidString()
	{
		return String.valueOf(oid);
	}
	
	public boolean isOrphan()
	{
		return true;
	}
}

