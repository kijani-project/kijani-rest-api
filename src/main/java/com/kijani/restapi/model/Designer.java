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
public class Designer {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "designer_id", nullable = false)
  private Integer designerId;

  private String name;

  private String imageLink;

  @ManyToMany(mappedBy = "designers")
  @JsonBackReference
  private List<Product> products;
}
