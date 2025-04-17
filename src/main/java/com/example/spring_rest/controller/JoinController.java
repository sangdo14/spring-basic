package com.example.spring_rest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JoinController {

    @GetMapping("/join")
    public String redirectToStatic(){
        return "redirect:/join.html";
    }

}