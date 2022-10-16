package com.practice.springmvcdemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student {
	private String firstName;
	private String lastName;
	private String country;
	private String programmingLanguage;
	private List<String> operatingSystems=new ArrayList<>();
	
	private Map<String,String> countryOptions;
	
	public Student() {
		countryOptions=new HashMap<>();
		countryOptions.put("BR","Brazil");
		countryOptions.put("IN","India");
		countryOptions.put("US","United States");
		
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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	

	public String getProgrammingLanguage() {
		return programmingLanguage;
	}

	public void setProgrammingLanguage(String programmingLanguage) {
		this.programmingLanguage = programmingLanguage;
	}
	

	public List<String> getOperatingSystems() {
		return operatingSystems;
	}

	public void setOperatingSystems(List<String> operatingSystems) {
		this.operatingSystems = operatingSystems;
	}

	public Map<String, String> getCountryOptions() {
		return countryOptions;
	}
	
	
	
	
	

}
