package com.proshare.models;

import org.springframework.data.annotation.Id;

public class ApplicationModel {

    @Id
    public String id;

    public String random;

    public ApplicationModel() {}

    public ApplicationModel(String random){
        this.random = random;
    }
}
