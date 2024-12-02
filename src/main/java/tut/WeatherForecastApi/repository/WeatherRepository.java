package tut.WeatherForecastApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tut.WeatherForecastApi.model.Weather;

public interface WeatherRepository extends JpaRepository<Weather, Long> {
    Weather findByCity(String city);
}
