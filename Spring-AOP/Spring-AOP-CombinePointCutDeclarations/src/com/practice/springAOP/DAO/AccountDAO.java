package com.practice.springAOP.DAO;

import org.springframework.stereotype.Component;

import com.practice.springAOP.Account;

@Component
public class AccountDAO {
	
	private String name;
	
	private String code;

	public void addAccount(Account account,boolean flag) {
		System.out.println(getClass() +" account added");
	}
	
	public void deleteAccount() {
		System.out.println("account deleted");
	}

	public String getName() {
		System.out.println("executed getname() method");
		return name;
	}

	public void setName(String name) {
		System.out.println("executed setname() method");
		this.name = name;
	}

	public String getCode() {
		System.out.println("executed getcode() method");
		return code;
	}

	public void setCode(String code) {
		System.out.println("executed setcode() method");
		this.code = code;
	}
	
	
	
	
}
