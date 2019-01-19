package com.proshare.controller;

import com.proshare.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationController {

    @Autowired
    ApplicationService application;

    @GetMapping(path = "/hello")
    public String getHello(){
        return application.getHelloAgain();
    }

    @GetMapping(path="/addKameshToDocs")
    public String haha(){
        return application.addKameshToDocs().toString();
    }

}
