package com.kijani.restapi.service.impl;

import com.kijani.restapi.model.SubCategory;
import org.springframework.http.ResponseEntity;

import java.util.List;

/**
 * @author roed
 */
public interface SubCategoryService {

  List<SubCategory> getSubCategories();

  SubCategory createSubCategory(SubCategory subCategory);

  ResponseEntity<String> editSubCategory(SubCategory subCategory);

  ResponseEntity<String> deleteSubCategory(int subCategoryID);
}
