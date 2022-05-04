package com.kijani.restapi.service;

import com.kijani.restapi.model.Product;
import com.kijani.restapi.repository.ProductRepository;
import com.kijani.restapi.service.ProductService;
import com.kijani.restapi.service.impl.ProductServiceImpl;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class ServiceProductTest {

    @Autowired ProductRepository productRepository;

    @Test
    void createProduct() {
        //Arrange
        Product testProduct1 = new Product();

        //Act
        List createList = productRepository.findAll();
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
        List deleteList = productRepository.findAll();
        productRepository.delete(testProduct2);

        //Assert
        assertEquals(deleteList.size(), productRepository.findAll().size() +1);

    }

}