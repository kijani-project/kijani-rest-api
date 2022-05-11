package com.kijani.restapi.controller;

import com.kijani.restapi.model.Product;
import com.kijani.restapi.repository.ProductRepository;
import com.kijani.restapi.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/products")
public class ProductController {

  @Autowired
  ProductService productService;
  @Autowired
  ProductRepository productRepository;

  @GetMapping()
  public List<Product> findAllProducts() {
    return productService.findAll();
  }

  @GetMapping("/{productId}")
  public Product findProductById(@PathVariable int productId) {
    return productService.findById(productId);
  }

  @PostMapping("/{supplierId}")
  @ResponseStatus(HttpStatus.CREATED)
  public Product createProduct(@RequestBody Product product, @PathVariable int supplierId) {
    return productService.create(product, supplierId);
  }


  @PutMapping("/{productId}")
  public ResponseEntity<Product> updateProduct(
      @PathVariable int productId, @RequestBody Product product) {
    product.setProductId(productId);
    return productService.update(product);
  }
/*
  @PutMapping("/{productId}")
  public ResponseEntity<Product> updateProduct(@PathVariable int productId, @RequestBody Product product) {
    Optional<Product> optCounty = productRepository.findById(productId);
    if (optCounty.isPresent()) {
      productRepository.save(product);
      return new ResponseEntity<>(product,HttpStatus.OK);
    } else {
      Product notfoundProduct = new Product();
      notfoundProduct.setName("Jeg kunne ikke finde id=" + productId);
      return new ResponseEntity<>(notfoundProduct, HttpStatus.NOT_FOUND);
    }
  }*/

  @DeleteMapping("/{productId}")
  public ResponseEntity<String> deleteProduct(@PathVariable int productId) {
    return productService.delete(productId);
  }

}
