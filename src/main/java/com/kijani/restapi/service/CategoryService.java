package com.kijani.restapi.service;

import com.kijani.restapi.model.Category;
import com.kijani.restapi.model.SubCategory;
import org.springframework.http.ResponseEntity;

import java.util.List;

/**
 * @author roed
 */
public interface CategoryService {
  List<Category> getCategories();

  Category getCategory(int categoryId);

  Category createCategory(Category category);

  ResponseEntity<String> updateCategory(Category category);

  ResponseEntity<String> deleteCategory(int categoryId);

  SubCategory createSubCategory(SubCategory subCategory);
}
