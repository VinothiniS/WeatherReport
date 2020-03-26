package com.weather.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Wind {

  private double speed;
  private double degree;

  public double getSpeed() {
    return speed;
  }

  @JsonProperty("deg")
  public double getDegree() {
    return degree;
  }

  @Override
  public String toString() {
    return "Wind [speed=" + speed + ", degree=" + degree + "]";
  }
}
