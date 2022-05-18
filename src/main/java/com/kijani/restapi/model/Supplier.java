package com.kijani.restapi.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

/**
 * @author roed
 */
@Entity
@Setter
@Getter
public class Supplier {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer supplierId;

  @OneToMany
  @JoinColumn(name = "supplier_id")
  private List<Product> products;

  private String name;

  @Column(length = 1024)
  private String environmentalProfile;

  @Column(length = 1024)
  private String packaging;

  @Column(length = 1024)
  private String freight;

  @ManyToMany
  @JoinTable(
      name = "supplier_support_eco_label",
      joinColumns = @JoinColumn(name = "supplier_id"),
      inverseJoinColumns = @JoinColumn(name = "supplier_eco_label_id"))
  private List<SupplierEcoLabel> supplierEcoLabels;

  private Integer roleId;
}
