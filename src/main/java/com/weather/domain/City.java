package com.weather.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class City {

  private int id;
  private String cityName;
  private Coordinates cityCoordinates;
  private String country;
  private long population;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  @JsonProperty("name")
  public String getCityName() {
    return cityName;
  }

  public void setCityName(String cityName) {
    this.cityName = cityName;
  }

  @JsonProperty("coord")
  public Coordinates getCityCoordinates() {
    return cityCoordinates;
  }

  public void setCityCoordinates(Coordinates cityCoordinates) {
    this.cityCoordinates = cityCoordinates;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public long getPopulation() {
    return population;
  }

  public void setPopulation(long population) {
    this.population = population;
  }

  @Override
  public String toString() {
    return "City [id=" + id + ", cityName=" + cityName + ", cityCoordinates=" + cityCoordinates
        + ", country=" + country + ", population=" + population + "]";
  }

  public static final class Coordinates {
    private double latitude;
    private double longitude;

    public Coordinates() {
      super();
    }

    @JsonProperty("lat")
    public double getLatitude() {
      return latitude;
    }

    public void setLatitude(double latitude) {
      this.latitude = latitude;
    }

    @JsonProperty("lon")
    public double getLongitude() {
      return longitude;
    }

    public void setLongitude(double longitude) {
      this.longitude = longitude;
    }

    @Override
    public String toString() {
      return "Coordinates [latitude=" + latitude + ", longitude=" + longitude + "]";
    }
  }
}
