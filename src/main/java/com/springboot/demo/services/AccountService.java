package com.springboot.demo.services;

import com.springboot.demo.models.Account;
import com.springboot.demo.repositories.AccountsRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {

    @Autowired
    AccountsRepositories accountsRepositories;

    public List<Account> getAllAccounts(){

        List<Account> list = accountsRepositories.getAllAccounts();

        return list;
    }

    public Account getAccountDetails(String accountNumber){

        return accountsRepositories.getAccountDetails(accountNumber);
    }
}
