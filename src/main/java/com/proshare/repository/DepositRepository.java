package com.proshare.repository;

import com.proshare.models.Deposit;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 *  Class which acts as a link to the db and the deposit java objects
 *  author: Kamesh K S
 *
 *  */

@Repository
public interface DepositRepository extends MongoRepository<Deposit, String> {

}
