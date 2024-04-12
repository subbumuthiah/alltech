package com.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.admin.request.CreateAdminRequest;
import com.admin.response.AdminResponse;
import com.admin.service.AdminService;

@RestController
@RequestMapping("/api/admin")
public class AdminController {

	@Autowired
	AdminService adminService;
	
	@PostMapping("/create")
	public AdminResponse createAdmin(@RequestBody CreateAdminRequest createAdminRequest) {
		return adminService.createAdmin(createAdminRequest);
	}
	
	@GetMapping("/getById/{id}")
	public AdminResponse getById(@PathVariable int id) {
		return adminService.getById(id);
	}
	
	
}
