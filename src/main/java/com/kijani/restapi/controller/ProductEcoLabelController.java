package com.kijani.restapi.controller;

import com.kijani.restapi.model.ProductEcoLabel;
import com.kijani.restapi.model.SubCategory;
import com.kijani.restapi.service.impl.ProductEcolabelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Christopher
 */
@RestController
@CrossOrigin
@RequestMapping("/ecolabels")
public class ProductEcoLabelController {
    @Autowired
    ProductEcolabelService productEcolabelService;

    @GetMapping()
    public List<ProductEcoLabel> getProductsEcolabels() {
        return productEcolabelService.getProductEcolabels();
    }

    @GetMapping("/{ecolabelId}")
    public ProductEcoLabel getProductsEcolabels(@PathVariable int ecolabelId ) {
        return productEcolabelService.getProductEcolabelById(ecolabelId);
    }

    @PostMapping()
    public  ProductEcoLabel createEcolabel(@RequestBody ProductEcoLabel productEcoLabel){
        return productEcolabelService.createEcolabel(productEcoLabel);
    }

    @PutMapping("/{ecolabelId}")
    public ResponseEntity<String> updateEcolabel(
            @PathVariable int ecolabelId, @RequestBody ProductEcoLabel productEcoLabel) {
        productEcoLabel.setProductEcolabelId(ecolabelId);
        return productEcolabelService.updateEcolabel(productEcoLabel);
    }
    @DeleteMapping("/{ecolabelId}")
    public ResponseEntity<String> deleteEcolabel(@PathVariable int ecolabelId) {
        return productEcolabelService.delete(ecolabelId);
    }


}
