package com.kijani.restapi.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

@Entity
@Setter
@Getter
public class Product {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "product_id")
  private Integer productId;

  @ManyToOne
  @JsonIgnore
  // @JsonBackReference
  @JoinColumn(name = "supplier_id")
  private Supplier supplier;

  @ManyToMany(cascade = CascadeType.MERGE)
  // @JsonManagedReference
  @JoinTable(
      name = "product_support_ecoLabel",
      joinColumns = @JoinColumn(name = "product_id"),
      inverseJoinColumns = @JoinColumn(name = "product_ecolabel_id"))
  private List<ProductEcoLabel> productEcoLabels;

  private String itemNumber;

  private String name;

  @Column(length = 1024)
  private String description;

  private String designer;

  @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
  @JoinColumn(name = "measurement_id")
  // @JsonManagedReference
  private Measurement measurement;

  @ManyToMany
  // @JsonManagedReference
  @JoinTable(
      name = "product_category",
      joinColumns = @JoinColumn(name = "product_id"),
      inverseJoinColumns = @JoinColumn(name = "sub_category_id"))
  private List<SubCategory> subCategories = new LinkedList<>();

  @Column(name = "co2_mesurability")
  private String co2Mesurability;

  @ManyToMany
  // @JsonManagedReference
  @JoinTable(
      name = "product_ecoTest",
      joinColumns = @JoinColumn(name = "product_id"),
      inverseJoinColumns = @JoinColumn(name = "ecoTest_id"))
  private List<EcoTest> ecoTests = new LinkedList<>();

  private Date createdAt;

  private Date updatedAt;

  private String imageLink;

  private String brochureLink;

  @JsonIgnore
  public void addSubCategory(SubCategory subCategory) {
    subCategories.add(subCategory);
  }
}
