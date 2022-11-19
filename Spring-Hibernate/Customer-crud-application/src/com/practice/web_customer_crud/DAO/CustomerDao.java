package com.practice.web_customer_crud.DAO;

import java.util.List;

import com.practice.web_customer_crud.entity.Customer;

public interface CustomerDao {
	
	List<Customer> getCustomers();

	void saveContact(Customer customer);

	Customer getCustomerById(int id);

	void deleteCustomer(int id);

}
