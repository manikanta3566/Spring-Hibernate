package com.practice.springAOP.Aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {
	
	//around advice
	@Around("execution(* com.practice.springAOP.DAO.TestExecutionTime.demo(..))")
	public Object aroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("inside arround advice");
       
		long startTime=System.currentTimeMillis();
		
		Object result = joinPoint.proceed();
		
		long endTime=System.currentTimeMillis();
		
		long totalTime=endTime-startTime;
		
		System.out.println(totalTime);
		
		return result;
	
	}
	
}
