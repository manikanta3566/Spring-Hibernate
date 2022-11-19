package com.practice.web_customer_crud.DAO;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.practice.web_customer_crud.entity.Customer;

@Repository
public class CustomerDaoImpl implements CustomerDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Customer> getCustomers() {
		
		//get the current hibernate session from session factory
		Session session = sessionFactory.getCurrentSession();
		
		//create the query
		Query<Customer> query=session.createQuery("select c from Customer c",Customer.class);
		
		//execute the query
		List<Customer> customers = query.getResultList();
		
		return customers;
	}

	@Override
	public void saveContact(Customer customer) {
		//get the currnt session form session factory
		Session currentSession = sessionFactory.getCurrentSession();
		
		//save the customer
		currentSession.saveOrUpdate(customer);	
	}

	@Override
	public Customer getCustomerById(int id) {
		// get the current session from session factory
		Session currentSession = sessionFactory.getCurrentSession();
		
		//get the customer from db
		Customer customer = currentSession.get(Customer.class,id);
		return customer;
	}

	@Override
	public void deleteCustomer(int id) {
		// get the current session from session factory
		Session currentSession = sessionFactory.getCurrentSession();
		
		//delete the customer
		Query query=currentSession.createQuery("delete from Customer where id=:customerId");
		query.setParameter("customerId",id);
		query.executeUpdate();
		
	}

}
