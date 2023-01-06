package com.infogalaxy.employeeservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infogalaxy.employeeservice.entity.Employee;
import com.infogalaxy.employeeservice.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired 
	EmployeeRepository employeeRepository;
	
	public Employee getEmpById(int id) {
		Employee employee =  employeeRepository.findById(id).get();
		return employee;
	}
	
}
