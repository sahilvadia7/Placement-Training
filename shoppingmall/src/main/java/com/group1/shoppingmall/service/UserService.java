package com.group1.shoppingmall.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.group1.shoppingmall.model.User;
import com.group1.shoppingmall.repo.UserRepo;

@Service
public interface UserService {
	
	//Default Methods
	public User addUser(User user);
	public User updateUser(User user);
	public User login(User user);
	public boolean logOut();
	
	//New Methods
	public List<User> getAllUser();
}
