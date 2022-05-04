package com.kijani.restapi.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    @Test
    void productCreateObject() {
        //arrange
        Product productTest = new Product();
        //act
        //assert
        assertNotNull(productTest);
    }

    @Test
    void setProductId() {
        Product productTest = new Product();

        //arrange
        productTest.setProductId(1);
        //Assert
        assertEquals(productTest.getProductId(),1);
    }

    @Test
    void setProductSupplier() {
        //arrange
        Product productTest = new Product();
        productTest.setSupplier("Frits Hansen");
        //act
        //assert
        assertEquals(productTest.getSupplier(),"Frits Hansen");
    }

    @Test
    void getProductId() {
        Product productTest = new Product();

        //arrange
        productTest.setProductId(1234);
        //Assert
        assertEquals(productTest.getProductId(),1234);
    }

}
