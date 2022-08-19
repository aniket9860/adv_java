package com.app.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.app.pojos.User;


public interface IServiceUser {
	String addEmployee(User newUser);
	User authenticateUser(String name, String pass);
}
