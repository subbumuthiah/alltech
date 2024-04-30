package com.user.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.user.entity.User;
import com.user.repository.UserRepository;
import com.user.request.CreateUserRequest;
import com.user.response.UserResponse;

@Service
public class UserService {
Logger logger = LoggerFactory.getLogger(UserService.class);
	
	@Autowired
	UserRepository userRepository;
	
	public UserResponse createUser(CreateUserRequest createUserRequest) {
		User user= new User();
		user.setAddress(createUserRequest.getAddress());
		user.setEmail(createUserRequest.getEmail());
		user.setName(createUserRequest.getName());
		user.setPh_no(createUserRequest.getPh_no());
		user.setUser_name(createUserRequest.getUser_name());

		userRepository.save(user);
		
		return new UserResponse(user);
		
	}
	
	public UserResponse getById (int id) {
		logger.info("Inside getById " + id);
		User user= userRepository.findById(id).get();
		return new UserResponse(user);
	}
}
