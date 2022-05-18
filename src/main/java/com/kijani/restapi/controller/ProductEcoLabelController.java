package com.kijani.restapi.controller;

import com.kijani.restapi.model.ProductEcoLabel;
import com.kijani.restapi.service.ProductEcoLabelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Christopher
 */
@RestController
@CrossOrigin
@RequestMapping("/productEcoLabels")
public class ProductEcoLabelController {
  @Autowired ProductEcoLabelService productEcolabelService;

  @GetMapping()
  public List<ProductEcoLabel> getProductsEcoLabels() {
    return productEcolabelService.getProductEcoLabels();
  }

  @GetMapping("/{productEcoLabelId}")
  public ProductEcoLabel getProductsEcoLabels(@PathVariable int productEcoLabelId) {
    return productEcolabelService.getProductEcoLabel(productEcoLabelId);
  }

  @PostMapping()
  public ProductEcoLabel createProductEcoLabel(@RequestBody ProductEcoLabel productEcoLabel) {
    return productEcolabelService.createProductEcoLabel(productEcoLabel);
  }

  @PutMapping("/{productEcoLabelId}")
  public ResponseEntity<String> updateProductEcoLabel(
      @PathVariable int productEcoLabelId, @RequestBody ProductEcoLabel productEcoLabel) {
    productEcoLabel.setProductEcoLabelId(productEcoLabelId);
    return productEcolabelService.updateProductEcoLabel(productEcoLabel);
  }

  @DeleteMapping("/{productEcoLabelId}")
  public ResponseEntity<String> deleteProductEcoLabel(@PathVariable int productEcoLabelId) {
    return productEcolabelService.deleteProductEcoLabel(productEcoLabelId);
  }
}
