package com.kijani.restapi.controller;

import com.kijani.restapi.model.Product;
import com.kijani.restapi.model.Supplier;
import com.kijani.restapi.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/suppliers")
public class SupplierController {

  @Autowired SupplierService supplierService;

  @GetMapping()
  public List<Supplier> getSuppliers() {
    return supplierService.getSuppliers();
  }

  @GetMapping("/{id}/profile")
  public Supplier findSupplier(@PathVariable Integer id) {
    return supplierService.getSupplier(id);
  }

  @GetMapping("/{supplierId}/products")
  public List<Product> getProducts(@PathVariable Integer supplierId) {
    return supplierService.getProducts(supplierId);
  }

  @GetMapping("/{supplierId}/products/{productId}")
  public Product findProduct(@PathVariable Integer supplierId, @PathVariable Integer productId) {
    return supplierService.getProductBySupplierId(supplierId, productId);
  }

  @PostMapping("/{supplierId}/products")
  public Product createProduct(@PathVariable Integer supplierId, @RequestBody Product product) {
    product.setSupplier(supplierService.getSupplier(supplierId));
    return supplierService.createProduct(product);
  }

  @PostMapping()
  public Supplier createSupplier(@RequestBody Supplier supplier) {
    return supplierService.createSupplier(supplier);
  }

  @PutMapping("/{supplierId}")
  public ResponseEntity<String> updateSupplier(
      @PathVariable Integer supplierId, @RequestBody Supplier supplier) {
    supplier.setSupplierId(supplierId);
    return supplierService.updateSupplier(supplier);
  }

  @DeleteMapping("/{supplierId}")
  public ResponseEntity<String> deleteSupplier(@PathVariable Integer supplierId) {
    return supplierService.deleteSupplier(supplierId);
  }
}
