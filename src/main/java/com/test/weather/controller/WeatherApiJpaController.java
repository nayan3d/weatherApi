package com.test.weather.controller;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.test.weather.model.Weather;
import com.test.weather.repository.LocationRespository;
import com.test.weather.repository.WeatherRespository;

@RestController
public class WeatherApiJpaController {
	
	@Autowired
	private LocationRespository locationRepository;
	
	@Autowired
	private WeatherRespository weatherRepository;
	
	@GetMapping("/jpa/weather")
	public List<Weather> retrieveAllUsers() {
		return weatherRepository.findAll();
	}

	
	@PostMapping("/jpa/weather")
	public ResponseEntity<Object> createUser(@Valid @RequestBody Weather weather) {
		Weather weatherData = weatherRepository.save(weather);

		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(weatherData.getId())
				.toUri();

		return ResponseEntity.created(location).build();

	}
	
	@DeleteMapping("/jpa/weather/{id}")
	public void deleteUser(@PathVariable long id) {
		weatherRepository.deleteById(id);
	}

}
