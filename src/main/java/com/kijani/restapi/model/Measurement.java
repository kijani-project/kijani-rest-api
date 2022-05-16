package com.kijani.restapi.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

/**
 * @author roed
 */
@Entity
@Setter
@Getter
@NoArgsConstructor
public class Measurement {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "measurement_id", nullable = false)
  // Gør så id ikke bliver vist når man køre den i postman.
  @JsonIgnore
  private Integer measurementId;

  @OneToOne(mappedBy = "measurement")
  @JsonBackReference
  private Product product;

  private int length;

  private int width;

  private int height;
}
