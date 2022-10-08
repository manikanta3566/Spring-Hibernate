package com.practice.fieldinjectionAnnotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApp {
    public static void main(String[] args) {
        //reading the config file xml
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("annotation_field_injection_applicationContext.xml");

        //get the bean from spring container
        Person person = context.getBean("person", Person.class);

        //call the method
        person.getPersonProof();

        //close the context
        context.close();
    }
}
