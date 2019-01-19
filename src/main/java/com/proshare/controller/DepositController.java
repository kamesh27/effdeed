package com.proshare.controller;

import com.proshare.models.Deposit;
import com.proshare.service.DepositService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 *  Controller class to add, modify, delete and show deposit details
 *  author: Kamesh K S
 * */

@RestController
public class DepositController {

    @Autowired
    DepositService depositService;

    /* Method to add test data to deposit collection */
    @GetMapping(path = "/77886")
    public String addTestData(){
        depositService.addTestData();
        return "data successfully added";
    }

    /* Method which returns all the personal deposits stored by a user */
    @GetMapping(path = "/getMyDeposits")
    public List<Deposit> getAllDeposits(){
        List<Deposit> allDepositDetails = depositService.getAllDeposits();
        return allDepositDetails;
    }

    /* Method which adds and stores new deposits into the database */
    @PostMapping(path = "/addDeposit")
    public ResponseEntity<Deposit> addDepositDetails(@RequestBody Deposit deposit){
        return depositService.addNewDeposit(deposit);
    }

    /* Method to remove a deposit from the database based on the _id furnished by the user */
    @DeleteMapping(path = "/removeDeposit")
    public  ResponseEntity<List<Deposit>> removeDepositById(@RequestBody ObjectId _id){
        return depositService.removeDepositById(_id);
    }

}
