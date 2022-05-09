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
public class Role {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "role_id", nullable = false)
  private Integer roleId;

  private String admin;

  private String customer;

  private String supplier;

  @OneToMany
  @JoinColumn(name = "user_role_id")
  private Integer userRoleId;

}
