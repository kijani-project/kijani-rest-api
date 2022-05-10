package com.kijani.restapi.service.impl;

import com.kijani.restapi.model.Product;
import com.kijani.restapi.repository.ProductRepository;
import com.kijani.restapi.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

  @Autowired ProductRepository productRepository;

  @Override
  public List<Product> findAll() {
    return productRepository.findAll();
  }

  @Override
  public Product findById(int id) {
    Optional<Product> product = productRepository.findById(id);
    return product.orElse(null);
  }

  @Override
  public Product findByName(String name) {
    Optional<Product> product = productRepository.findProductByName(name);
    return product.orElse(null);
  }

  public Product findByNameAndDescription(String name, String description) {
    Optional<Product> product =
        productRepository.findProductByNameAndAndDescription(name, description);
    return product.orElse(null);
  }

  @Override
  public Product create(Product product) {
    productRepository.save(product);
    // Optional<Product> product1 = productRepository.findProductByName(product.getName());
    Optional<Product> product1 =
        productRepository.findProductByNameAndAndDescription(
            product.getName(), product.getDescription());
    return product1.orElse(null);
    // return product1.orElse(null);
  }

  @Override
  public ResponseEntity<Product> update(int id, Product product) {
    Optional<Product> existingProduct = productRepository.findById(id);
    if (existingProduct.isPresent()) {
      productRepository.save(product);
      return new ResponseEntity<>(product, HttpStatus.OK);
    } else {
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
  }

  @Override
  public ResponseEntity<String> delete(int id) {
    try {
      productRepository.deleteById(id);
      return new ResponseEntity<>("Deleted: " + id, HttpStatus.OK);
    } catch (Exception err) {
      return new ResponseEntity<>("Error deleting: " + id, HttpStatus.NO_CONTENT);
    }
  }
}
