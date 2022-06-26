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
@Table(name = "CITIZEN_PLAN")
@Data
public class CitizenPlanEntity {
	
	@Id
	@Column(name = "citizen_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected Long citizenId;
	@Column(name = "case_num")
	protected Long caseNum;
	@Column(name = "plan_id")
	protected Long planId;
	@Column(name = "CREATED_DT")
	protected Date createdDate;
	@Column(name = "UPDATE_DT")
	protected Date updatedDate;
	@Column(name = "CREATED_BY")
	protected String createdBy;
	@Column(name = "UPDATED_BY")
	protected String updatedBy;

}
