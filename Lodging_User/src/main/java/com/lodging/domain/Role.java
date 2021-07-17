package com.lodging.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="ROLE")
public class Role {

	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="id_sequence")
	@SequenceGenerator(name="id_sequence", sequenceName="ROLE_ID_SEQ")
	private Long oid;
}
