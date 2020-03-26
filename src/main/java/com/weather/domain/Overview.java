package com.weather.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Overview {

  private double temperature;
  private double minTemperature;
  private double maxTemperature;
  private double pressure;
  private double seaLevel;
  private double groundLevel;
  private double humidity;
  private String temperatureKF;

  @JsonProperty("temp")
  public double getTemperature() {
    return temperature;
  }

  @JsonProperty("temp_min")
  public double getMinTemperature() {
    return minTemperature;
  }

  @JsonProperty("temp_max")
  public double getMaxTemperature() {
    return maxTemperature;
  }

  public double getPressure() {
    return pressure;
  }

  @JsonProperty("sea_level")
  public double getSeaLevel() {
    return seaLevel;
  }

  @JsonProperty("grnd_level")
  public double getGroundLevel() {
    return groundLevel;
  }

  public double getHumidity() {
    return humidity;
  }

  @JsonProperty("temp_kf")
  public String getTemperatureKF() {
    return temperatureKF;
  }

  @Override
  public String toString() {
    return "Overview [temperature=" + temperature + ", minTemperature=" + minTemperature
        + ", maxTemperature=" + maxTemperature + ", pressure=" + pressure + ", seaLevel=" + seaLevel
        + ", groundLevel=" + groundLevel + ", humidity=" + humidity + ", temperatureKF="
        + temperatureKF + "]";
  }
}
