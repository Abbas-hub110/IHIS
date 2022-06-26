package com.murtazait.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.murtazait.entity.CitizenGraduationDtlsEntity;

public interface GraduationYearRepository extends JpaRepository<CitizenGraduationDtlsEntity, Integer> {

}
