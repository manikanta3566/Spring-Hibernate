package com.practice.springAOP;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.practice.springAOP.DAO.TestExecutionTime;
import com.practice.springAOP.config.DemoConfig;

public class AroundHandleExceptionDemo {

	public static void main(String[] args) {
		//reading the spring java config
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(DemoConfig.class);
		
		//get  the bean from spring container
		TestExecutionTime executionTime= context.getBean("testExecutionTime",TestExecutionTime.class);
		
		//call the method
		String result = executionTime.generateException(true);
		
		System.out.println("inside main method");
		
		System.out.println(result);
		//close the context
		context.close();

	}

}
