package com.kijani.restapi.service;

import com.kijani.restapi.model.Designer;
import org.springframework.http.ResponseEntity;

import java.util.List;

/**
 * @author roed
 */
public interface DesignerService {

  Designer findDesigner(int designerId);

  Designer createDesigner(Designer designer);

  List<Designer> getDesigners();

  ResponseEntity<String> deleteDesigner(Integer designerId);
}
