package com.spring.controller;

import java.util.List;
import java.util.ArrayList;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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
}
