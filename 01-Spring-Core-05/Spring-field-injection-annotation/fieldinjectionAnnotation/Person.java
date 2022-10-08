package com.practice.fieldinjectionAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {

    //injecting Dependency injection to this field
    //using field injection
    @Autowired
    @Qualifier("passport")
    private Proof proof;

    public Person(){
        System.out.println("inside person constructor");
    }

    public void getPersonProof() {
        System.out.println("Person");
        proof.getProof();
    }
}
