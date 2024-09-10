package com.example.bank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bank.entity.Account;
import com.example.bank.entity.Repo;

@Service
public class AccountService {

    @Autowired
    private Repo repo;

    public void insertData(Account account) {
        repo.save(account);
        System.out.println("Account inserted: " + account);
    }
}
