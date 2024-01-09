package com.example.demo.services;

import com.example.demo.dtos.fakestoreproductdto;
import com.example.demo.models.Category;
import com.example.demo.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class FakeStoreImp implements  ProductService{
    private RestTemplate resttemp;



    //to conver t fakestore product dto to product


    private  Product converttoproduct(fakestoreproductdto productdto){
        Product p = new Product();

        p.setId(productdto.getId());
        p.setTitle(productdto.getTitle());
        p.setPrice(productdto.getPrice());
        p.setDescription(productdto.getDescription());

        p.setImageUrl(productdto.getImage());

        Category c = new Category();
        c.setName(productdto.getCategory());


        p.setCategory(c);


        return p ;

    }


    @Autowired
    FakeStoreImp(RestTemplate resttemo){
        this.resttemp =  resttemo;
    }



    @Override
    public Product getSinglePRoduct(Long id) {
        fakestoreproductdto  responsedto = resttemp.getForObject("https://fakestoreapi.com/products/" +id ,
                fakestoreproductdto.class
        );

        // we have to convert fakestore product dto to Product entity


        assert responsedto != null;
        return converttoproduct(responsedto);
    }
}
