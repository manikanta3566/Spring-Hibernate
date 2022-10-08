package com.practice.springiocAnnotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApp {
    public static void main(String[] args) {
        //reading the config file xml
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("annotation_applicationContext.xml");

        //get the bean from spring container
        Blue blue = context.getBean("blue", Blue.class);

        //get the bean from spring container using default bean id
        Red red = context.getBean("red", Red.class);

        //call the method
        blue.printColorName();
        red.printColorName();

        //close the context
        context.close();
    }
}
