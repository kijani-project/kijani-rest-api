package com.kijani.restapi.service;

import com.kijani.restapi.model.Product;
import com.kijani.restapi.repository.ProductRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ServiceProductTest {

    @Autowired ProductRepository productRepository;

    @Autowired ProductService productService;

    @Test
    void findProductByName() {

        //Arrange
        Product product = new Product();
        product.setName("Testname113");
        product.setSupplier("Something");

        //Act
        productService.create(product);
        Product product2 = productService.findByName("Testname113");

        //Assert
        assertEquals(product2.getSupplier(), "Something");
        productService.delete(product.getProductId());

    }

    @Test
    void createProduct() {
        //Arrange
        Product testProduct1 = new Product();

        //Act
        List<Product> createList = productRepository.findAll();
        productRepository.save(testProduct1);

        //Assert
        assertEquals(createList.size(), productRepository.findAll().size()-1);
        productRepository.delete(testProduct1);
    }

    @Test
    void deleteProduct() {
        //Arrange
        Product testProduct2 = new Product();
        productRepository.save(testProduct2);

        //Act
        List<Product> deleteList = productRepository.findAll();
        productRepository.delete(testProduct2);

        //Assert
        assertEquals(deleteList.size(), productRepository.findAll().size() +1);

    }

}