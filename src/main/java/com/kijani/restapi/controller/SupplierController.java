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

  @Autowired SupplierService supplierService;

  // NEW README FILE ENDPOINTS
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

  // TODO virker nu.
  @PostMapping("/{supplierId}/products")
  public Product createProduct(@PathVariable Integer supplierId, @RequestBody Product product) {
    return supplierService.createProduct(supplierId, product);
  }

  @PostMapping()
  public Supplier createSupplier(@RequestBody Supplier supplier) {
    System.out.println("Kommer vi her ind " + supplier.getName());
    return supplierService.createSupplier(supplier);
  }

  // TODO VIRKER NU!
  @PutMapping("/{supplierId}")
  public ResponseEntity<String> editSupplier(
      @PathVariable Integer supplierId, @RequestBody Supplier supplier) {
    supplier.setSupplierId(supplierId);
    return supplierService.editSupplier(supplier);
  }

  // TODO Cascade problem Kan ikke delete pga. produkter
  @DeleteMapping("/{supplierId}")
  public ResponseEntity<String> deleteSupplier(@PathVariable Integer supplierId) {
    return supplierService.delete(supplierId);
  }
}
