package com.kijani.restapi.repository;

import com.kijani.restapi.model.Designer;
import com.kijani.restapi.model.ProductEcoLabel;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author roed
 */
public interface DesignerRepository extends JpaRepository<Designer, Integer> {
}
