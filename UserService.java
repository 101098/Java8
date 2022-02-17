package com.user.service;

import com.user.model.User;

public interface UserService {

	User findById(Long Id);
	User createUser(User user);
	
}
