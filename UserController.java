package com.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.model.User;
import com.user.service.UserService;

@RestController
@RequestMapping(path = "/user/api/v1")
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping(path = "/user/{id}")
	public User findById(@PathVariable("id") Long id) {

		return userService.findById(id);
	}
	
	@PostMapping(path ="/user")
    public User createUser(@RequestBody User user) {
		
		return userService.createUser(user);
	}

}
