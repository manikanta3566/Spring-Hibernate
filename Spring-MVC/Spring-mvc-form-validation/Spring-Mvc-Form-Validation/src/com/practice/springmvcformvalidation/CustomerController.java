package com.practice.springmvcformvalidation;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	//adding init binder to remove whitespace in the strings
	@InitBinder
	public void initbinder(WebDataBinder binder) {
		StringTrimmerEditor editor=new StringTrimmerEditor(true);
		binder.registerCustomEditor(String.class,editor);
	}
	
	
	@RequestMapping("/show-form")
	public String showForm(Model model) {
		model.addAttribute("customer",new Customer());
		return "form";
	}
	
	@RequestMapping("/processform")
	public String processForm(@Valid @ModelAttribute Customer customer,
			BindingResult bindingResult,Model model) {
		System.out.println("|"+customer.getFirstName()+"|");
		System.out.println(bindingResult);
		if(bindingResult.hasErrors()) {
			return "form";
		}
		model.addAttribute("customer",customer);
		return "confirm-page";
	}
}
