package com.kijani.restapi.service;

import com.kijani.restapi.model.Product;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface ProductService {

    List<Product> readProducts();

    Product readProduct(int id);

    void createProduct(Product product);

    ResponseEntity<Product> updateProduct(int id, Product product);

    ResponseEntity<String> deleteProduct(int id);


}
