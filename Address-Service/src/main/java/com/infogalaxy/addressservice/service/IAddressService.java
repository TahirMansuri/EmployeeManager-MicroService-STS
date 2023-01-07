/**
 * 
 */
package com.infogalaxy.addressservice.service;

import com.infogalaxy.addressservice.response.AddressResponse;

/**
 * @author InfoGalaxy
 *  07-Jan-2023
 */
public interface IAddressService {

	AddressResponse getAddressByEmpId(int empId);
	
}
