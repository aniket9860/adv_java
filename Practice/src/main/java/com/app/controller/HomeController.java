package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	public HomeController() {
		System.out.println("In home controller");
	}

	@GetMapping("/")
	public String showHomePage() {
		System.out.println("in home page");
		return "/index";
	}
}
