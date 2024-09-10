package com.example.bank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.*;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.example.bank.entity.Account;
import com.example.bank.service.AccountService;

@SpringBootApplication
@EnableJpaRepositories("com.example.bank.entity")  // Adjust package name if necessary
public class BankApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BankApplication.class, args);
		Account acc = context.getBean(Account.class);
		
		acc.setId(1L);
		acc.setAccountHolderName("Nikhil");
		acc.setBalance(10000.0);
		
		AccountService accservice = context.getBean(AccountService.class);
		accservice.insertData(acc);
		
		
		
	}

}
