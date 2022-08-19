package com.app.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.UserRepository;
import com.app.pojos.User;

@Service
@Transactional
public class ServiceUserImpl implements IServiceUser {
	@Autowired
	UserRepository userRepo;

	@Override
	public String addEmployee(User newUser) {
		userRepo.save(newUser);
		return "User added";
	}

	@Override
	public User authenticateUser(String name, String pass) {
		Optional<User> user = userRepo.findByEmailAndPassword( name, pass);
		return user.orElseThrow();
	}

}
