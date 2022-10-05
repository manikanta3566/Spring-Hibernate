package com.practice.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApp {
    public static void main(String[] args) {
        //load the spring configuration file
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");

        //retrive the bean from spring container
        Coach mycoach = context.getBean("mycoach", Coach.class);

        //call the method
        System.out.println(mycoach.getDailyPracticeTime());

        //close the context
        context.close();
    }
}
