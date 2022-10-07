package com.practice.beanscopesXML;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleSpringApp {
    public static void main(String[] args) {
        ////load the spring configuration file
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("bean_lifecycle_applicationContext.xml");

        //get the bean from container
        Student student = context.getBean("student", Student.class);
        student.setName("john");
        System.out.println(student.getName());

        //close the contect
        context.close();
    }
}
