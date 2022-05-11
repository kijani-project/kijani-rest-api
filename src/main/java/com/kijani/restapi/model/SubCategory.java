package com.kijani.restapi.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
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
public class SubCategory {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "sub_category_id", nullable = false)
  private Integer id;

  @ManyToOne()
  @JsonBackReference
  @JoinColumn(name = "category_id")
  private Category category;

  @ManyToMany(mappedBy = "subCategories")
  private List<Product> products;

  private String subCategoryName;

  public void addProduct(Product product) {
    products.add(product);
  }
}
