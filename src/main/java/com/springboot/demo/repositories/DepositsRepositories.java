package com.springboot.demo.repositories;

import com.springboot.demo.models.Deposits;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository
public class DepositsRepositories {


    public List<Deposits> getAllDeposits(){

        Deposits deposits = new Deposits(123345,25000);
        Deposits deposits1 = new Deposits(678901,670000);

        List<Deposits> depositsList = new ArrayList<>();

        depositsList.add(deposits);
        depositsList.add(deposits1);

        return depositsList;
    }
}

