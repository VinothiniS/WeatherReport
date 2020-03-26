package com.weather.domain;

import com.weather.enums.WeatherType;

public class Weather {

  private long id;
  private WeatherType main;
  private String description;
  private String icon;

  public long getId() {
    return id;
  }

  public WeatherType getMainWeather() {
    return main;
  }

  public String getDescription() {
    return description;
  }

  public String getIcon() {
    return icon;
  }

  @Override
  public String toString() {
    return "Weather [id=" + id + ", mainWeather=" + main + ", description=" + description
        + ", icon=" + icon + "]";
  }
}
