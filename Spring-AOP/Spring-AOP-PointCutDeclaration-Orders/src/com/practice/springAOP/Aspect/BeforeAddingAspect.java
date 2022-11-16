package com.practice.springAOP.Aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(3)
public class BeforeAddingAspect {

	 @Before("com.practice.springAOP.Aspect.CommonPointCutDeclarations.loggingBeforeCallingMethodNoSetterGetter()")
		public void beforeAddingAccount() {
			System.out.println("before adding account");
		}
}
