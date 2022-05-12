package com.kijani.restapi.service.impl;

import com.kijani.restapi.model.Category;

import java.util.List;

/**
 * @author roed
 */
public interface CategoryService {
  List<Category> getCategories();

  Category getCategoryByCategoryId(int categoryId);

  Category createCategory(Category category);
}
