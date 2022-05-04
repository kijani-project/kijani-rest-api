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

    //Service layer architecture with all business logic
    //Implemented to remove all business logic from the Controller

    @Autowired ProductRepository productRepository;

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Product findById(int id) {
        Optional<Product> product = productRepository.findById(id);
        if (product.isPresent()) {
            return product.get();
        } else {
            return null;
        }
    }


    @Override
    public Product findByName(String name) {
        Optional<Product> product = productRepository.findProductByName(name);
        if (product.isPresent()) {
            return product.get();
        } else {
            return null;
        }
    }


    @Override
    public void create(Product product) {
        productRepository.save(product);
    }

    @Override
    public ResponseEntity<Product> update(int id, Product product) {
        Optional<Product> existingProduct = productRepository.findById(id);
        if (existingProduct.isPresent()){
            productRepository.save(product);
            return  new ResponseEntity<>(product, HttpStatus.OK);
        }else {
            return  new ResponseEntity<>(HttpStatus.NOT_FOUND);
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
