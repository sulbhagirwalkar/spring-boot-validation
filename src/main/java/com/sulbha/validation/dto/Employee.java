package com.sulbha.validation.dto;

import java.util.Date;

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
	private String email;
	

}
