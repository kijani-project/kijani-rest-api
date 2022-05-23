package com.kijani.restapi.controller;

import com.kijani.restapi.model.Product;
import com.kijani.restapi.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/products")
public class ProductController {
  @Autowired ProductService productService;

  @GetMapping("/{productId}")
  public Product findProduct(@PathVariable int productId) {
    return productService.findProduct(productId);
  }

  @GetMapping()
  public List<Product> getProducts(
      @RequestParam(required = false) Integer categoryId,
      @RequestParam(required = false) Integer designerId,
      @RequestParam(required = false) Integer productEcoLabelId) {
    if (null != categoryId) {
      return productService.getProductsByCategoryId(categoryId);
    } else if (null != designerId) {
      return productService.getProductsByDesigner(designerId);
    } else if (null != productEcoLabelId) {
      return productService.getProductsByEcoLabelId(productEcoLabelId);
    }
    return productService.getProducts();
  }

  @PutMapping("/{productId}")
  public ResponseEntity<String> updateProduct(
      @PathVariable Integer productId, @RequestBody Product product) {
    product.setProductId(productId);
    return productService.updateProduct(product);
  }

  @DeleteMapping("/{productId}")
  public ResponseEntity<String> deleteProduct(@PathVariable Integer productId) {
    return productService.deleteProduct(productId);
  }
}
