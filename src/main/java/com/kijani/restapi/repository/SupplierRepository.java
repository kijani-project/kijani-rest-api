package com.kijani.restapi.repository;

import com.kijani.restapi.model.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * @author roed
 */
public interface SupplierRepository extends JpaRepository<Supplier, Integer> {

  Optional<Supplier> getSupplierBySupplierId(int id);


}
