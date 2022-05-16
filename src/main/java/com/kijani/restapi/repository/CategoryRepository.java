package com.kijani.restapi.repository;

import com.kijani.restapi.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 * @author roed
 */
public interface CategoryRepository extends JpaRepository<Category, Integer> {}
