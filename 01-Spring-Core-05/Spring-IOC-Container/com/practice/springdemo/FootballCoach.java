package com.practice.springdemo;

public class FootballCoach implements Coach{
    @Override
    public String getDailyPracticeTime() {
        return "practiced 1hr";
    }
}
