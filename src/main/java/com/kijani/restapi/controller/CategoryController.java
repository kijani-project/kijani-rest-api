package com.kijani.restapi.controller;

import com.kijani.restapi.model.Category;
import com.kijani.restapi.service.impl.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
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

  // TODO FEJL 415
  @PostMapping()
  public Category createCategory(@RequestBody Category category) {
    return categoryService.createCategory(category);
  }

  /*
    @PutMapping
    public Category editCategory(){}

  */

}
