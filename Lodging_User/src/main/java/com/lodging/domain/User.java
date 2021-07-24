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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.lodging.base.AbstractAuditableEntity;

@Entity
@Table(name="USER")
public class User 
extends AbstractAuditableEntity
{

	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="id_sequence")
	@SequenceGenerator(name="id_sequence", sequenceName="USER_SEQ")
	private Long oid;
	
	@Column
	private String id;
	
	@Column 
	private String password;
	
	@Column
	private String firstName;
	
	@Column 
	private String lastName;
	
	@Column 
	private String email;
	
	@Column
	private String phoneNumber;
	
	@Column 
	private boolean isActive;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="role_oid", referencedColumnName="oid")
	private Role defaultRole;
	
	@Column 
	private String defaultTimeZone;
	
	@Column 
    private String defaultLanguage;
    
	@Column 
    private boolean allHotels;
    
	@Column 
    private String defaultLocationOid;
    
	@Column 
    private String defaultHotelOid;
    
	@Column 
    private boolean defaultStatisticsToCollapsed;
    
	@Column 
    private boolean useLocalTimeZone;
    
	@Column 
    private String deletedBy;
    
	@Column 
    private Date deletedAt;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="USER_ROLE_X", joinColumns = { @JoinColumn(name="role_id") }, inverseJoinColumns = { @JoinColumn(name="user_id") } )
	private Set<Role> roles = new HashSet<Role>(0);
	
    //private Set<Hotel> hotels = new HashSet<Hotel>(0);

	@Column
	private Date updatedAt;
	
	@Column
	private String updatedBy;
	
	public User()
	{
		super();
	}

	public static User newInstance()
	{
		return new User();
	}
	
	public Long getOid() {
		return oid;
	}

	public void setOid(Long oid) {
		this.oid = oid;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public Role getDefaultRole() {
		return defaultRole;
	}

	public void setDefaultRole(Role defaultRole) {
		this.defaultRole = defaultRole;
	}

	public String getDefaultTimeZone() {
		return defaultTimeZone;
	}

	public void setDefaultTimeZone(String defaultTimeZone) {
		this.defaultTimeZone = defaultTimeZone;
	}

	public String getDefaultLanguage() {
		return defaultLanguage;
	}

	public void setDefaultLanguage(String defaultLanguage) {
		this.defaultLanguage = defaultLanguage;
	}

	public boolean isAllHotels() {
		return allHotels;
	}

	public void setAllHotels(boolean allHotels) {
		this.allHotels = allHotels;
	}

	public String getDefaultLocationOid() {
		return defaultLocationOid;
	}

	public void setDefaultLocationOid(String defaultLocationOid) {
		this.defaultLocationOid = defaultLocationOid;
	}

	public String getDefaultHotelOid() {
		return defaultHotelOid;
	}

	public void setDefaultHotelOid(String defaultHotelOid) {
		this.defaultHotelOid = defaultHotelOid;
	}

	public boolean isDefaultStatisticsToCollapsed() {
		return defaultStatisticsToCollapsed;
	}

	public void setDefaultStatisticsToCollapsed(boolean defaultStatisticsToCollapsed) {
		this.defaultStatisticsToCollapsed = defaultStatisticsToCollapsed;
	}

	public boolean isUseLocalTimeZone() {
		return useLocalTimeZone;
	}

	public void setUseLocalTimeZone(boolean useLocalTimeZone) {
		this.useLocalTimeZone = useLocalTimeZone;
	}

	public String getDeletedBy() {
		return deletedBy;
	}

	public void setDeletedBy(String deletedBy) {
		this.deletedBy = deletedBy;
	}

	public Date getDeletedAt() {
		return deletedAt;
	}

	public void setDeletedAt(Date deletedAt) {
		this.deletedAt = deletedAt;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
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
}
