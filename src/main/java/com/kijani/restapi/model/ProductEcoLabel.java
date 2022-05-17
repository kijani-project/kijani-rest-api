package com.kijani.restapi.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Setter
@Getter
public class ProductEcoLabel {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "product_ecolabel_id", nullable = false)
  private Integer product_ecolabel_id;

  @ManyToMany(mappedBy = "productEcoLabels")
  @JsonBackReference
  private List<Product> products;

  private String type;
}
