package com.kijani.restapi.service.impl;

import com.kijani.restapi.model.Demo;
import com.kijani.restapi.model.Product;
import com.kijani.restapi.repository.ProductRepository;
import com.kijani.restapi.service.impl.ProductServiceImpl;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Christopher
 */
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class ProductServiceImplTest {

    @Autowired
    ProductServiceImpl productService;
    @Autowired ProductRepository productRepository;

    @BeforeEach
    void setUp() {
        Product product = new Product();
        product.setProductId(1);
        product.setName("TestJpa");
        product.setDescription("Some text about the product...");
        product.setSupplier("Ide Møbler");
        product.setNumber("ION451551133");
        product.setCertificate("Some certificate");
        product.setPicture("www.picturelibrary.dk/paustian");
        product.setLink("www.brochurelibrary.dk/paustian");
        productRepository.save(product);
    }

    @Test
    void readProducts() {
        List<Product> product = productRepository.findAll();
        Assertions.assertEquals(1, product.size());
    }

    @Test
    void readProduct() {
    }

    @Test
    void createProduct() {
    }

    @Test
    void updateProduct() {
    }

    @Test
    void deleteProduct() {
    }

    @AfterEach
    void tearDown() {
    }
}
