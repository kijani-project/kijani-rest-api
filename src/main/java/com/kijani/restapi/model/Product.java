package com.kijani.restapi.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

@Entity
@Setter
@Getter
//@NoArgsConstructor
public class Product {


  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "product_id")
  private Integer productId;

  @ManyToOne
  @JsonBackReference(value = "setSupplier")
  @JoinColumn(name = "supplier_id")
  private Supplier supplier;

  /*@Singular
  @ManyToMany(cascade = CascadeType.MERGE)
  @JoinTable(name = "product_ecolabel",
          joinColumns = {@JoinColumn(name = "product_id", referencedColumnName = "product_id")},
          inverseJoinColumns = {@JoinColumn(name = "ecolabel_id", referencedColumnName = "ecolabel_id")})*/
  @OneToMany
  @JsonBackReference(value = "setEcoLabel")
  @JoinColumn(name = "product_id")
  private List<Ecolabel> ecolabels;

  private String itemNumber;

  private String name;

  private String description;

  @ManyToMany
  //Måske værd at bruge JsonIgnore i stedet for JsonBackRefrence
  //@JsonIgnore
  @JsonBackReference(value = "SetProductCategory")
  @JoinTable(name = "product_category",
  joinColumns = @JoinColumn(name  = "product_id"),
      inverseJoinColumns = @JoinColumn(name = "sub_category_id")
  )
  private List<SubCategory> subCategories = new LinkedList<>();

  @Column(name = "co2_mesurability")
  private String co2Mesurability;

  //Bliver til list senere
  private String tests;

  private Date createdAt;

  private Date updatedAt;

  private String imageLink;

  private String brochureLink;

  public void addSubCategory(SubCategory subCategory) {
    subCategories.add(subCategory);
  }
}
