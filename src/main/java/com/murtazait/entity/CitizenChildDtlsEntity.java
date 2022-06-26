package com.murtazait.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "CITIZEN_CHILD_DTLS")
@Data
public class CitizenChildDtlsEntity {
	
	@Id
	@Column(name = "child_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected Long childId;
	@Column(name = "case_num")
	protected Long caseNum;
	@Column(name = "child_name")
	protected String childName;	
	@Column(name = "child_dob")
	protected Date childDob;
	@Column(name = "child_ssn")
	protected Long childSsn;
	@Column(name = "CREATED_DT")
	protected Date createdDate;
	@Column(name = "UPDATE_DT")
	protected Date updatedDate;
	@Column(name = "CREATED_BY")
	protected String createdBy;
	@Column(name = "UPDATED_BY")
	protected String updatedBy;
	

}
