package com.spring.controller;


import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.mysql.jdbc.Blob;
import com.spring.entity.student1;

@Controller
public class formController {
	
	
	@RequestMapping("/form1")
	public String home() {
		System.out.println("Home Form ");
		return "form";
	}
	
	@RequestMapping("/file")
	public String fileForm() {
		System.out.println("File Form ");
		return "fileForm";
	}
	
	
	@RequestMapping(path = "/handleForm", method = RequestMethod.POST)
	public String handelForm(@ModelAttribute("student1") student1  s1, BindingResult bindingResult ) {
		if(bindingResult.hasErrors()) {
			System.out.println(bindingResult);
			return "form";
		}
		System.out.println(s1);
		return "success";
	}

	
	@RequestMapping(value  = "/submitFile", method = RequestMethod.POST, consumes = { MediaType.MULTIPART_FORM_DATA_VALUE})
	public String handleFile(@RequestParam("file") CommonsMultipartFile file) {
		System.out.println("File Uploaded");
		System.out.println(file.getName());
		System.out.println(file.getStorageDescription());
		return "success";
		
	}
}
