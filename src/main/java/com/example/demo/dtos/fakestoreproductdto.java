package com.example.demo.dtos;

import com.example.demo.models.Category;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class fakestoreproductdto {

    //Exactly howe the fakstore api is sending data

   private  Long id ;
    private String title;
  private  Double price;
    private String category;
    private String description;
    private String image  ;
}
