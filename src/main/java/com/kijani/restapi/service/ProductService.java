package com.kijani.restapi.service;

import com.kijani.restapi.model.Product;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ProductService {

  List<Product> getProducts();

  Product findProduct(int id);

  ResponseEntity<String> updateProduct(Product product);

  ResponseEntity<String> deleteProduct(int id);

  List<Product> getProductsByCategoryId(Integer categoryId);
}
