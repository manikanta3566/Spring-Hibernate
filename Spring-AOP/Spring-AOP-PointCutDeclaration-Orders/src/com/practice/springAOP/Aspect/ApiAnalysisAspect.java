package com.practice.springAOP.Aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(2)
public class ApiAnalysisAspect {
	  @Before("com.practice.springAOP.Aspect.CommonPointCutDeclarations.loggingBeforeCallingMethodNoSetterGetter()")
		public void performingApiAnalysis() {
			System.out.println("performing api analysiss");
		}
}
