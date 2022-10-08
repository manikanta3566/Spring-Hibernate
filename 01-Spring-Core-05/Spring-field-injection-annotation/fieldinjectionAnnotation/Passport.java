package com.practice.fieldinjectionAnnotation;

import org.springframework.stereotype.Component;

@Component
public class Passport implements Proof {

    @Override
    public void getProof() {
        System.out.println("passport is selected");
    }
}
