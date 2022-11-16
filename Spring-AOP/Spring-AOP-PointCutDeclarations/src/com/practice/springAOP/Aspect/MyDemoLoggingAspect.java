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

    @Before("loggingBeforeCallingMethod()")
	public void beforeAddingAccount() {
		System.out.println("before adding account");
	}
    
    @Before("loggingBeforeCallingMethod()")
	public void performingApiAnalysis() {
		System.out.println("performing api analysis");
	}
	
}
