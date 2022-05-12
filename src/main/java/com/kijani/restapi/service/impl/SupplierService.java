package com.kijani.restapi.service.impl;

import com.kijani.restapi.model.Product;
import com.kijani.restapi.model.Supplier;
import org.springframework.http.ResponseEntity;

import java.util.List;

/**
 * @author roed
 */
public interface SupplierService {

  Supplier getById(int id);
  /*
    List<Product> getProducts(int id);
  */
  List<Supplier> getSuppliers();

  List<Product> getProductsBySupplierId(int supplierId);

  Product getProductByProductIdAndSupplierId(int supplierId, int productId);

  Product createProduct(int supplierId, Product product);

  Supplier createSupplier(Supplier supplier);

  ResponseEntity<Supplier> editSupplier(Supplier supplier);

  ResponseEntity<Supplier> delete(int supplierID);
}
