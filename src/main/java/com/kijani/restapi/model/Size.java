package com.kijani.restapi.model;

import lombok.Getter;
import lombok.Setter;

/**
 * @author roed
 */
@Setter
@Getter
public class Size {

  private int length;
  private int width;
  private int height;

  public Size(int length, int width, int height) {
    this.length = length;
    this.width = width;
    this.height = height;
  }
}
