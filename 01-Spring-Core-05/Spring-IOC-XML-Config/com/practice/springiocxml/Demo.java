package com.practice.springiocxml;

public class Demo {
    public static void main(String[] args) {
        Coach coach=new CricketCoach();
        System.out.println(coach.getDailyPracticeTime());
    }
}
