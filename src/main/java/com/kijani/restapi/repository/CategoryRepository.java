package com.kijani.restapi.repository;

import com.kijani.restapi.model.Category;
import com.kijani.restapi.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author roed
 */
public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
