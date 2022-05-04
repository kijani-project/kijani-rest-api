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
    public List<Product> readProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product readProduct(int id) {
        Optional<Product> product = productRepository.findById(id);
        if (product.isPresent()) {
            return product.get();
        } else {
            return null;
        }
    }

    @Override
    public void createProduct(Product product) {

    }

    @Override
    public ResponseEntity<Product> updateProduct(int id, Product product) {
        Optional<Product> existingProduct = productRepository.findById(id);
        if (existingProduct.isPresent()){
            productRepository.save(product);
            return  new ResponseEntity<>(product, HttpStatus.OK);
        }else {
            return  new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }


    }

    @Override
    public ResponseEntity<String> deleteProduct(int id) {
        try {
            productRepository.deleteById(id);
            return new ResponseEntity<>("Deleted: " + id, HttpStatus.OK);
        } catch (Exception err) {
            return new ResponseEntity<>("Error deleting: " + id, HttpStatus.NO_CONTENT);
        }
    }
}
