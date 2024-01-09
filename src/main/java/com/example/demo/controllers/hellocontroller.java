package com.example.demo.controllers;

import com.example.demo.models.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class hellocontroller {


    @GetMapping("/say/{name}")
    public String helloworld(@PathVariable("name") String name){
        Product p = new Product();
        return "Hello there"+name;
    }

}
