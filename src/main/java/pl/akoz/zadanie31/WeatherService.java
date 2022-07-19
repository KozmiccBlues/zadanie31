package pl.akoz.zadanie31;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class WeatherService {

    private static final String url = "api.openweathermap.org/data/2.5/forecast?id=524901&appid=d8de512dad1e9841cc7e0ce9ae25ade5";

    public List<WeatherDetail> getWeatherDetails() {

        RestTemplate restTemplate = new RestTemplate();
        String response = restTemplate.getForObject(url, String.class);

        System.out.println();

        List<WeatherDetail> weatherDetails = new ArrayList<>();
        weatherDetails.add(new WeatherDetail("Gdynia", 33.5));
        weatherDetails.add(new WeatherDetail("Warszawa", 34.5));

        return weatherDetails;

    }
}