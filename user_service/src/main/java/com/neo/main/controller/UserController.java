package com.neo.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.neo.main.model.User;
import com.neo.main.service.UserService;

@RestController
@RequestMapping("/test")
public class UserController {
	
	@Autowired
	UserService us;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/{userId}")
	public User getUser(@PathVariable Long userId)
	{
		User user=this.us.getUser(userId);
		//http://localhost:9002/loan/user/1213
		List loan= this.restTemplate.getForObject("http://loan-service/loan/user/"+user.getUserId(), List.class);
		user.setLoan(loan);
		
		return user;
		
	}

}
