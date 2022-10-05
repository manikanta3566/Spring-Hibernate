package com.practice.constructerinjectionXML;

public class Passport implements Proof{

    @Override
    public void getProof() {
        System.out.println("passport is selected");
    }
}
