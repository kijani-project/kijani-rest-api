package com.kijani.restapi.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * @author roed
 */
@Entity
@Setter
@Getter

public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "user_id", nullable = false)
  private Integer user_id;

  private String name;

  private String email;

  private String password;
}