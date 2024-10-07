package com.group1.shoppingmall.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.group1.shoppingmall.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>{
//	public Customer addCustomer(Customer customer);
//	public Customer updateCustomer(Customer customer);
//	public Customer searchCustomer(long id);
//	public Customer deleteCustomer(long id);


}
