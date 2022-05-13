package com.kijani.restapi.controller;

import com.kijani.restapi.model.Category;
import com.kijani.restapi.service.impl.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author roed
 */
@RestController
@CrossOrigin
@RequestMapping("/categories")
public class CategoryController {

  @Autowired CategoryService categoryService;

  @GetMapping("/{categoryId}")
  public Category findCategory(@PathVariable int categoryId) {
    return categoryService.getCategoryByCategoryId(categoryId);
  }

  @GetMapping()
  public List<Category> getCategories() {
    return categoryService.getCategories();
  }

  // TODO Fixet
  @PutMapping()
  public Category createCategory(@RequestBody Category category) {
    return categoryService.createCategory(category);
  }

  @PutMapping("/{categoryId}")
  public ResponseEntity<String> editCategory(
      @PathVariable int categoryId, @RequestBody Category category) {
    category.setCategoryId(categoryId);
    return categoryService.update(category);
  }

  @DeleteMapping("/{categoryId}")
  public ResponseEntity<String> deleteCategory(@PathVariable int categoryId) {
    return categoryService.deleteCategory(categoryId);
  }
}
