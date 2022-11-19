package com.practice.springAOP.Aspect;

import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import com.practice.springAOP.Account;

@Aspect
@Component
public class MyDemoLoggingAspect {
   	
   	//after returning advice
   	@AfterReturning(pointcut ="execution(* com.practice.springAOP.DAO.AccountDAO.findAccounts(..))",
   			returning = "result")
   	public void afterCallingFindAccounts(JoinPoint joinPoint ,List<Account> result) {
   		System.out.println("inside after returning aspect \n");
   		
   		//printing the method signature
   		String signature = joinPoint.getSignature().toString();
   		System.out.println(signature);
   		//printing the results
   		System.out.println(result);
   		
   		//modifying the data before returning
        result.forEach(account ->account.setName(account.getName().toUpperCase()));
   		
   	}
	
}
