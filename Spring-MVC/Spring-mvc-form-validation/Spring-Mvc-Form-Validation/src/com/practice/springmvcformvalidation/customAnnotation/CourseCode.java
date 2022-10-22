package com.practice.springmvcformvalidation.customAnnotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = CourseCodeConstraintValidator.class)
@Target({ElementType.METHOD,ElementType.FIELD})
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface CourseCode {
	
	//default course code
	 public String value() default "HAPPY";
	
	//default error message
	 public String message() default "must start with HAPPY";
	
	//default groups
    Class<?>[] groups() default {};
	
	//default payload
	 Class<? extends Payload>[] payload() default {};

}
