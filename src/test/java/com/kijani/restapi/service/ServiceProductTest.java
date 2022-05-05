package com.kijani.restapi.service;

import com.kijani.restapi.model.Product;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ServiceProductTest {

  @Autowired ProductService productService;

  @Test
  void testFindProductByName() {

    // Arrange
    Product product = new Product();
    String productName = "Test#01";
    String productDesc = "Test#02";
    product.setName(productName);
    product.setDescription(productDesc);

    // Act
    productService.create(product);

    Product productDb = productService.findByName(productName);

    // Assert
    Assertions.assertEquals(productDb.getDescription(), productDesc);
    productService.delete(product.getProductId());
  }
}
