package com.weather.domain;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherReport {

  private String cod;
  private double message;
  private int count;
  private List<WeatherInformation> weatherInfo;
  private City city;

  public String getCod() {
    return cod;
  }

  public void setCod(String cod) {
    this.cod = cod;
  }

  @JsonProperty("message")
  public double getMessage() {
    return message;
  }

  public void setMessage(int message) {
    this.message = message;
  }

  @JsonProperty("cnt")
  public int getCount() {
    return count;
  }

  public void setCount(int count) {
    this.count = count;
  }

  @JsonProperty("list")
  public List<WeatherInformation> getWeatherInfo() {
    return weatherInfo;
  }

  public void setWeatherInfo(List<WeatherInformation> weatherInfo) {
    this.weatherInfo = weatherInfo;
  }

  public City getCity() {
    return city;
  }

  public void setCity(City city) {
    this.city = city;
  }

  @Override
  public String toString() {
    return "WeatherReport [cod=" + cod + ", message=" + message + ", count=" + count
        + ", weatherInfo=" + weatherInfo + ", city=" + city + "]";
  }
}
