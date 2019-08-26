package com.stack.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int userId;
	String userName;
	String email;
	String password;
}
