package com.example.demo.controllers;
import com.example.demo.models.Product;
import com.example.demo.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {


    private final ProductService prodservice;

    @Autowired
    public ProductController(ProductService prodservice) {
        this.prodservice = prodservice;
    }

    @GetMapping("")
    public List<Product> getProducts(){

        return new ArrayList<>();
    }

    @GetMapping("/{id}")
    public Product getOneProduct(@PathVariable("id") Long id)
    {
        return prodservice.getSinglePRoduct(id);
//        return new Product();
    }


    @PostMapping("")
    public Product getOneProduct(@RequestBody Product product)
    {

        return new Product();
    }


    @PatchMapping("/{id}")
    public Product updateoneProduct(@PathVariable("id") Long id, @RequestBody Product product)
    {

        return new Product();
    }


    @PutMapping("/{id}")
    public Product replaceProduct(@PathVariable("id") Long id, @RequestBody Product product)
    {

        return new Product();
    }


    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable("id") Long id)
    {


    }


}
