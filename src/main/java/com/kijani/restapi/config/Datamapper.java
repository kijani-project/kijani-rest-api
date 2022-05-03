package com.kijani.restapi.config;

import com.kijani.restapi.model.Product;
import com.kijani.restapi.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Datamapper implements CommandLineRunner {

    @Autowired ProductRepository productRepository;

    @Override
    public void run(String... args) throws Exception {

        //Test method for product class
        //This test is running on local database: "kijani"
        Product product = new Product();
        product.setName("TestProduct");
        product.setDescription("Some text about the product...");
        product.setSupplier("Ide Møbler");
        product.setNumber("ION451551133");
        product.setCertificate("Some certificate");
        product.setPicture("www.picturelibrary.dk/paustian");
        product.setLink("www.brochurelibrary.dk/paustian");
        productRepository.save(product);


    }
}
