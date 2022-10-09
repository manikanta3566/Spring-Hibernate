package com.practice.javaconfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.practice.javaconfiguration")
@PropertySource("classpath:person.properties")
public class Config {
    @Bean
    public Person getPerson(){
        return new Person(getPassport());
    }

    @Bean
    public Proof getPassport(){
        return new Passport();
    }

    @Bean
    public Proof getPan(){
        return new Pan();
    }
}
