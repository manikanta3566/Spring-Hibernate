package com.practice.springsecuritydemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public InMemoryUserDetailsManager inMemoryUserDetailsManager(){
        UserDetails john= User.builder()
                .username("john")
                .password("{noop}test@123")
                .roles("EMPLOYEE")
                .build();
        UserDetails petter= User.builder()
                .username("petter")
                .password("{noop}test@123")
                .roles("MANAGER")
                .build();
        UserDetails admin= User.builder()
                .username("admin")
                .password("{noop}test@123")
                .roles("ADMIN")
                .build();
        return new InMemoryUserDetailsManager(john,petter,admin);
    }
}
