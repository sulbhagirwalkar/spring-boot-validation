package com.sulbha.validation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sulbha.validation.dto.Employee;
import com.sulbha.validation.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping
	public Employee addNewEmployeeToSystem(@RequestBody Employee employee) {
		return employeeService.addNewEmployee(employee);
	}
	
}
