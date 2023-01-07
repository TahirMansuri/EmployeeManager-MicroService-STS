package com.infogalaxy.employeeservice.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.infogalaxy.employeeservice.entity.Employee;
import com.infogalaxy.employeeservice.repository.EmployeeRepository;
import com.infogalaxy.employeeservice.response.AddressResponse;
import com.infogalaxy.employeeservice.response.EmployeeResponse;

@Service
public class EmployeeService {

	@Autowired 
	EmployeeRepository employeeRepository;
	
	@Autowired
	ModelMapper modelMapper;
	
	@Autowired
	RestTemplate restTemplate;
	
	public EmployeeResponse getEmpById(int id) {
		Employee employee =  employeeRepository.findById(id).get();

		EmployeeResponse employeeResponse = modelMapper.map(employee, EmployeeResponse.class);
		
	
		AddressResponse addressResponse = restTemplate.getForObject("http://localhost:8082/address/{id}", AddressResponse.class, id);
		
		employeeResponse.setAddressResponse(addressResponse);
//		EmployeeResponse employeeResponse = new EmployeeResponse();
//		employeeResponse.setId(employee.getId());
//		employeeResponse.setName(employee.getName());
//		employeeResponse.setEmail(employee.getEmail());
//		employeeResponse.setBloodGroup(employee.getBloodGroup());
		
		return employeeResponse;
	}
	
}
