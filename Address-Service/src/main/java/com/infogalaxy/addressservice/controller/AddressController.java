/**
 * 
 */
package com.infogalaxy.addressservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.infogalaxy.addressservice.response.AddressResponse;
import com.infogalaxy.addressservice.service.impl.AddressServiceImpl;

/**
 * @author InfoGalaxy
 *  07-Jan-2023
 */
@RestController
public class AddressController {

	@Autowired
	AddressServiceImpl addressServiceImpl;
	
	@GetMapping("/address/{empid}")
	public AddressResponse getAddByEmpId(@PathVariable("empid") int empid) {
		return addressServiceImpl.getAddressByEmpId(empid);
	}
	
}
