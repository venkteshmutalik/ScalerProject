package com.example.demo.configurations;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;


@Configuration
public class AppConfigurations {


    @Bean
    public RestTemplate getRest(){
        return new RestTemplateBuilder().build();
    }
}
