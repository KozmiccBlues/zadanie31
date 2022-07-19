package pl.akoz.zadanie31;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller

public class HomeController {

    private final WeatherService weatherService;

    public HomeController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping("/")
    public String home(Model model) {
        List<WeatherDetail> weatherDetails = weatherService.getWeatherDetails();
        model.addAttribute("weatherDetails", weatherDetails);
        return "home";
    }
}
