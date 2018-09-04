package com.springboot.demo.repositories;


import com.springboot.demo.models.Account;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AccountsRepositories {

    List<Account> list = new ArrayList<>();

    public List<Account> getAllAccounts(){

        Account account = new Account(12345,25000,"checking","personal checking account");
        Account account1 = new Account(678901,95000,"savings","personal savings account");


        list.add(account);
        list.add(account1);

        return list;


    }

    public  Account getAccountDetails(String accountNumber){

        Account account = new Account();

//     List<Integer> results =   accountList.stream()
//                .map(Account::getAccountNumber).collect(Collectors.toList());
//
//        System.out.println(results);


        for(int i= 0; i < list.size();i++){

            if(list.get(i).getAccountNumber() == Integer.parseInt(accountNumber)){
             account = list.get(i);

            }
        }

        return account;
    }
}
