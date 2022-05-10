package com.kijani.restapi.service.impl;

import com.kijani.restapi.model.Product;
import com.kijani.restapi.model.Supplier;
import com.kijani.restapi.repository.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;

/**
 * @author roed
 */
@Service
public class SupplierServiceImpl implements SupplierService{

  @Autowired
  SupplierRepository supplierRepository;

  @Override
  public Supplier getById(int id) {
    Optional<Supplier> supplier = supplierRepository.getSupplierBySupplierId(id);
    return supplier.orElse(null);
  }

  /*
  @Override
  public List<Product> getProducts(int id) {
   return supplierRepository.getProductsBySupplierId(id);
  }*/

  @Override
  public List<Supplier> getSuppliers() {
    List<Supplier> suppliers = supplierRepository.findAll();
   /* for (int i = 0; i < suppliers.size(); i++) {
      suppliers.get(i).getProducts().addAll(supplierRepository.getSupplierBySupplierIdAndProducts(suppliers.get(i).getSupplierId()));

    }*/
    return suppliers;
  }
}
