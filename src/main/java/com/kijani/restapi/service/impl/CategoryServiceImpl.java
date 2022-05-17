package com.kijani.restapi.service.impl;

import com.kijani.restapi.model.Category;
import com.kijani.restapi.model.SubCategory;
import com.kijani.restapi.repository.CategoryRepository;
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
public class CategoryServiceImpl implements CategoryService {

  @Autowired CategoryRepository categoryRepository;
  @Autowired SubCategoryRepository subCategoryRepository;

  @Override
  public List<Category> getCategories() {
    return categoryRepository.findAll();
  }

  @Override
  public Category getCategoryByCategoryId(int categoryId) {
    return categoryRepository.findById(categoryId).orElse(null);
  }

  @Override
  public Category createCategory(Category category) {
    return categoryRepository.save(category);
  }

  // TODO Skal ændres og valideres
  @Override
  public ResponseEntity<String> update(Category category) {
    Optional<Category> existingProduct = categoryRepository.findById(category.getCategoryId());
    if (existingProduct.isPresent()) {
      categoryRepository.save(category);
      return ResponseEntity.ok()
          .body("Category with Id: " + category.getCategoryId() + " Was edited");
    } else {
      return new ResponseEntity<>("Error in Editing", HttpStatus.NOT_FOUND);
    }
  }

  @Override
  public ResponseEntity<String> deleteCategory(int categoryId) {
    try {
      categoryRepository.deleteById(categoryId);
      return new ResponseEntity<>("was deleted", HttpStatus.OK);
    } catch (Exception err) {
      return new ResponseEntity<>("Error deleting", HttpStatus.NO_CONTENT);
    }
  }

  @Override
  public SubCategory createSubCategory(SubCategory subCategory) {
    return subCategoryRepository.save(subCategory);
  }
}
