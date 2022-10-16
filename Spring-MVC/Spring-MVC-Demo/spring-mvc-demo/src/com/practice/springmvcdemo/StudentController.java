package com.practice.springmvcdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	//showing student form page
	@RequestMapping("/show-form")
	public String showForm(Model model) {
		//creating student object
		Student student=new Student();
		
		//adding student object to model
		model.addAttribute("student", student);
	
		return "student-form";
	}
	
	//processing the student data getting from from
	@RequestMapping("/proccessform")
	public String processForm(@ModelAttribute Student student,Model model) {
		
		//adding data to the model
		model.addAttribute("student",student);
		
		return "student-confirmation";
		
	}

}
