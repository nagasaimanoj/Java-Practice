package com.kg.springjava.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	@RequestMapping("/home")
	public String home(Model model) {

		model.addAttribute("name", "home");

		return "home";
	}
	
	@RequestMapping("/welcome")
	public String welcome(Model model) {

		model.addAttribute("name", "welcome");

		return "welcome";
	}
}
