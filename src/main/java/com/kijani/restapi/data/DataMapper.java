package com.kijani.restapi.data;

import com.kijani.restapi.model.Product;
import com.kijani.restapi.model.Supplier;
import com.kijani.restapi.repository.ProductRepository;
import com.kijani.restapi.repository.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataMapper implements CommandLineRunner {

  @Autowired SupplierRepository supplierRepository;

  @Autowired ProductRepository productRepository;

  public void run(String... args) throws Exception {

    Product product = new Product();
    product.setName("TEST2");
    productRepository.save(product);

    Supplier supplier = new Supplier();
    supplier.setName("TEST");
    supplier.setProduct(product);
    supplierRepository.save(supplier);
  }
}
