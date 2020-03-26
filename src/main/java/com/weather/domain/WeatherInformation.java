package com.weather.domain;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class WeatherInformation {

  private long id;
  private Overview overview;
  private List<Weather> weather;
  private Cloud clouds;
  private Wind wind;
  private Sys sys;
  private String date;

  @JsonProperty("dt")
  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  @JsonProperty("main")
  public Overview getOverview() {
    return overview;
  }

  public void setOverview(Overview overview) {
    this.overview = overview;
  }

  public List<Weather> getWeather() {
    return weather;
  }

  public void setWeather(List<Weather> weather) {
    this.weather = weather;
  }

  public Cloud getCloud() {
    return clouds;
  }

  public void setCloud(Cloud cloud) {
    this.clouds = cloud;
  }

  public Wind getWind() {
    return wind;
  }

  public void setWind(Wind wind) {
    this.wind = wind;
  }

  public Sys getSys() {
    return sys;
  }

  public void setSys(Sys sys) {
    this.sys = sys;
  }

  @JsonProperty("dt_txt")
  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  @Override
  public String toString() {
    return "WeatherInformation [id=" + id + ", overview=" + overview + ", weather=" + weather
        + ", cloud=" + clouds + ", wind=" + wind + ", sys=" + sys + ", date=" + date + "]";
  }
}
