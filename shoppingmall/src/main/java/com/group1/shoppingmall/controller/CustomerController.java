package com.group1.shoppingmall.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.group1.shoppingmall.impl.CustomerImpl;
import com.group1.shoppingmall.model.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("customer")
public class CustomerController {
	
	@Autowired
	private CustomerImpl impl;

	@PostMapping("/add")
	public Customer addCustomer(@RequestBody Customer customer) {
		return impl.addCustomer(customer);
	}
	
	@GetMapping("getAll")
	public List<Customer> getAll() {
		return impl.getAll();
	}
	
	
	@GetMapping("searchItem/{item}")
	public ResponseEntity<List<Customer>> searchItem(@PathVariable String item){
		
		if(item != null) {
			return new ResponseEntity<List<Customer>>(impl.searchItem(item),HttpStatus.FOUND);
		}
		else {
			return new ResponseEntity<List<Customer>>(HttpStatus.NOT_FOUND);
		}
	}
	
	
}
