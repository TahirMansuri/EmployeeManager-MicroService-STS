/**
 * 
 */
package com.infogalaxy.addressservice.service.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infogalaxy.addressservice.entity.Address;
import com.infogalaxy.addressservice.repository.AddressRepository;
import com.infogalaxy.addressservice.response.AddressResponse;
import com.infogalaxy.addressservice.service.IAddressService;

/**
 * @author InfoGalaxy
 *  07-Jan-2023
 */
@Service
public class AddressServiceImpl implements IAddressService{

	@Autowired
	AddressRepository addressRepository;
	
	@Autowired
	ModelMapper modelMapper;
	
	@Override
	public AddressResponse getAddressByEmpId(int empId) {
		Address address = addressRepository.findAddressByEmployeeId(empId);
		AddressResponse addressResponse = modelMapper.map(address, AddressResponse.class);
		return addressResponse;
	}

}
