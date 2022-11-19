package com.practice.springAOP.Aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {
	
	//around advice
	@Around("execution(* com.practice.springAOP.DAO.TestExecutionTime.generateException(..))")
	public Object aroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("inside arround advice");
		
		Object result = null;
			try {	
		     result=joinPoint.proceed();
		     return result;
			}catch(Exception exception) {
				System.out.println(exception);
				throw exception;
			}
	
	}
	
}
