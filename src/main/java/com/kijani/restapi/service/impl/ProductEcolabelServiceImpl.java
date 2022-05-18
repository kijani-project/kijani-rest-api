package com.kijani.restapi.service.impl;

import com.kijani.restapi.model.ProductEcoLabel;
import com.kijani.restapi.repository.ProductEcoLabelRepository;
import com.kijani.restapi.service.ProductEcoLabelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author Christopher
 */
@Service
public class ProductEcolabelServiceImpl implements ProductEcoLabelService {

  @Autowired ProductEcoLabelRepository productEcolabelRepository;

  @Override
  public List<ProductEcoLabel> getProductEcoLabels() {
    return productEcolabelRepository.findAll();
  }

  @Override
  public ProductEcoLabel createProductEcoLabel(ProductEcoLabel productEcoLabel) {
    return productEcolabelRepository.save(productEcoLabel);
  }

  @Override
  public ProductEcoLabel getProductEcoLabel(int productEcoLabelId) {
    return productEcolabelRepository.findById(productEcoLabelId).orElse(null);
  }

  @Override
  public ResponseEntity<String> updateProductEcoLabel(ProductEcoLabel productEcoLabel) {
    Optional<ProductEcoLabel> ecolabelDb =
        productEcolabelRepository.findById(productEcoLabel.getProductEcoLabelId());
    if (ecolabelDb.isPresent()) {
      productEcolabelRepository.save(productEcoLabel);
      return ResponseEntity.ok()
          .body("You edited an ecolabel " + productEcoLabel.getProductEcoLabelId());
    } else {
      return new ResponseEntity<>("Error ", HttpStatus.NOT_FOUND);
    }
  }

  @Override
  public ResponseEntity<String> deleteProductEcoLabel(int productEcoLabelId) {
    try {
      productEcolabelRepository.deleteById(productEcoLabelId);
      return new ResponseEntity<>("Ecolabel was deleted ", HttpStatus.OK);
    } catch (Exception err) {
      return new ResponseEntity<>("Error Ecolabel not found ", HttpStatus.I_AM_A_TEAPOT);
    }
  }
}
