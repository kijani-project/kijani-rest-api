package com.kijani.restapi.service.impl;

import com.kijani.restapi.model.Product;
import com.kijani.restapi.model.Supplier;
import com.kijani.restapi.repository.ProductRepository;
import com.kijani.restapi.repository.SupplierRepository;
import com.kijani.restapi.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author roed
 */
@Service
public class SupplierServiceImpl implements SupplierService {

  @Autowired SupplierRepository supplierRepository;
  @Autowired ProductRepository productRepository;

  @Override
  public Supplier getSupplier(int supplierId) {
    Optional<Supplier> supplier = supplierRepository.getSupplierBySupplierId(supplierId);
    return supplier.orElse(null);
  }

  @Override
  public List<Supplier> getSuppliers() {
    return supplierRepository.findAll();
  }

  @Override
  public List<Product> getProducts(int supplierId) {
    return productRepository.findProductBySupplierSupplierId(supplierId);
  }

  @Override
  public Product getProductBySupplierId(int supplierId, int productId) {
    return productRepository
        .findProductByProductIdAndSupplierSupplierId(productId, supplierId)
        .orElse(null);
  }

  @Override
  public Product createProduct(Product product) {
    return productRepository.save(product);
  }

  @Override
  public Supplier createSupplier(Supplier supplier) {
    return supplierRepository.save(supplier);
  }

  @Override
  public ResponseEntity<String> updateSupplier(Supplier supplier) {
    Optional<Supplier> existingProduct = supplierRepository.findById(supplier.getSupplierId());
    if (existingProduct.isPresent()) {
      supplierRepository.save(supplier);
      return new ResponseEntity<>("Success", HttpStatus.OK);
    } else {
      return new ResponseEntity<>("FAIL!", HttpStatus.NOT_FOUND);
    }
  }

  @Override
  public ResponseEntity<String> deleteSupplier(int supplierId) {
    try {
      supplierRepository.deleteById(supplierId);
      return new ResponseEntity<>("was deleted", HttpStatus.OK);
    } catch (Exception err) {
      return new ResponseEntity<>("Error deleting", HttpStatus.NO_CONTENT);
    }
  }
}
