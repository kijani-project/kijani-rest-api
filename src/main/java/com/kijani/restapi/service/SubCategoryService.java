package com.kijani.restapi.service;

import com.kijani.restapi.model.SubCategory;
import org.springframework.http.ResponseEntity;

import java.util.List;

/**
 * @author roed
 */
public interface SubCategoryService {

  List<SubCategory> getSubCategories();

  ResponseEntity<String> updateSubCategory(SubCategory subCategory);

  ResponseEntity<String> deleteSubCategory(int subCategoryId);
}
