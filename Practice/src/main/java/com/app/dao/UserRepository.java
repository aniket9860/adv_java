package com.app.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

	Optional<User> findByNameAndPassword(String name, String pass);
}
