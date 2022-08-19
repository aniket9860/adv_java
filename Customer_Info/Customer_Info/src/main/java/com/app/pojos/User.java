package com.app.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

@Entity
@Table(name = "user")
public class User extends BaseEntity{
	@Column(length = 20)
	private String name;
	@Column(length = 30, unique = true)
	private String email;
	@Column(length = 50, nullable = false)
	private String password;
}
