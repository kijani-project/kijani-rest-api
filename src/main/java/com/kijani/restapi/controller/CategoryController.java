package com.kijani.restapi.controller;

import com.kijani.restapi.model.Category;
import com.kijani.restapi.service.impl.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author roed
 */
@RestController
@CrossOrigin
@RequestMapping("/categories")
public class CategoryController {

  @Autowired CategoryService categoryService;

  @GetMapping()
  public List<Category> findAllCategories() {
    return categoryService.getCategories();
  }


}
