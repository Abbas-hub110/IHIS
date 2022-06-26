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
@Table(name = "case_worker_acc")
@Data
public class CaseWorkerAcctEntity {

	@Id
	@Column(name = "acc_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected Long accId;
	@Column(name = "full_name")
	protected String fullName;

	protected String email;
	@Column(name = "mobile_num")
	protected Long mobileNumber;

	protected Character gender;
	@Column(name = "")
	protected Date dob;

	protected Long ssn;
	@Column(name = "active_sw")
	protected Character activeSwitch;
	@Column(name = "CREATED_DT")
	protected Date createdDate;
	@Column(name = "UPDATE_DT")
	protected Date updatedDate;
	@Column(name = "CREATED_BY")
	protected String createdBy;
	@Column(name = "UPDATED_BY")
	protected String updatedBy;

}
