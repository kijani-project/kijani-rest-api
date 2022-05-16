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

    Category category = new Category();
    SubCategory subCategory = new SubCategory();
    category.setCategoryName("DataMapper Test");
    subCategory.setSubCategoryName("subCat Datamapper test");
    categoryRepository.save(category);
    subCategoryRepository.save(subCategory);

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
    Measurement measurement = new Measurement();
    measurement.setHeight(74);
    measurement.setLength(200);
    measurement.setWidth(90);
    product2.setMeasurement(measurement);
    productRepository.save(product2);

    ProductEcoLabel productEcoLabel1 = new ProductEcoLabel();
    productEcoLabel1.setType("Miljø A-klasse");
    //productEcoLabel1.setProduct(product1);
    ecolabelRepository.save(productEcoLabel1);

    ProductEcoLabel productEcoLabel2 = new ProductEcoLabel();
    productEcoLabel2.setType("Miljø B-klasse");
    //productEcoLabel2.setProduct(product1);
    ecolabelRepository.save(productEcoLabel2);

    Category category1 = new Category();
    category1.setCategoryName("Office");
    categoryRepository.save(category1);

    SubCategory subCategory1 = new SubCategory();
    subCategory1.setSubCategoryName("Lounge");
    subCategory1.setCategory(category1);
    subCategoryRepository.save(subCategory1);

    product1.addSubCategory(subCategory1);
    productRepository.save(product1);

    // subCategory1.addProduct(product1);

  }
}
