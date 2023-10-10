package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequestMapping("/search")
public class SearchController {
	
	@RequestMapping("/home")
	public String home() {
		System.out.println("Home ");
		return "home";
		
	}
	
	@RequestMapping(path = "submitSearch", method = RequestMethod.GET)
	public RedirectView processRequeString(@RequestParam("text")String query) {
		RedirectView redirectView= new RedirectView();
		
		String url = "https://www.google.com/search?q="+query;
		redirectView.setUrl(url);
		return  redirectView;
		
	}

}
