package com.infogalaxy.employeeservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infogalaxy.employeeservice.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
