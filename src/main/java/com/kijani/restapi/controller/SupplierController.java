package com.kijani.restapi.controller;

import com.kijani.restapi.model.Supplier;
import com.kijani.restapi.service.impl.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/suppliers")
public class SupplierController {

  @Autowired SupplierService supplierService;

  @GetMapping()
  public List<Supplier> findAllSuppliers() {
    return supplierService.getSuppliers();
  }

  @GetMapping("/{id}")
  public Supplier getSupplierById(@PathVariable int id) {
    Supplier supplier = supplierService.getById(id);
    // ArrayList<Product> products = (ArrayList<Product>) supplierService.getProducts(id);
    // supplier.setProducts( (Set<Product>) products);
    System.out.println(supplier.getProducts());
    return supplier;
  }


}
