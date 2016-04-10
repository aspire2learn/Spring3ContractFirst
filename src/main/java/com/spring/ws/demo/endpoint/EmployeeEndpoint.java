package com.spring.ws.demo.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.spring.ws.demo.model.Employee;
import com.spring.ws.demo.model.EmployeeRequest;
import com.spring.ws.demo.model.EmployeeResponse;
import com.spring.ws.demo.service.EmployeeService;

@Endpoint
public class EmployeeEndpoint {
	
	@Autowired
	private EmployeeService employeeService;
	
	private static final String TARGET_NAMESPACE = "http://com/spring/ws/demo/model";

	@PayloadRoot(localPart = "EmployeeRequest", namespace = TARGET_NAMESPACE)
	public @ResponsePayload EmployeeResponse getEmployeeDetails(@RequestPayload EmployeeRequest request) {
		System.out.println("getEmployeeDetails calling---");
		EmployeeResponse response = new EmployeeResponse();

		Employee emp = employeeService.getEmployeeDetails(request.getEmpId());
		response.setEmployeeDetails(emp);
		
		return response;
	}

}
