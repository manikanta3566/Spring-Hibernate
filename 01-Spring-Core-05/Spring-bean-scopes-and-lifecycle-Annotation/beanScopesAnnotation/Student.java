package com.practice.beanScopesAnnotation;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
//@Scope("prototype")
public class Student {

    public Student() {
        System.out.println("constructor called");
    }

    @PostConstruct
    public void customInitMethod(){
        System.out.println("inside custom init method");
    }

    @PreDestroy
    public void customDestroyMethod(){
        System.out.println("inside custom destroy method");
    }


}
