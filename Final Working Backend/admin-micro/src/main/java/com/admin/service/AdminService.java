package com.admin.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.admin.entity.Admin;
import com.admin.repository.AdminRepository;
import com.admin.request.CreateAdminRequest;
import com.admin.response.AdminResponse;
@Service
public class AdminService {

	Logger logger = LoggerFactory.getLogger(AdminService.class);
	
	@Autowired
	AdminRepository adminRepository;
	
	public AdminResponse createAdmin(CreateAdminRequest createAdminRequest) {
		Admin admin = new Admin();
		admin.setEmail(createAdminRequest.getEmail());
		admin.setName(createAdminRequest.getName());
		admin.setUserName(createAdminRequest.getUsername());
		

		adminRepository.save(admin);
		
		return new AdminResponse(admin);
		
	}
	
	public AdminResponse getById (int id) {
		logger.info("Inside getById " + id);
		Admin admin = adminRepository.findById(id).get();
		return new AdminResponse(admin);
	}
}
