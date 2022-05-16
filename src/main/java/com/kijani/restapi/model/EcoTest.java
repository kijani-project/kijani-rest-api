package com.kijani.restapi.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "eco_test")
@Getter
@Setter
public class EcoTest {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "ecotest_id", nullable = false)
  private Integer ecoTestId;

  private String ecoTestName;

  @ManyToMany(mappedBy = "ecoTests")
  //@JsonBackReference
  private List<Product> product;
}
