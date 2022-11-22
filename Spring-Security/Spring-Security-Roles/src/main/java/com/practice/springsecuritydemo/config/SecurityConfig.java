package com.practice.springsecuritydemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

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
                .roles("EMPLOYEE","MANAGER")
                .build();
        UserDetails admin= User.builder()
                .username("admin")
                .password("{noop}test@123")
                .roles("EMPLOYEE","ADMIN")
                .build();
        return new InMemoryUserDetailsManager(john,petter,admin);
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception {
       return httpSecurity
               .authorizeRequests()
               .antMatchers("/").hasRole("EMPLOYEE")
               .antMatchers("/manager/**").hasRole("MANAGER")
               .antMatchers("/admin/**").hasRole("ADMIN")
               .anyRequest()
               .authenticated()
               .and()
               .formLogin()
               .loginPage("/showLoginPage")
               .loginProcessingUrl("/authenticateUser")
               .permitAll()
               .and()
               .logout()
               .permitAll()
               .and()
               .exceptionHandling()
               .accessDeniedPage("/access-denied")
               .and()
               .build();

    }
}
