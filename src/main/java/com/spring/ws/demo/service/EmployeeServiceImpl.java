package com.spring.ws.demo.service;

import org.springframework.stereotype.Service;

import com.spring.ws.demo.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	public Employee getEmployeeDetails(String empId) {
		Employee emp = new Employee();
		emp.setEmpId("123");
		emp.setEmpName("abc");
		emp.setDesignation("xxxx");
		
		return emp;
	}
}
