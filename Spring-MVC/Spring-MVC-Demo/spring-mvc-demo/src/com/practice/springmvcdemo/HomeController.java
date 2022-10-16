package com.practice.springmvcdemo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HomeController {
	
	
	//showing the form page
	@RequestMapping("/show-form")
	public String showForm() {
		return "form";
	}
	
	
	//processing the form page data using httpservletrequest
	@RequestMapping(value="/process-form-one")
	public String processForm(HttpServletRequest request,Model model) {
		//getting the name from the request
		String name = request.getParameter("studentName");
		
		//adding data to the model
		model.addAttribute("name", name.toUpperCase());
		
		return "show_student_name";
	}
	
	//processing the form page data using request param
		@RequestMapping(value="/process-form-two")
		public String processFormReqParam(@RequestParam("studentName") String name,Model model) {
			
			//adding data to the model
			model.addAttribute("name", name.toUpperCase());
			
			return "show_student_name";
		}

}
