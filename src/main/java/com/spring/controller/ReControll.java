package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ReControll {
	
	
	@RequestMapping("/one")
	public String one() {
		System.out.println("This is one");
		return "redirect:three";
	}
	
	@RequestMapping("/two")
	public String two() {
		System.out.println("This is Two");

		return "contact";
	}
	


	@RequestMapping("/three")
	public RedirectView three() {
		System.out.println("This is Three");
		RedirectView rView = new RedirectView();
		rView.setUrl("two");

		return rView;
	}

}
