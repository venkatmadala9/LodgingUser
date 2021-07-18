package com.lodging.domain;

import java.util.Date;

import org.apache.log4j.Logger;

public class AbstractAuditableEntity 
extends AbstractBaseEntity
{
	protected String updatedBy;
	protected Date updatedAt;
	
	protected static final Logger LOGGER = Logger.getLogger(AbstractAuditableEntity.class);

	@Override
	protected void initialize()
	{
		super.initialize();
		setUpdatedAt(new Date());
		setUpdatedBy(updatedBy);
	}
	
	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
}
