package com.spring.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.entity.student1;

@Controller
public class formController {
	
	
	@RequestMapping("/form1")
	public String home() {
		System.out.println("Home Form ");
		return "form";
	}
	
	
	@RequestMapping(path = "/handleForm", method = RequestMethod.POST)
	public String handelForm(@ModelAttribute("student1") student1  s1 ) {
		System.out.println(s1);
		return "success";
	}

}
