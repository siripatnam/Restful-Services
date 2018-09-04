package com.springboot.demo.controllers;

import com.springboot.demo.models.Deposits;
import com.springboot.demo.services.DepositsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DepositsControllers {

    @Autowired
    DepositsService depositsService;


    @RequestMapping(value = "/deposits")
    public List<Deposits> getAllDeposits(){

        return depositsService.getAllDeposits();
    }
}
