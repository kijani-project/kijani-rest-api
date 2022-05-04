package com.kijani.restapi.controller;

import com.kijani.restapi.model.Product;
import com.kijani.restapi.repository.ProductRepository;
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

    @Autowired ProductRepository productRepository;

    @GetMapping()
    public List<Product>findProducts(){
        return productRepository.findAll();
    }

    @GetMapping("/{id}")
    public Product findProductById(@PathVariable int id) {
        Optional<Product> product = productRepository.findById(id);
        if (product.isPresent()) {
            return product.get();
        } else {
            return null;
        }
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public void postProduct(@RequestBody Product product) {
        productRepository.save(product);
    }


    @PutMapping("/{id}")
    public ResponseEntity<Product> updateProduct(
            @PathVariable Integer id, @RequestBody Product product) {
        Optional<Product> existingProduct = productRepository.findById(id);
        if (existingProduct.isPresent()){
            productRepository.save(product);
            return  new ResponseEntity<>(product, HttpStatus.OK);
        }else {
            return  new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteProduct(@PathVariable Integer id) {
        try {
            productRepository.deleteById(id);
            return new ResponseEntity<>("Deleted: " + id, HttpStatus.OK);
        } catch (Exception err) {
            return new ResponseEntity<>("Error deleting: " + id, HttpStatus.NO_CONTENT);
        }
    }

}
