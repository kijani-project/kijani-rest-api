package com.kijani.restapi.service;

import com.kijani.restapi.model.Product;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public interface ProductService {

  List<Product> findAll();

  Product findById(int id);

  Product findByName(String name);

  Product findByNameAndDescription(String name, String description);

  Product create(Product product);

  ResponseEntity<Product> update(int id, Product product);

  ResponseEntity<String> delete(int id);
}
