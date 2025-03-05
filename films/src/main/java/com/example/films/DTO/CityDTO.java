package com.example.films.DTO;

public class CityDTO {
    private String cityName;
    private String countryName;

    public CityDTO(String cityName, String countryName) {
        this.cityName = cityName;
        this.countryName = countryName;
    }

    public String getCityName() {
        return cityName;
    }

    public String getCountryName() {
        return countryName;
    }
}
