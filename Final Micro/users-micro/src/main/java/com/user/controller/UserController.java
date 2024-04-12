package com.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.request.CreateUserRequest;
import com.user.response.UserResponse;
import com.user.service.UserService;

@RestController
@RequestMapping("/api/user")
public class UserController {

	@Autowired
	UserService userService;
	
	@PostMapping("/create")
	public UserResponse createUser (@RequestBody CreateUserRequest createUserRequest) {
		return userService.createUser(createUserRequest);
	}
	
	@GetMapping("/getById/{id}")
	public UserResponse getById(@PathVariable int id) {
		return userService.getById(id);
	}
}
