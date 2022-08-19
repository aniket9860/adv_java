package com.app.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.entity.Role;
import com.app.entity.Subject;
import com.app.entity.User;
import com.app.services.ISubjectService;
import com.app.services.IuserService;

@Controller
@RequestMapping("/teacher")
public class TeacherController {

	@Autowired
	IuserService userdao;

	@Autowired
	ISubjectService subjdao;

	@GetMapping("/edit")
	public String editDetails(@RequestParam long id, User user, Model map) {

		map.addAttribute("id", id);
		return "/teacher/edit";
	}

	// http://localhost:8080/Practice/teacher/edit?id=2
	@PostMapping("/edit/{id}")
	public String updatedDetails(@PathVariable long id, User u, Model map, HttpSession session) {

		u.setId(id);
		u.setRole(Role.TEACHER);
		userdao.updatedDetails(u);

		return "redirect:/teacher/addsubject";
	}

	@GetMapping("/addsubject")
	public String addsubject(Subject subject) {
		System.out.println("in add page");

		return "/teacher/addsubject";
	}

	// http://localhost:8080/Practice/teacher/addsubject?id=2
	@PostMapping("/addsubject")
	public String add(Subject subject, HttpSession session, Model map) {

		subject.setUser((User) session.getAttribute("user_dtls"));
		System.out.println(subject);
		if (subjdao.addSubject(subject) != null)
			return "redirect:/teacher/getlist";
		else {
			map.addAttribute("mesg", "Failed To Add subject Try Again..");
			return "/teacher/addsubject";
		}
	}

	@GetMapping("/getlist")
	public String getlist(Model map) {

		map.addAttribute("subject_list", subjdao.getallsubjects());
		return "/teacher/home";

	}
}
