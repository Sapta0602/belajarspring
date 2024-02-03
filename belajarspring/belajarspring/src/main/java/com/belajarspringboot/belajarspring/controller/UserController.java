package com.belajarspringboot.belajarspring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RestController;

import com.belajarspringboot.belajarspring.model.RegisterUserRequest;
import com.belajarspringboot.belajarspring.model.WebResponse;
import com.belajarspringboot.belajarspring.service.UserServices;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class UserController {

    @Autowired
    private UserServices userServices;

    @PostMapping(path = "/api/users", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public WebResponse<String> register(@RequestBody RegisterUserRequest request) {
        userServices.register(request);
        return WebResponse.<String>builder().data("OK").build();
    }
    
    
}
