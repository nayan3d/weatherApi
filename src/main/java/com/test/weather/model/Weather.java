package com.test.weather.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Weather {

	@Id
	@GeneratedValue
	private Long id;

	private Date dateRecorded;

	private Location location;

	private Float[] temperature;

	public Weather() {

	}

	public Weather(Long id, Date dateRecorded, Location location, Float[] temperature) {

		this.id = id;

		this.dateRecorded = dateRecorded;

		this.location = location;

		this.temperature = temperature;

	}

	public Date getDateRecorded() {

		return dateRecorded;

	}

	public Long getId() {

		return id;

	}

	public Location getLocation() {

		return location;

	}

	public Float[] getTemperature() {
		return temperature;
	}

	public void setDateRecorded(Date dateRecorded) {

		this.dateRecorded = dateRecorded;

	}

	public void setId(Long id) {

		this.id = id;

	}

	public void setLocation(Location location) {

		this.location = location;

	}

	public void setTemperature(Float[] temperature) {

		this.temperature = temperature;

	}

}
