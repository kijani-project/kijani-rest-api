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
  @JoinColumn(name = "supplier_id")
  private Supplier supplier;

  @ManyToMany(cascade = {CascadeType.MERGE})
  @JoinTable(
      name = "product_support_eco_label",
      joinColumns = @JoinColumn(name = "product_id"),
      inverseJoinColumns = @JoinColumn(name = "product_eco_label_id"))
  private List<ProductEcoLabel> productEcoLabels;

  private String itemNumber;

  private String name;

  @Column(length = 1024)
  private String description;

  @ManyToMany()
  @JoinTable(
      name = "product_designer",
      joinColumns = @JoinColumn(name = "product_id"),
      inverseJoinColumns = @JoinColumn(name = "designer_id"))
  private List<Designer> designers = new LinkedList<>();

  @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
  @JoinColumn(name = "measurement_id")
  private Measurement measurement;

  @ManyToMany()
  @JoinTable(
      name = "product_category",
      joinColumns = @JoinColumn(name = "product_id"),
      inverseJoinColumns = @JoinColumn(name = "sub_category_id"))
  private List<SubCategory> subCategories = new LinkedList<>();

  @Column(name = "co2_measurability")
  private String co2Measurability;

  @ManyToMany
  @JoinTable(
      name = "product_eco_test",
      joinColumns = @JoinColumn(name = "product_id"),
      inverseJoinColumns = @JoinColumn(name = "eco_test_id"))
  private List<EcoTest> ecoTests = new LinkedList<>();

  private Date createdAt; // TODO

  private Date updatedAt; // TODO

  private String imageLink;

  private String brochureLink;
}
