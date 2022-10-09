package com.practice.javaconfiguration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringApp {
    public static void main(String[] args) {
        //reading the config file from config class
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(Config.class);

        //get the bean from spring container
        Person person = context.getBean("getPerson", Person.class);

        //call the method
        person.getPersonProof();

        //close the context
        context.close();
    }
}
