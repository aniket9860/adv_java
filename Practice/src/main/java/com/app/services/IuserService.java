package com.app.services;

import java.util.List;
import java.util.Optional;

import com.app.entity.User;

public interface IuserService {

	User authenticateUser(String name, String pass);
	
	List<User> getAllteachers();
	
	String deleteTeacher(Long id);
	
	Optional<User> getTeacher(Long id);
	
	User updatedDetails(User user);
}
