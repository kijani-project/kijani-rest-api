package com.kijani.restapi.service.impl;

import com.kijani.restapi.model.Product;
import com.kijani.restapi.model.Supplier;

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
}
