package com.practice.beanscopesXML;

public class Student {
    private String name;
    private int age;

    public Student() {
        System.out.println("constructor called");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //init method
    public void initialize(){
        System.out.println("init method called");
    }

    //destroy method
    public void destroy(){
        System.out.println("destroy method called");
    }
}
