package com.practice.beanscopesXML;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopesSpringApp {
    public static void main(String[] args) {
        ////load the spring configuration file
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("bean_scopes_applicationContext.xml");

        //get the bean from spring container
        Student student1 = context.getBean("student", Student.class);
        student1.setName("john");
        student1.setAge(20);
        System.out.println(student1.getName()+" "+student1.getAge());
        Student student2 = context.getBean("student", Student.class);
        student2.setName("tom");
        student2.setAge(27);
        System.out.println(student2.getName()+" "+student2.getAge());
        System.out.println("--------------------------------------");
        System.out.println(student1.getName()+" "+student1.getAge());
        System.out.println(student1==student2);

        //close the context
        context.close();

    }
}
