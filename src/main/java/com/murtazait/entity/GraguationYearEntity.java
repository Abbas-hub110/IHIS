package com.murtazait.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "Graguation_Year")
@Data
public class GraguationYearEntity {
	
	@Id
	@Column(name = "year_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer yearId;
	Integer year;
}
