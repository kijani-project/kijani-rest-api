package com.kijani.restapi.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

/**
 * @author roed
 */

@Entity
@Setter
@Getter

public class Supplier {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "supplier_id", nullable = false)
  private Integer supplier_id;

  private String name;

  private String environmental_profile;

  private String packaging;

  private String freight;

  private String ecolabels;

  private Integer role_id;
}
