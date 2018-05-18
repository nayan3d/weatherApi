package com.test.weather.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.weather.model.Weather;

@Repository
public interface WeatherRespository extends JpaRepository<Weather, Long>{

}
