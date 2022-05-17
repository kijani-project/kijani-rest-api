package com.kijani.restapi.controller;

import com.kijani.restapi.model.SubCategory;
import com.kijani.restapi.service.impl.SubCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author roed
 */
@RestController
@CrossOrigin
@RequestMapping("/subcategories") // Kan den ikke kaldes for sub?????????????????
public class SubCategoryController {
  @Autowired SubCategoryService subCategoryService;

  @GetMapping()
  public List<SubCategory> getSubCategories() {
    return subCategoryService.getSubCategories();
  }

  // Er flyttet til Category
  /*
  @PostMapping("/{categoryId}")
  public SubCategory createSubCategory(
      @PathVariable int categoryId, @RequestBody SubCategory subCategory) {
    subCategory.setSubCategoryId(categoryId);
    return subCategoryService.createSubCategory(subCategory);
  }*/

  // TODO Attribut skal ændres fra INTEGER til INT på Modellen.
  @PutMapping("/{subCategoryId}")
  public ResponseEntity<String> editSubCategory(
      @PathVariable Integer subCategoryId, @RequestBody SubCategory subCategory) {
    subCategory.setSubCategoryId(subCategoryId);
    return subCategoryService.editSubCategory(subCategory);
  }

  // TODO Problemer med med parent row - deleter ikke
  @DeleteMapping("/{subCategoryID}")
  public ResponseEntity<String> deleteSubCategory(@PathVariable int subCategoryID) {
    return subCategoryService.deleteSubCategory(subCategoryID);
  }
}
