package com.practice.web_customer_crud.service;

import java.util.List;

import com.practice.web_customer_crud.entity.Customer;

public interface CustomerService {
	
List<Customer> getAllCustomers();

void saveContact(Customer customer);

 Customer getCustomerById(int id);

void deleteCustomer(int id);
 

}
