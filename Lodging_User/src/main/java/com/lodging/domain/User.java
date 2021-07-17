package com.lodging.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="USER")
public class User {

	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="id_sequence")
	@SequenceGenerator(name="id_sequence", sequenceName="USER_ID_SEQ")
	private Long oid;
	
	@Column
	private String id;
	
	@Column
	private String firstName;
	
	@Column 
	private String lastName;
	
	@Column 
	private String email;
	
	@Column
	private Long phone;
	
	@Column
	private String defaultRole;
	
	
}
