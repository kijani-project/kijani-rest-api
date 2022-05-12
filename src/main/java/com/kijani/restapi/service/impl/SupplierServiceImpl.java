package com.kijani.restapi.service.impl;

import com.kijani.restapi.model.Product;
import com.kijani.restapi.model.Supplier;
import com.kijani.restapi.repository.ProductRepository;
import com.kijani.restapi.repository.SupplierRepository;
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

  @Autowired
  SupplierRepository supplierRepository;
  @Autowired
  ProductRepository productRepository;

  @Override
  public Supplier getById(int id) {
    Optional<Supplier> supplier = supplierRepository.getSupplierBySupplierId(id);
    return supplier.orElse(null);
  }


  @Override
  public List<Supplier> getSuppliers() {
    List<Supplier> suppliers = supplierRepository.findAll();
    /* for (int i = 0; i < suppliers.size(); i++) {
      suppliers.get(i).getProducts().addAll(supplierRepository.getSupplierBySupplierIdAndProducts(suppliers.get(i).getSupplierId()));

    }*/
    return suppliers;
  }

  @Override
  public List<Product> getProductsBySupplierId(int supplierId) {
    List<Product> obj = productRepository.findProductBySupplierSupplierId(supplierId);
    System.out.println(obj.size());
    return productRepository.findProductBySupplierSupplierId(supplierId);
  }

  @Override
  public Product getProductByProductIdAndSupplierId(int supplierId, int productId) {
    return productRepository.findProductByProductIdAndSupplierSupplierId(productId, supplierId).orElse(null);
  }


  //TODO SKAL FLYTTES NÅR DER KOMMER ROLES PÅ.
  @Override
  public Product createProduct(int supplierId, Product product) {
    product.setSupplier(supplierRepository.getSupplierBySupplierId(supplierId).get());
    return productRepository.save(product);
  }

  @Override
  public Supplier createSupplier(Supplier supplier) {
    return supplierRepository.save(supplier);
  }

  @Override
  public ResponseEntity<Supplier> editSupplier(Supplier supplier) {
    Optional<Supplier> existingProduct = supplierRepository.findById(supplier.getSupplierId());
    //supplier.setSupplier(supplierRepository.getById(existingProduct.get().getSupplier().getSupplierId()));
    if (existingProduct.isPresent()) {
      supplierRepository.save(supplier);
      return new ResponseEntity<>(supplier, HttpStatus.OK);
    } else {
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
  }

  @Override
  public ResponseEntity<Supplier> delete(int supplierID) {
    Supplier supplier = supplierRepository.getSupplierBySupplierId(supplierID).get();
    try {
      supplierRepository.deleteById(supplierID);
      return new ResponseEntity<>(supplier, HttpStatus.OK);
    } catch (Exception err) {
      return new ResponseEntity<>(supplier, HttpStatus.NO_CONTENT);
    }
  }
}
