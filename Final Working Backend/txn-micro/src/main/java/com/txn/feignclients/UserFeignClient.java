package com.txn.feignclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.txn.dto.UserDto;
import com.txn.response.UserResponse;

@FeignClient(url = "${users.service.url}", value = "user-feign-client", path = "/api/user")
public interface UserFeignClient {
	@GetMapping("/getById/{id}")
	public UserResponse getById(@PathVariable int id);
}
