package com.weather.service;

import java.util.Map;
import java.util.Scanner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.weather.domain.WeatherReport;

@Service
public class OptionService {

  private final WeatherService weatherService;

  @Autowired
  private OptionService(WeatherService weatherService) {
    this.weatherService = weatherService;
  }

  public void retrieveWeatherInformation(WeatherReport weatherReport) {

    int option;
    Scanner scanner = new Scanner(System.in);

    do {

      String date = null;

      System.out.println("Please enter an option to proceed");
      System.out.println("1. Get weather\r\n" + "2. Get Wind Speed\r\n" + "3. Get Pressure\r\n"
          + "0. Exit\r\n" + "");

      option = scanner.nextInt();

      if ((option > 0) & (option < 4)) {
        System.out.println("Please enter the date in the given format (yyyy-MM-dd) : ");
        date = scanner.next();

      } else if (option < 0 | option > 3) {
        System.out.println("Please provide a valid option");
        continue;
      }

      switch (option) {

        case 1:
          Map<String, Double> temperature = weatherService.getTemperature(weatherReport, date);
          System.out.println("Hour        Temperature");
          System.out.println("====        ===========");
          temperature.forEach((key, value) -> System.out.println(key + " => " + value));
          break;

        case 2:
          Map<String, Double> windSpeed = weatherService.getWindSpeed(weatherReport, date);
          System.out.println("Hour        Wind Speed");
          System.out.println("====        ===========");
          windSpeed.forEach((key, value) -> System.out.println(key + " => " + value));
          break;

        case 3:
          Map<String, Double> pressure = weatherService.getPressure(weatherReport, date);
          System.out.println("Hour        Pressure");
          System.out.println("====        ========");
          pressure.forEach((key, value) -> System.out.println(key + " => " + value));
          break;

        case 0:
          System.out.println("Exiting the application");
          break;
      }
    } while (option != 0);

    scanner.close();
  }
}
