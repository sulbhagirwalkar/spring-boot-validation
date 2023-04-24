package com.sulbha.validation.dto;

import com.sulbha.validation.validation.ValidateEmployeeType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
	private long id;
	private String firstName;
	private String lastName;
	
	@ValidateEmployeeType
	private String email;
	

}
