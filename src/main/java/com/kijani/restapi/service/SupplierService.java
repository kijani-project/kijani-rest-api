package com.kijani.restapi.service;

import com.kijani.restapi.model.Product;
import com.kijani.restapi.model.Supplier;
import org.springframework.http.ResponseEntity;

import java.util.List;

/**
 * @author roed
 */
public interface SupplierService {

  Supplier getSupplier(int id);

  List<Supplier> getSuppliers();

  List<Product> getProducts(int supplierId);

  Product getProductBySupplierId(int supplierId, int productId);

  Product createProduct(Product product);

  Supplier createSupplier(Supplier supplier);

  ResponseEntity<String> updateSupplier(Supplier supplier);

  ResponseEntity<String> deleteSupplier(int supplierID);
}
