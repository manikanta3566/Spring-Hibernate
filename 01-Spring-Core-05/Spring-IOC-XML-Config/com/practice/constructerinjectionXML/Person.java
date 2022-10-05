package com.practice.constructerinjectionXML;

public class Person {
    private Proof proof;

    public Person(Proof proof) {
        this.proof = proof;
    }


    public void getPersonProof() {
        proof.getProof();
    }
}
