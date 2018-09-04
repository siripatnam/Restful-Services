package com.springboot.demo.controllers;

import com.springboot.demo.models.Account;
import com.springboot.demo.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AccountsController {

    @Autowired
    AccountService accountService;

    @RequestMapping(value = "/")
    public String welcome() {
        return "Welcome to Spring Boot";
    }

    @RequestMapping(value = "/accounts")
    public List<Account> getAllAccounts() {

        List<Account> list = accountService.getAllAccounts();
        return list;
    }

    @RequestMapping(value = "/accountDetails")
    public Account getAccountDetails(@RequestParam String accountNumber) {

        return accountService.getAccountDetails(accountNumber);
    }
}
