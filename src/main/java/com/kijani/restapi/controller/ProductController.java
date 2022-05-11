package com.kijani.restapi.controller;

import com.kijani.restapi.model.Product;
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

  // TODO This method is redundant, because you get products when you fetch supplierBySupplierID
  @GetMapping("/suppliers/{supplierId}")
  public List<Product> findProductsBySupplierId(@PathVariable int supplierId) {
    return productService.findProductsBySupplierId(supplierId);
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

  @DeleteMapping("/{productId}")
  public ResponseEntity<String> deleteProduct(@PathVariable int productId) {
    return productService.delete(productId);
  }
}
