
package com.nikini.traning.config;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.nikini.traning.repository.EmployeeRepository;
import com.nikini.traning.repository.HibernateEmployeeRepositoryImpl;
import com.nikini.traning.service.EmployeeService;
import com.nikini.traning.service.EmployeeServiceImpl;

@Configuration
@ComponentScan("com.nikini")
public class ApplicationConfiguration {

	@Bean("employeeService")
//	@Scope("singleton")
	@Scope("prototype")
	public EmployeeService getEmployeeService() {
		EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
		return employeeService;
	}

/*
@Bean("employeeRepository")
public EmployeeRepository getEmployeeRepository() {
	return new HibernateEmployeeRepositoryImpl();
	}*/
}