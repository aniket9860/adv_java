package com.app.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.entity.Role;
import com.app.entity.User;
import com.app.services.IuserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private IuserService userService;

	public UserController() {
		System.out.println("in ctor of " + getClass());
	}

	@GetMapping("/login")
	public String showLoginForm() {
		System.out.println("in show login form");
		return "/user/login";// AVN : /WEB-INF/views/user/login.jsp
	}

	@PostMapping("/login")
	public String processloginForm(@RequestParam String name, @RequestParam String password, HttpSession session,
			Model map) {

		try {

			User user = userService.authenticateUser(name, password);
			session.setAttribute("user_dtls", user);
			map.addAttribute("user", user);
			if (user.getRole() == Role.ADMIN)
				return "redirect:/admin/getTeachers";
			else
				return "/teacher/list";
		} catch (Exception e) {
			System.out.println("Invalid login");
			map.addAttribute("mesg", "Invalid Login Please Retry");
			return "/user/login";
		}
	}
}
