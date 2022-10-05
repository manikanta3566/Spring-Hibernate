package com.practice.setterinjectionXML;

public class Person {

    //injecting Dependency injection to this field
    private Proof proof;

    //adding extra fields
    private String name;
    private int age;

    public Person() {
        System.out.println("constructer called");
    }

    //setter for setter dependency injection
   public void setProof(Proof proof){
        this.proof=proof;
    }


    public void getPersonProof() {
        proof.getProof();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
