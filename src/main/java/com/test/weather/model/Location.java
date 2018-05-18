package com.test.weather.model;

public class Location {

	private String cityName;

	private String stateName;

	private Float latitude;

	private Float longitude;

	public Location() {

	}

	public Location(String cityName, String stateName, Float latitude, Float longitude) {

		this.cityName = cityName;

		this.stateName = stateName;

		this.latitude = latitude;

		this.longitude = longitude;

	}

	public String getCityName() {

		return cityName;

	}

	public Float getLatitude() {

		return latitude;

	}

	public Float getLongitude() {

		return longitude;

	}

	public String getStateName() {

		return stateName;

	}

	public void setCityName(String cityName) {

		this.cityName = cityName;

	}

	public void setLatitude(Float latitude) {

		this.latitude = latitude;

	}

	public void setLongitude(Float longitude) {

		this.longitude = longitude;

	}

	public void setStateName(String stateName) {

		this.stateName = stateName;

	}

}
