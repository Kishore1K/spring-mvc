package com.spring.controller;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;


@ControllerAdvice
public class myExceptionHandler {
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
