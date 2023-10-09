package com.spring.controller;

import java.util.List;
import java.time.LocalDateTime;
import java.util.ArrayList;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("/home")
	public String home(Model model) {
		System.out.println("Home Controller");
		model.addAttribute("name", "Kishore K Reddy");
		model.addAttribute("id", 1243);
		model.addAttribute("email","reddykishore@gmail.com");
		model.addAttribute("address", "KGF");
		List<String> friends = new ArrayList<String>();
		friends.add("Ankush");
		friends.add("Manju");
		friends.add("ani");
		friends.add("Karthick");
		model.addAttribute("friends", friends);
		
		
		return "index";
	}
	
	@RequestMapping("/about")
	public String about() {
		return "about";
	}
	
	
	@RequestMapping("/help")
	public ModelAndView help() {
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("name", "Kishore K Reddy");
		modelAndView.addObject("id", 1243);
		LocalDateTime now = LocalDateTime.now();
		modelAndView.addObject("time", now);
		modelAndView.setViewName("help");
		return modelAndView;
	}
}
