package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.IUserInfoService;

@RestController
@RequestMapping("/user/auth")
public class UserDetailsContoller {
	
	@Autowired
	private IUserInfoService infoService;
}
