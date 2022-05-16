package com.kijani.restapi.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
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

  //Skal slettes når DataMapper slettes

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "measurement_id", nullable = false)
  private Integer measurementId;

  @OneToOne(mappedBy = "measurement")
  @JsonBackReference
  private Product product;

  private int length;

  private int width;

  private int height;

}
