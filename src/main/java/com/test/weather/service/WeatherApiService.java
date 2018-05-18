package com.test.weather.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import com.test.weather.model.Location;
import com.test.weather.model.Weather;

@Component
public class WeatherApiService {
	
	private static List<Weather> weathers = new ArrayList<>();

	private static long weathersCount = 3;
	
	static Float[] Data = {1.51f, 2.35f, 3.36f};

	static {
		weathers.add(new Weather(1L, new Date(), new Location("Nashville","Tennessee",36.1F,-86.6F), Data));
		
	}

	public List<Weather> getAll() {
		return weathers;
	}

	public Weather save(Weather weather) {
		if (weather.getId() == null) {
			weather.setId(++weathersCount);
		}
		weathers.add(weather);
		return weather;
	}

}
