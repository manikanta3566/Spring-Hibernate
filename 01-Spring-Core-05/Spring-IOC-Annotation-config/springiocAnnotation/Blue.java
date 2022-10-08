package com.practice.springiocAnnotation;

import org.springframework.stereotype.Component;

@Component("blue")
public class Blue implements Color{

    @Override
    public void printColorName() {
        System.out.println("blue color");
    }
}
