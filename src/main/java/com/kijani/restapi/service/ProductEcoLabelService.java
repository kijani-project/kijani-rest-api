package com.kijani.restapi.service;

import com.kijani.restapi.model.ProductEcoLabel;
import org.springframework.http.ResponseEntity;

import java.util.List;

/**
 * @author Christopher
 */
public interface ProductEcoLabelService {

  List<ProductEcoLabel> getProductEcoLabels();

  ProductEcoLabel createProductEcoLabel(ProductEcoLabel productEcoLabel);

  ProductEcoLabel getProductEcoLabel(int productEcoLabelId);

  ResponseEntity<String> updateProductEcoLabel(ProductEcoLabel productEcoLabel);

  ResponseEntity<String> deleteProductEcoLabel(int productEcoLabelId);
}
