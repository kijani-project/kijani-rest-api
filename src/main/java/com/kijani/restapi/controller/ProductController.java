package com.kijani.restapi.controller;

import com.kijani.restapi.model.Product;
import com.kijani.restapi.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/")
public class ProductController {

    @Autowired ProductRepository productRepository;

    @GetMapping("/products")
    public List<Product>findProducts(){

        return productRepository.findAll();
    }


}
