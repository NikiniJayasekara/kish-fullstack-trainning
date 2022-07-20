package com.nikini.traning.repository;

import java.util.ArrayList;

import java.util.List;
import org.springframework.stereotype.Repository;

import com.nikini.traning.model.Employee;

@Repository("myDatabase")
public class HibernateEmployeeRepositoryImpl implements EmployeeRepository {
	

@Override
public List<Employee> getAllEmployees() {
	List<Employee> employees = new ArrayList<>();
	Employee employee = new Employee();
	employee.setEmployeeName("nikini");
	employee.setEmployeeLocation("kegalle");
    employees.add(employee);
	return employees;
	}
}
