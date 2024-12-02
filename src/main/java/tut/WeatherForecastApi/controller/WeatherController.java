package tut.WeatherForecastApi.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tut.WeatherForecastApi.model.Weather;
import tut.WeatherForecastApi.service.WeatherService;

import java.util.List;

@RestController
@RequestMapping("/weather")
public class WeatherController {

    @Autowired
    private WeatherService weatherService;

    @PostMapping
    public Weather addWeather(@RequestBody Weather weather) {
        return weatherService.addWeather(weather);
    }

    @GetMapping
    public List<Weather> getAllWeather() {
        return weatherService.getAllWeather();
    }

    @GetMapping("/{city}")
    public Weather getWeatherByCity(@PathVariable String city) {
        return weatherService.getWeatherByCity(city);
    }

    @PutMapping("/{id}")
    public Weather updateWeather(@PathVariable Long id, @RequestBody Weather weather) {
        return weatherService.updateWeather(id, weather);
    }

    @DeleteMapping("/{id}")
    public void deleteWeather(@PathVariable Long id) {
        weatherService.deleteWeather(id);
    }
}
