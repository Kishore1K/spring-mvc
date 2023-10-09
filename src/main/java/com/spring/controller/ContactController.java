package com.spring.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ContactController {
	@RequestMapping(path = "/form", method = RequestMethod.GET)
	public String showForm() {
		return "contact";
	}
	
	public ModelAndView handelForm(HttpServletRequest request) {
		
		String user = request.getParameter("userName");
		String email = request.getParameter("userEmail");
		String password = request.getParameter("userPassword");

		ModelAndView modelAndView  = new ModelAndView();
		modelAndView.addObject("user", user);
		modelAndView.addObject("email", email);
		modelAndView.addObject("password", password);
		
		modelAndView.setViewName("contact");
		
		System.out.println("Name :"+user + ", Email :"+email+", password :"+password);
		return modelAndView;
		
	}
	
	@RequestMapping(path = "/submitForm", method= RequestMethod.POST)
	public ModelAndView handleForm1(@RequestParam("userName") String name, @RequestParam("userEmail") String email, @RequestParam("userPassword") String password, ModelAndView modelAndView) {
		modelAndView.addObject("user", name);
		modelAndView.addObject("email", email);
		modelAndView.addObject("password", password);
		modelAndView.setViewName("success");
		System.out.println("Name :"+name + ", Email :"+email+", password :"+password);
		return modelAndView;
		
	}
}
