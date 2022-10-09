package com.practice.javaconfiguration;

import org.springframework.beans.factory.annotation.Value;

public class Person {

    @Value("${person.name}")
    private String name;

    @Value("${person.age}")
    private int age;

    //injecting Dependency injection to this field
    private Proof proof;

    public Person()
    {
        System.out.println("inside person constructor");
    }
    public Person(Proof proof) {
        this.proof = proof;
    }


    public void getPersonProof() {
        System.out.println("Person");
        System.out.println("person name is "+name+" and age is "+age);
        proof.getProof();
    }
}
