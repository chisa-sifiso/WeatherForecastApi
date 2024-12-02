package tut.WeatherForecastApi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tut.WeatherForecastApi.model.Weather;
import tut.WeatherForecastApi.repository.WeatherRepository;

import java.util.List;
@Service
public class WeatherService {
    @Autowired
    private WeatherRepository weatherRepository;

    public Weather addWeather(Weather weather) {
        return weatherRepository.save(weather);
    }

    public List<Weather> getAllWeather() {
        return weatherRepository.findAll();
    }

    public Weather getWeatherByCity(String city) {
        return weatherRepository.findByCity(city);
    }

    public Weather updateWeather(Long id, Weather updatedWeather) {
        Weather weather = weatherRepository.findById(id).orElseThrow(() -> new RuntimeException("City not found"));
        weather.setCity(updatedWeather.getCity());
        weather.setDescription(updatedWeather.getDescription());
        weather.setTemperature(updatedWeather.getTemperature());
        return weatherRepository.save(weather);
    }

    public void deleteWeather(Long id) {
        weatherRepository.deleteById(id);
    }
}
