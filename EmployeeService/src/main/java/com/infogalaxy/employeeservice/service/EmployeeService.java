package com.infogalaxy.employeeservice.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
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
	
//	@Autowired
	RestTemplate restTemplate;
	
//	@Value("${addressservice.base.url}")
//	private String addressURL;
	
	/**
	 * Constructor to initialize RestTemplate and Set Address Base URL
	 */
	public EmployeeService(@Value("${addressservice.base.url}") String addressURL,RestTemplateBuilder restTemplateBuilder) {
		// TODO Auto-generated constructor stub
		this.restTemplate = restTemplateBuilder
							.rootUri(addressURL)
							.build();
	}
	
	public EmployeeResponse getEmpById(int id) {
		Employee employee =  employeeRepository.findById(id).get();

		EmployeeResponse employeeResponse = modelMapper.map(employee, EmployeeResponse.class);
		
	
		AddressResponse addressResponse = restTemplate.getForObject("/address/{id}", AddressResponse.class, id);
		
		employeeResponse.setAddressResponse(addressResponse);
//		EmployeeResponse employeeResponse = new EmployeeResponse();
//		employeeResponse.setId(employee.getId());
//		employeeResponse.setName(employee.getName());
//		employeeResponse.setEmail(employee.getEmail());
//		employeeResponse.setBloodGroup(employee.getBloodGroup());
		
		return employeeResponse;
	}
	
}
