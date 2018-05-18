package com.test.weather.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.weather.model.Weather;

public interface LocationRespository extends JpaRepository<Weather, Long>{

}
