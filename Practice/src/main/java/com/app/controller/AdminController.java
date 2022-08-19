package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.services.IuserService;

@Controller
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	IuserService userDao;

	public AdminController() {
		System.out.println("In admin Controller");
	}

	// "redirect:/admin/getTeachers"

	@GetMapping("getTeachers")
	public String getAllTeachers(Model map) {
		System.out.println("In get teachers");
		map.addAttribute("teachers", userDao.getAllteachers());
		return "/admin/getTeachers";
	}

	// http://localhost:8080/Practice/admin/delete?id=2
	@GetMapping("/delete")
	public String delete(@RequestParam long id) {
		System.out.println("In delete teacher");
		userDao.deleteTeacher(id);
		return "redirect:/admin/getTeachers";
	}
}
