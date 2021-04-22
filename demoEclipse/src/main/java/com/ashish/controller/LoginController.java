package com.ashish.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.ashish.command.Person;
import com.ashish.service.PersonService;

@Controller
public class LoginController {
	
	@Autowired
	private PersonService service;
	
	@GetMapping("/signin.php")
	public String login(@ModelAttribute("person") Person person) {
		
		
		return "login";
		
	}
	
	@PostMapping("/signin.php")
	public String success(@ModelAttribute("person") Person person,Map<String,Object> map) {
		//String result=service.register(person);
		//System.out.println(result);
		//map.put("result", result);
		List<Person> result=service.getAllPerson();
		System.out.println(result);
		map.put("result",result);
		return "success";
	}
	


}
