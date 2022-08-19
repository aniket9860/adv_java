package com.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "Users_tbl")
@Getter
@Setter
@ToString
public class User extends BaseEntity {

	@Column(length = 20)
	private String name;
	@Column(length = 20)
	private String password;
	@Enumerated(EnumType.STRING)
	@Column(length = 20)
	private Role role;

}
