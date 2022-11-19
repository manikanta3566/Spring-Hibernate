package com.practice.springAOP.DAO;

import java.util.concurrent.TimeUnit;

import org.springframework.stereotype.Component;

@Component
public class TestExecutionTime {

	public String demo() {
		try {
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return "execution completed";
	}
	
	public String generateException(boolean flag) {
		if(flag) {
			throw new RuntimeException("exception occured");
		}
		return "execution completed";
		
	}
	
}
