package com.kijani.restapi.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.Setter;
import lombok.Singular;

import javax.persistence.*;
import java.util.*;

@Entity
@Setter
@Getter
public class Product {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="product_id")
  private Integer productId;

  @ManyToOne
  @JoinColumn(name = "supplier_id")
  private Supplier supplier;


  @Singular
  @ManyToMany(cascade = CascadeType.MERGE)
  @JoinTable(name = "product_ecolabel",
          joinColumns = {@JoinColumn(name = "product_id", referencedColumnName = "product_id")},
          inverseJoinColumns = {@JoinColumn(name = "ecolabel_id", referencedColumnName = "ecolabel_id")})
  private Set<Ecolabel> ecolabels ;

  private Integer itemNumber;

  private String name;

  private String description;

  private String subCategoryId;

  @Column(name = "co2_mesurability")
  private String co2Mesurability;

  private String tests;

  private Date created;

  private String picture;

  private String link;


}
