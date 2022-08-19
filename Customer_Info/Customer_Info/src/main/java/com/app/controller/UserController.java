package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.pojos.User;
import com.app.service.IServiceUser;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	IServiceUser userService;

	@RequestMapping("/signup")
	public String signUpEmp(User user1)// user--> modelAttribute
	{
		System.out.println("Inside signup page");
		return "/user/signup";
	}

	@PostMapping("/signup")
	public String signUpUser(User newUser) {
		System.out.println("Inside post add user");
		userService.addEmployee(newUser);
		return "redirect:/";
	}

	@RequestMapping("/login")
	public String toLogin() {
		return "/user/login";
	}

	// login method
	@PostMapping("/login")
	public String processLoginForm(@RequestParam String em, @RequestParam(name = "pass") String password, Model map) {
		System.out.println("in process login form " + em + " " + password);// actual em n password values
		// for authentication : DB based : simply call service layer method
		try {
			User user = userService.authenticateUser(em, password);
			// store validated user details under model map
			if (user != null) {
				map.addAttribute("user_details", user);
			} else {
				new RuntimeException();
			}
			// => valid login (authentication success) --> proceed to authorization

			return "redirect:/country/list";
		} catch (RuntimeException e) {
			System.out.println("err in " + getClass() + " err " + e);
			// => invalid login ---> forward the clnt to the login form
			map.addAttribute("mesg", "Invalid Login , Pls retry !!!!!!!!!!!!");
			return "/user/login";// Handler(RHC --> LVN --> D.S) : AVN : /WEB-INF/views/user/login.jsp
		}
	}

}
