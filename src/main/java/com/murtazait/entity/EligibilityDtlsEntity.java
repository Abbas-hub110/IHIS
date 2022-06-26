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
@Table(name = "ELIGIBILITY_DTLS")
@Data
public class EligibilityDtlsEntity {
	
	@Id
	@Column(name = "ELIGIBILITY_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected Long eligibilityId;
	@Column(name = "case_num")
	protected Long caseNum;
	@Column(name = "PLAN_NAME")
	protected String planName;
	@Column(name = "PLAN_STATUS")
	protected Character planStatus;
	@Column(name = "START_DT")
	protected Date startDate;
	@Column(name = "END_DT")
	protected Date endDate;
	@Column(name = "BENEFIT_AMT")
	protected Double benifitAmt;
	@Column(name = "DENIAL_REASON")
	protected String denialReason;
	@Column(name = "CREATED_DT")
	protected Date createdDate;
	@Column(name = "UPDATE_DT")
	protected Date updatedDate;
	@Column(name = "CREATED_BY")
	protected String createdBy;
	@Column(name = "UPDATED_BY")
	protected String updatedBy;

}
