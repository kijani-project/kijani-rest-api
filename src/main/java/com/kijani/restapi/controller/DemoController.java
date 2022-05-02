package com.kijani.restapi.controller;

import com.kijani.restapi.model.Demo;
import com.kijani.restapi.repository.DemoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class DemoController {

  @Autowired DemoRepository demoRepository;

  @GetMapping("/")
  public String helloWorld() {
    return "kijani is running!";
  }

  @GetMapping("/demo")
  public List<Demo> getAllDemoMessages() {
    return demoRepository.findAll();
  }
}
