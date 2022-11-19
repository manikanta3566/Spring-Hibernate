package com.practice.springAOP.DAO;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.practice.springAOP.Account;

@Component
public class AccountDAO {

	public List<Account> findAccounts(){
		List<Account> accounts=new ArrayList<Account>();
		accounts.add(new Account("john"));
		accounts.add(new Account("petter"));
		accounts.add(new Account("paul"));
		accounts.add(new Account("ishan"));
		return accounts;
	}
	
}
