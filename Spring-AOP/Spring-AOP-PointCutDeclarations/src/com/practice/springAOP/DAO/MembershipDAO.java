package com.practice.springAOP.DAO;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {

	public boolean addAccount() {
		System.out.println("membership add account executed");
		return true;
	}
	
	public void deleteMember() {
		System.out.println("member deleted");
	}
	
}
