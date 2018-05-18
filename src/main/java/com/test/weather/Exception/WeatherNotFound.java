package com.test.weather.Exception;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class WeatherNotFound extends RuntimeException {
	public WeatherNotFound(String message) {
		super(message);
	}
}
