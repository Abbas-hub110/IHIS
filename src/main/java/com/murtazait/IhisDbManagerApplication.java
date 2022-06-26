package com.murtazait;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.murtazait.entity.AppPlanEntity;
import com.murtazait.service.Test;

@SpringBootApplication
public class IhisDbManagerApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(IhisDbManagerApplication.class, args);
		
		/*
		 * Test bean = run.getBean("test", Test.class);
		 * 
		 * 
		 * 
		 * AppPlanEntity ap = new AppPlanEntity();
		 * 
		 * //ap.setPlanId(123L); ap.setPlanName("Medico");
		 * 
		 * 
		 * bean.addPlan(ap); System.out.println(ap.toString());
		 */
		
	}

}
