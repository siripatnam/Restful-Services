package com.springboot.demo.services;

import com.springboot.demo.models.Deposits;
import com.springboot.demo.repositories.DepositsRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepositsService {

    @Autowired
    DepositsRepositories depositsRepositories;

    public List<Deposits> getAllDeposits(){

        return depositsRepositories.getAllDeposits();
    }
}
