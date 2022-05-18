package com.kijani.restapi.controller;

import com.kijani.restapi.model.SubCategory;
import com.kijani.restapi.service.SubCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author roed
 */
@RestController
@CrossOrigin
@RequestMapping("/subCategories")
public class SubCategoryController {
  @Autowired SubCategoryService subCategoryService;

  @GetMapping()
  public List<SubCategory> getSubCategories() {
    return subCategoryService.getSubCategories();
  }

  @PutMapping("/{subCategoryId}")
  public ResponseEntity<String> updateSubCategory(
      @PathVariable Integer subCategoryId, @RequestBody SubCategory subCategory) {
    subCategory.setSubCategoryId(subCategoryId);
    return subCategoryService.updateSubCategory(subCategory);
  }

  @DeleteMapping("/{subCategoryId}")
  public ResponseEntity<String> deleteSubCategory(@PathVariable int subCategoryId) {
    return subCategoryService.deleteSubCategory(subCategoryId);
  }
}
