package com.infogalaxy.employeeservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.infogalaxy.employeeservice.entity.Employee;
import com.infogalaxy.employeeservice.repository.EmployeeRepository;
import com.infogalaxy.employeeservice.response.EmployeeResponse;
import com.infogalaxy.employeeservice.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	@GetMapping("/employee/{id}")
	public EmployeeResponse getEmpById(@PathVariable("id") int id) {
		Employee employee = employeeService.getEmpById(id);
		
		EmployeeResponse employeeResponse = new EmployeeResponse();
		employeeResponse.setId(employee.getId());
		employeeResponse.setName(employee.getName());
		employeeResponse.setEmail(employee.getEmail());
		employeeResponse.setBloodGroup(employee.getBloodGroup());
		
		return employeeResponse;
	}
	
}
