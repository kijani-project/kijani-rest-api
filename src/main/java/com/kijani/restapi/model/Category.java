package com.kijani.restapi.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
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
public class Category {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "category_id", nullable = false)
  private Integer id;

  @OneToMany
  @JsonManagedReference
  @JoinColumn(name = "category_id")
  private List<SubCategory> subCategories;

  private String categoryName;
}
