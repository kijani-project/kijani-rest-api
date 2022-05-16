package com.kijani.restapi.repository;

import com.kijani.restapi.model.ProductEcoLabel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EcolabelRepository extends JpaRepository<ProductEcoLabel, Integer> {}
