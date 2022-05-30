package com.facebook.service;

import java.util.List;

import com.facebook.model.User;

public interface UserService {
	
	public Integer saveUser(User user);
	public User updateUser(User user);
	void   deleteUserById(Integer id);
	public User getById(Integer id);

	public List<User> getAllUser();
	
	
	

}
