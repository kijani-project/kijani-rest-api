package com.kijani.restapi.controller;

import com.kijani.restapi.model.Category;
import com.kijani.restapi.model.SubCategory;
import com.kijani.restapi.service.CategoryService;
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
    return categoryService.getCategory(categoryId);
  }

  @GetMapping()
  public List<Category> getCategories() {
    return categoryService.getCategories();
  }

  @PostMapping()
  public Category createCategory(@RequestBody Category category) {
    return categoryService.createCategory(category);
  }

  @PostMapping("/{categoryId}/subCategories")
  public SubCategory createSubCategory(
      @PathVariable int categoryId, @RequestBody SubCategory subCategory) {
    subCategory.setCategory(categoryService.getCategory(categoryId));
    return categoryService.createSubCategory(subCategory);
  }

  @PutMapping("/{categoryId}")
  public ResponseEntity<String> updateCategory(
      @PathVariable int categoryId, @RequestBody Category category) {
    category.setCategoryId(categoryId);
    return categoryService.updateCategory(category);
  }

  @DeleteMapping("/{categoryId}")
  public ResponseEntity<String> deleteCategory(@PathVariable int categoryId) {
    return categoryService.deleteCategory(categoryId);
  }
}
