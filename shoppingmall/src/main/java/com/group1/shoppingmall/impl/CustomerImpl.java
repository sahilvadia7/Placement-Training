package com.group1.shoppingmall.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.group1.shoppingmall.model.Customer;
import com.group1.shoppingmall.model.User;
import com.group1.shoppingmall.repo.CustomerRepository;
import com.group1.shoppingmall.service.CustomerService;

@Service
public class CustomerImpl implements CustomerService {

	@Autowired
	private CustomerRepository repo;
	
	@Override
	public Customer orderItem(String item) {
		return null;
	}

	@Override
	public List<Customer> searchItem(String itemName) {
		List<Customer> list = repo.findAll();
		  // Filter customers whose orders contain the item
	    return list.stream()
	               .filter(customer -> customer.getOrders().contains(itemName))
	               .toList();
	}

	@Override
	public boolean cancelOrder(long orderId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public User login(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean logout() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Customer addCustomer(Customer customer) {
		return repo.save(customer);
	}

	public List<Customer> getAll() {
		return repo.findAll();
	}

	
}
