package com.app.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.UserRepository;
import com.app.entity.User;

@Service
@Transactional
public class UserServiceImpl implements IuserService {

	@Autowired
	UserRepository userDao;

	@Override
	public User authenticateUser(String name, String pass) {

		return userDao.findByNameAndPassword(name, pass)
				.orElseThrow(() -> new RuntimeException("Invalid email or password"));
	}

	@Override
	public List<User> getAllteachers() {

		return userDao.findAll();
	}

	@Override
	public String deleteTeacher(Long id) {
		userDao.deleteById(id);
		return "Delete successfully";
	}

	@Override
	public Optional<User> getTeacher(Long id) {

		return userDao.findById(id);
	}

	@Override
	public User updatedDetails(User user) {
		return userDao.save(user);
	}

}
