/**
 * 
 */
package com.infogalaxy.addressservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.infogalaxy.addressservice.entity.Address;

/**
 * @author InfoGalaxy
 *  07-Jan-2023
 */
public interface AddressRepository extends JpaRepository<Address, Integer>{

	@Query(nativeQuery = true, value = "select ad.id,ad.lane1,ad.lane2,ad.state,ad.zipcode from employeeservicedb.address ad join employeeservicedb.employee ee on ee.id=ad.employee_id where ad.employee_id=:empid")
	Address findAddressByEmployeeId(@Param("empid") int empid);
}
