package com.murtazait.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.murtazait.entity.AppPlanEntity;
import com.murtazait.repository.AppPlanRepository;

@Service
public class Test {

	@Autowired
	AppPlanRepository repository1;

	public String addPlan(AppPlanEntity ap) {
		repository1.save(ap);
		return "YES";
	}
}
