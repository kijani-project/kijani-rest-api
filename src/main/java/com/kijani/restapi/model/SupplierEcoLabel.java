package com.kijani.restapi.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
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
  @Column(name = "supplier_ecolabel_id", nullable = false)
  private Integer id;

  @ManyToMany(mappedBy = "supplierEcolabels")
  //@JsonBackReference
  private List<Supplier> suppliers;

  private String type;
}
