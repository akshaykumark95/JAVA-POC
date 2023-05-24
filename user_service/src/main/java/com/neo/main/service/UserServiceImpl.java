package com.neo.main.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.neo.main.model.User;

@Service
public class UserServiceImpl implements UserService 
{
	//fake user list
	List<User> list=List.of(
			new User(1213L,"Akshaykumar Khedkar","9766806444"),
			new User(1214L,"Gaurang D","9787886655"),
			new User(1215L,"Sagar P","9784848376")
			);
	
	@Override
	public User getUser(Long id) {
		return list.stream().filter(user->user.getUserId().equals(id)).findAny().orElse(null);
	}

}
