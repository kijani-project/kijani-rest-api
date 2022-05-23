package com.kijani.restapi.service.impl;

import com.kijani.restapi.model.Designer;
import com.kijani.restapi.repository.DesignerRepository;
import com.kijani.restapi.service.DesignerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author roed
 */
@Service
public class DesignerServiceImpl implements DesignerService {

  @Autowired DesignerRepository designerRepository;

  @Override
  public Designer findDesigner(int designerId) {
    return designerRepository.findById(designerId).orElse(null);
  }

  @Override
  public Designer createDesigner(Designer designer) {
    return designerRepository.save(designer);
  }

  @Override
  public List<Designer> getDesigners() {
    return designerRepository.findAll();
  }

  @Override
  public ResponseEntity<String> deleteDesigner(Integer designerId) {
    try {
      designerRepository.deleteById(designerId);
      return new ResponseEntity<>("was deleted", HttpStatus.OK);
    } catch (Exception err) {
      return new ResponseEntity<>("Error deleting", HttpStatus.NO_CONTENT);
    }
  }
}
