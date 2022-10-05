package com.practice.setterinjectionXML;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApp {
    public static void main(String[] args) {
        ////load the spring configuration file
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");

        //get the bean from spring container
        Person person = context.getBean("person", Person.class);

        //call the method
        person.getPersonProof();
        System.out.println(person.getName());
        System.out.println(person.getAge());
    }
}
