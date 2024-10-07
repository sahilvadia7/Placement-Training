package com.group1.shoppingmall.controller;

import java.util.List;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.group1.shoppingmall.impl.UserImpl;
import com.group1.shoppingmall.model.User;
import com.group1.shoppingmall.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	
	@Autowired
	private UserImpl service;		
	
	@PostMapping("add")
	public ResponseEntity<String> addUser(@RequestBody  User user) {
		if(service.addUser(user) != null) {
			return new ResponseEntity<>("Success",HttpStatus.CREATED);
		}
		else {
			return new ResponseEntity<>("NullPointing",HttpStatus.BAD_REQUEST);
		}
		    
	}
	

	@PutMapping("update")
	public ResponseEntity<User> updateUser(@RequestBody User user){
		
		if(service.updateUser(user) != null) {
			return new ResponseEntity<>(service.getUser(user.getId()),HttpStatus.ACCEPTED);
		}
		else {
			return new ResponseEntity<>(user,HttpStatus.CONFLICT);
		}
	}
	
	@DeleteMapping("delete/{id}")
	public String deleteUser(@PathVariable Long id){
		return service.deleteUser(id);
	}
	
	
	//New Methods
	@GetMapping("getAll")
	public ResponseEntity<List<User>> getAllUser(){
		List<User> listOfUser = service.getAllUser();
		if(listOfUser != null) {
			return new ResponseEntity<>(listOfUser,HttpStatus.FOUND);
		}else {
			return new ResponseEntity<>(listOfUser,HttpStatus.NOT_FOUND);
		}
	}
	
	@GetMapping("get/{id}") 
	public ResponseEntity<User> getUser(@PathVariable Long id){
		User user = service.getUser(id);
		if(user != null) {
			return new ResponseEntity<User>(user,HttpStatus.FOUND);
		}
		else {
			return new ResponseEntity<User>(user,HttpStatus.NOT_FOUND);
		}
	}
	
//	@GetMapping("login")
//	public ResponseEntity<String> login(@RequestBody User user){
//		if(service.login(user) != null) {
//			return new ResponseEntity<>(service.getUser(user.getId()),HttpStatus.FOUND);
//		}
//		else {
//			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//		}
//	}
//	

	}
