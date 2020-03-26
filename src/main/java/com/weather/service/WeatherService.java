package com.weather.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Service;
import com.weather.domain.Overview;
import com.weather.domain.WeatherInformation;
import com.weather.domain.WeatherReport;
import com.weather.domain.Wind;

@Service
public class WeatherService {

  public Map<String, Double> getTemperature(WeatherReport weatherReport, String userDate) {

    Map<String, Double> temperature = new HashMap<String, Double>();
    List<WeatherInformation> weatherList = weatherReport.getWeatherInfo();

    for (WeatherInformation weather : weatherList) {

      Overview overview = weather.getOverview();
      String date = weather.getDate().substring(0, 10);
      
      if (date.equals(userDate)) {
        String time = weather.getDate().substring(10);
        temperature.put(time, overview.getTemperature());
      }
    }

    return temperature;
  }

  public Map<String, Double> getWindSpeed(WeatherReport weatherReport, String userDate) {

    Map<String, Double> windSpeed = new HashMap<String, Double>();

    List<WeatherInformation> weatherList = weatherReport.getWeatherInfo();

    for (WeatherInformation weather : weatherList) {

      Wind wind = weather.getWind();
      String date = weather.getDate().substring(0, 10);
      
      if (date.equals(userDate)) {
        String time = weather.getDate().substring(10);
        windSpeed.put(time, wind.getSpeed());
      }
    }

    return windSpeed;
  }

  public Map<String, Double> getPressure(WeatherReport weatherReport, String userDate) {

    Map<String, Double> pressure = new HashMap<String, Double>();

    List<WeatherInformation> weatherList = weatherReport.getWeatherInfo();

    for (WeatherInformation weather : weatherList) {

      Overview overview = weather.getOverview();
      String date = weather.getDate().substring(0, 10);
      
      if (date.equals(userDate)) {
        String time = weather.getDate().substring(10);
        pressure.put(time, overview.getPressure());
      }
    }

    return pressure;
  }
}
