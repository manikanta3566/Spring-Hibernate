package com.practice.springAOP.Aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {

    //	@Before("execution(public void addAccount())") ->executes which matches addAccount method in any class

	//	@Before("execution(public void com.practice.springAOP.DAO.AccountDAO.addAccount())") -> executes which matches the class and method name 

	//	@Before("execution(public void add*())")->executes which method has starting name add
	
    //	@Before("execution(boolean add*())")->executes method which matches boolean return type and method which starts with add name
	
    //	@Before("execution(* add*())")->executes method which has any return type and method which starts with name add 
	
    //	@Before("execution(public void addAccount(com.practice.springAOP.Account))") ->executes which method has account type parameter
	
    //	@Before("execution(public void addAccount(com.practice.springAOP.Account,..))") -> executes which method has account type and more than 1 parameters
	
    //	@Before("execution(public void addAccount(..))") ->matches any type of parameters
	
    //	@Before("execution(* com.practice.springAOP.DAO.*.*(..))")->executes when matches the package name with any class name and any method name and any type of parameters
	public void beforeAddingAccount() {
		System.out.println("before adding account");
	}
	
}
