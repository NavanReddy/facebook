package com.facebook.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.facebook.model.User;
import com.facebook.repo.UserRepository;
import com.facebook.service.UserService;


@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userrepo;

	@Override
	public Integer saveUser(User user) {
		
		User obj = userrepo.save(user);
		return obj.getId();
		
		
	}

	@Override
	public User updateUser(User user) {
		
		return userrepo.save(user);
	}

	@Override
	public void deleteUserById(Integer id) {
		
		userrepo.deleteById(id);
		
	}

	@Override
	public User getById(Integer id) {
		
		return userrepo.getById(id);
	}

	
	@Override
	public List<User> getAllUser() {
		
		return userrepo.findAll();
	}

}
