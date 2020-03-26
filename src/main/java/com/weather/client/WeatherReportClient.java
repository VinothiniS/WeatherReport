package com.weather.client;

import static com.weather.constants.WeatherReportConstants.API_URL;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import org.springframework.stereotype.Service;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.weather.domain.WeatherReport;
import com.weather.enums.RequestType;

@Service
public class WeatherReportClient {

  private final ObjectMapper mapper;

  public WeatherReportClient(ObjectMapper mapper) {
    this.mapper = mapper;
  }

  public WeatherReport extractWeatherInformation() throws IOException {

    WeatherReport weatherReport = null;
    String weatherString = "";

    URL url = new URL(API_URL);
    HttpURLConnection httpConnection = (HttpURLConnection) url.openConnection();
    httpConnection.setRequestMethod(RequestType.GET.toString());
    httpConnection.connect();

    int responseCode = httpConnection.getResponseCode();

    if (isResponseSuccessful(responseCode)) {

      Scanner scanner = new Scanner(url.openStream());
      while (scanner.hasNext()) {
        weatherString += scanner.next();
      }
      scanner.close();

      weatherReport = mapper.readValue(weatherString, WeatherReport.class);
    }
    return weatherReport;
  }

  private boolean isResponseSuccessful(int responseCode) {

    if (responseCode == 200) {
      return true;
    }
    return false;
  }
}
