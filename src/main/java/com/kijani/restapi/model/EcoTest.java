package com.kijani.restapi.model;

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
  @Column(name = "eco_test_id", nullable = false)
  private Integer ecoTestId;

  private String ecoTestName;

  @ManyToMany(mappedBy = "ecoTests")
  private List<Product> products;
}
