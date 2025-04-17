package com.example.spring_rest.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public String getHello(){
        return "Hello from Service";
    }
}
