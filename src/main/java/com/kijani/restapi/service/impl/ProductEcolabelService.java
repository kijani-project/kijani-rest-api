package com.kijani.restapi.service.impl;

import com.kijani.restapi.model.ProductEcoLabel;
import org.springframework.http.ResponseEntity;

import java.util.List;

/**
 * @author Christopher
 */
public interface ProductEcolabelService {

  List<ProductEcoLabel> getProductEcolabels();

  ProductEcoLabel createEcolabel(ProductEcoLabel productEcoLabel);

  ProductEcoLabel getProductEcolabelById(int ecolabelId);

  ResponseEntity<String> updateEcolabel(ProductEcoLabel productEcoLabel);

  ResponseEntity<String> delete(int ecolabelId);
}
