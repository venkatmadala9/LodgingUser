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
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="USER")
public class User 
extends AbstractAuditableEntity
{

	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="id_sequence")
	@SequenceGenerator(name="id_sequence", sequenceName="USER_ID_SEQ")
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
	private String defaultRole;
	
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
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="role_oid", referencedColumnName="oid")
	private Set<Role> roles = new HashSet<Role>(0);
	
    //private Set<Hotel> hotels = new HashSet<Hotel>(0);

	
}
