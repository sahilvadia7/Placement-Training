package com.bank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.*;

@SpringBootApplication
public class BankingAppApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BankingAppApplication.class, args);
		System.out.println("run");
	}

}
