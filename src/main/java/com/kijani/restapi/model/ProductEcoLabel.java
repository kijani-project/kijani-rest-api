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
  @Column(name = "product_eco_label_id", nullable = false)
  private Integer productEcoLabelId;

  @ManyToMany(mappedBy = "productEcoLabels", cascade = CascadeType.ALL)
  @JsonBackReference
  private List<Product> products;

  private String type;
}
