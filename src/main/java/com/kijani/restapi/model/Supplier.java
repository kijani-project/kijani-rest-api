package com.kijani.restapi.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.util.List;
import java.util.Set;

/**
 * @author roed
 */
@Entity
@Setter
@Getter
public class Supplier {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="supplier_id")
  private Integer supplierId;

  @OneToMany()
  @JoinColumn(name="supplier_id")
  private List<Product> products;

  private String name;

  private String environmentalProfile;

  private String packaging;

  private String freight;

  private String ecolabels;

  private Integer roleId;
}
