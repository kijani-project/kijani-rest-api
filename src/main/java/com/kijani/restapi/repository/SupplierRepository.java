package com.kijani.restapi.repository;

import com.kijani.restapi.model.Product;
import com.kijani.restapi.model.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

/**
 * @author roed
 */
public interface SupplierRepository extends JpaRepository<Supplier, Integer> {

  Optional<Supplier> getSupplierBySupplierId(int id);
}
