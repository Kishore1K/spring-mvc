package com.spring.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.spring.model.User;
import com.spring.service.userService;

@Controller
public class ContactController {
	
	@Autowired
	private userService uService;
	
	@ModelAttribute
	public void common(Model m) {
		m.addAttribute("Header", "SignUP Form");
		m.addAttribute("Success", "SignUp Sucess");

	}
	@RequestMapping(path = "/form", method = RequestMethod.GET)
	public String showForm(Model m) {
//		m.addAttribute("Header", "SignUP Form");
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
	
	public ModelAndView handleForm1(@RequestParam("userName") String name, @RequestParam("userEmail") String email, @RequestParam("userPassword") String password, ModelAndView modelAndView) {
		User user = new User();
		user.setUserEmail(email);
		user.setUserName(name);
		user.setUserPassword(password);
		/*
		 * modelAndView.addObject("user", name); modelAndView.addObject("email", email);
		 * modelAndView.addObject("password", password);
		 */
		modelAndView.addObject("user",user);
		modelAndView.setViewName("success");
		System.out.println(user);
		return modelAndView;
	}
	@RequestMapping(path = "/submitForm", method= RequestMethod.POST)
	public String handleForm2(@ModelAttribute User user, Model model) {
//		model.addAttribute("Header", "Signup Success");
		int v = this.uService.createUser(user);
		model.addAttribute("msg", "User Created and The ID is "+v);
		
		System.out.println(user);
		return "success";
		
	}
}
