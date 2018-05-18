package com.test.weather.controller;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.test.weather.model.Weather;
import com.test.weather.service.WeatherApiService;

@RestController
public class WeatherApiController {
	
	
	@Autowired
	private WeatherApiService service;

	@GetMapping("/weather")
	public List<Weather> retrieveAllWeathers() {
		return service.getAll();
	}
	
	@RequestMapping(value="/weather", method=RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> saveWeather(@Valid @RequestBody Weather weather) {
		Weather weath = service.save(weather);
		
		URI location = ServletUriComponentsBuilder
			.fromCurrentRequest()
			.path("/{id}")
			.buildAndExpand(weath.getId()).toUri();

		
		return ResponseEntity.created(location).build();
		
	}
	

}
