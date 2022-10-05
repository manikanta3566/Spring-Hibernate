package com.practice.constructerinjectionXML;

public class Person {

    //injecting Dependency injection to this field
    private Proof proof;

    //constructer for dependency injection
    public Person(Proof proof) {
        this.proof = proof;
    }


    public void getPersonProof() {
        proof.getProof();
    }
}
