package com.kijani.restapi.controller;

import com.kijani.restapi.model.Product;
import com.kijani.restapi.model.Supplier;
import com.kijani.restapi.service.impl.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/suppliers")
public class SupplierController {

  @Autowired
  SupplierService supplierService;

  //NEW README FILE ENDPOINTS
  @GetMapping()
  public List<Supplier> getSuppliers() {
    return supplierService.getSuppliers();
  }

  @GetMapping("/{id}/profile")
  public Supplier findSupplier(@PathVariable int id) {
    return supplierService.getById(id);
  }

  @GetMapping("/{supplierId}/products")
  public List<Product> getProducts(@PathVariable int supplierId) {
    return supplierService.getProductsBySupplierId(supplierId);
  }

  @GetMapping("/{supplierId}/products/{productId}")
  public Product findProduct(@PathVariable int supplierId, @PathVariable int productId) {
    return supplierService.getProductByProductIdAndSupplierId(supplierId, productId);
  }

  //TODO virker ikke fejl 415 HUSK AT BRUGE Supplier id
  @PostMapping("/{supplierId}/products")
  public Product createProduct(@PathVariable int supplierId, @RequestBody Product product) {
    return supplierService.createProduct(supplierId, product);
  }

  @PostMapping()
  public Supplier createSupplier(@RequestBody Supplier supplier) {
    return supplierService.createSupplier(supplier);
  }

  //TODO Giver fejl 500
  @PutMapping("/{supplierId}")
  public ResponseEntity<Supplier> editSupplier(@RequestBody Supplier supplier) {
    return supplierService.editSupplier(supplier);
  }

  //TODO FEJL 500 bliver ikke slettet.
  @DeleteMapping("/{productId}")
  public ResponseEntity<Supplier> deleteSupplier(@PathVariable int supplierID) {
    return supplierService.delete(supplierID);
  }
}



