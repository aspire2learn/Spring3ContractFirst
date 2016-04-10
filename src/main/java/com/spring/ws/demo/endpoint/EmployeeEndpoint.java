package com.spring.ws.demo.endpoint;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.spring.ws.demo.model.EmployeeRequest;
import com.spring.ws.demo.model.EmployeeResponse;
import com.spring.ws.demo.model.ObjectFactory;

@Endpoint
public class EmployeeEndpoint {

	private static final String TARGET_NAMESPACE = "http://com/spring/samples/webservices/employeeService";

	@PayloadRoot(localPart = "EmployeetDetailsRequest", namespace = TARGET_NAMESPACE)
	public @ResponsePayload EmployeeResponse getEmployeeDetails(@RequestPayload EmployeeRequest request) {
		System.out.println("getEmployeeDetails calling---");
		
		ObjectFactory factory = new ObjectFactory();
		EmployeeResponse response = factory.createEmployeeResponse();

		response.setName("ABC");
		response.setName("XYZ");
		
		return response;
	}

}
