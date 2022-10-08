package com.practice.springiocAnnotation;

import org.springframework.stereotype.Component;

@Component
public class Red implements Color{
    @Override
    public void printColorName() {
        System.out.println("red color");
    }
}
