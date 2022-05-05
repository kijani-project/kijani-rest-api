package com.kijani.restapi.service;

import com.kijani.restapi.model.Product;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ProductService {

  List<Product> findAll();

  Product findById(int id);

  Product findByName(String name);

  void create(Product product);

  ResponseEntity<Product> update(int id, Product product);

  ResponseEntity<String> delete(int id);
}