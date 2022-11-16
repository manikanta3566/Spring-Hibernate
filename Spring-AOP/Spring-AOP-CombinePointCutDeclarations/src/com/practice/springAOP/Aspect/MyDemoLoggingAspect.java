package com.practice.springAOP.Aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {
	
	//point cut declarations
	@Pointcut("execution(* com.practice.springAOP.DAO.*.*(..))")
	public void loggingBeforeCallingMethod() {}
	
	//point cut declarations for setter method
	@Pointcut("execution(* com.practice.springAOP.DAO.*.set*(..))")
	public void setter() {}
	
	//point cut declarations for getter method
	@Pointcut("execution(* com.practice.springAOP.DAO.*.get*(..))")
	public void getter() {}
	
	//combining point cut declarations including package and excluding setter and getter
	@Pointcut("loggingBeforeCallingMethod() && !(setter() || getter())")
	public void loggingBeforeCallingMethodNoSetterGetter() {}

    @Before("loggingBeforeCallingMethodNoSetterGetter()")
	public void beforeAddingAccount() {
		System.out.println("before adding account");
	}
    
    @Before("loggingBeforeCallingMethodNoSetterGetter()")
	public void performingApiAnalysis() {
		System.out.println("performing api analysiss");
	}
	
}
