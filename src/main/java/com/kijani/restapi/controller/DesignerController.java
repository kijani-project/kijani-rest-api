package com.kijani.restapi.controller;

import com.kijani.restapi.model.Designer;
import com.kijani.restapi.service.DesignerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author roed
 */
@RestController
@CrossOrigin
@RequestMapping("/designer")
public class DesignerController {

  @Autowired DesignerService designerService;

  @GetMapping("/{designerId}")
  public Designer findDesigner(@PathVariable int designerId) {
    return designerService.findDesigner(designerId);
  }

  @GetMapping()
  public List<Designer> getDesigners() {
    return designerService.getDesigners();
  }

  @PostMapping()
  public Designer createProductEcoLabel(@RequestBody Designer designer) {
    return designerService.createDesigner(designer);
  }

  @DeleteMapping("/{designerId}")
  public ResponseEntity<String> deleteDesigner(@PathVariable Integer designerId) {
    return designerService.deleteDesigner(designerId);
  }
}
