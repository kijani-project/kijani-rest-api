package com.kijani.restapi.service.impl;

import com.kijani.restapi.model.Product;
import com.kijani.restapi.model.SubCategory;
import com.kijani.restapi.repository.ProductRepository;
import com.kijani.restapi.repository.SubCategoryRepository;
import com.kijani.restapi.repository.SupplierRepository;
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

  @Override
  public List<Product> getAllProducts() {
    return productRepository.findAll();
  }


  @Override
  public Product findById(int id) {
    Optional<Product> product = productRepository.findById(id);
    return product.orElse(null);
  }

  @Override
  public Product findByName(String name) {
    Optional<Product> product = productRepository.findProductByName(name);
    return product.orElse(null);
  }

  public Product findByNameAndDescription(String name, String description) {
    Optional<Product> product =
        productRepository.findProductByNameAndAndDescription(name, description);
    return product.orElse(null);
  }

  @Override
  public Product create(Product product, int supplierId) {
    // Set supplier to product
    product.setSupplier(supplierRepository.getById(supplierId));

    // If Statement if null????
    // return Product from DB when created
    return productRepository.save(product);
  }

  @Override
  public ResponseEntity<Product> update(Product product) {
    // TODO Skal valideres på om supplier_id = null.
    Optional<Product> existingProduct = productRepository.findById(product.getProductId());
    if (existingProduct.isPresent()) {
      product.setSupplier(supplierRepository.getById(existingProduct.get().getSupplier().getSupplierId()));
      productRepository.save(product);
      return new ResponseEntity<>(product, HttpStatus.OK);
    } else {
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
  }

  @Override
  public ResponseEntity<Product> delete(int productId) {
    Product product = productRepository.findById(productId).get();
    try {
      productRepository.deleteById(productId);
      return new ResponseEntity<>(product, HttpStatus.OK);
    } catch (Exception err) {
      return new ResponseEntity<>(product, HttpStatus.NO_CONTENT);
    }
  }

  // TODO TEST METODE
  @Override
  public List<SubCategory> addSubCategoryToProduct(Product product, int subCategoryId) {
    System.out.println("Im adding");
    product.addSubCategory(subCategoryRepository.findById(subCategoryId).get());
    System.out.println("I added " + product.getSubCategories().get(0).getSubCategoryName());
    return product.getSubCategories();
  }
}
