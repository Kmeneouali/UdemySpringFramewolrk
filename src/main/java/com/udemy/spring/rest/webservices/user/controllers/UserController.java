package com.udemy.spring.rest.webservices.user.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.udemy.spring.rest.webservices.user.beans.User;
import com.udemy.spring.rest.webservices.user.dao.userDaoService;

@RestController
public class UserController {
	
	
	@Autowired
	userDaoService services;

	@GetMapping("/users")
	public List<User> retrieveAllUser(){
		return services.findAll();
	}
	
	@GetMapping("/users/{id}")
	public User retrieveUserById(@PathVariable Integer id) {
		return services.findOne(id);
	}
}
