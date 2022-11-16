package com.practice.springAOP.Aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class CommonPointCutDeclarations {

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
}
