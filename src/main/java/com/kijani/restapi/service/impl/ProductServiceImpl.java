package com.kijani.restapi.service.impl;

import com.kijani.restapi.model.Product;
import com.kijani.restapi.repository.*;
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
  @Autowired SupplierRepository supplierRepository;

  @Autowired SubCategoryRepository subCategoryRepository;

  @Autowired CategoryRepository categoryRepository;

  @Autowired ProductEcoLabelRepository productEcoLabelRepository;

  @Override
  public List<Product> getProducts() {
    return productRepository.findAll();
  }

  @Override
  public Product findProduct(int id) {
    Optional<Product> product = productRepository.findById(id);
    return product.orElse(null);
  }

  // TODO Response skal ændres.
  @Override
  public ResponseEntity<String> updateProduct(Product product) {
    // TODO Skal valideres på om supplier_id = null.
    Optional<Product> existingProduct = productRepository.findById(product.getProductId());
    if (existingProduct.isPresent()) {
      product.setSupplier(
          supplierRepository.getById(existingProduct.get().getSupplier().getSupplierId()));
      productRepository.save(product);
      // return new ResponseEntity<>("all ok", HttpStatus.OK);
      return ResponseEntity.ok()
          .body("Product with productId: " + product.getProductId() + " Was edited");
    } else {
      return new ResponseEntity<>("Error in Editing", HttpStatus.NOT_FOUND);
    }
  }

  // TODO Response skal ændres.
  @Override
  public ResponseEntity<String> deleteProduct(int productId) {
    try {
      productRepository.deleteById(productId);
      return new ResponseEntity<>("was deleted", HttpStatus.OK);
    } catch (Exception err) {
      return new ResponseEntity<>("Error deleting", HttpStatus.NO_CONTENT);
    }
  }

  @Override
  public List<Product> getProductsByCategoryId(Integer categoryId) {
    return productRepository.findProductsByCategoryId(categoryId);
  }

  @Override
  public List<Product> getProductsByDesigner(Integer designerId) {
    return productRepository.findProductsByDesigners(designerId);
  }

  @Override
  public List<Product> getProductsByEcoLabelId(Integer ecoLabelId) {
    return productRepository.findProductsByProductEcoLabelsId(ecoLabelId);
  }
}
