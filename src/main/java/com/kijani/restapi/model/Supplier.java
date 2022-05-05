package com.kijani.restapi.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * @author roed
 */
@Entity
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
}
