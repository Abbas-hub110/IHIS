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
@Table(name = "PLAN_CATEGORY_MASTER")
@Data
public class PlanCategoryEntity {
	
	@Id
	@Column(name = "CATEGORY_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long categoryId;
	@Column(name = "CATEGORY_NAME")
	String categoryName;
	@Column(name = "CREATED_DT")
	Date createdDate;
	@Column(name = "UPDATE_DT")
	Date updatedDate;
	@Column(name = "CREATED_BY")
	String createdBy;
	@Column(name = "UPDATED_BY")
	String updatedBy;

}
