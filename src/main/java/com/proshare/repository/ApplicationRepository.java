package com.proshare.repository;

import com.proshare.models.ApplicationModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ApplicationRepository extends MongoRepository<ApplicationModel, String> {

}
