package com.practice.springmvcformvalidation.customAnnotation;

import java.util.Objects;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements 
ConstraintValidator<CourseCode,String> {
 
	public String codePrefix;
	
	@Override
	public void initialize(CourseCode courseCode) {
		codePrefix=courseCode.value();
	}

	@Override
	public boolean isValid(String code, ConstraintValidatorContext constraintValidatorContext) {
		boolean result;
		
		if(Objects.nonNull(code)) {
		result=code.startsWith(codePrefix);
		}else {
		result=true;	
		}
		return result;
	}


}
