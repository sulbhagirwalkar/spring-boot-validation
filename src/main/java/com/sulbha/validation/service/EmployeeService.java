package com.sulbha.validation.service;

import java.util.Random;

import org.springframework.stereotype.Service;

import com.sulbha.validation.dto.Employee;

@Service
public class EmployeeService {

	public Employee addNewEmployee(Employee employee) {
		employee.setId(new Random().nextInt(68736432));
		return employee;
	}
}
