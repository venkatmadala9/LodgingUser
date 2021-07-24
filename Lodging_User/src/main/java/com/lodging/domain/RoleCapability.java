package com.lodging.domain;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.engine.spi.CascadeStyle;

import com.lodging.base.AbstractAuditableEntity;

@Entity
@Table(name="ROLE_CAPABILITY")
public class RoleCapability 
extends AbstractAuditableEntity
{
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="id_sequence")
	@SequenceGenerator(name="id_sequence", sequenceName="ROLE_CAPABILITY_SEQ")
	private Long oid;
	
	@Column
	private Date updatedAt;
	
	@Column
	private String updatedBy;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "role_oid", referencedColumnName="oid", nullable=false)
	private Role role;
	
	@Column
	private String capability;
	
	public RoleCapability()
	{
		super();
	}
	
	public static RoleCapability newInstance()
	{
		return new RoleCapability();
	}
	
	public static RoleCapability newInstance(String capability, Role role)
	{
		RoleCapability result = new RoleCapability();
		result.setCapability(capability);
		result.setRole(role);
		
		return result;
	}

	public RoleCapability(Long oid, Date updatedAt, String updatedBy, Role role, String capability)
	{
		super();
		this.oid = oid;
		this.updatedAt = updatedAt;
		this.updatedBy = updatedBy;
		this.role = role;
		this.capability = capability;
	}
	
	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public String getCapability() {
		return capability;
	}

	public void setCapability(String capability) {
		this.capability = capability;
	}
	
	
}
