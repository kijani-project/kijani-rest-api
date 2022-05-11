package com.kijani.restapi.service.impl;

import com.kijani.restapi.model.Category;
import com.kijani.restapi.model.Supplier;

import java.util.List;

/**
 * @author roed
 */
public interface CategoryService {
  List<Category> getCategories();
}
