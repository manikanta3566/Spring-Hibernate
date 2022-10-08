package com.practice.constructorinjectionAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {

    //injecting Dependency injection to this field
    private Proof proof;

    //constructor for dependency injection using autowired annotation
    @Autowired
    public Person(Proof proof) {
        this.proof = proof;
    }


    public void getPersonProof() {
        System.out.println("Person");
        proof.getProof();
    }
}
