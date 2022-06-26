package com.murtazait.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "CO_TRIGGER")
@Data
public class CoTriggerEntity {
	@Id
	@Column(name = "TRG_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected Long trgId;
	@Column(name = "CASE_NUM")
	protected Long caseNum;
	@Column(name = "TRG_STATUS")
	protected Character trgStatus;
	@Lob
	protected Byte[] notice;
	
}
