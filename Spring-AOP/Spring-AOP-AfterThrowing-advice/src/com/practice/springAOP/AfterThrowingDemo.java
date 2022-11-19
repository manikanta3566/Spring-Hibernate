package com.practice.springAOP;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.practice.springAOP.DAO.AccountDAO;
import com.practice.springAOP.config.DemoConfig;

public class AfterThrowingDemo {

	public static void main(String[] args) {
		//reading the spring java config
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(DemoConfig.class);
		
		//get the bean from spring container
		AccountDAO accountDAO = context.getBean("accountDAO",AccountDAO.class);
		
		//call the method
		List<Account> accounts =null; 
			try {	
		     accounts=accountDAO.findAccounts(true);
			}catch(Exception e) {
			System.out.println(e);
			}
		
		System.out.println("from main method \n");
		
		System.out.println(accounts);
		
		//close the context
		context.close();

	}

}
