package com.practice.springAOP;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.practice.springAOP.DAO.AccountDAO;
import com.practice.springAOP.DAO.MembershipDAO;
import com.practice.springAOP.config.DemoConfig;

public class MainDemo {

	public static void main(String[] args) {
		//reading the spring java config
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(DemoConfig.class);
		
		//get the bean from spring container
		AccountDAO accountDAO = context.getBean("accountDAO",AccountDAO.class);
		
		MembershipDAO membershipDAO=context.getBean("membershipDAO",MembershipDAO.class);
		
		//call the method
		accountDAO.addAccount(new Account("demobank"),true);
		accountDAO.deleteAccount();
		
		//call the setted method
		accountDAO.setName("demoname");
		accountDAO.setCode("democode");
		
		//call the getter method
		accountDAO.getName();
		accountDAO.getCode();
		
		//call the method
		membershipDAO.addAccount();
		membershipDAO.deleteMember();
		
		//close the context
		context.close();

	}

}
