package com.bank.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AccountService {

    @Autowired
    private Repo repo;

    public void insertData(Account account) {
        repo.save(account);
        System.out.println("Account inserted: " + account);
    }
}
