package com.sulbha.validation.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class EmployeeTypeValidator implements ConstraintValidator<ValidateEmployeeType, String> {

	@Override
	public boolean isValid(String employeeType, ConstraintValidatorContext constraintValidatorContext) {
	
		return employeeType.contains(employeeType);
	}

}
