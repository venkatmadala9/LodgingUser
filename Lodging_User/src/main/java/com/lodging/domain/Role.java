package com.lodging.domain;


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name="ROLE")
public class Role 
extends AbstractAuditableEntity
{

	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="id_sequence")
	@SequenceGenerator(name="id_sequence", sequenceName="ROLE_ID_SEQ")
	private Long oid;
	
	@Column
	private String name;
	
	@Column 
	private String description;
	
	@Column
	private Date updatedAt;
	
	@Column
	private String updatedBy;
	
	private Set<User> users = new HashSet<User>(0);
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="role_cap_oid", referencedColumnName="oid")
	private Set<RoleCapability> roleCapabilities = new HashSet<RoleCapability>(0);
	
	public Role()
    {
    	super();
    }

    public static Role newInstance()
    {
        Role result = new Role();
        return result;
    }
    
    public Role(Long oid, String name, Date updatedAt, String updatedBy)
    {
        this.oid = oid;
        this.name = name;
        this.updatedAt = updatedAt;
        this.updatedBy = updatedBy;
    }

    public Role(Long oid, String name, Date updatedAt, String updatedBy, String description,
                Set<User> users, Set<RoleCapability> roleCapabilities)
    {
        this.oid = oid;
        this.name = name;
        this.updatedAt = updatedAt;
        this.updatedBy = updatedBy;
        this.description = description;
        this.users = users;        
        this.roleCapabilities = roleCapabilities;
    }
    
    public boolean isOrphan()
    {
    	return (getUsers().isEmpty());
    }

	public Long getOid() {
		return oid;
	}

	public void setOid(Long oid) {
		this.oid = oid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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

	public Set<User> getUsers() {
		return users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}

	public Set<RoleCapability> getRoleCapabilities() {
		return roleCapabilities;
	}

	public void setRoleCapabilities(Set<RoleCapability> roleCapabilities) {
		this.roleCapabilities = roleCapabilities;
	}
    
}
