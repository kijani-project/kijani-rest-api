package com.kijani.restapi.service;

import com.kijani.restapi.model.Product;
import com.kijani.restapi.model.SubCategory;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ProductService {

  List<Product> getAllProducts();

  Product findById(int id);

  Product findByName(String name);

  Product findByNameAndDescription(String name, String description);

  Product create(Product product, int supplierId);

  ResponseEntity<String> update(Product product);

  ResponseEntity<String> delete(int id);

  List<SubCategory> addSubCategoryToProduct(Product product, int subCategoryId);

  List<Product> getProductsByCategoryId(int categoryId);
}
