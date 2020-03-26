package com.weather;

import java.io.IOException;
import java.text.ParseException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.weather.client.WeatherReportClient;
import com.weather.domain.WeatherReport;
import com.weather.service.OptionService;

public class WeatherReportApplication {

  public static void main(String[] args) throws ParseException, IOException {

    ApplicationContext applicationContext =
        new AnnotationConfigApplicationContext(WeatherReportConfiguration.class);

    WeatherReportClient weatherClient = applicationContext.getBean(WeatherReportClient.class);
    OptionService optionService = applicationContext.getBean(OptionService.class);

    WeatherReport weatherReport = weatherClient.extractWeatherInformation();
    optionService.retrieveWeatherInformation(weatherReport);
  }
}
