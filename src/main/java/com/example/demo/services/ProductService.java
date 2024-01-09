package com.example.demo.services;

import com.example.demo.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

public interface ProductService {

    Product getSinglePRoduct(Long id);
}
