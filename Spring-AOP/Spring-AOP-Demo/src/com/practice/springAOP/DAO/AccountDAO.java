package com.practice.springAOP.DAO;

import org.springframework.stereotype.Component;

import com.practice.springAOP.Account;

@Component
public class AccountDAO {

	public void addAccount(Account account,boolean flag) {
		System.out.println(getClass() +" account added");
	}
	
	public void deleteAccount() {
		System.out.println("account deleted");
	}
	
	
}
