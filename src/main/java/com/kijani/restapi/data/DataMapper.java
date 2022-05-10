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

      Ecolabel ecolabel = new Ecolabel();
      ecolabel.setType("Ecolabel");
      ecolabelRepository.save(ecolabel);
      Set<Ecolabel> ecolabels = new HashSet<>();
      ecolabels.add(ecolabel);

      Product product = new Product();
      product.setName("Test product");
      product.setEcolabels(ecolabels);
      productRepository.save(product);

      Set<Product> products = new HashSet<>();
      products.add(product);

      Supplier supplier = new Supplier();
      supplier.setName("TEstData supplier");
      supplier.setProducts(products);
      supplierRepository.save(supplier);

  }
}
