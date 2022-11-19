package com.practice.web_customer_crud.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.jboss.logging.Logger;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
	
	//logger
	private Logger log=Logger.getLogger(getClass().getName());
	
	//pointcut declartions
	//for controller layer
    @Pointcut("execution(* com.practice.web_customer_crud.controller.*.*(..))")
    public void forControllerLayer() {
    	
    }
    //for service layer
    @Pointcut("execution(* com.practice.web_customer_crud.service.*.*(..))")
    public void forServiceLayer() {
    	
    }
    //for DAO layer
    @Pointcut("execution(* com.practice.web_customer_crud.DAO.*.*(..))")
    public void forDaoLayer() {
    	
    }
    //combine pointcut declaration
    @Pointcut("forControllerLayer() || forServiceLayer() || forDaoLayer()")
    public void combinedPointCut() {
    	
    }
    
    //before advice
    @Before("combinedPointCut()")
    public void before(JoinPoint joinPoint) {
    log.info("inside before advice");
    String method = joinPoint.getSignature().toShortString();
    log.info("before advice "+method);
    Object[] args = joinPoint.getArgs();
    for(Object arg:args) {
    	log.info("inside before advice "+arg);
    }
    }
    
    @AfterReturning(pointcut = "combinedPointCut()",returning = "result")
    public void afterReturning(JoinPoint joinPoint,Object result) {
    	 log.info("inside after returning advice");
    	 String method = joinPoint.getSignature().toShortString();
    	 log.info("after returning advice "+method);
    	 log.info("after returning result "+result);
    }
    
    
    
}
