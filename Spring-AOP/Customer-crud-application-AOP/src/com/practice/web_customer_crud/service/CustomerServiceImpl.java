package com.practice.web_customer_crud.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.web_customer_crud.DAO.CustomerDao;
import com.practice.web_customer_crud.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	//injecting customerdao 
	@Autowired
	private CustomerDao customerDao;

	@Override
	@Transactional
	public List<Customer> getAllCustomers() {
		return customerDao.getCustomers();
	}

	@Override
	@Transactional
	public void saveContact(Customer customer) {
	   customerDao.saveContact(customer);	
	}

	@Override
	@Transactional
	public Customer getCustomerById(int id) {
		return customerDao.getCustomerById(id);
	}

	@Override
	@Transactional
	public void deleteCustomer(int id) {
		customerDao.deleteCustomer(id);
	}

}
