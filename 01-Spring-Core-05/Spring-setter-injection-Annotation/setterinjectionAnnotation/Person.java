package com.practice.setterinjectionAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {

    //injecting Dependency injection to this field
    private Proof proof;

    public Person(){
        System.out.println("inside person constructor");
    }

    //setter injection using autowired annotation
    @Autowired
    void setProof(Proof proof){
        System.out.println("inside setter method");
        this.proof=proof;
    }


    public void getPersonProof() {
        System.out.println("Person");
        proof.getProof();
    }
}
