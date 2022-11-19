package com.practice.web_customer_crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.practice.web_customer_crud.DAO.CustomerDao;
import com.practice.web_customer_crud.entity.Customer;
import com.practice.web_customer_crud.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/list")
	public String listCustomer(Model model) {
		
		//call the service method to get list of customers
		List<Customer> customers = customerService.getAllCustomers();
		
		//add the customers to model
		model.addAttribute("customers", customers);
		
		System.out.println(customers);
		return "customer_list";
	}
	
	@GetMapping("/showForm")
	public String showCustomerAddForm(Model model) {
		Customer customer=new Customer();
		model.addAttribute("customer",customer);
		return "customer_add_form";
	}
	
	@PostMapping("/saveContact")
    public String saveContact(@ModelAttribute("customer") Customer customer) {
		customerService.saveContact(customer);
		return "redirect:/customer/list";
	}
	
	@GetMapping("/showUpdateForm")
	public String showUpdateForm(@RequestParam("customerId") int id,Model model){
	Customer customer=customerService.getCustomerById(id);
	model .addAttribute("customer", customer);
	return "customer_add_form";
	}

    @GetMapping("/delete")
    public String deleteCustomer(@RequestParam("customerId") int id) {
    	customerService.deleteCustomer(id);
    	return "redirect:/customer/list";
    }
}
