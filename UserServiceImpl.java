package com.user.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.model.User;
import com.user.repository.UserRepo;

@Service
public class UserServiceImpl implements UserService {
  
	@Autowired
	private UserRepo userRepo;
	
	@Override
	public User findById(Long id) {

		return userRepo.findById(id).get();
	}

	@Override
	public User createUser(User user) {
		
		return userRepo.save(user);
	}

}
