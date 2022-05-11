package com.kijani.restapi.data;

import com.kijani.restapi.model.*;
import com.kijani.restapi.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class DataMapper implements CommandLineRunner {

  @Autowired EcolabelRepository ecolabelRepository;

  @Autowired SupplierRepository supplierRepository;

  @Autowired ProductRepository productRepository;

  @Autowired CategoryRepository categoryRepository;

  @Autowired SubCategoryRepository subCategoryRepository;

  public void run(String... args) throws Exception {

    // Test data for the database..

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

    Ecolabel ecolabel1 = new Ecolabel();
    ecolabel1.setType("Miljø A-klasse");
    ecolabel1.setProduct(product1);
    ecolabelRepository.save(ecolabel1);

    Ecolabel ecolabel2 = new Ecolabel();
    ecolabel2.setType("Miljø B-klasse");
    ecolabel2.setProduct(product1);
    ecolabelRepository.save(ecolabel2);

    Category category1 = new Category();
    category1.setCategoryName("Office");
    categoryRepository.save(category1);

    SubCategory subCategory1 = new SubCategory();
    subCategory1.setSubCategoryName("Lounge");
    subCategory1.setCategory(category1);
    subCategory1.setCategory(category1);
    subCategoryRepository.save(subCategory1);

    product1.addSubCategory(subCategory1);
    // subCategory1.addProduct(product1);

  }
}
