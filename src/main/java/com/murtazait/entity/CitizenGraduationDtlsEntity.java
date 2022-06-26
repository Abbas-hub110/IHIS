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
@Table(name = "CITIZEN_GRADUATION_DTLS")
@Data
public class CitizenGraduationDtlsEntity {

	@Id
	@Column(name = "graduation_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected Long graduationId;
	@Column(name = "case_num")
	protected Long caseNum;
	@Column(name = "highest_degree")
	protected String highestDegree;	
	@Column(name = "graduation_year")
	protected Integer graduationYear;
	
	protected String university;
	@Column(name = "CREATED_DT")
	protected Date createdDate;
	@Column(name = "UPDATE_DT")
	protected Date updatedDate;
	@Column(name = "CREATED_BY")
	protected String createdBy;
	@Column(name = "UPDATED_BY")
	protected String updatedBy;
	
}
