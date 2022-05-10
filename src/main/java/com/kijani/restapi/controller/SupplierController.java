package com.kijani.restapi.controller;

import com.kijani.restapi.model.Supplier;
import com.kijani.restapi.repository.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/suppliers")
public class SupplierController {

  @Autowired
  SupplierRepository supplierRepository;

  @GetMapping()
  public List<Supplier> findAllSuppliers() {
    return supplierRepository.findAll();
  }



}
