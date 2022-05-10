package com.kijani.restapi.data;

import com.kijani.restapi.model.Ecolabel;
import com.kijani.restapi.model.Product;
import com.kijani.restapi.model.Supplier;
import com.kijani.restapi.repository.EcolabelRepository;
import com.kijani.restapi.repository.ProductRepository;
import com.kijani.restapi.repository.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

@Component
public class DataMapper implements CommandLineRunner {

  @Autowired EcolabelRepository ecolabelRepository;

  @Autowired SupplierRepository supplierRepository;

  @Autowired ProductRepository productRepository;

  public void run(String... args) throws Exception {

      //Test data for the database..

      Supplier supplier = new Supplier();
      supplier.setName("Test supplier 1");
      supplierRepository.save(supplier);

      Product product1 = new Product();
      product1.setName("Test product 1");
      product1.setDescription("Dette er en sofa");
      product1.setSupplier(supplier);
      productRepository.save(product1);

      Product product2 = new Product();
      product2.setName("Test product 2");
      product2.setDescription("Dette er en Stol");
      product2.setSupplier(supplier);
      productRepository.save(product2);


      /*
      Label label1 = new Label();
      label1.setName("Label 1 test");
      label1.setType("Miljø A-klasse");
      label1.setProduzt(produzt1);
      labelRepository.save(label1);

      Label label2 = new Label();
      label2.setName("Label 2 test");
      label2.setType("Miljø B-klasse");
      label2.setProduzt(produzt1);
      labelRepository.save(label2);

      Label label3 = new Label();
      label3.setName("Label 3 test");
      label3.setType("Miljø C-klasse");
      label3.setProduzt(produzt2);
      labelRepository.save(label3);

       */

  }
}
