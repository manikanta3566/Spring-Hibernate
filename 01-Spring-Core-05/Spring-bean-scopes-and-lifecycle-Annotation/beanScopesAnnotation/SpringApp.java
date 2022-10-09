package com.practice.beanScopesAnnotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApp {
    public static void main(String[] args) {
        //reading the config file xml
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("annotation_beanscopes_applicationContext.xml");

        //get the bean from spring container
        Student student1 = context.getBean("student", Student.class);
        Student student2 = context.getBean("student", Student.class);

        System.out.println(student1==student2);

        //close the context
        context.close();
    }
}
