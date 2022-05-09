package com.kijani.restapi.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

/**
 * @author roed
 */
@Entity
@Table(name = "Supplier")
@Setter
@Getter
public class Supplier {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "supplier_id", nullable = false)
  private Integer supplierId;

  private String name;

  private String environmentalProfile;

  private String packaging;

  private String freight;

  private String ecolabels;

  private Integer roleId;

  @ManyToOne
  @JoinColumn(name = "product_id")
  private Product product;
}
