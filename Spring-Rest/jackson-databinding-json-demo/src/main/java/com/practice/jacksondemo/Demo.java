package com.practice.jacksondemo;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class Demo {
    public static void main(String[] args) {
        try {
            ObjectMapper objectMapper=new ObjectMapper();
            Student student = objectMapper.readValue(new File("data/sample-full.json"), Student.class);
            System.out.println(student.getId());
            System.out.println(student.getFirstName());
            System.out.println(student.getLastName());
            System.out.println(student.isActive());
            System.out.println("address");
            System.out.println(student.getAddress().getStreet());
            System.out.println(student.getAddress().getCity());
            System.out.println(student.getAddress().getCountry());
            System.out.println(student.getAddress().getState());
            System.out.println(student.getAddress().getZip());
            System.out.println("languages");
            for(String lang:student.getLanguages()){
                System.out.println(lang);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
