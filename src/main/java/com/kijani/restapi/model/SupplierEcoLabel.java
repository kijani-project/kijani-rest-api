package com.kijani.restapi.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Setter
@Getter
public class SupplierEcoLabel {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "supplier_eco_label_id", nullable = false)
  private Integer supplierEcoLabelId;

  @ManyToMany(mappedBy = "supplierEcoLabels")
  private List<Supplier> suppliers;

  private String type;
}
