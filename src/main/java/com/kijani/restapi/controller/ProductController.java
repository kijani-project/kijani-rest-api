package com.kijani.restapi.controller;

import com.kijani.restapi.model.Product;
import com.kijani.restapi.model.SubCategory;
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

  // Endpoints sat op efter new README
  @GetMapping("/{productId}")
  public Product findProduct(@PathVariable int productId) {
    return productService.findById(productId);
  }

  @GetMapping()
  public List<Product> getProducts() {
    return productService.getAllProducts();
  }

  //TODO Not working Error 415
  @PutMapping("/{productId}")
  public ResponseEntity<Product> updateProduct(@PathVariable int productId, @RequestBody Product product) {
    product.setProductId(productId);
    return productService.update(product);
  }

  //TODO gets deleted - returns wrong answer error 500
  @DeleteMapping("/{productId}")
  public ResponseEntity<Product> deleteProduct(@PathVariable int productId) {
    return productService.delete(productId);
  }

  // __________________________________________ALT HER UNDER SKAL
  // VÆK_________________________________________________

  // TODO Disse metoder skal fjernes - JUNK Metoder
  // TODO This method is redundant, because you get products when you fetch supplierBySupplierID

  @PostMapping("/{supplierId}")
  @ResponseStatus(HttpStatus.CREATED)
  public Product createProduct(@RequestBody Product product, @PathVariable int supplierId) {
    return productService.create(product, supplierId);
  }

  // TODO TEST METODE skal slettes senere
  @PutMapping("/test/{productId}/{subCategoryId}")
  public List<SubCategory> addSubCategoryToProduct(
      @PathVariable int productId, @PathVariable int subCategoryId) {
    return productService.addSubCategoryToProduct(
        productService.findById(productId), subCategoryId);
  }
}
