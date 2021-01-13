package com.example.spring.SpringSecrity;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RetControl {


    @GetMapping("/")
    public String getUser(){

        return "Sagar";

    }

}
