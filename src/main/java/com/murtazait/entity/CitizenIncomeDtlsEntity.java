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
@Table(name = "CITIZEN_INCOME_DTLS")
@Data
public class CitizenIncomeDtlsEntity {
	
	@Id
	@Column(name = "income_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected Long incomeId;
	@Column(name = "case_num")
	protected Long caseNum;
	@Column(name = "monthly_alary")
	protected Double monthlySalary;
	@Column(name = "rent_ncome")
	protected Double rentIncome;
	@Column(name = "property_income")
	protected Double propertyIncome;
	@Column(name = "CREATED_DT")
	protected Date createdDate;
	@Column(name = "UPDATE_DT")
	protected Date updatedDate;
	@Column(name = "CREATED_BY")
	protected String createdBy;
	@Column(name = "UPDATED_BY")
	protected String updatedBy;
	

}
