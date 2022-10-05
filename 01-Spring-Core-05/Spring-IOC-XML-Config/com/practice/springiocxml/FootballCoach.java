package com.practice.springiocxml;

public class FootballCoach implements Coach{
    @Override
    public String getDailyPracticeTime() {
        return "practiced 1hr";
    }
}
