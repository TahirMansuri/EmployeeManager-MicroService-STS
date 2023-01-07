package com.infogalaxy.employeeservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infogalaxy.employeeservice.entity.Employee;
import com.infogalaxy.employeeservice.repository.EmployeeRepository;
import com.infogalaxy.employeeservice.response.EmployeeResponse;

@Service
public class EmployeeService {

	@Autowired 
	EmployeeRepository employeeRepository;
	
	public EmployeeResponse getEmpById(int id) {
		Employee employee =  employeeRepository.findById(id).get();
		
		EmployeeResponse employeeResponse = new EmployeeResponse();
		employeeResponse.setId(employee.getId());
		employeeResponse.setName(employee.getName());
		employeeResponse.setEmail(employee.getEmail());
		employeeResponse.setBloodGroup(employee.getBloodGroup());
		
		return employeeResponse;
	}
	
}
