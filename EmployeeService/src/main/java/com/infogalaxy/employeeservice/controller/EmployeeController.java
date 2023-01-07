package com.infogalaxy.employeeservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
	public ResponseEntity<EmployeeResponse> getEmpById(@PathVariable("id") int id) {
		
		EmployeeResponse employeeResponse = employeeService.getEmpById(id);
			
		return ResponseEntity.status(HttpStatus.OK).body(employeeResponse);
	}
	
}
