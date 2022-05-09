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
public class UserRole {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "user_role_id", nullable = false)
  private Integer userRoleId;

  @OneToMany
  @JoinColumn(name = "user_id")
  private Integer userId;

  @OneToMany
  @JoinColumn(name = "role_id")
  private Integer roleId;
}
