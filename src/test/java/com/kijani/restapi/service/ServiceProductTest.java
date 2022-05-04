package com.kijani.restapi.service;

import com.kijani.restapi.model.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class ServiceProductTest {

  @Autowired ProductService productService;

  @Test
  void testFindProductByName() {

    // Arrange
    Product product = new Product();
    String productName = "#Test01";
    String supplierName = "#Test02";
    product.setName(productName);
    product.setSupplier(supplierName);

    // Act
    productService.create(product);

    Product productDb = productService.findByName(productName);

    // Assert
    assertEquals(productDb.getSupplier(), supplierName);
    productService.delete(product.getProductId());
  }
}
