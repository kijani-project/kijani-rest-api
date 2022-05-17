package com.kijani.restapi.service.impl;

import com.kijani.restapi.model.ProductEcoLabel;
import com.kijani.restapi.repository.ProductEcolabelRepository;
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
public class ProductEcolabelServiceImpl implements ProductEcolabelService {

    @Autowired
    ProductEcolabelRepository productEcolabelRepository;

    @Override
    public List<ProductEcoLabel> getProductEcolabels() {
        return productEcolabelRepository.findAll();
    }

    @Override
    public ProductEcoLabel createEcolabel(ProductEcoLabel productEcoLabel) {
        return productEcolabelRepository.save(productEcoLabel);
    }

    @Override
    public ProductEcoLabel getProductEcolabelById(int ecolabelId) {
        return productEcolabelRepository.findById(ecolabelId).orElse(null);
    }

    @Override
    public ResponseEntity<String> updateEcolabel(ProductEcoLabel productEcoLabel) {
        Optional<ProductEcoLabel>ecolabelDb = productEcolabelRepository.findById(productEcoLabel.getProductEcolabelId());
        if (ecolabelDb.isPresent()) {
         productEcolabelRepository.save(productEcoLabel);
         return ResponseEntity.ok().body("You edited an ecolabel " + productEcoLabel.getProductEcolabelId());
        } else{
            return new ResponseEntity<>("Error " , HttpStatus.NOT_FOUND);
        }

    }

    @Override
    public ResponseEntity<String> delete(int ecolabelId) {
        try{
            productEcolabelRepository.deleteById(ecolabelId);
            return new ResponseEntity<>("Ecolabel was deleted ",HttpStatus.OK);
        }catch(Exception err){
            return new ResponseEntity<>("Error Ecolabel not found ",HttpStatus.I_AM_A_TEAPOT);
        }
    }
}
