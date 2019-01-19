package com.proshare.service;

import com.proshare.models.Customer;
import com.proshare.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ApplicationService {

    @Autowired
    CustomerRepository repo;


    public String getHelloAgain(){
        return "hello again!";
    }

    public List<Customer> addKameshToDocs(){
        repo.save(new Customer("firstName","Kamesh"));
        return repo.findByLastName("Kamesh");
    }
}
