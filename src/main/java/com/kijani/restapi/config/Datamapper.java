package com.kijani.restapi.config;

import com.kijani.restapi.model.Product;
import com.kijani.restapi.model.Supplier;
import com.kijani.restapi.model.User;
import com.kijani.restapi.repository.ProductRepository;
import com.kijani.restapi.repository.SupplierRepository;
import com.kijani.restapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Datamapper implements CommandLineRunner {

  @Autowired ProductRepository productRepository;
  @Autowired SupplierRepository supplierRepository;
  @Autowired UserRepository userRepository;

  @Override
  public void run(String... args) throws Exception {

    /*
     //Test method for product class
     //These data should only be loaded first time the program run.
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

     product = new Product();
     product.setName("TestProduct");
     product.setDescription("Some text about the product...");
     product.setSupplier("Frits Hansen");
     product.setNumber("ION451551193");
     product.setCertificate("Some environment certificate");
     product.setPicture("www.picturelibrary.dk/paustian");
     product.setLink("www.brochurelibrary.dk/paustian");
     productRepository.save(product);
    */
    User user = new User();
    user.setName("test");
    userRepository.save(user);

  }
}
