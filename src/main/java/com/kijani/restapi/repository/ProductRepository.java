package com.kijani.restapi.repository;

import com.kijani.restapi.model.Product;
import com.kijani.restapi.model.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Integer> {

  Optional<Product> findProductByName(String name);

  Optional<Product> findProductByNameAndAndDescription(String name, String description);

  Optional<Product> findProductByProductIdAndSupplierSupplierId(int productId, int supplierId);

  List<Product> findProductBySupplierSupplierId(int supplierId);
}
