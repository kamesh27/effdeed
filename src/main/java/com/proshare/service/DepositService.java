package com.proshare.service;

import com.proshare.models.Deposit;
import com.proshare.repository.DepositRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Class to add business logic necessary for Deposit Controller
 * author: Kamesh K S
 * */

@Service
public class DepositService {

    @Autowired
    DepositRepository depositRepo;

    public List<Deposit> getAllDeposits(){
        List<Deposit> allDepositDetails = new ArrayList<Deposit>();
        allDepositDetails = depositRepo.findAll();
        return allDepositDetails;
    }

    public ResponseEntity<Deposit> addNewDeposit(Deposit deposit){
        return ResponseEntity.ok(depositRepo.save(deposit));
    }

    public ResponseEntity<List<Deposit>> removeDepositById(ObjectId _id){
        depositRepo.deleteById(_id.toHexString());
        return ResponseEntity.ok(depositRepo.findAll());
    }

    public void addTestData(){
        depositRepo.save(new Deposit("10000", "6", "Hyderabad", "12345", "23-01-1965","23-01-1975", "10", null));
    }
}
