package com.example.bank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.*;

import com.bank.entity.Account;
import com.bank.entity.AccountService;

@SpringBootApplication
@ComponentScan("com.bank.entity")
public class Bank2Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Bank2Application.class, args);
		Account acc = context.getBean(Account.class);
		acc.setId(1);
		acc.setAccountHolderName("nikhil");
		acc.setBalance(1000);
		
		AccountService accservice = context.getBean(AccountService.class);
		accservice.insertData(acc);
		
	}

}
