package com.kijani.restapi.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.LinkedList;
import java.util.List;

/**
 * @author roed
 */
@Entity
@Setter
@Getter
public class SubCategory {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "sub_category_id", nullable = false)
  private Integer subCategoryId;

  @ManyToOne()
  @JsonBackReference
  @JoinColumn(name = "category_id")
  private Category category;

  @ManyToMany(mappedBy = "subCategories")
  @JsonIgnore
  private List<Product> products = new LinkedList<>();

  private String subCategoryName;

  public void addProduct(Product product) {
    products.add(product);
  }
}
