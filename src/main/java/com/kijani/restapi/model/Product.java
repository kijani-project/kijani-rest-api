package com.kijani.restapi.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Setter
@Getter
public class Product {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "product_id", nullable = false)
  private Integer productId;

  private Integer itemNumber;

  private String name;

  private String description;

  private String subCategoryId;

  private Integer supplierId;

  private String ecolabels;

  @Column(name = "co2_mesurability")
  private String co2Mesurability;

  private String tests;

  private Date created;

  private String picture;

  private String link;
}
