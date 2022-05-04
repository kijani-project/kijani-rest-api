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
@RequestMapping("/api/products")
public class ProductController {

    @Autowired ProductService productService;

    @Autowired ProductRepository productRepository;

    @GetMapping("")
    public List<Product>findProducts(){
        return productService.readProducts();
    }

    @GetMapping("/{id}")
    public Product findProductById(@PathVariable int id) {
        return productService.readProduct(id);
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public void postProduct(@RequestBody Product product) {
        productRepository.save(product);
    }


    @PutMapping("/{id}")
    public ResponseEntity<Product> updateProduct(
            @PathVariable Integer id, @RequestBody Product product) {
        return productService.updateProduct(id, product);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteProduct(@PathVariable Integer id) {
       return productService.deleteProduct(id);
    }

}
