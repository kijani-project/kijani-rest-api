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
  @Column(name = "supplier_id")
  private Integer supplierId;

  @OneToMany
  // @JsonManagedReference
  @JoinColumn(name = "supplier_id")
  private List<Product> products;

  private String name;

  private String environmentalProfile;

  private String packaging;

  private String freight;

  @ManyToMany
  // @JsonManagedReference
  @JoinTable(
      name = "supplier_support_ecolabel",
      joinColumns = @JoinColumn(name = "supplier_id"),
      inverseJoinColumns = @JoinColumn(name = "supplier_ecolabel_id"))
  private List<SupplierEcoLabel> supplierEcolabels;

  private Integer roleId;
}
