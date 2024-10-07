package com.group1.shoppingmall.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.group1.shoppingmall.model.*;

@Service
public interface CustomerService {
	
	
// original
//public Item orderItem(Item item);
//public List<Item> searchItem(String itemName);
//public Mall searchMall(long id);
//public boolean cancelOrder(long orderId);
//public User login(User user);
//public boolean logout();

	public Customer orderItem(String item);
	public List<Customer> searchItem(String itemName);
	//public Mall searchMall(long id);
	public boolean cancelOrder(long orderId);
	public User login(User user);
	public boolean logout();
	
	//new method
	public Customer addCustomer(Customer customer);
}
