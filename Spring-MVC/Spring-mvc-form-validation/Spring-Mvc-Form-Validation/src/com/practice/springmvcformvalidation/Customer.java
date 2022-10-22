package com.practice.springmvcformvalidation;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.practice.springmvcformvalidation.customAnnotation.CourseCode;

public class Customer {
	
	@NotEmpty(message="required")
	private String firstName;
	
	private String lastName;
	
	@NotNull(message = "required")
	@Min(value = 0,message = "minimum value should be 0 or more than 0")
	@Max(value = 10,message = "maximum value should be 10 or less than 10")
	private Integer freePasses;
	
	@CourseCode
	private String courseCode;

	public Customer() {
		
	}
	
	public String getCourseCode() {
		return courseCode;
	}



	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}



	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getFreePasses() {
		return freePasses;
	}

	public void setFreePasses(Integer freePasses) {
		this.freePasses = freePasses;
	}
	
	
	
	

}
