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
     //These data should only be loaded first time the program run.
     //This test is running on local database: "kijani"

    /* Product product = new Product();
     product.setName("Tradition SK1 In Between Chair");
     product.setDescription("Chair smoked oiled oak wood");
     product.setSupplier("Målbar");
     product.setNumber("SK1");
     product.setCertificate("EU Eco Label");
     product.setPicture("https://picturelibrary.dk/paustian");
     product.setLink("https://brochurelibrary.dk/paustian");
     productRepository.save(product);

     product = new Product();
     product.setName("Tradition SK1 In Between Chair");
     product.setDescription("Tradition wood");
     product.setSupplier("Målbar");
     product.setNumber("SK1");
     product.setCertificate("EU Eco Label");
     product.setPicture("https://picturelibrary.dk/paustian");
     product.setLink("https://brochurelibrary.dk/paustian");
     productRepository.save(product);

     product = new Product();
     product.setName("Tradition SK1 In Between Chair");
     product.setDescription("Chair Black Lacquered ");
     product.setSupplier("Målbar");
     product.setNumber("SK1");
     product.setCertificate("EU Eco Label");
     product.setPicture("https://picturelibrary.dk/paustian");
     product.setLink("https://brochurelibrary.dk/paustian");
     productRepository.save(product);

     product = new Product();
     product.setName("Tradition SK7 In Between Chair");
     product.setDescription("Tradition wood");
     product.setSupplier("Målbar");
     product.setNumber("SK7");
     product.setCertificate("EU Eco Label");
     product.setPicture("https://picturelibrary.dk/paustian");
     product.setLink("https://brochurelibrary.dk/paustian");
     productRepository.save(product);

*/


  }
}
