package com.practice.springAOP.Aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class CloudLoggingAspect {
	 @Before("com.practice.springAOP.Aspect.CommonPointCutDeclarations.loggingBeforeCallingMethodNoSetterGetter()")
	  	public void logginCloudAsync() {
	  		System.out.println("logging cloud async started");
	  	}
}
