package com.practice.springsecuritydemo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import javax.sql.DataSource;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Autowired
    private DataSource dataSource;

    @Bean
    public UserDetailsManager userDetailsManager() {
        return new JdbcUserDetailsManager(dataSource);
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
