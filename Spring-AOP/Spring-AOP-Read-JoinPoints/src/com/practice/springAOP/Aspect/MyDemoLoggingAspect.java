package com.practice.springAOP.Aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import com.practice.springAOP.Account;

@Aspect
@Component
public class MyDemoLoggingAspect {

   	@Before("execution(public void addAccount(..))")
	public void beforeAddingAccount(JoinPoint joinPoint) {
		System.out.println("before adding account");
		
		//displaying method signature of add account
		MethodSignature methodSignature=(MethodSignature) joinPoint.getSignature();
		
		System.out.println(methodSignature);
		
		//reading the method arguements
		Object[] args = joinPoint.getArgs();
		
		for(Object arg:args) {
			System.out.println(arg);
			if(arg instanceof Account) {
				//downcasting
				Account account=(Account)arg;
				
				System.out.println(account.getName());
			}
		}
	}
	
}
