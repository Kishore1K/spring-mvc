package com.spring.controller;

import java.util.List;
import java.lang.reflect.Array;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

import net.bytebuddy.matcher.ModifierMatcher.Mode;

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
	
	@RequestMapping(path = "/about", method = RequestMethod.GET)
	public String about() {
		return "about";
	}
	
	@RequestMapping("/test/{name}/{phno}")
	public String pathHandler(@PathVariable("name") String name, @PathVariable("phno") Long no ) {
		System.out.println("Hello "+ name + " "+ " phno"+ " "+ no);
		Integer.parseInt(name);
		return "home";
	}
	
	@RequestMapping("/help")
	public ModelAndView help() {
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("name", "Kishore K Reddy");
		modelAndView.addObject("id", 1243);
		LocalDateTime now = LocalDateTime.now();
		
		List<Integer> marks = new ArrayList<Integer>(Arrays.asList(80,92, 100, 17627, 26772));
		modelAndView.addObject("marks", marks);
		modelAndView.addObject("time", now);
		modelAndView.setViewName("help");
		
		return modelAndView;
	}
	
//	@ExceptionHandler({NullPointerException.class, NumberFormatException.class})
	@ExceptionHandler(value = NullPointerException.class)
	public String exceptionHandlerNULL(Model model) {
		model.addAttribute("msg", "NullException");
		return "blank";
	}
	
	@ResponseStatus(value = HttpStatus.BAD_REQUEST)
	@ExceptionHandler(value = NumberFormatException.class)
	public String exceptionHandlerN(Model model) {
		model.addAttribute("msg", "Number Format");
		return "blank";
	}
	
	@ExceptionHandler(value =Exception.class)
	public String genericEx(Model model) {
		return "blank";
	}
}
