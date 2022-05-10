package com.kijani.restapi.controller;

import com.kijani.restapi.model.Product;
import com.kijani.restapi.repository.ProductRepository;
import com.kijani.restapi.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/products")
public class ProductController {

  @Autowired ProductService productService;

  @Autowired ProductRepository productRepository;

  @GetMapping()
  public List<Product> findAllProducts() {
    return productService.findAll();
  }

  @GetMapping("/{id}")
  public Product findProductById(@PathVariable int id) {
    return productService.findById(id);
  }

  @PostMapping()
  @ResponseStatus(HttpStatus.CREATED)
  public void createProduct(@RequestBody Product product) {
    productService.create(product);
  }

  @PutMapping("/{id}")
  public ResponseEntity<Product> updateProduct(
      @PathVariable Integer id, @RequestBody Product product) {
    return productService.update(id, product);
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<String> deleteProduct(@PathVariable int id) {
    return productService.delete(id);
  }
}
