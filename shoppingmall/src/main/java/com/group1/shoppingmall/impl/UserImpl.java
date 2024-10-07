package com.group1.shoppingmall.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.group1.shoppingmall.model.User;
import com.group1.shoppingmall.repo.UserRepo;
import com.group1.shoppingmall.service.UserService;

@Component
public class UserImpl implements UserService{

	@Autowired
	private UserRepo repo;
	
	
	@Override
	public User addUser(User user) {
		return repo.save(user);
	}
	
	@Override
	public User updateUser(User user) {
		return repo.save(user);
	}

	@Override
	public User login(User user) {
		return null;
	}

	@Override
	public boolean logOut() {
		// TODO Auto-generated method stub
		return false;
	}
	
	//New Methods

	@Override
	public List<User> getAllUser() {
		return repo.findAll();
	}

	public User getUser(Long id) {
		return repo.findById(id).orElse(null); 
		
	}

	public String deleteUser(Long id) {
		repo.deleteById(id);
		return "Deleted";
	}

	

}
