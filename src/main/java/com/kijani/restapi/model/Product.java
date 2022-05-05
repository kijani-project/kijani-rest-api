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

  private Integer item_number;

  private String name;

  private String description;

  private String sub_category_id;

  private Integer supplier_id;

  private String ecolabels;

  private String co2_mesurability;

  private String tests;

  private Date created;

  private String picture;

  private String link;
}
