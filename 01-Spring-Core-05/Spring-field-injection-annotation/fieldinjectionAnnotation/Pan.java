package com.practice.fieldinjectionAnnotation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Pan implements Proof {
    @Override
    public void getProof() {
        System.out.println("pan card selected");
    }
}
