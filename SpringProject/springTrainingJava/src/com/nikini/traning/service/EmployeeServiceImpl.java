package com.nikini.traning.service;

import java.util.List;

import com.nikini.traning.model.Employee;
import com.nikini.traning.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeRepository employeeRepository;
	
	  public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
	    	System.out.println("Overload constructor executed");
	    	this.employeeRepository = employeeRepository;
	    }
	  
	  public EmployeeServiceImpl() {
	    	System.out.println("Default constructor executed");
	    }

	public EmployeeRepository getEmployeeRepository() {
		return employeeRepository;
	}
   @Autowired
	public void setEmployeeRepository(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}

	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepository.getAllEmployees();
	}
}
