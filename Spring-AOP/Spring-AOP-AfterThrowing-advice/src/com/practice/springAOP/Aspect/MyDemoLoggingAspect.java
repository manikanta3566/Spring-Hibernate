package com.practice.springAOP.Aspect;

import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import com.practice.springAOP.Account;

@Aspect
@Component
public class MyDemoLoggingAspect {
	
   	//after throwing advice
   	@AfterThrowing(pointcut = "execution(* com.practice.springAOP.DAO.AccountDAO.findAccounts(..))",
   			throwing ="exe" )
   	public void afterThrowingExecption(JoinPoint joinPoint,Throwable exe) {
        System.out.println("inside after throwing aspect \n");
   		
   		//printing the method signature
   		String signature = joinPoint.getSignature().toString();
   		System.out.println(signature);
   		
   		System.out.println(exe);
   	}
}
