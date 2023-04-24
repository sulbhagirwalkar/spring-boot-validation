package com.sulbha.validation.validation;

import java.lang.annotation.*;


import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Target({ ElementType.FIELD, ElementType.PARAMETER })
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = EmployeeTypeValidator.class)
public @interface ValidateEmployeeType {

	public String message() default "Invalid employee";

	Class<?>[] group() default {};

	Class<? extends Payload>[] payload() default {};
}
