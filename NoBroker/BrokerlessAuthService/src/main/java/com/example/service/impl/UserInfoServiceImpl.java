package com.example.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.UserInfo;
import com.example.repo.UserInfoRepo;
import com.example.service.IUserInfoService;

@Service
public class UserInfoServiceImpl implements IUserInfoService {
	
	@Autowired
	private UserInfoRepo repo;
	
	@Override
	public String addUser(UserInfo userInfo) {
		 repo.save(userInfo);
		 return "USER ADDED SUCCESSFULLUY";
	}

}
