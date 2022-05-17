package com.kijani.restapi.service.impl;

import com.kijani.restapi.model.SubCategory;
import com.kijani.restapi.repository.SubCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author roed
 */
@Service
public class SubCategoryServiceImpl implements SubCategoryService {

  @Autowired SubCategoryRepository subCategoryRepository;

  @Override
  public List<SubCategory> getSubCategories() {
    return subCategoryRepository.findAll();
  }

  @Override
  public ResponseEntity<String> editSubCategory(SubCategory subCategory) {
    Optional<SubCategory> existingProduct =
        subCategoryRepository.findById(subCategory.getSubCategoryId());
    if (existingProduct.isPresent()) {
      subCategoryRepository.save(subCategory);
      return ResponseEntity.ok()
          .body("Category with Id: " + subCategory.getSubCategoryId() + " Was edited");
    } else {
      return new ResponseEntity<>("Error in Editing", HttpStatus.NOT_FOUND);
    }
  }

  @Override
  public ResponseEntity<String> deleteSubCategory(int subCategoryID) {
    try {
      subCategoryRepository.deleteById(subCategoryID);
      return new ResponseEntity<>("was deleted", HttpStatus.OK);
    } catch (Exception err) {
      return new ResponseEntity<>("Error deleting", HttpStatus.NO_CONTENT);
    }
  }
}
