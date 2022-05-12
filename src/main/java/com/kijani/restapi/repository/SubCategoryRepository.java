package com.kijani.restapi.repository;

import com.kijani.restapi.model.SubCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author roed
 */
public interface SubCategoryRepository extends JpaRepository<SubCategory, Integer> {
}
